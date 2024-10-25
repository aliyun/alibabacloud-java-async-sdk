// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetOssStorageAndAccByBucketsResponseBody} extends {@link TeaModel}
 *
 * <p>GetOssStorageAndAccByBucketsResponseBody</p>
 */
public class GetOssStorageAndAccByBucketsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BucketList")
    private java.util.List < BucketList> bucketList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetOssStorageAndAccByBucketsResponseBody(Builder builder) {
        this.bucketList = builder.bucketList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOssStorageAndAccByBucketsResponseBody create() {
        return builder().build();
    }

    /**
     * @return bucketList
     */
    public java.util.List < BucketList> getBucketList() {
        return this.bucketList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < BucketList> bucketList; 
        private String requestId; 

        /**
         * <p>The information about the bucket.</p>
         */
        public Builder bucketList(java.util.List < BucketList> bucketList) {
            this.bucketList = bucketList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>112F4860-F1B2-58DD-8FC0-75F19DA1C4BF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetOssStorageAndAccByBucketsResponseBody build() {
            return new GetOssStorageAndAccByBucketsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOssStorageAndAccByBucketsResponseBody} extends {@link TeaModel}
     *
     * <p>GetOssStorageAndAccByBucketsResponseBody</p>
     */
    public static class BucketList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Acc")
        private Long acc;

        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("StorageUsageByte")
        private Long storageUsageByte;

        private BucketList(Builder builder) {
            this.acc = builder.acc;
            this.bucket = builder.bucket;
            this.storageUsageByte = builder.storageUsageByte;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BucketList create() {
            return builder().build();
        }

        /**
         * @return acc
         */
        public Long getAcc() {
            return this.acc;
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return storageUsageByte
         */
        public Long getStorageUsageByte() {
            return this.storageUsageByte;
        }

        public static final class Builder {
            private Long acc; 
            private String bucket; 
            private Long storageUsageByte; 

            /**
             * <p>The number of times that the bucket is accessed.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder acc(Long acc) {
                this.acc = acc;
                return this;
            }

            /**
             * <p>The name of the bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>my-bucket</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The storage usage of the bucket. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder storageUsageByte(Long storageUsageByte) {
                this.storageUsageByte = storageUsageByte;
                return this;
            }

            public BucketList build() {
                return new BucketList(this);
            } 

        } 

    }
}
