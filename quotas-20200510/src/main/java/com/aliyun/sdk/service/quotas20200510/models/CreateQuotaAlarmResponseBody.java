// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

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
 * {@link CreateQuotaAlarmResponseBody} extends {@link TeaModel}
 *
 * <p>CreateQuotaAlarmResponseBody</p>
 */
public class CreateQuotaAlarmResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlarmId")
    private String alarmId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateQuotaAlarmResponseBody model) {
            this.alarmId = model.alarmId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The alert ID.</p>
         * 
         * <strong>example:</strong>
         * <p>18b3be23-b7b0-4d45-91bc-d0c331aa****</p>
         */
        public Builder alarmId(String alarmId) {
            this.alarmId = alarmId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BD219E2B-E687-45EE-B5F3-61FB730551B1</p>
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
