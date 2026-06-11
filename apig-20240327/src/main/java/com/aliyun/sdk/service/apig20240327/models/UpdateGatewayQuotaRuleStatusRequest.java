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
 * {@link UpdateGatewayQuotaRuleStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayQuotaRuleStatusRequest</p>
 */
public class UpdateGatewayQuotaRuleStatusRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ruleId")
    private String ruleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clearHistory")
    private Boolean clearHistory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    private UpdateGatewayQuotaRuleStatusRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.ruleId = builder.ruleId;
        this.clearHistory = builder.clearHistory;
        this.enable = builder.enable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayQuotaRuleStatusRequest create() {
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
     * @return clearHistory
     */
    public Boolean getClearHistory() {
        return this.clearHistory;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    public static final class Builder extends Request.Builder<UpdateGatewayQuotaRuleStatusRequest, Builder> {
        private String gatewayId; 
        private String ruleId; 
        private Boolean clearHistory; 
        private Boolean enable; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayQuotaRuleStatusRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.ruleId = request.ruleId;
            this.clearHistory = request.clearHistory;
            this.enable = request.enable;
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
         * clearHistory.
         */
        public Builder clearHistory(Boolean clearHistory) {
            this.putBodyParameter("clearHistory", clearHistory);
            this.clearHistory = clearHistory;
            return this;
        }

        /**
         * enable.
         */
        public Builder enable(Boolean enable) {
            this.putBodyParameter("enable", enable);
            this.enable = enable;
            return this;
        }

        @Override
        public UpdateGatewayQuotaRuleStatusRequest build() {
            return new UpdateGatewayQuotaRuleStatusRequest(this);
        } 

    } 

}
