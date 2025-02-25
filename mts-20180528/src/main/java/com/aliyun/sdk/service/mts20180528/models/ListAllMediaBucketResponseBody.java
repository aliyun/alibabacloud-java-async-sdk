// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20180528.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAllMediaBucketResponseBody} extends {@link TeaModel}
 *
 * <p>ListAllMediaBucketResponseBody</p>
 */
public class ListAllMediaBucketResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MediaBucketList")
    private MediaBucketList mediaBucketList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAllMediaBucketResponseBody(Builder builder) {
        this.mediaBucketList = builder.mediaBucketList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAllMediaBucketResponseBody create() {
        return builder().build();
    }

    /**
     * @return mediaBucketList
     */
    public MediaBucketList getMediaBucketList() {
        return this.mediaBucketList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MediaBucketList mediaBucketList; 
        private String requestId; 

        /**
         * MediaBucketList.
         */
        public Builder mediaBucketList(MediaBucketList mediaBucketList) {
            this.mediaBucketList = mediaBucketList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAllMediaBucketResponseBody build() {
            return new ListAllMediaBucketResponseBody(this);
        } 

    } 

    public static class MediaBucket extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private MediaBucket(Builder builder) {
            this.bucket = builder.bucket;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaBucket create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String bucket; 
            private String type; 

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public MediaBucket build() {
                return new MediaBucket(this);
            } 

        } 

    }
    public static class MediaBucketList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MediaBucket")
        private java.util.List < MediaBucket> mediaBucket;

        private MediaBucketList(Builder builder) {
            this.mediaBucket = builder.mediaBucket;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaBucketList create() {
            return builder().build();
        }

        /**
         * @return mediaBucket
         */
        public java.util.List < MediaBucket> getMediaBucket() {
            return this.mediaBucket;
        }

        public static final class Builder {
            private java.util.List < MediaBucket> mediaBucket; 

            /**
             * MediaBucket.
             */
            public Builder mediaBucket(java.util.List < MediaBucket> mediaBucket) {
                this.mediaBucket = mediaBucket;
                return this;
            }

            public MediaBucketList build() {
                return new MediaBucketList(this);
            } 

        } 

    }
}
