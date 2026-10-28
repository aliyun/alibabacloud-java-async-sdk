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
 * {@link GetQuotaAlarmRequest} extends {@link RequestModel}
 *
 * <p>GetQuotaAlarmRequest</p>
 */
public class GetQuotaAlarmRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlarmId")
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
         * <p>The ID of the quota alert.</p>
         * <p>For more information about how to obtain the ID of a quota alert, see <a href="https://help.aliyun.com/document_detail/184348.html">ListQuotaAlarms</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>78d7e436-4b25-4897-84b5-d7b656bb****</p>
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
