// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetTriggerResponseBody model) {
            this.requestId = model.requestId;
            this.trigger = model.trigger;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4A7A2D0E-D8B8-4DA0-8127-EB32C6******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The trigger information.</p>
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
