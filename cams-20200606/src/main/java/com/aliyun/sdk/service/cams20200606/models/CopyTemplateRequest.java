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
 * {@link CopyTemplateRequest} extends {@link RequestModel}
 *
 * <p>CopyTemplateRequest</p>
 */
public class CopyTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
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
    @com.aliyun.core.annotation.NameInMap("SceneTemplateCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneTemplateCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneTemplateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneTemplateName;

    private CopyTemplateRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
        this.language = builder.language;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sceneTemplateCode = builder.sceneTemplateCode;
        this.sceneTemplateName = builder.sceneTemplateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyTemplateRequest create() {
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
     * @return sceneTemplateCode
     */
    public String getSceneTemplateCode() {
        return this.sceneTemplateCode;
    }

    /**
     * @return sceneTemplateName
     */
    public String getSceneTemplateName() {
        return this.sceneTemplateName;
    }

    public static final class Builder extends Request.Builder<CopyTemplateRequest, Builder> {
        private String custSpaceId; 
        private String language; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sceneTemplateCode; 
        private String sceneTemplateName; 

        private Builder() {
            super();
        } 

        private Builder(CopyTemplateRequest request) {
            super(request);
            this.custSpaceId = request.custSpaceId;
            this.language = request.language;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sceneTemplateCode = request.sceneTemplateCode;
            this.sceneTemplateName = request.sceneTemplateName;
        } 

        /**
         * CustSpaceId.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * Language.
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
         * <p>12456</p>
         */
        public Builder sceneTemplateCode(String sceneTemplateCode) {
            this.putQueryParameter("SceneTemplateCode", sceneTemplateCode);
            this.sceneTemplateCode = sceneTemplateCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder sceneTemplateName(String sceneTemplateName) {
            this.putQueryParameter("SceneTemplateName", sceneTemplateName);
            this.sceneTemplateName = sceneTemplateName;
            return this;
        }

        @Override
        public CopyTemplateRequest build() {
            return new CopyTemplateRequest(this);
        } 

    } 

}
