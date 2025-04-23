// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link AddExistedNodesRequest} extends {@link RequestModel}
 *
 * <p>AddExistedNodesRequest</p>
 */
public class AddExistedNodesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageOwnerAlias")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageOwnerAlias;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Instance")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Instance> instance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobQueue")
    private String jobQueue;

    private AddExistedNodesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.imageId = builder.imageId;
        this.imageOwnerAlias = builder.imageOwnerAlias;
        this.instance = builder.instance;
        this.jobQueue = builder.jobQueue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddExistedNodesRequest create() {
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
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageOwnerAlias
     */
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    /**
     * @return instance
     */
    public java.util.List<Instance> getInstance() {
        return this.instance;
    }

    /**
     * @return jobQueue
     */
    public String getJobQueue() {
        return this.jobQueue;
    }

    public static final class Builder extends Request.Builder<AddExistedNodesRequest, Builder> {
        private String clusterId; 
        private String imageId; 
        private String imageOwnerAlias; 
        private java.util.List<Instance> instance; 
        private String jobQueue; 

        private Builder() {
            super();
        } 

        private Builder(AddExistedNodesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.imageId = request.imageId;
            this.imageOwnerAlias = request.imageOwnerAlias;
            this.instance = request.instance;
            this.jobQueue = request.jobQueue;
        } 

        /**
         * <p>The ID of the cluster.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-FYUr32****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the image that is specified for the compute nodes. The image must meet the following requirements:</p>
         * <ul>
         * <li>The operating system that is specified for the image must be the same as that of the existing cluster nodes. For example, if the operating system of the cluster nodes is CentOS, you can select only a CentOS image.</li>
         * </ul>
         * <blockquote>
         * <p> If you add nodes to a hybrid cloud cluster that supports multiple operating systems, you can select a Windows Server image or a CentOS image when the operating system of the cluster nodes is Windows.</p>
         * </blockquote>
         * <ul>
         * <li>The major version of the image specified for the compute nodes that you want to add must be the same as that of the image of the cluster. For example, if the version of the cluster image is CentOS 7.x, the version of the image specified for the compute nodes must be CentOS 7.x.</li>
         * </ul>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87213.html">ListImages</a> and <a href="https://help.aliyun.com/document_detail/87215.html">ListCustomImages</a> operations to query the image ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>centos_7_06_64_20G_alibase_20190711.vhd</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The type of the images. Valid values:</p>
         * <ul>
         * <li>system: public image.</li>
         * <li>self: custom image</li>
         * <li>others: shared image</li>
         * <li>marketplace: Alibaba Cloud Marketplace image</li>
         * </ul>
         * <p>Default value: system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        public Builder imageOwnerAlias(String imageOwnerAlias) {
            this.putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }

        /**
         * <p>The information about the node that you want to add.</p>
         * <p>This parameter is required.</p>
         */
        public Builder instance(java.util.List<Instance> instance) {
            this.putQueryParameter("Instance", instance);
            this.instance = instance;
            return this;
        }

        /**
         * <p>The queue in the cluster to which the node is to be added.</p>
         * 
         * <strong>example:</strong>
         * <p>workq</p>
         */
        public Builder jobQueue(String jobQueue) {
            this.putQueryParameter("JobQueue", jobQueue);
            this.jobQueue = jobQueue;
            return this;
        }

        @Override
        public AddExistedNodesRequest build() {
            return new AddExistedNodesRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddExistedNodesRequest} extends {@link TeaModel}
     *
     * <p>AddExistedNodesRequest</p>
     */
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        private Instance(Builder builder) {
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String id; 

            private Builder() {
            } 

            private Builder(Instance model) {
                this.id = model.id;
            } 

            /**
             * <p>The Nth node ID. N starts from 1. Valid values: 1 to 100.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp16mxn6mt3t7ftk****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
}
