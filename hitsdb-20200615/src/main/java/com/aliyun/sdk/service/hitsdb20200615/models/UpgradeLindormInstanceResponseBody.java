// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

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
 * {@link UpgradeLindormInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>UpgradeLindormInstanceResponseBody</p>
 */
public class UpgradeLindormInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private Long orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpgradeLindormInstanceResponseBody(Builder builder) {
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeLindormInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long orderId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpgradeLindormInstanceResponseBody model) {
            this.orderId = model.orderId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>111111111111111</p>
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2A7D4F9D-AA26-4E15-A2B1-3E4792C6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpgradeLindormInstanceResponseBody build() {
            return new UpgradeLindormInstanceResponseBody(this);
        } 

    } 

}
