// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianmodelonchip20240816.models;

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
 * {@link OmniRealtimeConversationEURequest} extends {@link RequestModel}
 *
 * <p>OmniRealtimeConversationEURequest</p>
 */
public class OmniRealtimeConversationEURequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("inputAudio")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputAudio;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userPrompt")
    private String userPrompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("voice")
    private String voice;

    private OmniRealtimeConversationEURequest(Builder builder) {
        super(builder);
        this.inputAudio = builder.inputAudio;
        this.userPrompt = builder.userPrompt;
        this.voice = builder.voice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OmniRealtimeConversationEURequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inputAudio
     */
    public String getInputAudio() {
        return this.inputAudio;
    }

    /**
     * @return userPrompt
     */
    public String getUserPrompt() {
        return this.userPrompt;
    }

    /**
     * @return voice
     */
    public String getVoice() {
        return this.voice;
    }

    public static final class Builder extends Request.Builder<OmniRealtimeConversationEURequest, Builder> {
        private String inputAudio; 
        private String userPrompt; 
        private String voice; 

        private Builder() {
            super();
        } 

        private Builder(OmniRealtimeConversationEURequest request) {
            super(request);
            this.inputAudio = request.inputAudio;
            this.userPrompt = request.userPrompt;
            this.voice = request.voice;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://help-static-aliyun-doc.aliyuncs.com/file-manage-files/zh-CN/20250211/tixcef/cherry.wav">https://help-static-aliyun-doc.aliyuncs.com/file-manage-files/zh-CN/20250211/tixcef/cherry.wav</a></p>
         */
        public Builder inputAudio(String inputAudio) {
            this.putBodyParameter("inputAudio", inputAudio);
            this.inputAudio = inputAudio;
            return this;
        }

        /**
         * userPrompt.
         */
        public Builder userPrompt(String userPrompt) {
            this.putBodyParameter("userPrompt", userPrompt);
            this.userPrompt = userPrompt;
            return this;
        }

        /**
         * voice.
         */
        public Builder voice(String voice) {
            this.putBodyParameter("voice", voice);
            this.voice = voice;
            return this;
        }

        @Override
        public OmniRealtimeConversationEURequest build() {
            return new OmniRealtimeConversationEURequest(this);
        } 

    } 

}
