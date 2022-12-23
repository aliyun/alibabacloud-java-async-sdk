// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterMediaRequest} extends {@link RequestModel}
 *
 * <p>RegisterMediaRequest</p>
 */
public class RegisterMediaRequest extends Request {
    @Query
    @NameInMap("RegisterMetadatas")
    @Validation(required = true)
    private String registerMetadatas;

    @Query
    @NameInMap("TemplateGroupId")
    private String templateGroupId;

    @Query
    @NameInMap("UserData")
    private String userData;

    @Query
    @NameInMap("WorkflowId")
    private String workflowId;

    private RegisterMediaRequest(Builder builder) {
        super(builder);
        this.registerMetadatas = builder.registerMetadatas;
        this.templateGroupId = builder.templateGroupId;
        this.userData = builder.userData;
        this.workflowId = builder.workflowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterMediaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return registerMetadatas
     */
    public String getRegisterMetadatas() {
        return this.registerMetadatas;
    }

    /**
     * @return templateGroupId
     */
    public String getTemplateGroupId() {
        return this.templateGroupId;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return workflowId
     */
    public String getWorkflowId() {
        return this.workflowId;
    }

    public static final class Builder extends Request.Builder<RegisterMediaRequest, Builder> {
        private String registerMetadatas; 
        private String templateGroupId; 
        private String userData; 
        private String workflowId; 

        private Builder() {
            super();
        } 

        private Builder(RegisterMediaRequest request) {
            super(request);
            this.registerMetadatas = request.registerMetadatas;
            this.templateGroupId = request.templateGroupId;
            this.userData = request.userData;
            this.workflowId = request.workflowId;
        } 

        /**
         * The metadata of the media file that you want to register. The value is a JSON string. You can specify the metadata for a maximum of 10 media files at a time. For more information about the metadata of media files, see the **RegisterMetadata** section of this topic.
         */
        public Builder registerMetadatas(String registerMetadatas) {
            this.putQueryParameter("RegisterMetadatas", registerMetadatas);
            this.registerMetadatas = registerMetadatas;
            return this;
        }

        /**
         * The ID of the transcoding template group. You can use one of the following methods to obtain the ID of the transcoding template group:
         * <p>
         * *   Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Processing** > **Transcoding Template Groups**. On the Transcoding Template Groups page, you can view the ID of the transcoding template group.
         * *   View the value of the TranscodeTemplateGroupId parameter returned by the [AddTranscodeTemplateGroup](~~102665~~) operation that you called to create a transcoding template group.
         * *   View the value of the TranscodeTemplateGroupId parameter returned by the [ListTranscodeTemplateGroup](~~102669~~) operation that you called to query a transcoding template group.
         * > *   If you do not need to transcode the media file, set the TemplateGroupId parameter to VOD_NO_TRANSCODE. Otherwise, an exception occurs during video playback. If you need to transcode the media file, specify the ID of the transcoding template group.
         * > *   If both the WorkflowId and TemplateGroupId parameters are set, the value of the WorkflowId parameter takes effect. For more information, see [Workflows](~~115347~~).
         */
        public Builder templateGroupId(String templateGroupId) {
            this.putQueryParameter("TemplateGroupId", templateGroupId);
            this.templateGroupId = templateGroupId;
            return this;
        }

        /**
         * The custom configurations such as callback configurations. The value is a JSON string. For more information, see the "UserData: specifies the custom configurations for media upload" section of the [Request parameters](~~86952#section\_6fg_qll_v3w~~) topic.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * The ID of the workflow. To view the ID of the workflow, log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Processing** > **Workflows**.
         * <p>
         * > If both the WorkflowId and TemplateGroupId parameters are set, the value of the WorkflowId parameter takes effect. For more information, see [Workflows](~~115347~~).
         */
        public Builder workflowId(String workflowId) {
            this.putQueryParameter("WorkflowId", workflowId);
            this.workflowId = workflowId;
            return this;
        }

        @Override
        public RegisterMediaRequest build() {
            return new RegisterMediaRequest(this);
        } 

    } 

}
