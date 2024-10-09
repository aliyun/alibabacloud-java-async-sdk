// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListScheduledPlanExecutedHistoryRequest} extends {@link RequestModel}
 *
 * <p>ListScheduledPlanExecutedHistoryRequest</p>
 */
public class ListScheduledPlanExecutedHistoryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("deploymentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deploymentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("origin")
    private String origin;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private ListScheduledPlanExecutedHistoryRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.deploymentId = builder.deploymentId;
        this.origin = builder.origin;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScheduledPlanExecutedHistoryRequest create() {
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
     * @return deploymentId
     */
    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * @return origin
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<ListScheduledPlanExecutedHistoryRequest, Builder> {
        private String namespace; 
        private String deploymentId; 
        private String origin; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(ListScheduledPlanExecutedHistoryRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.deploymentId = request.deploymentId;
            this.origin = request.origin;
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
         * <p>58718c99-3b29-4c5e-93bb-c9fc4ec6****</p>
         */
        public Builder deploymentId(String deploymentId) {
            this.putQueryParameter("deploymentId", deploymentId);
            this.deploymentId = deploymentId;
            return this;
        }

        /**
         * origin.
         */
        public Builder origin(String origin) {
            this.putQueryParameter("origin", origin);
            this.origin = origin;
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
        public ListScheduledPlanExecutedHistoryRequest build() {
            return new ListScheduledPlanExecutedHistoryRequest(this);
        } 

    } 

}
