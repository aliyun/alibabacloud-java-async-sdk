// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link ModifyBeebotIntentLgfRequest} extends {@link RequestModel}
 *
 * <p>ModifyBeebotIntentLgfRequest</p>
 */
public class ModifyBeebotIntentLgfRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scriptId;

    private ModifyBeebotIntentLgfRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.lgfDefinition = builder.lgfDefinition;
        this.lgfId = builder.lgfId;
        this.scriptId = builder.scriptId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBeebotIntentLgfRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    public static final class Builder extends Request.Builder<ModifyBeebotIntentLgfRequest, Builder> {
        private String instanceId; 
        private LgfDefinition lgfDefinition; 
        private Long lgfId; 
        private String scriptId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBeebotIntentLgfRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.lgfDefinition = request.lgfDefinition;
            this.lgfId = request.lgfId;
            this.scriptId = request.scriptId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e5035654-1745-484a-8c5b-165f7c7bcd79</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5666117</p>
         */
        public Builder lgfId(Long lgfId) {
            this.putQueryParameter("LgfId", lgfId);
            this.lgfId = lgfId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c5c5d8c0-c0f1-48a7-be2b-dc46006d888a</p>
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        @Override
        public ModifyBeebotIntentLgfRequest build() {
            return new ModifyBeebotIntentLgfRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyBeebotIntentLgfRequest} extends {@link TeaModel}
     *
     * <p>ModifyBeebotIntentLgfRequest</p>
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

            private Builder() {
            } 

            private Builder(LgfDefinition model) {
                this.intentId = model.intentId;
                this.ruleText = model.ruleText;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10717802</p>
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
