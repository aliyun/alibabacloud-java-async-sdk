// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeImageBaselineItemListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageBaselineItemListResponseBody</p>
 */
public class DescribeImageBaselineItemListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BaselineItemInfos")
    private java.util.List < BaselineItemInfos> baselineItemInfos;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeImageBaselineItemListResponseBody(Builder builder) {
        this.baselineItemInfos = builder.baselineItemInfos;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageBaselineItemListResponseBody create() {
        return builder().build();
    }

    /**
     * @return baselineItemInfos
     */
    public java.util.List < BaselineItemInfos> getBaselineItemInfos() {
        return this.baselineItemInfos;
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
        private java.util.List < BaselineItemInfos> baselineItemInfos; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * <p>An array that consists of baseline check items.</p>
         */
        public Builder baselineItemInfos(java.util.List < BaselineItemInfos> baselineItemInfos) {
            this.baselineItemInfos = baselineItemInfos;
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

        public DescribeImageBaselineItemListResponseBody build() {
            return new DescribeImageBaselineItemListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageBaselineItemListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageBaselineItemListResponseBody</p>
     */
    public static class BaselineItemInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaselineClassAlias")
        private String baselineClassAlias;

        @com.aliyun.core.annotation.NameInMap("BaselineClassKey")
        private String baselineClassKey;

        @com.aliyun.core.annotation.NameInMap("BaselineItemAlias")
        private String baselineItemAlias;

        @com.aliyun.core.annotation.NameInMap("BaselineItemKey")
        private String baselineItemKey;

        @com.aliyun.core.annotation.NameInMap("BaselineNameAlias")
        private String baselineNameAlias;

        @com.aliyun.core.annotation.NameInMap("BaselineNameKey")
        private String baselineNameKey;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("WhiteList")
        private Integer whiteList;

        private BaselineItemInfos(Builder builder) {
            this.baselineClassAlias = builder.baselineClassAlias;
            this.baselineClassKey = builder.baselineClassKey;
            this.baselineItemAlias = builder.baselineItemAlias;
            this.baselineItemKey = builder.baselineItemKey;
            this.baselineNameAlias = builder.baselineNameAlias;
            this.baselineNameKey = builder.baselineNameKey;
            this.status = builder.status;
            this.whiteList = builder.whiteList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaselineItemInfos create() {
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
         * @return baselineItemAlias
         */
        public String getBaselineItemAlias() {
            return this.baselineItemAlias;
        }

        /**
         * @return baselineItemKey
         */
        public String getBaselineItemKey() {
            return this.baselineItemKey;
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
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return whiteList
         */
        public Integer getWhiteList() {
            return this.whiteList;
        }

        public static final class Builder {
            private String baselineClassAlias; 
            private String baselineClassKey; 
            private String baselineItemAlias; 
            private String baselineItemKey; 
            private String baselineNameAlias; 
            private String baselineNameKey; 
            private Integer status; 
            private Integer whiteList; 

            /**
             * <p>The alias of the baseline type.</p>
             * 
             * <strong>example:</strong>
             * <p>AccessKey pair leak</p>
             */
            public Builder baselineClassAlias(String baselineClassAlias) {
                this.baselineClassAlias = baselineClassAlias;
                return this;
            }

            /**
             * <p>The key of the baseline type.</p>
             * 
             * <strong>example:</strong>
             * <p>ak_leak</p>
             */
            public Builder baselineClassKey(String baselineClassKey) {
                this.baselineClassKey = baselineClassKey;
                return this;
            }

            /**
             * <p>The alias of the baseline check item.</p>
             * 
             * <strong>example:</strong>
             * <p>AccessKey pair leak</p>
             */
            public Builder baselineItemAlias(String baselineItemAlias) {
                this.baselineItemAlias = baselineItemAlias;
                return this;
            }

            /**
             * <p>The key of the baseline check item.</p>
             * 
             * <strong>example:</strong>
             * <p>ak_leak</p>
             */
            public Builder baselineItemKey(String baselineItemKey) {
                this.baselineItemKey = baselineItemKey;
                return this;
            }

            /**
             * <p>The alias of the baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>AccessKey pair leak</p>
             */
            public Builder baselineNameAlias(String baselineNameAlias) {
                this.baselineNameAlias = baselineNameAlias;
                return this;
            }

            /**
             * <p>The key of the baseline name.</p>
             * 
             * <strong>example:</strong>
             * <p>ak_leak</p>
             */
            public Builder baselineNameKey(String baselineNameKey) {
                this.baselineNameKey = baselineNameKey;
                return this;
            }

            /**
             * <p>The status of the baseline risks. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: unfixed</li>
             * <li><strong>1</strong>: fixed</li>
             * <li><strong>2</strong>: pending verification</li>
             * <li><strong>3</strong>: fixing failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Indicates whether the baseline check item is added to the whitelist. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The baseline check item is not added to the whitelist.</li>
             * <li><strong>1</strong>: The baseline check item is added to the whitelist.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder whiteList(Integer whiteList) {
                this.whiteList = whiteList;
                return this;
            }

            public BaselineItemInfos build() {
                return new BaselineItemInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImageBaselineItemListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageBaselineItemListResponseBody</p>
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

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
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
             * <p>253</p>
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
