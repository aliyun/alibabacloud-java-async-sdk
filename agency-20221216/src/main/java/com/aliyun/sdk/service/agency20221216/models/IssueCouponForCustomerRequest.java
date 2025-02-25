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
    @com.aliyun.core.annotation.NameInMap("IsUseBenefit")
    private Boolean isUseBenefit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uidlist")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uidlist;

    private IssueCouponForCustomerRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.couponTemplateId = builder.couponTemplateId;
        this.isUseBenefit = builder.isUseBenefit;
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
     * @return isUseBenefit
     */
    public Boolean getIsUseBenefit() {
        return this.isUseBenefit;
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
        private Boolean isUseBenefit; 
        private String uidlist; 

        private Builder() {
            super();
        } 

        private Builder(IssueCouponForCustomerRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.couponTemplateId = request.couponTemplateId;
            this.isUseBenefit = request.isUseBenefit;
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
         * IsUseBenefit.
         */
        public Builder isUseBenefit(Boolean isUseBenefit) {
            this.putQueryParameter("IsUseBenefit", isUseBenefit);
            this.isUseBenefit = isUseBenefit;
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
