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
 * {@link DeleteGatewayQuotaRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteGatewayQuotaRuleRequest</p>
 */
public class DeleteGatewayQuotaRuleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ruleId")
    private String ruleId;

    private DeleteGatewayQuotaRuleRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGatewayQuotaRuleRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteGatewayQuotaRuleRequest, Builder> {
        private String gatewayId; 
        private String ruleId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGatewayQuotaRuleRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.ruleId = request.ruleId;
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

        @Override
        public DeleteGatewayQuotaRuleRequest build() {
            return new DeleteGatewayQuotaRuleRequest(this);
        } 

    } 

}
