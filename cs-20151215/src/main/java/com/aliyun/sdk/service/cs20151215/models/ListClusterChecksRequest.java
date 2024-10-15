// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListClusterChecksRequest} extends {@link RequestModel}
 *
 * <p>ListClusterChecksRequest</p>
 */
public class ListClusterChecksRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("target")
    private String target;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ListClusterChecksRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.target = builder.target;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterChecksRequest create() {
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
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListClusterChecksRequest, Builder> {
        private String clusterId; 
        private String target; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListClusterChecksRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.target = request.target;
            this.type = request.type;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ce0da5a1d627e4e9e9f96cae8ad07****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The targets to check.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-bp19ay6nnvd4cexxxx</p>
         */
        public Builder target(String target) {
            this.putQueryParameter("target", target);
            this.target = target;
            return this;
        }

        /**
         * <p>The check method.</p>
         * 
         * <strong>example:</strong>
         * <p>ClusterUpgrade</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListClusterChecksRequest build() {
            return new ListClusterChecksRequest(this);
        } 

    } 

}
