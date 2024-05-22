// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeARMServerInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeARMServerInstancesResponseBody</p>
 */
public class DescribeARMServerInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Servers")
    private java.util.List < Servers> servers;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the servers and the AIC instances.
         */
        public Builder servers(java.util.List < Servers> servers) {
            this.servers = servers;
            return this;
        }

        /**
         * The total number of entries returned.
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
        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        @com.aliyun.core.annotation.NameInMap("NetworkId")
        private String networkId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
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
             * The IP address of the AIC instance.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * The network ID of the AIC instance.
             */
            public Builder networkId(String networkId) {
                this.networkId = networkId;
                return this;
            }

            /**
             * The vSwitch ID of the AIC instance.
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
    public static class SdgDeployInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SDGId")
        private String SDGId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private SdgDeployInfo(Builder builder) {
            this.SDGId = builder.SDGId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SdgDeployInfo create() {
            return builder().build();
        }

        /**
         * @return SDGId
         */
        public String getSDGId() {
            return this.SDGId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String SDGId; 
            private String status; 

            /**
             * The ID of the SDG.
             */
            public Builder SDGId(String SDGId) {
                this.SDGId = SDGId;
                return this;
            }

            /**
             * The deployment status of the SDG. Valid values:
             * <p>
             * 
             * *   **sdg_deploying**
             * *   **failed**
             * *   **success**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SdgDeployInfo build() {
                return new SdgDeployInfo(this);
            } 

        } 

    }
    public static class AICInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Frequency")
        private Long frequency;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LatestAction")
        private String latestAction;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NetworkAttributes")
        private NetworkAttributes networkAttributes;

        @com.aliyun.core.annotation.NameInMap("Resolution")
        private String resolution;

        @com.aliyun.core.annotation.NameInMap("SdgDeployInfo")
        private SdgDeployInfo sdgDeployInfo;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private AICInstances(Builder builder) {
            this.frequency = builder.frequency;
            this.imageId = builder.imageId;
            this.instanceId = builder.instanceId;
            this.latestAction = builder.latestAction;
            this.name = builder.name;
            this.networkAttributes = builder.networkAttributes;
            this.resolution = builder.resolution;
            this.sdgDeployInfo = builder.sdgDeployInfo;
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
         * @return sdgDeployInfo
         */
        public SdgDeployInfo getSdgDeployInfo() {
            return this.sdgDeployInfo;
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
            private SdgDeployInfo sdgDeployInfo; 
            private String spec; 
            private String state; 
            private String status; 

            /**
             * The refresh rate of the AIC instance. Unit: Hz.
             */
            public Builder frequency(Long frequency) {
                this.frequency = frequency;
                return this;
            }

            /**
             * The ID of the AIC image.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The ID of the AIC instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The operation that was most recently performed.
             */
            public Builder latestAction(String latestAction) {
                this.latestAction = latestAction;
                return this;
            }

            /**
             * The name of the container.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The network attributes of the AIC instance.
             */
            public Builder networkAttributes(NetworkAttributes networkAttributes) {
                this.networkAttributes = networkAttributes;
                return this;
            }

            /**
             * The resolution of the AIC instance.
             */
            public Builder resolution(String resolution) {
                this.resolution = resolution;
                return this;
            }

            /**
             * The information about the shared data group (SDG) that is deployed on the AIC instance.
             */
            public Builder sdgDeployInfo(SdgDeployInfo sdgDeployInfo) {
                this.sdgDeployInfo = sdgDeployInfo;
                return this;
            }

            /**
             * The specification of the AIC instance.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * The operation status of the AIC instance. Valid values:
             * <p>
             * 
             * *   **success**
             * *   **failed**
             * *   **creating**
             * *   **releasing**
             * *   **rebooting**
             * *   **reseting**
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The running status of the AIC instance. Valid values:
             * <p>
             * 
             * *   **running**
             * *   **pending**
             * *   **terminating**
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
        @com.aliyun.core.annotation.NameInMap("AICInstances")
        private java.util.List < AICInstances> AICInstances;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("LatestAction")
        private String latestAction;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("ServerId")
        private String serverId;

        @com.aliyun.core.annotation.NameInMap("SpecName")
        private String specName;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * The information about the AIC instances.
             */
            public Builder AICInstances(java.util.List < AICInstances> AICInstances) {
                this.AICInstances = AICInstances;
                return this;
            }

            /**
             * The time when the instance was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The ID of the ENS node.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * The time when the instance expires.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The operation that was most recently performed.
             */
            public Builder latestAction(String latestAction) {
                this.latestAction = latestAction;
                return this;
            }

            /**
             * The name of the server.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The namespace of the cluster to which the server belongs.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The billing method.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The ID of the server.
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * The server specification.
             */
            public Builder specName(String specName) {
                this.specName = specName;
                return this;
            }

            /**
             * The operation status of the server. Valid values:
             * <p>
             * 
             * *   **success**
             * *   **failed**
             * *   **creating**
             * *   **releasing**
             * *   **rebooting**
             * *   **upgrading**
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The running status of the server. Valid values:
             * <p>
             * 
             * *   **running**
             * *   **stopping**
             * *   **down**
             * *   **starting**
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
