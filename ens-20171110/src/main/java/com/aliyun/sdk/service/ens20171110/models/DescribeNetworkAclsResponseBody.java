// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeNetworkAclsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkAclsResponseBody</p>
 */
public class DescribeNetworkAclsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkAcls")
    private java.util.List < NetworkAcls> networkAcls;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>Details of the network ACLs.</p>
         */
        public Builder networkAcls(java.util.List < NetworkAcls> networkAcls) {
            this.networkAcls = networkAcls;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A1707FC0-430C-423A-B624-284046B20399</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeNetworkAclsResponseBody build() {
            return new DescribeNetworkAclsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNetworkAclsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkAclsResponseBody</p>
     */
    public static class EgressAclEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("NetworkAclEntryId")
        private String networkAclEntryId;

        @com.aliyun.core.annotation.NameInMap("NetworkAclEntryName")
        private String networkAclEntryName;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("PortRange")
        private String portRange;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>The destination CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/24</p>
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * <p>The description of the outbound rule.</p>
             * 
             * <strong>example:</strong>
             * <p>This is EgressAclEntries.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the outbound rule.</p>
             * 
             * <strong>example:</strong>
             * <p>nae-a2d447uw4tillfvgb****</p>
             */
            public Builder networkAclEntryId(String networkAclEntryId) {
                this.networkAclEntryId = networkAclEntryId;
                return this;
            }

            /**
             * <p>The name of the outbound rule.</p>
             * 
             * <strong>example:</strong>
             * <p>acl-2</p>
             */
            public Builder networkAclEntryName(String networkAclEntryName) {
                this.networkAclEntryName = networkAclEntryName;
                return this;
            }

            /**
             * <p>The action that is performed on network traffic that matches the rule. Valid values:</p>
             * <ul>
             * <li><strong>accept</strong>: allows the network traffic.</li>
             * <li><strong>drop</strong>: blocks the network traffic.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>accept</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The destination port range of the outbound rule.</p>
             * <ul>
             * <li>If <strong>Protocol</strong> of the outbound rule is set to <strong>all</strong> or <strong>icmp</strong> the port range is <strong>-1/-1</strong>, which indicates all ports.</li>
             * <li>If <strong>Protocol</strong> of the outbound rule is set to <strong>tcp</strong> or <strong>udp</strong>, the port range is in the following format: <strong>1/200</strong> or <strong>80/80</strong>. 1/200 indicates port 1 to port 200. 80/80 indicates port 80. Valid values for a port: <strong>1 to 65535</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>-1/-1</p>
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * <p>The priority of the rule. Valid values: <strong>1 to 100</strong>. Default value: <strong>1</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The protocol type. Valid values:</p>
             * <ul>
             * <li><strong>icmp</strong>: ICMP.</li>
             * <li><strong>tcp</strong>: TCP.</li>
             * <li><strong>udp</strong>: UDP.</li>
             * <li><strong>all</strong>: all protocols.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>all</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The type of the rule. Valid values:</p>
             * <ul>
             * <li><strong>system</strong>: The rule is created by the system.</li>
             * <li><strong>custom</strong>: The rule is created by a user.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>system</p>
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
    /**
     * 
     * {@link DescribeNetworkAclsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkAclsResponseBody</p>
     */
    public static class IngressAclEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("NetworkAclEntryId")
        private String networkAclEntryId;

        @com.aliyun.core.annotation.NameInMap("NetworkAclEntryName")
        private String networkAclEntryName;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("PortRange")
        private String portRange;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>The source CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/24</p>
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * <p>The description of the inbound rule.</p>
             * 
             * <strong>example:</strong>
             * <p>This is IngressAclEntries.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the inbound rule.</p>
             * 
             * <strong>example:</strong>
             * <p>nae-5dk86arlydmezasw****</p>
             */
            public Builder networkAclEntryId(String networkAclEntryId) {
                this.networkAclEntryId = networkAclEntryId;
                return this;
            }

            /**
             * <p>The name of the inbound rule.</p>
             * 
             * <strong>example:</strong>
             * <p>acl-3</p>
             */
            public Builder networkAclEntryName(String networkAclEntryName) {
                this.networkAclEntryName = networkAclEntryName;
                return this;
            }

            /**
             * <p>The action that is performed on network traffic that matches the rule. Valid values:</p>
             * <ul>
             * <li><strong>accept</strong>: allows the network traffic.</li>
             * <li><strong>drop</strong>: blocks the network traffic.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>accept</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The destination port range of the inbound rule.</p>
             * <ul>
             * <li>If <strong>Protocol</strong> of the inbound rule is set to <strong>all</strong> or <strong>icmp</strong>, the port range is <strong>-1/-1</strong>, which indicates all ports.</li>
             * <li>If <strong>Protocol</strong> of the inbound rule is set to <strong>tcp</strong> or <strong>udp</strong>, the port range is in the following format: <strong>1/200</strong> or <strong>80/80</strong>. 1/200 indicates port 1 to port 200. 80/80 indicates port 80. Valid values for a port: <strong>1 to 65535</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>-1/-1</p>
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * <p>The priority of the rule. Valid values: <strong>1 to 100</strong>. Default value: <strong>1</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The protocol type. Valid values:</p>
             * <ul>
             * <li><strong>icmp</strong>: ICMP.</li>
             * <li><strong>tcp</strong>: TCP.</li>
             * <li><strong>udp</strong>: UDP.</li>
             * <li><strong>all</strong>: all protocols.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>all</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The type of the rule. Valid values:</p>
             * <ul>
             * <li><strong>system</strong>: The rule is created by the system.</li>
             * <li><strong>custom</strong>: The rule is created by a user.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>system</p>
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
    /**
     * 
     * {@link DescribeNetworkAclsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkAclsResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The ID of the edge node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-fuzhou-telecom</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>The ID of the associated resource.</p>
             * 
             * <strong>example:</strong>
             * <p>n-****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The type of the associated resource.</p>
             * 
             * <strong>example:</strong>
             * <p>Network</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The association status of the resource. Valid values:</p>
             * <ul>
             * <li><strong>BINDED</strong>: The resource is associated with the network ACL.</li>
             * <li><strong>BINDING</strong>: The resource is being associated with the network ACL.</li>
             * <li><strong>UNBINDING</strong>: The resource is being disassociated from the network ACL.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BINDING</p>
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
    /**
     * 
     * {@link DescribeNetworkAclsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkAclsResponseBody</p>
     */
    public static class NetworkAcls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EgressAclEntries")
        private java.util.List < EgressAclEntries> egressAclEntries;

        @com.aliyun.core.annotation.NameInMap("IngressAclEntries")
        private java.util.List < IngressAclEntries> ingressAclEntries;

        @com.aliyun.core.annotation.NameInMap("NetworkAclId")
        private String networkAclId;

        @com.aliyun.core.annotation.NameInMap("NetworkAclName")
        private String networkAclName;

        @com.aliyun.core.annotation.NameInMap("Resources")
        private java.util.List < Resources> resources;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The time when the network ACL was created. The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-11-01T06:08:46Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the network ACL.</p>
             * 
             * <strong>example:</strong>
             * <p>This is my NetworkAcl.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Details of the outbound rules.</p>
             */
            public Builder egressAclEntries(java.util.List < EgressAclEntries> egressAclEntries) {
                this.egressAclEntries = egressAclEntries;
                return this;
            }

            /**
             * <p>Details of the inbound rules.</p>
             */
            public Builder ingressAclEntries(java.util.List < IngressAclEntries> ingressAclEntries) {
                this.ingressAclEntries = ingressAclEntries;
                return this;
            }

            /**
             * <p>The ID of the network ACL.</p>
             * 
             * <strong>example:</strong>
             * <p>nacl-a2do9e413e0spxscd****</p>
             */
            public Builder networkAclId(String networkAclId) {
                this.networkAclId = networkAclId;
                return this;
            }

            /**
             * <p>The name of the network ACL.</p>
             * 
             * <strong>example:</strong>
             * <p>acl-8</p>
             */
            public Builder networkAclName(String networkAclName) {
                this.networkAclName = networkAclName;
                return this;
            }

            /**
             * <p>Details of the associated resources.</p>
             */
            public Builder resources(java.util.List < Resources> resources) {
                this.resources = resources;
                return this;
            }

            /**
             * <p>The status of the network ACL. Valid values:</p>
             * <ul>
             * <li><strong>Available</strong>: The network ACL is available.</li>
             * <li><strong>Modifying</strong>: The network ACL is being configured.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
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
