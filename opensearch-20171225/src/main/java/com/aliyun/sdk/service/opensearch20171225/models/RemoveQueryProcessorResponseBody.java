// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveQueryProcessorResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveQueryProcessorResponseBody</p>
 */
public class RemoveQueryProcessorResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private String result;

    private RemoveQueryProcessorResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveQueryProcessorResponseBody create() {
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
    public String getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private String result; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * N/A
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        public RemoveQueryProcessorResponseBody build() {
            return new RemoveQueryProcessorResponseBody(this);
        } 

    } 

}
