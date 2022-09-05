// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateQuotaAlarmRequest} extends {@link RequestModel}
 *
 * <p>UpdateQuotaAlarmRequest</p>
 */
public class UpdateQuotaAlarmRequest extends Request {
    @Body
    @NameInMap("AlarmId")
    @Validation(required = true)
    private String alarmId;

    @Body
    @NameInMap("AlarmName")
    @Validation(required = true)
    private String alarmName;

    @Body
    @NameInMap("Threshold")
    private Float threshold;

    @Body
    @NameInMap("ThresholdPercent")
    @Validation(maximum = 100, minimum = 50)
    private Float thresholdPercent;

    @Body
    @NameInMap("ThresholdType")
    private String thresholdType;

    @Body
    @NameInMap("WebHook")
    private String webHook;

    private UpdateQuotaAlarmRequest(Builder builder) {
        super(builder);
        this.alarmId = builder.alarmId;
        this.alarmName = builder.alarmName;
        this.threshold = builder.threshold;
        this.thresholdPercent = builder.thresholdPercent;
        this.thresholdType = builder.thresholdType;
        this.webHook = builder.webHook;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateQuotaAlarmRequest create() {
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

    /**
     * @return alarmName
     */
    public String getAlarmName() {
        return this.alarmName;
    }

    /**
     * @return threshold
     */
    public Float getThreshold() {
        return this.threshold;
    }

    /**
     * @return thresholdPercent
     */
    public Float getThresholdPercent() {
        return this.thresholdPercent;
    }

    /**
     * @return thresholdType
     */
    public String getThresholdType() {
        return this.thresholdType;
    }

    /**
     * @return webHook
     */
    public String getWebHook() {
        return this.webHook;
    }

    public static final class Builder extends Request.Builder<UpdateQuotaAlarmRequest, Builder> {
        private String alarmId; 
        private String alarmName; 
        private Float threshold; 
        private Float thresholdPercent; 
        private String thresholdType; 
        private String webHook; 

        private Builder() {
            super();
        } 

        private Builder(UpdateQuotaAlarmRequest request) {
            super(request);
            this.alarmId = request.alarmId;
            this.alarmName = request.alarmName;
            this.threshold = request.threshold;
            this.thresholdPercent = request.thresholdPercent;
            this.thresholdType = request.thresholdType;
            this.webHook = request.webHook;
        } 

        /**
         * AlarmId.
         */
        public Builder alarmId(String alarmId) {
            this.putBodyParameter("AlarmId", alarmId);
            this.alarmId = alarmId;
            return this;
        }

        /**
         * AlarmName.
         */
        public Builder alarmName(String alarmName) {
            this.putBodyParameter("AlarmName", alarmName);
            this.alarmName = alarmName;
            return this;
        }

        /**
         * Threshold.
         */
        public Builder threshold(Float threshold) {
            this.putBodyParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        /**
         * ThresholdPercent.
         */
        public Builder thresholdPercent(Float thresholdPercent) {
            this.putBodyParameter("ThresholdPercent", thresholdPercent);
            this.thresholdPercent = thresholdPercent;
            return this;
        }

        /**
         * ThresholdType.
         */
        public Builder thresholdType(String thresholdType) {
            this.putBodyParameter("ThresholdType", thresholdType);
            this.thresholdType = thresholdType;
            return this;
        }

        /**
         * WebHook.
         */
        public Builder webHook(String webHook) {
            this.putBodyParameter("WebHook", webHook);
            this.webHook = webHook;
            return this;
        }

        @Override
        public UpdateQuotaAlarmRequest build() {
            return new UpdateQuotaAlarmRequest(this);
        } 

    } 

}
