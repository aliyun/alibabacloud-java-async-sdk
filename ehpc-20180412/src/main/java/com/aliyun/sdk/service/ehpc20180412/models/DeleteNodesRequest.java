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
 * {@link DeleteNodesRequest} extends {@link RequestModel}
 *
 * <p>DeleteNodesRequest</p>
 */
public class DeleteNodesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Instance")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Instance> instance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReleaseInstance")
    private Boolean releaseInstance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sync")
    private Boolean sync;

    private DeleteNodesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.instance = builder.instance;
        this.releaseInstance = builder.releaseInstance;
        this.sync = builder.sync;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNodesRequest create() {
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

    /**
     * @return releaseInstance
     */
    public Boolean getReleaseInstance() {
        return this.releaseInstance;
    }

    /**
     * @return sync
     */
    public Boolean getSync() {
        return this.sync;
    }

    public static final class Builder extends Request.Builder<DeleteNodesRequest, Builder> {
        private String clusterId; 
        private java.util.List<Instance> instance; 
        private Boolean releaseInstance; 
        private Boolean sync; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNodesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.instance = request.instance;
            this.releaseInstance = request.releaseInstance;
            this.sync = request.sync;
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

        /**
         * <p>Specifies whether to release the instances that are created by using E-HPC.</p>
         * <p>Default value: true</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder releaseInstance(Boolean releaseInstance) {
            this.putQueryParameter("ReleaseInstance", releaseInstance);
            this.releaseInstance = releaseInstance;
            return this;
        }

        /**
         * <p>Specifies whether to directly delete the node. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder sync(Boolean sync) {
            this.putQueryParameter("Sync", sync);
            this.sync = sync;
            return this;
        }

        @Override
        public DeleteNodesRequest build() {
            return new DeleteNodesRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeleteNodesRequest} extends {@link TeaModel}
     *
     * <p>DeleteNodesRequest</p>
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
             * <p>The ID of the compute node that you want to delete. Valid values of N: 1 to 100.</p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/87126.html">DescribeCluster</a> operation to query the IDs of the nodes in the cluster.</p>
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
