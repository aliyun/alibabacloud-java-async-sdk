// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
 * {@link DeleteAlarmResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteAlarmResponseBody</p>
 */
public class DeleteAlarmResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlarmTaskId")
    private String alarmTaskId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DeleteAlarmResponseBody model) {
            this.alarmTaskId = model.alarmTaskId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the event-triggered task.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp1hvbnmkl10vll5****_f95ce797-dc2e-4bad-9618-14fee7d1****</p>
         */
        public Builder alarmTaskId(String alarmTaskId) {
            this.alarmTaskId = alarmTaskId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6EF9BFEE-FE07-4627-B8FB-14326FB9****</p>
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
