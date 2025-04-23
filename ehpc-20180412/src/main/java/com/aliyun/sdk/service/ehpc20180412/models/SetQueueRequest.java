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
 * {@link SetQueueRequest} extends {@link RequestModel}
 *
 * <p>SetQueueRequest</p>
 */
public class SetQueueRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Node")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Node> node;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueueName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queueName;

    private SetQueueRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.node = builder.node;
        this.queueName = builder.queueName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetQueueRequest create() {
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
     * @return node
     */
    public java.util.List<Node> getNode() {
        return this.node;
    }

    /**
     * @return queueName
     */
    public String getQueueName() {
        return this.queueName;
    }

    public static final class Builder extends Request.Builder<SetQueueRequest, Builder> {
        private String clusterId; 
        private java.util.List<Node> node; 
        private String queueName; 

        private Builder() {
            super();
        } 

        private Builder(SetQueueRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.node = request.node;
            this.queueName = request.queueName;
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
         * <p>This parameter is required.</p>
         */
        public Builder node(java.util.List<Node> node) {
            this.putQueryParameter("Node", node);
            this.node = node;
            return this;
        }

        /**
         * <p>The name of the destination queue.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/92176.html">ListQueues</a> operation to query the queue name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>work</p>
         */
        public Builder queueName(String queueName) {
            this.putQueryParameter("QueueName", queueName);
            this.queueName = queueName;
            return this;
        }

        @Override
        public SetQueueRequest build() {
            return new SetQueueRequest(this);
        } 

    } 

    /**
     * 
     * {@link SetQueueRequest} extends {@link TeaModel}
     *
     * <p>SetQueueRequest</p>
     */
    public static class Node extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Node(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Node create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(Node model) {
                this.name = model.name;
            } 

            /**
             * <p>The name of the compute node that you want to move. Valid values of N: 1 to 100.</p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/87161.html">ListNodes</a> operation to query the names of the compute nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>compute1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Node build() {
                return new Node(this);
            } 

        } 

    }
}
