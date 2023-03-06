// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePipelinesResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePipelinesResponseBody</p>
 */
public class CreatePipelinesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Boolean result;

    private CreatePipelinesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePipelinesResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the pipeline is created. Valor:
         * <p>
         * 
         * *   true: The task is created.
         * *   false: The instance failed to be created.
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        public CreatePipelinesResponseBody build() {
            return new CreatePipelinesResponseBody(this);
        } 

    } 

}
