package ru.tstu.telegrambotadmin.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.tstu.telegrambotadmin.model.TelegramMessage;

/**
 * Created by user on 29.11.17.
 */

public interface TelegramMessageRepository extends CrudRepository<TelegramMessage, Long> {

}
