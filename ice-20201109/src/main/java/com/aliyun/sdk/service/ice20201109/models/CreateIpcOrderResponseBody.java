// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link CreateIpcOrderResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIpcOrderResponseBody</p>
 */
public class CreateIpcOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PurchaseStatus")
    private String purchaseStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateIpcOrderResponseBody(Builder builder) {
        this.purchaseStatus = builder.purchaseStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIpcOrderResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return purchaseStatus
     */
    public String getPurchaseStatus() {
        return this.purchaseStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String purchaseStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateIpcOrderResponseBody model) {
            this.purchaseStatus = model.purchaseStatus;
            this.requestId = model.requestId;
        } 

        /**
         * PurchaseStatus.
         */
        public Builder purchaseStatus(String purchaseStatus) {
            this.purchaseStatus = purchaseStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateIpcOrderResponseBody build() {
            return new CreateIpcOrderResponseBody(this);
        } 

    } 

}
