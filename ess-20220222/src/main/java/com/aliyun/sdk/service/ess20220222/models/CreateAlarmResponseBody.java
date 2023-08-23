// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAlarmResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAlarmResponseBody</p>
 */
public class CreateAlarmResponseBody extends TeaModel {
    @NameInMap("AlarmTaskId")
    private String alarmTaskId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateAlarmResponseBody(Builder builder) {
        this.alarmTaskId = builder.alarmTaskId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAlarmResponseBody create() {
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
         * AlarmTaskId.
         */
        public Builder alarmTaskId(String alarmTaskId) {
            this.alarmTaskId = alarmTaskId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAlarmResponseBody build() {
            return new CreateAlarmResponseBody(this);
        } 

    } 

}
