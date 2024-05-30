// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChatappVerifyAndRegisterRequest} extends {@link RequestModel}
 *
 * <p>ChatappVerifyAndRegisterRequest</p>
 */
public class ChatappVerifyAndRegisterRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String custSpaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VerifyCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String verifyCode;

    private ChatappVerifyAndRegisterRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
        this.phoneNumber = builder.phoneNumber;
        this.verifyCode = builder.verifyCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatappVerifyAndRegisterRequest create() {
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

    public static final class Builder extends Request.Builder<ChatappVerifyAndRegisterRequest, Builder> {
        private String custSpaceId; 
        private String phoneNumber; 
        private String verifyCode; 

        private Builder() {
            super();
        } 

        private Builder(ChatappVerifyAndRegisterRequest request) {
            super(request);
            this.custSpaceId = request.custSpaceId;
            this.phoneNumber = request.phoneNumber;
            this.verifyCode = request.verifyCode;
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
         * The phone number.
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putBodyParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * The verification code.
         */
        public Builder verifyCode(String verifyCode) {
            this.putBodyParameter("VerifyCode", verifyCode);
            this.verifyCode = verifyCode;
            return this;
        }

        @Override
        public ChatappVerifyAndRegisterRequest build() {
            return new ChatappVerifyAndRegisterRequest(this);
        } 

    } 

}
