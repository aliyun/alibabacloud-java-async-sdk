// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyConsumerResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyConsumerResponseBody</p>
 */
public class ModifyConsumerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConsumerId")
    private String consumerId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyConsumerResponseBody(Builder builder) {
        this.consumerId = builder.consumerId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyConsumerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumerId
     */
    public String getConsumerId() {
        return this.consumerId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String consumerId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyConsumerResponseBody model) {
            this.consumerId = model.consumerId;
            this.requestId = model.requestId;
        } 

        /**
         * ConsumerId.
         */
        public Builder consumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6BD9CDE4-5E7B-4BF3-9BB8-83C73E******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyConsumerResponseBody build() {
            return new ModifyConsumerResponseBody(this);
        } 

    } 

}
