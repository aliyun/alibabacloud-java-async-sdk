// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateResourcesDeleteProtectionRequest} extends {@link RequestModel}
 *
 * <p>UpdateResourcesDeleteProtectionRequest</p>
 */
public class UpdateResourcesDeleteProtectionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resource_type")
    private String resourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resources")
    private java.util.List < String > resources;

    private UpdateResourcesDeleteProtectionRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.enable = builder.enable;
        this.namespace = builder.namespace;
        this.resourceType = builder.resourceType;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResourcesDeleteProtectionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return resources
     */
    public java.util.List < String > getResources() {
        return this.resources;
    }

    public static final class Builder extends Request.Builder<UpdateResourcesDeleteProtectionRequest, Builder> {
        private String clusterId; 
        private Boolean enable; 
        private String namespace; 
        private String resourceType; 
        private java.util.List < String > resources; 

        private Builder() {
            super();
        } 

        private Builder(UpdateResourcesDeleteProtectionRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.enable = request.enable;
            this.namespace = request.namespace;
            this.resourceType = request.resourceType;
            this.resources = request.resources;
        } 

        /**
         * <p>The ID of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c850429a2287b4d968e27e87a4921****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Specifies whether to enable deletion protection. Set the value to true to enable deletion protection and set the value to false to disable deletion protection.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.putBodyParameter("enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>The namespace to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The type of resource for which deletion protection is enabled or disabled. You can specify namespaces or Services.</p>
         * 
         * <strong>example:</strong>
         * <p>services</p>
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("resource_type", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The resources list.</p>
         */
        public Builder resources(java.util.List < String > resources) {
            this.putBodyParameter("resources", resources);
            this.resources = resources;
            return this;
        }

        @Override
        public UpdateResourcesDeleteProtectionRequest build() {
            return new UpdateResourcesDeleteProtectionRequest(this);
        } 

    } 

}
