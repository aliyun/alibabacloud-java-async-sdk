// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitAIImageJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitAIImageJobRequest</p>
 */
public class SubmitAIImageJobRequest extends Request {
    @Query
    @NameInMap("AIPipelineId")
    private String AIPipelineId;

    @Query
    @NameInMap("AITemplateId")
    @Validation(required = true)
    private String AITemplateId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private String resourceOwnerId;

    @Query
    @NameInMap("UserData")
    private String userData;

    @Query
    @NameInMap("VideoId")
    @Validation(required = true)
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
         * The ID of the pipeline that is used for the AI processing job.
         * <p>
         * 
         * >  This parameter is optional if you have specified a default pipeline ID. If you need to submit image AI processing jobs in a batch to a specific pipeline, [submit a ticket](https://yida.alibaba-inc.com/o/ticketapply) to contact Alibaba Cloud technical support.
         */
        public Builder AIPipelineId(String AIPipelineId) {
            this.putQueryParameter("AIPipelineId", AIPipelineId);
            this.AIPipelineId = AIPipelineId;
            return this;
        }

        /**
         * The ID of the AI template. You can use one of the following methods to obtain the ID:
         * <p>
         * 
         * *   Obtain the value of TemplateId from the response to the [AddAITemplate](~~102930~~) that you call to create the template.
         * *   Obtain the value of TemplateId from the response to the [ListAITemplate](~~102936~~) operation after you create the template.
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
         * The user data.
         * <p>
         * 
         * *   The value must be a JSON string.
         * *   You must specify the MessageCallback or Extend parameter.
         * *   The value can contain a maximum of 512 bytes.
         * 
         * For more information, see the "UserData: specifies the custom configurations for media upload" section of the [Request parameters](~~86952~~) topic.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * The ID of the video. You can use one of the following methods to obtain the ID:
         * <p>
         * 
         * *   Log on to the [ApsaraVideo VOD](https://vod.console.aliyun.com) console. In the left-side navigation pane, choose **Media Files** > **Audio/Video**. On the Video and Audio page, view the ID of the video file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.
         * *   Obtain the value of VideoId from the response to the [CreateUploadVideo](~~55407~~) operation that you call to upload the video.
         * *   Obtain the value of VideoId from the response to the [SearchMedia](~~86044~~) operation after you upload the video.
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
