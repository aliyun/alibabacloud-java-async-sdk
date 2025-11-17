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
 * {@link SubmitVideoCognitionJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitVideoCognitionJobRequest</p>
 */
public class SubmitVideoCognitionJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Input")
    private Input input;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Params")
    private String params;

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

    private SubmitVideoCognitionJobRequest(Builder builder) {
        super(builder);
        this.input = builder.input;
        this.params = builder.params;
        this.templateConfig = builder.templateConfig;
        this.templateId = builder.templateId;
        this.title = builder.title;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitVideoCognitionJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return input
     */
    public Input getInput() {
        return this.input;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
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

    public static final class Builder extends Request.Builder<SubmitVideoCognitionJobRequest, Builder> {
        private Input input; 
        private String params; 
        private String templateConfig; 
        private String templateId; 
        private String title; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitVideoCognitionJobRequest request) {
            super(request);
            this.input = request.input;
            this.params = request.params;
            this.templateConfig = request.templateConfig;
            this.templateId = request.templateId;
            this.title = request.title;
            this.userData = request.userData;
        } 

        /**
         * <p>The media input object.</p>
         */
        public Builder input(Input input) {
            String inputShrink = shrink(input, "Input", "json");
            this.putQueryParameter("Input", inputShrink);
            this.input = input;
            return this;
        }

        /**
         * <p>Additional request parameters, provided as a JSON string. This is used to pass specific settings for various AI analysis modules, such as Natural Language Processing (NLP), shot segmentation, tagging, and action recognition.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;nlpParams&quot;: {
         *         &quot;sourceLanguage&quot;: &quot;cn&quot;,
         *         &quot;diarizationEnabled&quot;: true,
         *         &quot;speakerCount&quot;: 2,
         *         &quot;summarizationEnabled&quot;: true,
         *         &quot;summarizationTypes&quot;: &quot;Paragraph,Conversational,QuestionsAnswering,MindMap&quot;,
         *         &quot;translationEnabled&quot;: true,
         *         &quot;targetLanguages&quot;: &quot;en&quot;,
         *         &quot;autoChaptersEnabled&quot;: true,
         *         &quot;meetingAssistanceEnabled&quot;: true
         *     }
         * }</p>
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * TemplateConfig.
         */
        public Builder templateConfig(String templateConfig) {
            this.putQueryParameter("TemplateConfig", templateConfig);
            this.templateConfig = templateConfig;
            return this;
        }

        /**
         * <p>The ID of the template that specifies the analysis algorithms to be used. For details, see <a href="https://help.aliyun.com/zh/ims/developer-reference/api-ice-2020-11-09-createcustomtemplate?spm=a2c4g.11186623.help-menu-193643.d_5_0_3_3_0_0.17b66afamjKySv">CreateCustomTemplate</a> and <a href="https://help.aliyun.com/zh/ims/user-guide/smart-tagging-template?spm=a2c4g.11186623.0.i15">smart tagging template</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>39f8e0bc00***************</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The video title. It supports letters, digits, and hyphens (-), and cannot start with a special character. Max length: 256 bytes.</p>
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
         * <p>The user-defined data that is passed through and returned as-is in the response. Max length: 1,024 bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;test&quot;:1}</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitVideoCognitionJobRequest build() {
            return new SubmitVideoCognitionJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitVideoCognitionJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitVideoCognitionJobRequest</p>
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
             * <p>If Type is set to OSS, specify an OSS path. Example: OSS://test-bucket/video/202208/test.mp4.</p>
             * <p>If Type is set to Media, specify a media asset ID. Example: c5c62d8f0361337cab312dce8e77dc6d.</p>
             * <p>If Type is set to URL, specify an HTTP URL. Example: <a href="https://zc-test.oss-cn-shanghai.aliyuncs.com/test/unknowFace.mp4">https://zc-test.oss-cn-shanghai.aliyuncs.com/test/unknowFace.mp4</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>c5c62d8f03613************c6d</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>The type of media input. Valid values:</p>
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
}
