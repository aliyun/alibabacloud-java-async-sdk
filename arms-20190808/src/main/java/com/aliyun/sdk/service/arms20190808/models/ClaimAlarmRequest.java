// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link ClaimAlarmRequest} extends {@link RequestModel}
 *
 * <p>ClaimAlarmRequest</p>
 */
public class ClaimAlarmRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlarmId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long alarmId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HandlerId")
    private Long handlerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ClaimAlarmRequest(Builder builder) {
        super(builder);
        this.alarmId = builder.alarmId;
        this.handlerId = builder.handlerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClaimAlarmRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmId
     */
    public Long getAlarmId() {
        return this.alarmId;
    }

    /**
     * @return handlerId
     */
    public Long getHandlerId() {
        return this.handlerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ClaimAlarmRequest, Builder> {
        private Long alarmId; 
        private Long handlerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ClaimAlarmRequest request) {
            super(request);
            this.alarmId = request.alarmId;
            this.handlerId = request.handlerId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the alert.</p>
         * <p>For more information about how to obtain the ID of an alert, see <a href="https://help.aliyun.com/document_detail/2612346.html">ListAlertEvents</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder alarmId(Long alarmId) {
            this.putQueryParameter("AlarmId", alarmId);
            this.alarmId = alarmId;
            return this;
        }

        /**
         * <p>The ID of the handler.</p>
         * 
         * <strong>example:</strong>
         * <p>2046076</p>
         */
        public Builder handlerId(Long handlerId) {
            this.putQueryParameter("HandlerId", handlerId);
            this.handlerId = handlerId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ClaimAlarmRequest build() {
            return new ClaimAlarmRequest(this);
        } 

    } 

}
