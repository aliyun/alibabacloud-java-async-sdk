// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ContinueCreateStackResponseBody} extends {@link TeaModel}
 *
 * <p>ContinueCreateStackResponseBody</p>
 */
public class ContinueCreateStackResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StackId")
    private String stackId;

    private ContinueCreateStackResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.stackId = builder.stackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContinueCreateStackResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StackId.
         */
        public Builder stackId(String stackId) {
            this.stackId = stackId;
            return this;
        }

        public ContinueCreateStackResponseBody build() {
            return new ContinueCreateStackResponseBody(this);
        } 

    } 

}
