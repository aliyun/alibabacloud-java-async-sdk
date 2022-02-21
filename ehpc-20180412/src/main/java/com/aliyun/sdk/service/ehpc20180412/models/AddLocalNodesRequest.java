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

    private AddLocalNodesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodes = builder.nodes;
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

    public static final class Builder extends Request.Builder<AddLocalNodesRequest, Builder> {
        private String clusterId; 
        private String nodes; 

        private Builder() {
            super();
        } 

        private Builder(AddLocalNodesRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.nodes = response.nodes;
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

        @Override
        public AddLocalNodesRequest build() {
            return new AddLocalNodesRequest(this);
        } 

    } 

}
