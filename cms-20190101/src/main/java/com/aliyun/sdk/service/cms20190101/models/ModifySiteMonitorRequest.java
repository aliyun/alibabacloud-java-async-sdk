// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The URL or IP address that is monitored by the task.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">http://www.aliyun.com</a></p>
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * <p>The ID of the alert rule. You can call the DescribeMetricRuleList operation to query the IDs of existing alert rules in CloudMonitor. For more information, see <a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>49f7c317-7645-4cc9-94fd-ea42e122****</p>
         */
        public Builder alertIds(String alertIds) {
            this.putQueryParameter("AlertIds", alertIds);
            this.alertIds = alertIds;
            return this;
        }

        /**
         * <p>The custom detection period. You can only select a time period from Monday to Sunday for detection.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;start_hour&quot;:0,&quot;end_hour&quot;:24, &quot;days&quot;:[0], &quot;time_zone&quot;:&quot;Local&quot;}</p>
         */
        public Builder customSchedule(String customSchedule) {
            this.putQueryParameter("CustomSchedule", customSchedule);
            this.customSchedule = customSchedule;
            return this;
        }

        /**
         * <p>The interval at which detection requests are sent. Valid values: 1, 5, and 15. Unit: minutes. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The unit of the metric.</p>
         * <p>Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>ms</p>
         */
        public Builder intervalUnit(String intervalUnit) {
            this.putQueryParameter("IntervalUnit", intervalUnit);
            this.intervalUnit = intervalUnit;
            return this;
        }

        /**
         * <p>The information of the detection points. The value is a JSON array. Example: <code>[{&quot;city&quot;:&quot;546&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;572&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;738&quot;,&quot;isp&quot;:&quot;465&quot;}]</code>. The values of the <code>city</code> field indicate Beijing, Hangzhou, and Qingdao.</p>
         * <blockquote>
         * <p>You can call the DescribeSiteMonitorISPCityList operation to query the detection points. For more information, see <a href="https://help.aliyun.com/document_detail/115045.html">DescribeSiteMonitorISPCityList</a>. If you leave this parameter empty, the system randomly selects three detection points.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;city&quot;:&quot;546&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;572&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;738&quot;,&quot;isp&quot;:&quot;465&quot;}]</p>
         */
        public Builder ispCities(String ispCities) {
            this.putQueryParameter("IspCities", ispCities);
            this.ispCities = ispCities;
            return this;
        }

        /**
         * <p>The extended options of the protocol that is used by the site monitoring task. The options vary based on the protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;time_out&quot;:5000}</p>
         */
        public Builder optionsJson(String optionsJson) {
            this.putQueryParameter("OptionsJson", optionsJson);
            this.optionsJson = optionsJson;
            return this;
        }

        /**
         * <p>The ID of the site monitoring task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2c8dbdf9-a3ab-46a1-85a4-f094965e****</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The name of the site monitoring task. The name must be 4 to 100 characters in length, and can contain letters, digits, and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>HanZhou_ECS2</p>
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
