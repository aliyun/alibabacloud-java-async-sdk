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
 * {@link DescribeNetworkAclAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkAclAttributesResponseBody</p>
 */
public class DescribeNetworkAclAttributesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkAclAttribute")
    private NetworkAclAttribute networkAclAttribute;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeNetworkAclAttributesResponseBody(Builder builder) {
        this.networkAclAttribute = builder.networkAclAttribute;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkAclAttributesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkAclAttribute
     */
    public NetworkAclAttribute getNetworkAclAttribute() {
        return this.networkAclAttribute;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private NetworkAclAttribute networkAclAttribute; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeNetworkAclAttributesResponseBody model) {
            this.networkAclAttribute = model.networkAclAttribute;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the network ACLs.</p>
         */
        public Builder networkAclAttribute(NetworkAclAttribute networkAclAttribute) {
            this.networkAclAttribute = networkAclAttribute;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F5905F9C-0161-4E72-9CB1-1F3F3CF6268A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNetworkAclAttributesResponseBody build() {
            return new DescribeNetworkAclAttributesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNetworkAclAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkAclAttributesResponseBody</p>
     */
    public static class EgressAclEntry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DestinationCidrIp")
        private String destinationCidrIp;

        @com.aliyun.core.annotation.NameInMap("EntryType")
        private String entryType;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private String ipVersion;

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
            this.entryType = builder.entryType;
            this.ipVersion = builder.ipVersion;
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
         * @return entryType
         */
        public String getEntryType() {
            return this.entryType;
        }

        /**
         * @return ipVersion
         */
        public String getIpVersion() {
            return this.ipVersion;
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
            private String entryType; 
            private String ipVersion; 
            private String networkAclEntryId; 
            private String networkAclEntryName; 
            private String policy; 
            private String port; 
            private String protocol; 

            private Builder() {
            } 

            private Builder(EgressAclEntry model) {
                this.description = model.description;
                this.destinationCidrIp = model.destinationCidrIp;
                this.entryType = model.entryType;
                this.ipVersion = model.ipVersion;
                this.networkAclEntryId = model.networkAclEntryId;
                this.networkAclEntryName = model.networkAclEntryName;
                this.policy = model.policy;
                this.port = model.port;
                this.protocol = model.protocol;
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
             * <p>The type of the inbound rule.</p>
             * <ul>
             * <li><p><strong>custom</strong></p>
             * </li>
             * <li><p><strong>system</strong></p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder entryType(String entryType) {
                this.entryType = entryType;
                return this;
            }

            /**
             * <p>The IP version. Valid values:</p>
             * <ul>
             * <li><strong>IPv4</strong></li>
             * <li><strong>IPv6</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IPv4</p>
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * <p>The ID of the outbound rule.</p>
             * 
             * <strong>example:</strong>
             * <p>nae-a2d447uw4tillxdcv****</p>
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
             * <p>The protocol type. Valid values:</p>
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
     * {@link DescribeNetworkAclAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkAclAttributesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(EgressAclEntries model) {
                this.egressAclEntry = model.egressAclEntry;
            } 

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
     * {@link DescribeNetworkAclAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkAclAttributesResponseBody</p>
     */
    public static class IngressAclEntry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EntryType")
        private String entryType;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private String ipVersion;

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
            this.entryType = builder.entryType;
            this.ipVersion = builder.ipVersion;
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
         * @return entryType
         */
        public String getEntryType() {
            return this.entryType;
        }

        /**
         * @return ipVersion
         */
        public String getIpVersion() {
            return this.ipVersion;
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
            private String entryType; 
            private String ipVersion; 
            private String networkAclEntryId; 
            private String networkAclEntryName; 
            private String policy; 
            private String port; 
            private String protocol; 
            private String sourceCidrIp; 

            private Builder() {
            } 

            private Builder(IngressAclEntry model) {
                this.description = model.description;
                this.entryType = model.entryType;
                this.ipVersion = model.ipVersion;
                this.networkAclEntryId = model.networkAclEntryId;
                this.networkAclEntryName = model.networkAclEntryName;
                this.policy = model.policy;
                this.port = model.port;
                this.protocol = model.protocol;
                this.sourceCidrIp = model.sourceCidrIp;
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
             * <p>The type of the inbound rule.</p>
             * <ul>
             * <li><p><strong>custom</strong></p>
             * </li>
             * <li><p><strong>system</strong></p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder entryType(String entryType) {
                this.entryType = entryType;
                return this;
            }

            /**
             * <p>The IP version. Valid values:</p>
             * <ul>
             * <li><strong>IPv4</strong></li>
             * <li><strong>IPv6</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IPv4</p>
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * <p>The ID of the inbound rule.</p>
             * 
             * <strong>example:</strong>
             * <p>nae-a2dk86arlydmevfbg****</p>
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
             * <p>The protocol type. Valid values:</p>
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
     * {@link DescribeNetworkAclAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkAclAttributesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(IngressAclEntries model) {
                this.ingressAclEntry = model.ingressAclEntry;
            } 

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
     * {@link DescribeNetworkAclAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkAclAttributesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Resource model) {
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.status = model.status;
            } 

            /**
             * <p>The ID of the associated resource.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1de348lntdwxscd****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The type of resource with which you want to associate the network ACL. The value is set to <strong>VSwitch</strong>.</p>
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
     * {@link DescribeNetworkAclAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkAclAttributesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Resources model) {
                this.resource = model.resource;
            } 

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
     * {@link DescribeNetworkAclAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkAclAttributesResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of tag N added to the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N added to the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
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
    /**
     * 
     * {@link DescribeNetworkAclAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkAclAttributesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

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
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkAclAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkAclAttributesResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private Long ownerId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Resources")
        private Resources resources;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private NetworkAclAttribute(Builder builder) {
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

            private Builder() {
            } 

            private Builder(NetworkAclAttribute model) {
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.egressAclEntries = model.egressAclEntries;
                this.ingressAclEntries = model.ingressAclEntries;
                this.networkAclId = model.networkAclId;
                this.networkAclName = model.networkAclName;
                this.ownerId = model.ownerId;
                this.regionId = model.regionId;
                this.resources = model.resources;
                this.status = model.status;
                this.tags = model.tags;
                this.vpcId = model.vpcId;
            } 

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
             * <p>The information about the outbound rules of the network ACL.</p>
             */
            public Builder egressAclEntries(EgressAclEntries egressAclEntries) {
                this.egressAclEntries = egressAclEntries;
                return this;
            }

            /**
             * <p>The information about the inbound rules of the network ACL.</p>
             */
            public Builder ingressAclEntries(IngressAclEntries ingressAclEntries) {
                this.ingressAclEntries = ingressAclEntries;
                return this;
            }

            /**
             * <p>The ID of the network ACL.</p>
             * 
             * <strong>example:</strong>
             * <p>nacl-a2do9e413e0spnhmj****</p>
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
             * <p>The ID of the Alibaba Cloud account to which the network ACL belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>253460731706911258</p>
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
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
             * <p>The resources that are associated with the network ACL.</p>
             */
            public Builder resources(Resources resources) {
                this.resources = resources;
                return this;
            }

            /**
             * <p>The association status of the resource. Valid values:</p>
             * <ul>
             * <li><strong>Available</strong></li>
             * <li><strong>Modifying</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The information about the tags.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the VPC to which the network ACL belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-a2d33rfpl72k5defr****</p>
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
