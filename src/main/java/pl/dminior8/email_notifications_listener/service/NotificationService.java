package pl.dminior8.email_notifications_listener.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.dminior8.email_notifications_listener.model.Notification;
import pl.dminior8.email_notifications_listener.repository.NotificationRepository;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class NotificationService {
    private final NotificationRepository notificationRepository;

    public Optional<Notification> getNotification(UUID id) {
        return notificationRepository.findById(id);
    }

    public void updateNotification(Notification notification) {
        notificationRepository.save(notification);
    }

}

