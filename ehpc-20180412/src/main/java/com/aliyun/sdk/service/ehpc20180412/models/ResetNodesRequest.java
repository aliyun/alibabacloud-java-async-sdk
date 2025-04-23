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
 * {@link ResetNodesRequest} extends {@link RequestModel}
 *
 * <p>ResetNodesRequest</p>
 */
public class ResetNodesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Instance")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Instance> instance;

    private ResetNodesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.instance = builder.instance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetNodesRequest create() {
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
     * @return instance
     */
    public java.util.List<Instance> getInstance() {
        return this.instance;
    }

    public static final class Builder extends Request.Builder<ResetNodesRequest, Builder> {
        private String clusterId; 
        private java.util.List<Instance> instance; 

        private Builder() {
            super();
        } 

        private Builder(ResetNodesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.instance = request.instance;
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
        public Builder instance(java.util.List<Instance> instance) {
            this.putQueryParameter("Instance", instance);
            this.instance = instance;
            return this;
        }

        @Override
        public ResetNodesRequest build() {
            return new ResetNodesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ResetNodesRequest} extends {@link TeaModel}
     *
     * <p>ResetNodesRequest</p>
     */
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
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

            private Builder() {
            } 

            private Builder(Instance model) {
                this.id = model.id;
            } 

            /**
             * <p>The ID of the compute node that you want to reset. Valid values of N: 1 to 100</p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/87161.html">ListNodes</a> operation to query the IDs of the compute nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp13p7vlcb1uihfv****</p>
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
