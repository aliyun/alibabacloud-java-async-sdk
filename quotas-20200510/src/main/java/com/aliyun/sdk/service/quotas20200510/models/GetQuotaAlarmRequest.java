// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQuotaAlarmRequest} extends {@link RequestModel}
 *
 * <p>GetQuotaAlarmRequest</p>
 */
public class GetQuotaAlarmRequest extends Request {
    @Body
    @NameInMap("AlarmId")
    private String alarmId;

    private GetQuotaAlarmRequest(Builder builder) {
        super(builder);
        this.alarmId = builder.alarmId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQuotaAlarmRequest create() {
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

    public static final class Builder extends Request.Builder<GetQuotaAlarmRequest, Builder> {
        private String alarmId; 

        private Builder() {
            super();
        } 

        private Builder(GetQuotaAlarmRequest response) {
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
        public GetQuotaAlarmRequest build() {
            return new GetQuotaAlarmRequest(this);
        } 

    } 

}
