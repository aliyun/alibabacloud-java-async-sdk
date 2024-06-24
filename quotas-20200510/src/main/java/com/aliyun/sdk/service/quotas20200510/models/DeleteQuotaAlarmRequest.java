// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteQuotaAlarmRequest} extends {@link RequestModel}
 *
 * <p>DeleteQuotaAlarmRequest</p>
 */
public class DeleteQuotaAlarmRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlarmId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alarmId;

    private DeleteQuotaAlarmRequest(Builder builder) {
        super(builder);
        this.alarmId = builder.alarmId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteQuotaAlarmRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteQuotaAlarmRequest, Builder> {
        private String alarmId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteQuotaAlarmRequest request) {
            super(request);
            this.alarmId = request.alarmId;
        } 

        /**
         * The ID of the quota alert.
         * <p>
         * 
         * >  You can call the [ListQuotaAlarms](~~440561~~) operation to obtain the ID of a quota alert.
         */
        public Builder alarmId(String alarmId) {
            this.putBodyParameter("AlarmId", alarmId);
            this.alarmId = alarmId;
            return this;
        }

        @Override
        public DeleteQuotaAlarmRequest build() {
            return new DeleteQuotaAlarmRequest(this);
        } 

    } 

}
