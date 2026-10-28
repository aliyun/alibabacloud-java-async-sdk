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
         * <p>The ID of the quota alert.</p>
         * <blockquote>
         * <p>For more information about how to obtain the ID of a quota alert, see <a href="https://help.aliyun.com/document_detail/440561.html">ListQuotaAlarms</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6b512ab7-da3a-4142-b529-2b2a9294****</p>
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
