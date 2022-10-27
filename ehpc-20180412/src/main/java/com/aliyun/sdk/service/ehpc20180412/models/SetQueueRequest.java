// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetQueueRequest} extends {@link RequestModel}
 *
 * <p>SetQueueRequest</p>
 */
public class SetQueueRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Node")
    @Validation(required = true)
    private java.util.List < Node> node;

    @Query
    @NameInMap("QueueName")
    @Validation(required = true)
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
    public java.util.List < Node> getNode() {
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
        private java.util.List < Node> node; 
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
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Node.
         */
        public Builder node(java.util.List < Node> node) {
            this.putQueryParameter("Node", node);
            this.node = node;
            return this;
        }

        /**
         * QueueName.
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

    public static class Node extends TeaModel {
        @NameInMap("Name")
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

            /**
             * Name.
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
