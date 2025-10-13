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
 * {@link RemoveConsumerAuthorizationRuleRequest} extends {@link RequestModel}
 *
 * <p>RemoveConsumerAuthorizationRuleRequest</p>
 */
public class RemoveConsumerAuthorizationRuleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("consumerAuthorizationRuleId")
    private String consumerAuthorizationRuleId;

    private RemoveConsumerAuthorizationRuleRequest(Builder builder) {
        super(builder);
        this.consumerAuthorizationRuleId = builder.consumerAuthorizationRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveConsumerAuthorizationRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumerAuthorizationRuleId
     */
    public String getConsumerAuthorizationRuleId() {
        return this.consumerAuthorizationRuleId;
    }

    public static final class Builder extends Request.Builder<RemoveConsumerAuthorizationRuleRequest, Builder> {
        private String consumerAuthorizationRuleId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveConsumerAuthorizationRuleRequest request) {
            super(request);
            this.consumerAuthorizationRuleId = request.consumerAuthorizationRuleId;
        } 

        /**
         * <p>The authorization rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>car-ctgdn8em1hko5krqq03g</p>
         */
        public Builder consumerAuthorizationRuleId(String consumerAuthorizationRuleId) {
            this.putPathParameter("consumerAuthorizationRuleId", consumerAuthorizationRuleId);
            this.consumerAuthorizationRuleId = consumerAuthorizationRuleId;
            return this;
        }

        @Override
        public RemoveConsumerAuthorizationRuleRequest build() {
            return new RemoveConsumerAuthorizationRuleRequest(this);
        } 

    } 

}
