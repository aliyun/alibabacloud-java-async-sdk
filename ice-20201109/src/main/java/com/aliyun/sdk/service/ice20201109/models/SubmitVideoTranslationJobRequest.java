// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitVideoTranslationJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitVideoTranslationJobRequest</p>
 */
public class SubmitVideoTranslationJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EditingConfig")
    private String editingConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputConfig")
    private String inputConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputConfig")
    private String outputConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitVideoTranslationJobRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.editingConfig = builder.editingConfig;
        this.inputConfig = builder.inputConfig;
        this.outputConfig = builder.outputConfig;
        this.title = builder.title;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitVideoTranslationJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return editingConfig
     */
    public String getEditingConfig() {
        return this.editingConfig;
    }

    /**
     * @return inputConfig
     */
    public String getInputConfig() {
        return this.inputConfig;
    }

    /**
     * @return outputConfig
     */
    public String getOutputConfig() {
        return this.outputConfig;
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

    public static final class Builder extends Request.Builder<SubmitVideoTranslationJobRequest, Builder> {
        private String clientToken; 
        private String description; 
        private String editingConfig; 
        private String inputConfig; 
        private String outputConfig; 
        private String title; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitVideoTranslationJobRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.editingConfig = request.editingConfig;
            this.inputConfig = request.inputConfig;
            this.outputConfig = request.outputConfig;
            this.title = request.title;
            this.userData = request.userData;
        } 

        /**
         * <ul>
         * <li>The client token.</li>
         * </ul>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <ul>
         * <li>The job description.</li>
         * </ul>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <ul>
         * <li>The configuration parameters of the video translation job.</li>
         * <li>The value must be in the JSON format.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;SourceLanguage&quot;:&quot;zh&quot;,&quot;TargetLanguage&quot;:&quot;en&quot;,&quot;DetextArea&quot;:&quot;Auto&quot;}</p>
         */
        public Builder editingConfig(String editingConfig) {
            this.putQueryParameter("EditingConfig", editingConfig);
            this.editingConfig = editingConfig;
            return this;
        }

        /**
         * <ul>
         * <li>The input parameters of the video translation job.</li>
         * <li>A video translation job takes a video or subtitle file as the input.</li>
         * <li>The value must be in the JSON format.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Type&quot;:&quot;Video&quot;,&quot;Media&quot;:&quot;<a href="https://your-bucket.oss-cn-shanghai.aliyuncs.com/xxx.mp4%22%7D">https://your-bucket.oss-cn-shanghai.aliyuncs.com/xxx.mp4&quot;}</a></p>
         */
        public Builder inputConfig(String inputConfig) {
            this.putQueryParameter("InputConfig", inputConfig);
            this.inputConfig = inputConfig;
            return this;
        }

        /**
         * <ul>
         * <li>The output parameters of the video translation job.</li>
         * <li>A video translation job can generate a video or subtitle file as the output.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;MediaURL&quot;: &quot;<a href="https://your-bucket.oss-cn-shanghai.aliyuncs.com/your-object.mp4%22%7D">https://your-bucket.oss-cn-shanghai.aliyuncs.com/your-object.mp4&quot;}</a></p>
         */
        public Builder outputConfig(String outputConfig) {
            this.putQueryParameter("OutputConfig", outputConfig);
            this.outputConfig = outputConfig;
            return this;
        }

        /**
         * <ul>
         * <li>The job title.</li>
         * </ul>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * <ul>
         * <li>The user data.</li>
         * </ul>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitVideoTranslationJobRequest build() {
            return new SubmitVideoTranslationJobRequest(this);
        } 

    } 

}
