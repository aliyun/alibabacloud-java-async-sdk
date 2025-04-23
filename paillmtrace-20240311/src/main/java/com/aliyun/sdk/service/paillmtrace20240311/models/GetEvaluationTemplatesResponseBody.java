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
 * {@link GetEvaluationTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>GetEvaluationTemplatesResponseBody</p>
 */
public class GetEvaluationTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("EvaluationTemplates")
    private java.util.List<?> evaluationTemplates;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetEvaluationTemplatesResponseBody(Builder builder) {
        this.code = builder.code;
        this.evaluationTemplates = builder.evaluationTemplates;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEvaluationTemplatesResponseBody create() {
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
     * @return evaluationTemplates
     */
    public java.util.List<?> getEvaluationTemplates() {
        return this.evaluationTemplates;
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
        private java.util.List<?> evaluationTemplates; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetEvaluationTemplatesResponseBody model) {
            this.code = model.code;
            this.evaluationTemplates = model.evaluationTemplates;
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
         * EvaluationTemplates.
         */
        public Builder evaluationTemplates(java.util.List<?> evaluationTemplates) {
            this.evaluationTemplates = evaluationTemplates;
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
         * <p>6A87228C-969A-1381-98CF-AE07AE630FA5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetEvaluationTemplatesResponseBody build() {
            return new GetEvaluationTemplatesResponseBody(this);
        } 

    } 

}
