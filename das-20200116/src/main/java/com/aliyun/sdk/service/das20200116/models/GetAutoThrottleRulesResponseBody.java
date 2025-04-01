// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link GetAutoThrottleRulesResponseBody} extends {@link TeaModel}
 *
 * <p>GetAutoThrottleRulesResponseBody</p>
 */
public class GetAutoThrottleRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetAutoThrottleRulesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message that contains information such as an error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7172BECE-588A-5961-8126-C216E16B****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAutoThrottleRulesResponseBody build() {
            return new GetAutoThrottleRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAutoThrottleRulesResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoThrottleRulesResponseBody</p>
     */
    public static class EnableAutoThrottleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AbnormalDuration")
        private Double abnormalDuration;

        @com.aliyun.core.annotation.NameInMap("ActiveSessions")
        private Long activeSessions;

        @com.aliyun.core.annotation.NameInMap("AllowThrottleEndTime")
        private String allowThrottleEndTime;

        @com.aliyun.core.annotation.NameInMap("AllowThrottleStartTime")
        private String allowThrottleStartTime;

        @com.aliyun.core.annotation.NameInMap("AutoKillSession")
        private Boolean autoKillSession;

        @com.aliyun.core.annotation.NameInMap("CpuSessionRelation")
        private String cpuSessionRelation;

        @com.aliyun.core.annotation.NameInMap("CpuUsage")
        private Double cpuUsage;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MaxThrottleTime")
        private Double maxThrottleTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("Visible")
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

            private Builder() {
            } 

            private Builder(EnableAutoThrottleList model) {
                this.abnormalDuration = model.abnormalDuration;
                this.activeSessions = model.activeSessions;
                this.allowThrottleEndTime = model.allowThrottleEndTime;
                this.allowThrottleStartTime = model.allowThrottleStartTime;
                this.autoKillSession = model.autoKillSession;
                this.cpuSessionRelation = model.cpuSessionRelation;
                this.cpuUsage = model.cpuUsage;
                this.instanceId = model.instanceId;
                this.maxThrottleTime = model.maxThrottleTime;
                this.userId = model.userId;
                this.visible = model.visible;
            } 

            /**
             * <p>The maximum period of time during which an exception occurs when automatic SQL throttling is triggered. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder abnormalDuration(Double abnormalDuration) {
                this.abnormalDuration = abnormalDuration;
                return this;
            }

            /**
             * <p>The maximum number of active sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder activeSessions(Long activeSessions) {
                this.activeSessions = activeSessions;
                return this;
            }

            /**
             * <p>The end time of the throttling window. The value of this parameter is in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>23:59Z</p>
             */
            public Builder allowThrottleEndTime(String allowThrottleEndTime) {
                this.allowThrottleEndTime = allowThrottleEndTime;
                return this;
            }

            /**
             * <p>The start time of the throttling window. The value of this parameter is in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00Z</p>
             */
            public Builder allowThrottleStartTime(String allowThrottleStartTime) {
                this.allowThrottleStartTime = allowThrottleStartTime;
                return this;
            }

            /**
             * <p>Indicates whether abnormal SQL statements in execution are terminated at a time. Valid values:</p>
             * <blockquote>
             * <p>Abnormal SQL statements use the same template as the SQL statements that need to be throttled.</p>
             * </blockquote>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoKillSession(Boolean autoKillSession) {
                this.autoKillSession = autoKillSession;
                return this;
            }

            /**
             * <p>The logical relationship between the CPU utilization threshold and the maximum number of active sessions. Valid values:</p>
             * <ul>
             * <li><strong>AND</strong></li>
             * <li><strong>OR</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AND</p>
             */
            public Builder cpuSessionRelation(String cpuSessionRelation) {
                this.cpuSessionRelation = cpuSessionRelation;
                return this;
            }

            /**
             * <p>The CPU utilization threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder cpuUsage(Double cpuUsage) {
                this.cpuUsage = cpuUsage;
                return this;
            }

            /**
             * <p>The database instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-2ze8g2am97624****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The maximum throttling duration. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxThrottleTime(Double maxThrottleTime) {
                this.maxThrottleTime = maxThrottleTime;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is used to create the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>140692647406****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>Indicates whether the automatic SQL throttling feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link GetAutoThrottleRulesResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoThrottleRulesResponseBody</p>
     */
    public static class TurnOffAutoThrottleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AbnormalDuration")
        private Double abnormalDuration;

