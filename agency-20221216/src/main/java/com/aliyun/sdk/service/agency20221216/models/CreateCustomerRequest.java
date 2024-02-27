// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomerRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomerRequest</p>
 */
public class CreateCustomerRequest extends Request {
    @Query
    @NameInMap("CustomerName")
    @Validation(required = true)
    private String customerName;

    @Query
    @NameInMap("CustomerSource")
    @Validation(required = true)
    private String customerSource;

    @Query
    @NameInMap("CustomerSubTrade")
    private String customerSubTrade;

    @Query
    @NameInMap("CustomerTrade")
    @Validation(required = true)
    private String customerTrade;

    @Query
    @NameInMap("Nation")
    @Validation(required = true)
    private String nation;

    private CreateCustomerRequest(Builder builder) {
        super(builder);
        this.customerName = builder.customerName;
        this.customerSource = builder.customerSource;
        this.customerSubTrade = builder.customerSubTrade;
        this.customerTrade = builder.customerTrade;
        this.nation = builder.nation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customerName
     */
    public String getCustomerName() {
        return this.customerName;
    }

    /**
     * @return customerSource
     */
    public String getCustomerSource() {
        return this.customerSource;
    }

    /**
     * @return customerSubTrade
     */
    public String getCustomerSubTrade() {
        return this.customerSubTrade;
    }

    /**
     * @return customerTrade
     */
    public String getCustomerTrade() {
        return this.customerTrade;
    }

    /**
     * @return nation
     */
    public String getNation() {
        return this.nation;
    }

    public static final class Builder extends Request.Builder<CreateCustomerRequest, Builder> {
        private String customerName; 
        private String customerSource; 
        private String customerSubTrade; 
        private String customerTrade; 
        private String nation; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomerRequest request) {
            super(request);
            this.customerName = request.customerName;
            this.customerSource = request.customerSource;
            this.customerSubTrade = request.customerSubTrade;
            this.customerTrade = request.customerTrade;
            this.nation = request.nation;
        } 

        /**
         * Customer\"s name.
         */
        public Builder customerName(String customerName) {
            this.putQueryParameter("CustomerName", customerName);
            this.customerName = customerName;
            return this;
        }

        /**
         * The source/channel that allow client to connected with us. Please enumerate with Customer Source.
         */
        public Builder customerSource(String customerSource) {
            this.putQueryParameter("CustomerSource", customerSource);
            this.customerSource = customerSource;
            return this;
        }

        /**
         * The sub-industry that Customer\"s business belongs to. Please enumerate with Customer Trade.
         */
        public Builder customerSubTrade(String customerSubTrade) {
            this.putQueryParameter("CustomerSubTrade", customerSubTrade);
            this.customerSubTrade = customerSubTrade;
            return this;
        }

        /**
         * The industry that Customer\"s business belongs to. Please enumerate with Customer Trade.
         */
        public Builder customerTrade(String customerTrade) {
            this.putQueryParameter("CustomerTrade", customerTrade);
            this.customerTrade = customerTrade;
            return this;
        }

        /**
         * The region that Customer choose to launch the Cloud Service. Please use ListCountries to confirm the valid region list for current UID.
         */
        public Builder nation(String nation) {
            this.putQueryParameter("Nation", nation);
            this.nation = nation;
            return this;
        }

        @Override
        public CreateCustomerRequest build() {
            return new CreateCustomerRequest(this);
        } 

    } 

}
