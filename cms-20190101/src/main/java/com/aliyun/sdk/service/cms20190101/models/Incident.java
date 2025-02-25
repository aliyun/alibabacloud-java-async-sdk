// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Incident} extends {@link TeaModel}
 *
 * <p>Incident</p>
 */
public class Incident extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActionTime")
    private Long actionTime;

    @com.aliyun.core.annotation.NameInMap("AlertCount")
    private Long alertCount;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("GroupingData")
    private java.util.Map < String, ? > groupingData;

    @com.aliyun.core.annotation.NameInMap("GroupingId")
    private String groupingId;

    @com.aliyun.core.annotation.NameInMap("GroupingKey")
    private String groupingKey;

    @com.aliyun.core.annotation.NameInMap("IncidentId")
    private String incidentId;

    @com.aliyun.core.annotation.NameInMap("IncidentStatus")
    private String incidentStatus;

    @com.aliyun.core.annotation.NameInMap("Severity")
    private String severity;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.NameInMap("StrategyUuid")
    private String strategyUuid;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private Incident(Builder builder) {
        this.actionTime = builder.actionTime;
        this.alertCount = builder.alertCount;
        this.endTime = builder.endTime;
        this.groupingData = builder.groupingData;
        this.groupingId = builder.groupingId;
        this.groupingKey = builder.groupingKey;
        this.incidentId = builder.incidentId;
        this.incidentStatus = builder.incidentStatus;
        this.severity = builder.severity;
        this.startTime = builder.startTime;
        this.strategyUuid = builder.strategyUuid;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Incident create() {
        return builder().build();
    }

    /**
     * @return actionTime
     */
    public Long getActionTime() {
        return this.actionTime;
    }

    /**
     * @return alertCount
     */
    public Long getAlertCount() {
        return this.alertCount;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return groupingData
     */
    public java.util.Map < String, ? > getGroupingData() {
        return this.groupingData;
    }

    /**
     * @return groupingId
     */
    public String getGroupingId() {
        return this.groupingId;
    }

    /**
     * @return groupingKey
     */
    public String getGroupingKey() {
        return this.groupingKey;
    }

    /**
     * @return incidentId
     */
    public String getIncidentId() {
        return this.incidentId;
    }

    /**
     * @return incidentStatus
     */
    public String getIncidentStatus() {
        return this.incidentStatus;
    }

    /**
     * @return severity
     */
    public String getSeverity() {
        return this.severity;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return strategyUuid
     */
    public String getStrategyUuid() {
        return this.strategyUuid;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private Long actionTime; 
        private Long alertCount; 
        private Long endTime; 
        private java.util.Map < String, ? > groupingData; 
        private String groupingId; 
        private String groupingKey; 
        private String incidentId; 
        private String incidentStatus; 
        private String severity; 
        private Long startTime; 
        private String strategyUuid; 
        private String userId; 

        /**
         * ActionTime.
         */
        public Builder actionTime(Long actionTime) {
            this.actionTime = actionTime;
            return this;
        }

        /**
         * AlertCount.
         */
        public Builder alertCount(Long alertCount) {
            this.alertCount = alertCount;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * GroupingData.
         */
        public Builder groupingData(java.util.Map < String, ? > groupingData) {
            this.groupingData = groupingData;
            return this;
        }

        /**
         * GroupingId.
         */
        public Builder groupingId(String groupingId) {
            this.groupingId = groupingId;
            return this;
        }

        /**
         * GroupingKey.
         */
        public Builder groupingKey(String groupingKey) {
            this.groupingKey = groupingKey;
            return this;
        }

        /**
         * IncidentId.
         */
        public Builder incidentId(String incidentId) {
            this.incidentId = incidentId;
            return this;
        }

        /**
         * IncidentStatus.
         */
        public Builder incidentStatus(String incidentStatus) {
            this.incidentStatus = incidentStatus;
            return this;
        }

        /**
         * Severity.
         */
        public Builder severity(String severity) {
            this.severity = severity;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * StrategyUuid.
         */
        public Builder strategyUuid(String strategyUuid) {
            this.strategyUuid = strategyUuid;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Incident build() {
            return new Incident(this);
        } 

    } 

}