        @com.aliyun.core.annotation.NameInMap("ActiveSessions")
        private Long activeSessions;

        @com.aliyun.core.annotation.NameInMap("AllowThrottleEndTime")
        private String allowThrottleEndTime;

        @com.aliyun.core.annotation.NameInMap("AllowThrottleStartTime")
        private String allowThrottleStartTime;

        @com.aliyun.core.annotation.NameInMap("AutoKillSession")
        private Boolean autoKillSession;

        @com.aliyun.core.annotation.NameInMap("CpuSessionRelation")
        private String cpuSessionRelation;

        @com.aliyun.core.annotation.NameInMap("CpuUsage")
        private Double cpuUsage;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MaxThrottleTime")
        private Double maxThrottleTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("Visible")
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

            private Builder() {
            } 

            private Builder(TurnOffAutoThrottleList model) {
                this.abnormalDuration = model.abnormalDuration;
                this.activeSessions = model.activeSessions;
                this.allowThrottleEndTime = model.allowThrottleEndTime;
                this.allowThrottleStartTime = model.allowThrottleStartTime;
                this.autoKillSession = model.autoKillSession;
                this.cpuSessionRelation = model.cpuSessionRelation;
                this.cpuUsage = model.cpuUsage;
                this.instanceId = model.instanceId;
                this.maxThrottleTime = model.maxThrottleTime;
                this.userId = model.userId;
                this.visible = model.visible;
            } 

            /**
             * <p>The maximum period of time during which the automatic SQL throttling feature is triggered. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder abnormalDuration(Double abnormalDuration) {
                this.abnormalDuration = abnormalDuration;
                return this;
            }

            /**
             * <p>The maximum number of active sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>64</p>
             */
            public Builder activeSessions(Long activeSessions) {
                this.activeSessions = activeSessions;
                return this;
            }

            /**
             * <p>The end time of the throttling window. The value of this parameter is in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>23:59Z</p>
             */
            public Builder allowThrottleEndTime(String allowThrottleEndTime) {
                this.allowThrottleEndTime = allowThrottleEndTime;
                return this;
            }

            /**
             * <p>The start time of the throttling window. The value of this parameter is in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00Z</p>
             */
            public Builder allowThrottleStartTime(String allowThrottleStartTime) {
                this.allowThrottleStartTime = allowThrottleStartTime;
                return this;
            }

            /**
             * <p>Indicates whether abnormal SQL statements in execution are terminated at a time. Valid values:</p>
             * <blockquote>
             * <p>Abnormal SQL statements use the same template as the SQL statements that need to be throttled.</p>
             * </blockquote>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoKillSession(Boolean autoKillSession) {
                this.autoKillSession = autoKillSession;
                return this;
            }

            /**
             * <p>The logical relationship between the CPU utilization threshold and the maximum number of active sessions. Valid values:</p>
             * <ul>
             * <li><strong>AND</strong></li>
             * <li><strong>OR</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OR</p>
             */
            public Builder cpuSessionRelation(String cpuSessionRelation) {
                this.cpuSessionRelation = cpuSessionRelation;
                return this;
            }

