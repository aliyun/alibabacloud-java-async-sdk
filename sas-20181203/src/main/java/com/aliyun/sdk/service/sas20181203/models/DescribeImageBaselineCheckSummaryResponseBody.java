// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageBaselineCheckSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageBaselineCheckSummaryResponseBody</p>
 */
public class DescribeImageBaselineCheckSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BaselineResultSummary")
    private java.util.List < BaselineResultSummary> baselineResultSummary;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeImageBaselineCheckSummaryResponseBody(Builder builder) {
        this.baselineResultSummary = builder.baselineResultSummary;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageBaselineCheckSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return baselineResultSummary
     */
    public java.util.List < BaselineResultSummary> getBaselineResultSummary() {
        return this.baselineResultSummary;
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
        private java.util.List < BaselineResultSummary> baselineResultSummary; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * An array that consists of the check results of image baselines.
         */
        public Builder baselineResultSummary(java.util.List < BaselineResultSummary> baselineResultSummary) {
            this.baselineResultSummary = baselineResultSummary;
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

        public DescribeImageBaselineCheckSummaryResponseBody build() {
            return new DescribeImageBaselineCheckSummaryResponseBody(this);
        } 

    } 

    public static class BaselineResultSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaselineClassAlias")
        private String baselineClassAlias;

        @com.aliyun.core.annotation.NameInMap("BaselineClassKey")
        private String baselineClassKey;

        @com.aliyun.core.annotation.NameInMap("BaselineNameAlias")
        private String baselineNameAlias;

        @com.aliyun.core.annotation.NameInMap("BaselineNameKey")
        private String baselineNameKey;

        @com.aliyun.core.annotation.NameInMap("BaselineNameLevel")
        private String baselineNameLevel;

        @com.aliyun.core.annotation.NameInMap("FirstScanTime")
        private Long firstScanTime;

        @com.aliyun.core.annotation.NameInMap("HighRiskImage")
        private Integer highRiskImage;

        @com.aliyun.core.annotation.NameInMap("LastScanTime")
        private Long lastScanTime;

        @com.aliyun.core.annotation.NameInMap("LowRiskImage")
        private Integer lowRiskImage;

        @com.aliyun.core.annotation.NameInMap("MiddleRiskImage")
        private Integer middleRiskImage;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private BaselineResultSummary(Builder builder) {
            this.baselineClassAlias = builder.baselineClassAlias;
            this.baselineClassKey = builder.baselineClassKey;
            this.baselineNameAlias = builder.baselineNameAlias;
            this.baselineNameKey = builder.baselineNameKey;
            this.baselineNameLevel = builder.baselineNameLevel;
            this.firstScanTime = builder.firstScanTime;
            this.highRiskImage = builder.highRiskImage;
            this.lastScanTime = builder.lastScanTime;
            this.lowRiskImage = builder.lowRiskImage;
            this.middleRiskImage = builder.middleRiskImage;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaselineResultSummary create() {
            return builder().build();
        }

        /**
         * @return baselineClassAlias
         */
        public String getBaselineClassAlias() {
            return this.baselineClassAlias;
        }

        /**
         * @return baselineClassKey
         */
        public String getBaselineClassKey() {
            return this.baselineClassKey;
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
         * @return highRiskImage
         */
        public Integer getHighRiskImage() {
            return this.highRiskImage;
        }

        /**
         * @return lastScanTime
         */
        public Long getLastScanTime() {
            return this.lastScanTime;
        }

        /**
         * @return lowRiskImage
         */
        public Integer getLowRiskImage() {
            return this.lowRiskImage;
        }

        /**
         * @return middleRiskImage
         */
        public Integer getMiddleRiskImage() {
            return this.middleRiskImage;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String baselineClassAlias; 
            private String baselineClassKey; 
            private String baselineNameAlias; 
            private String baselineNameKey; 
            private String baselineNameLevel; 
            private Long firstScanTime; 
            private Integer highRiskImage; 
            private Long lastScanTime; 
            private Integer lowRiskImage; 
            private Integer middleRiskImage; 
            private Integer status; 

            /**
             * The category of the baseline.
             */
            public Builder baselineClassAlias(String baselineClassAlias) {
                this.baselineClassAlias = baselineClassAlias;
                return this;
            }

            /**
             * The keyword of the baseline category.
             */
            public Builder baselineClassKey(String baselineClassKey) {
                this.baselineClassKey = baselineClassKey;
                return this;
            }

            /**
             * The name of the baseline.
             */
            public Builder baselineNameAlias(String baselineNameAlias) {
                this.baselineNameAlias = baselineNameAlias;
                return this;
            }

            /**
             * The keyword of the baseline name.
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
             * The number of images on which **high** baseline risks are detected.
             */
            public Builder highRiskImage(Integer highRiskImage) {
                this.highRiskImage = highRiskImage;
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
             * The number of images on which **low** baseline risks are detected.
             */
            public Builder lowRiskImage(Integer lowRiskImage) {
                this.lowRiskImage = lowRiskImage;
                return this;
            }

            /**
             * The number of images on which **medium** baseline risks are detected.
             */
            public Builder middleRiskImage(Integer middleRiskImage) {
                this.middleRiskImage = middleRiskImage;
                return this;
            }

            /**
             * The status of the baseline risks. Valid values:
             * <p>
             * 
             * *   **0**: unfixed
             * *   **1**: fixed
             * *   **2**: pending verification
             * *   **3**: fixing failed
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public BaselineResultSummary build() {
                return new BaselineResultSummary(this);
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
