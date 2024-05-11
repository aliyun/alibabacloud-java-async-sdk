// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTriggerResponseBody} extends {@link TeaModel}
 *
 * <p>GetTriggerResponseBody</p>
 */
public class GetTriggerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Trigger")
    private DataIngestion trigger;

    private GetTriggerResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.trigger = builder.trigger;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTriggerResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trigger
     */
    public DataIngestion getTrigger() {
        return this.trigger;
    }

    public static final class Builder {
        private String requestId; 
        private DataIngestion trigger; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Trigger.
         */
        public Builder trigger(DataIngestion trigger) {
            this.trigger = trigger;
            return this;
        }

        public GetTriggerResponseBody build() {
            return new GetTriggerResponseBody(this);
        } 

    } 

}
