package jpabook.jpashop.service;

import jpabook.jpashop.controller.item.UpdateBookDTO;
import jpabook.jpashop.domain.Item;
import jpabook.jpashop.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    @Transactional
    public void saveItem(Item item) {
        itemRepository.save(item);
    }

    public List<Item> findItems() {
        return itemRepository.findAll();
    }

    public Item findOne(Long itemId) {
        return itemRepository.findOne(itemId);
    }

    @Transactional
    public void updateItem(UpdateBookDTO dto) {
        Item findItem = itemRepository.findOne(dto.getId());
        findItem.setName(dto.getName());
        findItem.setPrice(dto.getPrice());
        findItem.setStockQuantity(dto.getStockQuantity());
    }
}
