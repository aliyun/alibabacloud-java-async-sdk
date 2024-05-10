// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStackPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetStackPolicyResponseBody</p>
 */
public class GetStackPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StackPolicyBody")
    private java.util.Map < String, ? > stackPolicyBody;

    private GetStackPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.stackPolicyBody = builder.stackPolicyBody;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStackPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stackPolicyBody
     */
    public java.util.Map < String, ? > getStackPolicyBody() {
        return this.stackPolicyBody;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map < String, ? > stackPolicyBody; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The structure that contains the stack policy body. The stack policy body must be 1 to 16,384 bytes in length.
         */
        public Builder stackPolicyBody(java.util.Map < String, ? > stackPolicyBody) {
            this.stackPolicyBody = stackPolicyBody;
            return this;
        }

        public GetStackPolicyResponseBody build() {
            return new GetStackPolicyResponseBody(this);
        } 

    } 

}
