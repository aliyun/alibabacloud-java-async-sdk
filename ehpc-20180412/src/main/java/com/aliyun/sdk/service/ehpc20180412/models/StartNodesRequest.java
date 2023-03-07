// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartNodesRequest} extends {@link RequestModel}
 *
 * <p>StartNodesRequest</p>
 */
public class StartNodesRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Instance")
    @Validation(required = true)
    private java.util.List < Instance> instance;

    @Query
    @NameInMap("Role")
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
    public java.util.List < Instance> getInstance() {
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
        private java.util.List < Instance> instance; 
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
         * The ID of the cluster.
         * <p>
         * 
         * You can call the [ListClusters](~~87116~~) operation to query the cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Instance.
         */
        public Builder instance(java.util.List < Instance> instance) {
            this.putQueryParameter("Instance", instance);
            this.instance = instance;
            return this;
        }

        /**
         * The role of the node. Valid values:
         * <p>
         * 
         * *   Manager: management node
         * *   Login: logon node
         * *   Compute: compute node
         * 
         * Default value: Compute
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

    public static class Instance extends TeaModel {
        @NameInMap("Id")
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

            /**
             * The ID of the Nth node. Valid values of N: 1 to 100.
             * <p>
             * 
             * Make sure that the node is in the Stopped state. You can call the [ListNodes](~~87161~~) operation to query the status of the node.
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
