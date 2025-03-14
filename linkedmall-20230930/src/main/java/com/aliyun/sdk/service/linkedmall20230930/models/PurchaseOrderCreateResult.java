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
 * {@link PurchaseOrderCreateResult} extends {@link TeaModel}
 *
 * <p>PurchaseOrderCreateResult</p>
 */
public class PurchaseOrderCreateResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("purchaseOrderId")
    private String purchaseOrderId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private PurchaseOrderCreateResult(Builder builder) {
        this.purchaseOrderId = builder.purchaseOrderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PurchaseOrderCreateResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return purchaseOrderId
     */
    public String getPurchaseOrderId() {
        return this.purchaseOrderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String purchaseOrderId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(PurchaseOrderCreateResult model) {
            this.purchaseOrderId = model.purchaseOrderId;
            this.requestId = model.requestId;
        } 

        /**
         * purchaseOrderId.
         */
        public Builder purchaseOrderId(String purchaseOrderId) {
            this.purchaseOrderId = purchaseOrderId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PurchaseOrderCreateResult build() {
            return new PurchaseOrderCreateResult(this);
        } 

    } 

}
