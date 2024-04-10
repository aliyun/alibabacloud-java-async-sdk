// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddChatappPhoneNumberRequest} extends {@link RequestModel}
 *
 * <p>AddChatappPhoneNumberRequest</p>
 */
public class AddChatappPhoneNumberRequest extends Request {
    @Body
    @NameInMap("Cc")
    @Validation(required = true)
    private String cc;

    @Body
    @NameInMap("CustSpaceId")
    @Validation(required = true)
    private String custSpaceId;

    @Body
    @NameInMap("PhoneNumber")
    @Validation(required = true)
    private String phoneNumber;

    @Body
    @NameInMap("PreValidateId")
    private String preValidateId;

    @Body
    @NameInMap("VerifiedName")
    @Validation(required = true)
    private String verifiedName;

    private AddChatappPhoneNumberRequest(Builder builder) {
        super(builder);
        this.cc = builder.cc;
        this.custSpaceId = builder.custSpaceId;
        this.phoneNumber = builder.phoneNumber;
        this.preValidateId = builder.preValidateId;
        this.verifiedName = builder.verifiedName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddChatappPhoneNumberRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cc
     */
    public String getCc() {
        return this.cc;
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
     * @return preValidateId
     */
    public String getPreValidateId() {
        return this.preValidateId;
    }

    /**
     * @return verifiedName
     */
    public String getVerifiedName() {
        return this.verifiedName;
    }

    public static final class Builder extends Request.Builder<AddChatappPhoneNumberRequest, Builder> {
        private String cc; 
        private String custSpaceId; 
        private String phoneNumber; 
        private String preValidateId; 
        private String verifiedName; 

        private Builder() {
            super();
        } 

        private Builder(AddChatappPhoneNumberRequest request) {
            super(request);
            this.cc = request.cc;
            this.custSpaceId = request.custSpaceId;
            this.phoneNumber = request.phoneNumber;
            this.preValidateId = request.preValidateId;
            this.verifiedName = request.verifiedName;
        } 

        /**
         * The country code.
         */
        public Builder cc(String cc) {
            this.putBodyParameter("Cc", cc);
            this.cc = cc;
            return this;
        }

        /**
         * The space ID of the user within the independent software vendor (ISV) account.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putBodyParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * The phone number without a country code.
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putBodyParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * The ID of the pre-registered phone number.
         */
        public Builder preValidateId(String preValidateId) {
            this.putBodyParameter("PreValidateId", preValidateId);
            this.preValidateId = preValidateId;
            return this;
        }

        /**
         * The display name of the phone number.
         */
        public Builder verifiedName(String verifiedName) {
            this.putBodyParameter("VerifiedName", verifiedName);
            this.verifiedName = verifiedName;
            return this;
        }

        @Override
        public AddChatappPhoneNumberRequest build() {
            return new AddChatappPhoneNumberRequest(this);
        } 

    } 

}
