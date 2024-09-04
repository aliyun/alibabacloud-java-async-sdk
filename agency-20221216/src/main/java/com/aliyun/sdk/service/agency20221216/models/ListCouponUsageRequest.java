// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCouponUsageRequest} extends {@link RequestModel}
 *
 * <p>ListCouponUsageRequest</p>
 */
public class ListCouponUsageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Account")
    private String account;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CouponTemplateId")
    private Long couponTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uid")
    private Long uid;

    private ListCouponUsageRequest(Builder builder) {
        super(builder);
        this.account = builder.account;
        this.couponTemplateId = builder.couponTemplateId;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCouponUsageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return account
     */
    public String getAccount() {
        return this.account;
    }

    /**
     * @return couponTemplateId
     */
    public Long getCouponTemplateId() {
        return this.couponTemplateId;
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

    public static final class Builder extends Request.Builder<ListCouponUsageRequest, Builder> {
        private String account; 
        private Long couponTemplateId; 
        private Integer page; 
        private Integer pageSize; 
        private String status; 
        private Long uid; 

        private Builder() {
            super();
        } 

        private Builder(ListCouponUsageRequest request) {
            super(request);
            this.account = request.account;
            this.couponTemplateId = request.couponTemplateId;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.status = request.status;
            this.uid = request.uid;
        } 

        /**
         * Account.
         */
        public Builder account(String account) {
            this.putQueryParameter("Account", account);
            this.account = account;
            return this;
        }

        /**
         * CouponTemplateId.
         */
        public Builder couponTemplateId(Long couponTemplateId) {
            this.putQueryParameter("CouponTemplateId", couponTemplateId);
            this.couponTemplateId = couponTemplateId;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(Long uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public ListCouponUsageRequest build() {
            return new ListCouponUsageRequest(this);
        } 

    } 

}
