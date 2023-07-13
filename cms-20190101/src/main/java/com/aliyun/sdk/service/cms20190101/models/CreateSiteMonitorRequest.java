// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSiteMonitorRequest} extends {@link RequestModel}
 *
 * <p>CreateSiteMonitorRequest</p>
 */
public class CreateSiteMonitorRequest extends Request {
    @Query
    @NameInMap("Address")
    @Validation(required = true)
    private String address;

    @Query
    @NameInMap("AlertIds")
    private String alertIds;

    @Query
    @NameInMap("Interval")
    private String interval;

    @Query
    @NameInMap("IspCities")
    private String ispCities;

    @Query
    @NameInMap("OptionsJson")
    private String optionsJson;

    @Query
    @NameInMap("TaskName")
    @Validation(required = true)
    private String taskName;

    @Query
    @NameInMap("TaskType")
    @Validation(required = true)
    private String taskType;

    private CreateSiteMonitorRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.alertIds = builder.alertIds;
        this.interval = builder.interval;
        this.ispCities = builder.ispCities;
        this.optionsJson = builder.optionsJson;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
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

    public static final class Builder extends Request.Builder<CreateSiteMonitorRequest, Builder> {
        private String address; 
        private String alertIds; 
        private String interval; 
        private String ispCities; 
        private String optionsJson; 
        private String taskName; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(CreateSiteMonitorRequest request) {
            super(request);
            this.address = request.address;
            this.alertIds = request.alertIds;
            this.interval = request.interval;
            this.ispCities = request.ispCities;
            this.optionsJson = request.optionsJson;
            this.taskName = request.taskName;
            this.taskType = request.taskType;
        } 

        /**
         * The name of the site monitoring task.
         * <p>
         * 
         * The name must be 4 to 100 characters in length, and can contain letters, digits, and underscores (\_).
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * Indicates whether the existing alert rule was associated with the site monitoring task. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder alertIds(String alertIds) {
            this.putQueryParameter("AlertIds", alertIds);
            this.alertIds = alertIds;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **CreateSiteMonitor**.
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
         * The returned message.
         */
        public Builder optionsJson(String optionsJson) {
            this.putQueryParameter("OptionsJson", optionsJson);
            this.optionsJson = optionsJson;
            return this;
        }

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * The ID of the alert rule.
         * <p>
         * 
         * For information about how to obtain the ID of an alert rule, see [DescribeMetricRuleList](~~114941~~).
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public CreateSiteMonitorRequest build() {
            return new CreateSiteMonitorRequest(this);
        } 

    } 

}
