// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link PublishScriptResponseBody} extends {@link TeaModel}
 *
 * <p>PublishScriptResponseBody</p>
 */
public class PublishScriptResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("SyntaxErrorMsg")
    private String syntaxErrorMsg;

    private PublishScriptResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.syntaxErrorMsg = builder.syntaxErrorMsg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishScriptResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
     * @return syntaxErrorMsg
     */
    public String getSyntaxErrorMsg() {
        return this.syntaxErrorMsg;
    }

    public static final class Builder {
        private String code; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private String syntaxErrorMsg; 

        private Builder() {
        } 

        private Builder(PublishScriptResponseBody model) {
            this.code = model.code;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
            this.syntaxErrorMsg = model.syntaxErrorMsg;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * SyntaxErrorMsg.
         */
        public Builder syntaxErrorMsg(String syntaxErrorMsg) {
            this.syntaxErrorMsg = syntaxErrorMsg;
            return this;
        }

        public PublishScriptResponseBody build() {
            return new PublishScriptResponseBody(this);
        } 

    } 

}
