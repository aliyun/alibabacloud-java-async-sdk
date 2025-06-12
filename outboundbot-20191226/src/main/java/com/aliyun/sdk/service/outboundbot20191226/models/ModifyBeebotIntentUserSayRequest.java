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
 * {@link ModifyBeebotIntentUserSayRequest} extends {@link RequestModel}
 *
 * <p>ModifyBeebotIntentUserSayRequest</p>
 */
public class ModifyBeebotIntentUserSayRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scriptId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserSayDefinition")
    @com.aliyun.core.annotation.Validation(required = true)
    private UserSayDefinition userSayDefinition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserSayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userSayId;

    private ModifyBeebotIntentUserSayRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.scriptId = builder.scriptId;
        this.userSayDefinition = builder.userSayDefinition;
        this.userSayId = builder.userSayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBeebotIntentUserSayRequest create() {
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
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * @return userSayDefinition
     */
    public UserSayDefinition getUserSayDefinition() {
        return this.userSayDefinition;
    }

    /**
     * @return userSayId
     */
    public String getUserSayId() {
        return this.userSayId;
    }

    public static final class Builder extends Request.Builder<ModifyBeebotIntentUserSayRequest, Builder> {
        private String instanceId; 
        private String scriptId; 
        private UserSayDefinition userSayDefinition; 
        private String userSayId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBeebotIntentUserSayRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.scriptId = request.scriptId;
            this.userSayDefinition = request.userSayDefinition;
            this.userSayId = request.userSayId;
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
         * 
         * <strong>example:</strong>
         * <p>c5c5d8c0-c0f1-48a7-be2b-dc46006d888a</p>
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder userSayDefinition(UserSayDefinition userSayDefinition) {
            String userSayDefinitionShrink = shrink(userSayDefinition, "UserSayDefinition", "json");
            this.putQueryParameter("UserSayDefinition", userSayDefinitionShrink);
            this.userSayDefinition = userSayDefinition;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>17448458</p>
         */
        public Builder userSayId(String userSayId) {
            this.putQueryParameter("UserSayId", userSayId);
            this.userSayId = userSayId;
            return this;
        }

        @Override
        public ModifyBeebotIntentUserSayRequest build() {
            return new ModifyBeebotIntentUserSayRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyBeebotIntentUserSayRequest} extends {@link TeaModel}
     *
     * <p>ModifyBeebotIntentUserSayRequest</p>
     */
    public static class UserSayDefinition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        @com.aliyun.core.annotation.Validation(required = true)
        private String content;

        @com.aliyun.core.annotation.NameInMap("IntentId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long intentId;

        private UserSayDefinition(Builder builder) {
            this.content = builder.content;
            this.intentId = builder.intentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserSayDefinition create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return intentId
         */
        public Long getIntentId() {
            return this.intentId;
        }

        public static final class Builder {
            private String content; 
            private Long intentId; 

            private Builder() {
            } 

            private Builder(UserSayDefinition model) {
                this.content = model.content;
                this.intentId = model.intentId;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
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

            public UserSayDefinition build() {
                return new UserSayDefinition(this);
            } 

        } 

    }
}
