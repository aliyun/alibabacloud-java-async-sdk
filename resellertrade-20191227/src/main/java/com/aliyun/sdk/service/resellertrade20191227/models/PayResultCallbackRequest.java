// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resellertrade20191227.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PayResultCallbackRequest} extends {@link RequestModel}
 *
 * <p>PayResultCallbackRequest</p>
 */
public class PayResultCallbackRequest extends Request {
    @Query
    @NameInMap("OrderId")
    @Validation(required = true)
    private String orderId;

    @Query
    @NameInMap("PayStatus")
    @Validation(required = true)
    private String payStatus;

    @Query
    @NameInMap("PayTime")
    @Validation(required = true)
    private String payTime;

    @Query
    @NameInMap("Uid")
    @Validation(required = true)
    private Long uid;

    private PayResultCallbackRequest(Builder builder) {
        super(builder);
        this.orderId = builder.orderId;
        this.payStatus = builder.payStatus;
        this.payTime = builder.payTime;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PayResultCallbackRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return payStatus
     */
    public String getPayStatus() {
        return this.payStatus;
    }

    /**
     * @return payTime
     */
    public String getPayTime() {
        return this.payTime;
    }

    /**
     * @return uid
     */
    public Long getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<PayResultCallbackRequest, Builder> {
        private String orderId; 
        private String payStatus; 
        private String payTime; 
        private Long uid; 

        private Builder() {
            super();
        } 

        private Builder(PayResultCallbackRequest request) {
            super(request);
            this.orderId = request.orderId;
            this.payStatus = request.payStatus;
            this.payTime = request.payTime;
            this.uid = request.uid;
        } 

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * PayStatus.
         */
        public Builder payStatus(String payStatus) {
            this.putQueryParameter("PayStatus", payStatus);
            this.payStatus = payStatus;
            return this;
        }

        /**
         * PayTime.
         */
        public Builder payTime(String payTime) {
            this.putQueryParameter("PayTime", payTime);
            this.payTime = payTime;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(Long uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public PayResultCallbackRequest build() {
            return new PayResultCallbackRequest(this);
        } 

    } 

}
