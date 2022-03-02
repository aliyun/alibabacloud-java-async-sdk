// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetBucketInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetBucketInfoResponseBody</p>
 */
public class GetBucketInfoResponseBody extends TeaModel {
    @ParentIgnore("BucketInfo")
    @NameInMap("Bucket")
    private BucketInfo bucketInfo;

    private GetBucketInfoResponseBody(Builder builder) {
        this.bucketInfo = builder.bucketInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return bucketInfo
     */
    public BucketInfo getBucketInfo() {
        return this.bucketInfo;
    }

    public static final class Builder {
        private BucketInfo bucketInfo; 

        /**
         * Bucket.
         */
        public Builder bucketInfo(BucketInfo bucketInfo) {
            this.bucketInfo = bucketInfo;
            return this;
        }

        public GetBucketInfoResponseBody build() {
            return new GetBucketInfoResponseBody(this);
        } 

    } 

    public static class AccessControlList extends TeaModel {
        @NameInMap("Grant")
        private String grant;

        private AccessControlList(Builder builder) {
            this.grant = builder.grant;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessControlList create() {
            return builder().build();
        }

        /**
         * @return grant
         */
        public String getGrant() {
            return this.grant;
        }

        public static final class Builder {
            private String grant; 

            /**
             * Grant.
             */
            public Builder grant(String grant) {
                this.grant = grant;
                return this;
            }

            /**
             * Grant.
             */
            public Builder grant(BucketACL grant) {
                this.grant = grant.getValue();
                return this;
            }

            public AccessControlList build() {
                return new AccessControlList(this);
            } 

        } 

    }
    public static class BucketInfo extends TeaModel {
        @NameInMap("AccessControlList")
        private AccessControlList accessControlList;

        @NameInMap("Comment")
        private String comment;

        @NameInMap("CreationDate")
        private String creationDate;

        @NameInMap("CrossRegionReplication")
        private String crossRegionReplication;

        @NameInMap("ExtranetEndpoint")
        private String extranetEndpoint;

        @NameInMap("IntranetEndpoint")
        private String intranetEndpoint;

        @NameInMap("Location")
        private String location;

        @NameInMap("Name")
        private String name;

        @NameInMap("Owner")
        private Owner owner;

        @NameInMap("StorageClass")
        private String storageClass;

        @NameInMap("TransferAcceleration")
        private String transferAcceleration;

        private BucketInfo(Builder builder) {
            this.accessControlList = builder.accessControlList;
            this.comment = builder.comment;
            this.creationDate = builder.creationDate;
            this.crossRegionReplication = builder.crossRegionReplication;
            this.extranetEndpoint = builder.extranetEndpoint;
            this.intranetEndpoint = builder.intranetEndpoint;
            this.location = builder.location;
            this.name = builder.name;
            this.owner = builder.owner;
            this.storageClass = builder.storageClass;
            this.transferAcceleration = builder.transferAcceleration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BucketInfo create() {
            return builder().build();
        }

        /**
         * @return accessControlList
         */
        public AccessControlList getAccessControlList() {
            return this.accessControlList;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return creationDate
         */
        public String getCreationDate() {
            return this.creationDate;
        }

        /**
         * @return crossRegionReplication
         */
        public String getCrossRegionReplication() {
            return this.crossRegionReplication;
        }

        /**
         * @return extranetEndpoint
         */
        public String getExtranetEndpoint() {
            return this.extranetEndpoint;
        }

        /**
         * @return intranetEndpoint
         */
        public String getIntranetEndpoint() {
            return this.intranetEndpoint;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public Owner getOwner() {
            return this.owner;
        }

        /**
         * @return storageClass
         */
        public String getStorageClass() {
            return this.storageClass;
        }

        /**
         * @return transferAcceleration
         */
        public String getTransferAcceleration() {
            return this.transferAcceleration;
        }

        public static final class Builder {
            private AccessControlList accessControlList; 
            private String comment; 
            private String creationDate; 
            private String crossRegionReplication; 
            private String extranetEndpoint; 
            private String intranetEndpoint; 
            private String location; 
            private String name; 
            private Owner owner; 
            private String storageClass; 
            private String transferAcceleration; 

            /**
             * AccessControlList.
             */
            public Builder accessControlList(AccessControlList accessControlList) {
                this.accessControlList = accessControlList;
                return this;
            }

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * CreationDate.
             */
            public Builder creationDate(String creationDate) {
                this.creationDate = creationDate;
                return this;
            }

            /**
             * CrossRegionReplication.
             */
            public Builder crossRegionReplication(String crossRegionReplication) {
                this.crossRegionReplication = crossRegionReplication;
                return this;
            }

            /**
             * ExtranetEndpoint.
             */
            public Builder extranetEndpoint(String extranetEndpoint) {
                this.extranetEndpoint = extranetEndpoint;
                return this;
            }

            /**
             * IntranetEndpoint.
             */
            public Builder intranetEndpoint(String intranetEndpoint) {
                this.intranetEndpoint = intranetEndpoint;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(Owner owner) {
                this.owner = owner;
                return this;
            }

            /**
             * StorageClass.
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            /**
             * StorageClass.
             */
            public Builder storageClass(StorageClass storageClass) {
                this.storageClass = storageClass.getValue();
                return this;
            }

            /**
             * TransferAcceleration.
             */
            public Builder transferAcceleration(String transferAcceleration) {
                this.transferAcceleration = transferAcceleration;
                return this;
            }

            public BucketInfo build() {
                return new BucketInfo(this);
            } 

        } 

    }
}
