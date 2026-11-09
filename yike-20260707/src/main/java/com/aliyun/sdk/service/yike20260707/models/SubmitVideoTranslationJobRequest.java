// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link SubmitVideoTranslationJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitVideoTranslationJobRequest</p>
 */
public class SubmitVideoTranslationJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Input")
    @com.aliyun.core.annotation.Validation(required = true)
    private String input;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobParameters")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobParameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Output")
    private String output;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitVideoTranslationJobRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.input = builder.input;
        this.jobParameters = builder.jobParameters;
        this.jobType = builder.jobType;
        this.output = builder.output;
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
     * @return input
     */
    public String getInput() {
        return this.input;
    }

    /**
     * @return jobParameters
     */
    public String getJobParameters() {
        return this.jobParameters;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return output
     */
    public String getOutput() {
        return this.output;
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
        private String input; 
        private String jobParameters; 
        private String jobType; 
        private String output; 
        private String title; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitVideoTranslationJobRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.input = request.input;
            this.jobParameters = request.jobParameters;
            this.jobType = request.jobType;
            this.output = request.output;
            this.title = request.title;
            this.userData = request.userData;
        } 

        /**
         * <p>The user-level idempotency token, which can be up to 40 characters in length. If the same user submits the request repeatedly with the same token, the original task is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>vt-client-20260820-001</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The job description, which is used to record the business purpose or processing requirements.</p>
         * 
         * <strong>example:</strong>
         * <p>Translate the Chinese product introduction video into English</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The input configuration JSON string. You must specify either Video or VideoMediaId, but not both. You can specify at most one of Audio and AudioMediaId. Subtitle is optional.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;VideoMediaId&quot;:&quot;media-video-001&quot;}</p>
         */
        public Builder input(String input) {
            this.putBodyParameter("Input", input);
            this.input = input;
            return this;
        }

        /**
         * <p>The job parameters JSON string. It must include at least SourceLanguage and TargetLanguage. You can also configure primary subtitle erasure, voice translation, on-screen text translation, and final editing.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;SourceLanguage&quot;:&quot;zh&quot;,&quot;TargetLanguage&quot;:&quot;en&quot;,&quot;NeedDetext&quot;:false,&quot;NeedVisualTranslate&quot;:false}</p>
         */
        public Builder jobParameters(String jobParameters) {
            this.putBodyParameter("JobParameters", jobParameters);
            this.jobParameters = jobParameters;
            return this;
        }

        /**
         * <p>The job type. SubtitleTranslate indicates subtitle translation, and VoiceTranslate indicates voice translation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VoiceTranslate</p>
         */
        public Builder jobType(String jobType) {
            this.putBodyParameter("JobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * <p>The output configuration JSON string. OssUri is the optional customer OSS output directory. If OssUri is not specified, a signed URL for the service-owned output is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;OssUri&quot;:&quot;oss://example-bucket/video-translation/output/&quot;}</p>
         */
        public Builder output(String output) {
            this.putBodyParameter("Output", output);
            this.output = output;
            return this;
        }

        /**
         * <p>The job title. If not specified, the service generates a default title.</p>
         * 
         * <strong>example:</strong>
         * <p>English translation of product introduction video</p>
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>The user-defined data JSON string. When specifying an MNS queue to receive asynchronous notifications, set <code>NotifyAddress</code> to the pure queue name starting with <code>yike-callback-</code> instead of the full queue URL. You can optionally set <code>NotifyMnsEndpoint</code> to the MNS endpoint of the task account.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NotifyAddress&quot;:&quot;yike-callback-test&quot;,&quot;NotifyMnsEndpoint&quot;:&quot;<a href="https://1234567890123456.mns.cn-shanghai.aliyuncs.com%22%7D">https://1234567890123456.mns.cn-shanghai.aliyuncs.com&quot;}</a></p>
         */
        public Builder userData(String userData) {
            this.putBodyParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitVideoTranslationJobRequest build() {
            return new SubmitVideoTranslationJobRequest(this);
        } 

    } 

}
