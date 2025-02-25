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
 * {@link CreateCustomerRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomerRequest</p>
 */
public class CreateCustomerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerSource")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customerSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerSubTrade")
    private String customerSubTrade;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerTrade")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customerTrade;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nation")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>Customer&quot;s name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DoorBell Marketing</p>
         */
        public Builder customerName(String customerName) {
            this.putQueryParameter("CustomerName", customerName);
            this.customerName = customerName;
            return this;
        }

        /**
         * <p>The source/channel that allow client to connected with us. Please enumerate with Customer Source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>website</p>
         */
        public Builder customerSource(String customerSource) {
            this.putQueryParameter("CustomerSource", customerSource);
            this.customerSource = customerSource;
            return this;
        }

        /**
         * <p>The sub-industry that Customer&quot;s business belongs to. Please enumerate with Customer Trade.</p>
         * 
         * <strong>example:</strong>
         * <p>0101</p>
         */
        public Builder customerSubTrade(String customerSubTrade) {
            this.putQueryParameter("CustomerSubTrade", customerSubTrade);
            this.customerSubTrade = customerSubTrade;
            return this;
        }

        /**
         * <p>The industry that Customer&quot;s business belongs to. Please enumerate with Customer Trade.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        public Builder customerTrade(String customerTrade) {
            this.putQueryParameter("CustomerTrade", customerTrade);
            this.customerTrade = customerTrade;
            return this;
        }

        /**
         * <p>The region that Customer choose to launch the Cloud Service. Please use ListCountries to confirm the valid region list for current UID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AR</p>
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
