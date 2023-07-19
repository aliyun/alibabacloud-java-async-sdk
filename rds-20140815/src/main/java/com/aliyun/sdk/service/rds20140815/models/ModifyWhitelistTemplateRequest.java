// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWhitelistTemplateRequest} extends {@link RequestModel}
 *
 * <p>ModifyWhitelistTemplateRequest</p>
 */
public class ModifyWhitelistTemplateRequest extends Request {
    @Query
    @NameInMap("IpWhitelist")
    @Validation(required = true)
    private String ipWhitelist;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TemplateId")
    private Integer templateId;

    @Query
    @NameInMap("TemplateName")
    private String templateName;

    private ModifyWhitelistTemplateRequest(Builder builder) {
        super(builder);
        this.ipWhitelist = builder.ipWhitelist;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.templateId = builder.templateId;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWhitelistTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipWhitelist
     */
    public String getIpWhitelist() {
        return this.ipWhitelist;
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
     * @return templateId
     */
    public Integer getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder extends Request.Builder<ModifyWhitelistTemplateRequest, Builder> {
        private String ipWhitelist; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer templateId; 
        private String templateName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyWhitelistTemplateRequest request) {
            super(request);
            this.ipWhitelist = request.ipWhitelist;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.templateId = request.templateId;
            this.templateName = request.templateName;
        } 

        /**
         * IpWhitelist.
         */
        public Builder ipWhitelist(String ipWhitelist) {
            this.putQueryParameter("IpWhitelist", ipWhitelist);
            this.ipWhitelist = ipWhitelist;
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
         * TemplateId.
         */
        public Builder templateId(Integer templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        @Override
        public ModifyWhitelistTemplateRequest build() {
            return new ModifyWhitelistTemplateRequest(this);
        } 

    } 

}
