package com.food.ordering.system.payment.service.dataaccess.credithistory.entity;

import com.food.ordering.system.payment.service.domain.valueobject.TransactionType;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name="credit_history")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreditHistoryEntity {
    @Id
    private UUID id;
    private UUID customerId;
    private BigDecimal amount;
    @Enumerated(EnumType.STRING)
    private TransactionType type;

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        CreditHistoryEntity that = (CreditHistoryEntity) o;
        return id.equals(that.id);
    }
    @Override
    public int hashCode() {return Objects.hash(id);}

}