// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateCreditPackageResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCreditPackageResponseBody</p>
 */
public class CreateCreditPackageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreditPackageId")
    private String creditPackageId;

    @com.aliyun.core.annotation.NameInMap("EffectiveTime")
    private String effectiveTime;

    @com.aliyun.core.annotation.NameInMap("ExpiredTime")
    private String expiredTime;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCreditPackageResponseBody(Builder builder) {
        this.creditPackageId = builder.creditPackageId;
        this.effectiveTime = builder.effectiveTime;
        this.expiredTime = builder.expiredTime;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCreditPackageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creditPackageId
     */
    public String getCreditPackageId() {
        return this.creditPackageId;
    }

    /**
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    /**
     * @return expiredTime
     */
    public String getExpiredTime() {
        return this.expiredTime;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String creditPackageId; 
        private String effectiveTime; 
        private String expiredTime; 
        private String orderId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateCreditPackageResponseBody model) {
            this.creditPackageId = model.creditPackageId;
            this.effectiveTime = model.effectiveTime;
            this.expiredTime = model.expiredTime;
            this.orderId = model.orderId;
            this.requestId = model.requestId;
        } 

        /**
         * CreditPackageId.
         */
        public Builder creditPackageId(String creditPackageId) {
            this.creditPackageId = creditPackageId;
            return this;
        }

        /**
         * EffectiveTime.
         */
        public Builder effectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }

        /**
         * ExpiredTime.
         */
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCreditPackageResponseBody build() {
            return new CreateCreditPackageResponseBody(this);
        } 

    } 

}
