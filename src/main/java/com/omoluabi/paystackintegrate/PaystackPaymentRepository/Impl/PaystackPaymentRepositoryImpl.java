package com.omoluabi.paystackintegrate.PaystackPaymentRepository.Impl;

import com.omoluabi.paystackintegrate.model.domain.PaymentPaystack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaystackPaymentRepositoryImpl extends JpaRepository<PaymentPaystack, Long> {
}
