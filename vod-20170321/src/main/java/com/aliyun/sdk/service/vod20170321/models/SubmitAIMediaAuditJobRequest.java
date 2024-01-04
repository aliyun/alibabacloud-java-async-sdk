// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitAIMediaAuditJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitAIMediaAuditJobRequest</p>
 */
public class SubmitAIMediaAuditJobRequest extends Request {
    @Query
    @NameInMap("MediaAuditConfiguration")
    private String mediaAuditConfiguration;

    @Query
    @NameInMap("MediaId")
    @Validation(required = true)
    private String mediaId;

    @Query
    @NameInMap("MediaType")
    private String mediaType;

    @Query
    @NameInMap("TemplateId")
    private String templateId;

    @Query
    @NameInMap("UserData")
    private String userData;

    private SubmitAIMediaAuditJobRequest(Builder builder) {
        super(builder);
        this.mediaAuditConfiguration = builder.mediaAuditConfiguration;
        this.mediaId = builder.mediaId;
        this.mediaType = builder.mediaType;
        this.templateId = builder.templateId;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAIMediaAuditJobRequest create() {
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
     * @return mediaType
     */
    public String getMediaType() {
        return this.mediaType;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitAIMediaAuditJobRequest, Builder> {
        private String mediaAuditConfiguration; 
        private String mediaId; 
        private String mediaType; 
        private String templateId; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitAIMediaAuditJobRequest request) {
            super(request);
            this.mediaAuditConfiguration = request.mediaAuditConfiguration;
            this.mediaId = request.mediaId;
            this.mediaType = request.mediaType;
            this.templateId = request.templateId;
            this.userData = request.userData;
        } 

        /**
         * The configuration information about the review job.
         * <p>
         * 
         * *   Other configuration items of the review job. Only the ResourceType field is supported. This field is used to specify the type of media files. You can adjust review standards and rules based on the type of media files.
         * *   If you want to modify the review standard and rules based on ResourceType, [submit a request on Yida](https://yida.alibaba-inc.com/o/ticketapply) to reach technical support.
         * *   The value of ResourceType can contain only letters, digits, and underscores (\_).
         */
        public Builder mediaAuditConfiguration(String mediaAuditConfiguration) {
            this.putQueryParameter("MediaAuditConfiguration", mediaAuditConfiguration);
            this.mediaAuditConfiguration = mediaAuditConfiguration;
            return this;
        }

        /**
         * The ID of the video file. To obtain the file ID, log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com) and choose **Review Management** > **Content Moderation** in the left-side navigation pane.
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * The type of the media file. Only **video** is supported.
         */
        public Builder mediaType(String mediaType) {
            this.putQueryParameter("MediaType", mediaType);
            this.mediaType = mediaType;
            return this;
        }

        /**
         * The ID of the AI template. You can use one of the following methods to obtain the ID of the AI template:
         * <p>
         * 
         * *   Obtain the ID of the AI template from the response to the [AddAITemplate](~~102930~~) operation. The value of TemplateId is the ID of the AI template.
         * *   Obtain the ID of the AI template from the response to the [ListAITemplate](~~102936~~) operation. The value of TemplateId is the ID of the AI template.
         * 
         * >  If you do not specify an ID, the ID of the default AI template is used.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * The custom settings. The value must be a JSON string. You can configure settings such as message callbacks. For more information, see [UserData](~~86952~~).
         * <p>
         * 
         * >  To use the callback configurations specified by this parameter, you must configure an HTTP callback URL and specify the types of the callback events in the ApsaraVideo VOD console. Otherwise, the callback configurations do not take effect. For more information about how to configure HTTP callback settings in the ApsaraVideo VOD console, see [Configure callback settings](~~86071~~).
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitAIMediaAuditJobRequest build() {
            return new SubmitAIMediaAuditJobRequest(this);
        } 

    } 

}
