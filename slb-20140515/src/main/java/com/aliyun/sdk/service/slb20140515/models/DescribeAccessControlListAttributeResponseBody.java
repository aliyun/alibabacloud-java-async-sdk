// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccessControlListAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccessControlListAttributeResponseBody</p>
 */
public class DescribeAccessControlListAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AclEntrys")
    private AclEntrys aclEntrys;

    @com.aliyun.core.annotation.NameInMap("AclId")
    private String aclId;

    @com.aliyun.core.annotation.NameInMap("AclName")
    private String aclName;

    @com.aliyun.core.annotation.NameInMap("AddressIPVersion")
    private String addressIPVersion;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("RelatedListeners")
    private RelatedListeners relatedListeners;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private Tags tags;

    @com.aliyun.core.annotation.NameInMap("TotalAclEntry")
    private Integer totalAclEntry;

    private DescribeAccessControlListAttributeResponseBody(Builder builder) {
        this.aclEntrys = builder.aclEntrys;
        this.aclId = builder.aclId;
        this.aclName = builder.aclName;
        this.addressIPVersion = builder.addressIPVersion;
        this.createTime = builder.createTime;
        this.relatedListeners = builder.relatedListeners;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
        this.totalAclEntry = builder.totalAclEntry;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccessControlListAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return aclEntrys
     */
    public AclEntrys getAclEntrys() {
        return this.aclEntrys;
    }

    /**
     * @return aclId
     */
    public String getAclId() {
        return this.aclId;
    }

    /**
     * @return aclName
     */
    public String getAclName() {
        return this.aclName;
    }

    /**
     * @return addressIPVersion
     */
    public String getAddressIPVersion() {
        return this.addressIPVersion;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return relatedListeners
     */
    public RelatedListeners getRelatedListeners() {
        return this.relatedListeners;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tags
     */
    public Tags getTags() {
        return this.tags;
    }

    /**
     * @return totalAclEntry
     */
    public Integer getTotalAclEntry() {
        return this.totalAclEntry;
    }

    public static final class Builder {
        private AclEntrys aclEntrys; 
        private String aclId; 
        private String aclName; 
        private String addressIPVersion; 
        private String createTime; 
        private RelatedListeners relatedListeners; 
        private String requestId; 
        private String resourceGroupId; 
        private Tags tags; 
        private Integer totalAclEntry; 

        /**
         * The IP entries that you want to remove from the network ACL. Valid values:
         * <p>
         * 
         * *   **entry**: the IP address or CIDR block that you want to remove from the network ACL. Separate multiple IP addresses or CIDR blocks with commas (,).
         * *   **comment**: the description of the network ACL.
         */
        public Builder aclEntrys(AclEntrys aclEntrys) {
            this.aclEntrys = aclEntrys;
            return this;
        }

        /**
         * The ID of the network ACL.
         */
        public Builder aclId(String aclId) {
            this.aclId = aclId;
            return this;
        }

        /**
         * The ACL name. The name must be 1 to 80 characters in length, and can contain letters, digits, periods (.), hyphens (-), forward slashes (/), and underscores (\_). The name of each ACL must be unique within a region. Fuzzy match is supported.
         */
        public Builder aclName(String aclName) {
            this.aclName = aclName;
            return this;
        }

        /**
         * The IP version. Valid values: **ipv4** and **ipv6**.
         */
        public Builder addressIPVersion(String addressIPVersion) {
            this.addressIPVersion = addressIPVersion;
            return this;
        }

        /**
         * The time when the ACL was created. The time follows the `YYYY-MM-DDThh:mm:ssZ` format.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The listeners that are associated with the network ACL.
         */
        public Builder relatedListeners(RelatedListeners relatedListeners) {
            this.relatedListeners = relatedListeners;
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
         * The resource group ID.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The tags.
         */
        public Builder tags(Tags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * The total number of access control entries.
         */
        public Builder totalAclEntry(Integer totalAclEntry) {
            this.totalAclEntry = totalAclEntry;
            return this;
        }

        public DescribeAccessControlListAttributeResponseBody build() {
            return new DescribeAccessControlListAttributeResponseBody(this);
        } 

    } 

    public static class AclEntry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclEntryComment")
        private String aclEntryComment;

        @com.aliyun.core.annotation.NameInMap("AclEntryIP")
        private String aclEntryIP;

        private AclEntry(Builder builder) {
            this.aclEntryComment = builder.aclEntryComment;
            this.aclEntryIP = builder.aclEntryIP;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AclEntry create() {
            return builder().build();
        }

        /**
         * @return aclEntryComment
         */
        public String getAclEntryComment() {
            return this.aclEntryComment;
        }

        /**
         * @return aclEntryIP
         */
        public String getAclEntryIP() {
            return this.aclEntryIP;
        }

        public static final class Builder {
            private String aclEntryComment; 
            private String aclEntryIP; 

            /**
             * The description of the ACL entry.
             */
            public Builder aclEntryComment(String aclEntryComment) {
                this.aclEntryComment = aclEntryComment;
                return this;
            }

            /**
             * The IP address specified in the ACL entry.
             */
            public Builder aclEntryIP(String aclEntryIP) {
                this.aclEntryIP = aclEntryIP;
                return this;
            }

            public AclEntry build() {
                return new AclEntry(this);
            } 

        } 

    }
    public static class AclEntrys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclEntry")
        private java.util.List < AclEntry> aclEntry;

        private AclEntrys(Builder builder) {
            this.aclEntry = builder.aclEntry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AclEntrys create() {
            return builder().build();
        }

        /**
         * @return aclEntry
         */
        public java.util.List < AclEntry> getAclEntry() {
            return this.aclEntry;
        }

        public static final class Builder {
            private java.util.List < AclEntry> aclEntry; 

            /**
             * AclEntry.
             */
            public Builder aclEntry(java.util.List < AclEntry> aclEntry) {
                this.aclEntry = aclEntry;
                return this;
            }

            public AclEntrys build() {
                return new AclEntrys(this);
            } 

        } 

    }
    public static class RelatedListener extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclType")
        private String aclType;

        @com.aliyun.core.annotation.NameInMap("ListenerPort")
        private Integer listenerPort;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        private RelatedListener(Builder builder) {
            this.aclType = builder.aclType;
            this.listenerPort = builder.listenerPort;
            this.loadBalancerId = builder.loadBalancerId;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedListener create() {
            return builder().build();
        }

        /**
         * @return aclType
         */
        public String getAclType() {
            return this.aclType;
        }

        /**
         * @return listenerPort
         */
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private String aclType; 
            private Integer listenerPort; 
            private String loadBalancerId; 
            private String protocol; 

            /**
             * The type of ACL. Valid values:
             * <p>
             * 
             * *   **black**
             * *   **white**
             */
            public Builder aclType(String aclType) {
                this.aclType = aclType;
                return this;
            }

            /**
             * The frontend port of the listener with which the ACL is associated.
             */
            public Builder listenerPort(Integer listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * The CLB instance ID.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * The type of protocol that the associated listener uses.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public RelatedListener build() {
                return new RelatedListener(this);
            } 

        } 

    }
    public static class RelatedListeners extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RelatedListener")
        private java.util.List < RelatedListener> relatedListener;

        private RelatedListeners(Builder builder) {
            this.relatedListener = builder.relatedListener;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedListeners create() {
            return builder().build();
        }

        /**
         * @return relatedListener
         */
        public java.util.List < RelatedListener> getRelatedListener() {
            return this.relatedListener;
        }

        public static final class Builder {
            private java.util.List < RelatedListener> relatedListener; 

            /**
             * RelatedListener.
             */
            public Builder relatedListener(java.util.List < RelatedListener> relatedListener) {
                this.relatedListener = relatedListener;
                return this;
            }

            public RelatedListeners build() {
                return new RelatedListeners(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * The tag key.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
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
}
