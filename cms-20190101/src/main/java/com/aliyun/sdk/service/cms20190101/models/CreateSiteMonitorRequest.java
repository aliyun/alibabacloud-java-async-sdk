// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
    @com.aliyun.core.annotation.NameInMap("AgentGroup")
    private String agentGroup;

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
        this.agentGroup = builder.agentGroup;
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
     * @return agentGroup
     */
    public String getAgentGroup() {
        return this.agentGroup;
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
        private String agentGroup; 
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
            this.agentGroup = request.agentGroup;
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
         * <p>The URL or IP address to monitor.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * <p>The group of detection points for the network probe task. \<code>PC\\</code> indicates detection points on PCs. \<code>MOBILE\\</code> indicates detection points on mobile devices. \<code>FC\\</code> indicates detection points in a VPC. The default value is \<code>PC\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>PC</p>
         */
        public Builder agentGroup(String agentGroup) {
            this.putQueryParameter("AgentGroup", agentGroup);
            this.agentGroup = agentGroup;
            return this;
        }

        /**
         * <p>The ID of the alert rule.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>SystemDefault_acs_ecs_dashboard_InternetOutRate_Percent</p>
         */
        public Builder alertIds(String alertIds) {
            this.putQueryParameter("AlertIds", alertIds);
            this.alertIds = alertIds;
            return this;
        }

        /**
         * <p>The custom detection schedule. Specify a time period and the days of the week for detection.</p>
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
         * <p>The monitoring frequency in minutes.</p>
         * <p>Valid values: 1, 5, 15, 30, and 60.</p>
         * <p>Default: 1.</p>
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
         * <p>The detection points. If you do not specify this parameter, the system randomly selects three detection points from different Internet Service Providers (ISPs).</p>
         * <p>The value must be a JSON array. Example: <code>[{&quot;city&quot;:&quot;546&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;572&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;738&quot;,&quot;isp&quot;:&quot;465&quot;}]</code>. The values correspond to Beijing, Hangzhou, and Qingdao.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/115045.html">DescribeSiteMonitorISPCityList</a>.</p>
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
         * <p>The advanced options for the specified protocol. The available options vary based on the protocol type.</p>
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
         * <p>The name of the monitoring task.</p>
         * <p>The name must be 4 to 100 characters long and can contain letters, digits, underscores (_), and Chinese characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HanZhou_ECS1</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The type of monitoring task.</p>
         * <p>Valid protocols include HTTP(S), PING, TCP, UDP, DNS, SMTP, POP3, FTP, and WEBSOCKET.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * <p>The network information required to create a network probe task in a VPC. This must be a JSON object that contains the \<code>vpcId\\</code>, \<code>vswitchId\\</code>, \<code>securityGroupId\\</code>, and \<code>region\\</code> fields.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;vpcId&quot;: &quot;vpc-xxxxxx&quot;, &quot;vswitchId&quot;: &quot;vsw-xxxxxx&quot;, &quot;securityGroupId&quot;: &quot;sg-xxxxxx&quot;, &quot;region&quot;: &quot;cn-beijing&quot;}</p>
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
