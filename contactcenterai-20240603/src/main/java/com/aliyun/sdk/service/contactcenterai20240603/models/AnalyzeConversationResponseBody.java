// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.contactcenterai20240603.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AnalyzeConversationResponseBody} extends {@link TeaModel}
 *
 * <p>AnalyzeConversationResponseBody</p>
 */
public class AnalyzeConversationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorInfo")
    private String errorInfo;

    @com.aliyun.core.annotation.NameInMap("finishReason")
    private String finishReason;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("text")
    private String text;

    private AnalyzeConversationResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorInfo = builder.errorInfo;
        this.finishReason = builder.finishReason;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.text = builder.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AnalyzeConversationResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorInfo
     */
    public String getErrorInfo() {
        return this.errorInfo;
    }

    /**
     * @return finishReason
     */
    public String getFinishReason() {
        return this.finishReason;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorInfo; 
        private String finishReason; 
        private String requestId; 
        private Boolean success; 
        private String text; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorInfo.
         */
        public Builder errorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }

        /**
         * finishReason.
         */
        public Builder finishReason(String finishReason) {
            this.finishReason = finishReason;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * text.
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }

        public AnalyzeConversationResponseBody build() {
            return new AnalyzeConversationResponseBody(this);
        } 

    } 

}
