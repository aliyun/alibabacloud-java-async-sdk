// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetFingerPrintTemplateRequest} extends {@link RequestModel}
 *
 * <p>SetFingerPrintTemplateRequest</p>
 */
public class SetFingerPrintTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptedFingerPrintTemplate")
    private String encryptedFingerPrintTemplate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptedKey")
    private String encryptedKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FingerPrintTemplate")
    private String fingerPrintTemplate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loginToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    private SetFingerPrintTemplateRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.encryptedFingerPrintTemplate = builder.encryptedFingerPrintTemplate;
        this.encryptedKey = builder.encryptedKey;
        this.fingerPrintTemplate = builder.fingerPrintTemplate;
        this.loginToken = builder.loginToken;
        this.password = builder.password;
        this.regionId = builder.regionId;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetFingerPrintTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return encryptedFingerPrintTemplate
     */
    public String getEncryptedFingerPrintTemplate() {
        return this.encryptedFingerPrintTemplate;
    }

    /**
     * @return encryptedKey
     */
    public String getEncryptedKey() {
        return this.encryptedKey;
    }

    /**
     * @return fingerPrintTemplate
     */
    public String getFingerPrintTemplate() {
        return this.fingerPrintTemplate;
    }

    /**
     * @return loginToken
     */
    public String getLoginToken() {
        return this.loginToken;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<SetFingerPrintTemplateRequest, Builder> {
        private String clientId; 
        private String clientToken; 
        private String description; 
        private String encryptedFingerPrintTemplate; 
        private String encryptedKey; 
        private String fingerPrintTemplate; 
        private String loginToken; 
        private String password; 
        private String regionId; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(SetFingerPrintTemplateRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.encryptedFingerPrintTemplate = request.encryptedFingerPrintTemplate;
            this.encryptedKey = request.encryptedKey;
            this.fingerPrintTemplate = request.fingerPrintTemplate;
            this.loginToken = request.loginToken;
            this.password = request.password;
            this.regionId = request.regionId;
            this.sessionId = request.sessionId;
        } 

        /**
         * ClientId.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EncryptedFingerPrintTemplate.
         */
        public Builder encryptedFingerPrintTemplate(String encryptedFingerPrintTemplate) {
            this.putQueryParameter("EncryptedFingerPrintTemplate", encryptedFingerPrintTemplate);
            this.encryptedFingerPrintTemplate = encryptedFingerPrintTemplate;
            return this;
        }

        /**
         * EncryptedKey.
         */
        public Builder encryptedKey(String encryptedKey) {
            this.putQueryParameter("EncryptedKey", encryptedKey);
            this.encryptedKey = encryptedKey;
            return this;
        }

        /**
         * FingerPrintTemplate.
         */
        public Builder fingerPrintTemplate(String fingerPrintTemplate) {
            this.putQueryParameter("FingerPrintTemplate", fingerPrintTemplate);
            this.fingerPrintTemplate = fingerPrintTemplate;
            return this;
        }

        /**
         * LoginToken.
         */
        public Builder loginToken(String loginToken) {
            this.putQueryParameter("LoginToken", loginToken);
            this.loginToken = loginToken;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public SetFingerPrintTemplateRequest build() {
            return new SetFingerPrintTemplateRequest(this);
        } 

    } 

}
