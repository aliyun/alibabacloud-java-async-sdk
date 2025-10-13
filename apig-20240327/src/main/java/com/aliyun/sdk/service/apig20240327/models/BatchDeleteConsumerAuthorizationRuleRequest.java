// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link BatchDeleteConsumerAuthorizationRuleRequest} extends {@link RequestModel}
 *
 * <p>BatchDeleteConsumerAuthorizationRuleRequest</p>
 */
public class BatchDeleteConsumerAuthorizationRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("consumerAuthorizationRuleIds")
    private String consumerAuthorizationRuleIds;

    private BatchDeleteConsumerAuthorizationRuleRequest(Builder builder) {
        super(builder);
        this.consumerAuthorizationRuleIds = builder.consumerAuthorizationRuleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteConsumerAuthorizationRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumerAuthorizationRuleIds
     */
    public String getConsumerAuthorizationRuleIds() {
        return this.consumerAuthorizationRuleIds;
    }

    public static final class Builder extends Request.Builder<BatchDeleteConsumerAuthorizationRuleRequest, Builder> {
        private String consumerAuthorizationRuleIds; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeleteConsumerAuthorizationRuleRequest request) {
            super(request);
            this.consumerAuthorizationRuleIds = request.consumerAuthorizationRuleIds;
        } 

        /**
         * <p>The rule IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>car-cus2d1em1hkg7732kuk0</p>
         */
        public Builder consumerAuthorizationRuleIds(String consumerAuthorizationRuleIds) {
            this.putQueryParameter("consumerAuthorizationRuleIds", consumerAuthorizationRuleIds);
            this.consumerAuthorizationRuleIds = consumerAuthorizationRuleIds;
            return this;
        }

        @Override
        public BatchDeleteConsumerAuthorizationRuleRequest build() {
            return new BatchDeleteConsumerAuthorizationRuleRequest(this);
        } 

    } 

}
