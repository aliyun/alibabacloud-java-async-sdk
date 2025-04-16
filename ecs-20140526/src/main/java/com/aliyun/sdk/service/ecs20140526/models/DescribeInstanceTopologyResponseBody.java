// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeInstanceTopologyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceTopologyResponseBody</p>
 */
public class DescribeInstanceTopologyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Topologys")
    private Topologys topologys;

    private DescribeInstanceTopologyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.topologys = builder.topologys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceTopologyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return topologys
     */
    public Topologys getTopologys() {
        return this.topologys;
    }

    public static final class Builder {
        private String requestId; 
        private Topologys topologys; 

        private Builder() {
        } 

        private Builder(DescribeInstanceTopologyResponseBody model) {
            this.requestId = model.requestId;
            this.topologys = model.topologys;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Details about the topology.</p>
         */
        public Builder topologys(Topologys topologys) {
            this.topologys = topologys;
            return this;
        }

        public DescribeInstanceTopologyResponseBody build() {
            return new DescribeInstanceTopologyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTopologyResponseBody</p>
     */
    public static class Topology extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HostId")
        private String hostId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private Topology(Builder builder) {
            this.hostId = builder.hostId;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Topology create() {
            return builder().build();
        }

        /**
         * @return hostId
         */
        public String getHostId() {
            return this.hostId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String hostId; 
            private String instanceId; 

            private Builder() {
            } 

            private Builder(Topology model) {
                this.hostId = model.hostId;
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>The ID of the host where the ECS instance resides. This parameter is encrypted and cannot match the ID of the ECS instance. However, if the values of this parameter for different ECS instances are the same, the ECS instances reside on the same host.</p>
             * 
             * <strong>example:</strong>
             * <p>ZWNobyBo****</p>
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp67acfmxazb4p****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public Topology build() {
                return new Topology(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceTopologyResponseBody</p>
     */
    public static class Topologys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Topology")
        private java.util.List<Topology> topology;

        private Topologys(Builder builder) {
            this.topology = builder.topology;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Topologys create() {
            return builder().build();
        }

        /**
         * @return topology
         */
        public java.util.List<Topology> getTopology() {
            return this.topology;
        }

        public static final class Builder {
            private java.util.List<Topology> topology; 

            private Builder() {
            } 

            private Builder(Topologys model) {
                this.topology = model.topology;
            } 

            /**
             * Topology.
             */
            public Builder topology(java.util.List<Topology> topology) {
                this.topology = topology;
                return this;
            }

            public Topologys build() {
                return new Topologys(this);
            } 

        } 

    }
}
