// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteQuotaAlarmRequest} extends {@link RequestModel}
 *
 * <p>DeleteQuotaAlarmRequest</p>
 */
public class DeleteQuotaAlarmRequest extends Request {
    @Body
    @NameInMap("AlarmId")
    @Validation(required = true)
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

        private Builder(DeleteQuotaAlarmRequest response) {
            super(response);
            this.alarmId = response.alarmId;
        } 

        /**
         * AlarmId.
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
