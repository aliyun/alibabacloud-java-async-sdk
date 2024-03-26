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
         * The metadata of the media files. The value must be a JSON string. You can specify the metadata for up to 10 media files at a time. For more information about the metadata of media files, see the **RegisterMetadata** section of this topic.
         */
        public Builder registerMetadatas(String registerMetadatas) {
            this.putQueryParameter("RegisterMetadatas", registerMetadatas);
            this.registerMetadatas = registerMetadatas;
            return this;
        }

        /**
         * The ID of the transcoding template group. You can use one of the following methods to obtain the ID:
         * <p>
         * 
         * *   Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Processing** > **Transcoding Template Groups**. On the Transcoding Template Groups page, you can view the ID of the transcoding template group.
         * *   Obtain the value of the TranscodeTemplateGroupId parameter from the response to the [AddTranscodeTemplateGroup](~~102665~~) operation that you called to create a transcoding template group.
         * *   Obtain the value of the TranscodeTemplateGroupId parameter from the response to the [ListTranscodeTemplateGroup](~~102669~~) operation that you called to query transcoding template groups.
         * 
         * > 
         * 
         * *   If you do not need to transcode media files, set the TemplateGroupId parameter to VOD_NO_TRANSCODE. If you do not specify this configuration, errors occur on your files. If you need to transcode media files, specify the ID of the transcoding template group.
         * 
         * *   If you specify both WorkflowId and TemplateGroupId, the value of the WorkflowId parameter takes effect. For more information, see [Workflows](~~115347~~).
         */
        public Builder templateGroupId(String templateGroupId) {
            this.putQueryParameter("TemplateGroupId", templateGroupId);
            this.templateGroupId = templateGroupId;
            return this;
        }

        /**
         * The custom settings. The value must be a JSON string. You can configure settings such as message callbacks. For more information, see [UserData](~~86952#section\_6fg_qll_v3w~~).
         * <p>
         * 
         * >  You cannot configure callbacks for this operation. No callback message is returned after the media files are registered even if you configure callback settings for this parameter. If you configure callback settings for the UserData parameter when you create media processing jobs such as transcoding and snapshot capture jobs for the media file, the callback URL that you specified is used. If you do not configure callback settings when you create media processing jobs, the callback URL that you specified for the UserData parameter when you register the media file is used.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * The ID of the workflow. To view the workflow ID, perform the following steps: Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Processing** > **Workflows**.
         * <p>
         * 
         * >  If you specify both WorkflowId and TemplateGroupId, the value of WorkflowId parameter takes effect. For more information, see [Workflows](~~115347~~).
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
