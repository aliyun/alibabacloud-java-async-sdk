// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link DescribeResourcesDeleteProtectionRequest} extends {@link RequestModel}
 *
 * <p>DescribeResourcesDeleteProtectionRequest</p>
 */
public class DescribeResourcesDeleteProtectionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resources")
    private String resources;

    private DescribeResourcesDeleteProtectionRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.resourceType = builder.resourceType;
        this.namespace = builder.namespace;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourcesDeleteProtectionRequest create() {
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
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return resources
     */
    public String getResources() {
        return this.resources;
    }

    public static final class Builder extends Request.Builder<DescribeResourcesDeleteProtectionRequest, Builder> {
        private String clusterId; 
        private String resourceType; 
        private String namespace; 
        private String resources; 

        private Builder() {
            super();
        } 

        private Builder(DescribeResourcesDeleteProtectionRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.resourceType = request.resourceType;
            this.namespace = request.namespace;
            this.resources = request.resources;
        } 

        /**
         * <p>The ID of the Container Service for Kubernetes (ACK) cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c82e6987e2961451182edacd74faf****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The type of the resource that you want to query. Valid values:</p>
         * <ul>
         * <li>Namespaces</li>
         * <li>services</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>namespaces</p>
         */
        public Builder resourceType(String resourceType) {
            this.putPathParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The namespace in which the resources that you want to query reside.</p>
         * <p>This parameter is required when you set resource_type to services. Default value: default.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The names of the resources that you want to query. Separate multiple resource names with commas (,).</p>
         * <ul>
         * <li>When you set resource_type to namespaces, you must specify namespace names. If you leave this parameter empty, all namespaces in the cluster are queried.</li>
         * <li>If you set resource_type to services, you must specify Service names.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test1,test2</p>
         */
        public Builder resources(String resources) {
            this.putQueryParameter("resources", resources);
            this.resources = resources;
            return this;
        }

        @Override
        public DescribeResourcesDeleteProtectionRequest build() {
            return new DescribeResourcesDeleteProtectionRequest(this);
        } 

    } 

}
