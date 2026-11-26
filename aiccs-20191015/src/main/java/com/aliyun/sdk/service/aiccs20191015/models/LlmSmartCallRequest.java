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
         * <p>The code of the large language model application. You can view the code on the <a href="https://aiccs.console.aliyun.com/engine/llmApp">Large Language Model Application Management</a> page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>F32******</p>
         */
        public Builder applicationCode(String applicationCode) {
            this.putQueryParameter("ApplicationCode", applicationCode);
            this.applicationCode = applicationCode;
            return this;
        }

        /**
         * <p>The custom business parameters. When you call this API operation, you can pass custom parameters to the large language model gateway. When the large language model gateway requests the customer model, this parameter is passed to the customer model.</p>
         * <ul>
         * <li><p><a href="https://www.alibabacloud.com/help/en/model-studio/invoke-workflow-application/#6e644d5a7b3ia">Model Studio workflow application: Parameter passing</a>. Example: <code>biz_params = {&quot;city&quot;: &quot;Hangzhou&quot;}</code></p>
         * </li>
         * <li><p><a href="https://www.alibabacloud.com/help/en/model-studio/call-single-agent-application/#b774db7cdc0aa">Model Studio agent application: Pass custom parameters</a>. Example:
         * <code>biz_params = { &quot;user_prompt_params&quot;: &quot;{\&quot;city\&quot;:\&quot;Beijing\&quot;}&quot; }</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>biz_params = {
         *   &quot;user_prompt_params&quot;: &quot;{&quot;city&quot;:&quot;Beijing&quot;}&quot;
         * }</p>
         */
        public Builder bizParam(java.util.Map<String, ?> bizParam) {
            String bizParamShrink = shrink(bizParam, "BizParam", "json");
            this.putQueryParameter("BizParam", bizParamShrink);
            this.bizParam = bizParam;
            return this;
        }

        /**
         * <p>The called number that receives the intelligent outbound call.</p>
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
         * <p>The caller number. This parameter is required and supports only numbers in the Chinese mainland. Go to the <a href="https://dyvmsnext.console.aliyun.com/number/list/normal">Real Number Management</a> page of Voice Service to view the number.</p>
         * <blockquote>
         * <ul>
         * <li>If you use a self-managed line, you must pass the number of the self-managed line.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>132****2054</p>
         */
        public Builder callerNumber(String callerNumber) {
            this.putQueryParameter("CallerNumber", callerNumber);
            this.callerNumber = callerNumber;
            return this;
        }

        /**
         * <p>The code of the self-managed line.</p>
         * <blockquote>
         * <ul>
         * <li>If you need to use a self-managed line, contact operations to enable this feature. After the self-managed line is approved, the line code is returned. If no line code is returned, do not specify this parameter.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SELF_xxxxx_A_NET</p>
         */
        public Builder customerLineCode(String customerLineCode) {
            this.putQueryParameter("CustomerLineCode", customerLineCode);
            this.customerLineCode = customerLineCode;
            return this;
        }

        /**
         * <p>The extension number of the X number. The extension number cannot exceed 5 digits.</p>
         * <blockquote>
         * <p>Notice: This parameter is required only in AXN extension number mode. If no extension number exists, do not specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder extension(String extension) {
            this.putQueryParameter("Extension", extension);
            this.extension = extension;
            return this;
        }

        /**
         * <p>The ID reserved for the caller. This ID is returned to the caller in the receipt message. When the large language model gateway requests the customer model, this parameter is passed to the customer model. The length is 1 to 15 bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>222356****</p>
         */
        public Builder outId(String outId) {
            this.putQueryParameter("OutId", outId);
            this.outId = outId;
            return this;
        }

        /**
         * <p>The prompt variables. Go to the <a href="https://aiccs.console.aliyun.com/engine/llmApp">Large Language Model Application Management</a> page and click Details to view the prompt variables of the large language model application that you created.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;style&quot;: &quot;gentle&quot;
         * }</p>
         */
        public Builder promptParam(java.util.Map<String, ?> promptParam) {
            String promptParamShrink = shrink(promptParam, "PromptParam", "json");
            this.putQueryParameter("PromptParam", promptParamShrink);
            this.promptParam = promptParam;
            return this;
        }

        /**
         * <p>The maximum call duration. The call is automatically disconnected after the timeout period. Unit: seconds.</p>
         * <blockquote>
         * <ul>
         * <li>Maximum value: 3600.</li>
         * <li>Minimum value: 600.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        public Builder sessionTimeout(Integer sessionTimeout) {
            this.putQueryParameter("SessionTimeout", sessionTimeout);
            this.sessionTimeout = sessionTimeout;
            return this;
        }

        /**
         * <p>The opening remark variables. Go to the <a href="https://aiccs.console.aliyun.com/engine/llmApp">Large Language Model Application Management</a> page and click Details to view the opening remark variables of the large language model application that you created.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;name&quot;: &quot;Xiaoming&quot;,
         *   &quot;address&quot;: &quot;Hangzhou, Zhejiang&quot;
         * }</p>
         */
        public Builder startWordParam(java.util.Map<String, ?> startWordParam) {
            String startWordParamShrink = shrink(startWordParam, "StartWordParam", "json");
            this.putQueryParameter("StartWordParam", startWordParamShrink);
            this.startWordParam = startWordParam;
            return this;
        }

        /**
         * <p>The speech rate for TTS playback.</p>
         * <blockquote>
         * <ul>
         * <li>Valid values: -200 to 200. Default value: 0.</li>
         * <li>If you do not specify this parameter, the speech rate configured for the large language model application is used by default.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder ttsSpeed(Integer ttsSpeed) {
            this.putQueryParameter("TtsSpeed", ttsSpeed);
            this.ttsSpeed = ttsSpeed;
            return this;
        }

        /**
         * <p>The voice code for text-to-speech (TTS) playback.</p>
         * <blockquote>
         * <ul>
         * <li>If you do not specify this parameter, the voice code configured for the large language model application is used by default.</li>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/2926668.html">ListAvailableTts</a> API operation to query all voice codes.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>V65******</p>
         */
        public Builder ttsVoiceCode(String ttsVoiceCode) {
            this.putQueryParameter("TtsVoiceCode", ttsVoiceCode);
            this.ttsVoiceCode = ttsVoiceCode;
            return this;
        }

        /**
         * <p>The volume for TTS playback.</p>
         * <blockquote>
         * <ul>
         * <li>Valid values: 0 to 100. Default value: 0.</li>
         * <li>If you do not specify this parameter, the volume configured for the large language model application is used by default.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
