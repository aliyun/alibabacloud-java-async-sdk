// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOssScanConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetOssScanConfigResponseBody</p>
 */
public class GetOssScanConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetOssScanConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOssScanConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The response parameters.
         */
        public Builder data(Data data) {
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

        public GetOssScanConfigResponseBody build() {
            return new GetOssScanConfigResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllKeyPrefix")
        private Boolean allKeyPrefix;

        @com.aliyun.core.annotation.NameInMap("BucketCount")
        private Integer bucketCount;

        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("BucketNameList")
        private java.util.List < String > bucketNameList;

        @com.aliyun.core.annotation.NameInMap("DecompressMaxFileCount")
        private Integer decompressMaxFileCount;

        @com.aliyun.core.annotation.NameInMap("DecompressMaxLayer")
        private Integer decompressMaxLayer;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Integer enable;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("KeyPrefixList")
        private java.util.List < String > keyPrefixList;

        @com.aliyun.core.annotation.NameInMap("KeySuffixList")
        private java.util.List < String > keySuffixList;

        @com.aliyun.core.annotation.NameInMap("LastUpdateTime")
        private Long lastUpdateTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ScanDayList")
        private java.util.List < Integer > scanDayList;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private Data(Builder builder) {
            this.allKeyPrefix = builder.allKeyPrefix;
            this.bucketCount = builder.bucketCount;
            this.bucketName = builder.bucketName;
            this.bucketNameList = builder.bucketNameList;
            this.decompressMaxFileCount = builder.decompressMaxFileCount;
            this.decompressMaxLayer = builder.decompressMaxLayer;
            this.enable = builder.enable;
            this.endTime = builder.endTime;
            this.id = builder.id;
            this.keyPrefixList = builder.keyPrefixList;
            this.keySuffixList = builder.keySuffixList;
            this.lastUpdateTime = builder.lastUpdateTime;
            this.name = builder.name;
            this.scanDayList = builder.scanDayList;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return allKeyPrefix
         */
        public Boolean getAllKeyPrefix() {
            return this.allKeyPrefix;
        }

        /**
         * @return bucketCount
         */
        public Integer getBucketCount() {
            return this.bucketCount;
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return bucketNameList
         */
        public java.util.List < String > getBucketNameList() {
            return this.bucketNameList;
        }

        /**
         * @return decompressMaxFileCount
         */
        public Integer getDecompressMaxFileCount() {
            return this.decompressMaxFileCount;
        }

        /**
         * @return decompressMaxLayer
         */
        public Integer getDecompressMaxLayer() {
            return this.decompressMaxLayer;
        }

        /**
         * @return enable
         */
        public Integer getEnable() {
            return this.enable;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return keyPrefixList
         */
        public java.util.List < String > getKeyPrefixList() {
            return this.keyPrefixList;
        }

        /**
         * @return keySuffixList
         */
        public java.util.List < String > getKeySuffixList() {
            return this.keySuffixList;
        }

        /**
         * @return lastUpdateTime
         */
        public Long getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return scanDayList
         */
        public java.util.List < Integer > getScanDayList() {
            return this.scanDayList;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Boolean allKeyPrefix; 
            private Integer bucketCount; 
            private String bucketName; 
            private java.util.List < String > bucketNameList; 
            private Integer decompressMaxFileCount; 
            private Integer decompressMaxLayer; 
            private Integer enable; 
            private String endTime; 
            private String id; 
            private java.util.List < String > keyPrefixList; 
            private java.util.List < String > keySuffixList; 
            private Long lastUpdateTime; 
            private String name; 
            private java.util.List < Integer > scanDayList; 
            private String startTime; 

            /**
             * Whether to match all file prefixes.
             */
            public Builder allKeyPrefix(Boolean allKeyPrefix) {
                this.allKeyPrefix = allKeyPrefix;
                return this;
            }

            /**
             * The number of the buckets.
             */
            public Builder bucketCount(Integer bucketCount) {
                this.bucketCount = bucketCount;
                return this;
            }

            /**
             * The name of the bucket.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * The names of the buckets.
             */
            public Builder bucketNameList(java.util.List < String > bucketNameList) {
                this.bucketNameList = bucketNameList;
                return this;
            }

            /**
             * DecompressMaxFileCount.
             */
            public Builder decompressMaxFileCount(Integer decompressMaxFileCount) {
                this.decompressMaxFileCount = decompressMaxFileCount;
                return this;
            }

            /**
             * DecompressMaxLayer.
             */
            public Builder decompressMaxLayer(Integer decompressMaxLayer) {
                this.decompressMaxLayer = decompressMaxLayer;
                return this;
            }

            /**
             * Indicates whether the check policy is enabled. Valid values:
             * <p>
             * 
             * *   **1**: enabled.
             * *   **0**: disabled.
             */
            public Builder enable(Integer enable) {
                this.enable = enable;
                return this;
            }

            /**
             * The end time of the check. The time is in the HH:mm:ss format.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The ID of the policy.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The prefixes of the object that you want to check.
             */
            public Builder keyPrefixList(java.util.List < String > keyPrefixList) {
                this.keyPrefixList = keyPrefixList;
                return this;
            }

            /**
             * The suffixes of the objects that are checked.
             */
            public Builder keySuffixList(java.util.List < String > keySuffixList) {
                this.keySuffixList = keySuffixList;
                return this;
            }

            /**
             * The time when the policy last update.
             */
            public Builder lastUpdateTime(Long lastUpdateTime) {
                this.lastUpdateTime = lastUpdateTime;
                return this;
            }

            /**
             * The name of the policy.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The days when the check is performed. The value indicates the days of the week.
             */
            public Builder scanDayList(java.util.List < Integer > scanDayList) {
                this.scanDayList = scanDayList;
                return this;
            }

            /**
             * The start time of the check. The time is in the HH:mm:ss format.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
