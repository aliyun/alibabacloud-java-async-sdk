// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link TriggerPatrolRequest} extends {@link RequestModel}
 *
 * <p>TriggerPatrolRequest</p>
 */
public class TriggerPatrolRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scopeConfig")
    private ScopeConfig scopeConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scopeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scopeType;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private TriggerPatrolRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.scopeConfig = builder.scopeConfig;
        this.scopeType = builder.scopeType;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TriggerPatrolRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return scopeConfig
     */
    public ScopeConfig getScopeConfig() {
        return this.scopeConfig;
    }

    /**
     * @return scopeType
     */
    public String getScopeType() {
        return this.scopeType;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<TriggerPatrolRequest, Builder> {
        private String namespace; 
        private ScopeConfig scopeConfig; 
        private String scopeType; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(TriggerPatrolRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.scopeConfig = request.scopeConfig;
            this.scopeType = request.scopeType;
            this.workspace = request.workspace;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default-namespace</p>
         */
        public Builder namespace(String namespace) {
            this.putPathParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * scopeConfig.
         */
        public Builder scopeConfig(ScopeConfig scopeConfig) {
            this.putBodyParameter("scopeConfig", scopeConfig);
            this.scopeConfig = scopeConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder scopeType(String scopeType) {
            this.putBodyParameter("scopeType", scopeType);
            this.scopeType = scopeType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a14bd5d90a****</p>
         */
        public Builder workspace(String workspace) {
            this.putHeaderParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public TriggerPatrolRequest build() {
            return new TriggerPatrolRequest(this);
        } 

    } 

    /**
     * 
     * {@link TriggerPatrolRequest} extends {@link TeaModel}
     *
     * <p>TriggerPatrolRequest</p>
     */
    public static class ScopeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deploymentIds")
        private java.util.List<String> deploymentIds;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.Map<String, java.util.List<String>> tags;

        private ScopeConfig(Builder builder) {
            this.deploymentIds = builder.deploymentIds;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScopeConfig create() {
            return builder().build();
        }

        /**
         * @return deploymentIds
         */
        public java.util.List<String> getDeploymentIds() {
            return this.deploymentIds;
        }

        /**
         * @return tags
         */
        public java.util.Map<String, java.util.List<String>> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private java.util.List<String> deploymentIds; 
            private java.util.Map<String, java.util.List<String>> tags; 

            private Builder() {
            } 

            private Builder(ScopeConfig model) {
                this.deploymentIds = model.deploymentIds;
                this.tags = model.tags;
            } 

            /**
             * deploymentIds.
             */
            public Builder deploymentIds(java.util.List<String> deploymentIds) {
                this.deploymentIds = deploymentIds;
                return this;
            }

            /**
             * tags.
             */
            public Builder tags(java.util.Map<String, java.util.List<String>> tags) {
                this.tags = tags;
                return this;
            }

            public ScopeConfig build() {
                return new ScopeConfig(this);
            } 

        } 

    }
}
