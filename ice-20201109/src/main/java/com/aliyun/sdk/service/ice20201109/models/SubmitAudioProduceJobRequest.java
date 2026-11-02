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
 * {@link SubmitAudioProduceJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitAudioProduceJobRequest</p>
 */
public class SubmitAudioProduceJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EditingConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String editingConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outputConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Overwrite")
    private Boolean overwrite;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitAudioProduceJobRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.editingConfig = builder.editingConfig;
        this.inputConfig = builder.inputConfig;
        this.outputConfig = builder.outputConfig;
        this.overwrite = builder.overwrite;
        this.title = builder.title;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAudioProduceJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return overwrite
     */
    public Boolean getOverwrite() {
        return this.overwrite;
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

    public static final class Builder extends Request.Builder<SubmitAudioProduceJobRequest, Builder> {
        private String description; 
        private String editingConfig; 
        private String inputConfig; 
        private String outputConfig; 
        private Boolean overwrite; 
        private String title; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitAudioProduceJobRequest request) {
            super(request);
            this.description = request.description;
            this.editingConfig = request.editingConfig;
            this.inputConfig = request.inputConfig;
            this.outputConfig = request.outputConfig;
            this.overwrite = request.overwrite;
            this.title = request.title;
            this.userData = request.userData;
        } 

        /**
         * <p>The task description:</p>
         * <ul>
         * <li>The length cannot exceed 1,024 bytes.</li>
         * <li>UTF-8 encoding.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>taskDescription</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The audio production configuration:</p>
         * <ul>
         * <li>voice: The <a href="https://help.aliyun.com/document_detail/449563.html">voice type</a>.</li>
         * <li>customizedVoice: The VoiceId for voice cloning.</li>
         * <li>format: The output file format. Valid values: PCM, WAV, and MP3.</li>
         * <li>volume: The volume. Valid values: 0 to 100. Default value: 50.</li>
         * <li>speech_rate: The speech rate. Valid values: -500 to 500. Default value: 0.<ul>
         * <li>[-500, 0, 500] corresponds to the speech rate multiplier range of [0.5, 1.0, 2.0].</li>
         * <li>The calculation method is as follows:<ul>
         * <li>0.8x speed: (1 - 1/0.8) / 0.002 = -125</li>
         * <li>1.2x speed: (1 - 1/1.2) / 0.001 = 166</li>
         * <li>For speeds less than 1x, the 0.002 coefficient is used.</li>
         * <li>For speeds greater than 1x, the 0.001 coefficient is used.</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * <li>pitch_rate: The pitch. Valid values: -500 to 500. Default value: 0.
         * <notice>If both voice and customizedVoice are specified, customizedVoice takes precedence.</notice></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;voice&quot;:&quot;Siqi&quot;,&quot;format&quot;:&quot;MP3&quot;,&quot;volume&quot;:50}</p>
         */
        public Builder editingConfig(String editingConfig) {
            this.putQueryParameter("EditingConfig", editingConfig);
            this.editingConfig = editingConfig;
            return this;
        }

        /**
         * <p>The text content. A maximum of 10,000 Chinese characters are supported. <a href="https://help.aliyun.com/document_detail/2672807.html">Speech Synthesis Markup Language (SSML)</a> is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder inputConfig(String inputConfig) {
            this.putQueryParameter("InputConfig", inputConfig);
            this.inputConfig = inputConfig;
            return this;
        }

        /**
         * <p>The audio output configuration. For example, to store the output speech at <a href="http://my_bucket.oss-cn-shanghai.aliyuncs.com/target_audio.mp3">http://my_bucket.oss-cn-shanghai.aliyuncs.com/target_audio.mp3</a>, the parameter settings are as follows:
         * {
         *       &quot;bucket&quot;: &quot;my_bucket&quot;,
         *       &quot;object&quot;: &quot;target_audio&quot;
         * }</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;bucket&quot;: &quot;my_bucket&quot;,
         *       &quot;object&quot;: &quot;target_audio&quot;
         * }</p>
         */
        public Builder outputConfig(String outputConfig) {
            this.putQueryParameter("OutputConfig", outputConfig);
            this.outputConfig = outputConfig;
            return this;
        }

        /**
         * <p>Specifies whether to overwrite existing OSS files.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder overwrite(Boolean overwrite) {
            this.putQueryParameter("Overwrite", overwrite);
            this.overwrite = overwrite;
            return this;
        }

        /**
         * <p>The task title. If not provided, a default title is automatically generated based on the date.</p>
         * <ul>
         * <li>The length cannot exceed 128 bytes.</li>
         * <li>UTF-8 encoding.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>taskTitle</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>The custom settings in JSON format. The maximum length is 512 bytes. <a href="https://help.aliyun.com/document_detail/451631.html">Custom callback URL configuration</a> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NotifyAddress&quot;:&quot;<a href="http://xx.xx.xxx%22%7D">http://xx.xx.xxx&quot;}</a></p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitAudioProduceJobRequest build() {
            return new SubmitAudioProduceJobRequest(this);
        } 

    } 

}
