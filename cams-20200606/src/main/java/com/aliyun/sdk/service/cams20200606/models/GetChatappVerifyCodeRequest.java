// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetChatappVerifyCodeRequest} extends {@link RequestModel}
 *
 * <p>GetChatappVerifyCodeRequest</p>
 */
public class GetChatappVerifyCodeRequest extends Request {
    @Body
    @NameInMap("CustSpaceId")
    @Validation(required = true)
    private String custSpaceId;

    @Body
    @NameInMap("Locale")
    @Validation(required = true)
    private String locale;

    @Body
    @NameInMap("Method")
    @Validation(required = true)
    private String method;

    @Body
    @NameInMap("PhoneNumber")
    @Validation(required = true)
    private String phoneNumber;

    private GetChatappVerifyCodeRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
        this.locale = builder.locale;
        this.method = builder.method;
        this.phoneNumber = builder.phoneNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChatappVerifyCodeRequest create() {
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

    public static final class Builder extends Request.Builder<GetChatappVerifyCodeRequest, Builder> {
        private String custSpaceId; 
        private String locale; 
        private String method; 
        private String phoneNumber; 

        private Builder() {
            super();
        } 

        private Builder(GetChatappVerifyCodeRequest request) {
            super(request);
            this.custSpaceId = request.custSpaceId;
            this.locale = request.locale;
            this.method = request.method;
            this.phoneNumber = request.phoneNumber;
        } 

        /**
         * The space ID of the user under the independent software vendor (ISV) account.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putBodyParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * The language.
         */
        public Builder locale(String locale) {
            this.putBodyParameter("Locale", locale);
            this.locale = locale;
            return this;
        }

        /**
         * The method to obtain the verification code. Valid values: SMS and VOICE.
         */
        public Builder method(String method) {
            this.putBodyParameter("Method", method);
            this.method = method;
            return this;
        }

        /**
         * The phone number.
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putBodyParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        @Override
        public GetChatappVerifyCodeRequest build() {
            return new GetChatappVerifyCodeRequest(this);
        } 

    } 

}
