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
 * {@link GetGatewayQuotaRuleRequest} extends {@link RequestModel}
 *
 * <p>GetGatewayQuotaRuleRequest</p>
 */
public class GetGatewayQuotaRuleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ruleId")
    private String ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("consumerPageNumber")
    private String consumerPageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("consumerPageSize")
    private String consumerPageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("withConsumers")
    private Boolean withConsumers;

    private GetGatewayQuotaRuleRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.ruleId = builder.ruleId;
        this.consumerPageNumber = builder.consumerPageNumber;
        this.consumerPageSize = builder.consumerPageSize;
        this.withConsumers = builder.withConsumers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGatewayQuotaRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return consumerPageNumber
     */
    public String getConsumerPageNumber() {
        return this.consumerPageNumber;
    }

    /**
     * @return consumerPageSize
     */
    public String getConsumerPageSize() {
        return this.consumerPageSize;
    }

    /**
     * @return withConsumers
     */
    public Boolean getWithConsumers() {
        return this.withConsumers;
    }

    public static final class Builder extends Request.Builder<GetGatewayQuotaRuleRequest, Builder> {
        private String gatewayId; 
        private String ruleId; 
        private String consumerPageNumber; 
        private String consumerPageSize; 
        private Boolean withConsumers; 

        private Builder() {
            super();
        } 

        private Builder(GetGatewayQuotaRuleRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.ruleId = request.ruleId;
            this.consumerPageNumber = request.consumerPageNumber;
            this.consumerPageSize = request.consumerPageSize;
            this.withConsumers = request.withConsumers;
        } 

        /**
         * gatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * ruleId.
         */
        public Builder ruleId(String ruleId) {
            this.putPathParameter("ruleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * consumerPageNumber.
         */
        public Builder consumerPageNumber(String consumerPageNumber) {
            this.putQueryParameter("consumerPageNumber", consumerPageNumber);
            this.consumerPageNumber = consumerPageNumber;
            return this;
        }

        /**
         * consumerPageSize.
         */
        public Builder consumerPageSize(String consumerPageSize) {
            this.putQueryParameter("consumerPageSize", consumerPageSize);
            this.consumerPageSize = consumerPageSize;
            return this;
        }

        /**
         * withConsumers.
         */
        public Builder withConsumers(Boolean withConsumers) {
            this.putQueryParameter("withConsumers", withConsumers);
            this.withConsumers = withConsumers;
            return this;
        }

        @Override
        public GetGatewayQuotaRuleRequest build() {
            return new GetGatewayQuotaRuleRequest(this);
        } 

    } 

}
