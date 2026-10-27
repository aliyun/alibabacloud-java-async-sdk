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
    private java.util.List<DeleteOptions> deleteOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("keep_slb")
    @Deprecated
    private Boolean keepSlb;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("retain_all_resources")
    private Boolean retainAllResources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("retain_resources")
    private java.util.List<String> retainResources;

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
    public java.util.List<DeleteOptions> getDeleteOptions() {
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
    public java.util.List<String> getRetainResources() {
        return this.retainResources;
    }

    public static final class Builder extends Request.Builder<DeleteClusterRequest, Builder> {
        private String clusterId; 
        private java.util.List<DeleteOptions> deleteOptions; 
        private Boolean keepSlb; 
        private Boolean retainAllResources; 
        private java.util.List<String> retainResources; 

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
         * <p>The ID of the cluster.</p>
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
         * <p>The deletion options for the resources associated with the cluster.</p>
         */
        public Builder deleteOptions(java.util.List<DeleteOptions> deleteOptions) {
            String deleteOptionsShrink = shrink(deleteOptions, "delete_options", "json");
            this.putQueryParameter("delete_options", deleteOptionsShrink);
            this.deleteOptions = deleteOptions;
            return this;
        }

        /**
         * <p>Specifies whether to retain the Server Load Balancer (SLB) instances created by using Services.
         * Valid values:</p>
         * <ul>
         * <li><code>true</code>: retains the created SLB resources.</li>
         * <li><code>false</code>: does not retain the created SLB resources.</li>
         * </ul>
         * <p>Default value: <code>false</code>.
         * <strong>[Deprecated]</strong> Use <code>SLB</code> in <code>delete_options</code> instead.</p>
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
         * <p>Specifies whether to retain all resources. If you set this parameter to <code>true</code>, the <code>retain_resources</code> parameter is ignored, and all cloud resources created by the cluster that are queried by calling the <code>DescribeClusterResources</code> operation are retained. If you set this parameter to <code>false</code>, note that the resources that are retained by default in <code>delete_options</code> are still retained. To delete these resources, set <code>delete_mode</code> to <code>delete</code> in <code>delete_options</code>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><code>true</code>: retains all resources, including all cloud resources created by the cluster.</li>
         * <li><code>false</code>: does not retain all resources, except for the resources that are retained by default in <code>delete_options</code>. For example, ALB resources are still retained even if this parameter is set to <code>false</code>.</li>
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
         * <p>The list of resources. To retain resources when you delete the cluster, specify the IDs of the corresponding resources.</p>
         */
        public Builder retainResources(java.util.List<String> retainResources) {
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

            private Builder() {
            } 

            private Builder(DeleteOptions model) {
                this.deleteMode = model.deleteMode;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The deletion mode for this type of resource. Valid values:</p>
             * <ul>
             * <li><code>delete</code>: deletes this type of resource.</li>
             * <li><code>retain</code>: retains this type of resource.</li>
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
             * <li><code>SLB</code>: the SLB resources created by using Services. By default, these resources are deleted. You can choose to retain them.</li>
             * <li><code>ALB</code>: the ALB resources created by the ALB Ingress controller. By default, these resources are retained. You can choose to delete them.</li>
             * <li><code>SLS_Data</code>: the SLS projects used for the cluster log feature. By default, these resources are retained. You can choose to delete them.</li>
             * <li><code>SLS_ControlPlane</code>: the SLS projects used for the control plane logs of managed clusters. By default, these resources are retained. You can choose to delete them.</li>
             * <li><code>PrivateZone</code>: the PrivateZone resources created by ACK Serverless clusters. By default, these resources are retained. You can choose to delete them.</li>
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
