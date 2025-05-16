// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

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
 * {@link AttachNodesRequest} extends {@link RequestModel}
 *
 * <p>AttachNodesRequest</p>
 */
public class AttachNodesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComputeNode")
    @com.aliyun.core.annotation.Validation(required = true)
    private ComputeNode computeNode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueueName")
    private String queueName;

    private AttachNodesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.computeNode = builder.computeNode;
        this.queueName = builder.queueName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachNodesRequest create() {
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
     * @return computeNode
     */
    public ComputeNode getComputeNode() {
        return this.computeNode;
    }

    /**
     * @return queueName
     */
    public String getQueueName() {
        return this.queueName;
    }

    public static final class Builder extends Request.Builder<AttachNodesRequest, Builder> {
        private String clusterId; 
        private ComputeNode computeNode; 
        private String queueName; 

        private Builder() {
            super();
        } 

        private Builder(AttachNodesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.computeNode = request.computeNode;
            this.queueName = request.queueName;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-xxxxxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The compute node information.</p>
         * <p>This parameter is required.</p>
         */
        public Builder computeNode(ComputeNode computeNode) {
            String computeNodeShrink = shrink(computeNode, "ComputeNode", "json");
            this.putQueryParameter("ComputeNode", computeNodeShrink);
            this.computeNode = computeNode;
            return this;
        }

        /**
         * <p>The name of the queue to which the instance is to be added.</p>
         * 
         * <strong>example:</strong>
         * <p>comp</p>
         */
        public Builder queueName(String queueName) {
            this.putQueryParameter("QueueName", queueName);
            this.queueName = queueName;
            return this;
        }

        @Override
        public AttachNodesRequest build() {
            return new AttachNodesRequest(this);
        } 

    } 

    /**
     * 
     * {@link AttachNodesRequest} extends {@link TeaModel}
     *
     * <p>AttachNodesRequest</p>
     */
    public static class ComputeNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("InstanceIds")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> instanceIds;

        private ComputeNode(Builder builder) {
            this.imageId = builder.imageId;
            this.instanceIds = builder.instanceIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComputeNode create() {
            return builder().build();
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return instanceIds
         */
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        public static final class Builder {
            private String imageId; 
            private java.util.List<String> instanceIds; 

            private Builder() {
            } 

            private Builder(ComputeNode model) {
                this.imageId = model.imageId;
                this.instanceIds = model.instanceIds;
            } 

            /**
             * <p>The image ID. This image will be used to replace the original system disk image.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>m-bp1h765oyqyxxxxxxxxx</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The instance IDs.</p>
             * <p>This parameter is required.</p>
             */
            public Builder instanceIds(java.util.List<String> instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            public ComputeNode build() {
                return new ComputeNode(this);
            } 

        } 

    }
}
