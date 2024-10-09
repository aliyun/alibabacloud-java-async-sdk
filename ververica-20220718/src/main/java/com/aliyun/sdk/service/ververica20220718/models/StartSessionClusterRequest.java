// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StartSessionClusterRequest} extends {@link RequestModel}
 *
 * <p>StartSessionClusterRequest</p>
 */
public class StartSessionClusterRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sessionClusterName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionClusterName;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private StartSessionClusterRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.sessionClusterName = builder.sessionClusterName;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartSessionClusterRequest create() {
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
     * @return sessionClusterName
     */
    public String getSessionClusterName() {
        return this.sessionClusterName;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<StartSessionClusterRequest, Builder> {
        private String namespace; 
        private String sessionClusterName; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(StartSessionClusterRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.sessionClusterName = request.sessionClusterName;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-session</p>
         */
        public Builder sessionClusterName(String sessionClusterName) {
            this.putPathParameter("sessionClusterName", sessionClusterName);
            this.sessionClusterName = sessionClusterName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a14bda1c4a****</p>
         */
        public Builder workspace(String workspace) {
            this.putHeaderParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public StartSessionClusterRequest build() {
            return new StartSessionClusterRequest(this);
        } 

    } 

}
