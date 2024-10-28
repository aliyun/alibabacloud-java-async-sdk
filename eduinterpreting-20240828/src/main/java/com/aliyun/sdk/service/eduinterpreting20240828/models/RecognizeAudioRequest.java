// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eduinterpreting20240828.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RecognizeAudioRequest} extends {@link RequestModel}
 *
 * <p>RecognizeAudioRequest</p>
 */
public class RecognizeAudioRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AudioFileUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String audioFileUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CallbackUrl")
    private String callbackUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableCallBack")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enableCallBack;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OuterBizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outerBizId;

    private RecognizeAudioRequest(Builder builder) {
        super(builder);
        this.audioFileUrl = builder.audioFileUrl;
        this.callbackUrl = builder.callbackUrl;
        this.enableCallBack = builder.enableCallBack;
        this.outerBizId = builder.outerBizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeAudioRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audioFileUrl
     */
    public String getAudioFileUrl() {
        return this.audioFileUrl;
    }

    /**
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    /**
     * @return enableCallBack
     */
    public Boolean getEnableCallBack() {
        return this.enableCallBack;
    }

    /**
     * @return outerBizId
     */
    public String getOuterBizId() {
        return this.outerBizId;
    }

    public static final class Builder extends Request.Builder<RecognizeAudioRequest, Builder> {
        private String audioFileUrl; 
        private String callbackUrl; 
        private Boolean enableCallBack; 
        private String outerBizId; 

        private Builder() {
            super();
        } 

        private Builder(RecognizeAudioRequest request) {
            super(request);
            this.audioFileUrl = request.audioFileUrl;
            this.callbackUrl = request.callbackUrl;
            this.enableCallBack = request.enableCallBack;
            this.outerBizId = request.outerBizId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xx.com/abc.mp3">http://xx.com/abc.mp3</a></p>
         */
        public Builder audioFileUrl(String audioFileUrl) {
            this.putBodyParameter("AudioFileUrl", audioFileUrl);
            this.audioFileUrl = audioFileUrl;
            return this;
        }

        /**
         * CallbackUrl.
         */
        public Builder callbackUrl(String callbackUrl) {
            this.putBodyParameter("CallbackUrl", callbackUrl);
            this.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableCallBack(Boolean enableCallBack) {
            this.putQueryParameter("EnableCallBack", enableCallBack);
            this.enableCallBack = enableCallBack;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>433c1361-0f6e-48fc-ad51</p>
         */
        public Builder outerBizId(String outerBizId) {
            this.putBodyParameter("OuterBizId", outerBizId);
            this.outerBizId = outerBizId;
            return this;
        }

        @Override
        public RecognizeAudioRequest build() {
            return new RecognizeAudioRequest(this);
        } 

    } 

}
