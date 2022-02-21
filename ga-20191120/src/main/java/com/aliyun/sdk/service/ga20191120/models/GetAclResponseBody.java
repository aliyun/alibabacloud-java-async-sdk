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

    private GetAclResponseBody(Builder builder) {
        this.aclEntries = builder.aclEntries;
        this.aclId = builder.aclId;
        this.aclName = builder.aclName;
        this.aclStatus = builder.aclStatus;
        this.addressIPVersion = builder.addressIPVersion;
        this.relatedListeners = builder.relatedListeners;
        this.requestId = builder.requestId;
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

    public static final class Builder {
        private java.util.List < AclEntries> aclEntries; 
        private String aclId; 
        private String aclName; 
        private String aclStatus; 
        private String addressIPVersion; 
        private java.util.List < RelatedListeners> relatedListeners; 
        private String requestId; 

        /**
         * AclEntries.
         */
        public Builder aclEntries(java.util.List < AclEntries> aclEntries) {
            this.aclEntries = aclEntries;
            return this;
        }

        /**
         * AclId.
         */
        public Builder aclId(String aclId) {
            this.aclId = aclId;
            return this;
        }

        /**
         * AclName.
         */
        public Builder aclName(String aclName) {
            this.aclName = aclName;
            return this;
        }

        /**
         * AclStatus.
         */
        public Builder aclStatus(String aclStatus) {
            this.aclStatus = aclStatus;
            return this;
        }

        /**
         * AddressIPVersion.
         */
        public Builder addressIPVersion(String addressIPVersion) {
            this.addressIPVersion = addressIPVersion;
            return this;
        }

        /**
         * RelatedListeners.
         */
        public Builder relatedListeners(java.util.List < RelatedListeners> relatedListeners) {
            this.relatedListeners = relatedListeners;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
             * Entry.
             */
            public Builder entry(String entry) {
                this.entry = entry;
                return this;
            }

            /**
             * EntryDescription.
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
             * AcceleratorId.
             */
            public Builder acceleratorId(String acceleratorId) {
                this.acceleratorId = acceleratorId;
                return this;
            }

            /**
             * AclType.
             */
            public Builder aclType(String aclType) {
                this.aclType = aclType;
                return this;
            }

            /**
             * ListenerId.
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
}
