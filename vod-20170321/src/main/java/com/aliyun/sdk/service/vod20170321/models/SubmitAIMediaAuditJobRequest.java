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
 * {@link SubmitAIMediaAuditJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitAIMediaAuditJobRequest</p>
 */
public class SubmitAIMediaAuditJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CensorProvider")
    private String censorProvider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaAuditConfiguration")
    private String mediaAuditConfiguration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mediaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaType")
    private String mediaType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceParameters")
    private String serviceParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoService")
    private String videoService;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VoiceService")
    private String voiceService;

    private SubmitAIMediaAuditJobRequest(Builder builder) {
        super(builder);
        this.censorProvider = builder.censorProvider;
        this.mediaAuditConfiguration = builder.mediaAuditConfiguration;
        this.mediaId = builder.mediaId;
        this.mediaType = builder.mediaType;
        this.serviceParameters = builder.serviceParameters;
        this.templateId = builder.templateId;
        this.userData = builder.userData;
        this.videoService = builder.videoService;
        this.voiceService = builder.voiceService;
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
     * @return censorProvider
     */
    public String getCensorProvider() {
        return this.censorProvider;
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

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return videoService
     */
    public String getVideoService() {
        return this.videoService;
    }

    /**
     * @return voiceService
     */
    public String getVoiceService() {
        return this.voiceService;
    }

    public static final class Builder extends Request.Builder<SubmitAIMediaAuditJobRequest, Builder> {
        private String censorProvider; 
        private String mediaAuditConfiguration; 
        private String mediaId; 
        private String mediaType; 
        private String serviceParameters; 
        private String templateId; 
        private String userData; 
        private String videoService; 
        private String voiceService; 

        private Builder() {
            super();
        } 

        private Builder(SubmitAIMediaAuditJobRequest request) {
            super(request);
            this.censorProvider = request.censorProvider;
            this.mediaAuditConfiguration = request.mediaAuditConfiguration;
            this.mediaId = request.mediaId;
            this.mediaType = request.mediaType;
            this.serviceParameters = request.serviceParameters;
            this.templateId = request.templateId;
            this.userData = request.userData;
            this.videoService = request.videoService;
            this.voiceService = request.voiceService;
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
         * <p>The configuration of the review job.</p>
         * <ul>
         * <li>For other configuration items of the review job, only the ResourceType field is currently supported. This field controls the media file type, and you can adjust the review standards and rules for the specified type.</li>
         * <li>To adjust the review standards and rules for a ResourceType, submit a ticket for technical support. For information about how to submit a ticket, refer to <a href="https://help.aliyun.com/document_detail/464625.html">Contact us</a>.</li>
         * <li>Usage notes for ResourceType: Only letters, digits, and underscores (_) are allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ResourceType&quot;:&quot;****_movie&quot;}</p>
         */
        public Builder mediaAuditConfiguration(String mediaAuditConfiguration) {
            this.putQueryParameter("MediaAuditConfiguration", mediaAuditConfiguration);
            this.mediaAuditConfiguration = mediaAuditConfiguration;
            return this;
        }

        /**
         * <p>The audio or video ID. Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Review Management</strong> &gt; <strong>Video Review</strong> to view the audio or video ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fe028d09441afffb138cd7ee****</p>
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * <p>The media type. Currently, only <strong>video</strong> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        public Builder mediaType(String mediaType) {
            this.putQueryParameter("MediaType", mediaType);
            this.mediaType = mediaType;
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
         * <li>When you call the <a href="https://help.aliyun.com/document_detail/102930.html">AddAITemplate</a> operation to add an AI template, the AI template ID is the value of the TemplateId response parameter.</li>
         * <li>After the AI template is added, call the <a href="https://help.aliyun.com/document_detail/102936.html">ListAITemplate</a> operation to query the AI template ID, which is the value of the TemplateId response parameter.</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify an AI template ID, the default AI template ID for automated review is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>a07a7f7d7d10eb9fd999e56ecc****</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The custom settings. The value is a JSON string that supports settings such as message callbacks. For more information, refer to <a href="https://help.aliyun.com/document_detail/86952.html">UserData</a>.</p>
         * <blockquote>
         * <p>To use message callbacks in this parameter, you must configure an HTTP callback URL and select the corresponding callback event types in the console. Otherwise, the callback settings do not take effect. For information about how to configure HTTP callbacks in the console, refer to <a href="https://help.aliyun.com/document_detail/86071.html">Callback settings</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="http://test.test.com%22%7D,%22Extend%22:%7B%22localId%22:%22xxx%22,%22test%22:%22www%22%7D%7D">http://test.test.com&quot;},&quot;Extend&quot;:{&quot;localId&quot;:&quot;xxx&quot;,&quot;test&quot;:&quot;www&quot;}}</a></p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * VideoService.
         */
        public Builder videoService(String videoService) {
            this.putQueryParameter("VideoService", videoService);
            this.videoService = videoService;
            return this;
        }

        /**
         * VoiceService.
         */
        public Builder voiceService(String voiceService) {
            this.putQueryParameter("VoiceService", voiceService);
            this.voiceService = voiceService;
            return this;
        }

        @Override
        public SubmitAIMediaAuditJobRequest build() {
            return new SubmitAIMediaAuditJobRequest(this);
        } 

    } 

}
