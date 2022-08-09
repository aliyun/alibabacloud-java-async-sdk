// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeARMServerInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeARMServerInstancesResponseBody</p>
 */
public class DescribeARMServerInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Servers")
    private java.util.List < Servers> servers;

    private DescribeARMServerInstancesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.servers = builder.servers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeARMServerInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return servers
     */
    public java.util.List < Servers> getServers() {
        return this.servers;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Servers> servers; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Servers.
         */
        public Builder servers(java.util.List < Servers> servers) {
            this.servers = servers;
            return this;
        }

        public DescribeARMServerInstancesResponseBody build() {
            return new DescribeARMServerInstancesResponseBody(this);
        } 

    } 

    public static class NetworkAttributes extends TeaModel {
        @NameInMap("IpAddress")
        private String ipAddress;

        @NameInMap("NetworkId")
        private String networkId;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        private NetworkAttributes(Builder builder) {
            this.ipAddress = builder.ipAddress;
            this.networkId = builder.networkId;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkAttributes create() {
            return builder().build();
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return networkId
         */
        public String getNetworkId() {
            return this.networkId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private String ipAddress; 
            private String networkId; 
            private String vSwitchId; 

            /**
             * IpAddress.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * NetworkId.
             */
            public Builder networkId(String networkId) {
                this.networkId = networkId;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public NetworkAttributes build() {
                return new NetworkAttributes(this);
            } 

        } 

    }
    public static class AICInstances extends TeaModel {
        @NameInMap("Frequency")
        private Long frequency;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("NetworkAttributes")
        private NetworkAttributes networkAttributes;

        @NameInMap("Resolution")
        private String resolution;

        @NameInMap("Spec")
        private String spec;

        @NameInMap("State")
        private String state;

        @NameInMap("Status")
        private String status;

        private AICInstances(Builder builder) {
            this.frequency = builder.frequency;
            this.imageId = builder.imageId;
            this.instanceId = builder.instanceId;
            this.networkAttributes = builder.networkAttributes;
            this.resolution = builder.resolution;
            this.spec = builder.spec;
            this.state = builder.state;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AICInstances create() {
            return builder().build();
        }

        /**
         * @return frequency
         */
        public Long getFrequency() {
            return this.frequency;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return networkAttributes
         */
        public NetworkAttributes getNetworkAttributes() {
            return this.networkAttributes;
        }

        /**
         * @return resolution
         */
        public String getResolution() {
            return this.resolution;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long frequency; 
            private String imageId; 
            private String instanceId; 
            private NetworkAttributes networkAttributes; 
            private String resolution; 
            private String spec; 
            private String state; 
            private String status; 

            /**
             * Frequency.
             */
            public Builder frequency(Long frequency) {
                this.frequency = frequency;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * NetworkAttributes.
             */
            public Builder networkAttributes(NetworkAttributes networkAttributes) {
                this.networkAttributes = networkAttributes;
                return this;
            }

            /**
             * Resolution.
             */
            public Builder resolution(String resolution) {
                this.resolution = resolution;
                return this;
            }

            /**
             * Spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AICInstances build() {
                return new AICInstances(this);
            } 

        } 

    }
    public static class Servers extends TeaModel {
        @NameInMap("AICInstances")
        private java.util.List < AICInstances> AICInstances;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("EnsRegionId")
        private String ensRegionId;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("ServerId")
        private String serverId;

        @NameInMap("SpecName")
        private String specName;

        @NameInMap("State")
        private String state;

        @NameInMap("Status")
        private String status;

        private Servers(Builder builder) {
            this.AICInstances = builder.AICInstances;
            this.creationTime = builder.creationTime;
            this.ensRegionId = builder.ensRegionId;
            this.expiredTime = builder.expiredTime;
            this.serverId = builder.serverId;
            this.specName = builder.specName;
            this.state = builder.state;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Servers create() {
            return builder().build();
        }

        /**
         * @return AICInstances
         */
        public java.util.List < AICInstances> getAICInstances() {
            return this.AICInstances;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return serverId
         */
        public String getServerId() {
            return this.serverId;
        }

        /**
         * @return specName
         */
        public String getSpecName() {
            return this.specName;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < AICInstances> AICInstances; 
            private String creationTime; 
            private String ensRegionId; 
            private String expiredTime; 
            private String serverId; 
            private String specName; 
            private String state; 
            private String status; 

            /**
             * AICInstances.
             */
            public Builder AICInstances(java.util.List < AICInstances> AICInstances) {
                this.AICInstances = AICInstances;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * EnsRegionId.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * ServerId.
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * SpecName.
             */
            public Builder specName(String specName) {
                this.specName = specName;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Servers build() {
                return new Servers(this);
            } 

        } 

    }
}
