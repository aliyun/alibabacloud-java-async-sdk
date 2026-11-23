// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qwenb2bchat20261121.models;

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
 * {@link StreamVoiceResponseBody} extends {@link TeaModel}
 *
 * <p>StreamVoiceResponseBody</p>
 */
public class StreamVoiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private StreamVoiceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StreamVoiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(StreamVoiceResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>仅描述 WebSocket 接入/握手的请求标识，不代表后续语音轮次或音频结果。成功连接后使用下文 VoiceEvent 文本事件和 VoiceOutputAudio 二进制帧，不能把整条 WSS 连接按单次 JSON 响应处理。</p>
         * 
         * <strong>example:</strong>
         * <p>A3677B53-C3AE-5F04-953E-AA332CABB87B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public StreamVoiceResponseBody build() {
            return new StreamVoiceResponseBody(this);
        } 

    } 

}
