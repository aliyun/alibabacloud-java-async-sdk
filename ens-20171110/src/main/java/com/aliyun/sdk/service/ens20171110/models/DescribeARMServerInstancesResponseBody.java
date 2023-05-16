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
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Servers")
    private java.util.List < Servers> servers;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeARMServerInstancesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.servers = builder.servers;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeARMServerInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List < Servers> servers; 
        private Integer totalCount; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

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

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
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

        @NameInMap("LatestAction")
        private String latestAction;

        @NameInMap("Name")
        private String name;

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
            this.latestAction = builder.latestAction;
            this.name = builder.name;
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
         * @return latestAction
         */
        public String getLatestAction() {
            return this.latestAction;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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
            private String latestAction; 
            private String name; 
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
             * LatestAction.
             */
            public Builder latestAction(String latestAction) {
                this.latestAction = latestAction;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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

        @NameInMap("LatestAction")
        private String latestAction;

        @NameInMap("Name")
        private String name;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("PayType")
        private String payType;

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
            this.latestAction = builder.latestAction;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.payType = builder.payType;
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
         * @return latestAction
         */
        public String getLatestAction() {
            return this.latestAction;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
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
            private String latestAction; 
            private String name; 
            private String namespace; 
            private String payType; 
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
             * LatestAction.
             */
            public Builder latestAction(String latestAction) {
                this.latestAction = latestAction;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * PayType.
             */
            public Builder payType(String payType) {
                this.payType = payType;
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
