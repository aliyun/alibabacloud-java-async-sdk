// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCouponUsageResponseBody} extends {@link TeaModel}
 *
 * <p>ListCouponUsageResponseBody</p>
 */
public class ListCouponUsageResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    private ListCouponUsageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCouponUsageResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public ListCouponUsageResponseBody build() {
            return new ListCouponUsageResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Account")
        private String account;

        @NameInMap("Amount")
        private Double amount;

        @NameInMap("Balance")
        private Double balance;

        @NameInMap("CouponId")
        private String couponId;

        @NameInMap("CouponTemplateId")
        private Long couponTemplateId;

        @NameInMap("EffDate")
        private String effDate;

        @NameInMap("PublishDate")
        private String publishDate;

        @NameInMap("Status")
        private String status;

        @NameInMap("Uid")
        private Long uid;

        private Data(Builder builder) {
            this.account = builder.account;
            this.amount = builder.amount;
            this.balance = builder.balance;
            this.couponId = builder.couponId;
            this.couponTemplateId = builder.couponTemplateId;
            this.effDate = builder.effDate;
            this.publishDate = builder.publishDate;
            this.status = builder.status;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return account
         */
        public String getAccount() {
            return this.account;
        }

        /**
         * @return amount
         */
        public Double getAmount() {
            return this.amount;
        }

        /**
         * @return balance
         */
        public Double getBalance() {
            return this.balance;
        }

        /**
         * @return couponId
         */
        public String getCouponId() {
            return this.couponId;
        }

        /**
         * @return couponTemplateId
         */
        public Long getCouponTemplateId() {
            return this.couponTemplateId;
        }

        /**
         * @return effDate
         */
        public String getEffDate() {
            return this.effDate;
        }

        /**
         * @return publishDate
         */
        public String getPublishDate() {
            return this.publishDate;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return uid
         */
        public Long getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String account; 
            private Double amount; 
            private Double balance; 
            private String couponId; 
            private Long couponTemplateId; 
            private String effDate; 
            private String publishDate; 
            private String status; 
            private Long uid; 

            /**
             * Account.
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * Amount.
             */
            public Builder amount(Double amount) {
                this.amount = amount;
                return this;
            }

            /**
             * Balance.
             */
            public Builder balance(Double balance) {
                this.balance = balance;
                return this;
            }

            /**
             * CouponId.
             */
            public Builder couponId(String couponId) {
                this.couponId = couponId;
                return this;
            }

            /**
             * CouponTemplateId.
             */
            public Builder couponTemplateId(Long couponTemplateId) {
                this.couponTemplateId = couponTemplateId;
                return this;
            }

            /**
             * EffDate.
             */
            public Builder effDate(String effDate) {
                this.effDate = effDate;
                return this;
            }

            /**
             * PublishDate.
             */
            public Builder publishDate(String publishDate) {
                this.publishDate = publishDate;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(Long uid) {
                this.uid = uid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @NameInMap("Page")
        private Integer page;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Total")
        private Integer total;

        private PageInfo(Builder builder) {
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer page; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * Page.
             */
            public Builder page(Integer page) {
                this.page = page;
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
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
