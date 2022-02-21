// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAllMediaBucketResponseBody} extends {@link TeaModel}
 *
 * <p>ListAllMediaBucketResponseBody</p>
 */
public class ListAllMediaBucketResponseBody extends TeaModel {
    @NameInMap("MediaBucketList")
    private MediaBucketList mediaBucketList;

    @NameInMap("NextPageToken")
    private String nextPageToken;

    @NameInMap("RequestId")
    private String requestId;

    private ListAllMediaBucketResponseBody(Builder builder) {
        this.mediaBucketList = builder.mediaBucketList;
        this.nextPageToken = builder.nextPageToken;
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
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MediaBucketList mediaBucketList; 
        private String nextPageToken; 
        private String requestId; 

        /**
         * MediaBucketList.
         */
        public Builder mediaBucketList(MediaBucketList mediaBucketList) {
            this.mediaBucketList = mediaBucketList;
            return this;
        }

        /**
         * NextPageToken.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
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
        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("Referer")
        private String referer;

        @NameInMap("Type")
        private String type;

        private MediaBucket(Builder builder) {
            this.bucket = builder.bucket;
            this.referer = builder.referer;
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
         * @return referer
         */
        public String getReferer() {
            return this.referer;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String bucket; 
            private String referer; 
            private String type; 

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * Referer.
             */
            public Builder referer(String referer) {
                this.referer = referer;
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
        @NameInMap("MediaBucket")
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
