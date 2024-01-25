// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IgnoreAlarmsRequest} extends {@link RequestModel}
 *
 * <p>IgnoreAlarmsRequest</p>
 */
public class IgnoreAlarmsRequest extends Request {
    @Query
    @NameInMap("AlarmId")
    private String alarmId;

    private IgnoreAlarmsRequest(Builder builder) {
        super(builder);
        this.alarmId = builder.alarmId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IgnoreAlarmsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmId
     */
    public String getAlarmId() {
        return this.alarmId;
    }

    public static final class Builder extends Request.Builder<IgnoreAlarmsRequest, Builder> {
        private String alarmId; 

        private Builder() {
            super();
        } 

        private Builder(IgnoreAlarmsRequest request) {
            super(request);
            this.alarmId = request.alarmId;
        } 

        /**
         * AlarmId.
         */
        public Builder alarmId(String alarmId) {
            this.putQueryParameter("AlarmId", alarmId);
            this.alarmId = alarmId;
            return this;
        }

        @Override
        public IgnoreAlarmsRequest build() {
            return new IgnoreAlarmsRequest(this);
        } 

    } 

}
