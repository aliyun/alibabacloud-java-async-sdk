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
 * {@link LlmSmartCallRequest} extends {@link RequestModel}
 *
 * <p>LlmSmartCallRequest</p>
 */
public class LlmSmartCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizParam")
    private java.util.Map<String, ?> bizParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calledNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallerNumber")
    private String callerNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerLineCode")
    private String customerLineCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Extension")
    @com.aliyun.core.annotation.Validation(maxLength = 5)
    private String extension;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutId")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String outId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromptParam")
    private java.util.Map<String, ?> promptParam;

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

    private LlmSmartCallRequest(Builder builder) {
        super(builder);
        this.applicationCode = builder.applicationCode;
        this.bizParam = builder.bizParam;
        this.calledNumber = builder.calledNumber;
        this.callerNumber = builder.callerNumber;
        this.customerLineCode = builder.customerLineCode;
        this.extension = builder.extension;
        this.outId = builder.outId;
        this.promptParam = builder.promptParam;
        this.sessionTimeout = builder.sessionTimeout;
        this.startWordParam = builder.startWordParam;
        this.ttsSpeed = builder.ttsSpeed;
        this.ttsVoiceCode = builder.ttsVoiceCode;
        this.ttsVolume = builder.ttsVolume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LlmSmartCallRequest create() {
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
     * @return bizParam
     */
    public java.util.Map<String, ?> getBizParam() {
        return this.bizParam;
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
     * @return customerLineCode
     */
    public String getCustomerLineCode() {
        return this.customerLineCode;
    }

    /**
     * @return extension
     */
    public String getExtension() {
        return this.extension;
    }

    /**
     * @return outId
     */
    public String getOutId() {
        return this.outId;
    }

    /**
     * @return promptParam
     */
    public java.util.Map<String, ?> getPromptParam() {
        return this.promptParam;
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

    public static final class Builder extends Request.Builder<LlmSmartCallRequest, Builder> {
        private String applicationCode; 
        private java.util.Map<String, ?> bizParam; 
        private String calledNumber; 
        private String callerNumber; 
        private String customerLineCode; 
        private String extension; 
        private String outId; 
        private java.util.Map<String, ?> promptParam; 
        private Integer sessionTimeout; 
        private java.util.Map<String, ?> startWordParam; 
        private Integer ttsSpeed; 
        private String ttsVoiceCode; 
        private Integer ttsVolume; 

        private Builder() {
            super();
        } 

        private Builder(LlmSmartCallRequest request) {
            super(request);
            this.applicationCode = request.applicationCode;
            this.bizParam = request.bizParam;
            this.calledNumber = request.calledNumber;
            this.callerNumber = request.callerNumber;
            this.customerLineCode = request.customerLineCode;
            this.extension = request.extension;
            this.outId = request.outId;
            this.promptParam = request.promptParam;
            this.sessionTimeout = request.sessionTimeout;
            this.startWordParam = request.startWordParam;
            this.ttsSpeed = request.ttsSpeed;
            this.ttsVoiceCode = request.ttsVoiceCode;
            this.ttsVolume = request.ttsVolume;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>F32XXX2CF9</p>
         */
        public Builder applicationCode(String applicationCode) {
            this.putQueryParameter("ApplicationCode", applicationCode);
            this.applicationCode = applicationCode;
            return this;
        }

        /**
         * BizParam.
         */
        public Builder bizParam(java.util.Map<String, ?> bizParam) {
            String bizParamShrink = shrink(bizParam, "BizParam", "json");
            this.putQueryParameter("BizParam", bizParamShrink);
            this.bizParam = bizParam;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>137****0000</p>
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * CallerNumber.
         */
        public Builder callerNumber(String callerNumber) {
            this.putQueryParameter("CallerNumber", callerNumber);
            this.callerNumber = callerNumber;
            return this;
        }

        /**
         * CustomerLineCode.
         */
        public Builder customerLineCode(String customerLineCode) {
            this.putQueryParameter("CustomerLineCode", customerLineCode);
            this.customerLineCode = customerLineCode;
            return this;
        }

        /**
         * Extension.
         */
        public Builder extension(String extension) {
            this.putQueryParameter("Extension", extension);
            this.extension = extension;
            return this;
        }

        /**
         * OutId.
         */
        public Builder outId(String outId) {
            this.putQueryParameter("OutId", outId);
            this.outId = outId;
            return this;
        }

        /**
         * PromptParam.
         */
        public Builder promptParam(java.util.Map<String, ?> promptParam) {
            String promptParamShrink = shrink(promptParam, "PromptParam", "json");
            this.putQueryParameter("PromptParam", promptParamShrink);
            this.promptParam = promptParam;
            return this;
        }

        /**
         * SessionTimeout.
         */
        public Builder sessionTimeout(Integer sessionTimeout) {
            this.putQueryParameter("SessionTimeout", sessionTimeout);
            this.sessionTimeout = sessionTimeout;
            return this;
        }

        /**
         * StartWordParam.
         */
        public Builder startWordParam(java.util.Map<String, ?> startWordParam) {
            String startWordParamShrink = shrink(startWordParam, "StartWordParam", "json");
            this.putQueryParameter("StartWordParam", startWordParamShrink);
            this.startWordParam = startWordParam;
            return this;
        }

        /**
         * TtsSpeed.
         */
        public Builder ttsSpeed(Integer ttsSpeed) {
            this.putQueryParameter("TtsSpeed", ttsSpeed);
            this.ttsSpeed = ttsSpeed;
            return this;
        }

        /**
         * TtsVoiceCode.
         */
        public Builder ttsVoiceCode(String ttsVoiceCode) {
            this.putQueryParameter("TtsVoiceCode", ttsVoiceCode);
            this.ttsVoiceCode = ttsVoiceCode;
            return this;
        }

        /**
         * TtsVolume.
         */
        public Builder ttsVolume(Integer ttsVolume) {
            this.putQueryParameter("TtsVolume", ttsVolume);
            this.ttsVolume = ttsVolume;
            return this;
        }

        @Override
        public LlmSmartCallRequest build() {
            return new LlmSmartCallRequest(this);
        } 

    } 

}
