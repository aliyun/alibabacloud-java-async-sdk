// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddLocalNodesRequest} extends {@link RequestModel}
 *
 * <p>AddLocalNodesRequest</p>
 */
public class AddLocalNodesRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Nodes")
    @Validation(required = true)
    private String nodes;

    @Query
    @NameInMap("Queue")
    private String queue;

    private AddLocalNodesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodes = builder.nodes;
        this.queue = builder.queue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddLocalNodesRequest create() {
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
     * @return nodes
     */
    public String getNodes() {
        return this.nodes;
    }

    /**
     * @return queue
     */
    public String getQueue() {
        return this.queue;
    }

    public static final class Builder extends Request.Builder<AddLocalNodesRequest, Builder> {
        private String clusterId; 
        private String nodes; 
        private String queue; 

        private Builder() {
            super();
        } 

        private Builder(AddLocalNodesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.nodes = request.nodes;
            this.queue = request.queue;
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
         * Nodes.
         */
        public Builder nodes(String nodes) {
            this.putQueryParameter("Nodes", nodes);
            this.nodes = nodes;
            return this;
        }

        /**
         * Queue.
         */
        public Builder queue(String queue) {
            this.putQueryParameter("Queue", queue);
            this.queue = queue;
            return this;
        }

        @Override
        public AddLocalNodesRequest build() {
            return new AddLocalNodesRequest(this);
        } 

    } 

}
