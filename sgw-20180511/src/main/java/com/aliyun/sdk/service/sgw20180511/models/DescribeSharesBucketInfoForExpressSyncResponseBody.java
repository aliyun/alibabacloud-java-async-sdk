// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSharesBucketInfoForExpressSyncResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSharesBucketInfoForExpressSyncResponseBody</p>
 */
public class DescribeSharesBucketInfoForExpressSyncResponseBody extends TeaModel {
    @NameInMap("BucketInfos")
    private BucketInfos bucketInfos;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeSharesBucketInfoForExpressSyncResponseBody(Builder builder) {
        this.bucketInfos = builder.bucketInfos;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSharesBucketInfoForExpressSyncResponseBody create() {
        return builder().build();
    }

    /**
     * @return bucketInfos
     */
    public BucketInfos getBucketInfos() {
        return this.bucketInfos;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private BucketInfos bucketInfos; 
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * BucketInfos.
         */
        public Builder bucketInfos(BucketInfos bucketInfos) {
            this.bucketInfos = bucketInfos;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeSharesBucketInfoForExpressSyncResponseBody build() {
            return new DescribeSharesBucketInfoForExpressSyncResponseBody(this);
        } 

    } 

    public static class BucketInfo extends TeaModel {
        @NameInMap("BucketName")
        private String bucketName;

        @NameInMap("BucketPrefix")
        private String bucketPrefix;

        @NameInMap("BucketRegion")
        private String bucketRegion;

        private BucketInfo(Builder builder) {
            this.bucketName = builder.bucketName;
            this.bucketPrefix = builder.bucketPrefix;
            this.bucketRegion = builder.bucketRegion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BucketInfo create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return bucketPrefix
         */
        public String getBucketPrefix() {
            return this.bucketPrefix;
        }

        /**
         * @return bucketRegion
         */
        public String getBucketRegion() {
            return this.bucketRegion;
        }

        public static final class Builder {
            private String bucketName; 
            private String bucketPrefix; 
            private String bucketRegion; 

            /**
             * BucketName.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * BucketPrefix.
             */
            public Builder bucketPrefix(String bucketPrefix) {
                this.bucketPrefix = bucketPrefix;
                return this;
            }

            /**
             * BucketRegion.
             */
            public Builder bucketRegion(String bucketRegion) {
                this.bucketRegion = bucketRegion;
                return this;
            }

            public BucketInfo build() {
                return new BucketInfo(this);
            } 

        } 

    }
    public static class BucketInfos extends TeaModel {
        @NameInMap("BucketInfo")
        private java.util.List < BucketInfo> bucketInfo;

        private BucketInfos(Builder builder) {
            this.bucketInfo = builder.bucketInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BucketInfos create() {
            return builder().build();
        }

        /**
         * @return bucketInfo
         */
        public java.util.List < BucketInfo> getBucketInfo() {
            return this.bucketInfo;
        }

        public static final class Builder {
            private java.util.List < BucketInfo> bucketInfo; 

            /**
             * BucketInfo.
             */
            public Builder bucketInfo(java.util.List < BucketInfo> bucketInfo) {
                this.bucketInfo = bucketInfo;
                return this;
            }

            public BucketInfos build() {
                return new BucketInfos(this);
            } 

        } 

    }
}
