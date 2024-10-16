// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateLgfRequest} extends {@link RequestModel}
 *
 * <p>UpdateLgfRequest</p>
 */
public class UpdateLgfRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LgfDefinition")
    @com.aliyun.core.annotation.Validation(required = true)
    private LgfDefinition lgfDefinition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LgfId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long lgfId;

    private UpdateLgfRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.instanceId = builder.instanceId;
        this.lgfDefinition = builder.lgfDefinition;
        this.lgfId = builder.lgfId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLgfRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lgfDefinition
     */
    public LgfDefinition getLgfDefinition() {
        return this.lgfDefinition;
    }

    /**
     * @return lgfId
     */
    public Long getLgfId() {
        return this.lgfId;
    }

    public static final class Builder extends Request.Builder<UpdateLgfRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String instanceId; 
        private LgfDefinition lgfDefinition; 
        private Long lgfId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLgfRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.instanceId = request.instanceId;
            this.lgfDefinition = request.lgfDefinition;
            this.lgfId = request.lgfId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>chatbot-cn-yjzbyrEvqd</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder lgfDefinition(LgfDefinition lgfDefinition) {
            String lgfDefinitionShrink = shrink(lgfDefinition, "LgfDefinition", "json");
            this.putQueryParameter("LgfDefinition", lgfDefinitionShrink);
            this.lgfDefinition = lgfDefinition;
            return this;
        }

        /**
         * <p>LGF ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12121</p>
         */
        public Builder lgfId(Long lgfId) {
            this.putQueryParameter("LgfId", lgfId);
            this.lgfId = lgfId;
            return this;
        }

        @Override
        public UpdateLgfRequest build() {
            return new UpdateLgfRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateLgfRequest} extends {@link TeaModel}
     *
     * <p>UpdateLgfRequest</p>
     */
    public static class LgfDefinition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IntentId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long intentId;

        @com.aliyun.core.annotation.NameInMap("RuleText")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ruleText;

        private LgfDefinition(Builder builder) {
            this.intentId = builder.intentId;
            this.ruleText = builder.ruleText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LgfDefinition create() {
            return builder().build();
        }

        /**
         * @return intentId
         */
        public Long getIntentId() {
            return this.intentId;
        }

        /**
         * @return ruleText
         */
        public String getRuleText() {
            return this.ruleText;
        }

        public static final class Builder {
            private Long intentId; 
            private String ruleText; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>23234523522</p>
             */
            public Builder intentId(Long intentId) {
                this.intentId = intentId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder ruleText(String ruleText) {
                this.ruleText = ruleText;
                return this;
            }

            public LgfDefinition build() {
                return new LgfDefinition(this);
            } 

        } 

    }
}
