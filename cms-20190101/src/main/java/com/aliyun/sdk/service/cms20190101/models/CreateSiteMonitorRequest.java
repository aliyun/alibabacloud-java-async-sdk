// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSiteMonitorRequest} extends {@link RequestModel}
 *
 * <p>CreateSiteMonitorRequest</p>
 */
public class CreateSiteMonitorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Address")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.NameInMap("IspCities")
    private String ispCities;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OptionsJson")
    private String optionsJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcConfig")
    private String vpcConfig;

    private CreateSiteMonitorRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.alertIds = builder.alertIds;
        this.customSchedule = builder.customSchedule;
        this.interval = builder.interval;
        this.ispCities = builder.ispCities;
        this.optionsJson = builder.optionsJson;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
        this.vpcConfig = builder.vpcConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSiteMonitorRequest create() {
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
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return vpcConfig
     */
    public String getVpcConfig() {
        return this.vpcConfig;
    }

    public static final class Builder extends Request.Builder<CreateSiteMonitorRequest, Builder> {
        private String address; 
        private String alertIds; 
        private String customSchedule; 
        private String interval; 
        private String ispCities; 
        private String optionsJson; 
        private String taskName; 
        private String taskType; 
        private String vpcConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreateSiteMonitorRequest request) {
            super(request);
            this.address = request.address;
            this.alertIds = request.alertIds;
            this.customSchedule = request.customSchedule;
            this.interval = request.interval;
            this.ispCities = request.ispCities;
            this.optionsJson = request.optionsJson;
            this.taskName = request.taskName;
            this.taskType = request.taskType;
            this.vpcConfig = request.vpcConfig;
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
         * The ID of the alert rule.
         * <p>
         * 
         * For more information about how to obtain the ID of an alert rule, see [DescribeMetricRuleList](~~114941~~).
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
         * The interval at which detection requests are sent.
         * <p>
         * 
         * Valid values: 1, 5, 15, 30, and 60. Unit: minutes.
         * 
         * Default value: 1.
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * The information of the detection points. If you leave this parameter empty, the system randomly selects three detection points.
         * <p>
         * 
         * The value is a JSON array. Example: `[{"city":"546","isp":"465"},{"city":"572","isp":"465"},{"city":"738","isp":"465"}]`. The values of the city field indicate Beijing, Hangzhou, and Qingdao.
         * 
         * For information about how to obtain detection points, see [DescribeSiteMonitorISPCityList](~~115045~~).
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
         * The name of the site monitoring task.
         * <p>
         * 
         * The name must be 4 to 100 characters in length, and can contain letters, digits, and underscores (\_).
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * The type of the site monitoring task.
         * <p>
         * 
         * Valid values: HTTP, HTTPS, PING, TCP, UDP, DNS, SMTP, POP3, and FTP.
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * VpcConfig.
         */
        public Builder vpcConfig(String vpcConfig) {
            this.putQueryParameter("VpcConfig", vpcConfig);
            this.vpcConfig = vpcConfig;
            return this;
        }

        @Override
        public CreateSiteMonitorRequest build() {
            return new CreateSiteMonitorRequest(this);
        } 

    } 

}
