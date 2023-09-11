// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAclResponseBody} extends {@link TeaModel}
 *
 * <p>GetAclResponseBody</p>
 */
public class GetAclResponseBody extends TeaModel {
    @NameInMap("AclEntries")
    private java.util.List < AclEntries> aclEntries;

    @NameInMap("AclId")
    private String aclId;

    @NameInMap("AclName")
    private String aclName;

    @NameInMap("AclStatus")
    private String aclStatus;

    @NameInMap("AddressIPVersion")
    private String addressIPVersion;

    @NameInMap("RelatedListeners")
    private java.util.List < RelatedListeners> relatedListeners;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    private GetAclResponseBody(Builder builder) {
        this.aclEntries = builder.aclEntries;
        this.aclId = builder.aclId;
        this.aclName = builder.aclName;
        this.aclStatus = builder.aclStatus;
        this.addressIPVersion = builder.addressIPVersion;
        this.relatedListeners = builder.relatedListeners;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAclResponseBody create() {
        return builder().build();
    }

    /**
     * @return aclEntries
     */
    public java.util.List < AclEntries> getAclEntries() {
        return this.aclEntries;
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
     * @return aclStatus
     */
    public String getAclStatus() {
        return this.aclStatus;
    }

    /**
     * @return addressIPVersion
     */
    public String getAddressIPVersion() {
        return this.addressIPVersion;
    }

    /**
     * @return relatedListeners
     */
    public java.util.List < RelatedListeners> getRelatedListeners() {
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
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    public static final class Builder {
        private java.util.List < AclEntries> aclEntries; 
        private String aclId; 
        private String aclName; 
        private String aclStatus; 
        private String addressIPVersion; 
        private java.util.List < RelatedListeners> relatedListeners; 
        private String requestId; 
        private String resourceGroupId; 
        private java.util.List < Tags> tags; 

        /**
         * The state of the network ACL. Valid values:
         * <p>
         * 
         * *   **init**: The network ACL is being initialized.
         * *   **active**: The network ACL is available.
         * *   **configuring**: The network ACL is being configured.
         * *   **updating**: The network ACL is being updated.
         * *   **deleting**: The network ACL is being deleted.
         */
        public Builder aclEntries(java.util.List < AclEntries> aclEntries) {
            this.aclEntries = aclEntries;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder aclId(String aclId) {
            this.aclId = aclId;
            return this;
        }

        /**
         * The ID of the GA instance.
         */
        public Builder aclName(String aclName) {
            this.aclName = aclName;
            return this;
        }

        /**
         * The IP version of the network ACL. Valid values:
         * <p>
         * 
         * *   **IPv4**
         * *   **IPv6**
         */
        public Builder aclStatus(String aclStatus) {
            this.aclStatus = aclStatus;
            return this;
        }

        /**
         * The ID of the network ACL.
         */
        public Builder addressIPVersion(String addressIPVersion) {
            this.addressIPVersion = addressIPVersion;
            return this;
        }

        /**
         * The description of the network ACL entry.
         */
        public Builder relatedListeners(java.util.List < RelatedListeners> relatedListeners) {
            this.relatedListeners = relatedListeners;
            return this;
        }

        /**
         * The ID of the network ACL.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The name of the network ACL.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.tags = tags;
            return this;
        }

        public GetAclResponseBody build() {
            return new GetAclResponseBody(this);
        } 

    } 

    public static class AclEntries extends TeaModel {
        @NameInMap("Entry")
        private String entry;

        @NameInMap("EntryDescription")
        private String entryDescription;

        private AclEntries(Builder builder) {
            this.entry = builder.entry;
            this.entryDescription = builder.entryDescription;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AclEntries create() {
            return builder().build();
        }

        /**
         * @return entry
         */
        public String getEntry() {
            return this.entry;
        }

        /**
         * @return entryDescription
         */
        public String getEntryDescription() {
            return this.entryDescription;
        }

        public static final class Builder {
            private String entry; 
            private String entryDescription; 

            /**
             * The list of network ACL entries that are returned. A maximum of 20 network ACL entries can be returned.
             */
            public Builder entry(String entry) {
                this.entry = entry;
                return this;
            }

            /**
             * The network ACL entry.
             */
            public Builder entryDescription(String entryDescription) {
                this.entryDescription = entryDescription;
                return this;
            }

            public AclEntries build() {
                return new AclEntries(this);
            } 

        } 

    }
    public static class RelatedListeners extends TeaModel {
        @NameInMap("AcceleratorId")
        private String acceleratorId;

        @NameInMap("AclType")
        private String aclType;

        @NameInMap("ListenerId")
        private String listenerId;

        private RelatedListeners(Builder builder) {
            this.acceleratorId = builder.acceleratorId;
            this.aclType = builder.aclType;
            this.listenerId = builder.listenerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedListeners create() {
            return builder().build();
        }

        /**
         * @return acceleratorId
         */
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        /**
         * @return aclType
         */
        public String getAclType() {
            return this.aclType;
        }

        /**
         * @return listenerId
         */
        public String getListenerId() {
            return this.listenerId;
        }

        public static final class Builder {
            private String acceleratorId; 
            private String aclType; 
            private String listenerId; 

            /**
             * The type of the network ACL.
             * <p>
             * 
             * *   **White**: a whitelist. Only requests from the IP addresses or CIDR blocks in the ACL are forwarded. Whitelists apply to scenarios in which you want to allow only specified IP addresses to access an application. Your service may be adversely affected if the whitelist is not properly configured. After you configure a whitelist for a listener, only requests from the IP addresses that are added to the whitelist are forwarded by the listener. If the whitelist is enabled but no IP addresses are added to the network ACL, the listener does not forward requests.
             * *   **Black**: a blacklist. All requests from the IP addresses or CIDR blocks in the ACL are blocked. Blacklists apply to scenarios in which you want to deny access from specific IP addresses to an application. If the blacklist is enabled but no IP addresses are added to the network ACL, the listener forwards all requests.
             */
            public Builder acceleratorId(String acceleratorId) {
                this.acceleratorId = acceleratorId;
                return this;
            }

            /**
             * The ID of the listener.
             */
            public Builder aclType(String aclType) {
                this.aclType = aclType;
                return this;
            }

            /**
             * The listeners that are associated with the network ACL.
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            public RelatedListeners build() {
                return new RelatedListeners(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * The tags of the ACL.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag key
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
}
