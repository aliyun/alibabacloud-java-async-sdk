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
 * {@link CreateBeebotIntentRequest} extends {@link RequestModel}
 *
 * <p>CreateBeebotIntentRequest</p>
 */
public class CreateBeebotIntentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntentDefinition")
    @com.aliyun.core.annotation.Validation(required = true)
    private IntentDefinition intentDefinition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scriptId;

    private CreateBeebotIntentRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.intentDefinition = builder.intentDefinition;
        this.scriptId = builder.scriptId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBeebotIntentRequest create() {
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
     * @return intentDefinition
     */
    public IntentDefinition getIntentDefinition() {
        return this.intentDefinition;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    public static final class Builder extends Request.Builder<CreateBeebotIntentRequest, Builder> {
        private String instanceId; 
        private IntentDefinition intentDefinition; 
        private String scriptId; 

        private Builder() {
            super();
        } 

        private Builder(CreateBeebotIntentRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.intentDefinition = request.intentDefinition;
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
        public Builder intentDefinition(IntentDefinition intentDefinition) {
            String intentDefinitionShrink = shrink(intentDefinition, "IntentDefinition", "json");
            this.putQueryParameter("IntentDefinition", intentDefinitionShrink);
            this.intentDefinition = intentDefinition;
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
        public CreateBeebotIntentRequest build() {
            return new CreateBeebotIntentRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateBeebotIntentRequest} extends {@link TeaModel}
     *
     * <p>CreateBeebotIntentRequest</p>
     */
    public static class IntentDefinition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliasName")
        private String aliasName;

        @com.aliyun.core.annotation.NameInMap("IntentName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String intentName;

        private IntentDefinition(Builder builder) {
            this.aliasName = builder.aliasName;
            this.intentName = builder.intentName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IntentDefinition create() {
            return builder().build();
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        /**
         * @return intentName
         */
        public String getIntentName() {
            return this.intentName;
        }

        public static final class Builder {
            private String aliasName; 
            private String intentName; 

            private Builder() {
            } 

            private Builder(IntentDefinition model) {
                this.aliasName = model.aliasName;
                this.intentName = model.intentName;
            } 

            /**
             * AliasName.
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder intentName(String intentName) {
                this.intentName = intentName;
                return this;
            }

            public IntentDefinition build() {
                return new IntentDefinition(this);
            } 

        } 

    }
}
