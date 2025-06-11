// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyChatappTemplatePropertiesRequest} extends {@link RequestModel}
 *
 * <p>ModifyChatappTemplatePropertiesRequest</p>
 */
public class ModifyChatappTemplatePropertiesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowSend")
    private Boolean allowSend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryChangePaused")
    private Boolean categoryChangePaused;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    @com.aliyun.core.annotation.Validation(required = true)
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateType;

    private ModifyChatappTemplatePropertiesRequest(Builder builder) {
        super(builder);
        this.allowSend = builder.allowSend;
        this.categoryChangePaused = builder.categoryChangePaused;
        this.custSpaceId = builder.custSpaceId;
        this.language = builder.language;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.templateCode = builder.templateCode;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyChatappTemplatePropertiesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowSend
     */
    public Boolean getAllowSend() {
        return this.allowSend;
    }

    /**
     * @return categoryChangePaused
     */
    public Boolean getCategoryChangePaused() {
        return this.categoryChangePaused;
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
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

    /**
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<ModifyChatappTemplatePropertiesRequest, Builder> {
        private Boolean allowSend; 
        private Boolean categoryChangePaused; 
        private String custSpaceId; 
        private String language; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String templateCode; 
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyChatappTemplatePropertiesRequest request) {
            super(request);
            this.allowSend = request.allowSend;
            this.categoryChangePaused = request.categoryChangePaused;
            this.custSpaceId = request.custSpaceId;
            this.language = request.language;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.templateCode = request.templateCode;
            this.templateType = request.templateType;
        } 

        /**
         * AllowSend.
         */
        public Builder allowSend(Boolean allowSend) {
            this.putQueryParameter("AllowSend", allowSend);
            this.allowSend = allowSend;
            return this;
        }

        /**
         * CategoryChangePaused.
         */
        public Builder categoryChangePaused(Boolean categoryChangePaused) {
            this.putQueryParameter("CategoryChangePaused", categoryChangePaused);
            this.categoryChangePaused = categoryChangePaused;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cams-idk***</p>
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>zh_CN</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
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

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>929938***</p>
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WHATSAPP</p>
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public ModifyChatappTemplatePropertiesRequest build() {
            return new ModifyChatappTemplatePropertiesRequest(this);
        } 

    } 

}
