// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMigrationVerifyCodeRequest} extends {@link RequestModel}
 *
 * <p>GetMigrationVerifyCodeRequest</p>
 */
public class GetMigrationVerifyCodeRequest extends Request {
    @Query
    @NameInMap("CustSpaceId")
    @Validation(required = true)
    private String custSpaceId;

    @Query
    @NameInMap("Locale")
    @Validation(required = true)
    private String locale;

    @Query
    @NameInMap("Method")
    @Validation(required = true)
    private String method;

    @Query
    @NameInMap("PhoneNumber")
    @Validation(required = true)
    private String phoneNumber;

    private GetMigrationVerifyCodeRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
        this.locale = builder.locale;
        this.method = builder.method;
        this.phoneNumber = builder.phoneNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMigrationVerifyCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return locale
     */
    public String getLocale() {
        return this.locale;
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public static final class Builder extends Request.Builder<GetMigrationVerifyCodeRequest, Builder> {
        private String custSpaceId; 
        private String locale; 
        private String method; 
        private String phoneNumber; 

        private Builder() {
            super();
        } 

        private Builder(GetMigrationVerifyCodeRequest request) {
            super(request);
            this.custSpaceId = request.custSpaceId;
            this.locale = request.locale;
            this.method = request.method;
            this.phoneNumber = request.phoneNumber;
        } 

        /**
         * CustSpaceId.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * Locale.
         */
        public Builder locale(String locale) {
            this.putQueryParameter("Locale", locale);
            this.locale = locale;
            return this;
        }

        /**
         * Method.
         */
        public Builder method(String method) {
            this.putQueryParameter("Method", method);
            this.method = method;
            return this;
        }

        /**
         * PhoneNumber.
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        @Override
        public GetMigrationVerifyCodeRequest build() {
            return new GetMigrationVerifyCodeRequest(this);
        } 

    } 

}
