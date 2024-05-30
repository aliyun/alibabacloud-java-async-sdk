// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePhoneEncryptionPublicKeyRequest} extends {@link RequestModel}
 *
 * <p>UpdatePhoneEncryptionPublicKeyRequest</p>
 */
public class UpdatePhoneEncryptionPublicKeyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    private String custSpaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EncryptionPublicKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String encryptionPublicKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNumber;

    private UpdatePhoneEncryptionPublicKeyRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
        this.encryptionPublicKey = builder.encryptionPublicKey;
        this.phoneNumber = builder.phoneNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePhoneEncryptionPublicKeyRequest create() {
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
     * @return encryptionPublicKey
     */
    public String getEncryptionPublicKey() {
        return this.encryptionPublicKey;
    }

    /**
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public static final class Builder extends Request.Builder<UpdatePhoneEncryptionPublicKeyRequest, Builder> {
        private String custSpaceId; 
        private String encryptionPublicKey; 
        private String phoneNumber; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePhoneEncryptionPublicKeyRequest request) {
            super(request);
            this.custSpaceId = request.custSpaceId;
            this.encryptionPublicKey = request.encryptionPublicKey;
            this.phoneNumber = request.phoneNumber;
        } 

        /**
         * CustSpaceId.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putBodyParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * EncryptionPublicKey.
         */
        public Builder encryptionPublicKey(String encryptionPublicKey) {
            this.putBodyParameter("EncryptionPublicKey", encryptionPublicKey);
            this.encryptionPublicKey = encryptionPublicKey;
            return this;
        }

        /**
         * PhoneNumber.
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putBodyParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        @Override
        public UpdatePhoneEncryptionPublicKeyRequest build() {
            return new UpdatePhoneEncryptionPublicKeyRequest(this);
        } 

    } 

}
