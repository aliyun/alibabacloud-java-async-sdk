// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlp_automl20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAsyncPredictResponseBody} extends {@link TeaModel}
 *
 * <p>GetAsyncPredictResponseBody</p>
 */
public class GetAsyncPredictResponseBody extends TeaModel {
    @NameInMap("AsyncPredictId")
    private Integer asyncPredictId;

    @NameInMap("Content")
    private String content;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private Integer status;

    private GetAsyncPredictResponseBody(Builder builder) {
        this.asyncPredictId = builder.asyncPredictId;
        this.content = builder.content;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAsyncPredictResponseBody create() {
        return builder().build();
    }

    /**
     * @return asyncPredictId
     */
    public Integer getAsyncPredictId() {
        return this.asyncPredictId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Integer asyncPredictId; 
        private String content; 
        private String requestId; 
        private Integer status; 

        /**
         * AsyncPredictId.
         */
        public Builder asyncPredictId(Integer asyncPredictId) {
            this.asyncPredictId = asyncPredictId;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
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
         * Status.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public GetAsyncPredictResponseBody build() {
            return new GetAsyncPredictResponseBody(this);
        } 

    } 

}
