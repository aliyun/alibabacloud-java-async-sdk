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
         * <p>The job description.</p>
         * <ul>
         * <li>The job description can be up to 1,024 bytes in length.</li>
         * <li>The value must be encoded in UTF-8.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>任务描述  长度不超过1024字节  UTF8编码</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The audio editing configurations.</p>
         * <ul>
         * <li>voice: the <a href="https://help.aliyun.com/document_detail/449563.html">voice type</a>.</li>
         * <li>customizedVoice: the ID of the personalized human voice.</li>
         * <li>format: the format of the output file. Valid values: PCM, WAV, and MP3.</li>
         * <li>volume: the volume. Default value: 50. Valid values: 0 to 100.</li>
         * <li>speech_rate: the speech tempo. Default value: 0. Value range: -500 to 500.</li>
         * <li>pitch_rate: the intonation. Default value: 0. Value range: -500 to 500.</li>
         * </ul>
         * <blockquote>
         * <p> If you specify both voice and customizedVoice, customizedVoice takes precedence over voice.</p>
         * </blockquote>
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
         * <p>The text content. A maximum of 2,000 characters are supported. The <a href="https://help.aliyun.com/document_detail/2672807.html">Speech Synthesis Markup Language (SSML)</a> is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>测试文本</p>
         */
        public Builder inputConfig(String inputConfig) {
            this.putQueryParameter("InputConfig", inputConfig);
            this.inputConfig = inputConfig;
            return this;
        }

        /**
         * <p>The output audio configurations.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;bucket&quot;:&quot;bucket&quot;,&quot;object&quot;:&quot;objeck&quot;}</p>
         */
        public Builder outputConfig(String outputConfig) {
            this.putQueryParameter("OutputConfig", outputConfig);
            this.outputConfig = outputConfig;
            return this;
        }

        /**
         * <p>Specifies whether to overwrite the existing Object Storage Service (OSS) object.</p>
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
         * <p>The job title. If you do not specify this parameter, the system generates a title based on the current date.</p>
         * <ul>
         * <li>The job title can be up to 128 bytes in length.</li>
         * <li>The value must be encoded in UTF-8.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>任务标题。若不提供，根据日期自动生成默认title  长度不超过128字节  UTF8编码</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>The user-defined data in the JSON format, which can be up to 512 bytes in length. You can specify a custom callback URL. For more information, see <a href="https://help.aliyun.com/document_detail/451631.html">Configure a callback upon editing completion</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;user&quot;:&quot;data&quot;}</p>
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
