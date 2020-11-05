package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Payment;
import com.lambdaschool.javaorders.repositories.PaymentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "PaymentService")
public class PaymentServicesImp implements PaymentService{
    @Autowired
    PaymentsRepository PaymentsRepo;
    @Transactional
    @Override
    public Payment save(Payment payment){
        return PaymentsRepo.save(payment);
    }


}
