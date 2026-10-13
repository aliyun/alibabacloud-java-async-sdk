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
 * {@link DescribeTTSDemoRequest} extends {@link RequestModel}
 *
 * <p>DescribeTTSDemoRequest</p>
 */
public class DescribeTTSDemoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessKey")
    private String accessKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliCustomizedVoice")
    private String aliCustomizedVoice;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    private String appKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtParams")
    private String extParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NlsServiceType")
    private String nlsServiceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PitchRate")
    private Integer pitchRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    private String scriptId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretKey")
    private String secretKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpeechRate")
    @com.aliyun.core.annotation.Validation(maximum = 500)
    private Integer speechRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Text")
    @com.aliyun.core.annotation.Validation(required = true)
    private String text;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Voice")
    private String voice;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Volume")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer volume;

    private DescribeTTSDemoRequest(Builder builder) {
        super(builder);
        this.accessKey = builder.accessKey;
        this.aliCustomizedVoice = builder.aliCustomizedVoice;
        this.appKey = builder.appKey;
        this.engine = builder.engine;
        this.extParams = builder.extParams;
        this.instanceId = builder.instanceId;
        this.nlsServiceType = builder.nlsServiceType;
        this.pitchRate = builder.pitchRate;
        this.scriptId = builder.scriptId;
        this.secretKey = builder.secretKey;
        this.speechRate = builder.speechRate;
        this.text = builder.text;
        this.voice = builder.voice;
        this.volume = builder.volume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTTSDemoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessKey
     */
    public String getAccessKey() {
        return this.accessKey;
    }

    /**
     * @return aliCustomizedVoice
     */
    public String getAliCustomizedVoice() {
        return this.aliCustomizedVoice;
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return extParams
     */
    public String getExtParams() {
        return this.extParams;
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
    public Integer getPitchRate() {
        return this.pitchRate;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * @return secretKey
     */
    public String getSecretKey() {
        return this.secretKey;
    }

    /**
     * @return speechRate
     */
    public Integer getSpeechRate() {
        return this.speechRate;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
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

    public static final class Builder extends Request.Builder<DescribeTTSDemoRequest, Builder> {
        private String accessKey; 
        private String aliCustomizedVoice; 
        private String appKey; 
        private String engine; 
        private String extParams; 
        private String instanceId; 
        private String nlsServiceType; 
        private Integer pitchRate; 
        private String scriptId; 
        private String secretKey; 
        private Integer speechRate; 
        private String text; 
        private String voice; 
        private Integer volume; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTTSDemoRequest request) {
            super(request);
            this.accessKey = request.accessKey;
            this.aliCustomizedVoice = request.aliCustomizedVoice;
            this.appKey = request.appKey;
            this.engine = request.engine;
            this.extParams = request.extParams;
            this.instanceId = request.instanceId;
            this.nlsServiceType = request.nlsServiceType;
            this.pitchRate = request.pitchRate;
            this.scriptId = request.scriptId;
            this.secretKey = request.secretKey;
            this.speechRate = request.speechRate;
            this.text = request.text;
            this.voice = request.voice;
            this.volume = request.volume;
        } 

        /**
         * <p>The AccessKey (AK) of the namespace.</p>
         * <blockquote>
         * <p>When the engine is xunfei, enter the AK here.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5d0f37******<strong><strong>ef56db601</strong></strong></p>
         */
        public Builder accessKey(String accessKey) {
            this.putQueryParameter("AccessKey", accessKey);
            this.accessKey = accessKey;
            return this;
        }

        /**
         * <p>The Alibaba Cloud custom voice, which is the voice invocation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>voice-e1be3a6</p>
         */
        public Builder aliCustomizedVoice(String aliCustomizedVoice) {
            this.putQueryParameter("AliCustomizedVoice", aliCustomizedVoice);
            this.aliCustomizedVoice = aliCustomizedVoice;
            return this;
        }

        /**
         * <p>The speech service type.</p>
         * <ul>
         * <li><p>When you use <strong>ali</strong> as the custom service, this field stores the appKey of the interactive voice response product project.</p>
         * </li>
         * <li><p>When you use <strong>xunfei</strong> as the custom service provider, this field stores the corresponding appKey.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>xusi*******RnP7</p>
         */
        public Builder appKey(String appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * <p>The storage engine. Valid values: ali, volc, xunfei.</p>
         * <ul>
         * <li>When using traditional voices, CosyVoice, or selecting Alibaba Cloud as the custom service, set this to <strong>ali</strong>.</li>
         * <li>When using the doubao service, set this to <strong>volc</strong>.</li>
         * <li>When using xunfei as the service provider, set this to <strong>xunfei</strong> (can only be used in small model scenarios).</li>
         * <li>When using your own service, set this to <strong>dock</strong>, and set NlsServiceType to Authorized.</li>
         * <li>When using CV-v3-flash and Qwen voices, set this to <strong>bailian</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ali</p>
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * <p>The extended parameter. When Engine is set to <strong>dock</strong>, enter the configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;thirdVoiceConfigUuid&quot;:&quot;3cd82813ece049c4aff3ea3d***********&quot;}</p>
         */
        public Builder extParams(String extParams) {
            this.putQueryParameter("ExtParams", extParams);
            this.extParams = extParams;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a8eccb3c-2b26-4b6d-a54f-696b953e33a6</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The service type.
         * Managed: the default service (public service) of the outbound robot product.
         * Authorized: the interactive voice response service purchased by the public cloud customer (custom service), configured through system administration &gt; Third-party Voice Configuration.</p>
         * <blockquote>
         * <p>When using Alibaba Cloud interactive voice response as the custom service provider, set this to Authorized.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Authorized</p>
         */
        public Builder nlsServiceType(String nlsServiceType) {
            this.putQueryParameter("NlsServiceType", nlsServiceType);
            this.nlsServiceType = nlsServiceType;
            return this;
        }

        /**
         * <p>The pitch.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder pitchRate(Integer pitchRate) {
            this.putQueryParameter("PitchRate", pitchRate);
            this.pitchRate = pitchRate;
            return this;
        }

        /**
         * <p>The scenario ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5ab2d935-306c-478a-88bf-d08e4e25c1b7</p>
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * <p>The AccessKey Secret (SK) of the namespace.</p>
         * <blockquote>
         * <p>When the engine is xunfei, enter the SK here.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>OTdhNDE3Z****<strong><strong>zQ</strong></strong></p>
         */
        public Builder secretKey(String secretKey) {
            this.putQueryParameter("SecretKey", secretKey);
            this.secretKey = secretKey;
            return this;
        }

        /**
         * <p>The speech rate. The value is an integer in the range of [-500, 500]. Default value: 0.</p>
         * <p>A value greater than 0 increases the pitch.</p>
         * <p>A value less than 0 decreases the pitch.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder speechRate(Integer speechRate) {
            this.putQueryParameter("SpeechRate", speechRate);
            this.speechRate = speechRate;
            return this;
        }

        /**
         * <p>The text content.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        public Builder text(String text) {
            this.putQueryParameter("Text", text);
            this.text = text;
            return this;
        }

        /**
         * <p>The voice information, such as aixia, siyue, or xiaoyun. For the complete list of available voices, refer to the voice list below.</p>
         * <blockquote>
         * <p>Because the Voice value for cloned voices is a non-fixed value generated during voice cloning, a specific Voice value cannot be provided at this stage. You can obtain the specific VoiceID from the voice cloning page by calling the ListVoiceClone operation.</p>
         * </blockquote>
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
         * <p>The volume. The value is an integer in the range of [0, 100]. Default value: 50.</p>
         * <p>A value greater than 50 increases the volume.</p>
         * <p>A value less than 50 decreases the volume.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder volume(Integer volume) {
            this.putQueryParameter("Volume", volume);
            this.volume = volume;
            return this;
        }

        @Override
        public DescribeTTSDemoRequest build() {
            return new DescribeTTSDemoRequest(this);
        } 

    } 

}
