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
 * {@link AgentAccessConfig} extends {@link TeaModel}
 *
 * <p>AgentAccessConfig</p>
 */
public class AgentAccessConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("aiRequestLogEnabled")
    private Boolean aiRequestLogEnabled;

    @com.aliyun.core.annotation.NameInMap("authorization")
    private Authorization authorization;

    @com.aliyun.core.annotation.NameInMap("basePath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String basePath;

    @com.aliyun.core.annotation.NameInMap("domainIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> domainIds;

    @com.aliyun.core.annotation.NameInMap("removeBasePathOnForward")
    private Boolean removeBasePathOnForward;

    private AgentAccessConfig(Builder builder) {
        this.aiRequestLogEnabled = builder.aiRequestLogEnabled;
        this.authorization = builder.authorization;
        this.basePath = builder.basePath;
        this.domainIds = builder.domainIds;
        this.removeBasePathOnForward = builder.removeBasePathOnForward;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgentAccessConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aiRequestLogEnabled
     */
    public Boolean getAiRequestLogEnabled() {
        return this.aiRequestLogEnabled;
    }

    /**
     * @return authorization
     */
    public Authorization getAuthorization() {
        return this.authorization;
    }

    /**
     * @return basePath
     */
    public String getBasePath() {
        return this.basePath;
    }

    /**
     * @return domainIds
     */
    public java.util.List<String> getDomainIds() {
        return this.domainIds;
    }

    /**
     * @return removeBasePathOnForward
     */
    public Boolean getRemoveBasePathOnForward() {
        return this.removeBasePathOnForward;
    }

    public static final class Builder {
        private Boolean aiRequestLogEnabled; 
        private Authorization authorization; 
        private String basePath; 
        private java.util.List<String> domainIds; 
        private Boolean removeBasePathOnForward; 

        private Builder() {
        } 

        private Builder(AgentAccessConfig model) {
            this.aiRequestLogEnabled = model.aiRequestLogEnabled;
            this.authorization = model.authorization;
            this.basePath = model.basePath;
            this.domainIds = model.domainIds;
            this.removeBasePathOnForward = model.removeBasePathOnForward;
        } 

        /**
         * aiRequestLogEnabled.
         */
        public Builder aiRequestLogEnabled(Boolean aiRequestLogEnabled) {
            this.aiRequestLogEnabled = aiRequestLogEnabled;
            return this;
        }

        /**
         * authorization.
         */
        public Builder authorization(Authorization authorization) {
            this.authorization = authorization;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder basePath(String basePath) {
            this.basePath = basePath;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainIds(java.util.List<String> domainIds) {
            this.domainIds = domainIds;
            return this;
        }

        /**
         * removeBasePathOnForward.
         */
        public Builder removeBasePathOnForward(Boolean removeBasePathOnForward) {
            this.removeBasePathOnForward = removeBasePathOnForward;
            return this;
        }

        public AgentAccessConfig build() {
            return new AgentAccessConfig(this);
        } 

    } 

    /**
     * 
     * {@link AgentAccessConfig} extends {@link TeaModel}
     *
     * <p>AgentAccessConfig</p>
     */
    public static class Authorization extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authType")
        private String authType;

        @com.aliyun.core.annotation.NameInMap("enabled")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("principals")
        private java.util.List<AgentAuthorizationPrincipal> principals;

        private Authorization(Builder builder) {
            this.authType = builder.authType;
            this.enabled = builder.enabled;
            this.principals = builder.principals;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Authorization create() {
            return builder().build();
        }

        /**
         * @return authType
         */
        public String getAuthType() {
            return this.authType;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return principals
         */
        public java.util.List<AgentAuthorizationPrincipal> getPrincipals() {
            return this.principals;
        }

        public static final class Builder {
            private String authType; 
            private Boolean enabled; 
            private java.util.List<AgentAuthorizationPrincipal> principals; 

            private Builder() {
            } 

            private Builder(Authorization model) {
                this.authType = model.authType;
                this.enabled = model.enabled;
                this.principals = model.principals;
            } 

            /**
             * authType.
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * principals.
             */
            public Builder principals(java.util.List<AgentAuthorizationPrincipal> principals) {
                this.principals = principals;
                return this;
            }

            public Authorization build() {
                return new Authorization(this);
            } 

        } 

    }
}
