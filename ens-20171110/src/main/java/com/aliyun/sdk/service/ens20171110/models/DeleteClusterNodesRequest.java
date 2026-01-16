// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DeleteClusterNodesRequest} extends {@link RequestModel}
 *
 * <p>DeleteClusterNodesRequest</p>
 */
public class DeleteClusterNodesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Body")
    @com.aliyun.core.annotation.Validation(required = true)
    private DeleteClusterNodesRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    private DeleteClusterNodesRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteClusterNodesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public DeleteClusterNodesRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    public static final class Builder extends Request.Builder<DeleteClusterNodesRequest, Builder> {
        private DeleteClusterNodesRequestBody body; 
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteClusterNodesRequest request) {
            super(request);
            this.body = request.body;
            this.clusterId = request.clusterId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder body(DeleteClusterNodesRequestBody body) {
            String bodyShrink = shrink(body, "Body", "json");
            this.putQueryParameter("Body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eck-xxxxxxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public DeleteClusterNodesRequest build() {
            return new DeleteClusterNodesRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeleteClusterNodesRequest} extends {@link TeaModel}
     *
     * <p>DeleteClusterNodesRequest</p>
     */
    public static class DeleteClusterNodesRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Nodes")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> nodes;

        private DeleteClusterNodesRequestBody(Builder builder) {
            this.nodes = builder.nodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeleteClusterNodesRequestBody create() {
            return builder().build();
        }

        /**
         * @return nodes
         */
        public java.util.List<String> getNodes() {
            return this.nodes;
        }

        public static final class Builder {
            private java.util.List<String> nodes; 

            private Builder() {
            } 

            private Builder(DeleteClusterNodesRequestBody model) {
                this.nodes = model.nodes;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder nodes(java.util.List<String> nodes) {
                this.nodes = nodes;
                return this;
            }

            public DeleteClusterNodesRequestBody build() {
                return new DeleteClusterNodesRequestBody(this);
            } 

        } 

    }
}
