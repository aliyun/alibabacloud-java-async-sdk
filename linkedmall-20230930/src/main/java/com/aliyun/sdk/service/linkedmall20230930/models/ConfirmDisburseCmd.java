// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link ConfirmDisburseCmd} extends {@link TeaModel}
 *
 * <p>ConfirmDisburseCmd</p>
 */
public class ConfirmDisburseCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("orderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("purchaseOrderId")
    private String purchaseOrderId;

    private ConfirmDisburseCmd(Builder builder) {
        this.orderId = builder.orderId;
        this.purchaseOrderId = builder.purchaseOrderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfirmDisburseCmd create() {
        return builder().build();
    }

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
     * @return purchaseOrderId
     */
    public String getPurchaseOrderId() {
        return this.purchaseOrderId;
    }

    public static final class Builder {
        private String orderId; 
        private String purchaseOrderId; 

        private Builder() {
        } 

        private Builder(ConfirmDisburseCmd model) {
            this.orderId = model.orderId;
            this.purchaseOrderId = model.purchaseOrderId;
        } 

        /**
         * orderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * purchaseOrderId.
         */
        public Builder purchaseOrderId(String purchaseOrderId) {
            this.purchaseOrderId = purchaseOrderId;
            return this;
        }

        public ConfirmDisburseCmd build() {
            return new ConfirmDisburseCmd(this);
        } 

    } 

}
