// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DescribeCloudPhoneNodesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudPhoneNodesResponseBody</p>
 */
public class DescribeCloudPhoneNodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("NodeModel")
    private java.util.List<NodeModel> nodeModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCloudPhoneNodesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.nodeModel = builder.nodeModel;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudPhoneNodesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return nodeModel
     */
    public java.util.List<NodeModel> getNodeModel() {
        return this.nodeModel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<NodeModel> nodeModel; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeCloudPhoneNodesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.nodeModel = model.nodeModel;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The maximum number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * </ul>
         * <hr>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kU+SQXzm0H9mu/FiSc****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The matrixes.</p>
         */
        public Builder nodeModel(java.util.List<NodeModel> nodeModel) {
            this.nodeModel = nodeModel;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F07A1DA1-E1EB-5CCA-8EED-12F85D32****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of cloud phone instances.</p>
         * 
         * <strong>example:</strong>
         * <p>31</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCloudPhoneNodesResponseBody build() {
            return new DescribeCloudPhoneNodesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCloudPhoneNodesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudPhoneNodesResponseBody</p>
     */
    public static class BizTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private BizTags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizTags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(BizTags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public BizTags build() {
                return new BizTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudPhoneNodesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudPhoneNodesResponseBody</p>
     */
    public static class NetworkInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BandwidthPackageId")
        private String bandwidthPackageId;

        @com.aliyun.core.annotation.NameInMap("BandwidthPackageType")
        private String bandwidthPackageType;

        @com.aliyun.core.annotation.NameInMap("NetworkId")
        private String networkId;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        private NetworkInfos(Builder builder) {
            this.bandwidthPackageId = builder.bandwidthPackageId;
            this.bandwidthPackageType = builder.bandwidthPackageType;
            this.networkId = builder.networkId;
            this.networkType = builder.networkType;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInfos create() {
            return builder().build();
        }

        /**
         * @return bandwidthPackageId
         */
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        /**
         * @return bandwidthPackageType
         */
        public String getBandwidthPackageType() {
            return this.bandwidthPackageType;
        }

        /**
         * @return networkId
         */
        public String getNetworkId() {
            return this.networkId;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private String bandwidthPackageId; 
            private String bandwidthPackageType; 
            private String networkId; 
            private String networkType; 
            private String vSwitchId; 

            private Builder() {
            } 

            private Builder(NetworkInfos model) {
                this.bandwidthPackageId = model.bandwidthPackageId;
                this.bandwidthPackageType = model.bandwidthPackageType;
                this.networkId = model.networkId;
                this.networkType = model.networkType;
                this.vSwitchId = model.vSwitchId;
            } 

            /**
             * BandwidthPackageId.
             */
            public Builder bandwidthPackageId(String bandwidthPackageId) {
                this.bandwidthPackageId = bandwidthPackageId;
                return this;
            }

            /**
             * BandwidthPackageType.
             */
            public Builder bandwidthPackageType(String bandwidthPackageType) {
                this.bandwidthPackageType = bandwidthPackageType;
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
             * NetworkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public NetworkInfos build() {
                return new NetworkInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudPhoneNodesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudPhoneNodesResponseBody</p>
     */
    public static class PhoneDataInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PhoneDataId")
        private String phoneDataId;

        @com.aliyun.core.annotation.NameInMap("PhoneDataVolume")
        private Integer phoneDataVolume;

        private PhoneDataInfo(Builder builder) {
            this.phoneDataId = builder.phoneDataId;
            this.phoneDataVolume = builder.phoneDataVolume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PhoneDataInfo create() {
            return builder().build();
        }

        /**
         * @return phoneDataId
         */
        public String getPhoneDataId() {
            return this.phoneDataId;
        }

        /**
         * @return phoneDataVolume
         */
        public Integer getPhoneDataVolume() {
            return this.phoneDataVolume;
        }

        public static final class Builder {
            private String phoneDataId; 
            private Integer phoneDataVolume; 

            private Builder() {
            } 

            private Builder(PhoneDataInfo model) {
                this.phoneDataId = model.phoneDataId;
                this.phoneDataVolume = model.phoneDataVolume;
            } 

            /**
             * PhoneDataId.
             */
            public Builder phoneDataId(String phoneDataId) {
                this.phoneDataId = phoneDataId;
                return this;
            }

            /**
             * PhoneDataVolume.
             */
            public Builder phoneDataVolume(Integer phoneDataVolume) {
                this.phoneDataVolume = phoneDataVolume;
                return this;
            }

            public PhoneDataInfo build() {
                return new PhoneDataInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudPhoneNodesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudPhoneNodesResponseBody</p>
     */
    public static class NodeModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BandwidthPackageId")
        private String bandwidthPackageId;

        @com.aliyun.core.annotation.NameInMap("BandwidthPackageStatus")
        private String bandwidthPackageStatus;

        @com.aliyun.core.annotation.NameInMap("BandwidthPackageType")
        private String bandwidthPackageType;

        @com.aliyun.core.annotation.NameInMap("BizTags")
        private java.util.List<BizTags> bizTags;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtExpired")
        private String gmtExpired;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("NetworkId")
        private String networkId;

        @com.aliyun.core.annotation.NameInMap("NetworkInfos")
        private java.util.List<NetworkInfos> networkInfos;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("PhoneCount")
        private Integer phoneCount;

        @com.aliyun.core.annotation.NameInMap("PhoneDataInfo")
        private PhoneDataInfo phoneDataInfo;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResolutionHeight")
        private Integer resolutionHeight;

        @com.aliyun.core.annotation.NameInMap("ResolutionWidth")
        private Integer resolutionWidth;

        @com.aliyun.core.annotation.NameInMap("ServerType")
        private String serverType;

        @com.aliyun.core.annotation.NameInMap("ShareDataVolume")
        private Integer shareDataVolume;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        private NodeModel(Builder builder) {
            this.bandwidthPackageId = builder.bandwidthPackageId;
            this.bandwidthPackageStatus = builder.bandwidthPackageStatus;
            this.bandwidthPackageType = builder.bandwidthPackageType;
            this.bizTags = builder.bizTags;
            this.chargeType = builder.chargeType;
            this.cpu = builder.cpu;
            this.gmtCreate = builder.gmtCreate;
            this.gmtExpired = builder.gmtExpired;
            this.gmtModified = builder.gmtModified;
            this.instanceType = builder.instanceType;
            this.memory = builder.memory;
            this.networkId = builder.networkId;
            this.networkInfos = builder.networkInfos;
            this.networkType = builder.networkType;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.phoneCount = builder.phoneCount;
            this.phoneDataInfo = builder.phoneDataInfo;
            this.regionId = builder.regionId;
            this.resolutionHeight = builder.resolutionHeight;
            this.resolutionWidth = builder.resolutionWidth;
            this.serverType = builder.serverType;
            this.shareDataVolume = builder.shareDataVolume;
            this.status = builder.status;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeModel create() {
            return builder().build();
        }

        /**
         * @return bandwidthPackageId
         */
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        /**
         * @return bandwidthPackageStatus
         */
        public String getBandwidthPackageStatus() {
            return this.bandwidthPackageStatus;
        }

        /**
         * @return bandwidthPackageType
         */
        public String getBandwidthPackageType() {
            return this.bandwidthPackageType;
        }

        /**
         * @return bizTags
         */
        public java.util.List<BizTags> getBizTags() {
            return this.bizTags;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return cpu
         */
        public String getCpu() {
            return this.cpu;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtExpired
         */
        public String getGmtExpired() {
            return this.gmtExpired;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return networkId
         */
        public String getNetworkId() {
            return this.networkId;
        }

        /**
         * @return networkInfos
         */
        public java.util.List<NetworkInfos> getNetworkInfos() {
            return this.networkInfos;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return phoneCount
         */
        public Integer getPhoneCount() {
            return this.phoneCount;
        }

        /**
         * @return phoneDataInfo
         */
        public PhoneDataInfo getPhoneDataInfo() {
            return this.phoneDataInfo;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resolutionHeight
         */
        public Integer getResolutionHeight() {
            return this.resolutionHeight;
        }

        /**
         * @return resolutionWidth
         */
        public Integer getResolutionWidth() {
            return this.resolutionWidth;
        }

        /**
         * @return serverType
         */
        public String getServerType() {
            return this.serverType;
        }

        /**
         * @return shareDataVolume
         */
        public Integer getShareDataVolume() {
            return this.shareDataVolume;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private String bandwidthPackageId; 
            private String bandwidthPackageStatus; 
            private String bandwidthPackageType; 
            private java.util.List<BizTags> bizTags; 
            private String chargeType; 
            private String cpu; 
            private String gmtCreate; 
            private String gmtExpired; 
            private String gmtModified; 
            private String instanceType; 
            private Integer memory; 
            private String networkId; 
            private java.util.List<NetworkInfos> networkInfos; 
            private String networkType; 
            private String nodeId; 
            private String nodeName; 
            private Integer phoneCount; 
            private PhoneDataInfo phoneDataInfo; 
            private String regionId; 
            private Integer resolutionHeight; 
            private Integer resolutionWidth; 
            private String serverType; 
            private Integer shareDataVolume; 
            private String status; 
            private String vSwitchId; 

            private Builder() {
            } 

            private Builder(NodeModel model) {
                this.bandwidthPackageId = model.bandwidthPackageId;
                this.bandwidthPackageStatus = model.bandwidthPackageStatus;
                this.bandwidthPackageType = model.bandwidthPackageType;
                this.bizTags = model.bizTags;
                this.chargeType = model.chargeType;
                this.cpu = model.cpu;
                this.gmtCreate = model.gmtCreate;
                this.gmtExpired = model.gmtExpired;
                this.gmtModified = model.gmtModified;
                this.instanceType = model.instanceType;
                this.memory = model.memory;
                this.networkId = model.networkId;
                this.networkInfos = model.networkInfos;
                this.networkType = model.networkType;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.phoneCount = model.phoneCount;
                this.phoneDataInfo = model.phoneDataInfo;
                this.regionId = model.regionId;
                this.resolutionHeight = model.resolutionHeight;
                this.resolutionWidth = model.resolutionWidth;
                this.serverType = model.serverType;
                this.shareDataVolume = model.shareDataVolume;
                this.status = model.status;
                this.vSwitchId = model.vSwitchId;
            } 

            /**
             * BandwidthPackageId.
             */
            public Builder bandwidthPackageId(String bandwidthPackageId) {
                this.bandwidthPackageId = bandwidthPackageId;
                return this;
            }

            /**
             * BandwidthPackageStatus.
             */
            public Builder bandwidthPackageStatus(String bandwidthPackageStatus) {
                this.bandwidthPackageStatus = bandwidthPackageStatus;
                return this;
            }

            /**
             * BandwidthPackageType.
             */
            public Builder bandwidthPackageType(String bandwidthPackageType) {
                this.bandwidthPackageType = bandwidthPackageType;
                return this;
            }

            /**
             * BizTags.
             */
            public Builder bizTags(java.util.List<BizTags> bizTags) {
                this.bizTags = bizTags;
                return this;
            }

            /**
             * <p>The billing method.</p>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-13 02:03:14</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The expiration time of the subscription matrix.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-09 02:00:34</p>
             */
            public Builder gmtExpired(String gmtExpired) {
                this.gmtExpired = gmtExpired;
                return this;
            }

            /**
             * <p>The last modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-02-13 02:03:14</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The memory size. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The network ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-5mwr9azebliva****</p>
             */
            public Builder networkId(String networkId) {
                this.networkId = networkId;
                return this;
            }

            /**
             * NetworkInfos.
             */
            public Builder networkInfos(java.util.List<NetworkInfos> networkInfos) {
                this.networkInfos = networkInfos;
                return this;
            }

            /**
             * NetworkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The matrix ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cpn-ehs0yoedq8ntm****</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The matrix name.</p>
             * 
             * <strong>example:</strong>
             * <p>node_name</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The number of cloud phone instances per matrix.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder phoneCount(Integer phoneCount) {
                this.phoneCount = phoneCount;
                return this;
            }

            /**
             * PhoneDataInfo.
             */
            public Builder phoneDataInfo(PhoneDataInfo phoneDataInfo) {
                this.phoneDataInfo = phoneDataInfo;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The height of the resolution. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>1280</p>
             */
            public Builder resolutionHeight(Integer resolutionHeight) {
                this.resolutionHeight = resolutionHeight;
                return this;
            }

            /**
             * <p>The width of the resolution. Unit: pixel.</p>
             * 
             * <strong>example:</strong>
             * <p>720</p>
             */
            public Builder resolutionWidth(Integer resolutionWidth) {
                this.resolutionWidth = resolutionWidth;
                return this;
            }

            /**
             * <p>The matrix specification.</p>
             * 
             * <strong>example:</strong>
             * <p>cpm.gn6.gx1</p>
             */
            public Builder serverType(String serverType) {
                this.serverType = serverType;
                return this;
            }

            /**
             * <p>The size of the shared storage. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder shareDataVolume(Integer shareDataVolume) {
                this.shareDataVolume = shareDataVolume;
                return this;
            }

            /**
             * <p>The matrix status.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-2zeekryyc1q3sm72l****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public NodeModel build() {
                return new NodeModel(this);
            } 

        } 

    }
}
