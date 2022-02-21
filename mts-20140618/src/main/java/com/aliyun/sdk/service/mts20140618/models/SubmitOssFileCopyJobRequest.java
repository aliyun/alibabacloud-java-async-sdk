// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitOssFileCopyJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitOssFileCopyJobRequest</p>
 */
public class SubmitOssFileCopyJobRequest extends Request {
    @Query
    @NameInMap("Notify")
    private String notify;

    @Query
    @NameInMap("Region")
    private String region;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SourceStorage")
    private SourceStorage sourceStorage;

    @Query
    @NameInMap("TargetStorage")
    private TargetStorage targetStorage;

    @Query
    @NameInMap("UserData")
    private String userData;

    private SubmitOssFileCopyJobRequest(Builder builder) {
        super(builder);
        this.notify = builder.notify;
        this.region = builder.region;
        this.regionId = builder.regionId;
        this.sourceStorage = builder.sourceStorage;
        this.targetStorage = builder.targetStorage;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitOssFileCopyJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return notify
     */
    public String getNotify() {
        return this.notify;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sourceStorage
     */
    public SourceStorage getSourceStorage() {
        return this.sourceStorage;
    }

    /**
     * @return targetStorage
     */
    public TargetStorage getTargetStorage() {
        return this.targetStorage;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitOssFileCopyJobRequest, Builder> {
        private String notify; 
        private String region; 
        private String regionId; 
        private SourceStorage sourceStorage; 
        private TargetStorage targetStorage; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitOssFileCopyJobRequest response) {
            super(response);
            this.notify = response.notify;
            this.region = response.region;
            this.regionId = response.regionId;
            this.sourceStorage = response.sourceStorage;
            this.targetStorage = response.targetStorage;
            this.userData = response.userData;
        } 

        /**
         * Notify.
         */
        public Builder notify(String notify) {
            this.putQueryParameter("Notify", notify);
            this.notify = notify;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SourceStorage.
         */
        public Builder sourceStorage(SourceStorage sourceStorage) {
            this.putQueryParameter("SourceStorage", sourceStorage);
            this.sourceStorage = sourceStorage;
            return this;
        }

        /**
         * TargetStorage.
         */
        public Builder targetStorage(TargetStorage targetStorage) {
            this.putQueryParameter("TargetStorage", targetStorage);
            this.targetStorage = targetStorage;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitOssFileCopyJobRequest build() {
            return new SubmitOssFileCopyJobRequest(this);
        } 

    } 

    public static class SourceStorage extends TeaModel {
        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("BucketOwnerId")
        private Long bucketOwnerId;

        @NameInMap("FileNames")
        private String fileNames;

        @NameInMap("ObjectPrefix")
        private String objectPrefix;

        @NameInMap("ObjectRoleName")
        private String objectRoleName;

        @NameInMap("S3AccessKey")
        private String s3AccessKey;

        @NameInMap("S3Endpoint")
        private String s3Endpoint;

        @NameInMap("S3Provider")
        private String s3Provider;

        @NameInMap("S3SecretKey")
        private String s3SecretKey;

        @NameInMap("S3SessionToken")
        private String s3SessionToken;

        private SourceStorage(Builder builder) {
            this.bucket = builder.bucket;
            this.bucketOwnerId = builder.bucketOwnerId;
            this.fileNames = builder.fileNames;
            this.objectPrefix = builder.objectPrefix;
            this.objectRoleName = builder.objectRoleName;
            this.s3AccessKey = builder.s3AccessKey;
            this.s3Endpoint = builder.s3Endpoint;
            this.s3Provider = builder.s3Provider;
            this.s3SecretKey = builder.s3SecretKey;
            this.s3SessionToken = builder.s3SessionToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceStorage create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return bucketOwnerId
         */
        public Long getBucketOwnerId() {
            return this.bucketOwnerId;
        }

        /**
         * @return fileNames
         */
        public String getFileNames() {
            return this.fileNames;
        }

        /**
         * @return objectPrefix
         */
        public String getObjectPrefix() {
            return this.objectPrefix;
        }

        /**
         * @return objectRoleName
         */
        public String getObjectRoleName() {
            return this.objectRoleName;
        }

        /**
         * @return s3AccessKey
         */
        public String getS3AccessKey() {
            return this.s3AccessKey;
        }

        /**
         * @return s3Endpoint
         */
        public String getS3Endpoint() {
            return this.s3Endpoint;
        }

        /**
         * @return s3Provider
         */
        public String getS3Provider() {
            return this.s3Provider;
        }

        /**
         * @return s3SecretKey
         */
        public String getS3SecretKey() {
            return this.s3SecretKey;
        }

        /**
         * @return s3SessionToken
         */
        public String getS3SessionToken() {
            return this.s3SessionToken;
        }

        public static final class Builder {
            private String bucket; 
            private Long bucketOwnerId; 
            private String fileNames; 
            private String objectPrefix; 
            private String objectRoleName; 
            private String s3AccessKey; 
            private String s3Endpoint; 
            private String s3Provider; 
            private String s3SecretKey; 
            private String s3SessionToken; 

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * BucketOwnerId.
             */
            public Builder bucketOwnerId(Long bucketOwnerId) {
                this.bucketOwnerId = bucketOwnerId;
                return this;
            }

            /**
             * FileNames.
             */
            public Builder fileNames(String fileNames) {
                this.fileNames = fileNames;
                return this;
            }

            /**
             * ObjectPrefix.
             */
            public Builder objectPrefix(String objectPrefix) {
                this.objectPrefix = objectPrefix;
                return this;
            }

            /**
             * ObjectRoleName.
             */
            public Builder objectRoleName(String objectRoleName) {
                this.objectRoleName = objectRoleName;
                return this;
            }

            /**
             * S3AccessKey.
             */
            public Builder s3AccessKey(String s3AccessKey) {
                this.s3AccessKey = s3AccessKey;
                return this;
            }

            /**
             * S3Endpoint.
             */
            public Builder s3Endpoint(String s3Endpoint) {
                this.s3Endpoint = s3Endpoint;
                return this;
            }

            /**
             * S3Provider.
             */
            public Builder s3Provider(String s3Provider) {
                this.s3Provider = s3Provider;
                return this;
            }

            /**
             * S3SecretKey.
             */
            public Builder s3SecretKey(String s3SecretKey) {
                this.s3SecretKey = s3SecretKey;
                return this;
            }

            /**
             * S3SessionToken.
             */
            public Builder s3SessionToken(String s3SessionToken) {
                this.s3SessionToken = s3SessionToken;
                return this;
            }

            public SourceStorage build() {
                return new SourceStorage(this);
            } 

        } 

    }
    public static class TargetStorage extends TeaModel {
        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("BucketOwnerId")
        private Long bucketOwnerId;

        @NameInMap("ObjectPrefix")
        private String objectPrefix;

        @NameInMap("ObjectRoleName")
        private String objectRoleName;

        @NameInMap("S3AccessKey")
        private String s3AccessKey;

        @NameInMap("S3Endpoint")
        private String s3Endpoint;

        @NameInMap("S3Provider")
        private String s3Provider;

        @NameInMap("S3SecretKey")
        private String s3SecretKey;

        @NameInMap("S3SessionToken")
        private String s3SessionToken;

        private TargetStorage(Builder builder) {
            this.bucket = builder.bucket;
            this.bucketOwnerId = builder.bucketOwnerId;
            this.objectPrefix = builder.objectPrefix;
            this.objectRoleName = builder.objectRoleName;
            this.s3AccessKey = builder.s3AccessKey;
            this.s3Endpoint = builder.s3Endpoint;
            this.s3Provider = builder.s3Provider;
            this.s3SecretKey = builder.s3SecretKey;
            this.s3SessionToken = builder.s3SessionToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetStorage create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return bucketOwnerId
         */
        public Long getBucketOwnerId() {
            return this.bucketOwnerId;
        }

        /**
         * @return objectPrefix
         */
        public String getObjectPrefix() {
            return this.objectPrefix;
        }

        /**
         * @return objectRoleName
         */
        public String getObjectRoleName() {
            return this.objectRoleName;
        }

        /**
         * @return s3AccessKey
         */
        public String getS3AccessKey() {
            return this.s3AccessKey;
        }

        /**
         * @return s3Endpoint
         */
        public String getS3Endpoint() {
            return this.s3Endpoint;
        }

        /**
         * @return s3Provider
         */
        public String getS3Provider() {
            return this.s3Provider;
        }

        /**
         * @return s3SecretKey
         */
        public String getS3SecretKey() {
            return this.s3SecretKey;
        }

        /**
         * @return s3SessionToken
         */
        public String getS3SessionToken() {
            return this.s3SessionToken;
        }

        public static final class Builder {
            private String bucket; 
            private Long bucketOwnerId; 
            private String objectPrefix; 
            private String objectRoleName; 
            private String s3AccessKey; 
            private String s3Endpoint; 
            private String s3Provider; 
            private String s3SecretKey; 
            private String s3SessionToken; 

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * BucketOwnerId.
             */
            public Builder bucketOwnerId(Long bucketOwnerId) {
                this.bucketOwnerId = bucketOwnerId;
                return this;
            }

            /**
             * ObjectPrefix.
             */
            public Builder objectPrefix(String objectPrefix) {
                this.objectPrefix = objectPrefix;
                return this;
            }

            /**
             * ObjectRoleName.
             */
            public Builder objectRoleName(String objectRoleName) {
                this.objectRoleName = objectRoleName;
                return this;
            }

            /**
             * S3AccessKey.
             */
            public Builder s3AccessKey(String s3AccessKey) {
                this.s3AccessKey = s3AccessKey;
                return this;
            }

            /**
             * S3Endpoint.
             */
            public Builder s3Endpoint(String s3Endpoint) {
                this.s3Endpoint = s3Endpoint;
                return this;
            }

            /**
             * S3Provider.
             */
            public Builder s3Provider(String s3Provider) {
                this.s3Provider = s3Provider;
                return this;
            }

            /**
             * S3SecretKey.
             */
            public Builder s3SecretKey(String s3SecretKey) {
                this.s3SecretKey = s3SecretKey;
                return this;
            }

            /**
             * S3SessionToken.
             */
            public Builder s3SessionToken(String s3SessionToken) {
                this.s3SessionToken = s3SessionToken;
                return this;
            }

            public TargetStorage build() {
                return new TargetStorage(this);
            } 

        } 

    }
}
