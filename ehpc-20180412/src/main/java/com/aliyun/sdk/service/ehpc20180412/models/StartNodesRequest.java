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
 * {@link StartNodesRequest} extends {@link RequestModel}
 *
 * <p>StartNodesRequest</p>
 */
public class StartNodesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Instance")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Instance> instance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Role")
    private String role;

    private StartNodesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.instance = builder.instance;
        this.role = builder.role;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartNodesRequest create() {
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
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    public static final class Builder extends Request.Builder<StartNodesRequest, Builder> {
        private String clusterId; 
        private java.util.List<Instance> instance; 
        private String role; 

        private Builder() {
            super();
        } 

        private Builder(StartNodesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.instance = request.instance;
            this.role = request.role;
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
         * <p>The role of the node. Valid values:</p>
         * <ul>
         * <li>Manager: management node</li>
         * <li>Login: logon node</li>
         * <li>Compute: compute node</li>
         * </ul>
         * <p>Default value: Compute</p>
         * 
         * <strong>example:</strong>
         * <p>Compute</p>
         */
        public Builder role(String role) {
            this.putQueryParameter("Role", role);
            this.role = role;
            return this;
        }

        @Override
        public StartNodesRequest build() {
            return new StartNodesRequest(this);
        } 

    } 

    /**
     * 
     * {@link StartNodesRequest} extends {@link TeaModel}
     *
     * <p>StartNodesRequest</p>
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
             * <p>The ID of the Nth node. Valid values of N: 1 to 100.</p>
             * <p>Make sure that the node is in the Stopped state. You can call the <a href="https://help.aliyun.com/document_detail/87161.html">ListNodes</a> operation to query the status of the node.</p>
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
