// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUniBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateUniBackupPolicyRequest</p>
 */
public class CreateUniBackupPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountPassword")
    private String accountPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseAddByUser")
    private String databaseAddByUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databaseType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FullPlan")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map < String, ? > fullPlan;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncPlan")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map < String, ? > incPlan;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Retention")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer retention;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpeedLimiter")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long speedLimiter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UniRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uniRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private CreateUniBackupPolicyRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.accountPassword = builder.accountPassword;
        this.databaseAddByUser = builder.databaseAddByUser;
        this.databaseType = builder.databaseType;
        this.fullPlan = builder.fullPlan;
        this.incPlan = builder.incPlan;
        this.instanceId = builder.instanceId;
        this.policyName = builder.policyName;
        this.retention = builder.retention;
        this.speedLimiter = builder.speedLimiter;
        this.uniRegionId = builder.uniRegionId;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUniBackupPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return accountPassword
     */
    public String getAccountPassword() {
        return this.accountPassword;
    }

    /**
     * @return databaseAddByUser
     */
    public String getDatabaseAddByUser() {
        return this.databaseAddByUser;
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
    public java.util.Map < String, ? > getFullPlan() {
        return this.fullPlan;
    }

    /**
     * @return incPlan
     */
    public java.util.Map < String, ? > getIncPlan() {
        return this.incPlan;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
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

    /**
     * @return uniRegionId
     */
    public String getUniRegionId() {
        return this.uniRegionId;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<CreateUniBackupPolicyRequest, Builder> {
        private String accountName; 
        private String accountPassword; 
        private String databaseAddByUser; 
        private String databaseType; 
        private java.util.Map < String, ? > fullPlan; 
        private java.util.Map < String, ? > incPlan; 
        private String instanceId; 
        private String policyName; 
        private Integer retention; 
        private Long speedLimiter; 
        private String uniRegionId; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(CreateUniBackupPolicyRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.accountPassword = request.accountPassword;
            this.databaseAddByUser = request.databaseAddByUser;
            this.databaseType = request.databaseType;
            this.fullPlan = request.fullPlan;
            this.incPlan = request.incPlan;
            this.instanceId = request.instanceId;
            this.policyName = request.policyName;
            this.retention = request.retention;
            this.speedLimiter = request.speedLimiter;
            this.uniRegionId = request.uniRegionId;
            this.uuid = request.uuid;
        } 

        /**
         * The name of the database account.
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * The password of the database account.
         */
        public Builder accountPassword(String accountPassword) {
            this.putQueryParameter("AccountPassword", accountPassword);
            this.accountPassword = accountPassword;
            return this;
        }

        /**
         * Specifies whether the database is manually added. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder databaseAddByUser(String databaseAddByUser) {
            this.putQueryParameter("DatabaseAddByUser", databaseAddByUser);
            this.databaseAddByUser = databaseAddByUser;
            return this;
        }

        /**
         * The type of the database. Valid values:
         * <p>
         * 
         * *   **MYSQL**
         * *   **ORACLE**
         * *   **MSSQL**
         */
        public Builder databaseType(String databaseType) {
            this.putQueryParameter("DatabaseType", databaseType);
            this.databaseType = databaseType;
            return this;
        }

        /**
         * The policy for full data backup. The value of this parameter is a JSON string. The JSON string contains the following fields:
         * <p>
         * 
         * *   **start**: the start time of a backup task.
         * *   **interval**: the interval of backup tasks.
         * *   **type**: the unit of the interval.
         * *   **days**: the days of a week on which a backup task is performed.
         */
        public Builder fullPlan(java.util.Map < String, ? > fullPlan) {
            String fullPlanShrink = shrink(fullPlan, "FullPlan", "json");
            this.putQueryParameter("FullPlan", fullPlanShrink);
            this.fullPlan = fullPlan;
            return this;
        }

        /**
         * The policy for incremental data backup. The value of this parameter is a JSON string. The JSON string contains the following fields:
         * <p>
         * 
         * *   **start**: the start time of a backup task.
         * *   **interval**: the interval of backup tasks.
         * *   **type**: the unit of the interval.
         * *   **days**: the days of a week on which a backup task is performed.
         */
        public Builder incPlan(java.util.Map < String, ? > incPlan) {
            String incPlanShrink = shrink(incPlan, "IncPlan", "json");
            this.putQueryParameter("IncPlan", incPlanShrink);
            this.incPlan = incPlan;
            return this;
        }

        /**
         * The ID of the Elastic Compute Service (ECS) instance.
         * <p>
         * 
         * >  You can call the [DescribeUniBackupDatabase](~~DescribeUniBackupDatabase~~) operation to query the IDs of ECS instances.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the anti-ransomware policy.
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * The retention period of backup data.
         */
        public Builder retention(Integer retention) {
            this.putQueryParameter("Retention", retention);
            this.retention = retention;
            return this;
        }

        /**
         * The maximum network bandwidth that is allowed during data backup. Unit: bytes.
         */
        public Builder speedLimiter(Long speedLimiter) {
            this.putQueryParameter("SpeedLimiter", speedLimiter);
            this.speedLimiter = speedLimiter;
            return this;
        }

        /**
         * The region in which the server resides.
         */
        public Builder uniRegionId(String uniRegionId) {
            this.putQueryParameter("UniRegionId", uniRegionId);
            this.uniRegionId = uniRegionId;
            return this;
        }

        /**
         * The UUID of the server whose data is backed up based on the anti-ransomware policy.
         * <p>
         * 
         * >  You can call the [DescribeCloudCenterInstances](~~141932~~) operation to query the UUIDs of servers.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public CreateUniBackupPolicyRequest build() {
            return new CreateUniBackupPolicyRequest(this);
        } 

    } 

}
