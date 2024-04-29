// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGroupedMaliciousFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGroupedMaliciousFilesResponseBody</p>
 */
public class DescribeGroupedMaliciousFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupedMaliciousFileResponse")
    private java.util.List < GroupedMaliciousFileResponse> groupedMaliciousFileResponse;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeGroupedMaliciousFilesResponseBody(Builder builder) {
        this.groupedMaliciousFileResponse = builder.groupedMaliciousFileResponse;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupedMaliciousFilesResponseBody create() {
        return builder().build();
    }

    /**
     * @return groupedMaliciousFileResponse
     */
    public java.util.List < GroupedMaliciousFileResponse> getGroupedMaliciousFileResponse() {
        return this.groupedMaliciousFileResponse;
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
        private java.util.List < GroupedMaliciousFileResponse> groupedMaliciousFileResponse; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * The details of the malicious image sample.
         */
        public Builder groupedMaliciousFileResponse(java.util.List < GroupedMaliciousFileResponse> groupedMaliciousFileResponse) {
            this.groupedMaliciousFileResponse = groupedMaliciousFileResponse;
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

        public DescribeGroupedMaliciousFilesResponseBody build() {
            return new DescribeGroupedMaliciousFilesResponseBody(this);
        } 

    } 

    public static class GroupedMaliciousFileResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FirstScanTimestamp")
        private Long firstScanTimestamp;

        @com.aliyun.core.annotation.NameInMap("ImageCount")
        private Long imageCount;

        @com.aliyun.core.annotation.NameInMap("LatestScanTimestamp")
        private Long latestScanTimestamp;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("MaliciousKey")
        private String maliciousKey;

        @com.aliyun.core.annotation.NameInMap("MaliciousMd5")
        private String maliciousMd5;

        @com.aliyun.core.annotation.NameInMap("MaliciousName")
        private String maliciousName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private GroupedMaliciousFileResponse(Builder builder) {
            this.firstScanTimestamp = builder.firstScanTimestamp;
            this.imageCount = builder.imageCount;
            this.latestScanTimestamp = builder.latestScanTimestamp;
            this.level = builder.level;
            this.maliciousKey = builder.maliciousKey;
            this.maliciousMd5 = builder.maliciousMd5;
            this.maliciousName = builder.maliciousName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupedMaliciousFileResponse create() {
            return builder().build();
        }

        /**
         * @return firstScanTimestamp
         */
        public Long getFirstScanTimestamp() {
            return this.firstScanTimestamp;
        }

        /**
         * @return imageCount
         */
        public Long getImageCount() {
            return this.imageCount;
        }

        /**
         * @return latestScanTimestamp
         */
        public Long getLatestScanTimestamp() {
            return this.latestScanTimestamp;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return maliciousKey
         */
        public String getMaliciousKey() {
            return this.maliciousKey;
        }

        /**
         * @return maliciousMd5
         */
        public String getMaliciousMd5() {
            return this.maliciousMd5;
        }

        /**
         * @return maliciousName
         */
        public String getMaliciousName() {
            return this.maliciousName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long firstScanTimestamp; 
            private Long imageCount; 
            private Long latestScanTimestamp; 
            private String level; 
            private String maliciousKey; 
            private String maliciousMd5; 
            private String maliciousName; 
            private Integer status; 

            /**
             * The timestamp generated when the first scan was performed. Unit: milliseconds.
             */
            public Builder firstScanTimestamp(Long firstScanTimestamp) {
                this.firstScanTimestamp = firstScanTimestamp;
                return this;
            }

            /**
             * The number of affected images.
             */
            public Builder imageCount(Long imageCount) {
                this.imageCount = imageCount;
                return this;
            }

            /**
             * The timestamp generated when the last scan was performed. Unit: milliseconds.
             */
            public Builder latestScanTimestamp(Long latestScanTimestamp) {
                this.latestScanTimestamp = latestScanTimestamp;
                return this;
            }

            /**
             * The severity of the malicious image sample. Valid values:
             * <p>
             * 
             * *   **serious**
             * *   **suspicious**
             * *   **remind**
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * The keyword of the malicious image sample.
             */
            public Builder maliciousKey(String maliciousKey) {
                this.maliciousKey = maliciousKey;
                return this;
            }

            /**
             * The MD5 hash value of the malicious image sample.
             */
            public Builder maliciousMd5(String maliciousMd5) {
                this.maliciousMd5 = maliciousMd5;
                return this;
            }

            /**
             * The name of the malicious image sample.
             */
            public Builder maliciousName(String maliciousName) {
                this.maliciousName = maliciousName;
                return this;
            }

            /**
             * The handling status of the malicious image sample. Valid values:
             * <p>
             * 
             * *   **0**: unhandled
             * *   **1**: handled
             * *   **2**: verifying
             * *   **3**: whitelisted
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public GroupedMaliciousFileResponse build() {
                return new GroupedMaliciousFileResponse(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
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
         * @return count
         */
        public Integer getCount() {
            return this.count;
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
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The number of entries returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries returned per page. Default value: **20**.
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
