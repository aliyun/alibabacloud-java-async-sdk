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
         * The configuration information about the review task.
         * <p>
         * 
         * *   Other configuration items of the review task. Only the ResourceType field is supported. This field is used to specify the type of media files. You can adjust review standards and rules based on the type of media files.
         * *   If you want to adjust review standards and rules based on ResourceType, submit a ticket to request technical support.
         * *   The value of ResourceType can contain only letters, digits, and underscores (\_).
         */
        public Builder mediaAuditConfiguration(String mediaAuditConfiguration) {
            this.putQueryParameter("MediaAuditConfiguration", mediaAuditConfiguration);
            this.mediaAuditConfiguration = mediaAuditConfiguration;
            return this;
        }

        /**
         * The ID of the media file.
         * <p>
         * 
         * You can obtain the ID of the media file on the Content Moderation page in the ApsaraVideo VOD console.
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
         * The ID of the AI template. If you do not specify this parameter, the ID of the default AI template for automated review is used.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * The custom settings. The value is a JSON string. You can configure settings such as message callbacks. For more information, see [Request parameters](~~86952~~).
         * <p>
         * 
         * >  The callback configurations take effect only if you specify the HTTP callback URL and select the specific callback events in the ApsaraVideo VOD console.
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
