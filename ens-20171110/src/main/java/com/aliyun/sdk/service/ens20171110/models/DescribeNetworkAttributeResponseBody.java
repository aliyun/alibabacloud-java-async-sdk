// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNetworkAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkAttributeResponseBody</p>
 */
public class DescribeNetworkAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CidrBlock")
    private String cidrBlock;

    @com.aliyun.core.annotation.NameInMap("CloudResources")
    private CloudResources cloudResources;

    @com.aliyun.core.annotation.NameInMap("CreatedTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    private String ensRegionId;

    @com.aliyun.core.annotation.NameInMap("NetworkAclId")
    private String networkAclId;

    @com.aliyun.core.annotation.NameInMap("NetworkId")
    private String networkId;

    @com.aliyun.core.annotation.NameInMap("NetworkName")
    private String networkName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouterTableId")
    private String routerTableId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("VSwitchIds")
    private VSwitchIds vSwitchIds;

    private DescribeNetworkAttributeResponseBody(Builder builder) {
        this.cidrBlock = builder.cidrBlock;
        this.cloudResources = builder.cloudResources;
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.ensRegionId = builder.ensRegionId;
        this.networkAclId = builder.networkAclId;
        this.networkId = builder.networkId;
        this.networkName = builder.networkName;
        this.requestId = builder.requestId;
        this.routerTableId = builder.routerTableId;
        this.status = builder.status;
        this.vSwitchIds = builder.vSwitchIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return cidrBlock
     */
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * @return cloudResources
     */
    public CloudResources getCloudResources() {
        return this.cloudResources;
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return networkAclId
     */
    public String getNetworkAclId() {
        return this.networkAclId;
    }

    /**
     * @return networkId
     */
    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * @return networkName
     */
    public String getNetworkName() {
        return this.networkName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return routerTableId
     */
    public String getRouterTableId() {
        return this.routerTableId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return vSwitchIds
     */
    public VSwitchIds getVSwitchIds() {
        return this.vSwitchIds;
    }

    public static final class Builder {
        private String cidrBlock; 
        private CloudResources cloudResources; 
        private String createdTime; 
        private String description; 
        private String ensRegionId; 
        private String networkAclId; 
        private String networkId; 
        private String networkName; 
        private String requestId; 
        private String routerTableId; 
        private String status; 
        private VSwitchIds vSwitchIds; 

        /**
         * The IPv4 CIDR block of the network.
         */
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * The list of resources in the network.
         */
        public Builder cloudResources(CloudResources cloudResources) {
            this.cloudResources = cloudResources;
            return this;
        }

        /**
         * The time when the network was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * The description of the network.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The ID of the edge node.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * The ID of the network access control list (ACL).
         */
        public Builder networkAclId(String networkAclId) {
            this.networkAclId = networkAclId;
            return this;
        }

        /**
         * The ID of the network.
         */
        public Builder networkId(String networkId) {
            this.networkId = networkId;
            return this;
        }

        /**
         * The name of the network.
         */
        public Builder networkName(String networkName) {
            this.networkName = networkName;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the route table.
         */
        public Builder routerTableId(String routerTableId) {
            this.routerTableId = routerTableId;
            return this;
        }

        /**
         * The status of the network. Valid values:
         * <p>
         * 
         * *   Pending
         * *   Available
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The list of vSwitches in the network.
         */
        public Builder vSwitchIds(VSwitchIds vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        public DescribeNetworkAttributeResponseBody build() {
            return new DescribeNetworkAttributeResponseBody(this);
        } 

    } 

    public static class CloudResourceSetType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceCount")
        private Integer resourceCount;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private CloudResourceSetType(Builder builder) {
            this.resourceCount = builder.resourceCount;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudResourceSetType create() {
            return builder().build();
        }

        /**
         * @return resourceCount
         */
        public Integer getResourceCount() {
            return this.resourceCount;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private Integer resourceCount; 
            private String resourceType; 

            /**
             * The number of resources in the network.
             */
            public Builder resourceCount(Integer resourceCount) {
                this.resourceCount = resourceCount;
                return this;
            }

            /**
             * The resource type. VSwitch.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public CloudResourceSetType build() {
                return new CloudResourceSetType(this);
            } 

        } 

    }
    public static class CloudResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CloudResourceSetType")
        private java.util.List < CloudResourceSetType> cloudResourceSetType;

        private CloudResources(Builder builder) {
            this.cloudResourceSetType = builder.cloudResourceSetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudResources create() {
            return builder().build();
        }

        /**
         * @return cloudResourceSetType
         */
        public java.util.List < CloudResourceSetType> getCloudResourceSetType() {
            return this.cloudResourceSetType;
        }

        public static final class Builder {
            private java.util.List < CloudResourceSetType> cloudResourceSetType; 

            /**
             * CloudResourceSetType.
             */
            public Builder cloudResourceSetType(java.util.List < CloudResourceSetType> cloudResourceSetType) {
                this.cloudResourceSetType = cloudResourceSetType;
                return this;
            }

            public CloudResources build() {
                return new CloudResources(this);
            } 

        } 

    }
    public static class VSwitchIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private java.util.List < String > vSwitchId;

        private VSwitchIds(Builder builder) {
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitchIds create() {
            return builder().build();
        }

        /**
         * @return vSwitchId
         */
        public java.util.List < String > getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private java.util.List < String > vSwitchId; 

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(java.util.List < String > vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public VSwitchIds build() {
                return new VSwitchIds(this);
            } 

        } 

    }
}
