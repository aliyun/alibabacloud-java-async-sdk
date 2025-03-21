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
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E10BAF1C-A6C5-51E2-866C-76D5922E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetOssScanConfigResponseBody build() {
            return new GetOssScanConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOssScanConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetOssScanConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllKeyPrefix")
        private Boolean allKeyPrefix;

        @com.aliyun.core.annotation.NameInMap("BucketCount")
        private Integer bucketCount;

        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("BucketNameList")
        private java.util.List<String> bucketNameList;

        @com.aliyun.core.annotation.NameInMap("DecompressMaxFileCount")
        private Integer decompressMaxFileCount;

        @com.aliyun.core.annotation.NameInMap("DecompressMaxLayer")
        private Integer decompressMaxLayer;

        @com.aliyun.core.annotation.NameInMap("DecryptionList")
        private java.util.List<String> decryptionList;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Integer enable;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("KeyPrefixList")
        private java.util.List<String> keyPrefixList;

        @com.aliyun.core.annotation.NameInMap("KeySuffixList")
        private java.util.List<String> keySuffixList;

        @com.aliyun.core.annotation.NameInMap("LastModifiedStartTime")
        private Long lastModifiedStartTime;

        @com.aliyun.core.annotation.NameInMap("LastUpdateTime")
        private Long lastUpdateTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ScanDayList")
        private java.util.List<Integer> scanDayList;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private Data(Builder builder) {
            this.allKeyPrefix = builder.allKeyPrefix;
            this.bucketCount = builder.bucketCount;
            this.bucketName = builder.bucketName;
            this.bucketNameList = builder.bucketNameList;
            this.decompressMaxFileCount = builder.decompressMaxFileCount;
            this.decompressMaxLayer = builder.decompressMaxLayer;
            this.decryptionList = builder.decryptionList;
            this.enable = builder.enable;
            this.endTime = builder.endTime;
            this.id = builder.id;
            this.keyPrefixList = builder.keyPrefixList;
            this.keySuffixList = builder.keySuffixList;
            this.lastModifiedStartTime = builder.lastModifiedStartTime;
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
        public java.util.List<String> getBucketNameList() {
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
         * @return decryptionList
         */
        public java.util.List<String> getDecryptionList() {
            return this.decryptionList;
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
        public java.util.List<String> getKeyPrefixList() {
            return this.keyPrefixList;
        }

        /**
         * @return keySuffixList
         */
        public java.util.List<String> getKeySuffixList() {
            return this.keySuffixList;
        }

        /**
         * @return lastModifiedStartTime
         */
        public Long getLastModifiedStartTime() {
            return this.lastModifiedStartTime;
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
        public java.util.List<Integer> getScanDayList() {
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
            private java.util.List<String> bucketNameList; 
            private Integer decompressMaxFileCount; 
            private Integer decompressMaxLayer; 
            private java.util.List<String> decryptionList; 
            private Integer enable; 
            private String endTime; 
            private String id; 
            private java.util.List<String> keyPrefixList; 
            private java.util.List<String> keySuffixList; 
            private Long lastModifiedStartTime; 
            private Long lastUpdateTime; 
            private String name; 
            private java.util.List<Integer> scanDayList; 
            private String startTime; 

            /**
             * <p>Indicates whether the prefixes of all objects are matched.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder allKeyPrefix(Boolean allKeyPrefix) {
                this.allKeyPrefix = allKeyPrefix;
                return this;
            }

            /**
             * <p>The number of buckets.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bucketCount(Integer bucketCount) {
                this.bucketCount = bucketCount;
                return this;
            }

            /**
             * <p>The name of the bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>hz-new01****</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The names of the buckets.</p>
             */
            public Builder bucketNameList(java.util.List<String> bucketNameList) {
                this.bucketNameList = bucketNameList;
                return this;
            }

            /**
             * <p>The maximum number of objects that can be extracted during decompression. Valid values: 1 to 1000. If the maximum number of objects that can be extracted is reached, the decompression operation immediately ends and the detection of extracted objects is not affected.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder decompressMaxFileCount(Integer decompressMaxFileCount) {
                this.decompressMaxFileCount = decompressMaxFileCount;
                return this;
            }

            /**
             * <p>The maximum number of decompression levels when multi-level packages are decompressed. Valid values: 1 to 5. If the maximum number of decompression levels is reached, the decompression operation immediately ends and the detection of extracted objects is not affected.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder decompressMaxLayer(Integer decompressMaxLayer) {
                this.decompressMaxLayer = decompressMaxLayer;
                return this;
            }

            /**
             * <p>The decryption methods.</p>
             */
            public Builder decryptionList(java.util.List<String> decryptionList) {
                this.decryptionList = decryptionList;
                return this;
            }

            /**
             * <p>Indicates whether the check policy is enabled. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: enabled.</li>
             * <li><strong>0</strong>: disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder enable(Integer enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The end time of the check. The time is in the HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1274****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The prefixes of the objects.</p>
             */
            public Builder keyPrefixList(java.util.List<String> keyPrefixList) {
                this.keyPrefixList = keyPrefixList;
                return this;
            }

            /**
             * <p>The suffixes of the objects that are checked.</p>
             */
            public Builder keySuffixList(java.util.List<String> keySuffixList) {
                this.keySuffixList = keySuffixList;
                return this;
            }

            /**
             * <p>The timestamp when the object was last modified. The time must be later than the timestamp that you specify. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1724301769834</p>
             */
            public Builder lastModifiedStartTime(Long lastModifiedStartTime) {
                this.lastModifiedStartTime = lastModifiedStartTime;
                return this;
            }

            /**
             * <p>The timestamp when the configuration was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1702025633079</p>
             */
            public Builder lastUpdateTime(Long lastUpdateTime) {
                this.lastUpdateTime = lastUpdateTime;
                return this;
            }

            /**
             * <p>The policy name.</p>
             * 
             * <strong>example:</strong>
             * <p>test0104</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The days when the check is performed. The value indicates the days of the week.</p>
             */
            public Builder scanDayList(java.util.List<Integer> scanDayList) {
                this.scanDayList = scanDayList;
                return this;
            }

            /**
             * <p>The start time of the check. The time is in the HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
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
