// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHanaBackupPlansResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHanaBackupPlansResponseBody</p>
 */
public class DescribeHanaBackupPlansResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HanaBackupPlans")
    private HanaBackupPlans hanaBackupPlans;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeHanaBackupPlansResponseBody(Builder builder) {
        this.code = builder.code;
        this.hanaBackupPlans = builder.hanaBackupPlans;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHanaBackupPlansResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return hanaBackupPlans
     */
    public HanaBackupPlans getHanaBackupPlans() {
        return this.hanaBackupPlans;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private HanaBackupPlans hanaBackupPlans; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * The HTTP status code. The status code 200 indicates that the call is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The details of the backup plan.
         */
        public Builder hanaBackupPlans(HanaBackupPlans hanaBackupPlans) {
            this.hanaBackupPlans = hanaBackupPlans;
            return this;
        }

        /**
         * The message that is returned. If the call is successful, "successful" is returned. If the call fails, an error message is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The page number of the returned page. Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned on each page. Valid values: 1 to 99. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call is successful. Valid values:
         * <p>
         * 
         * *   true: The call is successful.
         * *   false: The call fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeHanaBackupPlansResponseBody build() {
            return new DescribeHanaBackupPlansResponseBody(this);
        } 

    } 

    public static class HanaBackupPlan extends TeaModel {
        @NameInMap("BackupPrefix")
        private String backupPrefix;

        @NameInMap("BackupType")
        private String backupType;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("Disabled")
        private Boolean disabled;

        @NameInMap("PlanId")
        private String planId;

        @NameInMap("PlanName")
        private String planName;

        @NameInMap("Schedule")
        private String schedule;

        @NameInMap("VaultId")
        private String vaultId;

        private HanaBackupPlan(Builder builder) {
            this.backupPrefix = builder.backupPrefix;
            this.backupType = builder.backupType;
            this.clusterId = builder.clusterId;
            this.databaseName = builder.databaseName;
            this.disabled = builder.disabled;
            this.planId = builder.planId;
            this.planName = builder.planName;
            this.schedule = builder.schedule;
            this.vaultId = builder.vaultId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HanaBackupPlan create() {
            return builder().build();
        }

        /**
         * @return backupPrefix
         */
        public String getBackupPrefix() {
            return this.backupPrefix;
        }

        /**
         * @return backupType
         */
        public String getBackupType() {
            return this.backupType;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return disabled
         */
        public Boolean getDisabled() {
            return this.disabled;
        }

        /**
         * @return planId
         */
        public String getPlanId() {
            return this.planId;
        }

        /**
         * @return planName
         */
        public String getPlanName() {
            return this.planName;
        }

        /**
         * @return schedule
         */
        public String getSchedule() {
            return this.schedule;
        }

        /**
         * @return vaultId
         */
        public String getVaultId() {
            return this.vaultId;
        }

        public static final class Builder {
            private String backupPrefix; 
            private String backupType; 
            private String clusterId; 
            private String databaseName; 
            private Boolean disabled; 
            private String planId; 
            private String planName; 
            private String schedule; 
            private String vaultId; 

            /**
             * The backup prefix.
             */
            public Builder backupPrefix(String backupPrefix) {
                this.backupPrefix = backupPrefix;
                return this;
            }

            /**
             * The backup type. Valid values:
             * <p>
             * 
             * *   COMPLETE: full backup
             * *   INCREMENTAL: incremental backup
             * *   DIFFERENTIAL: differential backup
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * The ID of the SAP HANA instance.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * Indicates whether the backup plan is disabled. Valid values:
             * <p>
             * 
             * *   true: The backup plan is disabled.
             * *   false: The backup plan is enabled.
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * The ID of the backup plan.
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            /**
             * The name of the backup plan.
             */
            public Builder planName(String planName) {
                this.planName = planName;
                return this;
            }

            /**
             * The backup policy. Format: `I|{startTime}|{interval}`. The system runs the first backup job at a point in time that is specified in the {startTime} parameter and the subsequent backup jobs at an interval that is specified in the {interval} parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is completed. For example, `I|1631685600|P1D` specifies that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.
             * <p>
             * 
             * *   startTime: the time at which the system starts to run a backup job. The time follows the UNIX time format. Unit: seconds.
             * *   interval: the interval at which the system runs a backup job. The interval follows the ISO 8601 standard. For example, PT1H indicates an interval of 1 hour. P1D indicates an interval of one day.
             */
            public Builder schedule(String schedule) {
                this.schedule = schedule;
                return this;
            }

            /**
             * The ID of the backup vault.
             */
            public Builder vaultId(String vaultId) {
                this.vaultId = vaultId;
                return this;
            }

            public HanaBackupPlan build() {
                return new HanaBackupPlan(this);
            } 

        } 

    }
    public static class HanaBackupPlans extends TeaModel {
        @NameInMap("HanaBackupPlan")
        private java.util.List < HanaBackupPlan> hanaBackupPlan;

        private HanaBackupPlans(Builder builder) {
            this.hanaBackupPlan = builder.hanaBackupPlan;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HanaBackupPlans create() {
            return builder().build();
        }

        /**
         * @return hanaBackupPlan
         */
        public java.util.List < HanaBackupPlan> getHanaBackupPlan() {
            return this.hanaBackupPlan;
        }

        public static final class Builder {
            private java.util.List < HanaBackupPlan> hanaBackupPlan; 

            /**
             * HanaBackupPlan.
             */
            public Builder hanaBackupPlan(java.util.List < HanaBackupPlan> hanaBackupPlan) {
                this.hanaBackupPlan = hanaBackupPlan;
                return this;
            }

            public HanaBackupPlans build() {
                return new HanaBackupPlans(this);
            } 

        } 

    }
}
