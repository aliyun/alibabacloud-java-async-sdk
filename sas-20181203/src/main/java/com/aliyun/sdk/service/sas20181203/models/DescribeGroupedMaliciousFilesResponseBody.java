// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGroupedMaliciousFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGroupedMaliciousFilesResponseBody</p>
 */
public class DescribeGroupedMaliciousFilesResponseBody extends TeaModel {
    @NameInMap("GroupedMaliciousFileResponse")
    private java.util.List < GroupedMaliciousFileResponse> groupedMaliciousFileResponse;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
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
         * GroupedMaliciousFileResponse.
         */
        public Builder groupedMaliciousFileResponse(java.util.List < GroupedMaliciousFileResponse> groupedMaliciousFileResponse) {
            this.groupedMaliciousFileResponse = groupedMaliciousFileResponse;
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

        public DescribeGroupedMaliciousFilesResponseBody build() {
            return new DescribeGroupedMaliciousFilesResponseBody(this);
        } 

    } 

    public static class GroupedMaliciousFileResponse extends TeaModel {
        @NameInMap("FirstScanTimestamp")
        private Long firstScanTimestamp;

        @NameInMap("ImageCount")
        private Long imageCount;

        @NameInMap("LatestScanTimestamp")
        private Long latestScanTimestamp;

        @NameInMap("Level")
        private String level;

        @NameInMap("MaliciousMd5")
        private String maliciousMd5;

        @NameInMap("MaliciousName")
        private String maliciousName;

        @NameInMap("Status")
        private Integer status;

        private GroupedMaliciousFileResponse(Builder builder) {
            this.firstScanTimestamp = builder.firstScanTimestamp;
            this.imageCount = builder.imageCount;
            this.latestScanTimestamp = builder.latestScanTimestamp;
            this.level = builder.level;
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
            private String maliciousMd5; 
            private String maliciousName; 
            private Integer status; 

            /**
             * FirstScanTimestamp.
             */
            public Builder firstScanTimestamp(Long firstScanTimestamp) {
                this.firstScanTimestamp = firstScanTimestamp;
                return this;
            }

            /**
             * ImageCount.
             */
            public Builder imageCount(Long imageCount) {
                this.imageCount = imageCount;
                return this;
            }

            /**
             * LatestScanTimestamp.
             */
            public Builder latestScanTimestamp(Long latestScanTimestamp) {
                this.latestScanTimestamp = latestScanTimestamp;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * MaliciousMd5.
             */
            public Builder maliciousMd5(String maliciousMd5) {
                this.maliciousMd5 = maliciousMd5;
                return this;
            }

            /**
             * MaliciousName.
             */
            public Builder maliciousName(String maliciousName) {
                this.maliciousName = maliciousName;
                return this;
            }

            /**
             * Status.
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
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
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
