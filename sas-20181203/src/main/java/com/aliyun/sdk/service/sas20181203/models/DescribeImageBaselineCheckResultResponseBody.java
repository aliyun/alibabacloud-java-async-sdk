// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeImageBaselineCheckResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageBaselineCheckResultResponseBody</p>
 */
public class DescribeImageBaselineCheckResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BaselineResult")
    private java.util.List<BaselineResult> baselineResult;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baselineResult
     */
    public java.util.List<BaselineResult> getBaselineResult() {
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
        private java.util.List<BaselineResult> baselineResult; 
        private PageInfo pageInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeImageBaselineCheckResultResponseBody model) {
            this.baselineResult = model.baselineResult;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>An array that consists of the check results of image baselines.</p>
         */
        public Builder baselineResult(java.util.List<BaselineResult> baselineResult) {
            this.baselineResult = baselineResult;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>24A20733-10A0-4AF6-BE6B-E3322413****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImageBaselineCheckResultResponseBody build() {
            return new DescribeImageBaselineCheckResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageBaselineCheckResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageBaselineCheckResultResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(BaselineResult model) {
                this.baselineClassAlias = model.baselineClassAlias;
                this.baselineItemCount = model.baselineItemCount;
                this.baselineNameAlias = model.baselineNameAlias;
                this.baselineNameKey = model.baselineNameKey;
                this.baselineNameLevel = model.baselineNameLevel;
                this.firstScanTime = model.firstScanTime;
                this.highRiskItemCount = model.highRiskItemCount;
                this.lastScanTime = model.lastScanTime;
                this.lowRiskItemCount = model.lowRiskItemCount;
                this.middleRiskItemCount = model.middleRiskItemCount;
                this.status = model.status;
            } 

            /**
             * <p>The key of the image baseline type.</p>
             * 
             * <strong>example:</strong>
             * <p>identification</p>
             */
            public Builder baselineClassAlias(String baselineClassAlias) {
                this.baselineClassAlias = baselineClassAlias;
                return this;
            }

            /**
             * <p>The number of baseline check items.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder baselineItemCount(Integer baselineItemCount) {
                this.baselineItemCount = baselineItemCount;
                return this;
            }

            /**
             * <p>The alias of the image baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>Identity authentication</p>
             */
            public Builder baselineNameAlias(String baselineNameAlias) {
                this.baselineNameAlias = baselineNameAlias;
                return this;
            }

            /**
             * <p>The key of the image baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>identification</p>
             */
            public Builder baselineNameKey(String baselineNameKey) {
                this.baselineNameKey = baselineNameKey;
                return this;
            }

            /**
             * <p>The severity of the image baseline. Valid values:</p>
             * <ul>
             * <li><strong>high</strong></li>
             * <li><strong>medium</strong></li>
             * <li><strong>low</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder baselineNameLevel(String baselineNameLevel) {
                this.baselineNameLevel = baselineNameLevel;
                return this;
            }

            /**
             * <p>The timestamp generated when the first scan was performed. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1610304058366</p>
             */
            public Builder firstScanTime(Long firstScanTime) {
                this.firstScanTime = firstScanTime;
                return this;
            }

            /**
             * <p>The number of high-risk images that are affected.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder highRiskItemCount(Integer highRiskItemCount) {
                this.highRiskItemCount = highRiskItemCount;
                return this;
            }

            /**
             * <p>The timestamp generated when the last scan was performed. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1610304058301</p>
             */
            public Builder lastScanTime(Long lastScanTime) {
                this.lastScanTime = lastScanTime;
                return this;
            }

            /**
             * <p>The number of low-risk images that are affected.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder lowRiskItemCount(Integer lowRiskItemCount) {
                this.lowRiskItemCount = lowRiskItemCount;
                return this;
            }

            /**
             * <p>The number of medium-risk images that are affected.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder middleRiskItemCount(Integer middleRiskItemCount) {
                this.middleRiskItemCount = middleRiskItemCount;
                return this;
            }

            /**
             * <p>The status of the baseline risks. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: unfixed</li>
             * <li><strong>1</strong>: fixed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link DescribeImageBaselineCheckResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageBaselineCheckResultResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.count = model.count;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
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
             * <p>100</p>
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
