// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link DescribeHanaBackupPlansResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHanaBackupPlansResponseBody</p>
 */
public class DescribeHanaBackupPlansResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HanaBackupPlans")
    private HanaBackupPlans hanaBackupPlans;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The response code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the backup plan.</p>
         */
        public Builder hanaBackupPlans(HanaBackupPlans hanaBackupPlans) {
            this.hanaBackupPlans = hanaBackupPlans;
            return this;
        }

        /**
         * <p>The returned message. If the request was successful, &quot;successful&quot; is returned. If the request failed, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 99. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F029C1C7-26B6-5ADD-A73E-D85CCD7C73A9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeHanaBackupPlansResponseBody build() {
            return new DescribeHanaBackupPlansResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHanaBackupPlansResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHanaBackupPlansResponseBody</p>
     */
    public static class HanaBackupPlan extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupPrefix")
        private String backupPrefix;

        @com.aliyun.core.annotation.NameInMap("BackupType")
        private String backupType;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("Disabled")
        private Boolean disabled;

        @com.aliyun.core.annotation.NameInMap("PlanId")
        private String planId;

        @com.aliyun.core.annotation.NameInMap("PlanName")
        private String planName;

        @com.aliyun.core.annotation.NameInMap("Schedule")
        private String schedule;

        @com.aliyun.core.annotation.NameInMap("VaultId")
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
             * <p>The backup prefix.</p>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE_DATA_BACKUP</p>
             */
            public Builder backupPrefix(String backupPrefix) {
                this.backupPrefix = backupPrefix;
                return this;
            }

            /**
             * <p>The backup type. Valid values:</p>
             * <ul>
             * <li>COMPLETE: full backup</li>
             * <li>INCREMENTAL: incremental backup</li>
             * <li>DIFFERENTIAL: differential backup</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE</p>
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * <p>The ID of the SAP HANA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cl-0002scknka*****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The database name.</p>
             * 
             * <strong>example:</strong>
             * <p>SYSTEMDB</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>Indicates whether the backup plan is disabled. Valid values:</p>
             * <ul>
             * <li>true: The backup plan is disabled.</li>
             * <li>false: The backup plan is enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * <p>The ID of the backup plan.</p>
             * 
             * <strong>example:</strong>
             * <p>pl-0000tnyndg3ne5m4ubeu</p>
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            /**
             * <p>The name of the backup plan.</p>
             * 
             * <strong>example:</strong>
             * <p>plan-20220118-141153</p>
             */
            public Builder planName(String planName) {
                this.planName = planName;
                return this;
            }

            /**
             * <p>The backup policy. Format: <code>I|{startTime}|{interval}</code>. The system runs the first backup job at a point in time that is specified in the {startTime} parameter and the subsequent backup jobs at an interval that is specified in the {interval} parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is completed. For example, <code>I|1631685600|P1D</code> indicates that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.</p>
             * <ul>
             * <li>startTime: the time at which the system starts to run a backup job. The time follows the UNIX time format. Unit: seconds.</li>
             * <li>interval: the interval at which the system runs a backup job. The interval follows the ISO 8601 standard. For example, PT1H indicates an interval of 1 hour. P1D indicates an interval of one day.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>I|1602673264|P1D</p>
             */
            public Builder schedule(String schedule) {
                this.schedule = schedule;
                return this;
            }

            /**
             * <p>The ID of the backup vault.</p>
             * 
             * <strong>example:</strong>
             * <p>v-000csihw82pqkd7hcjws</p>
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
    /**
     * 
     * {@link DescribeHanaBackupPlansResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHanaBackupPlansResponseBody</p>
     */
    public static class HanaBackupPlans extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HanaBackupPlan")
        private java.util.List<HanaBackupPlan> hanaBackupPlan;

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
        public java.util.List<HanaBackupPlan> getHanaBackupPlan() {
            return this.hanaBackupPlan;
        }

        public static final class Builder {
            private java.util.List<HanaBackupPlan> hanaBackupPlan; 

            /**
             * HanaBackupPlan.
             */
            public Builder hanaBackupPlan(java.util.List<HanaBackupPlan> hanaBackupPlan) {
                this.hanaBackupPlan = hanaBackupPlan;
                return this;
            }

            public HanaBackupPlans build() {
                return new HanaBackupPlans(this);
            } 

        } 

    }
}
