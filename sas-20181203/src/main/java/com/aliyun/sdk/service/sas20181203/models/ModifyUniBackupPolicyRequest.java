// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyUniBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyUniBackupPolicyRequest</p>
 */
public class ModifyUniBackupPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountPassword")
    private String accountPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FullPlan")
    private java.util.Map < String, ? > fullPlan;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncPlan")
    private java.util.Map < String, ? > incPlan;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyName")
    private String policyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyStatus")
    private String policyStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Retention")
    private Integer retention;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpeedLimiter")
    private Long speedLimiter;

    private ModifyUniBackupPolicyRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.accountPassword = builder.accountPassword;
        this.fullPlan = builder.fullPlan;
        this.incPlan = builder.incPlan;
        this.policyId = builder.policyId;
        this.policyName = builder.policyName;
        this.policyStatus = builder.policyStatus;
        this.retention = builder.retention;
        this.speedLimiter = builder.speedLimiter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyUniBackupPolicyRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyUniBackupPolicyRequest, Builder> {
        private String accountName; 
        private String accountPassword; 
        private java.util.Map < String, ? > fullPlan; 
        private java.util.Map < String, ? > incPlan; 
        private Long policyId; 
        private String policyName; 
        private String policyStatus; 
        private Integer retention; 
        private Long speedLimiter; 

        private Builder() {
            super();
        } 

        private Builder(ModifyUniBackupPolicyRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.accountPassword = request.accountPassword;
            this.fullPlan = request.fullPlan;
            this.incPlan = request.incPlan;
            this.policyId = request.policyId;
            this.policyName = request.policyName;
            this.policyStatus = request.policyStatus;
            this.retention = request.retention;
            this.speedLimiter = request.speedLimiter;
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
         * The policy for full backup. The value of this parameter is a JSON string that contains the following fields:
         * <p>
         * 
         * *   **start**: the start time of a backup task
         * *   **interval**: the interval of backup tasks
         * *   **type**: the unit of the interval
         * *   **days**: the days of a week on which a backup task is performed
         */
        public Builder fullPlan(java.util.Map < String, ? > fullPlan) {
            String fullPlanShrink = shrink(fullPlan, "FullPlan", "json");
            this.putQueryParameter("FullPlan", fullPlanShrink);
            this.fullPlan = fullPlan;
            return this;
        }

        /**
         * The policy for incremental backup. The value of this parameter is a JSON string that contains the following fields:
         * <p>
         * 
         * *   **start**: the start time of a backup task
         * *   **interval**: the interval of backup tasks
         * *   **type**: the unit of the interval
         * *   **days**: the days of a week on which a backup task is performed
         */
        public Builder incPlan(java.util.Map < String, ? > incPlan) {
            String incPlanShrink = shrink(incPlan, "IncPlan", "json");
            this.putQueryParameter("IncPlan", incPlanShrink);
            this.incPlan = incPlan;
            return this;
        }

        /**
         * The ID of the anti-ransomware policy.
         * <p>
         * 
         * > You can call the [DescribeUniBackupPolicies](~~DescribeUniBackupPolicies~~) operation to query the IDs of anti-ransomware policies.
         */
        public Builder policyId(Long policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
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
         * The status of the anti-ransomware policy. Valid values:
         * <p>
         * 
         * *   **enabled**
         * *   **disabled**
         */
        public Builder policyStatus(String policyStatus) {
            this.putQueryParameter("PolicyStatus", policyStatus);
            this.policyStatus = policyStatus;
            return this;
        }

        /**
         * The retention period of the backup snapshot.
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

        @Override
        public ModifyUniBackupPolicyRequest build() {
            return new ModifyUniBackupPolicyRequest(this);
        } 

    } 

}
