// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ChatappMigrationVerifiedRequest} extends {@link RequestModel}
 *
 * <p>ChatappMigrationVerifiedRequest</p>
 */
public class ChatappMigrationVerifiedRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerifyCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String verifyCode;

    private ChatappMigrationVerifiedRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
        this.phoneNumber = builder.phoneNumber;
        this.verifyCode = builder.verifyCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatappMigrationVerifiedRequest create() {
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

    public static final class Builder extends Request.Builder<ChatappMigrationVerifiedRequest, Builder> {
        private String custSpaceId; 
        private String phoneNumber; 
        private String verifyCode; 

        private Builder() {
            super();
        } 

        private Builder(ChatappMigrationVerifiedRequest request) {
            super(request);
            this.custSpaceId = request.custSpaceId;
            this.phoneNumber = request.phoneNumber;
            this.verifyCode = request.verifyCode;
        } 

        /**
         * <p>The space ID of the user under the independent software vendor (ISV) account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>293483938849493</p>
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * <p>The phone number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>861380001234</p>
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * <p>The verification code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>828798</p>
         */
        public Builder verifyCode(String verifyCode) {
            this.putQueryParameter("VerifyCode", verifyCode);
            this.verifyCode = verifyCode;
            return this;
        }

        @Override
        public ChatappMigrationVerifiedRequest build() {
            return new ChatappMigrationVerifiedRequest(this);
        } 

    } 

}
