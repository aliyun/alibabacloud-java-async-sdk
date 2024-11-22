// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateWaitingRoomRuleResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateWaitingRoomRuleResponseBody</p>
 */
public class UpdateWaitingRoomRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateWaitingRoomRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWaitingRoomRuleResponseBody create() {
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
         * <p>The request ID, which is used to trace a call.</p>
         * 
         * <strong>example:</strong>
         * <p>9bfe9d95-7bf6-469d-a628-ed7bc9f25073</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateWaitingRoomRuleResponseBody build() {
            return new UpdateWaitingRoomRuleResponseBody(this);
        } 

    } 

}
