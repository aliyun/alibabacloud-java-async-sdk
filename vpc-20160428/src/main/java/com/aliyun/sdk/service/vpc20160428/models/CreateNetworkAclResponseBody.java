// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link CreateNetworkAclResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNetworkAclResponseBody</p>
 */
public class CreateNetworkAclResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkAclAttribute")
    private NetworkAclAttribute networkAclAttribute;

    @com.aliyun.core.annotation.NameInMap("NetworkAclId")
    private String networkAclId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateNetworkAclResponseBody(Builder builder) {
        this.networkAclAttribute = builder.networkAclAttribute;
        this.networkAclId = builder.networkAclId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkAclResponseBody create() {
        return builder().build();
    }

    /**
     * @return networkAclAttribute
     */
    public NetworkAclAttribute getNetworkAclAttribute() {
        return this.networkAclAttribute;
    }

    /**
     * @return networkAclId
     */
    public String getNetworkAclId() {
        return this.networkAclId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private NetworkAclAttribute networkAclAttribute; 
        private String networkAclId; 
        private String requestId; 

        /**
         * <p>The attributes of the network ACL.</p>
         */
        public Builder networkAclAttribute(NetworkAclAttribute networkAclAttribute) {
            this.networkAclAttribute = networkAclAttribute;
            return this;
        }

        /**
         * <p>The ID of the network ACL.</p>
         * 
         * <strong>example:</strong>
         * <p>nacl-a2do9e413e0spzasx****</p>
         */
        public Builder networkAclId(String networkAclId) {
            this.networkAclId = networkAclId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateNetworkAclResponseBody build() {
            return new CreateNetworkAclResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateNetworkAclResponseBody} extends {@link TeaModel}
     *
     * <p>CreateNetworkAclResponseBody</p>
     */
    public static class EgressAclEntry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DestinationCidrIp")
        private String destinationCidrIp;

        @com.aliyun.core.annotation.NameInMap("NetworkAclEntryId")
        private String networkAclEntryId;

        @com.aliyun.core.annotation.NameInMap("NetworkAclEntryName")
        private String networkAclEntryName;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
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
             * <p>The destination CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/24</p>
             */
            public Builder destinationCidrIp(String destinationCidrIp) {
                this.destinationCidrIp = destinationCidrIp;
                return this;
            }

            /**
             * <p>The ID of the outbound rule.</p>
             * 
             * <strong>example:</strong>
             * <p>nae-a2d447uw4tillxsdc****</p>
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
             * <p>The action to be performed on network traffic that matches the rule. Valid values:</p>
             * <ul>
             * <li><strong>accept</strong></li>
             * <li><strong>drop</strong></li>
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
             * <p>The destination port range of the outbound traffic.</p>
             * <ul>
             * <li>If the <strong>protocol</strong> of the outbound rule is set to <strong>all</strong>, <strong>icmp</strong>, or <strong>gre</strong>, the port range is -1/-1, which specified all ports.</li>
             * <li>If the <strong>protocol</strong> of the outbound rule is set to <strong>tcp</strong> or <strong>udp</strong>, set the port range in the following format: <strong>1/200</strong> or <strong>80/80</strong>, which specifies port 1 to port 200 or port 80. Valid values for a port: <strong>1</strong> to <strong>65535</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>-1/-1</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol. Valid values:</p>
             * <ul>
             * <li><strong>icmp</strong></li>
             * <li><strong>gre</strong></li>
             * <li><strong>tcp</strong></li>
             * <li><strong>udp</strong></li>
             * <li><strong>all</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>all</p>
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
    /**
     * 
     * {@link CreateNetworkAclResponseBody} extends {@link TeaModel}
     *
     * <p>CreateNetworkAclResponseBody</p>
     */
    public static class EgressAclEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EgressAclEntry")
        private java.util.List<EgressAclEntry> egressAclEntry;

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
        public java.util.List<EgressAclEntry> getEgressAclEntry() {
            return this.egressAclEntry;
        }

        public static final class Builder {
            private java.util.List<EgressAclEntry> egressAclEntry; 

            /**
             * EgressAclEntry.
             */
            public Builder egressAclEntry(java.util.List<EgressAclEntry> egressAclEntry) {
                this.egressAclEntry = egressAclEntry;
                return this;
            }

            public EgressAclEntries build() {
                return new EgressAclEntries(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateNetworkAclResponseBody} extends {@link TeaModel}
     *
     * <p>CreateNetworkAclResponseBody</p>
     */
    public static class IngressAclEntry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("NetworkAclEntryId")
        private String networkAclEntryId;

        @com.aliyun.core.annotation.NameInMap("NetworkAclEntryName")
        private String networkAclEntryName;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("SourceCidrIp")
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
             * <p>nae-a2dk86arlydmexscd****</p>
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
             * <p>The action to be performed on network traffic that matches the rule. Valid values:</p>
             * <ul>
             * <li><strong>accept</strong></li>
             * <li><strong>drop</strong></li>
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
             * <p>The destination port range of the inbound traffic.</p>
             * <ul>
             * <li>If the <strong>protocol</strong> of the inbound rule is set to <strong>all</strong>, <strong>icmp</strong>, or <strong>gre</strong>, the port range is -1/-1, which specifies all ports.</li>
             * <li>If the <strong>protocol</strong> of the inbound rule is set to <strong>tcp</strong> or <strong>udp</strong>, set the port range in the following format: <strong>1/200</strong> or <strong>80/80</strong>, which specifies port 1 to port 200 or port 80. Valid ports: <strong>1</strong> to <strong>65535</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>-1/-1</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol. Valid values:</p>
             * <ul>
             * <li><strong>icmp</strong></li>
             * <li><strong>gre</strong></li>
             * <li><strong>tcp</strong></li>
             * <li><strong>udp</strong></li>
             * <li><strong>all</strong></li>
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
             * <p>The source CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/24</p>
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
    /**
     * 
     * {@link CreateNetworkAclResponseBody} extends {@link TeaModel}
     *
     * <p>CreateNetworkAclResponseBody</p>
     */
    public static class IngressAclEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IngressAclEntry")
        private java.util.List<IngressAclEntry> ingressAclEntry;

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
        public java.util.List<IngressAclEntry> getIngressAclEntry() {
            return this.ingressAclEntry;
        }

        public static final class Builder {
            private java.util.List<IngressAclEntry> ingressAclEntry; 

            /**
             * IngressAclEntry.
             */
            public Builder ingressAclEntry(java.util.List<IngressAclEntry> ingressAclEntry) {
                this.ingressAclEntry = ingressAclEntry;
                return this;
            }

            public IngressAclEntries build() {
                return new IngressAclEntries(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateNetworkAclResponseBody} extends {@link TeaModel}
     *
     * <p>CreateNetworkAclResponseBody</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The ID of the associated resource.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1de348lntdwgthy****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The type of resource with which you want to associate the network ACL.</p>
             * 
             * <strong>example:</strong>
             * <p>VSwitch</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The association status of the resource. Valid values:</p>
             * <ul>
             * <li><strong>BINDED</strong></li>
             * <li><strong>BINDING</strong></li>
             * <li><strong>UNBINDING</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BINDED</p>
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
    /**
     * 
     * {@link CreateNetworkAclResponseBody} extends {@link TeaModel}
     *
     * <p>CreateNetworkAclResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Resource")
        private java.util.List<Resource> resource;

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
        public java.util.List<Resource> getResource() {
            return this.resource;
        }

        public static final class Builder {
            private java.util.List<Resource> resource; 

            /**
             * Resource.
             */
            public Builder resource(java.util.List<Resource> resource) {
                this.resource = resource;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateNetworkAclResponseBody} extends {@link TeaModel}
     *
     * <p>CreateNetworkAclResponseBody</p>
     */
    public static class NetworkAclAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EgressAclEntries")
        private EgressAclEntries egressAclEntries;

        @com.aliyun.core.annotation.NameInMap("IngressAclEntries")
        private IngressAclEntries ingressAclEntries;

        @com.aliyun.core.annotation.NameInMap("NetworkAclId")
        private String networkAclId;

        @com.aliyun.core.annotation.NameInMap("NetworkAclName")
        private String networkAclName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Resources")
        private Resources resources;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private NetworkAclAttribute(Builder builder) {
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.egressAclEntries = builder.egressAclEntries;
            this.ingressAclEntries = builder.ingressAclEntries;
            this.networkAclId = builder.networkAclId;
            this.networkAclName = builder.networkAclName;
            this.regionId = builder.regionId;
            this.resources = builder.resources;
            this.status = builder.status;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkAclAttribute create() {
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
            private String regionId; 
            private Resources resources; 
            private String status; 
            private String vpcId; 

            /**
             * <p>The time when the network ACL was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-25 11:33:27</p>
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
             * <p>The outbound rules.</p>
             */
            public Builder egressAclEntries(EgressAclEntries egressAclEntries) {
                this.egressAclEntries = egressAclEntries;
                return this;
            }

            /**
             * <p>The inbound rules.</p>
             */
            public Builder ingressAclEntries(IngressAclEntries ingressAclEntries) {
                this.ingressAclEntries = ingressAclEntries;
                return this;
            }

            /**
             * <p>The ID of the network ACL.</p>
             * 
             * <strong>example:</strong>
             * <p>nacl-a2do9e413e0spdefr****</p>
             */
            public Builder networkAclId(String networkAclId) {
                this.networkAclId = networkAclId;
                return this;
            }

            /**
             * <p>The name of the network ACL.</p>
             * 
             * <strong>example:</strong>
             * <p>acl-1</p>
             */
            public Builder networkAclName(String networkAclName) {
                this.networkAclName = networkAclName;
                return this;
            }

            /**
             * <p>The region ID of the network ACL.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The information about the associated resources.</p>
             */
            public Builder resources(Resources resources) {
                this.resources = resources;
                return this;
            }

            /**
             * <p>The status of the network ACL. Valid values:</p>
             * <ul>
             * <li><strong>Available</strong></li>
             * <li><strong>Modifying</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Modifying</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the VPC to which the network ACL belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-a2d33rfpl72k5xsscd****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public NetworkAclAttribute build() {
                return new NetworkAclAttribute(this);
            } 

        } 

    }
}
