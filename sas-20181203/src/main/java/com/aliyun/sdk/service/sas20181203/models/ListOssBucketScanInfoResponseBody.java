// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListOssBucketScanInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListOssBucketScanInfoResponseBody</p>
 */
public class ListOssBucketScanInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListOssBucketScanInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOssBucketScanInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
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
        private java.util.List < Data> data; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The page information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6C578F36-92D2-552C-8AA0-86EB1AC2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListOssBucketScanInfoResponseBody build() {
            return new ListOssBucketScanInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOssBucketScanInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListOssBucketScanInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("ConfigStatus")
        private Integer configStatus;

        @com.aliyun.core.annotation.NameInMap("DecompressStatus")
        private Integer decompressStatus;

        @com.aliyun.core.annotation.NameInMap("HighRisk")
        private Long highRisk;

        @com.aliyun.core.annotation.NameInMap("LastScanEndTime")
        private Long lastScanEndTime;

        @com.aliyun.core.annotation.NameInMap("LastScanTime")
        private Long lastScanTime;

        @com.aliyun.core.annotation.NameInMap("LowRisk")
        private Long lowRisk;

        @com.aliyun.core.annotation.NameInMap("MediumRisk")
        private Long mediumRisk;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ScanObject")
        private Long scanObject;

        @com.aliyun.core.annotation.NameInMap("Scanned")
        private Boolean scanned;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("StorageClass")
        private String storageClass;

        @com.aliyun.core.annotation.NameInMap("Support")
        private Boolean support;

        @com.aliyun.core.annotation.NameInMap("TotalObject")
        private Long totalObject;

        private Data(Builder builder) {
            this.bucketName = builder.bucketName;
            this.configStatus = builder.configStatus;
            this.decompressStatus = builder.decompressStatus;
            this.highRisk = builder.highRisk;
            this.lastScanEndTime = builder.lastScanEndTime;
            this.lastScanTime = builder.lastScanTime;
            this.lowRisk = builder.lowRisk;
            this.mediumRisk = builder.mediumRisk;
            this.message = builder.message;
            this.regionId = builder.regionId;
            this.scanObject = builder.scanObject;
            this.scanned = builder.scanned;
            this.status = builder.status;
            this.storageClass = builder.storageClass;
            this.support = builder.support;
            this.totalObject = builder.totalObject;
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
         * @return configStatus
         */
        public Integer getConfigStatus() {
            return this.configStatus;
        }

        /**
         * @return decompressStatus
         */
        public Integer getDecompressStatus() {
            return this.decompressStatus;
        }

        /**
         * @return highRisk
         */
        public Long getHighRisk() {
            return this.highRisk;
        }

        /**
         * @return lastScanEndTime
         */
        public Long getLastScanEndTime() {
            return this.lastScanEndTime;
        }

        /**
         * @return lastScanTime
         */
        public Long getLastScanTime() {
            return this.lastScanTime;
        }

        /**
         * @return lowRisk
         */
        public Long getLowRisk() {
            return this.lowRisk;
        }

        /**
         * @return mediumRisk
         */
        public Long getMediumRisk() {
            return this.mediumRisk;
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
         * @return scanObject
         */
        public Long getScanObject() {
            return this.scanObject;
        }

        /**
         * @return scanned
         */
        public Boolean getScanned() {
            return this.scanned;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
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
         * @return totalObject
         */
        public Long getTotalObject() {
            return this.totalObject;
        }

        public static final class Builder {
            private String bucketName; 
            private Integer configStatus; 
            private Integer decompressStatus; 
            private Long highRisk; 
            private Long lastScanEndTime; 
            private Long lastScanTime; 
            private Long lowRisk; 
            private Long mediumRisk; 
            private String message; 
            private String regionId; 
            private Long scanObject; 
            private Boolean scanned; 
            private Integer status; 
            private String storageClass; 
            private Boolean support; 
            private Long totalObject; 

            /**
             * <p>The name of the bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>hz-new02****</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>Configuration status, valid values:</p>
             * <ul>
             * <li><strong>0</strong>: No Configuration.</li>
             * <li><strong>1</strong>: Not Open.</li>
             * <li><strong>2</strong>: Open.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder configStatus(Integer configStatus) {
                this.configStatus = configStatus;
                return this;
            }

            /**
             * <p>Bucket decompression configuration status, valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Decompression not configured.</li>
             * <li><strong>1</strong>: Decompression configured.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder decompressStatus(Integer decompressStatus) {
                this.decompressStatus = decompressStatus;
                return this;
            }

            /**
             * <p>The number of high-risk objects.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder highRisk(Long highRisk) {
                this.highRisk = highRisk;
                return this;
            }

            /**
             * <p>The time when the most recent check ended. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1698388233883</p>
             */
            public Builder lastScanEndTime(Long lastScanEndTime) {
                this.lastScanEndTime = lastScanEndTime;
                return this;
            }

            /**
             * <p>The time when the bucket was last checked. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1698388233883</p>
             */
            public Builder lastScanTime(Long lastScanTime) {
                this.lastScanTime = lastScanTime;
                return this;
            }

            /**
             * <p>The number of low-risk objects.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder lowRisk(Long lowRisk) {
                this.lowRisk = lowRisk;
                return this;
            }

            /**
             * <p>The number of medium-risk objects.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder mediumRisk(Long mediumRisk) {
                this.mediumRisk = mediumRisk;
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
             * <p>The number of objects that are checked.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder scanObject(Long scanObject) {
                this.scanObject = scanObject;
                return this;
            }

            /**
             * <p>Indicates whether the bucket is checked. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder scanned(Boolean scanned) {
                this.scanned = scanned;
                return this;
            }

            /**
             * <p>The check status of the bucket. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The bucket is not checked.</li>
             * <li><strong>2</strong>: All objects in the bucket are being checked.</li>
             * <li><strong>3</strong>: Only new objects are being checked.</li>
             * <li><strong>4</strong>: The bucket is checked.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The storage class of the bucket. Valid values:</p>
             * <ul>
             * <li><strong>Standard</strong></li>
             * <li><strong>IA</strong></li>
             * <li><strong>Archive</strong></li>
             * <li><strong>ColdArchive</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Archive</p>
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
             * <p>The total number of objects in the bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalObject(Long totalObject) {
                this.totalObject = totalObject;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListOssBucketScanInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListOssBucketScanInfoResponseBody</p>
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
             * <p>165</p>
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
