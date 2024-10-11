// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    private SubmitAIImageAuditJobRequest(Builder builder) {
        super(builder);
        this.mediaAuditConfiguration = builder.mediaAuditConfiguration;
        this.mediaId = builder.mediaId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
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
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<SubmitAIImageAuditJobRequest, Builder> {
        private String mediaAuditConfiguration; 
        private String mediaId; 
        private String ownerAccount; 
        private String ownerId; 
        private String resourceOwnerAccount; 
        private String resourceOwnerId; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitAIImageAuditJobRequest request) {
            super(request);
            this.mediaAuditConfiguration = request.mediaAuditConfiguration;
            this.mediaId = request.mediaId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.templateId = request.templateId;
        } 

        /**
         * <p>The configuration information about the review job.</p>
         * <ul>
         * <li>Other configuration items of the review job. Only the ResourceType field is supported. This field is used to specify the type of media files. You can adjust review standards and rules based on the type of media files.</li>
         * <li>The value of ResourceType can contain only letters, digits, and underscores (_).</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>You can specify a value for the ResourceType field based on the preceding limits. After you specify a value for the ResourceType field, you must <a href="https://yida.alibaba-inc.com/o/ticketapply">submit a ticket</a>. The value takes effect after Alibaba Cloud processes your ticket.</li>
         * <li>If you want to change moderation policies and rules based on ResourceType, <a href="https://yida.alibaba-inc.com/o/ticketapply">submit a ticket</a> to contact technical support.</li>
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
         * <p>The ID of the image.</p>
         * <p>The unique ID of the image is returned after the image is uploaded to ApsaraVideo VOD.</p>
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
         * <p>The ID of the AI template. You can use one of the following methods to obtain the ID:</p>
         * <ul>
         * <li>Obtain the value of TemplateId from the response to the <a href="https://help.aliyun.com/document_detail/102930.html">AddAITemplate</a> operation that you call to create an AI template.</li>
         * <li>Obtain the value of TemplateId from the response to the <a href="https://help.aliyun.com/document_detail/102936.html">ListAITemplate</a> operation that you call to create an AI template.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VOD-0003-00****</p>
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
