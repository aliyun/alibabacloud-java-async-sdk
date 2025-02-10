// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wss20211221.models;

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
 * {@link CreateMultiOrderResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMultiOrderResponseBody</p>
 */
public class CreateMultiOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrderIds")
    private java.util.List<Long> orderIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateMultiOrderResponseBody(Builder builder) {
        this.orderIds = builder.orderIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMultiOrderResponseBody create() {
        return builder().build();
    }

    /**
     * @return orderIds
     */
    public java.util.List<Long> getOrderIds() {
        return this.orderIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Long> orderIds; 
        private String requestId; 

        /**
         * OrderIds.
         */
        public Builder orderIds(java.util.List<Long> orderIds) {
            this.orderIds = orderIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateMultiOrderResponseBody build() {
            return new CreateMultiOrderResponseBody(this);
        } 

    } 

}
