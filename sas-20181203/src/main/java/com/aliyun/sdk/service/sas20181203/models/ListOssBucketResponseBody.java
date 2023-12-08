// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOssBucketResponseBody} extends {@link TeaModel}
 *
 * <p>ListOssBucketResponseBody</p>
 */
public class ListOssBucketResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private ListOssBucketResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOssBucketResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * The data that is returned.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListOssBucketResponseBody build() {
            return new ListOssBucketResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BucketName")
        private String bucketName;

        @NameInMap("Message")
        private String message;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("StorageClass")
        private String storageClass;

        @NameInMap("Support")
        private Boolean support;

        @NameInMap("SupportConfig")
        private String supportConfig;

        private Data(Builder builder) {
            this.bucketName = builder.bucketName;
            this.message = builder.message;
            this.regionId = builder.regionId;
            this.storageClass = builder.storageClass;
            this.support = builder.support;
            this.supportConfig = builder.supportConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return storageClass
         */
        public String getStorageClass() {
            return this.storageClass;
        }

        /**
         * @return support
         */
        public Boolean getSupport() {
            return this.support;
        }

        /**
         * @return supportConfig
         */
        public String getSupportConfig() {
            return this.supportConfig;
        }

        public static final class Builder {
            private String bucketName; 
            private String message; 
            private String regionId; 
            private String storageClass; 
            private Boolean support; 
            private String supportConfig; 

            /**
             * The name of the bucket.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * The reason why the bucket cannot be checked.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The storage class of the bucket. Valid values:
             * <p>
             * 
             * *   Standard (default)
             * *   IA
             * *   Archive
             * *   ColdArchive
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            /**
             * Indicates whether the bucket can be checked. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder support(Boolean support) {
                this.support = support;
                return this;
            }

            /**
             * SupportConfig.
             */
            public Builder supportConfig(String supportConfig) {
                this.supportConfig = supportConfig;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
