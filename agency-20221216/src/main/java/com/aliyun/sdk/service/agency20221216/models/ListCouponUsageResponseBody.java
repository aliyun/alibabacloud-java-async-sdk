// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

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
 * {@link ListCouponUsageResponseBody} extends {@link TeaModel}
 *
 * <p>ListCouponUsageResponseBody</p>
 */
public class ListCouponUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String message; 
        private PageInfo pageInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListCouponUsageResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>接口状态码</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>返回数据</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>接口返回提示信息</p>
         * 
         * <strong>example:</strong>
         * <p>成功</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>分页信息</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>接口请求id返回问题提供查询使用</p>
         * 
         * <strong>example:</strong>
         * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCouponUsageResponseBody build() {
            return new ListCouponUsageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCouponUsageResponseBody} extends {@link TeaModel}
     *
     * <p>ListCouponUsageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Account")
        private String account;

        @com.aliyun.core.annotation.NameInMap("Amount")
        private Double amount;

        @com.aliyun.core.annotation.NameInMap("Balance")
        private Double balance;

        @com.aliyun.core.annotation.NameInMap("CouponId")
        private String couponId;

        @com.aliyun.core.annotation.NameInMap("CouponTemplateId")
        private Long couponTemplateId;

        @com.aliyun.core.annotation.NameInMap("EffDate")
        private String effDate;

        @com.aliyun.core.annotation.NameInMap("PublishDate")
        private String publishDate;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("T2PartnerUid")
        private String t2PartnerUid;

        @com.aliyun.core.annotation.NameInMap("Uid")
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
            this.t2PartnerUid = builder.t2PartnerUid;
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
         * @return t2PartnerUid
         */
        public String getT2PartnerUid() {
            return this.t2PartnerUid;
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
            private String t2PartnerUid; 
            private Long uid; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.account = model.account;
                this.amount = model.amount;
                this.balance = model.balance;
                this.couponId = model.couponId;
                this.couponTemplateId = model.couponTemplateId;
                this.effDate = model.effDate;
                this.publishDate = model.publishDate;
                this.status = model.status;
                this.t2PartnerUid = model.t2PartnerUid;
                this.uid = model.uid;
            } 

            /**
             * <p>阿里云账号</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:oqevfbveuadcrduzmf@ttirv.net">oqevfbveuadcrduzmf@ttirv.net</a></p>
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * <p>优惠券面额</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder amount(Double amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>余额</p>
             * 
             * <strong>example:</strong>
             * <p>0.01</p>
             */
            public Builder balance(Double balance) {
                this.balance = balance;
                return this;
            }

            /**
             * <p>优惠券id</p>
             * 
             * <strong>example:</strong>
             * <p>59226280</p>
             */
            public Builder couponId(String couponId) {
                this.couponId = couponId;
                return this;
            }

            /**
             * <p>优惠券模版id</p>
             * 
             * <strong>example:</strong>
             * <p>503802</p>
             */
            public Builder couponTemplateId(Long couponTemplateId) {
                this.couponTemplateId = couponTemplateId;
                return this;
            }

            /**
             * <p>优惠券有效期</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-06 00:00:00 ~ 2023-04-07 00:00:00</p>
             */
            public Builder effDate(String effDate) {
                this.effDate = effDate;
                return this;
            }

            /**
             * <p>优惠券发放时间</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-06 19:32:10</p>
             */
            public Builder publishDate(String publishDate) {
                this.publishDate = publishDate;
                return this;
            }

            /**
             * <p>优惠券状态 </br>
             * AVAILABLE 正常 </br>
             * EXHAUSTED 已用完 </br>
             * EXPIRED 已过期 </br>
             * ABANDONED 已作废 </br></p>
             * 
             * <strong>example:</strong>
             * <p>AVAILABLE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>二级分销商Uid</p>
             * 
             * <strong>example:</strong>
             * <p>5248516956402795</p>
             */
            public Builder t2PartnerUid(String t2PartnerUid) {
                this.t2PartnerUid = t2PartnerUid;
                return this;
            }

            /**
             * <p>阿里云uid</p>
             * 
             * <strong>example:</strong>
             * <p>1647668856741998</p>
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
    /**
     * 
     * {@link ListCouponUsageResponseBody} extends {@link TeaModel}
     *
     * <p>ListCouponUsageResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
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

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.page = model.page;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * <p>分页，当前页</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * <p>分页，每页数量</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>分页，总量</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
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
