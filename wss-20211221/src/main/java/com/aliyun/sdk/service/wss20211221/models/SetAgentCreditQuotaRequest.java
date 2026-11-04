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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneType")
    private String sceneType;

    private SetAgentCreditQuotaRequest(Builder builder) {
        super(builder);
        this.agentIds = builder.agentIds;
        this.agentType = builder.agentType;
        this.bizType = builder.bizType;
        this.creditQuota = builder.creditQuota;
        this.sceneType = builder.sceneType;
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

    /**
     * @return sceneType
     */
    public String getSceneType() {
        return this.sceneType;
    }

    public static final class Builder extends Request.Builder<SetAgentCreditQuotaRequest, Builder> {
        private java.util.List<String> agentIds; 
        private String agentType; 
        private String bizType; 
        private Integer creditQuota; 
        private String sceneType; 

        private Builder() {
            super();
        } 

        private Builder(SetAgentCreditQuotaRequest request) {
            super(request);
            this.agentIds = request.agentIds;
            this.agentType = request.agentType;
            this.bizType = request.bizType;
            this.creditQuota = request.creditQuota;
            this.sceneType = request.sceneType;
        } 

        /**
         * <p>The list of Agent IDs.</p>
         */
        public Builder agentIds(java.util.List<String> agentIds) {
            this.putQueryParameter("AgentIds", agentIds);
            this.agentIds = agentIds;
            return this;
        }

        /**
         * <p>The Agent type.</p>
         * 
         * <strong>example:</strong>
         * <p>JVSClaw</p>
         */
        public Builder agentType(String agentType) {
            this.putQueryParameter("AgentType", agentType);
            this.agentType = agentType;
            return this;
        }

        /**
         * <p>The business type.</p>
         * 
         * <strong>example:</strong>
         * <p>BUSINESS</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>The credit quota.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder creditQuota(Integer creditQuota) {
            this.putQueryParameter("CreditQuota", creditQuota);
            this.creditQuota = creditQuota;
            return this;
        }

        /**
         * <p>The operator scenarios type. Valid values:</p>
         * <ul>
         * <li>If this parameter is not specified or is set to NaturalMonthlyOwn: calendar month exclusive.</li>
         * <li>JzYearlyShare: Jiaozi yearly shared.</li>
         * <li>JzYearlyOwn: Jiaozi yearly exclusive.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NaturalMonthlyOwn</p>
         */
        public Builder sceneType(String sceneType) {
            this.putQueryParameter("SceneType", sceneType);
            this.sceneType = sceneType;
            return this;
        }

        @Override
        public SetAgentCreditQuotaRequest build() {
            return new SetAgentCreditQuotaRequest(this);
        } 

    } 

}
