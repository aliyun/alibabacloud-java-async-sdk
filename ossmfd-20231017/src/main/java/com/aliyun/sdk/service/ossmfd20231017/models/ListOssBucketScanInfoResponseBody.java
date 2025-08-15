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
 * {@link ListOssBucketScanInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListOssBucketScanInfoResponseBody</p>
 */
public class ListOssBucketScanInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListOssBucketScanInfoResponseBody model) {
            this.data = model.data;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * PageInfo.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * RequestId.
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.bucketName = model.bucketName;
                this.configStatus = model.configStatus;
                this.decompressStatus = model.decompressStatus;
                this.highRisk = model.highRisk;
                this.lastScanEndTime = model.lastScanEndTime;
                this.lastScanTime = model.lastScanTime;
                this.lowRisk = model.lowRisk;
                this.mediumRisk = model.mediumRisk;
                this.message = model.message;
                this.regionId = model.regionId;
                this.scanObject = model.scanObject;
                this.scanned = model.scanned;
                this.status = model.status;
                this.storageClass = model.storageClass;
                this.support = model.support;
                this.totalObject = model.totalObject;
            } 

            /**
             * BucketName.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * ConfigStatus.
             */
            public Builder configStatus(Integer configStatus) {
                this.configStatus = configStatus;
                return this;
            }

            /**
             * DecompressStatus.
             */
            public Builder decompressStatus(Integer decompressStatus) {
                this.decompressStatus = decompressStatus;
                return this;
            }

            /**
             * HighRisk.
             */
            public Builder highRisk(Long highRisk) {
                this.highRisk = highRisk;
                return this;
            }

            /**
             * LastScanEndTime.
             */
            public Builder lastScanEndTime(Long lastScanEndTime) {
                this.lastScanEndTime = lastScanEndTime;
                return this;
            }

            /**
             * LastScanTime.
             */
            public Builder lastScanTime(Long lastScanTime) {
                this.lastScanTime = lastScanTime;
                return this;
            }

            /**
             * LowRisk.
             */
            public Builder lowRisk(Long lowRisk) {
                this.lowRisk = lowRisk;
                return this;
            }

            /**
             * MediumRisk.
             */
            public Builder mediumRisk(Long mediumRisk) {
                this.mediumRisk = mediumRisk;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ScanObject.
             */
            public Builder scanObject(Long scanObject) {
                this.scanObject = scanObject;
                return this;
            }

            /**
             * Scanned.
             */
            public Builder scanned(Boolean scanned) {
                this.scanned = scanned;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * StorageClass.
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            /**
             * Support.
             */
            public Builder support(Boolean support) {
                this.support = support;
                return this;
            }

            /**
             * TotalObject.
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

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
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
