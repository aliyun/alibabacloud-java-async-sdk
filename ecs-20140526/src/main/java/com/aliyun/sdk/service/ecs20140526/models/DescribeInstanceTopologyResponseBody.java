// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceTopologyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceTopologyResponseBody</p>
 */
public class DescribeInstanceTopologyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Topologys")
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

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Topologys.
         */
        public Builder topologys(Topologys topologys) {
            this.topologys = topologys;
            return this;
        }

        public DescribeInstanceTopologyResponseBody build() {
            return new DescribeInstanceTopologyResponseBody(this);
        } 

    } 

    public static class Topology extends TeaModel {
        @NameInMap("HostId")
        private String hostId;

        @NameInMap("InstanceId")
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

            /**
             * HostId.
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * InstanceId.
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
    public static class Topologys extends TeaModel {
        @NameInMap("Topology")
        private java.util.List < Topology> topology;

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
        public java.util.List < Topology> getTopology() {
            return this.topology;
        }

        public static final class Builder {
            private java.util.List < Topology> topology; 

            /**
             * Topology.
             */
            public Builder topology(java.util.List < Topology> topology) {
                this.topology = topology;
                return this;
            }

            public Topologys build() {
                return new Topologys(this);
            } 

        } 

    }
}
