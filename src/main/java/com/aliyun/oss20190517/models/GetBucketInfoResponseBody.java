// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetBucketInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetBucketInfoResponseBody</p>
 */
public class GetBucketInfoResponseBody extends TeaModel {
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
    public BucketInfo bucketInfo() {
        return this.bucketInfo;
    }

    public static final class Builder {
        private BucketInfo bucketInfo; 

        /**
         * <p>Bucket.</p>
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
        public String grant() {
            return this.grant;
        }

        public static final class Builder {
            private String grant; 

            /**
             * <p>Grant.</p>
             */
            public Builder grant(String grant) {
                this.grant = grant;
                return this;
            }

            public AccessControlList build() {
                return new AccessControlList(this);
            } 

        } 

    }
    public static class BucketInfo extends TeaModel {
        @NameInMap("CreationDate")
        private String creationDate;

        @NameInMap("ExtranetEndpoint")
        private String extranetEndpoint;

        @NameInMap("IntranetEndpoint")
        private String intranetEndpoint;

        @NameInMap("Location")
        private String location;

        @NameInMap("StorageClass")
        private StorageClass storageClass;

        @NameInMap("TransferAcceleration")
        private String transferAcceleration;

        @NameInMap("CrossRegionReplication")
        private String crossRegionReplication;

        @NameInMap("Name")
        private String name;

        @NameInMap("Owner")
        private Owner owner;

        @NameInMap("AccessControlList")
        private AccessControlList accessControlList;

        @NameInMap("Comment")
        private String comment;


        private BucketInfo(Builder builder) {
            this.creationDate = builder.creationDate;
            this.extranetEndpoint = builder.extranetEndpoint;
            this.intranetEndpoint = builder.intranetEndpoint;
            this.location = builder.location;
            this.storageClass = builder.storageClass;
            this.transferAcceleration = builder.transferAcceleration;
            this.crossRegionReplication = builder.crossRegionReplication;
            this.name = builder.name;
            this.owner = builder.owner;
            this.accessControlList = builder.accessControlList;
            this.comment = builder.comment;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BucketInfo create() {
            return builder().build();
        }

        /**
         * @return creationDate
         */
        public String creationDate() {
            return this.creationDate;
        }

        /**
         * @return extranetEndpoint
         */
        public String extranetEndpoint() {
            return this.extranetEndpoint;
        }

        /**
         * @return intranetEndpoint
         */
        public String intranetEndpoint() {
            return this.intranetEndpoint;
        }

        /**
         * @return location
         */
        public String location() {
            return this.location;
        }

        /**
         * @return storageClass
         */
        public StorageClass storageClass() {
            return this.storageClass;
        }

        /**
         * @return transferAcceleration
         */
        public String transferAcceleration() {
            return this.transferAcceleration;
        }

        /**
         * @return crossRegionReplication
         */
        public String crossRegionReplication() {
            return this.crossRegionReplication;
        }

        /**
         * @return name
         */
        public String name() {
            return this.name;
        }

        /**
         * @return owner
         */
        public Owner owner() {
            return this.owner;
        }

        /**
         * @return accessControlList
         */
        public AccessControlList accessControlList() {
            return this.accessControlList;
        }

        /**
         * @return comment
         */
        public String comment() {
            return this.comment;
        }

        public static final class Builder {
            private String creationDate; 
            private String extranetEndpoint; 
            private String intranetEndpoint; 
            private String location; 
            private StorageClass storageClass; 
            private String transferAcceleration; 
            private String crossRegionReplication; 
            private String name; 
            private Owner owner; 
            private AccessControlList accessControlList; 
            private String comment; 

            /**
             * <p>CreationDate.</p>
             */
            public Builder creationDate(String creationDate) {
                this.creationDate = creationDate;
                return this;
            }

            /**
             * <p>ExtranetEndpoint.</p>
             */
            public Builder extranetEndpoint(String extranetEndpoint) {
                this.extranetEndpoint = extranetEndpoint;
                return this;
            }

            /**
             * <p>IntranetEndpoint.</p>
             */
            public Builder intranetEndpoint(String intranetEndpoint) {
                this.intranetEndpoint = intranetEndpoint;
                return this;
            }

            /**
             * <p>Location.</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>StorageClass.</p>
             */
            public Builder storageClass(StorageClass storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            /**
             * <p>TransferAcceleration.</p>
             */
            public Builder transferAcceleration(String transferAcceleration) {
                this.transferAcceleration = transferAcceleration;
                return this;
            }

            /**
             * <p>CrossRegionReplication.</p>
             */
            public Builder crossRegionReplication(String crossRegionReplication) {
                this.crossRegionReplication = crossRegionReplication;
                return this;
            }

            /**
             * <p>Name.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Owner.</p>
             */
            public Builder owner(Owner owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>AccessControlList.</p>
             */
            public Builder accessControlList(AccessControlList accessControlList) {
                this.accessControlList = accessControlList;
                return this;
            }

            /**
             * <p>Comment.</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            public BucketInfo build() {
                return new BucketInfo(this);
            } 

        } 

    }
}
