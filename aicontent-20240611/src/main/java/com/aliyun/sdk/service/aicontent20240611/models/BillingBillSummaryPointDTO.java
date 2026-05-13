// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link BillingBillSummaryPointDTO} extends {@link TeaModel}
 *
 * <p>BillingBillSummaryPointDTO</p>
 */
public class BillingBillSummaryPointDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("timestamp")
    private Long timestamp;

    @com.aliyun.core.annotation.NameInMap("totalAmount")
    private Float totalAmount;

    private BillingBillSummaryPointDTO(Builder builder) {
        this.timestamp = builder.timestamp;
        this.totalAmount = builder.totalAmount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BillingBillSummaryPointDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return timestamp
     */
    public Long getTimestamp() {
        return this.timestamp;
    }

    /**
     * @return totalAmount
     */
    public Float getTotalAmount() {
        return this.totalAmount;
    }

    public static final class Builder {
        private Long timestamp; 
        private Float totalAmount; 

        private Builder() {
        } 

        private Builder(BillingBillSummaryPointDTO model) {
            this.timestamp = model.timestamp;
            this.totalAmount = model.totalAmount;
        } 

        /**
         * timestamp.
         */
        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * totalAmount.
         */
        public Builder totalAmount(Float totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        public BillingBillSummaryPointDTO build() {
            return new BillingBillSummaryPointDTO(this);
        } 

    } 

}
