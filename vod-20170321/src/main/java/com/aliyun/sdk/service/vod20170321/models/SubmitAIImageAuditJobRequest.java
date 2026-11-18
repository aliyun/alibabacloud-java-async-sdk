// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link SubmitAIImageAuditJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitAIImageAuditJobRequest</p>
 */
public class SubmitAIImageAuditJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CensorProvider")
    private String censorProvider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageService")
    private String imageService;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaAuditConfiguration")
    private String mediaAuditConfiguration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mediaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private String resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceParameters")
    private String serviceParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    private SubmitAIImageAuditJobRequest(Builder builder) {
        super(builder);
        this.censorProvider = builder.censorProvider;
        this.imageService = builder.imageService;
        this.mediaAuditConfiguration = builder.mediaAuditConfiguration;
        this.mediaId = builder.mediaId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.serviceParameters = builder.serviceParameters;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAIImageAuditJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return censorProvider
     */
    public String getCensorProvider() {
        return this.censorProvider;
    }

    /**
     * @return imageService
     */
    public String getImageService() {
        return this.imageService;
    }

    /**
     * @return mediaAuditConfiguration
     */
    public String getMediaAuditConfiguration() {
        return this.mediaAuditConfiguration;
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
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
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return serviceParameters
     */
    public String getServiceParameters() {
        return this.serviceParameters;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<SubmitAIImageAuditJobRequest, Builder> {
        private String censorProvider; 
        private String imageService; 
        private String mediaAuditConfiguration; 
        private String mediaId; 
        private String ownerAccount; 
        private String ownerId; 
        private String resourceOwnerAccount; 
        private String resourceOwnerId; 
        private String serviceParameters; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitAIImageAuditJobRequest request) {
            super(request);
            this.censorProvider = request.censorProvider;
            this.imageService = request.imageService;
            this.mediaAuditConfiguration = request.mediaAuditConfiguration;
            this.mediaId = request.mediaId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.serviceParameters = request.serviceParameters;
            this.templateId = request.templateId;
        } 

        /**
         * CensorProvider.
         */
        public Builder censorProvider(String censorProvider) {
            this.putQueryParameter("CensorProvider", censorProvider);
            this.censorProvider = censorProvider;
            return this;
        }

        /**
         * ImageService.
         */
        public Builder imageService(String imageService) {
            this.putQueryParameter("ImageService", imageService);
            this.imageService = imageService;
            return this;
        }

        /**
         * <p>The review node configuration.</p>
         * <ul>
         * <li>Other configuration items of the review node. Currently, only the ResourceType field is supported, which is used to specify the media file type. You can adjust the review standards and rules for the specified type.</li>
         * <li>Usage notes for ResourceType: Only letters, digits, and underscores (_) are allowed.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>You can customize the ResourceType field based on the usage notes. After customization, <a href="https://yida.alibaba-inc.com/o/ticketapply">submit a Yida form</a> to commit to Alibaba Cloud for spooling before the configuration takes effect.</li>
         * <li>To adjust the review standards and rules for a specific ResourceType, <a href="https://yida.alibaba-inc.com/o/ticketapply">submit a Yida form</a> to request technical support.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ResourceType&quot;:&quot;****_short_video&quot;}</p>
         */
        public Builder mediaAuditConfiguration(String mediaAuditConfiguration) {
            this.putQueryParameter("MediaAuditConfiguration", mediaAuditConfiguration);
            this.mediaAuditConfiguration = mediaAuditConfiguration;
            return this;
        }

        /**
         * <p>The image ID.</p>
         * <p>The unique identifier of the image returned after the image is uploaded to ApsaraVideo VOD.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f1aa3024aee64*****6dc8ca20dbc320</p>
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
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
        public Builder resourceOwnerId(String resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * ServiceParameters.
         */
        public Builder serviceParameters(String serviceParameters) {
            this.putQueryParameter("ServiceParameters", serviceParameters);
            this.serviceParameters = serviceParameters;
            return this;
        }

        /**
         * <p>The AI template ID. You can obtain the ID by using one of the following methods:</p>
         * <ul>
         * <li>Call the <a href="https://help.aliyun.com/document_detail/102930.html">Add AI template</a> operation to add an AI template. The AI template ID is the value of TemplateId in the response.</li>
         * <li>After the AI template is added, call the <a href="https://help.aliyun.com/document_detail/102936.html">Query AI template list</a> operation to query the AI template ID, which is the value of TemplateId in the response.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a07a7f7d7d10eb9fd999e56ecc****</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public SubmitAIImageAuditJobRequest build() {
            return new SubmitAIImageAuditJobRequest(this);
        } 

    } 

}
