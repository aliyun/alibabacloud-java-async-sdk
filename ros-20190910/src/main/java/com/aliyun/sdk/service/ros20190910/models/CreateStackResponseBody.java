// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStackResponseBody} extends {@link TeaModel}
 *
 * <p>CreateStackResponseBody</p>
 */
public class CreateStackResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StackId")
    private String stackId;

    private CreateStackResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.stackId = builder.stackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStackResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    public static final class Builder {
        private String requestId; 
        private String stackId; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The stack ID.
         */
        public Builder stackId(String stackId) {
            this.stackId = stackId;
            return this;
        }

        public CreateStackResponseBody build() {
            return new CreateStackResponseBody(this);
        } 

    } 

}
