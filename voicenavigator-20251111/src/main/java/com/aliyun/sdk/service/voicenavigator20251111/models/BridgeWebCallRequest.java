// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20251111.models;

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
 * {@link BridgeWebCallRequest} extends {@link RequestModel}
 *
 * <p>BridgeWebCallRequest</p>
 */
public class BridgeWebCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessChannelId")
    private String accessChannelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessChannelType")
    private String accessChannelType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Caller")
    private String caller;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    private String deviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DraftVersion")
    private Boolean draftVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SampleRate")
    private Integer sampleRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    private String scriptId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeoutSeconds")
    private Integer timeoutSeconds;

    private BridgeWebCallRequest(Builder builder) {
        super(builder);
        this.accessChannelId = builder.accessChannelId;
        this.accessChannelType = builder.accessChannelType;
        this.caller = builder.caller;
        this.deviceId = builder.deviceId;
        this.draftVersion = builder.draftVersion;
        this.instanceId = builder.instanceId;
        this.sampleRate = builder.sampleRate;
        this.scriptId = builder.scriptId;
        this.tags = builder.tags;
        this.timeoutSeconds = builder.timeoutSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BridgeWebCallRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessChannelId
     */
    public String getAccessChannelId() {
        return this.accessChannelId;
    }

    /**
     * @return accessChannelType
     */
    public String getAccessChannelType() {
        return this.accessChannelType;
    }

    /**
     * @return caller
     */
    public String getCaller() {
        return this.caller;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return draftVersion
     */
    public Boolean getDraftVersion() {
        return this.draftVersion;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return sampleRate
     */
    public Integer getSampleRate() {
        return this.sampleRate;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return timeoutSeconds
     */
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public static final class Builder extends Request.Builder<BridgeWebCallRequest, Builder> {
        private String accessChannelId; 
        private String accessChannelType; 
        private String caller; 
        private String deviceId; 
        private Boolean draftVersion; 
        private String instanceId; 
        private Integer sampleRate; 
        private String scriptId; 
        private String tags; 
        private Integer timeoutSeconds; 

        private Builder() {
            super();
        } 

        private Builder(BridgeWebCallRequest request) {
            super(request);
            this.accessChannelId = request.accessChannelId;
            this.accessChannelType = request.accessChannelType;
            this.caller = request.caller;
            this.deviceId = request.deviceId;
            this.draftVersion = request.draftVersion;
            this.instanceId = request.instanceId;
            this.sampleRate = request.sampleRate;
            this.scriptId = request.scriptId;
            this.tags = request.tags;
            this.timeoutSeconds = request.timeoutSeconds;
        } 

        /**
         * <p>The channel ID.</p>
         * <blockquote>
         * <p>This parameter is valid only when AccessChannelType is set to Web or Trial.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>33606503-c22c-4547-a51c-dda5e8d87962</p>
         */
        public Builder accessChannelId(String accessChannelId) {
            this.putQueryParameter("AccessChannelId", accessChannelId);
            this.accessChannelId = accessChannelId;
            return this;
        }

        /**
         * <p>The channel type.</p>
         * <blockquote>
         * <ul>
         * <li>Text: text test window</li>
         * <li>Test: test window</li>
         * <li>Trial: trial link</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Text</p>
         */
        public Builder accessChannelType(String accessChannelType) {
            this.putQueryParameter("AccessChannelType", accessChannelType);
            this.accessChannelType = accessChannelType;
            return this;
        }

        /**
         * <p>The caller number.</p>
         * 
         * <strong>example:</strong>
         * <p>010123*****</p>
         */
        public Builder caller(String caller) {
            this.putQueryParameter("Caller", caller);
            this.caller = caller;
            return this;
        }

        /**
         * <p>The device ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d4c38420-<strong><strong>-43bc-b001-56bfc274</strong></strong></p>
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * <p>Specifies whether the test environment is used.</p>
         * <blockquote>
         * <p>Default value: false.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder draftVersion(Boolean draftVersion) {
            this.putQueryParameter("DraftVersion", draftVersion);
            this.draftVersion = draftVersion;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36e9a4cd-a821-4f78-86fa-a9a4aefeea2e</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The sampling rate.</p>
         * 
         * <strong>example:</strong>
         * <p>8000</p>
         */
        public Builder sampleRate(Integer sampleRate) {
            this.putQueryParameter("SampleRate", sampleRate);
            this.sampleRate = sampleRate;
            return this;
        }

        /**
         * <p>The script ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0a88e269-01f5-49ac-97af-5830f0ccb271</p>
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * <p>The attached data.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;:&quot;value&quot;}</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The timeout period.</p>
         * <blockquote>
         * <ul>
         * <li>If the call is not connected within the time specified by this parameter, the system actively hangs up the call. Unit: seconds. Default value: 60.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            this.putQueryParameter("TimeoutSeconds", timeoutSeconds);
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        @Override
        public BridgeWebCallRequest build() {
            return new BridgeWebCallRequest(this);
        } 

    } 

}
