// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySiteMonitorRequest} extends {@link RequestModel}
 *
 * <p>ModifySiteMonitorRequest</p>
 */
public class ModifySiteMonitorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Address")
    private String address;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertIds")
    private String alertIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomSchedule")
    private String customSchedule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private String interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntervalUnit")
    private String intervalUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IspCities")
    private String ispCities;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OptionsJson")
    private String optionsJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    private ModifySiteMonitorRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.alertIds = builder.alertIds;
        this.customSchedule = builder.customSchedule;
        this.interval = builder.interval;
        this.intervalUnit = builder.intervalUnit;
        this.ispCities = builder.ispCities;
        this.optionsJson = builder.optionsJson;
        this.taskId = builder.taskId;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySiteMonitorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return alertIds
     */
    public String getAlertIds() {
        return this.alertIds;
    }

    /**
     * @return customSchedule
     */
    public String getCustomSchedule() {
        return this.customSchedule;
    }

    /**
     * @return interval
     */
    public String getInterval() {
        return this.interval;
    }

    /**
     * @return intervalUnit
     */
    public String getIntervalUnit() {
        return this.intervalUnit;
    }

    /**
     * @return ispCities
     */
    public String getIspCities() {
        return this.ispCities;
    }

    /**
     * @return optionsJson
     */
    public String getOptionsJson() {
        return this.optionsJson;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<ModifySiteMonitorRequest, Builder> {
        private String address; 
        private String alertIds; 
        private String customSchedule; 
        private String interval; 
        private String intervalUnit; 
        private String ispCities; 
        private String optionsJson; 
        private String taskId; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(ModifySiteMonitorRequest request) {
            super(request);
            this.address = request.address;
            this.alertIds = request.alertIds;
            this.customSchedule = request.customSchedule;
            this.interval = request.interval;
            this.intervalUnit = request.intervalUnit;
            this.ispCities = request.ispCities;
            this.optionsJson = request.optionsJson;
            this.taskId = request.taskId;
            this.taskName = request.taskName;
        } 

        /**
         * The URL or IP address that is monitored by the task.
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * The ID of the alert rule. You can call the DescribeMetricRuleList operation to query the IDs of existing alert rules in CloudMonitor. For more information, see [DescribeMetricRuleList](~~114941~~).
         */
        public Builder alertIds(String alertIds) {
            this.putQueryParameter("AlertIds", alertIds);
            this.alertIds = alertIds;
            return this;
        }

        /**
         * The custom detection period. You can only select a time period from Monday to Sunday for detection.
         */
        public Builder customSchedule(String customSchedule) {
            this.putQueryParameter("CustomSchedule", customSchedule);
            this.customSchedule = customSchedule;
            return this;
        }

        /**
         * The interval at which detection requests are sent. Valid values: 1, 5, and 15. Unit: minutes. Default value: 1.
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * The unit of the metric.
         * <p>
         * 
         * Unit: milliseconds.
         */
        public Builder intervalUnit(String intervalUnit) {
            this.putQueryParameter("IntervalUnit", intervalUnit);
            this.intervalUnit = intervalUnit;
            return this;
        }

        /**
         * The information of the detection points. The value is a JSON array. Example: `[{"city":"546","isp":"465"},{"city":"572","isp":"465"},{"city":"738","isp":"465"}]`. The values of the `city` field indicate Beijing, Hangzhou, and Qingdao.
         * <p>
         * 
         * > You can call the DescribeSiteMonitorISPCityList operation to query the detection points. For more information, see [DescribeSiteMonitorISPCityList](~~115045~~). If you leave this parameter empty, the system randomly selects three detection points.
         */
        public Builder ispCities(String ispCities) {
            this.putQueryParameter("IspCities", ispCities);
            this.ispCities = ispCities;
            return this;
        }

        /**
         * The extended options of the protocol that is used by the site monitoring task. The options vary based on the protocol.
         */
        public Builder optionsJson(String optionsJson) {
            this.putQueryParameter("OptionsJson", optionsJson);
            this.optionsJson = optionsJson;
            return this;
        }

        /**
         * The ID of the site monitoring task.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * The name of the site monitoring task. The name must be 4 to 100 characters in length, and can contain letters, digits, and underscores (\_).
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public ModifySiteMonitorRequest build() {
            return new ModifySiteMonitorRequest(this);
        } 

    } 

}
