// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageBaselineCheckResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageBaselineCheckResultResponseBody</p>
 */
public class DescribeImageBaselineCheckResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BaselineResult")
    private java.util.List < BaselineResult> baselineResult;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeImageBaselineCheckResultResponseBody(Builder builder) {
        this.baselineResult = builder.baselineResult;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageBaselineCheckResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return baselineResult
     */
    public java.util.List < BaselineResult> getBaselineResult() {
        return this.baselineResult;
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
        private java.util.List < BaselineResult> baselineResult; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * An array that consists of the check results of image baselines.
         */
        public Builder baselineResult(java.util.List < BaselineResult> baselineResult) {
            this.baselineResult = baselineResult;
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImageBaselineCheckResultResponseBody build() {
            return new DescribeImageBaselineCheckResultResponseBody(this);
        } 

    } 

    public static class BaselineResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaselineClassAlias")
        private String baselineClassAlias;

        @com.aliyun.core.annotation.NameInMap("BaselineItemCount")
        private Integer baselineItemCount;

        @com.aliyun.core.annotation.NameInMap("BaselineNameAlias")
        private String baselineNameAlias;

        @com.aliyun.core.annotation.NameInMap("BaselineNameKey")
        private String baselineNameKey;

        @com.aliyun.core.annotation.NameInMap("BaselineNameLevel")
        private String baselineNameLevel;

        @com.aliyun.core.annotation.NameInMap("FirstScanTime")
        private Long firstScanTime;

        @com.aliyun.core.annotation.NameInMap("HighRiskItemCount")
        private Integer highRiskItemCount;

        @com.aliyun.core.annotation.NameInMap("LastScanTime")
        private Long lastScanTime;

        @com.aliyun.core.annotation.NameInMap("LowRiskItemCount")
        private Integer lowRiskItemCount;

        @com.aliyun.core.annotation.NameInMap("MiddleRiskItemCount")
        private Integer middleRiskItemCount;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private BaselineResult(Builder builder) {
            this.baselineClassAlias = builder.baselineClassAlias;
            this.baselineItemCount = builder.baselineItemCount;
            this.baselineNameAlias = builder.baselineNameAlias;
            this.baselineNameKey = builder.baselineNameKey;
            this.baselineNameLevel = builder.baselineNameLevel;
            this.firstScanTime = builder.firstScanTime;
            this.highRiskItemCount = builder.highRiskItemCount;
            this.lastScanTime = builder.lastScanTime;
            this.lowRiskItemCount = builder.lowRiskItemCount;
            this.middleRiskItemCount = builder.middleRiskItemCount;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaselineResult create() {
            return builder().build();
        }

        /**
         * @return baselineClassAlias
         */
        public String getBaselineClassAlias() {
            return this.baselineClassAlias;
        }

        /**
         * @return baselineItemCount
         */
        public Integer getBaselineItemCount() {
            return this.baselineItemCount;
        }

        /**
         * @return baselineNameAlias
         */
        public String getBaselineNameAlias() {
            return this.baselineNameAlias;
        }

        /**
         * @return baselineNameKey
         */
        public String getBaselineNameKey() {
            return this.baselineNameKey;
        }

        /**
         * @return baselineNameLevel
         */
        public String getBaselineNameLevel() {
            return this.baselineNameLevel;
        }

        /**
         * @return firstScanTime
         */
        public Long getFirstScanTime() {
            return this.firstScanTime;
        }

        /**
         * @return highRiskItemCount
         */
        public Integer getHighRiskItemCount() {
            return this.highRiskItemCount;
        }

        /**
         * @return lastScanTime
         */
        public Long getLastScanTime() {
            return this.lastScanTime;
        }

        /**
         * @return lowRiskItemCount
         */
        public Integer getLowRiskItemCount() {
            return this.lowRiskItemCount;
        }

        /**
         * @return middleRiskItemCount
         */
        public Integer getMiddleRiskItemCount() {
            return this.middleRiskItemCount;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String baselineClassAlias; 
            private Integer baselineItemCount; 
            private String baselineNameAlias; 
            private String baselineNameKey; 
            private String baselineNameLevel; 
            private Long firstScanTime; 
            private Integer highRiskItemCount; 
            private Long lastScanTime; 
            private Integer lowRiskItemCount; 
            private Integer middleRiskItemCount; 
            private Integer status; 

            /**
             * The key of the image baseline type.
             */
            public Builder baselineClassAlias(String baselineClassAlias) {
                this.baselineClassAlias = baselineClassAlias;
                return this;
            }

            /**
             * The number of baseline check items.
             */
            public Builder baselineItemCount(Integer baselineItemCount) {
                this.baselineItemCount = baselineItemCount;
                return this;
            }

            /**
             * The alias of the image baseline.
             */
            public Builder baselineNameAlias(String baselineNameAlias) {
                this.baselineNameAlias = baselineNameAlias;
                return this;
            }

            /**
             * The key of the image baseline.
             */
            public Builder baselineNameKey(String baselineNameKey) {
                this.baselineNameKey = baselineNameKey;
                return this;
            }

            /**
             * The severity of the image baseline. Valid values:
             * <p>
             * 
             * *   **high**
             * *   **medium**
             * *   **low**
             */
            public Builder baselineNameLevel(String baselineNameLevel) {
                this.baselineNameLevel = baselineNameLevel;
                return this;
            }

            /**
             * The timestamp generated when the first scan was performed. Unit: milliseconds.
             */
            public Builder firstScanTime(Long firstScanTime) {
                this.firstScanTime = firstScanTime;
                return this;
            }

            /**
             * The number of high-risk images that are affected.
             */
            public Builder highRiskItemCount(Integer highRiskItemCount) {
                this.highRiskItemCount = highRiskItemCount;
                return this;
            }

            /**
             * The timestamp generated when the last scan was performed. Unit: milliseconds.
             */
            public Builder lastScanTime(Long lastScanTime) {
                this.lastScanTime = lastScanTime;
                return this;
            }

            /**
             * The number of low-risk images that are affected.
             */
            public Builder lowRiskItemCount(Integer lowRiskItemCount) {
                this.lowRiskItemCount = lowRiskItemCount;
                return this;
            }

            /**
             * The number of medium-risk images that are affected.
             */
            public Builder middleRiskItemCount(Integer middleRiskItemCount) {
                this.middleRiskItemCount = middleRiskItemCount;
                return this;
            }

            /**
             * The status of the baseline risks. Valid values:
             * <p>
             * 
             * *   **0**: unfixed
             * *   **1**: fixed
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public BaselineResult build() {
                return new BaselineResult(this);
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
