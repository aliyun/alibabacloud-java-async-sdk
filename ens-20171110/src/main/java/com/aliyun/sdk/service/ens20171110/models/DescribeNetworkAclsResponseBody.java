// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNetworkAclsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkAclsResponseBody</p>
 */
public class DescribeNetworkAclsResponseBody extends TeaModel {
    @NameInMap("NetworkAcls")
    private java.util.List < NetworkAcls> networkAcls;

    @NameInMap("PageNumber")
    private String pageNumber;

    @NameInMap("PageSize")
    private String pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private String totalCount;

    private DescribeNetworkAclsResponseBody(Builder builder) {
        this.networkAcls = builder.networkAcls;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkAclsResponseBody create() {
        return builder().build();
    }

    /**
     * @return networkAcls
     */
    public java.util.List < NetworkAcls> getNetworkAcls() {
        return this.networkAcls;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < NetworkAcls> networkAcls; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private String totalCount; 

        /**
         * Details of the network ACLs.
         */
        public Builder networkAcls(java.util.List < NetworkAcls> networkAcls) {
            this.networkAcls = networkAcls;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(String pageSize) {
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
         * The total number of entries returned.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeNetworkAclsResponseBody build() {
            return new DescribeNetworkAclsResponseBody(this);
        } 

    } 

    public static class EgressAclEntries extends TeaModel {
        @NameInMap("CidrBlock")
        private String cidrBlock;

        @NameInMap("Description")
        private String description;

        @NameInMap("NetworkAclEntryId")
        private String networkAclEntryId;

        @NameInMap("NetworkAclEntryName")
        private String networkAclEntryName;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("PortRange")
        private String portRange;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("Type")
        private String type;

        private EgressAclEntries(Builder builder) {
            this.cidrBlock = builder.cidrBlock;
            this.description = builder.description;
            this.networkAclEntryId = builder.networkAclEntryId;
            this.networkAclEntryName = builder.networkAclEntryName;
            this.policy = builder.policy;
            this.portRange = builder.portRange;
            this.priority = builder.priority;
            this.protocol = builder.protocol;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EgressAclEntries create() {
            return builder().build();
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return networkAclEntryId
         */
        public String getNetworkAclEntryId() {
            return this.networkAclEntryId;
        }

        /**
         * @return networkAclEntryName
         */
        public String getNetworkAclEntryName() {
            return this.networkAclEntryName;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return portRange
         */
        public String getPortRange() {
            return this.portRange;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String cidrBlock; 
            private String description; 
            private String networkAclEntryId; 
            private String networkAclEntryName; 
            private String policy; 
            private String portRange; 
            private Integer priority; 
            private String protocol; 
            private String type; 

            /**
             * The destination CIDR block.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * The description of the outbound rule.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the outbound rule.
             */
            public Builder networkAclEntryId(String networkAclEntryId) {
                this.networkAclEntryId = networkAclEntryId;
                return this;
            }

            /**
             * The name of the outbound rule.
             */
            public Builder networkAclEntryName(String networkAclEntryName) {
                this.networkAclEntryName = networkAclEntryName;
                return this;
            }

            /**
             * The action to be performed on network traffic that matches the rule. Valid values:
             * <p>
             * 
             * *   **accept**: allows the network traffic.
             * *   **drop**: blocks the network traffic.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * The destination port range of the outbound rule.
             * <p>
             * 
             * *   If **Protocol** in the outbound rule is set to **all** or **icmp**, \*\*-1/-1\*\* is returned for this parameter. \*\*-1/-1\*\* indicates all ports.
             * *   If **Protocol** in the outbound rule is set to **tcp** or **udp**, the port range is in the following format: **1/200** or **80/80**. 120/120 indicates port 1 to port 200 and 80/80 indicates port 80. Valid values for a port: **1 to 65535**.
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * The priority of the rule. Valid values: **1 to 100**. Default value: **1**.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The protocol. Valid values:
             * <p>
             * 
             * *   **icmp**
             * *   **tcp**
             * *   **udp**
             * *   **all**
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The type of the rule. Valid values:
             * <p>
             * 
             * *   **system**: The rule is created by the system.
             * *   **custom**: The rule is created by a user.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public EgressAclEntries build() {
                return new EgressAclEntries(this);
            } 

        } 

    }
    public static class IngressAclEntries extends TeaModel {
        @NameInMap("CidrBlock")
        private String cidrBlock;

        @NameInMap("Description")
        private String description;

        @NameInMap("NetworkAclEntryId")
        private String networkAclEntryId;

        @NameInMap("NetworkAclEntryName")
        private String networkAclEntryName;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("PortRange")
        private String portRange;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("Type")
        private String type;

        private IngressAclEntries(Builder builder) {
            this.cidrBlock = builder.cidrBlock;
            this.description = builder.description;
            this.networkAclEntryId = builder.networkAclEntryId;
            this.networkAclEntryName = builder.networkAclEntryName;
            this.policy = builder.policy;
            this.portRange = builder.portRange;
            this.priority = builder.priority;
            this.protocol = builder.protocol;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IngressAclEntries create() {
            return builder().build();
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return networkAclEntryId
         */
        public String getNetworkAclEntryId() {
            return this.networkAclEntryId;
        }

        /**
         * @return networkAclEntryName
         */
        public String getNetworkAclEntryName() {
            return this.networkAclEntryName;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return portRange
         */
        public String getPortRange() {
            return this.portRange;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String cidrBlock; 
            private String description; 
            private String networkAclEntryId; 
            private String networkAclEntryName; 
            private String policy; 
            private String portRange; 
            private Integer priority; 
            private String protocol; 
            private String type; 

            /**
             * The source CIDR block.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * The description of the inbound rule.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the inbound rule.
             */
            public Builder networkAclEntryId(String networkAclEntryId) {
                this.networkAclEntryId = networkAclEntryId;
                return this;
            }

            /**
             * The name of the inbound rule.
             */
            public Builder networkAclEntryName(String networkAclEntryName) {
                this.networkAclEntryName = networkAclEntryName;
                return this;
            }

            /**
             * The action that is performed on network traffic that matches the rule. Valid values:
             * <p>
             * 
             * *   **accept**: allows the network traffic.
             * *   **drop**: blocks the network traffic.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * The destination port range of the inbound rule.
             * <p>
             * 
             * *   If **Protocol** in the inbound rule is set to **all** or **icmp**, \*\*-1/-1\*\* is returned for this parameter. \*\*-1/-1\*\* indicates all ports.
             * *   If **Protocol** in the inbound rule is set to **tcp** or **udp**, the port range is in the following format: **1/200** or **80/80**. 1/200 indicates port 1 to port 200 and 80/80 indicates port 80. Valid values for a port: **1 to 65535**.
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * The priority of the rule. Valid values: **1 to 100**. Default value: **1**.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The protocol. Valid values:
             * <p>
             * 
             * *   **icmp**
             * *   **tcp**
             * *   **udp**
             * *   **all**
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The type of the rule. Valid values:
             * <p>
             * 
             * *   **system**: The rule is created by the system.
             * *   **custom**: The rule is created by a user.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public IngressAclEntries build() {
                return new IngressAclEntries(this);
            } 

        } 

    }
    public static class Resources extends TeaModel {
        @NameInMap("EnsRegionId")
        private String ensRegionId;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("Status")
        private String status;

        private Resources(Builder builder) {
            this.ensRegionId = builder.ensRegionId;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String ensRegionId; 
            private String resourceId; 
            private String resourceType; 
            private String status; 

            /**
             * The ID of the ENS node.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * The ID of the associated resource.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The type of the associated resource.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The association status of the resource. Valid values:
             * <p>
             * 
             * *   **BINDED**: The resource is associated with the network ACL.
             * *   **BINDING**: The resource is being associated with the network ACL.
             * *   **UNBINDING**: The resource is being disassociated from the network ACL.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
    public static class NetworkAcls extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("EgressAclEntries")
        private java.util.List < EgressAclEntries> egressAclEntries;

        @NameInMap("IngressAclEntries")
        private java.util.List < IngressAclEntries> ingressAclEntries;

        @NameInMap("NetworkAclId")
        private String networkAclId;

        @NameInMap("NetworkAclName")
        private String networkAclName;

        @NameInMap("Resources")
        private java.util.List < Resources> resources;

        @NameInMap("Status")
        private String status;

        private NetworkAcls(Builder builder) {
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.egressAclEntries = builder.egressAclEntries;
            this.ingressAclEntries = builder.ingressAclEntries;
            this.networkAclId = builder.networkAclId;
            this.networkAclName = builder.networkAclName;
            this.resources = builder.resources;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkAcls create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return egressAclEntries
         */
        public java.util.List < EgressAclEntries> getEgressAclEntries() {
            return this.egressAclEntries;
        }

        /**
         * @return ingressAclEntries
         */
        public java.util.List < IngressAclEntries> getIngressAclEntries() {
            return this.ingressAclEntries;
        }

        /**
         * @return networkAclId
         */
        public String getNetworkAclId() {
            return this.networkAclId;
        }

        /**
         * @return networkAclName
         */
        public String getNetworkAclName() {
            return this.networkAclName;
        }

        /**
         * @return resources
         */
        public java.util.List < Resources> getResources() {
            return this.resources;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String creationTime; 
            private String description; 
            private java.util.List < EgressAclEntries> egressAclEntries; 
            private java.util.List < IngressAclEntries> ingressAclEntries; 
            private String networkAclId; 
            private String networkAclName; 
            private java.util.List < Resources> resources; 
            private String status; 

            /**
             * The time when the network ACL was created. The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the network ACL.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Details of the outbound rules.
             */
            public Builder egressAclEntries(java.util.List < EgressAclEntries> egressAclEntries) {
                this.egressAclEntries = egressAclEntries;
                return this;
            }

            /**
             * Details of the inbound rules.
             */
            public Builder ingressAclEntries(java.util.List < IngressAclEntries> ingressAclEntries) {
                this.ingressAclEntries = ingressAclEntries;
                return this;
            }

            /**
             * The ID of the network ACL.
             */
            public Builder networkAclId(String networkAclId) {
                this.networkAclId = networkAclId;
                return this;
            }

            /**
             * The name of the network ACL.
             */
            public Builder networkAclName(String networkAclName) {
                this.networkAclName = networkAclName;
                return this;
            }

            /**
             * Details of the associated resources.
             */
            public Builder resources(java.util.List < Resources> resources) {
                this.resources = resources;
                return this;
            }

            /**
             * The status of the network ACL. Valid values:
             * <p>
             * 
             * *   **Available**: The network ACL is available.
             * *   **Modifying**: The network ACL is being configured.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public NetworkAcls build() {
                return new NetworkAcls(this);
            } 

        } 

    }
}
