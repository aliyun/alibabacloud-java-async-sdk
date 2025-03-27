// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CreateWaitingRoomRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWaitingRoomRuleResponseBody</p>
 */
public class CreateWaitingRoomRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WaitingRoomRuleId")
    private Long waitingRoomRuleId;

    private CreateWaitingRoomRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.waitingRoomRuleId = builder.waitingRoomRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWaitingRoomRuleResponseBody create() {
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
     * @return waitingRoomRuleId
     */
    public Long getWaitingRoomRuleId() {
        return this.waitingRoomRuleId;
    }

    public static final class Builder {
        private String requestId; 
        private Long waitingRoomRuleId; 

        private Builder() {
        } 

        private Builder(CreateWaitingRoomRuleResponseBody model) {
            this.requestId = model.requestId;
            this.waitingRoomRuleId = model.waitingRoomRuleId;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EEEBE525-F576-1196-8DAF-2D70CA3F4D2F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Waiting room bypass rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>420072638347264</p>
         */
        public Builder waitingRoomRuleId(Long waitingRoomRuleId) {
            this.waitingRoomRuleId = waitingRoomRuleId;
            return this;
        }

        public CreateWaitingRoomRuleResponseBody build() {
            return new CreateWaitingRoomRuleResponseBody(this);
        } 

    } 

}
