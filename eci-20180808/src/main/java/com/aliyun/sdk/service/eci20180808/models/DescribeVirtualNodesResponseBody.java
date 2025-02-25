// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVirtualNodesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVirtualNodesResponseBody</p>
 */
public class DescribeVirtualNodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VirtualNodes")
    private java.util.List < VirtualNodes> virtualNodes;

    private DescribeVirtualNodesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.virtualNodes = builder.virtualNodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVirtualNodesResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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

    /**
     * @return virtualNodes
     */
    public java.util.List < VirtualNodes> getVirtualNodes() {
        return this.virtualNodes;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < VirtualNodes> virtualNodes; 

        /**
         * <p>The token that determines the start point of the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>d78f2dd8-5979-42fe-****-b16db43be5bc</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9C9B9917-ED22-50D5-ADE6-9FA9D58AD05F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of virtual nodes that were queried.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The virtual nodes that were queried.</p>
         */
        public Builder virtualNodes(java.util.List < VirtualNodes> virtualNodes) {
            this.virtualNodes = virtualNodes;
            return this;
        }

        public DescribeVirtualNodesResponseBody build() {
            return new DescribeVirtualNodesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVirtualNodesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVirtualNodesResponseBody</p>
     */
    public static class Events extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("FirstTimestamp")
        private String firstTimestamp;

        @com.aliyun.core.annotation.NameInMap("LastTimestamp")
        private String lastTimestamp;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Events(Builder builder) {
            this.count = builder.count;
            this.firstTimestamp = builder.firstTimestamp;
            this.lastTimestamp = builder.lastTimestamp;
            this.message = builder.message;
            this.name = builder.name;
            this.reason = builder.reason;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return firstTimestamp
         */
        public String getFirstTimestamp() {
            return this.firstTimestamp;
        }

        /**
         * @return lastTimestamp
         */
        public String getLastTimestamp() {
            return this.lastTimestamp;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer count; 
            private String firstTimestamp; 
            private String lastTimestamp; 
            private String message; 
            private String name; 
            private String reason; 
            private String type; 

            /**
             * <p>The number of events.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The time when the event started.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-08T02:24:48Z</p>
             */
            public Builder firstTimestamp(String firstTimestamp) {
                this.firstTimestamp = firstTimestamp;
                return this;
            }

            /**
             * <p>The time when the event ended.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-08T02:24:52Z</p>
             */
            public Builder lastTimestamp(String lastTimestamp) {
                this.lastTimestamp = lastTimestamp;
                return this;
            }

            /**
             * <p>The message of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>Successfully</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The name of the object to which the event belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The name of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>Created</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The type of the event. Valid values:</p>
             * <ul>
             * <li>Normal</li>
             * <li>Warning</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVirtualNodesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVirtualNodesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            /**
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVirtualNodesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVirtualNodesResponseBody</p>
     */
    public static class VirtualNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Events")
        private java.util.List < Events> events;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("VirtualNodeId")
        private String virtualNodeId;

        @com.aliyun.core.annotation.NameInMap("VirtualNodeName")
        private String virtualNodeName;

        @com.aliyun.core.annotation.NameInMap("VirtualNodeSecurityGroupId")
        private String virtualNodeSecurityGroupId;

        @com.aliyun.core.annotation.NameInMap("VirtualNodeVSwitchId")
        private String virtualNodeVSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private VirtualNodes(Builder builder) {
            this.creationTime = builder.creationTime;
            this.events = builder.events;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.tags = builder.tags;
            this.virtualNodeId = builder.virtualNodeId;
            this.virtualNodeName = builder.virtualNodeName;
            this.virtualNodeSecurityGroupId = builder.virtualNodeSecurityGroupId;
            this.virtualNodeVSwitchId = builder.virtualNodeVSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VirtualNodes create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return events
         */
        public java.util.List < Events> getEvents() {
            return this.events;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return virtualNodeId
         */
        public String getVirtualNodeId() {
            return this.virtualNodeId;
        }

        /**
         * @return virtualNodeName
         */
        public String getVirtualNodeName() {
            return this.virtualNodeName;
        }

        /**
         * @return virtualNodeSecurityGroupId
         */
        public String getVirtualNodeSecurityGroupId() {
            return this.virtualNodeSecurityGroupId;
        }

        /**
         * @return virtualNodeVSwitchId
         */
        public String getVirtualNodeVSwitchId() {
            return this.virtualNodeVSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String creationTime; 
            private java.util.List < Events> events; 
            private String internetIp; 
            private String intranetIp; 
            private String regionId; 
            private String resourceGroupId; 
            private String status; 
            private java.util.List < Tags> tags; 
            private String virtualNodeId; 
            private String virtualNodeName; 
            private String virtualNodeSecurityGroupId; 
            private String virtualNodeVSwitchId; 
            private String vpcId; 

            /**
             * <p>The time when the virtual node was created. The time follows the RFC 3339 standard and is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-08T15:00:00Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The events about the virtual node.</p>
             */
            public Builder events(java.util.List < Events> events) {
                this.events = events;
                return this;
            }

            /**
             * <p>The public IP address of the virtual node.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address of the virtual node.</p>
             * 
             * <strong>example:</strong>
             * <p>10.19.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The ID of the region in which the virtual node resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the virtual node belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-uf66jeqopgqa9hdn****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The status of the virtual node. Valid values:</p>
             * <ul>
             * <li>Pending</li>
             * <li>Ready</li>
             * <li>Failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Ready</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags that are bound to the virtual node.</p>
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the virtual node.</p>
             * 
             * <strong>example:</strong>
             * <p>vnd-2ze960zkdqrldeaw****</p>
             */
            public Builder virtualNodeId(String virtualNodeId) {
                this.virtualNodeId = virtualNodeId;
                return this;
            }

            /**
             * <p>The name of the virtual node.</p>
             * 
             * <strong>example:</strong>
             * <p>testNode</p>
             */
            public Builder virtualNodeName(String virtualNodeName) {
                this.virtualNodeName = virtualNodeName;
                return this;
            }

            /**
             * <p>The ID of the security group to which the virtual node belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-2zeeyaaxlkq9sppl****</p>
             */
            public Builder virtualNodeSecurityGroupId(String virtualNodeSecurityGroupId) {
                this.virtualNodeSecurityGroupId = virtualNodeSecurityGroupId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch with which the virtual node is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-2ze23nqzig8inprou****</p>
             */
            public Builder virtualNodeVSwitchId(String virtualNodeVSwitchId) {
                this.virtualNodeVSwitchId = virtualNodeVSwitchId;
                return this;
            }

            /**
             * <p>The ID of the VPC to which the virtual node belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-1vzjjflab6wvjox****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public VirtualNodes build() {
                return new VirtualNodes(this);
            } 

        } 

    }
}
