// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddExistedNodesRequest} extends {@link RequestModel}
 *
 * <p>AddExistedNodesRequest</p>
 */
public class AddExistedNodesRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ImageId")
    @Validation(required = true)
    private String imageId;

    @Query
    @NameInMap("ImageOwnerAlias")
    @Validation(required = true)
    private String imageOwnerAlias;

    @Query
    @NameInMap("Instance")
    @Validation(required = true)
    private java.util.List < Instance> instance;

    @Query
    @NameInMap("JobQueue")
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
    public java.util.List < Instance> getInstance() {
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
        private java.util.List < Instance> instance; 
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
         * The ID of the cluster.
         * <p>
         * 
         * You can call the [ListClusters](~~87116~~) operation to query the cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The ID of the image that is specified for the compute nodes. The image must meet the following requirements:
         * <p>
         * 
         * *   The operating system that is specified for the image must be the same as that of the existing cluster nodes. For example, if the operating system of the cluster nodes is CentOS, you can select only a CentOS image.
         * 
         * >  If you add nodes to a hybrid cloud cluster that supports multiple operating systems, you can select a Windows Server image or a CentOS image when the operating system of the cluster nodes is Windows.
         * 
         * *   The major version of the image specified for the compute nodes that you want to add must be the same as that of the image of the cluster. For example, if the version of the cluster image is CentOS 7.x, the version of the image specified for the compute nodes must be CentOS 7.x.
         * 
         * You can call the [ListImages](~~87213~~) and [ListCustomImages](~~87215~~) operations to query the image ID.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The type of the images. Valid values:
         * <p>
         * 
         * *   system: public image.
         * *   self: custom image
         * *   others: shared image
         * *   marketplace: Alibaba Cloud Marketplace image
         * 
         * Default value: system.
         */
        public Builder imageOwnerAlias(String imageOwnerAlias) {
            this.putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }

        /**
         * The information about the node that you want to add.
         */
        public Builder instance(java.util.List < Instance> instance) {
            this.putQueryParameter("Instance", instance);
            this.instance = instance;
            return this;
        }

        /**
         * The queue in the cluster to which the node is to be added.
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

    public static class Instance extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
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

            /**
             * The Nth node ID. N starts from 1. Valid values: 1 to 100.
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
