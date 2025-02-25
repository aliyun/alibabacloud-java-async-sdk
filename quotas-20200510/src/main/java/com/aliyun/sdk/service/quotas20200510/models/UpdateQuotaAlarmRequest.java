// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateQuotaAlarmRequest} extends {@link RequestModel}
 *
 * <p>UpdateQuotaAlarmRequest</p>
 */
public class UpdateQuotaAlarmRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlarmId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alarmId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlarmName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alarmName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Threshold")
    private Float threshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ThresholdPercent")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 50)
    private Float thresholdPercent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ThresholdType")
    private String thresholdType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WebHook")
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

        /**
         * The name of the quota alert.
         * <p>
         * 
         * >  You can call the [ListQuotaAlarms](~~440561~~) operation to obtain the name of a quota alert.
         */
        public Builder alarmName(String alarmName) {
            this.putBodyParameter("AlarmName", alarmName);
            this.alarmName = alarmName;
            return this;
        }

        /**
         * The numeric value of the alert threshold. Valid values:
         * <p>
         * 
         * *   If you set the `ThresholdType` parameter to `used`, you will receive an alert notification when the used quota is greater than or equal to the preset alert threshold. The alert threshold must be greater than the current used quota.
         * *   If you set the `ThresholdType` parameter to `usable`, you will receive an alert notification when the available quota is less than or equal to the preset alert threshold. The alert threshold must be less than the current available quota.
         * 
         * > You must set one of the Threshold and ThresholdPercent parameters.
         */
        public Builder threshold(Float threshold) {
            this.putBodyParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        /**
         * The percentage of the alert threshold. Valid values:
         * <p>
         * 
         * *   If you set `ThresholdType` to `used`, you receive an alert notification when the used quota is greater than or equal to the preset percentage of the alert threshold. Value range: (50%, 100%].
         * *   If you set `ThresholdType` to `usable`, you receive an alert notification when the available quota is less than or equal to the preset percentage of the alert threshold. Value range: (0%, 50%].
         * 
         * >  You must set one of Threshold and ThresholdPercent.
         */
        public Builder thresholdPercent(Float thresholdPercent) {
            this.putBodyParameter("ThresholdPercent", thresholdPercent);
            this.thresholdPercent = thresholdPercent;
            return this;
        }

        /**
         * The type of the quota alert. Valid values:
         * <p>
         * 
         * *   used (default): The alert is created for the used quota.
         * *   usable: The alert is created for the available quota.
         */
        public Builder thresholdType(String thresholdType) {
            this.putBodyParameter("ThresholdType", thresholdType);
            this.thresholdType = thresholdType;
            return this;
        }

        /**
         * The webhook URL. Quota Center sends alert notifications to the specified URL by using HTTP POST requests.
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
