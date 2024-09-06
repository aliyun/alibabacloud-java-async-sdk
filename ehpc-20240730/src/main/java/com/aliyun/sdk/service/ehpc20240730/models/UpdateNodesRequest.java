// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateNodesRequest} extends {@link RequestModel}
 *
 * <p>UpdateNodesRequest</p>
 */
public class UpdateNodesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List < Instances> instances;

    private UpdateNodesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.instances = builder.instances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNodesRequest create() {
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
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
    }

    public static final class Builder extends Request.Builder<UpdateNodesRequest, Builder> {
        private String clusterId; 
        private java.util.List < Instances> instances; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNodesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.instances = request.instances;
        } 

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The information about the compute nodes that you want to update.
         */
        public Builder instances(java.util.List < Instances> instances) {
            String instancesShrink = shrink(instances, "Instances", "json");
            this.putQueryParameter("Instances", instancesShrink);
            this.instances = instances;
            return this;
        }

        @Override
        public UpdateNodesRequest build() {
            return new UpdateNodesRequest(this);
        } 

    } 

    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("KeepAlive")
        private Boolean keepAlive;

        private Instances(Builder builder) {
            this.instanceId = builder.instanceId;
            this.keepAlive = builder.keepAlive;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return keepAlive
         */
        public Boolean getKeepAlive() {
            return this.keepAlive;
        }

        public static final class Builder {
            private String instanceId; 
            private Boolean keepAlive; 

            /**
             * The instance ID of the compute node.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Specifies whether to enable deletion protection for the compute node.
             */
            public Builder keepAlive(Boolean keepAlive) {
                this.keepAlive = keepAlive;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
