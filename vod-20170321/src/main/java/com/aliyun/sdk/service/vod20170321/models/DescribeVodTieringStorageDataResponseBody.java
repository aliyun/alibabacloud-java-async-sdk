// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4AF6-D7393642CA58****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The storage usage data returned.</p>
         */
        public Builder storageData(java.util.List < StorageData> storageData) {
            this.storageData = storageData;
            return this;
        }

        public DescribeVodTieringStorageDataResponseBody build() {
            return new DescribeVodTieringStorageDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodTieringStorageDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodTieringStorageDataResponseBody</p>
     */
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
             * <p>The data that is stored less than a month. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder lessthanMonthDatasize(Long lessthanMonthDatasize) {
                this.lessthanMonthDatasize = lessthanMonthDatasize;
                return this;
            }

            /**
             * <p>The region in which data is queried.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The storage type.</p>
             * 
             * <strong>example:</strong>
             * <p>IA</p>
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            /**
             * <p>The storage usage. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder storageUtilization(Long storageUtilization) {
                this.storageUtilization = storageUtilization;
                return this;
            }

            /**
             * <p>The timestamp of the data returned. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-29T01:00:00Z</p>
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
