// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageBaselineCheckResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageBaselineCheckResultResponseBody</p>
 */
public class DescribeImageBaselineCheckResultResponseBody extends TeaModel {
    @NameInMap("BaselineResult")
    private java.util.List < BaselineResult> baselineResult;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
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
         * BaselineResult.
         */
        public Builder baselineResult(java.util.List < BaselineResult> baselineResult) {
            this.baselineResult = baselineResult;
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

        public DescribeImageBaselineCheckResultResponseBody build() {
            return new DescribeImageBaselineCheckResultResponseBody(this);
        } 

    } 

    public static class BaselineResult extends TeaModel {
        @NameInMap("BaselineClassAlias")
        private String baselineClassAlias;

        @NameInMap("BaselineItemCount")
        private Integer baselineItemCount;

        @NameInMap("BaselineNameAlias")
        private String baselineNameAlias;

        @NameInMap("BaselineNameKey")
        private String baselineNameKey;

        @NameInMap("BaselineNameLevel")
        private String baselineNameLevel;

        @NameInMap("FirstScanTime")
        private Long firstScanTime;

        @NameInMap("HighRiskItemCount")
        private Integer highRiskItemCount;

        @NameInMap("LastScanTime")
        private Long lastScanTime;

        @NameInMap("LowRiskItemCount")
        private Integer lowRiskItemCount;

        @NameInMap("MiddleRiskItemCount")
        private Integer middleRiskItemCount;

        @NameInMap("Status")
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
             * BaselineClassAlias.
             */
            public Builder baselineClassAlias(String baselineClassAlias) {
                this.baselineClassAlias = baselineClassAlias;
                return this;
            }

            /**
             * BaselineItemCount.
             */
            public Builder baselineItemCount(Integer baselineItemCount) {
                this.baselineItemCount = baselineItemCount;
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
             * HighRiskItemCount.
             */
            public Builder highRiskItemCount(Integer highRiskItemCount) {
                this.highRiskItemCount = highRiskItemCount;
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
             * LowRiskItemCount.
             */
            public Builder lowRiskItemCount(Integer lowRiskItemCount) {
                this.lowRiskItemCount = lowRiskItemCount;
                return this;
            }

            /**
             * MiddleRiskItemCount.
             */
            public Builder middleRiskItemCount(Integer middleRiskItemCount) {
                this.middleRiskItemCount = middleRiskItemCount;
                return this;
            }

            /**
             * Status.
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
