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
         * The URLs of the media files that failed to be registered.
         */
        public Builder registerMetadatas(String registerMetadatas) {
            this.putQueryParameter("RegisterMetadatas", registerMetadatas);
            this.registerMetadatas = registerMetadatas;
            return this;
        }

        /**
         * The ID of the workflow. To view the ID of the workflow, log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Processing** > **Workflows**.
         * <p>
         * > If both the WorkflowId and TemplateGroupId parameters are set, the value of the WorkflowId parameter takes effect. For more information, see [Workflows](~~115347~~).
         */
        public Builder templateGroupId(String templateGroupId) {
            this.putQueryParameter("TemplateGroupId", templateGroupId);
            this.templateGroupId = templateGroupId;
            return this;
        }

        /**
         * The ID of the media file that is registered with ApsaraVideo VOD. If the registered media file is an audio or video file, the value of the VideoId parameter returned by ApsaraVideo VOD takes effect.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * The ID of the request.
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
