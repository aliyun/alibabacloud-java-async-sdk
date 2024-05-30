// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPreValidatePhoneIdRequest} extends {@link RequestModel}
 *
 * <p>GetPreValidatePhoneIdRequest</p>
 */
public class GetPreValidatePhoneIdRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VerifyCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String verifyCode;

    private GetPreValidatePhoneIdRequest(Builder builder) {
        super(builder);
        this.phoneNumber = builder.phoneNumber;
        this.verifyCode = builder.verifyCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPreValidatePhoneIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return verifyCode
     */
    public String getVerifyCode() {
        return this.verifyCode;
    }

    public static final class Builder extends Request.Builder<GetPreValidatePhoneIdRequest, Builder> {
        private String phoneNumber; 
        private String verifyCode; 

        private Builder() {
            super();
        } 

        private Builder(GetPreValidatePhoneIdRequest request) {
            super(request);
            this.phoneNumber = request.phoneNumber;
            this.verifyCode = request.verifyCode;
        } 

        /**
         * The phone number.
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putBodyParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * The verification code provided when you purchased the pre-registered phone number.
         */
        public Builder verifyCode(String verifyCode) {
            this.putBodyParameter("VerifyCode", verifyCode);
            this.verifyCode = verifyCode;
            return this;
        }

        @Override
        public GetPreValidatePhoneIdRequest build() {
            return new GetPreValidatePhoneIdRequest(this);
        } 

    } 

}
