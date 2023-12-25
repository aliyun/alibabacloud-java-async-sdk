// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAlarmResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteAlarmResponseBody</p>
 */
public class DeleteAlarmResponseBody extends TeaModel {
    @NameInMap("AlarmTaskId")
    private String alarmTaskId;

    @NameInMap("RequestId")
    private String requestId;

    private DeleteAlarmResponseBody(Builder builder) {
        this.alarmTaskId = builder.alarmTaskId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAlarmResponseBody create() {
        return builder().build();
    }

    /**
     * @return alarmTaskId
     */
    public String getAlarmTaskId() {
        return this.alarmTaskId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String alarmTaskId; 
        private String requestId; 

        /**
         * The ID of the event-triggered task.
         */
        public Builder alarmTaskId(String alarmTaskId) {
            this.alarmTaskId = alarmTaskId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteAlarmResponseBody build() {
            return new DeleteAlarmResponseBody(this);
        } 

    } 

}
