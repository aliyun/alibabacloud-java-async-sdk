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
 * {@link SubmitAIImageJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitAIImageJobRequest</p>
 */
public class SubmitAIImageJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AIPipelineId")
    private String AIPipelineId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AITemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String AITemplateId;

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
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String videoId;

    private SubmitAIImageJobRequest(Builder builder) {
        super(builder);
        this.AIPipelineId = builder.AIPipelineId;
        this.AITemplateId = builder.AITemplateId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.userData = builder.userData;
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAIImageJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIPipelineId
     */
    public String getAIPipelineId() {
        return this.AIPipelineId;
    }

    /**
     * @return AITemplateId
     */
    public String getAITemplateId() {
        return this.AITemplateId;
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
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    public static final class Builder extends Request.Builder<SubmitAIImageJobRequest, Builder> {
        private String AIPipelineId; 
        private String AITemplateId; 
        private String ownerAccount; 
        private String ownerId; 
        private String resourceOwnerAccount; 
        private String resourceOwnerId; 
        private String userData; 
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitAIImageJobRequest request) {
            super(request);
            this.AIPipelineId = request.AIPipelineId;
            this.AITemplateId = request.AITemplateId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.userData = request.userData;
            this.videoId = request.videoId;
        } 

        /**
         * <p>The AI task pipeline ID.</p>
         * <blockquote>
         * <p>A default ID is provided and this parameter is optional. If you need to import data in batches, you must use a separate task pipeline. Submit a ticket to apply for the configuration or contact Alibaba Cloud after-sales support. For more information about how to submit a ticket, see <a href="https://help.aliyun.com/document_detail/464625.html">Contact us</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>6492025b8f*****6ba5bb755a33438</p>
         */
        public Builder AIPipelineId(String AIPipelineId) {
            this.putQueryParameter("AIPipelineId", AIPipelineId);
            this.AIPipelineId = AIPipelineId;
            return this;
        }

        /**
         * <p>The AI image template ID. You can obtain the template ID by using one of the following methods:</p>
         * <ul>
         * <li>When you create an image template by calling the <a href="https://help.aliyun.com/document_detail/102930.html">AddAITemplate</a> operation, the template ID is the value of the TemplateId response parameter.</li>
         * <li>After a template is created, you can call the <a href="https://help.aliyun.com/document_detail/102936.html">ListAITemplate</a> operation to query the AI image template ID. The template ID is the value of the TemplateId response parameter.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ef1a8842cb9f*****cea80cad902e416</p>
         */
        public Builder AITemplateId(String AITemplateId) {
            this.putQueryParameter("AITemplateId", AITemplateId);
            this.AITemplateId = AITemplateId;
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
         * <p>The custom settings.</p>
         * <ul>
         * <li>The value must be a JSON string.</li>
         * <li>The value must contain the MessageCallback or Extend parameter.</li>
         * <li>The maximum length is 512 bytes.</li>
         * </ul>
         * <p>For more information about how to construct the parameter, see <a href="https://help.aliyun.com/document_detail/86952.html">UserData</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Extend&quot;:{&quot;localId&quot;:&quot;****&quot;,&quot;test&quot;:&quot;www&quot;}}</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * <p>The video ID. You can obtain the video ID by using one of the following methods:</p>
         * <ul>
         * <li>For videos uploaded through the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Assets</strong> &gt; <strong>Audio/Video</strong> to view the video ID.</li>
         * <li>When you upload a video by calling the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation, the video ID is the value of the VideoId response parameter.</li>
         * <li>After a video is uploaded, you can call the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation to query the video ID. The video ID is the value of the VideoId response parameter.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>357a8748c5774*****89d2726e6436aa</p>
         */
        public Builder videoId(String videoId) {
            this.putQueryParameter("VideoId", videoId);
            this.videoId = videoId;
            return this;
        }

        @Override
        public SubmitAIImageJobRequest build() {
            return new SubmitAIImageJobRequest(this);
        } 

    } 

}
