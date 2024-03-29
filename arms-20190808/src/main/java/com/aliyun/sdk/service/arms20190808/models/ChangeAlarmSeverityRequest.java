// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeAlarmSeverityRequest} extends {@link RequestModel}
 *
 * <p>ChangeAlarmSeverityRequest</p>
 */
public class ChangeAlarmSeverityRequest extends Request {
    @Query
    @NameInMap("AlarmId")
    @Validation(required = true)
    private Long alarmId;

    @Query
    @NameInMap("HandlerId")
    private Long handlerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Severity")
    @Validation(required = true)
    private String severity;

    private ChangeAlarmSeverityRequest(Builder builder) {
        super(builder);
        this.alarmId = builder.alarmId;
        this.handlerId = builder.handlerId;
        this.regionId = builder.regionId;
        this.severity = builder.severity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeAlarmSeverityRequest create() {
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

    /**
     * @return severity
     */
    public String getSeverity() {
        return this.severity;
    }

    public static final class Builder extends Request.Builder<ChangeAlarmSeverityRequest, Builder> {
        private Long alarmId; 
        private Long handlerId; 
        private String regionId; 
        private String severity; 

        private Builder() {
            super();
        } 

        private Builder(ChangeAlarmSeverityRequest request) {
            super(request);
            this.alarmId = request.alarmId;
            this.handlerId = request.handlerId;
            this.regionId = request.regionId;
            this.severity = request.severity;
        } 

        /**
         * AlarmId.
         */
        public Builder alarmId(Long alarmId) {
            this.putQueryParameter("AlarmId", alarmId);
            this.alarmId = alarmId;
            return this;
        }

        /**
         * HandlerId.
         */
        public Builder handlerId(Long handlerId) {
            this.putQueryParameter("HandlerId", handlerId);
            this.handlerId = handlerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Severity.
         */
        public Builder severity(String severity) {
            this.putQueryParameter("Severity", severity);
            this.severity = severity;
            return this;
        }

        @Override
        public ChangeAlarmSeverityRequest build() {
            return new ChangeAlarmSeverityRequest(this);
        } 

    } 

}
