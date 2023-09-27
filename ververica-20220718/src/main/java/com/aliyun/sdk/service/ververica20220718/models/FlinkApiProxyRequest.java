// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlinkApiProxyRequest} extends {@link RequestModel}
 *
 * <p>FlinkApiProxyRequest</p>
 */
public class FlinkApiProxyRequest extends Request {
    @Query
    @NameInMap("flinkApiPath")
    @Validation(required = true)
    private String flinkApiPath;

    @Query
    @NameInMap("namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("resourceId")
    @Validation(required = true)
    private String resourceId;

    @Query
    @NameInMap("resourceType")
    @Validation(required = true)
    private String resourceType;

    @Header
    @NameInMap("workspace")
    @Validation(required = true)
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
         * flinkApiPath.
         */
        public Builder flinkApiPath(String flinkApiPath) {
            this.putQueryParameter("flinkApiPath", flinkApiPath);
            this.flinkApiPath = flinkApiPath;
            return this;
        }

        /**
         * namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * resourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("resourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * resourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("resourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * workspace.
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
