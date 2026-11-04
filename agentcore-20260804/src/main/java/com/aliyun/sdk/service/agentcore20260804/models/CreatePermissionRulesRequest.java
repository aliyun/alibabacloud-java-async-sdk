// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link CreatePermissionRulesRequest} extends {@link RequestModel}
 *
 * <p>CreatePermissionRulesRequest</p>
 */
public class CreatePermissionRulesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private CreatePermissionRulesRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreatePermissionRulesRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePermissionRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return body
     */
    public CreatePermissionRulesRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreatePermissionRulesRequest, Builder> {
        private String workspaceId; 
        private CreatePermissionRulesRequestBody body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreatePermissionRulesRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.body = request.body;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-id</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The request body for creating permission rules.</p>
         */
        public Builder body(CreatePermissionRulesRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * <p>The client token.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public CreatePermissionRulesRequest build() {
            return new CreatePermissionRulesRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePermissionRulesRequest} extends {@link TeaModel}
     *
     * <p>CreatePermissionRulesRequest</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("effect")
        @com.aliyun.core.annotation.Validation(required = true)
        private String effect;

        @com.aliyun.core.annotation.NameInMap("enforcementMode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String enforcementMode;

        @com.aliyun.core.annotation.NameInMap("principalId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String principalId;

        @com.aliyun.core.annotation.NameInMap("principalType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String principalType;

        @com.aliyun.core.annotation.NameInMap("resourceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("source")
        @com.aliyun.core.annotation.Validation(required = true)
        private String source;

        @com.aliyun.core.annotation.NameInMap("targetScope")
        @com.aliyun.core.annotation.Validation(required = true)
        private String targetScope;

        @com.aliyun.core.annotation.NameInMap("targets")
        private java.util.List<String> targets;

        private Rules(Builder builder) {
            this.effect = builder.effect;
            this.enforcementMode = builder.enforcementMode;
            this.principalId = builder.principalId;
            this.principalType = builder.principalType;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.source = builder.source;
            this.targetScope = builder.targetScope;
            this.targets = builder.targets;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return effect
         */
        public String getEffect() {
            return this.effect;
        }

        /**
         * @return enforcementMode
         */
        public String getEnforcementMode() {
            return this.enforcementMode;
        }

        /**
         * @return principalId
         */
        public String getPrincipalId() {
            return this.principalId;
        }

        /**
         * @return principalType
         */
        public String getPrincipalType() {
            return this.principalType;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return targetScope
         */
        public String getTargetScope() {
            return this.targetScope;
        }

        /**
         * @return targets
         */
        public java.util.List<String> getTargets() {
            return this.targets;
        }

        public static final class Builder {
            private String effect; 
            private String enforcementMode; 
            private String principalId; 
            private String principalType; 
            private String resourceId; 
            private String resourceType; 
            private String source; 
            private String targetScope; 
            private java.util.List<String> targets; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.effect = model.effect;
                this.enforcementMode = model.enforcementMode;
                this.principalId = model.principalId;
                this.principalType = model.principalType;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.source = model.source;
                this.targetScope = model.targetScope;
                this.targets = model.targets;
            } 

            /**
             * <p>The authorization effect.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ALLOW</p>
             */
            public Builder effect(String effect) {
                this.effect = effect;
                return this;
            }

            /**
             * <p>The rule enforcement mode.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ENFORCE</p>
             */
            public Builder enforcementMode(String enforcementMode) {
                this.enforcementMode = enforcementMode;
                return this;
            }

            /**
             * <p>The principal ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890123456</p>
             */
            public Builder principalId(String principalId) {
                this.principalId = principalId;
                return this;
            }

            /**
             * <p>The principal type.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>USER</p>
             */
            public Builder principalType(String principalType) {
                this.principalType = principalType;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-1234567890</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>AGENT</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The rule source.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>AgentCore</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The target scope.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>SPECIFIED</p>
             */
            public Builder targetScope(String targetScope) {
                this.targetScope = targetScope;
                return this;
            }

            /**
             * <p>The list of targets for the rule.</p>
             */
            public Builder targets(java.util.List<String> targets) {
                this.targets = targets;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePermissionRulesRequest} extends {@link TeaModel}
     *
     * <p>CreatePermissionRulesRequest</p>
     */
    public static class CreatePermissionRulesRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("rules")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Rules> rules;

        private CreatePermissionRulesRequestBody(Builder builder) {
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreatePermissionRulesRequestBody create() {
            return builder().build();
        }

        /**
         * @return rules
         */
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private java.util.List<Rules> rules; 

            private Builder() {
            } 

            private Builder(CreatePermissionRulesRequestBody model) {
                this.rules = model.rules;
            } 

            /**
             * <p>The list of permission rules to be created.</p>
             * <p>This parameter is required.</p>
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            public CreatePermissionRulesRequestBody build() {
                return new CreatePermissionRulesRequestBody(this);
            } 

        } 

    }
}
