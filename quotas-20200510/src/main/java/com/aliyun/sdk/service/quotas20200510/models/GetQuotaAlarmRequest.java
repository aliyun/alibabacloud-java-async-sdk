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

        private Builder(GetQuotaAlarmRequest request) {
            super(request);
            this.alarmId = request.alarmId;
        } 

        /**
         * The ID of the quota alert.
         * <p>
         * 
         * For more information about how to query the ID of a quota alert, see [ListQuotaAlarms](~~184348~~).
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
