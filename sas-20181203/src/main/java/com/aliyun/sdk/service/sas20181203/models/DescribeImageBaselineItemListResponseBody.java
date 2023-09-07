// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageBaselineItemListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageBaselineItemListResponseBody</p>
 */
public class DescribeImageBaselineItemListResponseBody extends TeaModel {
    @NameInMap("BaselineItemInfos")
    private java.util.List < BaselineItemInfos> baselineItemInfos;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
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
         * An array that consists of baseline check items.
         */
        public Builder baselineItemInfos(java.util.List < BaselineItemInfos> baselineItemInfos) {
            this.baselineItemInfos = baselineItemInfos;
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

        public DescribeImageBaselineItemListResponseBody build() {
            return new DescribeImageBaselineItemListResponseBody(this);
        } 

    } 

    public static class BaselineItemInfos extends TeaModel {
        @NameInMap("BaselineClassAlias")
        private String baselineClassAlias;

        @NameInMap("BaselineClassKey")
        private String baselineClassKey;

        @NameInMap("BaselineItemAlias")
        private String baselineItemAlias;

        @NameInMap("BaselineItemKey")
        private String baselineItemKey;

        @NameInMap("BaselineNameAlias")
        private String baselineNameAlias;

        @NameInMap("BaselineNameKey")
        private String baselineNameKey;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("WhiteList")
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
             * The alias of the baseline type.
             */
            public Builder baselineClassAlias(String baselineClassAlias) {
                this.baselineClassAlias = baselineClassAlias;
                return this;
            }

            /**
             * The key of the baseline type.
             */
            public Builder baselineClassKey(String baselineClassKey) {
                this.baselineClassKey = baselineClassKey;
                return this;
            }

            /**
             * The alias of the baseline check item.
             */
            public Builder baselineItemAlias(String baselineItemAlias) {
                this.baselineItemAlias = baselineItemAlias;
                return this;
            }

            /**
             * The key of the baseline check item.
             */
            public Builder baselineItemKey(String baselineItemKey) {
                this.baselineItemKey = baselineItemKey;
                return this;
            }

            /**
             * The alias of the baseline.
             */
            public Builder baselineNameAlias(String baselineNameAlias) {
                this.baselineNameAlias = baselineNameAlias;
                return this;
            }

            /**
             * The key of the baseline name.
             */
            public Builder baselineNameKey(String baselineNameKey) {
                this.baselineNameKey = baselineNameKey;
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

            /**
             * Indicates whether the baseline check item is added to the whitelist. Valid values:
             * <p>
             * 
             * *   **0**: The baseline check item is not added to the whitelist.
             * *   **1**: The baseline check item is added to the whitelist.
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
