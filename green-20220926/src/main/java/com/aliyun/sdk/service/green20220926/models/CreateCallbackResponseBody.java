// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateCallbackResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCallbackResponseBody</p>
 */
public class CreateCallbackResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Long data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCallbackResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCallbackResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Long getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Long data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCallbackResponseBody build() {
            return new CreateCallbackResponseBody(this);
        } 

    } 

}
