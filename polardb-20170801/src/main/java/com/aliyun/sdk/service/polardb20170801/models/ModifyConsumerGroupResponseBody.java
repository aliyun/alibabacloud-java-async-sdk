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
 * {@link ModifyConsumerGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyConsumerGroupResponseBody</p>
 */
public class ModifyConsumerGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConsumerGroupId")
    private String consumerGroupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyConsumerGroupResponseBody(Builder builder) {
        this.consumerGroupId = builder.consumerGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyConsumerGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumerGroupId
     */
    public String getConsumerGroupId() {
        return this.consumerGroupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String consumerGroupId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyConsumerGroupResponseBody model) {
            this.consumerGroupId = model.consumerGroupId;
            this.requestId = model.requestId;
        } 

        /**
         * ConsumerGroupId.
         */
        public Builder consumerGroupId(String consumerGroupId) {
            this.consumerGroupId = consumerGroupId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>A7E6A8FD-C50B-46B2-BA85-D8B8D3******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyConsumerGroupResponseBody build() {
            return new ModifyConsumerGroupResponseBody(this);
        } 

    } 

}
