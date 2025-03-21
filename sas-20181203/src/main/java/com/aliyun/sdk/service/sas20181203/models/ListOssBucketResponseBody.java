// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListOssBucketResponseBody} extends {@link TeaModel}
 *
 * <p>ListOssBucketResponseBody</p>
 */
public class ListOssBucketResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3956048F-9D73-5EDB-834B-4827BB48****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListOssBucketResponseBody build() {
            return new ListOssBucketResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOssBucketResponseBody} extends {@link TeaModel}
     *
     * <p>ListOssBucketResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("StorageClass")
        private String storageClass;

        @com.aliyun.core.annotation.NameInMap("Support")
        private Boolean support;

        @com.aliyun.core.annotation.NameInMap("SupportConfig")
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
             * <p>The name of the bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>iboxpublic****</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The reason why the bucket cannot be checked.</p>
             * 
             * <strong>example:</strong>
             * <p>Unsupported Region.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The storage class of the bucket. Valid values:</p>
             * <ul>
             * <li>Standard (default)</li>
             * <li>IA</li>
             * <li>Archive</li>
             * <li>ColdArchive</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            /**
             * <p>Indicates whether the bucket can be checked. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder support(Boolean support) {
                this.support = support;
                return this;
            }

            /**
             * <p>Whether to support config. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
