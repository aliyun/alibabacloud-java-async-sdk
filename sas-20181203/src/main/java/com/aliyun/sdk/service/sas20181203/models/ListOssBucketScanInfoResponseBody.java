// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOssBucketScanInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListOssBucketScanInfoResponseBody</p>
 */
public class ListOssBucketScanInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
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
         * The data that is returned.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The page information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListOssBucketScanInfoResponseBody build() {
            return new ListOssBucketScanInfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BucketName")
        private String bucketName;

        @NameInMap("ConfigStatus")
        private Integer configStatus;

        @NameInMap("HighRisk")
        private Long highRisk;

        @NameInMap("LastScanEndTime")
        private Long lastScanEndTime;

        @NameInMap("LastScanTime")
        private Long lastScanTime;

        @NameInMap("LowRisk")
        private Long lowRisk;

        @NameInMap("MediumRisk")
        private Long mediumRisk;

        @NameInMap("Message")
        private String message;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ScanObject")
        private Long scanObject;

        @NameInMap("Scanned")
        private Boolean scanned;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("StorageClass")
        private String storageClass;

        @NameInMap("Support")
        private Boolean support;

        @NameInMap("TotalObject")
        private Long totalObject;

        private Data(Builder builder) {
            this.bucketName = builder.bucketName;
            this.configStatus = builder.configStatus;
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
             * The name of the bucket.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * Configuration status, valid values:
             * <p>
             * 
             * - **0**: No Configuration.
             * - **1**: Not Open.
             * - **2**: Open.
             */
            public Builder configStatus(Integer configStatus) {
                this.configStatus = configStatus;
                return this;
            }

            /**
             * The number of high-risk objects.
             */
            public Builder highRisk(Long highRisk) {
                this.highRisk = highRisk;
                return this;
            }

            /**
             * The time when the most recent check ended. Unit: milliseconds.
             */
            public Builder lastScanEndTime(Long lastScanEndTime) {
                this.lastScanEndTime = lastScanEndTime;
                return this;
            }

            /**
             * The time when the bucket was last checked. Unit: milliseconds.
             */
            public Builder lastScanTime(Long lastScanTime) {
                this.lastScanTime = lastScanTime;
                return this;
            }

            /**
             * The number of low-risk objects.
             */
            public Builder lowRisk(Long lowRisk) {
                this.lowRisk = lowRisk;
                return this;
            }

            /**
             * The number of medium-risk objects.
             */
            public Builder mediumRisk(Long mediumRisk) {
                this.mediumRisk = mediumRisk;
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
             * The number of objects that are checked.
             */
            public Builder scanObject(Long scanObject) {
                this.scanObject = scanObject;
                return this;
            }

            /**
             * Indicates whether the bucket is checked. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder scanned(Boolean scanned) {
                this.scanned = scanned;
                return this;
            }

            /**
             * The check status of the bucket. Valid values:
             * <p>
             * 
             * *   **1**: The bucket is not checked.
             * *   **2**: All objects in the bucket are being checked.
             * *   **3**: Only new objects are being checked.
             * *   **4**: The bucket is checked.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The storage class of the bucket. Valid values:
             * <p>
             * 
             * *   **Standard**
             * *   **IA**
             * *   **Archive**
             * *   **ColdArchive**
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
             * The total number of objects in the bucket.
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
    public static class PageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
             * The page number.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
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
