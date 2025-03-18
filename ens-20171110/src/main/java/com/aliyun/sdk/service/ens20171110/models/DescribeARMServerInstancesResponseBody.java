// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
    private java.util.List<Servers> servers;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Servers> getServers() {
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
        private java.util.List<Servers> servers; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeARMServerInstancesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.servers = model.servers;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the servers and the AIC instances.</p>
         */
        public Builder servers(java.util.List<Servers> servers) {
            this.servers = servers;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeARMServerInstancesResponseBody build() {
            return new DescribeARMServerInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeARMServerInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeARMServerInstancesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(NetworkAttributes model) {
                this.ipAddress = model.ipAddress;
                this.networkId = model.networkId;
                this.vSwitchId = model.vSwitchId;
            } 

            /**
             * <p>The IP address of the AIC instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * <p>The network ID of the AIC instance.</p>
             * 
             * <strong>example:</strong>
             * <p>n-*****</p>
             */
            public Builder networkId(String networkId) {
                this.networkId = networkId;
                return this;
            }

            /**
             * <p>The vSwitch ID of the AIC instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-****</p>
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
    /**
     * 
     * {@link DescribeARMServerInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeARMServerInstancesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(SdgDeployInfo model) {
                this.SDGId = model.SDGId;
                this.status = model.status;
            } 

            /**
             * <p>The ID of the SDG.</p>
             * 
             * <strong>example:</strong>
             * <p>sdg-xxxxx</p>
             */
            public Builder SDGId(String SDGId) {
                this.SDGId = SDGId;
                return this;
            }

            /**
             * <p>The deployment status of the SDG. Valid values:</p>
             * <ul>
             * <li><strong>sdg_deploying</strong></li>
             * <li><strong>failed</strong></li>
             * <li><strong>success</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
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
    /**
     * 
     * {@link DescribeARMServerInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeARMServerInstancesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(AICInstances model) {
                this.frequency = model.frequency;
                this.imageId = model.imageId;
                this.instanceId = model.instanceId;
                this.latestAction = model.latestAction;
                this.name = model.name;
                this.networkAttributes = model.networkAttributes;
                this.resolution = model.resolution;
                this.sdgDeployInfo = model.sdgDeployInfo;
                this.spec = model.spec;
                this.state = model.state;
                this.status = model.status;
            } 

            /**
             * <p>The refresh rate of the AIC instance. Unit: Hz.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder frequency(Long frequency) {
                this.frequency = frequency;
                return this;
            }

            /**
             * <p>The ID of the AIC image.</p>
             * 
             * <strong>example:</strong>
             * <p>m-****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The ID of the AIC instance.</p>
             * 
             * <strong>example:</strong>
             * <p>aic-instance****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The operation that was most recently performed.</p>
             * 
             * <strong>example:</strong>
             * <p>ServerCreate</p>
             */
            public Builder latestAction(String latestAction) {
                this.latestAction = latestAction;
                return this;
            }

            /**
             * <p>The name of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>AIC-Name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The network attributes of the AIC instance.</p>
             */
            public Builder networkAttributes(NetworkAttributes networkAttributes) {
                this.networkAttributes = networkAttributes;
                return this;
            }

            /**
             * <p>The resolution of the AIC instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1920*1080</p>
             */
            public Builder resolution(String resolution) {
                this.resolution = resolution;
                return this;
            }

            /**
             * <p>The information about the shared data group (SDG) that is deployed on the AIC instance.</p>
             */
            public Builder sdgDeployInfo(SdgDeployInfo sdgDeployInfo) {
                this.sdgDeployInfo = sdgDeployInfo;
                return this;
            }

            /**
             * <p>The specification of the AIC instance.</p>
             * 
             * <strong>example:</strong>
             * <p>aic.cf53r.c2.np</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The operation status of the AIC instance. Valid values:</p>
             * <ul>
             * <li><strong>success</strong></li>
             * <li><strong>failed</strong></li>
             * <li><strong>creating</strong></li>
             * <li><strong>releasing</strong></li>
             * <li><strong>rebooting</strong></li>
             * <li><strong>reseting</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The running status of the AIC instance. Valid values:</p>
             * <ul>
             * <li><strong>running</strong></li>
             * <li><strong>pending</strong></li>
             * <li><strong>terminating</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
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
    /**
     * 
     * {@link DescribeARMServerInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeARMServerInstancesResponseBody</p>
     */
    public static class Servers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AICInstances")
        private java.util.List<AICInstances> AICInstances;

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
        public java.util.List<AICInstances> getAICInstances() {
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
            private java.util.List<AICInstances> AICInstances; 
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

            private Builder() {
            } 

            private Builder(Servers model) {
                this.AICInstances = model.AICInstances;
                this.creationTime = model.creationTime;
                this.ensRegionId = model.ensRegionId;
                this.expiredTime = model.expiredTime;
                this.latestAction = model.latestAction;
                this.name = model.name;
                this.namespace = model.namespace;
                this.payType = model.payType;
                this.serverId = model.serverId;
                this.specName = model.specName;
                this.state = model.state;
                this.status = model.status;
            } 

            /**
             * <p>The information about the AIC instances.</p>
             */
            public Builder AICInstances(java.util.List<AICInstances> AICInstances) {
                this.AICInstances = AICInstances;
                return this;
            }

            /**
             * <p>The time when the instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-07 11:59:09</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ID of the ENS node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hanghzou-27</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>The time when the instance expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2027-05-07 11:59:09</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The operation that was most recently performed.</p>
             * 
             * <strong>example:</strong>
             * <p>ServerCreate</p>
             */
            public Builder latestAction(String latestAction) {
                this.latestAction = latestAction;
                return this;
            }

            /**
             * <p>The name of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>Server-Name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace of the cluster to which the server belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The billing method.</p>
             * 
             * <strong>example:</strong>
             * <p>prepay</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The ID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>cas-******</p>
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * <p>The server specification.</p>
             * 
             * <strong>example:</strong>
             * <p>cas.cf53r</p>
             */
            public Builder specName(String specName) {
                this.specName = specName;
                return this;
            }

            /**
             * <p>The operation status of the server. Valid values:</p>
             * <ul>
             * <li><strong>success</strong></li>
             * <li><strong>failed</strong></li>
             * <li><strong>creating</strong></li>
             * <li><strong>releasing</strong></li>
             * <li><strong>rebooting</strong></li>
             * <li><strong>upgrading</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The running status of the server. Valid values:</p>
             * <ul>
             * <li><strong>running</strong></li>
             * <li><strong>stopping</strong></li>
             * <li><strong>down</strong></li>
             * <li><strong>starting</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
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
