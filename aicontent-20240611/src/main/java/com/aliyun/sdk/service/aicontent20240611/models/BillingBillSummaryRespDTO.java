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
 * {@link BillingBillSummaryRespDTO} extends {@link TeaModel}
 *
 * <p>BillingBillSummaryRespDTO</p>
 */
public class BillingBillSummaryRespDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("points")
    private java.util.List<BillingBillSummaryPointDTO> points;

    @com.aliyun.core.annotation.NameInMap("totalAmount")
    private Float totalAmount;

    private BillingBillSummaryRespDTO(Builder builder) {
        this.points = builder.points;
        this.totalAmount = builder.totalAmount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BillingBillSummaryRespDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return points
     */
    public java.util.List<BillingBillSummaryPointDTO> getPoints() {
        return this.points;
    }

    /**
     * @return totalAmount
     */
    public Float getTotalAmount() {
        return this.totalAmount;
    }

    public static final class Builder {
        private java.util.List<BillingBillSummaryPointDTO> points; 
        private Float totalAmount; 

        private Builder() {
        } 

        private Builder(BillingBillSummaryRespDTO model) {
            this.points = model.points;
            this.totalAmount = model.totalAmount;
        } 

        /**
         * points.
         */
        public Builder points(java.util.List<BillingBillSummaryPointDTO> points) {
            this.points = points;
            return this;
        }

        /**
         * totalAmount.
         */
        public Builder totalAmount(Float totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        public BillingBillSummaryRespDTO build() {
            return new BillingBillSummaryRespDTO(this);
        } 

    } 

}
