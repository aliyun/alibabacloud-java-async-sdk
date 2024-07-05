// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodTieringStorageDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodTieringStorageDataResponseBody</p>
 */
public class DescribeVodTieringStorageDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StorageData")
    private java.util.List < StorageData> storageData;

    private DescribeVodTieringStorageDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.storageData = builder.storageData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodTieringStorageDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return storageData
     */
    public java.util.List < StorageData> getStorageData() {
        return this.storageData;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < StorageData> storageData; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The storage usage data returned.
         */
        public Builder storageData(java.util.List < StorageData> storageData) {
            this.storageData = storageData;
            return this;
        }

        public DescribeVodTieringStorageDataResponseBody build() {
            return new DescribeVodTieringStorageDataResponseBody(this);
        } 

    } 

    public static class StorageData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LessthanMonthDatasize")
        private Long lessthanMonthDatasize;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("StorageClass")
        private String storageClass;

        @com.aliyun.core.annotation.NameInMap("StorageUtilization")
        private Long storageUtilization;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private StorageData(Builder builder) {
            this.lessthanMonthDatasize = builder.lessthanMonthDatasize;
            this.region = builder.region;
            this.storageClass = builder.storageClass;
            this.storageUtilization = builder.storageUtilization;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageData create() {
            return builder().build();
        }

        /**
         * @return lessthanMonthDatasize
         */
        public Long getLessthanMonthDatasize() {
            return this.lessthanMonthDatasize;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return storageClass
         */
        public String getStorageClass() {
            return this.storageClass;
        }

        /**
         * @return storageUtilization
         */
        public Long getStorageUtilization() {
            return this.storageUtilization;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private Long lessthanMonthDatasize; 
            private String region; 
            private String storageClass; 
            private Long storageUtilization; 
            private String timeStamp; 

            /**
             * The data that is stored less than a month. Unit: bytes.
             */
            public Builder lessthanMonthDatasize(Long lessthanMonthDatasize) {
                this.lessthanMonthDatasize = lessthanMonthDatasize;
                return this;
            }

            /**
             * The region in which data is queried.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The storage type.
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            /**
             * The storage usage. Unit: bytes.
             */
            public Builder storageUtilization(Long storageUtilization) {
                this.storageUtilization = storageUtilization;
                return this;
            }

            /**
             * The timestamp of the data returned. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public StorageData build() {
                return new StorageData(this);
            } 

        } 

    }
}
