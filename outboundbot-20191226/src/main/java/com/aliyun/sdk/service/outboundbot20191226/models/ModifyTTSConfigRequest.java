// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link ModifyTTSConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyTTSConfigRequest</p>
 */
public class ModifyTTSConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    private String appKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NlsServiceType")
    private String nlsServiceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PitchRate")
    private String pitchRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scriptId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpeechRate")
    private String speechRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Voice")
    private String voice;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Volume")
    private String volume;

    private ModifyTTSConfigRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.instanceId = builder.instanceId;
        this.nlsServiceType = builder.nlsServiceType;
        this.pitchRate = builder.pitchRate;
        this.scriptId = builder.scriptId;
        this.speechRate = builder.speechRate;
        this.voice = builder.voice;
        this.volume = builder.volume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTTSConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nlsServiceType
     */
    public String getNlsServiceType() {
        return this.nlsServiceType;
    }

    /**
     * @return pitchRate
     */
    public String getPitchRate() {
        return this.pitchRate;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * @return speechRate
     */
    public String getSpeechRate() {
        return this.speechRate;
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
    public String getVolume() {
        return this.volume;
    }

    public static final class Builder extends Request.Builder<ModifyTTSConfigRequest, Builder> {
        private String appKey; 
        private String instanceId; 
        private String nlsServiceType; 
        private String pitchRate; 
        private String scriptId; 
        private String speechRate; 
        private String voice; 
        private String volume; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTTSConfigRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.instanceId = request.instanceId;
            this.nlsServiceType = request.nlsServiceType;
            this.pitchRate = request.pitchRate;
            this.scriptId = request.scriptId;
            this.speechRate = request.speechRate;
            this.voice = request.voice;
            this.volume = request.volume;
        } 

        /**
         * <p>AppKey for your Intelligent Speech Interaction project. Required only when NlsServiceType is Authorized.</p>
         * 
         * <strong>example:</strong>
         * <p>99****Aw</p>
         */
        public Builder appKey(String appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * <p>Instance ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>27244bae-e446-4811-bb1d-f8a07b525af0</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The service type.
         * Managed: The default public Intelligent Speech Interaction service for Outbound Bot.
         * Authorized: A private Intelligent Speech Interaction service that you have purchased. To grant authorization, navigate to Scenario Management &gt; Edit &gt; Call Service &gt; Custom Service.</p>
         * 
         * <strong>example:</strong>
         * <p>Managed</p>
         */
        public Builder nlsServiceType(String nlsServiceType) {
            this.putQueryParameter("NlsServiceType", nlsServiceType);
            this.nlsServiceType = nlsServiceType;
            return this;
        }

        /**
         * <p>Pitch. An integer between -500 and 500. Default is 0.</p>
         * <p>A value greater than 0 raises pitch.</p>
         * <p>A value less than 0 lowers pitch.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder pitchRate(String pitchRate) {
            this.putQueryParameter("PitchRate", pitchRate);
            this.pitchRate = pitchRate;
            return this;
        }

        /**
         * <p>Scenario ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1f1a2ba0-b3e7-4ff9-baf1-6dc8aeac0791</p>
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * <p>Speech rate. An integer between -500 and 500. Default is 0.</p>
         * <p>A value greater than 0 increases speech speed.</p>
         * <p>A value less than 0 decreases speech speed.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder speechRate(String speechRate) {
            this.putQueryParameter("SpeechRate", speechRate);
            this.speechRate = speechRate;
            return this;
        }

        /**
         * <p>Voice model, such as aixia, siyue, or xiaoyun</p>
         * 
         * <strong>example:</strong>
         * <p>aixia</p>
         */
        public Builder voice(String voice) {
            this.putQueryParameter("Voice", voice);
            this.voice = voice;
            return this;
        }

        /**
         * <p>Volume. An integer between 0 and 100. Default is 50.</p>
         * <p>A value greater than 50 increases volume.</p>
         * <p>A value less than 50 decreases volume.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder volume(String volume) {
            this.putQueryParameter("Volume", volume);
            this.volume = volume;
            return this;
        }

        @Override
        public ModifyTTSConfigRequest build() {
            return new ModifyTTSConfigRequest(this);
        } 

    } 

}
