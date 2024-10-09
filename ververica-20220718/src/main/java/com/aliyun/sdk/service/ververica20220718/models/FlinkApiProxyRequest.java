// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link FlinkApiProxyRequest} extends {@link RequestModel}
 *
 * <p>FlinkApiProxyRequest</p>
 */
public class FlinkApiProxyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("flinkApiPath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flinkApiPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private FlinkApiProxyRequest(Builder builder) {
        super(builder);
        this.flinkApiPath = builder.flinkApiPath;
        this.namespace = builder.namespace;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlinkApiProxyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flinkApiPath
     */
    public String getFlinkApiPath() {
        return this.flinkApiPath;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
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
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<FlinkApiProxyRequest, Builder> {
        private String flinkApiPath; 
        private String namespace; 
        private String resourceId; 
        private String resourceType; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(FlinkApiProxyRequest request) {
            super(request);
            this.flinkApiPath = request.flinkApiPath;
            this.namespace = request.namespace;
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
            this.workspace = request.workspace;
        } 

        /**
         * <p>The path of the Flink UI.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/jobs/4df35f8e54554b23bf7dcd38a151****</p>
         */
        public Builder flinkApiPath(String flinkApiPath) {
            this.putQueryParameter("flinkApiPath", flinkApiPath);
            this.flinkApiPath = flinkApiPath;
            return this;
        }

        /**
         * <p>The name of the namespace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default-namespace</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The resource ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5a27a3aa-c5b9-4dc1-8c86-be57d2d6****</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("resourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The type of the resource. Valid values:</p>
         * <ul>
         * <li>jobs</li>
         * <li>sessionclusters</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>jobs</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("resourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
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
        public FlinkApiProxyRequest build() {
            return new FlinkApiProxyRequest(this);
        } 

    } 

}
