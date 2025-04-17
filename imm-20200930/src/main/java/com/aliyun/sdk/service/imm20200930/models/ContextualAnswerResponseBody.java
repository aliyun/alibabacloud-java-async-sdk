// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link ContextualAnswerResponseBody} extends {@link TeaModel}
 *
 * <p>ContextualAnswerResponseBody</p>
 */
public class ContextualAnswerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Answer")
    private Answer answer;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ContextualAnswerResponseBody(Builder builder) {
        this.answer = builder.answer;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContextualAnswerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return answer
     */
    public Answer getAnswer() {
        return this.answer;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Answer answer; 
        private String code; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ContextualAnswerResponseBody model) {
            this.answer = model.answer;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * Answer.
         */
        public Builder answer(Answer answer) {
            this.answer = answer;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ContextualAnswerResponseBody build() {
            return new ContextualAnswerResponseBody(this);
        } 

    } 

}
