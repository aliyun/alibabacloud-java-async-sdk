// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link LlmSmartCallFullDuplexRequest} extends {@link RequestModel}
 *
 * <p>LlmSmartCallFullDuplexRequest</p>
 */
public class LlmSmartCallFullDuplexRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calledNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallerNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callerNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutId")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String outId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionTimeout")
    @com.aliyun.core.annotation.Validation(maximum = 3600, minimum = 300)
    private Integer sessionTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartWordParam")
    private java.util.Map<String, ?> startWordParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TtsSpeed")
    private Integer ttsSpeed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TtsVoiceCode")
    private String ttsVoiceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TtsVolume")
    private Integer ttsVolume;

    private LlmSmartCallFullDuplexRequest(Builder builder) {
        super(builder);
        this.applicationCode = builder.applicationCode;
        this.calledNumber = builder.calledNumber;
        this.callerNumber = builder.callerNumber;
        this.outId = builder.outId;
        this.sessionTimeout = builder.sessionTimeout;
        this.startWordParam = builder.startWordParam;
        this.ttsSpeed = builder.ttsSpeed;
        this.ttsVoiceCode = builder.ttsVoiceCode;
        this.ttsVolume = builder.ttsVolume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LlmSmartCallFullDuplexRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationCode
     */
    public String getApplicationCode() {
        return this.applicationCode;
    }

    /**
     * @return calledNumber
     */
    public String getCalledNumber() {
        return this.calledNumber;
    }

    /**
     * @return callerNumber
     */
    public String getCallerNumber() {
        return this.callerNumber;
    }

    /**
     * @return outId
     */
    public String getOutId() {
        return this.outId;
    }

    /**
     * @return sessionTimeout
     */
    public Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    /**
     * @return startWordParam
     */
    public java.util.Map<String, ?> getStartWordParam() {
        return this.startWordParam;
    }

    /**
     * @return ttsSpeed
     */
    public Integer getTtsSpeed() {
        return this.ttsSpeed;
    }

    /**
     * @return ttsVoiceCode
     */
    public String getTtsVoiceCode() {
        return this.ttsVoiceCode;
    }

    /**
     * @return ttsVolume
     */
    public Integer getTtsVolume() {
        return this.ttsVolume;
    }

    public static final class Builder extends Request.Builder<LlmSmartCallFullDuplexRequest, Builder> {
        private String applicationCode; 
        private String calledNumber; 
        private String callerNumber; 
        private String outId; 
        private Integer sessionTimeout; 
        private java.util.Map<String, ?> startWordParam; 
        private Integer ttsSpeed; 
        private String ttsVoiceCode; 
        private Integer ttsVolume; 

        private Builder() {
            super();
        } 

        private Builder(LlmSmartCallFullDuplexRequest request) {
            super(request);
            this.applicationCode = request.applicationCode;
            this.calledNumber = request.calledNumber;
            this.callerNumber = request.callerNumber;
            this.outId = request.outId;
            this.sessionTimeout = request.sessionTimeout;
            this.startWordParam = request.startWordParam;
            this.ttsSpeed = request.ttsSpeed;
            this.ttsVoiceCode = request.ttsVoiceCode;
            this.ttsVolume = request.ttsVolume;
        } 

        /**
         * <p><strong>ApplicationCode</strong><br>The application code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app123</p>
         */
        public Builder applicationCode(String applicationCode) {
            this.putQueryParameter("ApplicationCode", applicationCode);
            this.applicationCode = applicationCode;
            return this;
        }

        /**
         * <p><strong>CalledNumber</strong><br>The phone number that receives the intelligent outbound call.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * <p><strong>CallerNumber</strong><br>The calling number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0987654321</p>
         */
        public Builder callerNumber(String callerNumber) {
            this.putQueryParameter("CallerNumber", callerNumber);
            this.callerNumber = callerNumber;
            return this;
        }

        /**
         * <p><strong>OutId</strong><br>The external ID. The value must be 1 to 15 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>out123</p>
         */
        public Builder outId(String outId) {
            this.putQueryParameter("OutId", outId);
            this.outId = outId;
            return this;
        }

        /**
         * <p><strong>SessionTimeout</strong><br>The maximum call duration. The call is automatically ended when the specified duration is exceeded. Unit: seconds. Maximum value: 3600.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        public Builder sessionTimeout(Integer sessionTimeout) {
            this.putQueryParameter("SessionTimeout", sessionTimeout);
            this.sessionTimeout = sessionTimeout;
            return this;
        }

        /**
         * <p><strong>StartWordParam</strong><br>The opening greeting variable. Format: JSON. Specify the variable name and parameter, for example, <code>{&quot;custom&quot;:&quot;XXX&quot;}</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;tailnumber\&quot;:\&quot;7898\&quot;,\&quot;platformOrder\&quot;:\&quot;\&quot;,\&quot;signatory\&quot;:\&quot;客户\&quot;}</p>
         */
        public Builder startWordParam(java.util.Map<String, ?> startWordParam) {
            String startWordParamShrink = shrink(startWordParam, "StartWordParam", "json");
            this.putQueryParameter("StartWordParam", startWordParamShrink);
            this.startWordParam = startWordParam;
            return this;
        }

        /**
         * <p>The voice speed. Valid values: 0 to 100. If this parameter is not specified, the value configured in the application is used.</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        public Builder ttsSpeed(Integer ttsSpeed) {
            this.putQueryParameter("TtsSpeed", ttsSpeed);
            this.ttsSpeed = ttsSpeed;
            return this;
        }

        /**
         * <p>The voice code from the personalized voice interface. If this parameter is not specified, the value configured in the application is used.</p>
         * 
         * <strong>example:</strong>
         * <p>V745A7CED</p>
         */
        public Builder ttsVoiceCode(String ttsVoiceCode) {
            this.putQueryParameter("TtsVoiceCode", ttsVoiceCode);
            this.ttsVoiceCode = ttsVoiceCode;
            return this;
        }

        /**
         * <p>The volume. Valid values: -200 to 200. If this parameter is not specified, the value configured in the application is used.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder ttsVolume(Integer ttsVolume) {
            this.putQueryParameter("TtsVolume", ttsVolume);
            this.ttsVolume = ttsVolume;
            return this;
        }

        @Override
        public LlmSmartCallFullDuplexRequest build() {
            return new LlmSmartCallFullDuplexRequest(this);
        } 

    } 

}
