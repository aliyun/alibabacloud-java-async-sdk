// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link IssueCouponForCustomerRequest} extends {@link RequestModel}
 *
 * <p>IssueCouponForCustomerRequest</p>
 */
public class IssueCouponForCustomerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CouponTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long couponTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uidlist")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uidlist;

    private IssueCouponForCustomerRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.couponTemplateId = builder.couponTemplateId;
        this.uidlist = builder.uidlist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IssueCouponForCustomerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return couponTemplateId
     */
    public Long getCouponTemplateId() {
        return this.couponTemplateId;
    }

    /**
     * @return uidlist
     */
    public String getUidlist() {
        return this.uidlist;
    }

    public static final class Builder extends Request.Builder<IssueCouponForCustomerRequest, Builder> {
        private String acceptLanguage; 
        private Long couponTemplateId; 
        private String uidlist; 

        private Builder() {
            super();
        } 

        private Builder(IssueCouponForCustomerRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.couponTemplateId = request.couponTemplateId;
            this.uidlist = request.uidlist;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>111,2222</p>
         */
        public Builder uidlist(String uidlist) {
            this.putQueryParameter("Uidlist", uidlist);
            this.uidlist = uidlist;
            return this;
        }

        @Override
        public IssueCouponForCustomerRequest build() {
            return new IssueCouponForCustomerRequest(this);
        } 

    } 

}
