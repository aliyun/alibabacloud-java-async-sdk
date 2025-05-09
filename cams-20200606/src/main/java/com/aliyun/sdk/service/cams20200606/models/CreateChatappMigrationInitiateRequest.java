// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link CreateChatappMigrationInitiateRequest} extends {@link RequestModel}
 *
 * <p>CreateChatappMigrationInitiateRequest</p>
 */
public class CreateChatappMigrationInitiateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CountryCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String countryCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MobileNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mobileNumber;

    private CreateChatappMigrationInitiateRequest(Builder builder) {
        super(builder);
        this.countryCode = builder.countryCode;
        this.custSpaceId = builder.custSpaceId;
        this.mobileNumber = builder.mobileNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateChatappMigrationInitiateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return countryCode
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return mobileNumber
     */
    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public static final class Builder extends Request.Builder<CreateChatappMigrationInitiateRequest, Builder> {
        private String countryCode; 
        private String custSpaceId; 
        private String mobileNumber; 

        private Builder() {
            super();
        } 

        private Builder(CreateChatappMigrationInitiateRequest request) {
            super(request);
            this.countryCode = request.countryCode;
            this.custSpaceId = request.custSpaceId;
            this.mobileNumber = request.mobileNumber;
        } 

        /**
         * <p>The code of the country or region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>86</p>
         */
        public Builder countryCode(String countryCode) {
            this.putQueryParameter("CountryCode", countryCode);
            this.countryCode = countryCode;
            return this;
        }

        /**
         * <p>The space ID of the user within the ISV account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>293483938849493****</p>
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * <p>The mobile number without the country code or region code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>13900001234</p>
         */
        public Builder mobileNumber(String mobileNumber) {
            this.putQueryParameter("MobileNumber", mobileNumber);
            this.mobileNumber = mobileNumber;
            return this;
        }

        @Override
        public CreateChatappMigrationInitiateRequest build() {
            return new CreateChatappMigrationInitiateRequest(this);
        } 

    } 

}
