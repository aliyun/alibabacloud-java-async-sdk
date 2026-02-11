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
    @com.aliyun.core.annotation.NameInMap("T2PartnerUid")
    private Long t2PartnerUid;

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
        this.t2PartnerUid = builder.t2PartnerUid;
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
     * @return t2PartnerUid
     */
    public Long getT2PartnerUid() {
        return this.t2PartnerUid;
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
        private Long t2PartnerUid; 
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
            this.t2PartnerUid = request.t2PartnerUid;
            this.uid = request.uid;
        } 

        /**
         * <p>阿里云客户账号</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:oqevfbveuadcrduzmf@ttirv.net">oqevfbveuadcrduzmf@ttirv.net</a></p>
         */
        public Builder account(String account) {
            this.putQueryParameter("Account", account);
            this.account = account;
            return this;
        }

        /**
         * <p>优惠券模版id</p>
         * 
         * <strong>example:</strong>
         * <p>5075915</p>
         */
        public Builder couponTemplateId(Long couponTemplateId) {
            this.putQueryParameter("CouponTemplateId", couponTemplateId);
            this.couponTemplateId = couponTemplateId;
            return this;
        }

        /**
         * <p>页码</br> 
         *  默认值为1 最小值1</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>分页行数 </br>
         *   默认值20 最大值50 最小值1</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>T2伙伴uid
         * 如：123456789</p>
         * 
         * <strong>example:</strong>
         * <p>123456768</p>
         */
        public Builder t2PartnerUid(Long t2PartnerUid) {
            this.putQueryParameter("T2PartnerUid", t2PartnerUid);
            this.t2PartnerUid = t2PartnerUid;
            return this;
        }

        /**
         * <p>阿里云账号uid</p>
         * 
         * <strong>example:</strong>
         * <p>1133166938931507</p>
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
