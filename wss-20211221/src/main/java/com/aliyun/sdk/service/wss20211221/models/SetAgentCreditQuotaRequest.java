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
 * {@link SetAgentCreditQuotaRequest} extends {@link RequestModel}
 *
 * <p>SetAgentCreditQuotaRequest</p>
 */
public class SetAgentCreditQuotaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentIds")
    private java.util.List<String> agentIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentType")
    private String agentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreditQuota")
    private Integer creditQuota;

    private SetAgentCreditQuotaRequest(Builder builder) {
        super(builder);
        this.agentIds = builder.agentIds;
        this.agentType = builder.agentType;
        this.bizType = builder.bizType;
        this.creditQuota = builder.creditQuota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetAgentCreditQuotaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentIds
     */
    public java.util.List<String> getAgentIds() {
        return this.agentIds;
    }

    /**
     * @return agentType
     */
    public String getAgentType() {
        return this.agentType;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return creditQuota
     */
    public Integer getCreditQuota() {
        return this.creditQuota;
    }

    public static final class Builder extends Request.Builder<SetAgentCreditQuotaRequest, Builder> {
        private java.util.List<String> agentIds; 
        private String agentType; 
        private String bizType; 
        private Integer creditQuota; 

        private Builder() {
            super();
        } 

        private Builder(SetAgentCreditQuotaRequest request) {
            super(request);
            this.agentIds = request.agentIds;
            this.agentType = request.agentType;
            this.bizType = request.bizType;
            this.creditQuota = request.creditQuota;
        } 

        /**
         * AgentIds.
         */
        public Builder agentIds(java.util.List<String> agentIds) {
            this.putQueryParameter("AgentIds", agentIds);
            this.agentIds = agentIds;
            return this;
        }

        /**
         * AgentType.
         */
        public Builder agentType(String agentType) {
            this.putQueryParameter("AgentType", agentType);
            this.agentType = agentType;
            return this;
        }

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * CreditQuota.
         */
        public Builder creditQuota(Integer creditQuota) {
            this.putQueryParameter("CreditQuota", creditQuota);
            this.creditQuota = creditQuota;
            return this;
        }

        @Override
        public SetAgentCreditQuotaRequest build() {
            return new SetAgentCreditQuotaRequest(this);
        } 

    } 

}
