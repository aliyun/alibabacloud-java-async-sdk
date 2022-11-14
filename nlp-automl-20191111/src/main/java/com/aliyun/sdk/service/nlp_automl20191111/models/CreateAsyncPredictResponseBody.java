// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlp_automl20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAsyncPredictResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAsyncPredictResponseBody</p>
 */
public class CreateAsyncPredictResponseBody extends TeaModel {
    @NameInMap("AsyncPredictId")
    private Long asyncPredictId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateAsyncPredictResponseBody(Builder builder) {
        this.asyncPredictId = builder.asyncPredictId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAsyncPredictResponseBody create() {
        return builder().build();
    }

    /**
     * @return asyncPredictId
     */
    public Long getAsyncPredictId() {
        return this.asyncPredictId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long asyncPredictId; 
        private String requestId; 

        /**
         * AsyncPredictId.
         */
        public Builder asyncPredictId(Long asyncPredictId) {
            this.asyncPredictId = asyncPredictId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAsyncPredictResponseBody build() {
            return new CreateAsyncPredictResponseBody(this);
        } 

    } 

}
