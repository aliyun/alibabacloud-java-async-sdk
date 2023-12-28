// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetFlowControlResponseBody} extends {@link TeaModel}
 *
 * <p>SetFlowControlResponseBody</p>
 */
public class SetFlowControlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private SetFlowControlResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetFlowControlResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetFlowControlResponseBody build() {
            return new SetFlowControlResponseBody(this);
        } 

    } 

}
