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
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * NodeModel.
         */
        public Builder nodeModel(java.util.List<NodeModel> nodeModel) {
            this.nodeModel = nodeModel;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
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
    public static class NodeModel extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("NetworkId")
        private String networkId;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("PhoneCount")
        private Integer phoneCount;

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
            this.chargeType = builder.chargeType;
            this.cpu = builder.cpu;
            this.gmtCreate = builder.gmtCreate;
            this.gmtExpired = builder.gmtExpired;
            this.gmtModified = builder.gmtModified;
            this.memory = builder.memory;
            this.networkId = builder.networkId;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.phoneCount = builder.phoneCount;
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
            private String chargeType; 
            private String cpu; 
            private String gmtCreate; 
            private String gmtExpired; 
            private String gmtModified; 
            private Integer memory; 
            private String networkId; 
            private String nodeId; 
            private String nodeName; 
            private Integer phoneCount; 
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
                this.chargeType = model.chargeType;
                this.cpu = model.cpu;
                this.gmtCreate = model.gmtCreate;
                this.gmtExpired = model.gmtExpired;
                this.gmtModified = model.gmtModified;
                this.memory = model.memory;
                this.networkId = model.networkId;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.phoneCount = model.phoneCount;
                this.regionId = model.regionId;
                this.resolutionHeight = model.resolutionHeight;
                this.resolutionWidth = model.resolutionWidth;
                this.serverType = model.serverType;
                this.shareDataVolume = model.shareDataVolume;
                this.status = model.status;
                this.vSwitchId = model.vSwitchId;
            } 

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * Cpu.
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtExpired.
             */
            public Builder gmtExpired(String gmtExpired) {
                this.gmtExpired = gmtExpired;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
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
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * PhoneCount.
             */
            public Builder phoneCount(Integer phoneCount) {
                this.phoneCount = phoneCount;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResolutionHeight.
             */
            public Builder resolutionHeight(Integer resolutionHeight) {
                this.resolutionHeight = resolutionHeight;
                return this;
            }

            /**
             * ResolutionWidth.
             */
            public Builder resolutionWidth(Integer resolutionWidth) {
                this.resolutionWidth = resolutionWidth;
                return this;
            }

            /**
             * ServerType.
             */
            public Builder serverType(String serverType) {
                this.serverType = serverType;
                return this;
            }

            /**
             * ShareDataVolume.
             */
            public Builder shareDataVolume(Integer shareDataVolume) {
                this.shareDataVolume = shareDataVolume;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VSwitchId.
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
