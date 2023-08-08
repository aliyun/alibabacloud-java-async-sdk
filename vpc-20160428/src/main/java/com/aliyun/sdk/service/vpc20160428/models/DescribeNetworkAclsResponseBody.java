// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
    private NetworkAcls networkAcls;

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
    public NetworkAcls getNetworkAcls() {
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
        private NetworkAcls networkAcls; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private String totalCount; 

        /**
         * The details about the network ACL.
         */
        public Builder networkAcls(NetworkAcls networkAcls) {
            this.networkAcls = networkAcls;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned on each page.
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

    public static class EgressAclEntry extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("DestinationCidrIp")
        private String destinationCidrIp;

        @NameInMap("NetworkAclEntryId")
        private String networkAclEntryId;

        @NameInMap("NetworkAclEntryName")
        private String networkAclEntryName;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("Port")
        private String port;

        @NameInMap("Protocol")
        private String protocol;

        private EgressAclEntry(Builder builder) {
            this.description = builder.description;
            this.destinationCidrIp = builder.destinationCidrIp;
            this.networkAclEntryId = builder.networkAclEntryId;
            this.networkAclEntryName = builder.networkAclEntryName;
            this.policy = builder.policy;
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EgressAclEntry create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return destinationCidrIp
         */
        public String getDestinationCidrIp() {
            return this.destinationCidrIp;
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
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private String description; 
            private String destinationCidrIp; 
            private String networkAclEntryId; 
            private String networkAclEntryName; 
            private String policy; 
            private String port; 
            private String protocol; 

            /**
             * The description of the outbound rule.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The destination CIDR block.
             */
            public Builder destinationCidrIp(String destinationCidrIp) {
                this.destinationCidrIp = destinationCidrIp;
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
             * - **accept**: allows network traffic.
             * - **drop**: blocks network traffic.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * The destination port range of the outbound traffic. 
             * <p>
             * 
             * - If **Protocol** of the outbound rule is set to **all**, **icmp**, or **gre**, the port range is **-1/-1**, which specifies all ports.
             * - If **Protocol** of the outbound rule is set to **tcp** or **udp**, the port range is in the following format: **1/200** or **80/80**. 1/200 indicates port 1 to port 200. 80/80 indicates port 80. Valid values for a port: **1** to **65535**.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The protocol. Valid values:
             * <p>
             * 
             * - **icmp**: ICMP
             * - **gre**: GRE
             * - **tcp**: TCP
             * - **udp**: UDP
             * - **all**: all protocols
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public EgressAclEntry build() {
                return new EgressAclEntry(this);
            } 

        } 

    }
    public static class EgressAclEntries extends TeaModel {
        @NameInMap("EgressAclEntry")
        private java.util.List < EgressAclEntry> egressAclEntry;

        private EgressAclEntries(Builder builder) {
            this.egressAclEntry = builder.egressAclEntry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EgressAclEntries create() {
            return builder().build();
        }

        /**
         * @return egressAclEntry
         */
        public java.util.List < EgressAclEntry> getEgressAclEntry() {
            return this.egressAclEntry;
        }

        public static final class Builder {
            private java.util.List < EgressAclEntry> egressAclEntry; 

            /**
             * EgressAclEntry.
             */
            public Builder egressAclEntry(java.util.List < EgressAclEntry> egressAclEntry) {
                this.egressAclEntry = egressAclEntry;
                return this;
            }

            public EgressAclEntries build() {
                return new EgressAclEntries(this);
            } 

        } 

    }
    public static class IngressAclEntry extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("NetworkAclEntryId")
        private String networkAclEntryId;

        @NameInMap("NetworkAclEntryName")
        private String networkAclEntryName;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("Port")
        private String port;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("SourceCidrIp")
        private String sourceCidrIp;

        private IngressAclEntry(Builder builder) {
            this.description = builder.description;
            this.networkAclEntryId = builder.networkAclEntryId;
            this.networkAclEntryName = builder.networkAclEntryName;
            this.policy = builder.policy;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.sourceCidrIp = builder.sourceCidrIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IngressAclEntry create() {
            return builder().build();
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
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return sourceCidrIp
         */
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public static final class Builder {
            private String description; 
            private String networkAclEntryId; 
            private String networkAclEntryName; 
            private String policy; 
            private String port; 
            private String protocol; 
            private String sourceCidrIp; 

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
             * The action to be performed on network traffic that matches the rule. Valid values:
             * <p>
             * 
             * *   **accept**: allows network traffic.
             * *   **drop**: blocks network traffic.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * The destination port range of the inbound traffic.
             * <p>
             * 
             * *   If **Protocol** of the inbound rule is set to **all**, **icmp**, or **gre**, the port range is **-1/-1**, which indicates all ports.
             * *   If **Protocol** of the inbound rule is set to **tcp** or **udp**, the port range is in the following format: **1/200** or **80/80**. 1/200 indicates port 1 to port 200. 80/80 indicates port 80. Valid values for a port: **1** to **65535**.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The protocol. Valid values:
             * <p>
             * 
             * *   **icmp**: ICMP
             * *   **gre**: GRE
             * *   **tcp**: TCP
             * *   **udp**: UDP
             * *   **all**: all protocols
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The source CIDR block.
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            public IngressAclEntry build() {
                return new IngressAclEntry(this);
            } 

        } 

    }
    public static class IngressAclEntries extends TeaModel {
        @NameInMap("IngressAclEntry")
        private java.util.List < IngressAclEntry> ingressAclEntry;

        private IngressAclEntries(Builder builder) {
            this.ingressAclEntry = builder.ingressAclEntry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IngressAclEntries create() {
            return builder().build();
        }

        /**
         * @return ingressAclEntry
         */
        public java.util.List < IngressAclEntry> getIngressAclEntry() {
            return this.ingressAclEntry;
        }

        public static final class Builder {
            private java.util.List < IngressAclEntry> ingressAclEntry; 

            /**
             * IngressAclEntry.
             */
            public Builder ingressAclEntry(java.util.List < IngressAclEntry> ingressAclEntry) {
                this.ingressAclEntry = ingressAclEntry;
                return this;
            }

            public IngressAclEntries build() {
                return new IngressAclEntries(this);
            } 

        } 

    }
    public static class Resource extends TeaModel {
        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("Status")
        private String status;

        private Resource(Builder builder) {
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
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
            private String resourceId; 
            private String resourceType; 
            private String status; 

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
             * - **BINDED**: associated
             * - **BINDING**: being associated
             * - **UNBINDING**: disassociated
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
    public static class Resources extends TeaModel {
        @NameInMap("Resource")
        private java.util.List < Resource> resource;

        private Resources(Builder builder) {
            this.resource = builder.resource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return resource
         */
        public java.util.List < Resource> getResource() {
            return this.resource;
        }

        public static final class Builder {
            private java.util.List < Resource> resource; 

            /**
             * Resource.
             */
            public Builder resource(java.util.List < Resource> resource) {
                this.resource = resource;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class NetworkAcl extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("EgressAclEntries")
        private EgressAclEntries egressAclEntries;

        @NameInMap("IngressAclEntries")
        private IngressAclEntries ingressAclEntries;

        @NameInMap("NetworkAclId")
        private String networkAclId;

        @NameInMap("NetworkAclName")
        private String networkAclName;

        @NameInMap("OwnerId")
        private Long ownerId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Resources")
        private Resources resources;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("VpcId")
        private String vpcId;

        private NetworkAcl(Builder builder) {
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.egressAclEntries = builder.egressAclEntries;
            this.ingressAclEntries = builder.ingressAclEntries;
            this.networkAclId = builder.networkAclId;
            this.networkAclName = builder.networkAclName;
            this.ownerId = builder.ownerId;
            this.regionId = builder.regionId;
            this.resources = builder.resources;
            this.status = builder.status;
            this.tags = builder.tags;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkAcl create() {
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
        public EgressAclEntries getEgressAclEntries() {
            return this.egressAclEntries;
        }

        /**
         * @return ingressAclEntries
         */
        public IngressAclEntries getIngressAclEntries() {
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
         * @return ownerId
         */
        public Long getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resources
         */
        public Resources getResources() {
            return this.resources;
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
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String creationTime; 
            private String description; 
            private EgressAclEntries egressAclEntries; 
            private IngressAclEntries ingressAclEntries; 
            private String networkAclId; 
            private String networkAclName; 
            private Long ownerId; 
            private String regionId; 
            private Resources resources; 
            private String status; 
            private Tags tags; 
            private String vpcId; 

            /**
             * The time when the network ACL was created.
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
             * The outbound rules.
             */
            public Builder egressAclEntries(EgressAclEntries egressAclEntries) {
                this.egressAclEntries = egressAclEntries;
                return this;
            }

            /**
             * The inbound rules.
             */
            public Builder ingressAclEntries(IngressAclEntries ingressAclEntries) {
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
             * The ID of the Alibaba Cloud account to which the network ACL belongs.
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * The region ID of the network ACL.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The resources that are associated with the network ACL.
             */
            public Builder resources(Resources resources) {
                this.resources = resources;
                return this;
            }

            /**
             * The status of the network ACL. Valid values:
             * <p>
             * 
             * *   **Available**
             * *   **Modifying**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tag list.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The ID of the associated VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public NetworkAcl build() {
                return new NetworkAcl(this);
            } 

        } 

    }
    public static class NetworkAcls extends TeaModel {
        @NameInMap("NetworkAcl")
        private java.util.List < NetworkAcl> networkAcl;

        private NetworkAcls(Builder builder) {
            this.networkAcl = builder.networkAcl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkAcls create() {
            return builder().build();
        }

        /**
         * @return networkAcl
         */
        public java.util.List < NetworkAcl> getNetworkAcl() {
            return this.networkAcl;
        }

        public static final class Builder {
            private java.util.List < NetworkAcl> networkAcl; 

            /**
             * NetworkAcl.
             */
            public Builder networkAcl(java.util.List < NetworkAcl> networkAcl) {
                this.networkAcl = networkAcl;
                return this;
            }

            public NetworkAcls build() {
                return new NetworkAcls(this);
            } 

        } 

    }
}
