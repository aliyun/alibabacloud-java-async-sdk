// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveScheduledTaskResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveScheduledTaskResponseBody</p>
 */
public class RemoveScheduledTaskResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private java.util.List < Integer > result;

    private RemoveScheduledTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveScheduledTaskResponseBody create() {
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
    public java.util.List < Integer > getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Integer > result; 

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
        public Builder result(java.util.List < Integer > result) {
            this.result = result;
            return this;
        }

        public RemoveScheduledTaskResponseBody build() {
            return new RemoveScheduledTaskResponseBody(this);
        } 

    } 

}