            /**
             * <p>The CPU utilization threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder cpuUsage(Double cpuUsage) {
                this.cpuUsage = cpuUsage;
                return this;
            }

            /**
             * <p>The database instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-2ze9xrhze0709****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The maximum throttling duration. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxThrottleTime(Double maxThrottleTime) {
                this.maxThrottleTime = maxThrottleTime;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is used to create the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>140692647406****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>Indicates whether the automatic SQL throttling feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link GetAutoThrottleRulesResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoThrottleRulesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableAutoThrottleCount")
        private Long enableAutoThrottleCount;

        @com.aliyun.core.annotation.NameInMap("EnableAutoThrottleList")
        private java.util.List<EnableAutoThrottleList> enableAutoThrottleList;

        @com.aliyun.core.annotation.NameInMap("NeverEnableAutoThrottleOrReleasedInstanceCount")
        private Long neverEnableAutoThrottleOrReleasedInstanceCount;

        @com.aliyun.core.annotation.NameInMap("NeverEnableAutoThrottleOrReleasedInstanceIdList")
        private java.util.List<String> neverEnableAutoThrottleOrReleasedInstanceIdList;

        @com.aliyun.core.annotation.NameInMap("TotalAutoThrottleRulesCount")
        private Long totalAutoThrottleRulesCount;

        @com.aliyun.core.annotation.NameInMap("TurnOffAutoThrottleCount")
        private Long turnOffAutoThrottleCount;

        @com.aliyun.core.annotation.NameInMap("TurnOffAutoThrottleList")
        private java.util.List<TurnOffAutoThrottleList> turnOffAutoThrottleList;

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
        public java.util.List<EnableAutoThrottleList> getEnableAutoThrottleList() {
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
        public java.util.List<String> getNeverEnableAutoThrottleOrReleasedInstanceIdList() {
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
        public java.util.List<TurnOffAutoThrottleList> getTurnOffAutoThrottleList() {
            return this.turnOffAutoThrottleList;
        }

        public static final class Builder {
            private Long enableAutoThrottleCount; 
            private java.util.List<EnableAutoThrottleList> enableAutoThrottleList; 
            private Long neverEnableAutoThrottleOrReleasedInstanceCount; 
            private java.util.List<String> neverEnableAutoThrottleOrReleasedInstanceIdList; 
            private Long totalAutoThrottleRulesCount; 
            private Long turnOffAutoThrottleCount; 
            private java.util.List<TurnOffAutoThrottleList> turnOffAutoThrottleList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.enableAutoThrottleCount = model.enableAutoThrottleCount;
                this.enableAutoThrottleList = model.enableAutoThrottleList;
                this.neverEnableAutoThrottleOrReleasedInstanceCount = model.neverEnableAutoThrottleOrReleasedInstanceCount;
                this.neverEnableAutoThrottleOrReleasedInstanceIdList = model.neverEnableAutoThrottleOrReleasedInstanceIdList;
                this.totalAutoThrottleRulesCount = model.totalAutoThrottleRulesCount;
                this.turnOffAutoThrottleCount = model.turnOffAutoThrottleCount;
                this.turnOffAutoThrottleList = model.turnOffAutoThrottleList;
            } 

            /**
             * <p>The number of database instances for which the automatic SQL throttling feature is currently enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder enableAutoThrottleCount(Long enableAutoThrottleCount) {
                this.enableAutoThrottleCount = enableAutoThrottleCount;
                return this;
            }

            /**
             * <p>The database instances for which the automatic SQL throttling feature is currently enabled.</p>
             */
            public Builder enableAutoThrottleList(java.util.List<EnableAutoThrottleList> enableAutoThrottleList) {
                this.enableAutoThrottleList = enableAutoThrottleList;
                return this;
            }

            /**
             * <p>The number of database instances that do not exist or for which the automatic SQL throttling feature has never been enabled.</p>
             * <blockquote>
             * <p> If a database instance does not exist, the instance has been released or the specified instance ID is invalid.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder neverEnableAutoThrottleOrReleasedInstanceCount(Long neverEnableAutoThrottleOrReleasedInstanceCount) {
                this.neverEnableAutoThrottleOrReleasedInstanceCount = neverEnableAutoThrottleOrReleasedInstanceCount;
                return this;
            }

            /**
             * <p>The number of database instances that do not exist or for which the automatic SQL throttling feature has never been enabled.</p>
             * <blockquote>
             * <p> If a database instance does not exist, the instance has been released or the specified instance ID is invalid.</p>
             * </blockquote>
             */
            public Builder neverEnableAutoThrottleOrReleasedInstanceIdList(java.util.List<String> neverEnableAutoThrottleOrReleasedInstanceIdList) {
                this.neverEnableAutoThrottleOrReleasedInstanceIdList = neverEnableAutoThrottleOrReleasedInstanceIdList;
                return this;
            }

            /**
             * <p>The number of databases for which the automatic SQL throttling feature has been enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder totalAutoThrottleRulesCount(Long totalAutoThrottleRulesCount) {
                this.totalAutoThrottleRulesCount = totalAutoThrottleRulesCount;
                return this;
            }

            /**
             * <p>The number of database instances for which the automatic SQL throttling feature was once enabled but is currently disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder turnOffAutoThrottleCount(Long turnOffAutoThrottleCount) {
                this.turnOffAutoThrottleCount = turnOffAutoThrottleCount;
                return this;
            }

            /**
             * <p>The database instances for which the automatic SQL throttling feature was once enabled but is currently disabled.</p>
             */
            public Builder turnOffAutoThrottleList(java.util.List<TurnOffAutoThrottleList> turnOffAutoThrottleList) {
                this.turnOffAutoThrottleList = turnOffAutoThrottleList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
