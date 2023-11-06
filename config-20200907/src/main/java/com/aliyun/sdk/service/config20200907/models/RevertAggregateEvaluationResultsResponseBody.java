// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevertAggregateEvaluationResultsResponseBody} extends {@link TeaModel}
 *
 * <p>RevertAggregateEvaluationResultsResponseBody</p>
 */
public class RevertAggregateEvaluationResultsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RevertAggregateEvaluationResultsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevertAggregateEvaluationResultsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RevertAggregateEvaluationResultsResponseBody build() {
            return new RevertAggregateEvaluationResultsResponseBody(this);
        } 

    } 

}
