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
 * {@link AddLocalNodesRequest} extends {@link RequestModel}
 *
 * <p>AddLocalNodesRequest</p>
 */
public class AddLocalNodesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nodes")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Queue")
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
         * <p>The ID of the cluster.</p>
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
         * <p>The information of the local node. A JSON string that contains the HostName, IpAddress, CpuCores, and Memory (Unit: MB) of the local node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;HostName&quot;:&quot;test-HostName&quot;,&quot;IpAddress&quot;:&quot;<code>192.168.**.**</code>&quot;},{&quot;CpuCores&quot;:2,&quot;Memory&quot;:1024}]</p>
         */
        public Builder nodes(String nodes) {
            this.putQueryParameter("Nodes", nodes);
            this.nodes = nodes;
            return this;
        }

        /**
         * <p>The queue to which to add the local node.</p>
         * 
         * <strong>example:</strong>
         * <p>test.q</p>
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
