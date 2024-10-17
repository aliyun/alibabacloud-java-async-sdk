// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAlertsRequest} extends {@link RequestModel}
 *
 * <p>ListAlertsRequest</p>
 */
public class ListAlertsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertName")
    private String alertName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DispatchRuleId")
    private Long dispatchRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntegrationType")
    private String integrationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Severity")
    private String severity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowActivities")
    private Boolean showActivities;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowEvents")
    private Boolean showEvents;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Size")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private Long state;

    private ListAlertsRequest(Builder builder) {
        super(builder);
        this.alertName = builder.alertName;
        this.dispatchRuleId = builder.dispatchRuleId;
        this.endTime = builder.endTime;
        this.integrationType = builder.integrationType;
        this.owner = builder.owner;
        this.page = builder.page;
        this.regionId = builder.regionId;
        this.severity = builder.severity;
        this.showActivities = builder.showActivities;
        this.showEvents = builder.showEvents;
        this.size = builder.size;
        this.startTime = builder.startTime;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlertsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertName
     */
    public String getAlertName() {
        return this.alertName;
    }

    /**
     * @return dispatchRuleId
     */
    public Long getDispatchRuleId() {
        return this.dispatchRuleId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return integrationType
     */
    public String getIntegrationType() {
        return this.integrationType;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
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

    /**
     * @return showActivities
     */
    public Boolean getShowActivities() {
        return this.showActivities;
    }

    /**
     * @return showEvents
     */
    public Boolean getShowEvents() {
        return this.showEvents;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return state
     */
    public Long getState() {
        return this.state;
    }

    public static final class Builder extends Request.Builder<ListAlertsRequest, Builder> {
        private String alertName; 
        private Long dispatchRuleId; 
        private String endTime; 
        private String integrationType; 
        private String owner; 
        private Long page; 
        private String regionId; 
        private String severity; 
        private Boolean showActivities; 
        private Boolean showEvents; 
        private Long size; 
        private String startTime; 
        private Long state; 

        private Builder() {
            super();
        } 

        private Builder(ListAlertsRequest request) {
            super(request);
            this.alertName = request.alertName;
            this.dispatchRuleId = request.dispatchRuleId;
            this.endTime = request.endTime;
            this.integrationType = request.integrationType;
            this.owner = request.owner;
            this.page = request.page;
            this.regionId = request.regionId;
            this.severity = request.severity;
            this.showActivities = request.showActivities;
            this.showEvents = request.showEvents;
            this.size = request.size;
            this.startTime = request.startTime;
            this.state = request.state;
        } 

        /**
         * <p>The name of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Test alert</p>
         */
        public Builder alertName(String alertName) {
            this.putQueryParameter("AlertName", alertName);
            this.alertName = alertName;
            return this;
        }

        /**
         * <p>The ID of the notification policy.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder dispatchRuleId(Long dispatchRuleId) {
            this.putQueryParameter("DispatchRuleId", dispatchRuleId);
            this.dispatchRuleId = dispatchRuleId;
            return this;
        }

        /**
         * <p>The end time of the alert sending history that you want to query. Specify the time in the <code>YYYY-MM-DD HH:mm:ss</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-22 23:59:59</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The integration type.</p>
         * <ul>
         * <li>ARMS</li>
         * <li>CLOUD_MONITOR</li>
         * <li>MSE</li>
         * <li>ARMS_CLOUD_DIALTEST</li>
         * <li>PROMETHEUS</li>
         * <li>LOG_SERVICE</li>
         * <li>CUSTOM</li>
         * <li>ARMS_PROMETHEUS</li>
         * <li>ARMS_APP_MON</li>
         * <li>ARMS_FRONT_MON</li>
         * <li>ARMS_CUSTOM</li>
         * <li>XTRACE</li>
         * <li>GRAFANA</li>
         * <li>ZABBIX</li>
         * <li>SKYWALKING</li>
         * <li>EVENT_BRIDGE</li>
         * <li>NAGIOS</li>
         * <li>OPENFALCON</li>
         * <li>ARMS_INSIGHTS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ARMS_APP_MON</p>
         */
        public Builder integrationType(String integrationType) {
            this.putQueryParameter("IntegrationType", integrationType);
            this.integrationType = integrationType;
            return this;
        }

        /**
         * Owner.
         */
        public Builder owner(String owner) {
            this.putQueryParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The severity level of the alert. Valid values: P6, P5, P4, P3, P2, and P1. The preceding values are listed in ascending order of severity.</p>
         * 
         * <strong>example:</strong>
         * <p>P6</p>
         */
        public Builder severity(String severity) {
            this.putQueryParameter("Severity", severity);
            this.severity = severity;
            return this;
        }

        /**
         * <p>Specifies whether to query the activities that correspond to alerts. Valid values:</p>
         * <ul>
         * <li><code>false</code> (default value): The activities are not queried.</li>
         * <li><code>true</code>: The activities in the last three days are queried.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder showActivities(Boolean showActivities) {
            this.putQueryParameter("ShowActivities", showActivities);
            this.showActivities = showActivities;
            return this;
        }

        /**
         * <p>Specifies whether to query the events that correspond to alerts. Valid values:</p>
         * <ul>
         * <li><code>false</code> (default value): The events are not queried.</li>
         * <li><code>true</code>: The events are queried.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder showEvents(Boolean showEvents) {
            this.putQueryParameter("ShowEvents", showEvents);
            this.showEvents = showEvents;
            return this;
        }

        /**
         * <p>The number of alerts to return on each page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder size(Long size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * <p>The start time of the alert sending history that you want to query. Specify the time in the <code>YYYY-MM-DD HH:mm:ss</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-10 00:00:00</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The status of the alert. Valid values:</p>
         * <ul>
         * <li>0: The alert is pending.</li>
         * <li>1: The alert is being handled.</li>
         * <li>2: The alert is handled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder state(Long state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        @Override
        public ListAlertsRequest build() {
            return new ListAlertsRequest(this);
        } 

    } 

}
