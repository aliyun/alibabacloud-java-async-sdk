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
 * {@link GetConsumerAuthorizationRuleRequest} extends {@link RequestModel}
 *
 * <p>GetConsumerAuthorizationRuleRequest</p>
 */
public class GetConsumerAuthorizationRuleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("consumerAuthorizationRuleId")
    private String consumerAuthorizationRuleId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("consumerId")
    private String consumerId;

    private GetConsumerAuthorizationRuleRequest(Builder builder) {
        super(builder);
        this.consumerAuthorizationRuleId = builder.consumerAuthorizationRuleId;
        this.consumerId = builder.consumerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConsumerAuthorizationRuleRequest create() {
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

    /**
     * @return consumerId
     */
    public String getConsumerId() {
        return this.consumerId;
    }

    public static final class Builder extends Request.Builder<GetConsumerAuthorizationRuleRequest, Builder> {
        private String consumerAuthorizationRuleId; 
        private String consumerId; 

        private Builder() {
            super();
        } 

        private Builder(GetConsumerAuthorizationRuleRequest request) {
            super(request);
            this.consumerAuthorizationRuleId = request.consumerAuthorizationRuleId;
            this.consumerId = request.consumerId;
        } 

        /**
         * <p>Filters the list of operations by a specific consumer authorization rule ID. Only authorized operations are returned in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>car-ctgdn8em1hko5krqq03g</p>
         */
        public Builder consumerAuthorizationRuleId(String consumerAuthorizationRuleId) {
            this.putPathParameter("consumerAuthorizationRuleId", consumerAuthorizationRuleId);
            this.consumerAuthorizationRuleId = consumerAuthorizationRuleId;
            return this;
        }

        /**
         * <p>The consumer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-ctgdn2um1hkossul8gvg</p>
         */
        public Builder consumerId(String consumerId) {
            this.putPathParameter("consumerId", consumerId);
            this.consumerId = consumerId;
            return this;
        }

        @Override
        public GetConsumerAuthorizationRuleRequest build() {
            return new GetConsumerAuthorizationRuleRequest(this);
        } 

    } 

}
