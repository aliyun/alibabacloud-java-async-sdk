// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPreValidatePhoneIdRequest} extends {@link RequestModel}
 *
 * <p>GetPreValidatePhoneIdRequest</p>
 */
public class GetPreValidatePhoneIdRequest extends Request {
    @Body
    @NameInMap("PhoneNumber")
    @Validation(required = true)
    private String phoneNumber;

    @Body
    @NameInMap("VerifyCode")
    @Validation(required = true)
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
         * PhoneNumber.
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putBodyParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * VerifyCode.
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
