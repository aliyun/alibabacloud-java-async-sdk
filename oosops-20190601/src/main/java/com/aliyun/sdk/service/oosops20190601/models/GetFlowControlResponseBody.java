// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFlowControlResponseBody} extends {@link TeaModel}
 *
 * <p>GetFlowControlResponseBody</p>
 */
public class GetFlowControlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Value")
    private Integer value;

    private GetFlowControlResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFlowControlResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return value
     */
    public Integer getValue() {
        return this.value;
    }

    public static final class Builder {
        private String requestId; 
        private Integer value; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(Integer value) {
            this.value = value;
            return this;
        }

        public GetFlowControlResponseBody build() {
            return new GetFlowControlResponseBody(this);
        } 

    } 

}
