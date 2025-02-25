// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryIntlFixedPriceOrderListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryIntlFixedPriceOrderListResponseBody</p>
 */
public class QueryIntlFixedPriceOrderListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryIntlFixedPriceOrderListResponseBody(Builder builder) {
        this.module = builder.module;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryIntlFixedPriceOrderListResponseBody create() {
        return builder().build();
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Module module; 
        private String requestId; 

        /**
         * Module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryIntlFixedPriceOrderListResponseBody build() {
            return new QueryIntlFixedPriceOrderListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryIntlFixedPriceOrderListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryIntlFixedPriceOrderListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizId")
        private String bizId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private Integer orderType;

        @com.aliyun.core.annotation.NameInMap("Price")
        private Long price;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Data(Builder builder) {
            this.bizId = builder.bizId;
            this.createTime = builder.createTime;
            this.domain = builder.domain;
            this.orderType = builder.orderType;
            this.price = builder.price;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return orderType
         */
        public Integer getOrderType() {
            return this.orderType;
        }

        /**
         * @return price
         */
        public Long getPrice() {
            return this.price;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String bizId; 
            private Long createTime; 
            private String domain; 
            private Integer orderType; 
            private Long price; 
            private Integer status; 
            private Long updateTime; 
            private String userId; 

            /**
             * BizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * OrderType.
             */
            public Builder orderType(Integer orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * Price.
             */
            public Builder price(Long price) {
                this.price = price;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryIntlFixedPriceOrderListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryIntlFixedPriceOrderListResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPageNum")
        private Integer currentPageNum;

        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List < Data> data;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalItemNum")
        private Integer totalItemNum;

        @com.aliyun.core.annotation.NameInMap("TotalPageNum")
        private Integer totalPageNum;

        private Module(Builder builder) {
            this.currentPageNum = builder.currentPageNum;
            this.data = builder.data;
            this.pageSize = builder.pageSize;
            this.totalItemNum = builder.totalItemNum;
            this.totalPageNum = builder.totalPageNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return currentPageNum
         */
        public Integer getCurrentPageNum() {
            return this.currentPageNum;
        }

        /**
         * @return data
         */
        public java.util.List < Data> getData() {
            return this.data;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalItemNum
         */
        public Integer getTotalItemNum() {
            return this.totalItemNum;
        }

        /**
         * @return totalPageNum
         */
        public Integer getTotalPageNum() {
            return this.totalPageNum;
        }

        public static final class Builder {
            private Integer currentPageNum; 
            private java.util.List < Data> data; 
            private Integer pageSize; 
            private Integer totalItemNum; 
            private Integer totalPageNum; 

            /**
             * CurrentPageNum.
             */
            public Builder currentPageNum(Integer currentPageNum) {
                this.currentPageNum = currentPageNum;
                return this;
            }

            /**
             * Data.
             */
            public Builder data(java.util.List < Data> data) {
                this.data = data;
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
             * TotalItemNum.
             */
            public Builder totalItemNum(Integer totalItemNum) {
                this.totalItemNum = totalItemNum;
                return this;
            }

            /**
             * TotalPageNum.
             */
            public Builder totalPageNum(Integer totalPageNum) {
                this.totalPageNum = totalPageNum;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
