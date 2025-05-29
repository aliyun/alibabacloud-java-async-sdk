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
 * {@link HalfLLMTTSChatRequest} extends {@link RequestModel}
 *
 * <p>HalfLLMTTSChatRequest</p>
 */
public class HalfLLMTTSChatRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("deviceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enableSearch")
    private Boolean enableSearch;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("format")
    private String format;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("model")
    private String model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pitchRate")
    private Integer pitchRate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("productKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("prompt")
    private String prompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sampleRate")
    private Integer sampleRate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("speechRate")
    private Integer speechRate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("stream")
    private Boolean stream;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("text")
    @com.aliyun.core.annotation.Validation(required = true)
    private String text;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("url")
    private String url;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("voice")
    private String voice;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("volume")
    private Integer volume;

    private HalfLLMTTSChatRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.enableSearch = builder.enableSearch;
        this.format = builder.format;
        this.model = builder.model;
        this.pitchRate = builder.pitchRate;
        this.productKey = builder.productKey;
        this.prompt = builder.prompt;
        this.sampleRate = builder.sampleRate;
        this.sessionId = builder.sessionId;
        this.speechRate = builder.speechRate;
        this.stream = builder.stream;
        this.tenantId = builder.tenantId;
        this.text = builder.text;
        this.url = builder.url;
        this.voice = builder.voice;
        this.volume = builder.volume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HalfLLMTTSChatRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return enableSearch
     */
    public Boolean getEnableSearch() {
        return this.enableSearch;
    }

    /**
     * @return format
     */
    public String getFormat() {
        return this.format;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return pitchRate
     */
    public Integer getPitchRate() {
        return this.pitchRate;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return sampleRate
     */
    public Integer getSampleRate() {
        return this.sampleRate;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return speechRate
     */
    public Integer getSpeechRate() {
        return this.speechRate;
    }

    /**
     * @return stream
     */
    public Boolean getStream() {
        return this.stream;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @return voice
     */
    public String getVoice() {
        return this.voice;
    }

    /**
     * @return volume
     */
    public Integer getVolume() {
        return this.volume;
    }

    public static final class Builder extends Request.Builder<HalfLLMTTSChatRequest, Builder> {
        private String deviceName; 
        private Boolean enableSearch; 
        private String format; 
        private String model; 
        private Integer pitchRate; 
        private String productKey; 
        private String prompt; 
        private Integer sampleRate; 
        private String sessionId; 
        private Integer speechRate; 
        private Boolean stream; 
        private String tenantId; 
        private String text; 
        private String url; 
        private String voice; 
        private Integer volume; 

        private Builder() {
            super();
        } 

        private Builder(HalfLLMTTSChatRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.enableSearch = request.enableSearch;
            this.format = request.format;
            this.model = request.model;
            this.pitchRate = request.pitchRate;
            this.productKey = request.productKey;
            this.prompt = request.prompt;
            this.sampleRate = request.sampleRate;
            this.sessionId = request.sessionId;
            this.speechRate = request.speechRate;
            this.stream = request.stream;
            this.tenantId = request.tenantId;
            this.text = request.text;
            this.url = request.url;
            this.voice = request.voice;
            this.volume = request.volume;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5b504f84b69b9a73d3a21a2cff05e190</p>
         */
        public Builder deviceName(String deviceName) {
            this.putBodyParameter("deviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * enableSearch.
         */
        public Builder enableSearch(Boolean enableSearch) {
            this.putBodyParameter("enableSearch", enableSearch);
            this.enableSearch = enableSearch;
            return this;
        }

        /**
         * format.
         */
        public Builder format(String format) {
            this.putBodyParameter("format", format);
            this.format = format;
            return this;
        }

        /**
         * model.
         */
        public Builder model(String model) {
            this.putBodyParameter("model", model);
            this.model = model;
            return this;
        }

        /**
         * pitchRate.
         */
        public Builder pitchRate(Integer pitchRate) {
            this.putBodyParameter("pitchRate", pitchRate);
            this.pitchRate = pitchRate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2oImhCz4f8XCviiM</p>
         */
        public Builder productKey(String productKey) {
            this.putBodyParameter("productKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * prompt.
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * sampleRate.
         */
        public Builder sampleRate(Integer sampleRate) {
            this.putBodyParameter("sampleRate", sampleRate);
            this.sampleRate = sampleRate;
            return this;
        }

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * speechRate.
         */
        public Builder speechRate(Integer speechRate) {
            this.putBodyParameter("speechRate", speechRate);
            this.speechRate = speechRate;
            return this;
        }

        /**
         * stream.
         */
        public Builder stream(Boolean stream) {
            this.putBodyParameter("stream", stream);
            this.stream = stream;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>661708759700322</p>
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder text(String text) {
            this.putBodyParameter("text", text);
            this.text = text;
            return this;
        }

        /**
         * url.
         */
        public Builder url(String url) {
            this.putBodyParameter("url", url);
            this.url = url;
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

        /**
         * volume.
         */
        public Builder volume(Integer volume) {
            this.putBodyParameter("volume", volume);
            this.volume = volume;
            return this;
        }

        @Override
        public HalfLLMTTSChatRequest build() {
            return new HalfLLMTTSChatRequest(this);
        } 

    } 

}
