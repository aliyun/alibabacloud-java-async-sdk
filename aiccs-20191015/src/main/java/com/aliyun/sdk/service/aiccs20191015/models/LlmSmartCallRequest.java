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
    @com.aliyun.core.annotation.NameInMap("CalledNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calledNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallerNumber")
    private String callerNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutId")
    private String outId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromptParam")
    private java.util.Map<String, ?> promptParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartWordParam")
    private java.util.Map<String, ?> startWordParam;

    private LlmSmartCallRequest(Builder builder) {
        super(builder);
        this.applicationCode = builder.applicationCode;
        this.calledNumber = builder.calledNumber;
        this.callerNumber = builder.callerNumber;
        this.outId = builder.outId;
        this.promptParam = builder.promptParam;
        this.startWordParam = builder.startWordParam;
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
     * @return promptParam
     */
    public java.util.Map<String, ?> getPromptParam() {
        return this.promptParam;
    }

    /**
     * @return startWordParam
     */
    public java.util.Map<String, ?> getStartWordParam() {
        return this.startWordParam;
    }

    public static final class Builder extends Request.Builder<LlmSmartCallRequest, Builder> {
        private String applicationCode; 
        private String calledNumber; 
        private String callerNumber; 
        private String outId; 
        private java.util.Map<String, ?> promptParam; 
        private java.util.Map<String, ?> startWordParam; 

        private Builder() {
            super();
        } 

        private Builder(LlmSmartCallRequest request) {
            super(request);
            this.applicationCode = request.applicationCode;
            this.calledNumber = request.calledNumber;
            this.callerNumber = request.callerNumber;
            this.outId = request.outId;
            this.promptParam = request.promptParam;
            this.startWordParam = request.startWordParam;
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
         * StartWordParam.
         */
        public Builder startWordParam(java.util.Map<String, ?> startWordParam) {
            String startWordParamShrink = shrink(startWordParam, "StartWordParam", "json");
            this.putQueryParameter("StartWordParam", startWordParamShrink);
            this.startWordParam = startWordParam;
            return this;
        }

        @Override
        public LlmSmartCallRequest build() {
            return new LlmSmartCallRequest(this);
        } 

    } 

}
