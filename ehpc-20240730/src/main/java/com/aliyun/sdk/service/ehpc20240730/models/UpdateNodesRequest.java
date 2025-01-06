// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

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
    private java.util.List<Instances> instances;

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
    public java.util.List<Instances> getInstances() {
        return this.instances;
    }

    public static final class Builder extends Request.Builder<UpdateNodesRequest, Builder> {
        private String clusterId; 
        private java.util.List<Instances> instances; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNodesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.instances = request.instances;
        } 

        /**
         * <p>The cluster ID.</p>
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
         * <p>The information about the compute nodes that you want to update.</p>
         */
        public Builder instances(java.util.List<Instances> instances) {
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

    /**
     * 
     * {@link UpdateNodesRequest} extends {@link TeaModel}
     *
     * <p>UpdateNodesRequest</p>
     */
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
             * <p>The instance ID of the compute node.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1bzqq1ddeemuddn****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Specifies whether to enable deletion protection for the compute node.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
