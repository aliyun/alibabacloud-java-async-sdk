// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlertsRequest} extends {@link RequestModel}
 *
 * <p>ListAlertsRequest</p>
 */
public class ListAlertsRequest extends Request {
    @Query
    @NameInMap("AlertName")
    private String alertName;

    @Query
    @NameInMap("DispatchRuleId")
    private Long dispatchRuleId;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("IntegrationType")
    private String integrationType;

    @Query
    @NameInMap("Page")
    @Validation(required = true)
    private Long page;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Severity")
    private String severity;

    @Query
    @NameInMap("ShowActivities")
    private Boolean showActivities;

    @Query
    @NameInMap("ShowEvents")
    private Boolean showEvents;

    @Query
    @NameInMap("Size")
    @Validation(required = true)
    private Long size;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("State")
    private Long state;

    private ListAlertsRequest(Builder builder) {
        super(builder);
        this.alertName = builder.alertName;
        this.dispatchRuleId = builder.dispatchRuleId;
        this.endTime = builder.endTime;
        this.integrationType = builder.integrationType;
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
         * The name of the alert rule.
         */
        public Builder alertName(String alertName) {
            this.putQueryParameter("AlertName", alertName);
            this.alertName = alertName;
            return this;
        }

        /**
         * The ID of the notification policy.
         */
        public Builder dispatchRuleId(Long dispatchRuleId) {
            this.putQueryParameter("DispatchRuleId", dispatchRuleId);
            this.dispatchRuleId = dispatchRuleId;
            return this;
        }

        /**
         * The end time of the alert sending history that you want to query. Specify the time in the `YYYY-MM-DD HH:mm:ss` format.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The integration type.
         * <p>
         * 
         * *   ARMS
         * *   CLOUD_MONITOR
         * *   MSE
         * *   ARMS_CLOUD_DIALTEST
         * *   PROMETHEUS
         * *   LOG_SERVICE
         * *   CUSTOM
         * *   ARMS_PROMETHEUS
         * *   ARMS_APP_MON
         * *   ARMS_FRONT_MON
         * *   ARMS_CUSTOM
         * *   XTRACE
         * *   GRAFANA
         * *   ZABBIX
         * *   SKYWALKING
         * *   EVENT_BRIDGE
         * *   NAGIOS
         * *   OPENFALCON
         * *   ARMS_INSIGHTS
         */
        public Builder integrationType(String integrationType) {
            this.putQueryParameter("IntegrationType", integrationType);
            this.integrationType = integrationType;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder page(Long page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The severity level of the alert. Valid values: P6, P5, P4, P3, P2, and P1. The preceding values are listed in ascending order of severity.
         */
        public Builder severity(String severity) {
            this.putQueryParameter("Severity", severity);
            this.severity = severity;
            return this;
        }

        /**
         * Specifies whether to query the activities that correspond to alerts. Valid values:
         * <p>
         * 
         * *   `false` (default value): The activities are not queried.
         * *   `true`: The activities in the last three days are queried.
         */
        public Builder showActivities(Boolean showActivities) {
            this.putQueryParameter("ShowActivities", showActivities);
            this.showActivities = showActivities;
            return this;
        }

        /**
         * Specifies whether to query the events that correspond to alerts. Valid values:
         * <p>
         * 
         * *   `false` (default value): The events are not queried.
         * *   `true`: The events are queried.
         */
        public Builder showEvents(Boolean showEvents) {
            this.putQueryParameter("ShowEvents", showEvents);
            this.showEvents = showEvents;
            return this;
        }

        /**
         * The number of alerts to return on each page.
         */
        public Builder size(Long size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * The start time of the alert sending history that you want to query. Specify the time in the `YYYY-MM-DD HH:mm:ss` format.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The status of the alert. Valid values:
         * <p>
         * 
         * *   0: The alert is pending.
         * *   1: The alert is being handled.
         * *   2: The alert is handled.
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
