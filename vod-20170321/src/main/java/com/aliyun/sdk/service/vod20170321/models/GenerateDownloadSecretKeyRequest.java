// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateDownloadSecretKeyRequest} extends {@link RequestModel}
 *
 * <p>GenerateDownloadSecretKeyRequest</p>
 */
public class GenerateDownloadSecretKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppDecryptKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appDecryptKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppIdentification")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appIdentification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private GenerateDownloadSecretKeyRequest(Builder builder) {
        super(builder);
        this.appDecryptKey = builder.appDecryptKey;
        this.appIdentification = builder.appIdentification;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateDownloadSecretKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appDecryptKey
     */
    public String getAppDecryptKey() {
        return this.appDecryptKey;
    }

    /**
     * @return appIdentification
     */
    public String getAppIdentification() {
        return this.appIdentification;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<GenerateDownloadSecretKeyRequest, Builder> {
        private String appDecryptKey; 
        private String appIdentification; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(GenerateDownloadSecretKeyRequest request) {
            super(request);
            this.appDecryptKey = request.appDecryptKey;
            this.appIdentification = request.appIdentification;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * A custom string of 16 to 32 characters in length. The string must contain uppercase letters, lowercase letters, and digits.
         */
        public Builder appDecryptKey(String appDecryptKey) {
            this.putQueryParameter("AppDecryptKey", appDecryptKey);
            this.appDecryptKey = appDecryptKey;
            return this;
        }

        /**
         * The unique identifier of the app.
         * <p>
         * 
         * *   Android: the SHA-1 fingerprint of the keystore. The value is a string that contains a colon (:).
         * *   iOS: the bundle ID of the app.
         * *   Windows: the serial number in the digital signature certificate.
         * 
         * For more information about how to obtain the unique identifier of an app, see [Obtain the unique app identifier](~~86107#section-wtj-9d7-lg2~~).
         */
        public Builder appIdentification(String appIdentification) {
            this.putQueryParameter("AppIdentification", appIdentification);
            this.appIdentification = appIdentification;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public GenerateDownloadSecretKeyRequest build() {
            return new GenerateDownloadSecretKeyRequest(this);
        } 

    } 

}
