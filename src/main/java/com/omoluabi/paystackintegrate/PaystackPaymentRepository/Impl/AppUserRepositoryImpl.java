package com.omoluabi.paystackintegrate.PaystackPaymentRepository.Impl;

import com.omoluabi.paystackintegrate.model.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepositoryImpl extends JpaRepository<AppUser, Long> {
}
