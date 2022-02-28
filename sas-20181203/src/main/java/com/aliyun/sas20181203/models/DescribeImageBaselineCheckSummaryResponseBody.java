// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageBaselineCheckSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageBaselineCheckSummaryResponseBody</p>
 */
public class DescribeImageBaselineCheckSummaryResponseBody extends TeaModel {
    @NameInMap("BaselineResultSummary")
    private java.util.List < BaselineResultSummary> baselineResultSummary;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
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
         * BaselineResultSummary.
         */
        public Builder baselineResultSummary(java.util.List < BaselineResultSummary> baselineResultSummary) {
            this.baselineResultSummary = baselineResultSummary;
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

        public DescribeImageBaselineCheckSummaryResponseBody build() {
            return new DescribeImageBaselineCheckSummaryResponseBody(this);
        } 

    } 

    public static class BaselineResultSummary extends TeaModel {
        @NameInMap("BaselineClassAlias")
        private String baselineClassAlias;

        @NameInMap("BaselineClassKey")
        private String baselineClassKey;

        @NameInMap("BaselineNameAlias")
        private String baselineNameAlias;

        @NameInMap("BaselineNameKey")
        private String baselineNameKey;

        @NameInMap("BaselineNameLevel")
        private String baselineNameLevel;

        @NameInMap("FirstScanTime")
        private Long firstScanTime;

        @NameInMap("HighRiskImage")
        private Integer highRiskImage;

        @NameInMap("LastScanTime")
        private Long lastScanTime;

        @NameInMap("LowRiskImage")
        private Integer lowRiskImage;

        @NameInMap("MiddleRiskImage")
        private Integer middleRiskImage;

        @NameInMap("Status")
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
             * BaselineClassAlias.
             */
            public Builder baselineClassAlias(String baselineClassAlias) {
                this.baselineClassAlias = baselineClassAlias;
                return this;
            }

            /**
             * BaselineClassKey.
             */
            public Builder baselineClassKey(String baselineClassKey) {
                this.baselineClassKey = baselineClassKey;
                return this;
            }

            /**
             * BaselineNameAlias.
             */
            public Builder baselineNameAlias(String baselineNameAlias) {
                this.baselineNameAlias = baselineNameAlias;
                return this;
            }

            /**
             * BaselineNameKey.
             */
            public Builder baselineNameKey(String baselineNameKey) {
                this.baselineNameKey = baselineNameKey;
                return this;
            }

            /**
             * BaselineNameLevel.
             */
            public Builder baselineNameLevel(String baselineNameLevel) {
                this.baselineNameLevel = baselineNameLevel;
                return this;
            }

            /**
             * FirstScanTime.
             */
            public Builder firstScanTime(Long firstScanTime) {
                this.firstScanTime = firstScanTime;
                return this;
            }

            /**
             * HighRiskImage.
             */
            public Builder highRiskImage(Integer highRiskImage) {
                this.highRiskImage = highRiskImage;
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
             * LowRiskImage.
             */
            public Builder lowRiskImage(Integer lowRiskImage) {
                this.lowRiskImage = lowRiskImage;
                return this;
            }

            /**
             * MiddleRiskImage.
             */
            public Builder middleRiskImage(Integer middleRiskImage) {
                this.middleRiskImage = middleRiskImage;
                return this;
            }

            /**
             * Status.
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
