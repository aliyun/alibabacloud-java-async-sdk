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
    @com.aliyun.core.annotation.NameInMap("ApplicationReason")
    @com.aliyun.core.annotation.Validation(maxLength = 500)
    private String applicationReason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CouponTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long couponTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsUseBenefit")
    @Deprecated
    private Boolean isUseBenefit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uidlist")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uidlist;

    private IssueCouponForCustomerRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.applicationReason = builder.applicationReason;
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
     * @return applicationReason
     */
    public String getApplicationReason() {
        return this.applicationReason;
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
        private String applicationReason; 
        private Long couponTemplateId; 
        private Boolean isUseBenefit; 
        private String uidlist; 

        private Builder() {
            super();
        } 

        private Builder(IssueCouponForCustomerRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.applicationReason = request.applicationReason;
            this.couponTemplateId = request.couponTemplateId;
            this.isUseBenefit = request.isUseBenefit;
            this.uidlist = request.uidlist;
        } 

        /**
         * <p>The language parameter. Default value: none. Valid values:</p>
         * <ul>
         * <li>zh-CN: Chinese.</li>
         * <li>en-US: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The reason for applying for the coupon. The reason can be up to 500 characters in length. Example: Apply for a coupon for Customer XXX.</p>
         * 
         * <strong>example:</strong>
         * <p>Apply for a coupon for Customer XXX, who is XXXX</p>
         */
        public Builder applicationReason(String applicationReason) {
            this.putQueryParameter("ApplicationReason", applicationReason);
            this.applicationReason = applicationReason;
            return this;
        }

        /**
         * <p>The ID of the coupon template.</p>
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
         * <p>Specifies whether to use the POC privilege quota. Valid values:</p>
         * <ul>
         * <li>true: Uses the POC privilege quota. If all submitted accounts are marked as approval-exempt, the current coupon application skips the approval process, and the POC privilege quota in your partner benefit package is deducted.</li>
         * <li>false: Does not use the POC privilege quota. Regardless of the approval-exempt status of the submitted accounts, your POC coupon benefit quota remains unchanged. In this case, the application follows the standard coupon application approval process.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isUseBenefit(Boolean isUseBenefit) {
            this.putQueryParameter("IsUseBenefit", isUseBenefit);
            this.isUseBenefit = isUseBenefit;
            return this;
        }

        /**
         * <p>The list of UIDs. Separate multiple UIDs with commas (,). Example: 111,2222.</p>
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
