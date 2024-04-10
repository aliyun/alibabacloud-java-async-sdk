// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOssScanConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ListOssScanConfigResponseBody</p>
 */
public class ListOssScanConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
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
         * The data returned.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListOssScanConfigResponseBody build() {
            return new ListOssScanConfigResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AllKeyPrefix")
        private Boolean allKeyPrefix;

        @NameInMap("BucketCount")
        private Integer bucketCount;

        @NameInMap("BucketNameList")
        private java.util.List < String > bucketNameList;

        @NameInMap("DecompressMaxFileCount")
        private Integer decompressMaxFileCount;

        @NameInMap("DecompressMaxLayer")
        private Integer decompressMaxLayer;

        @NameInMap("Enable")
        private Integer enable;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("Id")
        private Long id;

        @NameInMap("KeyPrefixList")
        private java.util.List < String > keyPrefixList;

        @NameInMap("KeySuffixList")
        private java.util.List < String > keySuffixList;

        @NameInMap("LastUpdateTime")
        private Long lastUpdateTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("ScanDayList")
        private java.util.List < Integer > scanDayList;

        @NameInMap("StartTime")
        private String startTime;

        private Data(Builder builder) {
            this.allKeyPrefix = builder.allKeyPrefix;
            this.bucketCount = builder.bucketCount;
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
        public Long getId() {
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
            private java.util.List < String > bucketNameList; 
            private Integer decompressMaxFileCount; 
            private Integer decompressMaxLayer; 
            private Integer enable; 
            private String endTime; 
            private Long id; 
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
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The prefix of the object that you want to check.
             */
            public Builder keyPrefixList(java.util.List < String > keyPrefixList) {
                this.keyPrefixList = keyPrefixList;
                return this;
            }

            /**
             * The suffix of the object that is checked.
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
             * The day when the check is performed. The value indicates the day of the week.
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
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries returned per page.
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
