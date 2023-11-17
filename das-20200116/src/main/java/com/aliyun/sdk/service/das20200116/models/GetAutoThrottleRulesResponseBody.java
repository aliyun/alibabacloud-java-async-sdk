// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAutoThrottleRulesResponseBody} extends {@link TeaModel}
 *
 * <p>GetAutoThrottleRulesResponseBody</p>
 */
public class GetAutoThrottleRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetAutoThrottleRulesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAutoThrottleRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code returned.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * >  If the request was successful, **Successful** is returned. If the request failed, an error message that contains information such as an error code is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAutoThrottleRulesResponseBody build() {
            return new GetAutoThrottleRulesResponseBody(this);
        } 

    } 

    public static class EnableAutoThrottleList extends TeaModel {
        @NameInMap("AbnormalDuration")
        private Double abnormalDuration;

        @NameInMap("ActiveSessions")
        private Long activeSessions;

        @NameInMap("AllowThrottleEndTime")
        private String allowThrottleEndTime;

        @NameInMap("AllowThrottleStartTime")
        private String allowThrottleStartTime;

        @NameInMap("AutoKillSession")
        private Boolean autoKillSession;

        @NameInMap("CpuSessionRelation")
        private String cpuSessionRelation;

        @NameInMap("CpuUsage")
        private Double cpuUsage;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("MaxThrottleTime")
        private Double maxThrottleTime;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("Visible")
        private Boolean visible;

        private EnableAutoThrottleList(Builder builder) {
            this.abnormalDuration = builder.abnormalDuration;
            this.activeSessions = builder.activeSessions;
            this.allowThrottleEndTime = builder.allowThrottleEndTime;
            this.allowThrottleStartTime = builder.allowThrottleStartTime;
            this.autoKillSession = builder.autoKillSession;
            this.cpuSessionRelation = builder.cpuSessionRelation;
            this.cpuUsage = builder.cpuUsage;
            this.instanceId = builder.instanceId;
            this.maxThrottleTime = builder.maxThrottleTime;
            this.userId = builder.userId;
            this.visible = builder.visible;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnableAutoThrottleList create() {
            return builder().build();
        }

        /**
         * @return abnormalDuration
         */
        public Double getAbnormalDuration() {
            return this.abnormalDuration;
        }

        /**
         * @return activeSessions
         */
        public Long getActiveSessions() {
            return this.activeSessions;
        }

        /**
         * @return allowThrottleEndTime
         */
        public String getAllowThrottleEndTime() {
            return this.allowThrottleEndTime;
        }

        /**
         * @return allowThrottleStartTime
         */
        public String getAllowThrottleStartTime() {
            return this.allowThrottleStartTime;
        }

        /**
         * @return autoKillSession
         */
        public Boolean getAutoKillSession() {
            return this.autoKillSession;
        }

        /**
         * @return cpuSessionRelation
         */
        public String getCpuSessionRelation() {
            return this.cpuSessionRelation;
        }

        /**
         * @return cpuUsage
         */
        public Double getCpuUsage() {
            return this.cpuUsage;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return maxThrottleTime
         */
        public Double getMaxThrottleTime() {
            return this.maxThrottleTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return visible
         */
        public Boolean getVisible() {
            return this.visible;
        }

        public static final class Builder {
            private Double abnormalDuration; 
            private Long activeSessions; 
            private String allowThrottleEndTime; 
            private String allowThrottleStartTime; 
            private Boolean autoKillSession; 
            private String cpuSessionRelation; 
            private Double cpuUsage; 
            private String instanceId; 
            private Double maxThrottleTime; 
            private String userId; 
            private Boolean visible; 

            /**
             * The maximum period of time during which an exception occurs when automatic SQL throttling is triggered. Unit: minutes.
             */
            public Builder abnormalDuration(Double abnormalDuration) {
                this.abnormalDuration = abnormalDuration;
                return this;
            }

            /**
             * The maximum number of active sessions.
             */
            public Builder activeSessions(Long activeSessions) {
                this.activeSessions = activeSessions;
                return this;
            }

            /**
             * The end time of the throttling window. The value of this parameter is in UTC.
             */
            public Builder allowThrottleEndTime(String allowThrottleEndTime) {
                this.allowThrottleEndTime = allowThrottleEndTime;
                return this;
            }

            /**
             * The start time of the throttling window. The value of this parameter is in UTC.
             */
            public Builder allowThrottleStartTime(String allowThrottleStartTime) {
                this.allowThrottleStartTime = allowThrottleStartTime;
                return this;
            }

            /**
             * Indicates whether abnormal SQL statements in execution are terminated at a time. Valid values:
             * <p>
             * 
             * > Abnormal SQL statements use the same template as the SQL statements that need to be throttled.
             * 
             * * **true**
             * * **false**
             */
            public Builder autoKillSession(Boolean autoKillSession) {
                this.autoKillSession = autoKillSession;
                return this;
            }

            /**
             * The logical relationship between the CPU utilization threshold and the maximum number of active sessions. Valid values:
             * <p>
             * 
             * * **AND**
             * * **OR**
             */
            public Builder cpuSessionRelation(String cpuSessionRelation) {
                this.cpuSessionRelation = cpuSessionRelation;
                return this;
            }

            /**
             * The CPU utilization threshold.
             */
            public Builder cpuUsage(Double cpuUsage) {
                this.cpuUsage = cpuUsage;
                return this;
            }

            /**
             * The database instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The maximum throttling duration. Unit: minutes.
             */
            public Builder maxThrottleTime(Double maxThrottleTime) {
                this.maxThrottleTime = maxThrottleTime;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that is used to create the database instance.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * Indicates whether the automatic SQL throttling feature is enabled. Valid values:
             * <p>
             * 
             * * **true**
             * * **false**
             */
            public Builder visible(Boolean visible) {
                this.visible = visible;
                return this;
            }

            public EnableAutoThrottleList build() {
                return new EnableAutoThrottleList(this);
            } 

        } 

    }
    public static class TurnOffAutoThrottleList extends TeaModel {
        @NameInMap("AbnormalDuration")
        private Double abnormalDuration;

        @NameInMap("ActiveSessions")
        private Long activeSessions;

        @NameInMap("AllowThrottleEndTime")
        private String allowThrottleEndTime;

        @NameInMap("AllowThrottleStartTime")
        private String allowThrottleStartTime;

        @NameInMap("AutoKillSession")
        private Boolean autoKillSession;

        @NameInMap("CpuSessionRelation")
        private String cpuSessionRelation;

        @NameInMap("CpuUsage")
        private Double cpuUsage;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("MaxThrottleTime")
        private Double maxThrottleTime;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("Visible")
        private Boolean visible;

        private TurnOffAutoThrottleList(Builder builder) {
            this.abnormalDuration = builder.abnormalDuration;
            this.activeSessions = builder.activeSessions;
            this.allowThrottleEndTime = builder.allowThrottleEndTime;
            this.allowThrottleStartTime = builder.allowThrottleStartTime;
            this.autoKillSession = builder.autoKillSession;
            this.cpuSessionRelation = builder.cpuSessionRelation;
            this.cpuUsage = builder.cpuUsage;
            this.instanceId = builder.instanceId;
            this.maxThrottleTime = builder.maxThrottleTime;
            this.userId = builder.userId;
            this.visible = builder.visible;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TurnOffAutoThrottleList create() {
            return builder().build();
        }

        /**
         * @return abnormalDuration
         */
        public Double getAbnormalDuration() {
            return this.abnormalDuration;
        }

        /**
         * @return activeSessions
         */
        public Long getActiveSessions() {
            return this.activeSessions;
        }

        /**
         * @return allowThrottleEndTime
         */
        public String getAllowThrottleEndTime() {
            return this.allowThrottleEndTime;
        }

        /**
         * @return allowThrottleStartTime
         */
        public String getAllowThrottleStartTime() {
            return this.allowThrottleStartTime;
        }

        /**
         * @return autoKillSession
         */
        public Boolean getAutoKillSession() {
            return this.autoKillSession;
        }

        /**
         * @return cpuSessionRelation
         */
        public String getCpuSessionRelation() {
            return this.cpuSessionRelation;
        }

        /**
         * @return cpuUsage
         */
        public Double getCpuUsage() {
            return this.cpuUsage;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return maxThrottleTime
         */
        public Double getMaxThrottleTime() {
            return this.maxThrottleTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return visible
         */
        public Boolean getVisible() {
            return this.visible;
        }

        public static final class Builder {
            private Double abnormalDuration; 
            private Long activeSessions; 
            private String allowThrottleEndTime; 
            private String allowThrottleStartTime; 
            private Boolean autoKillSession; 
            private String cpuSessionRelation; 
            private Double cpuUsage; 
            private String instanceId; 
            private Double maxThrottleTime; 
            private String userId; 
            private Boolean visible; 

            /**
             * The maximum period of time during which the automatic SQL throttling feature is triggered. Unit: minutes.
             */
            public Builder abnormalDuration(Double abnormalDuration) {
                this.abnormalDuration = abnormalDuration;
                return this;
            }

            /**
             * The maximum number of active sessions.
             */
            public Builder activeSessions(Long activeSessions) {
                this.activeSessions = activeSessions;
                return this;
            }

            /**
             * The end time of the throttling window. The value of this parameter is in UTC.
             */
            public Builder allowThrottleEndTime(String allowThrottleEndTime) {
                this.allowThrottleEndTime = allowThrottleEndTime;
                return this;
            }

            /**
             * The start time of the throttling window. The value of this parameter is in UTC.
             */
            public Builder allowThrottleStartTime(String allowThrottleStartTime) {
                this.allowThrottleStartTime = allowThrottleStartTime;
                return this;
            }

            /**
             * Indicates whether abnormal SQL statements in execution are terminated at a time. Valid values:
             * <p>
             * 
             * > Abnormal SQL statements use the same template as the SQL statements that need to be throttled.
             * 
             * * **true**
             * * **false**
             */
            public Builder autoKillSession(Boolean autoKillSession) {
                this.autoKillSession = autoKillSession;
                return this;
            }

            /**
             * The logical relationship between the CPU utilization threshold and the maximum number of active sessions. Valid values:
             * <p>
             * 
             * * **AND**
             * * **OR**
             */
            public Builder cpuSessionRelation(String cpuSessionRelation) {
                this.cpuSessionRelation = cpuSessionRelation;
                return this;
            }

            /**
             * The CPU utilization threshold.
             */
            public Builder cpuUsage(Double cpuUsage) {
                this.cpuUsage = cpuUsage;
                return this;
            }

            /**
             * The database instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The maximum throttling duration. Unit: minutes.
             */
            public Builder maxThrottleTime(Double maxThrottleTime) {
                this.maxThrottleTime = maxThrottleTime;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that is used to create the database instance.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * Indicates whether the automatic SQL throttling feature is enabled. Valid values:
             * <p>
             * 
             * * **true**
             * * **false**
             */
            public Builder visible(Boolean visible) {
                this.visible = visible;
                return this;
            }

            public TurnOffAutoThrottleList build() {
                return new TurnOffAutoThrottleList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("EnableAutoThrottleCount")
        private Long enableAutoThrottleCount;

        @NameInMap("EnableAutoThrottleList")
        private java.util.List < EnableAutoThrottleList> enableAutoThrottleList;

        @NameInMap("NeverEnableAutoThrottleOrReleasedInstanceCount")
        private Long neverEnableAutoThrottleOrReleasedInstanceCount;

        @NameInMap("NeverEnableAutoThrottleOrReleasedInstanceIdList")
        private java.util.List < String > neverEnableAutoThrottleOrReleasedInstanceIdList;

        @NameInMap("TotalAutoThrottleRulesCount")
        private Long totalAutoThrottleRulesCount;

        @NameInMap("TurnOffAutoThrottleCount")
        private Long turnOffAutoThrottleCount;

        @NameInMap("TurnOffAutoThrottleList")
        private java.util.List < TurnOffAutoThrottleList> turnOffAutoThrottleList;

        private Data(Builder builder) {
            this.enableAutoThrottleCount = builder.enableAutoThrottleCount;
            this.enableAutoThrottleList = builder.enableAutoThrottleList;
            this.neverEnableAutoThrottleOrReleasedInstanceCount = builder.neverEnableAutoThrottleOrReleasedInstanceCount;
            this.neverEnableAutoThrottleOrReleasedInstanceIdList = builder.neverEnableAutoThrottleOrReleasedInstanceIdList;
            this.totalAutoThrottleRulesCount = builder.totalAutoThrottleRulesCount;
            this.turnOffAutoThrottleCount = builder.turnOffAutoThrottleCount;
            this.turnOffAutoThrottleList = builder.turnOffAutoThrottleList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return enableAutoThrottleCount
         */
        public Long getEnableAutoThrottleCount() {
            return this.enableAutoThrottleCount;
        }

        /**
         * @return enableAutoThrottleList
         */
        public java.util.List < EnableAutoThrottleList> getEnableAutoThrottleList() {
            return this.enableAutoThrottleList;
        }

        /**
         * @return neverEnableAutoThrottleOrReleasedInstanceCount
         */
        public Long getNeverEnableAutoThrottleOrReleasedInstanceCount() {
            return this.neverEnableAutoThrottleOrReleasedInstanceCount;
        }

        /**
         * @return neverEnableAutoThrottleOrReleasedInstanceIdList
         */
        public java.util.List < String > getNeverEnableAutoThrottleOrReleasedInstanceIdList() {
            return this.neverEnableAutoThrottleOrReleasedInstanceIdList;
        }

        /**
         * @return totalAutoThrottleRulesCount
         */
        public Long getTotalAutoThrottleRulesCount() {
            return this.totalAutoThrottleRulesCount;
        }

        /**
         * @return turnOffAutoThrottleCount
         */
        public Long getTurnOffAutoThrottleCount() {
            return this.turnOffAutoThrottleCount;
        }

        /**
         * @return turnOffAutoThrottleList
         */
        public java.util.List < TurnOffAutoThrottleList> getTurnOffAutoThrottleList() {
            return this.turnOffAutoThrottleList;
        }

        public static final class Builder {
            private Long enableAutoThrottleCount; 
            private java.util.List < EnableAutoThrottleList> enableAutoThrottleList; 
            private Long neverEnableAutoThrottleOrReleasedInstanceCount; 
            private java.util.List < String > neverEnableAutoThrottleOrReleasedInstanceIdList; 
            private Long totalAutoThrottleRulesCount; 
            private Long turnOffAutoThrottleCount; 
            private java.util.List < TurnOffAutoThrottleList> turnOffAutoThrottleList; 

            /**
             * The number of database instances for which the automatic SQL throttling feature is currently enabled.
             */
            public Builder enableAutoThrottleCount(Long enableAutoThrottleCount) {
                this.enableAutoThrottleCount = enableAutoThrottleCount;
                return this;
            }

            /**
             * The database instances for which the automatic SQL throttling feature is currently enabled.
             */
            public Builder enableAutoThrottleList(java.util.List < EnableAutoThrottleList> enableAutoThrottleList) {
                this.enableAutoThrottleList = enableAutoThrottleList;
                return this;
            }

            /**
             * The number of database instances that do not exist or for which the automatic SQL throttling feature has never been enabled.
             * <p>
             * 
             * >  If a database instance does not exist, the instance has been released or the specified instance ID is invalid.
             */
            public Builder neverEnableAutoThrottleOrReleasedInstanceCount(Long neverEnableAutoThrottleOrReleasedInstanceCount) {
                this.neverEnableAutoThrottleOrReleasedInstanceCount = neverEnableAutoThrottleOrReleasedInstanceCount;
                return this;
            }

            /**
             * The number of database instances that do not exist or for which the automatic SQL throttling feature has never been enabled.
             * <p>
             * 
             * >  If a database instance does not exist, the instance has been released or the specified instance ID is invalid.
             */
            public Builder neverEnableAutoThrottleOrReleasedInstanceIdList(java.util.List < String > neverEnableAutoThrottleOrReleasedInstanceIdList) {
                this.neverEnableAutoThrottleOrReleasedInstanceIdList = neverEnableAutoThrottleOrReleasedInstanceIdList;
                return this;
            }

            /**
             * The number of databases for which the automatic SQL throttling feature has been enabled.
             */
            public Builder totalAutoThrottleRulesCount(Long totalAutoThrottleRulesCount) {
                this.totalAutoThrottleRulesCount = totalAutoThrottleRulesCount;
                return this;
            }

            /**
             * The number of database instances for which the automatic SQL throttling feature was once enabled but is currently disabled.
             */
            public Builder turnOffAutoThrottleCount(Long turnOffAutoThrottleCount) {
                this.turnOffAutoThrottleCount = turnOffAutoThrottleCount;
                return this;
            }

            /**
             * The database instances for which the automatic SQL throttling feature was once enabled but is currently disabled.
             */
            public Builder turnOffAutoThrottleList(java.util.List < TurnOffAutoThrottleList> turnOffAutoThrottleList) {
                this.turnOffAutoThrottleList = turnOffAutoThrottleList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
