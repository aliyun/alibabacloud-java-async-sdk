// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link SubmitSmarttagJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitSmarttagJobRequest</p>
 */
public class SubmitSmarttagJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentAddr")
    private String contentAddr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentType")
    private String contentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Input")
    private Input input;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotifyUrl")
    private String notifyUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Params")
    private String params;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleConfig")
    private ScheduleConfig scheduleConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateConfig")
    private String templateConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitSmarttagJobRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.contentAddr = builder.contentAddr;
        this.contentType = builder.contentType;
        this.input = builder.input;
        this.notifyUrl = builder.notifyUrl;
        this.params = builder.params;
        this.scheduleConfig = builder.scheduleConfig;
        this.templateConfig = builder.templateConfig;
        this.templateId = builder.templateId;
        this.title = builder.title;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSmarttagJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return contentAddr
     */
    public String getContentAddr() {
        return this.contentAddr;
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return input
     */
    public Input getInput() {
        return this.input;
    }

    /**
     * @return notifyUrl
     */
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return scheduleConfig
     */
    public ScheduleConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    /**
     * @return templateConfig
     */
    public String getTemplateConfig() {
        return this.templateConfig;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitSmarttagJobRequest, Builder> {
        private String content; 
        private String contentAddr; 
        private String contentType; 
        private Input input; 
        private String notifyUrl; 
        private String params; 
        private ScheduleConfig scheduleConfig; 
        private String templateConfig; 
        private String templateId; 
        private String title; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitSmarttagJobRequest request) {
            super(request);
            this.content = request.content;
            this.contentAddr = request.contentAddr;
            this.contentType = request.contentType;
            this.input = request.input;
            this.notifyUrl = request.notifyUrl;
            this.params = request.params;
            this.scheduleConfig = request.scheduleConfig;
            this.templateConfig = request.templateConfig;
            this.templateId = request.templateId;
            this.title = request.title;
            this.userData = request.userData;
        } 

        /**
         * <p>The description of the video content. It supports Chinese characters, English letters, digits, and hyphens (-). It cannot start with a special character and can be up to 1 KB in length.</p>
         * 
         * <strong>example:</strong>
         * <p>example content ****</p>
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>This parameter is deprecated</p>
         */
        public Builder contentAddr(String contentAddr) {
            this.putQueryParameter("ContentAddr", contentAddr);
            this.contentAddr = contentAddr;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>This parameter is deprecated</p>
         */
        public Builder contentType(String contentType) {
            this.putQueryParameter("ContentType", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>input</p>
         */
        public Builder input(Input input) {
            String inputShrink = shrink(input, "Input", "json");
            this.putQueryParameter("Input", inputShrink);
            this.input = input;
            return this;
        }

        /**
         * <p>The callback URL. Only HTTP and HTTPS are supported.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/endpoint/aliyun/ai?id=76401125000">https://example.com/endpoint/aliyun/ai?id=76401125000</a>***</p>
         */
        public Builder notifyUrl(String notifyUrl) {
            this.putQueryParameter("NotifyUrl", notifyUrl);
            this.notifyUrl = notifyUrl;
            return this;
        }

        /**
         * <p>The additional request parameters, represented as a JSON string. Example: {&quot;needAsrData&quot;:true, &quot;needOcrData&quot;:false}. Field descriptions:</p>
         * <ul>
         * <li><p>needAsrData: a Boolean value that specifies whether to include the original ASR results in the analysis results. Default value: false. Set the value to true to include the original ASR results.</p>
         * </li>
         * <li><p>needOcrData: a Boolean value that specifies whether to include the original OCR results in the analysis results. Default value: false. Set the value to true to include the original OCR results.</p>
         * </li>
         * <li><p>needMetaData: a Boolean value that specifies whether to include metadata in the analysis results. Default value: false. Set the value to true to include metadata.</p>
         * </li>
         * <li><p>nlpParams: a JSON object that specifies the input parameters for the NLP operator. Default value: empty (the NLP operator is not used). For more information, see the supplementary description of request parameters below.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;needAsrData&quot;:true, &quot;needOcrData&quot;:false, &quot;nlpParams&quot;:{&quot;sourceLanguage&quot;:&quot;cn&quot;}}</p>
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * <p>scheduleConfig</p>
         */
        public Builder scheduleConfig(ScheduleConfig scheduleConfig) {
            String scheduleConfigShrink = shrink(scheduleConfig, "ScheduleConfig", "json");
            this.putQueryParameter("ScheduleConfig", scheduleConfigShrink);
            this.scheduleConfig = scheduleConfig;
            return this;
        }

        /**
         * <p>The template parameters that are dynamically passed when the job is started. These parameters are used to temporarily override or supplement the configured parameters in the template specified by TemplateId. The server merges these parameters with the original template parameters by field to generate the final template configuration for the current job, and validates the configuration before execution.</p>
         * <ul>
         * <li>Merge rules:</li>
         * </ul>
         * <ol>
         * <li>If a field already exists in the template, the value provided by the caller overrides the template value (caller takes precedence).</li>
         * <li>If a field does not exist in the template, it is appended as a new field.</li>
         * </ol>
         * <ul>
         * <li>Supported dynamic fields:</li>
         * </ul>
         * <ol>
         * <li>FaceCategoryIds: the list of face library IDs that participate in recognition (separated by commas, which can include system library IDs and custom library IDs).</li>
         * </ol>
         * <ul>
         * <li>Precautions:
         * This configuration affects only the execution of the current job and does not modify the template itself.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;FaceCategoryIds&quot;:&quot;custom_face_lib1&quot;}</p>
         */
        public Builder templateConfig(String templateConfig) {
            this.putQueryParameter("TemplateConfig", templateConfig);
            this.templateConfig = templateConfig;
            return this;
        }

        /**
         * <p>The ID of the template that is used to specify the analysis algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>39f8e0bc005e4f309379701645f4</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The video title. It supports Chinese characters, English letters, digits, and hyphens (-). It cannot start with a special character and can be up to 256 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>example-title-****</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>The custom data that is returned in an MNS callback. It can be up to 1 KB in length. For more information about how to configure an MNS callback queue, see the relevant documentation.</p>
         * 
         * <strong>example:</strong>
         * <p>{“a”:&quot;test&quot;}</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitSmarttagJobRequest build() {
            return new SubmitSmarttagJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitSmarttagJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitSmarttagJobRequest</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        private String media;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Input(Builder builder) {
            this.media = builder.media;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return media
         */
        public String getMedia() {
            return this.media;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String media; 
            private String type; 

            private Builder() {
            } 

            private Builder(Input model) {
                this.media = model.media;
                this.type = model.type;
            } 

            /**
             * <ul>
             * <li><p>If the Type parameter is set to OSS, specify the OSS address. Example: OSS://test-bucket/video/202208/test.mp4.</p>
             * </li>
             * <li><p>If the Type parameter is set to Media, specify the media ID. Example: c5c62d8f0361337cab312dce8e77dc6d.</p>
             * </li>
             * <li><p>If the Type parameter is set to URL, specify the HTTP URL. Example: <a href="https://zc-test.oss-cn-shanghai.aliyuncs.com/test/unknowFace.mp4">https://zc-test.oss-cn-shanghai.aliyuncs.com/test/unknowFace.mp4</a>.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>c5c62d8f0361337cab312dce8e77dc6d</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>The media type. Valid values:</p>
             * <ul>
             * <li><p>OSS</p>
             * </li>
             * <li><p>Media</p>
             * </li>
             * <li><p>URL</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Media</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitSmarttagJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitSmarttagJobRequest</p>
     */
    public static class ScheduleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PipelineId")
        private String pipelineId;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private String priority;

        private ScheduleConfig(Builder builder) {
            this.pipelineId = builder.pipelineId;
            this.priority = builder.priority;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduleConfig create() {
            return builder().build();
        }

        /**
         * @return pipelineId
         */
        public String getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        public static final class Builder {
            private String pipelineId; 
            private String priority; 

            private Builder() {
            } 

            private Builder(ScheduleConfig model) {
                this.pipelineId = model.pipelineId;
                this.priority = model.priority;
            } 

            /**
             * <p>The ID of the pipeline, which is used to distinguish business scenarios and bind message notifications.</p>
             * <p>If this parameter is not configured, the default pipeline is used. The default concurrency of the default pipeline is 2. To increase the concurrency, submit a ticket.</p>
             * 
             * <strong>example:</strong>
             * <p>acdbfe4323bcfdae</p>
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * <p>The priority. This parameter is not implemented. You can leave it empty or specify an arbitrary value.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            public ScheduleConfig build() {
                return new ScheduleConfig(this);
            } 

        } 

    }
}
