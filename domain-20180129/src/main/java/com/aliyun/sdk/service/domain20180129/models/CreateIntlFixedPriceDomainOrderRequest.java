// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateIntlFixedPriceDomainOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateIntlFixedPriceDomainOrderRequest</p>
 */
public class CreateIntlFixedPriceDomainOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactId")
    private Long contactId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpectedPrice")
    private Long expectedPrice;

    private CreateIntlFixedPriceDomainOrderRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.contactId = builder.contactId;
        this.domain = builder.domain;
        this.expectedPrice = builder.expectedPrice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIntlFixedPriceDomainOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return contactId
     */
    public Long getContactId() {
        return this.contactId;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return expectedPrice
     */
    public Long getExpectedPrice() {
        return this.expectedPrice;
    }

    public static final class Builder extends Request.Builder<CreateIntlFixedPriceDomainOrderRequest, Builder> {
        private Boolean autoPay; 
        private Long contactId; 
        private String domain; 
        private Long expectedPrice; 

        private Builder() {
            super();
        } 

        private Builder(CreateIntlFixedPriceDomainOrderRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.contactId = request.contactId;
            this.domain = request.domain;
            this.expectedPrice = request.expectedPrice;
        } 

        /**
         * AutoPay.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * ContactId.
         */
        public Builder contactId(Long contactId) {
            this.putQueryParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * ExpectedPrice.
         */
        public Builder expectedPrice(Long expectedPrice) {
            this.putQueryParameter("ExpectedPrice", expectedPrice);
            this.expectedPrice = expectedPrice;
            return this;
        }

        @Override
        public CreateIntlFixedPriceDomainOrderRequest build() {
            return new CreateIntlFixedPriceDomainOrderRequest(this);
        } 

    } 

}
