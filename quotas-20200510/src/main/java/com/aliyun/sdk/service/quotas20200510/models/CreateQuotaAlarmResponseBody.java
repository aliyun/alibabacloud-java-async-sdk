// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateQuotaAlarmResponseBody} extends {@link TeaModel}
 *
 * <p>CreateQuotaAlarmResponseBody</p>
 */
public class CreateQuotaAlarmResponseBody extends TeaModel {
    @NameInMap("AlarmId")
    private String alarmId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateQuotaAlarmResponseBody(Builder builder) {
        this.alarmId = builder.alarmId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateQuotaAlarmResponseBody create() {
        return builder().build();
    }

    /**
     * @return alarmId
     */
    public String getAlarmId() {
        return this.alarmId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String alarmId; 
        private String requestId; 

        /**
         * The ID of the alert.
         */
        public Builder alarmId(String alarmId) {
            this.alarmId = alarmId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateQuotaAlarmResponseBody build() {
            return new CreateQuotaAlarmResponseBody(this);
        } 

    } 

}
