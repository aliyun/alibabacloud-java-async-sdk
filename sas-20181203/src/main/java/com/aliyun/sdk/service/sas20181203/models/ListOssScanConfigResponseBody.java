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
 * {@link ListOssScanConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ListOssScanConfigResponseBody</p>
 */
public class ListOssScanConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListOssScanConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOssScanConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
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

        public ListOssScanConfigResponseBody build() {
            return new ListOssScanConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOssScanConfigResponseBody} extends {@link TeaModel}
     *
     * <p>ListOssScanConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllKeyPrefix")
        private Boolean allKeyPrefix;

        @com.aliyun.core.annotation.NameInMap("BucketCount")
        private Integer bucketCount;

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
        private Long id;

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
        public Long getId() {
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
            private java.util.List<String> bucketNameList; 
            private Integer decompressMaxFileCount; 
            private Integer decompressMaxLayer; 
            private java.util.List<String> decryptionList; 
            private Integer enable; 
            private String endTime; 
            private Long id; 
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
             * <p>10</p>
             */
            public Builder bucketCount(Integer bucketCount) {
                this.bucketCount = bucketCount;
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
             * <p>Indicates whether the policy is enabled. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: yes</li>
             * <li><strong>0</strong>: no</li>
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
             * <p>The time when the scan ends. The time is in the HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>06:00:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The configuration ID.</p>
             * 
             * <strong>example:</strong>
             * <p>443496</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The prefixes of the objects that are scanned.</p>
             */
            public Builder keyPrefixList(java.util.List<String> keyPrefixList) {
                this.keyPrefixList = keyPrefixList;
                return this;
            }

            /**
             * <p>The suffixes of the objects that are scanned.</p>
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
             * <p>1698388233883</p>
             */
            public Builder lastUpdateTime(Long lastUpdateTime) {
                this.lastUpdateTime = lastUpdateTime;
                return this;
            }

            /**
             * <p>The configuration name.</p>
             * 
             * <strong>example:</strong>
             * <p>test****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The days on which the scan is executed in a week.</p>
             */
            public Builder scanDayList(java.util.List<Integer> scanDayList) {
                this.scanDayList = scanDayList;
                return this;
            }

            /**
             * <p>The time when the scan starts. The time is in the HH:mm:ss format.</p>
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
    /**
     * 
     * {@link ListOssScanConfigResponseBody} extends {@link TeaModel}
     *
     * <p>ListOssScanConfigResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
