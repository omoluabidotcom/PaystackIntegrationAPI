package com.omoluabi.paystackintegrate.service;

import com.omoluabi.paystackintegrate.model.dto.CreatePlanDto;
import com.omoluabi.paystackintegrate.model.dto.InitializePaymentDto;
import com.omoluabi.paystackintegrate.model.response.CreatePlanResponse;
import com.omoluabi.paystackintegrate.model.response.InitializePaymentResponse;
import com.omoluabi.paystackintegrate.model.response.PaymentVerificationResponse;

public interface PaystackService {
    CreatePlanResponse createPlan(CreatePlanDto createPlanDto) throws Exception;
    InitializePaymentResponse initializePayment(InitializePaymentDto initializePaymentDto);
    PaymentVerificationResponse paymentVerification(String reference, String plan, Long id) throws Exception;
}