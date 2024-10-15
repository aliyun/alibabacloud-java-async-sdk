// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteClusterRequest} extends {@link RequestModel}
 *
 * <p>DeleteClusterRequest</p>
 */
public class DeleteClusterRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("delete_options")
    private java.util.List < DeleteOptions> deleteOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("keep_slb")
    @Deprecated
    private Boolean keepSlb;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("retain_all_resources")
    private Boolean retainAllResources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("retain_resources")
    private java.util.List < String > retainResources;

    private DeleteClusterRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.deleteOptions = builder.deleteOptions;
        this.keepSlb = builder.keepSlb;
        this.retainAllResources = builder.retainAllResources;
        this.retainResources = builder.retainResources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteClusterRequest create() {
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
     * @return deleteOptions
     */
    public java.util.List < DeleteOptions> getDeleteOptions() {
        return this.deleteOptions;
    }

    /**
     * @return keepSlb
     */
    public Boolean getKeepSlb() {
        return this.keepSlb;
    }

    /**
     * @return retainAllResources
     */
    public Boolean getRetainAllResources() {
        return this.retainAllResources;
    }

    /**
     * @return retainResources
     */
    public java.util.List < String > getRetainResources() {
        return this.retainResources;
    }

    public static final class Builder extends Request.Builder<DeleteClusterRequest, Builder> {
        private String clusterId; 
        private java.util.List < DeleteOptions> deleteOptions; 
        private Boolean keepSlb; 
        private Boolean retainAllResources; 
        private java.util.List < String > retainResources; 

        private Builder() {
            super();
        } 

        private Builder(DeleteClusterRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.deleteOptions = request.deleteOptions;
            this.keepSlb = request.keepSlb;
            this.retainAllResources = request.retainAllResources;
            this.retainResources = request.retainResources;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c905d1364c2dd4b6284a3f41790c4****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The type of cluster resource that you want to delete or retain.</p>
         */
        public Builder deleteOptions(java.util.List < DeleteOptions> deleteOptions) {
            String deleteOptionsShrink = shrink(deleteOptions, "delete_options", "json");
            this.putQueryParameter("delete_options", deleteOptionsShrink);
            this.deleteOptions = deleteOptions;
            return this;
        }

        /**
         * <p>Specifies whether to retain the Server Load Balancer (SLB) resources that are created by the cluster.</p>
         * <ul>
         * <li><code>true</code>: retains the SLB instances that are created by the cluster.</li>
         * <li><code>false</code>: does not retain the SLB instances that are created by the cluster.</li>
         * </ul>
         * <p>Default value: <code>false</code>. Set resource_type to <code>SLB</code> in the <code>delete_options</code> parameter to manage SLB instances.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder keepSlb(Boolean keepSlb) {
            this.putQueryParameter("keep_slb", keepSlb);
            this.keepSlb = keepSlb;
            return this;
        }

        /**
         * <p>Specifies whether to retain all resources. If you set the parameter to <code>true</code>, the <code>retain_resources</code> parameter is ignored. The cloud resources that are created by the cluster are retained. You can call the <code>DescribeClusterResources</code> operation to query cloud resources created by the cluster. If you set the parameter to <code>false</code>, resources to be retained by default in the <code>delete_options</code> parameter are still retained. To delete these resources, set <code>delete_mode</code> to <code>delete</code> in <code>delete_options</code>.</p>
         * <ul>
         * <li><code>true</code>: retains all resources, including cloud resources created by the cluster.</li>
         * <li><code>false</code>: does not retain all resources. Resources to be retained by default in the <code>delete_options</code> parameter are retained. For example, <code>ALB</code> instances are retained when this parameter is set to <code>false</code>.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder retainAllResources(Boolean retainAllResources) {
            this.putQueryParameter("retain_all_resources", retainAllResources);
            this.retainAllResources = retainAllResources;
            return this;
        }

        /**
         * <p>The list of resources. To retain resources when you delete a cluster, you need to specify the IDs of the resources to be retained.</p>
         */
        public Builder retainResources(java.util.List < String > retainResources) {
            String retainResourcesShrink = shrink(retainResources, "retain_resources", "json");
            this.putQueryParameter("retain_resources", retainResourcesShrink);
            this.retainResources = retainResources;
            return this;
        }

        @Override
        public DeleteClusterRequest build() {
            return new DeleteClusterRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeleteClusterRequest} extends {@link TeaModel}
     *
     * <p>DeleteClusterRequest</p>
     */
    public static class DeleteOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("delete_mode")
        private String deleteMode;

        @com.aliyun.core.annotation.NameInMap("resource_type")
        private String resourceType;

        private DeleteOptions(Builder builder) {
            this.deleteMode = builder.deleteMode;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeleteOptions create() {
            return builder().build();
        }

        /**
         * @return deleteMode
         */
        public String getDeleteMode() {
            return this.deleteMode;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String deleteMode; 
            private String resourceType; 

            /**
             * <p>The deletion policy for the specified type of resource. Valid values:</p>
             * <ul>
             * <li>delete: deletes the specified type of resource.</li>
             * <li>retain: retains the specified type of resource.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>delete</p>
             */
            public Builder deleteMode(String deleteMode) {
                this.deleteMode = deleteMode;
                return this;
            }

            /**
             * <p>The type of the resource. Valid values:</p>
             * <ul>
             * <li>SLB: SLB resources created for Services. By default, the SLB resources are automatically deleted.</li>
             * <li>ALB: Application Load Balancer (ALB) resources created by the ALB Ingress controller. By default, the ALB resources are retained.</li>
             * <li>SLS_Data: Simple Log Service projects used by the cluster logging feature. By default, the Simple Log Service projects are retained.</li>
             * <li>SLS_ControlPlane: Simple Log Service projects used to store the logs of control planes in ACK managed clusters. By default, the Simple Log Service projects are retained.</li>
             * <li>PrivateZone: PrivateZone resources created by ACK Serverless clusters. By default, the PrivateZone resources are retained.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SLS_Data</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public DeleteOptions build() {
                return new DeleteOptions(this);
            } 

        } 

    }
}
