// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUniBackupPolicyDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUniBackupPolicyDetailResponseBody</p>
 */
public class DescribeUniBackupPolicyDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UniBackupPolicyDTO")
    private UniBackupPolicyDTO uniBackupPolicyDTO;

    private DescribeUniBackupPolicyDetailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.uniBackupPolicyDTO = builder.uniBackupPolicyDTO;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUniBackupPolicyDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uniBackupPolicyDTO
     */
    public UniBackupPolicyDTO getUniBackupPolicyDTO() {
        return this.uniBackupPolicyDTO;
    }

    public static final class Builder {
        private String requestId; 
        private UniBackupPolicyDTO uniBackupPolicyDTO; 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>F35F45B0-5D6B-4238-BE02-A62D0760****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the anti-ransomware policy.</p>
         */
        public Builder uniBackupPolicyDTO(UniBackupPolicyDTO uniBackupPolicyDTO) {
            this.uniBackupPolicyDTO = uniBackupPolicyDTO;
            return this;
        }

        public DescribeUniBackupPolicyDetailResponseBody build() {
            return new DescribeUniBackupPolicyDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUniBackupPolicyDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUniBackupPolicyDetailResponseBody</p>
     */
    public static class FullPlan extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Days")
        private java.util.List < String > days;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("PlanType")
        private String planType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private FullPlan(Builder builder) {
            this.days = builder.days;
            this.interval = builder.interval;
            this.planType = builder.planType;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FullPlan create() {
            return builder().build();
        }

        /**
         * @return days
         */
        public java.util.List < String > getDays() {
            return this.days;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return planType
         */
        public String getPlanType() {
            return this.planType;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private java.util.List < String > days; 
            private Integer interval; 
            private String planType; 
            private String startTime; 

            /**
             * <p>An array that consists of the days of a week on which the backup is performed.</p>
             */
            public Builder days(java.util.List < String > days) {
                this.days = days;
                return this;
            }

            /**
             * <p>The interval of backup tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The unit of the interval. Valid values:</p>
             * <ul>
             * <li><strong>hourly</strong>: hour</li>
             * <li><strong>daily</strong>: day</li>
             * <li><strong>weekly</strong>: week</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>daily</p>
             */
            public Builder planType(String planType) {
                this.planType = planType;
                return this;
            }

            /**
             * <p>The time when the full backup started. The time is in the HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>00:10:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public FullPlan build() {
                return new FullPlan(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUniBackupPolicyDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUniBackupPolicyDetailResponseBody</p>
     */
    public static class IncPlan extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Days")
        private java.util.List < String > days;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("PlanType")
        private String planType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private IncPlan(Builder builder) {
            this.days = builder.days;
            this.interval = builder.interval;
            this.planType = builder.planType;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IncPlan create() {
            return builder().build();
        }

        /**
         * @return days
         */
        public java.util.List < String > getDays() {
            return this.days;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return planType
         */
        public String getPlanType() {
            return this.planType;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private java.util.List < String > days; 
            private Integer interval; 
            private String planType; 
            private String startTime; 

            /**
             * <p>An array that consists of the days of a week on which the backup is performed.</p>
             */
            public Builder days(java.util.List < String > days) {
                this.days = days;
                return this;
            }

            /**
             * <p>The interval of backup tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The unit of the interval. Valid values:</p>
             * <ul>
             * <li><strong>hourly</strong>: hour</li>
             * <li><strong>daily</strong>: day</li>
             * <li><strong>weekly</strong>: week</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>daily</p>
             */
            public Builder planType(String planType) {
                this.planType = planType;
                return this;
            }

            /**
             * <p>The time when the incremental data backup starts. The time is in the hh:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>00:10:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public IncPlan build() {
                return new IncPlan(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUniBackupPolicyDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUniBackupPolicyDetailResponseBody</p>
     */
    public static class UniBackupPolicyDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("AgentStatus")
        private String agentStatus;

        @com.aliyun.core.annotation.NameInMap("DatabaseType")
        private String databaseType;

        @com.aliyun.core.annotation.NameInMap("FullPlan")
        private FullPlan fullPlan;

        @com.aliyun.core.annotation.NameInMap("IncPlan")
        private IncPlan incPlan;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private Long policyId;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("PolicyStatus")
        private String policyStatus;

        @com.aliyun.core.annotation.NameInMap("Retention")
        private Integer retention;

        @com.aliyun.core.annotation.NameInMap("SpeedLimiter")
        private Long speedLimiter;

        private UniBackupPolicyDTO(Builder builder) {
            this.accountName = builder.accountName;
            this.agentStatus = builder.agentStatus;
            this.databaseType = builder.databaseType;
            this.fullPlan = builder.fullPlan;
            this.incPlan = builder.incPlan;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.policyId = builder.policyId;
            this.policyName = builder.policyName;
            this.policyStatus = builder.policyStatus;
            this.retention = builder.retention;
            this.speedLimiter = builder.speedLimiter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UniBackupPolicyDTO create() {
            return builder().build();
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return agentStatus
         */
        public String getAgentStatus() {
            return this.agentStatus;
        }

        /**
         * @return databaseType
         */
        public String getDatabaseType() {
            return this.databaseType;
        }

        /**
         * @return fullPlan
         */
        public FullPlan getFullPlan() {
            return this.fullPlan;
        }

        /**
         * @return incPlan
         */
        public IncPlan getIncPlan() {
            return this.incPlan;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return policyId
         */
        public Long getPolicyId() {
            return this.policyId;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return policyStatus
         */
        public String getPolicyStatus() {
            return this.policyStatus;
        }

        /**
         * @return retention
         */
        public Integer getRetention() {
            return this.retention;
        }

        /**
         * @return speedLimiter
         */
        public Long getSpeedLimiter() {
            return this.speedLimiter;
        }

        public static final class Builder {
            private String accountName; 
            private String agentStatus; 
            private String databaseType; 
            private FullPlan fullPlan; 
            private IncPlan incPlan; 
            private String instanceId; 
            private String instanceName; 
            private Long policyId; 
            private String policyName; 
            private String policyStatus; 
            private Integer retention; 
            private Long speedLimiter; 

            /**
             * <p>The name of the database account.</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The status of the database client. Valid values:</p>
             * <ul>
             * <li><strong>UNKNOWN</strong>: unknown</li>
             * <li><strong>INSTALLED</strong>: installed</li>
             * <li><strong>INSTALL_FAILED</strong>: installation failed</li>
             * <li><strong>UNINSTALL_FAILED</strong>: uninstallation failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INSTALLED</p>
             */
            public Builder agentStatus(String agentStatus) {
                this.agentStatus = agentStatus;
                return this;
            }

            /**
             * <p>The type of the database. Valid values:</p>
             * <ul>
             * <li><strong>MYSQL</strong></li>
             * <li><strong>MSSQL</strong></li>
             * <li><strong>Oracle</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ORACLE</p>
             */
            public Builder databaseType(String databaseType) {
                this.databaseType = databaseType;
                return this;
            }

            /**
             * <p>The details of the policy for full backup.</p>
             */
            public Builder fullPlan(FullPlan fullPlan) {
                this.fullPlan = fullPlan;
                return this;
            }

            /**
             * <p>The policy for incremental data backup.</p>
             */
            public Builder incPlan(IncPlan incPlan) {
                this.incPlan = incPlan;
                return this;
            }

            /**
             * <p>The ID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2zefcy2id5d60m9t****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>sql-test-01</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The ID of the anti-ransomware policy.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder policyId(Long policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The name of the anti-ransomware policy.</p>
             * 
             * <strong>example:</strong>
             * <p>auto_test_sql</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * <p>The status of the anti-ransomware policy. Valid values:</p>
             * <ul>
             * <li><strong>initiating</strong>: initializing</li>
             * <li><strong>opening</strong>: enabled</li>
             * <li><strong>closing</strong>: disabled</li>
             * <li><strong>deleting</strong>: deleting</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>opening</p>
             */
            public Builder policyStatus(String policyStatus) {
                this.policyStatus = policyStatus;
                return this;
            }

            /**
             * <p>The retention period of the backup snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder retention(Integer retention) {
                this.retention = retention;
                return this;
            }

            /**
             * <p>The maximum network bandwidth that is allowed during data backup. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>5242880</p>
             */
            public Builder speedLimiter(Long speedLimiter) {
                this.speedLimiter = speedLimiter;
                return this;
            }

            public UniBackupPolicyDTO build() {
                return new UniBackupPolicyDTO(this);
            } 

        } 

    }
}
