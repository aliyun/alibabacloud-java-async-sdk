// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetResellerUserAlarmThresholdRequest} extends {@link RequestModel}
 *
 * <p>SetResellerUserAlarmThresholdRequest</p>
 */
public class SetResellerUserAlarmThresholdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlarmThresholds")
    private String alarmThresholds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlarmType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alarmType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ownerId;

    private SetResellerUserAlarmThresholdRequest(Builder builder) {
        super(builder);
        this.alarmThresholds = builder.alarmThresholds;
        this.alarmType = builder.alarmType;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetResellerUserAlarmThresholdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmThresholds
     */
    public String getAlarmThresholds() {
        return this.alarmThresholds;
    }

    /**
     * @return alarmType
     */
    public String getAlarmType() {
        return this.alarmType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<SetResellerUserAlarmThresholdRequest, Builder> {
        private String alarmThresholds; 
        private String alarmType; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(SetResellerUserAlarmThresholdRequest request) {
            super(request);
            this.alarmThresholds = request.alarmThresholds;
            this.alarmType = request.alarmType;
            this.ownerId = request.ownerId;
        } 

        /**
         * AlarmThresholds.
         */
        public Builder alarmThresholds(String alarmThresholds) {
            this.putQueryParameter("AlarmThresholds", alarmThresholds);
            this.alarmThresholds = alarmThresholds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>quota_low_balance</p>
         */
        public Builder alarmType(String alarmType) {
            this.putQueryParameter("AlarmType", alarmType);
            this.alarmType = alarmType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public SetResellerUserAlarmThresholdRequest build() {
            return new SetResellerUserAlarmThresholdRequest(this);
        } 

    } 

}
