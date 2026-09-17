// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link ListK8sResourceRequest} extends {@link RequestModel}
 *
 * <p>ListK8sResourceRequest</p>
 */
public class ListK8sResourceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("K8sClusterId")
    private String k8sClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("K8sNamespace")
    private String k8sNamespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private ListK8sResourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clusterId = builder.clusterId;
        this.k8sClusterId = builder.k8sClusterId;
        this.k8sNamespace = builder.k8sNamespace;
        this.resourceType = builder.resourceType;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListK8sResourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return k8sClusterId
     */
    public String getK8sClusterId() {
        return this.k8sClusterId;
    }

    /**
     * @return k8sNamespace
     */
    public String getK8sNamespace() {
        return this.k8sNamespace;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<ListK8sResourceRequest, Builder> {
        private String regionId; 
        private String clusterId; 
        private String k8sClusterId; 
        private String k8sNamespace; 
        private String resourceType; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(ListK8sResourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clusterId = request.clusterId;
            this.k8sClusterId = request.k8sClusterId;
            this.k8sNamespace = request.k8sNamespace;
            this.resourceType = request.resourceType;
            this.vpcId = request.vpcId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The Cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxljob-b6ec1xxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the Kubernetes cluster used for synchronizing namespaces. The cluster is added to the service mesh specified by ServiceMeshId. This parameter is required when you query a k8s namespace or a k8s service.</p>
         * 
         * <strong>example:</strong>
         * <p>cadb451ed7af04b0297f4be396a2196fc</p>
         */
        public Builder k8sClusterId(String k8sClusterId) {
            this.putQueryParameter("K8sClusterId", k8sClusterId);
            this.k8sClusterId = k8sClusterId;
            return this;
        }

        /**
         * <p>The name of the namespace in the k8s cluster. This parameter is required when you query a k8s service.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder k8sNamespace(String k8sNamespace) {
            this.putQueryParameter("K8sNamespace", k8sNamespace);
            this.k8sNamespace = k8sNamespace;
            return this;
        }

        /**
         * <p>The resource type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The VPC ID. This parameter is required if ResourceType is set to \&quot;cluster\&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-aa1a18236n90rqhuhhnhh</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public ListK8sResourceRequest build() {
            return new ListK8sResourceRequest(this);
        } 

    } 

}
