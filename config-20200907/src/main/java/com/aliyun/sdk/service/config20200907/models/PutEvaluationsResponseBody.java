// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutEvaluationsResponseBody} extends {@link TeaModel}
 *
 * <p>PutEvaluationsResponseBody</p>
 */
public class PutEvaluationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Boolean result;

    private PutEvaluationsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutEvaluationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Boolean getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean result; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The submission status of the evaluation results of the custom rule. Valid values:
         * <p>
         * 
         * *   true: The evaluation results are submitted.
         * *   false: The evaluation results failed to be submitted.
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        public PutEvaluationsResponseBody build() {
            return new PutEvaluationsResponseBody(this);
        } 

    } 

}
