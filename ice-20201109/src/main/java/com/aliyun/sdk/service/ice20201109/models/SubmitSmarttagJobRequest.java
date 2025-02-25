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
            this.templateId = request.templateId;
            this.title = request.title;
            this.userData = request.userData;
        } 

        /**
         * <p>The video description. The description can contain letters, digits, and hyphens (-) and cannot start with a special character. The description can be up to 1 KB in length.</p>
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
         * <p>This parameter is discontinued.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://123.com/testVideo.mp4">http://123.com/testVideo.mp4</a></p>
         */
        public Builder contentAddr(String contentAddr) {
            this.putQueryParameter("ContentAddr", contentAddr);
            this.contentAddr = contentAddr;
            return this;
        }

        /**
         * <p>This parameter is discontinued.</p>
         * 
         * <strong>example:</strong>
         * <p>application/zip</p>
         */
        public Builder contentType(String contentType) {
            this.putQueryParameter("ContentType", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>The job input.</p>
         */
        public Builder input(Input input) {
            String inputShrink = shrink(input, "Input", "json");
            this.putQueryParameter("Input", inputShrink);
            this.input = input;
            return this;
        }

        /**
         * <p>The URL for receiving callbacks. Set the value to an HTTP URL or an HTTPS URL.</p>
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
         * <p>The additional request parameters. The value is a JSON string. Example: {&quot;needAsrData&quot;:true, &quot;needOcrData&quot;:false}. The following parameters are supported:</p>
         * <ul>
         * <li>needAsrData: specifies whether to query the automatic speech recognition (ASR) data. The value is of the BOOLEAN type. Default value: false. Valid values: true and false.</li>
         * <li>needOcrData: specifies whether to query the optical character recognition (OCR) data. The value is of the BOOLEAN type. Default value: false. Valid values: true and false.</li>
         * <li>needMetaData: specifies whether to query the metadata. The value is of the BOOLEAN type. Default value: false. Valid values: true and false.</li>
         * <li>nlpParams: the input parameters of the natural language processing (NLP) operator. The value is a JSON object. This parameter is empty by default, which indicates that the NLP operator is not used. For more information, see the &quot;nlpParams&quot; section of this topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;needAsrData&quot;:true, &quot;needOcrData&quot;:false}</p>
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * <p>The scheduling configurations.</p>
         */
        public Builder scheduleConfig(ScheduleConfig scheduleConfig) {
            String scheduleConfigShrink = shrink(scheduleConfig, "ScheduleConfig", "json");
            this.putQueryParameter("ScheduleConfig", scheduleConfigShrink);
            this.scheduleConfig = scheduleConfig;
            return this;
        }

        /**
         * <p>The ID of the template that specifies the analysis algorithms. For more information about template operations, see <a href="https://help.aliyun.com/document_detail/445702.html">Configure templates</a>.</p>
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
         * <p>The video title. The title can contain letters, digits, and hyphens (-) and cannot start with a special character. The title can be up to 256 bytes in length.</p>
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
         * <p>The data to be passed through Simple Message Queue (SMQ, formerly MNS) during callbacks. The data can be up to 1 KB in length. For more information about how to specify an SMQ queue for receiving callbacks, see UpdatePipeline.</p>
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

            /**
             * <p>If Type is set to OSS, specify an OSS path. Example: OSS://test-bucket/video/202208/test.mp4.</p>
             * <p>If Type is set to Media, specify a media asset ID. Example: c5c62d8f0361337cab312dce8e77dc6d.</p>
             * <p>If Type is set to URL, specify an HTTP URL. Example: <a href="https://zc-test.oss-cn-shanghai.aliyuncs.com/test/unknowFace.mp4">https://zc-test.oss-cn-shanghai.aliyuncs.com/test/unknowFace.mp4</a>.</p>
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
             * <li>OSS</li>
             * <li>Media</li>
             * <li>URL</li>
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

            /**
             * <p>The ID of the ApsaraVideo Media Processing (MPS) queue to which you want to submit the smart tagging job. The MPS queue is bound to an SMQ queue. This parameter specifies the default MPS queue. By default, an MPS queue can process a maximum of two concurrent smart tagging jobs. To increase the limit, submit a ticket.</p>
             * 
             * <strong>example:</strong>
             * <p>acdbfe4323bcfdae</p>
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * <p>The job priority. This parameter is not implemented. You can leave this parameter empty or enter a random value.</p>
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
