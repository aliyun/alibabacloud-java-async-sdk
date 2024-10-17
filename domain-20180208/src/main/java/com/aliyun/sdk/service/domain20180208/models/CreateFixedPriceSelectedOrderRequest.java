// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateFixedPriceSelectedOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateFixedPriceSelectedOrderRequest</p>
 */
public class CreateFixedPriceSelectedOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpectedPrice")
    @com.aliyun.core.annotation.Validation(required = true)
    private Double expectedPrice;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    private CreateFixedPriceSelectedOrderRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.contactId = builder.contactId;
        this.domainName = builder.domainName;
        this.expectedPrice = builder.expectedPrice;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFixedPriceSelectedOrderRequest create() {
        return builder().build();
    }

    @Override
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
     * @return contactId
     */
    public String getContactId() {
        return this.contactId;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return expectedPrice
     */
    public Double getExpectedPrice() {
        return this.expectedPrice;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<CreateFixedPriceSelectedOrderRequest, Builder> {
        private String code; 
        private String contactId; 
        private String domainName; 
        private Double expectedPrice; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(CreateFixedPriceSelectedOrderRequest request) {
            super(request);
            this.code = request.code;
            this.contactId = request.contactId;
            this.domainName = request.domainName;
            this.expectedPrice = request.expectedPrice;
            this.source = request.source;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.putQueryParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11935401</p>
         */
        public Builder contactId(String contactId) {
            this.putQueryParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20.00</p>
         */
        public Builder expectedPrice(Double expectedPrice) {
            this.putQueryParameter("ExpectedPrice", expectedPrice);
            this.expectedPrice = expectedPrice;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public CreateFixedPriceSelectedOrderRequest build() {
            return new CreateFixedPriceSelectedOrderRequest(this);
        } 

    } 

}
