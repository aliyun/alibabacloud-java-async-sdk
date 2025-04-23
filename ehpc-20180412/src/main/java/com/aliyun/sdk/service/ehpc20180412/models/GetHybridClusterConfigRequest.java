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
 * {@link GetHybridClusterConfigRequest} extends {@link RequestModel}
 *
 * <p>GetHybridClusterConfigRequest</p>
 */
public class GetHybridClusterConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Node")
    private String node;

    private GetHybridClusterConfigRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.node = builder.node;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHybridClusterConfigRequest create() {
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
    public String getNode() {
        return this.node;
    }

    public static final class Builder extends Request.Builder<GetHybridClusterConfigRequest, Builder> {
        private String clusterId; 
        private String node; 

        private Builder() {
            super();
        } 

        private Builder(GetHybridClusterConfigRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.node = request.node;
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
         * <p>The name of the on-premises compute node. You can call this operation to query the configurations of the on-premises compute node.</p>
         * <p>By default, the operation queries the configurations of a cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>testNode</p>
         */
        public Builder node(String node) {
            this.putQueryParameter("Node", node);
            this.node = node;
            return this;
        }

        @Override
        public GetHybridClusterConfigRequest build() {
            return new GetHybridClusterConfigRequest(this);
        } 

    } 

}
