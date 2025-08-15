// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ossmfd20231017.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetOssScanConfigResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
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

        @com.aliyun.core.annotation.NameInMap("RealTimeIncr")
        private Boolean realTimeIncr;

        @com.aliyun.core.annotation.NameInMap("ScanDayList")
        private java.util.List<Integer> scanDayList;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private Data(Builder builder) {
            this.allKeyPrefix = builder.allKeyPrefix;
            this.bucketCount = builder.bucketCount;
            this.bucketName = builder.bucketName;
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
            this.realTimeIncr = builder.realTimeIncr;
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
         * @return realTimeIncr
         */
        public Boolean getRealTimeIncr() {
            return this.realTimeIncr;
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
            private Boolean realTimeIncr; 
            private java.util.List<Integer> scanDayList; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.allKeyPrefix = model.allKeyPrefix;
                this.bucketCount = model.bucketCount;
                this.bucketName = model.bucketName;
                this.decompressMaxFileCount = model.decompressMaxFileCount;
                this.decompressMaxLayer = model.decompressMaxLayer;
                this.decryptionList = model.decryptionList;
                this.enable = model.enable;
                this.endTime = model.endTime;
                this.id = model.id;
                this.keyPrefixList = model.keyPrefixList;
                this.keySuffixList = model.keySuffixList;
                this.lastModifiedStartTime = model.lastModifiedStartTime;
                this.lastUpdateTime = model.lastUpdateTime;
                this.name = model.name;
                this.realTimeIncr = model.realTimeIncr;
                this.scanDayList = model.scanDayList;
                this.startTime = model.startTime;
            } 

            /**
             * AllKeyPrefix.
             */
            public Builder allKeyPrefix(Boolean allKeyPrefix) {
                this.allKeyPrefix = allKeyPrefix;
                return this;
            }

            /**
             * BucketCount.
             */
            public Builder bucketCount(Integer bucketCount) {
                this.bucketCount = bucketCount;
                return this;
            }

            /**
             * BucketName.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
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
             * DecryptionList.
             */
            public Builder decryptionList(java.util.List<String> decryptionList) {
                this.decryptionList = decryptionList;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Integer enable) {
                this.enable = enable;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * KeyPrefixList.
             */
            public Builder keyPrefixList(java.util.List<String> keyPrefixList) {
                this.keyPrefixList = keyPrefixList;
                return this;
            }

            /**
             * KeySuffixList.
             */
            public Builder keySuffixList(java.util.List<String> keySuffixList) {
                this.keySuffixList = keySuffixList;
                return this;
            }

            /**
             * LastModifiedStartTime.
             */
            public Builder lastModifiedStartTime(Long lastModifiedStartTime) {
                this.lastModifiedStartTime = lastModifiedStartTime;
                return this;
            }

            /**
             * LastUpdateTime.
             */
            public Builder lastUpdateTime(Long lastUpdateTime) {
                this.lastUpdateTime = lastUpdateTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RealTimeIncr.
             */
            public Builder realTimeIncr(Boolean realTimeIncr) {
                this.realTimeIncr = realTimeIncr;
                return this;
            }

            /**
             * ScanDayList.
             */
            public Builder scanDayList(java.util.List<Integer> scanDayList) {
                this.scanDayList = scanDayList;
                return this;
            }

            /**
             * StartTime.
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
