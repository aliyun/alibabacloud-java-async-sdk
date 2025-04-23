// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paillmtrace20240311.models;

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
 * {@link EvaluateTraceResponseBody} extends {@link TeaModel}
 *
 * <p>EvaluateTraceResponseBody</p>
 */
public class EvaluateTraceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("EvaluationId")
    private String evaluationId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private EvaluateTraceResponseBody(Builder builder) {
        this.code = builder.code;
        this.evaluationId = builder.evaluationId;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EvaluateTraceResponseBody create() {
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
     * @return evaluationId
     */
    public String getEvaluationId() {
        return this.evaluationId;
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
        private String code; 
        private String evaluationId; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(EvaluateTraceResponseBody model) {
            this.code = model.code;
            this.evaluationId = model.evaluationId;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * EvaluationId.
         */
        public Builder evaluationId(String evaluationId) {
            this.evaluationId = evaluationId;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>F1AB295E-0D1F-5ECE-9FFA-98ABB4CB5DF5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EvaluateTraceResponseBody build() {
            return new EvaluateTraceResponseBody(this);
        } 

    } 

}
