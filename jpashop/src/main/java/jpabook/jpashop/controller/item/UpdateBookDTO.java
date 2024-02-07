package jpabook.jpashop.controller.item;

import jpabook.jpashop.controller.BookForm;
import jpabook.jpashop.controller.UpdateItemDTO;
import lombok.Getter;

@Getter
public class UpdateBookDTO extends UpdateItemDTO {

    private String author;
    private String isbn;

    protected UpdateBookDTO() {
    }

    public static UpdateBookDTO fromBookForm(BookForm bookForm) {

        UpdateBookDTO dto = new UpdateBookDTO();
        dto.id = bookForm.getId();
        dto.name = bookForm.getName();
        dto.price = bookForm.getPrice();
        dto.stockQuantity = bookForm.getStockQuantity();
        dto.author = bookForm.getAuthor();
        dto.isbn = bookForm.getIsbn();

        return dto;
    }
}
