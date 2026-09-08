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
 * {@link SubmitVideoDetextJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitVideoDetextJobRequest</p>
 */
public class SubmitVideoDetextJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Input")
    @com.aliyun.core.annotation.Validation(required = true)
    private String input;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobParameters")
    private String jobParameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Output")
    private String output;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitVideoDetextJobRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.input = builder.input;
        this.jobParameters = builder.jobParameters;
        this.output = builder.output;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitVideoDetextJobRequest create() {
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
     * @return output
     */
    public String getOutput() {
        return this.output;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitVideoDetextJobRequest, Builder> {
        private String clientToken; 
        private String input; 
        private String jobParameters; 
        private String output; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitVideoDetextJobRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.input = request.input;
            this.jobParameters = request.jobParameters;
            this.output = request.output;
            this.userData = request.userData;
        } 

        /**
         * <p>The user-level idempotency token. Maximum length: 40 characters. If the same user submits a request with the same token, the original task is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>detext-client-20260820-001</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The input configuration JSON string. You must specify either VideoUrl or VideoMediaId, but not both.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;VideoUrl&quot;:&quot;<a href="https://example.com/input.mp4%22%7D">https://example.com/input.mp4&quot;}</a></p>
         */
        public Builder input(String input) {
            this.putBodyParameter("Input", input);
            this.input = input;
            return this;
        }

        /**
         * <p>The text erasure parameter JSON string. This string can contain EraseAllText, TimeRanges, TextTargets, FullEraseTargets, and Config.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;EraseAllText&quot;:false,&quot;TextTargets&quot;:[{&quot;Box&quot;:[0.1,0.8,0.8,0.15],&quot;TimeRanges&quot;:[[0,30]]}]}</p>
         */
        public Builder jobParameters(String jobParameters) {
            this.putBodyParameter("JobParameters", jobParameters);
            this.jobParameters = jobParameters;
            return this;
        }

        /**
         * <p>The output configuration JSON string. OssUri specifies an OSS directory or MP4 file path and cannot contain query parameters or fragments. For directory paths, detext.mp4 is automatically appended. Paths ending with .mp4 without a trailing / are used directly as the target file. If not specified, a signed URL of the processing result is returned in the query result.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;OssUri&quot;:&quot;oss://example-bucket/video-detext/job-001/&quot;}</p>
         */
        public Builder output(String output) {
            this.putBodyParameter("Output", output);
            this.output = output;
            return this;
        }

        /**
         * <p>The custom data JSON string for pass-through in desired state notifications. For MNS callbacks, use NotifyAddress to specify a queue name prefixed with yike-callback, and use NotifyMnsEndpoint to specify an MNS endpoint under the same account. For HTTP(S) callbacks, use NotifyAddress to specify the full URL.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NotifyAddress&quot;:&quot;yike-callback-example&quot;,&quot;NotifyMnsEndpoint&quot;:&quot;http://<AccountId>.mns.cn-shanghai.aliyuncs.com/&quot;}</p>
         */
        public Builder userData(String userData) {
            this.putBodyParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitVideoDetextJobRequest build() {
            return new SubmitVideoDetextJobRequest(this);
        } 

    } 

}
