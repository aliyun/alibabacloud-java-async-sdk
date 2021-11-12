// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyUniBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyUniBackupPolicyRequest</p>
 */
public class ModifyUniBackupPolicyRequest extends Request {
    @Query
    @NameInMap("AccountName")
    private String accountName;

    @Query
    @NameInMap("AccountPassword")
    private String accountPassword;

    @Query
    @NameInMap("FullPlan")
    private java.util.Map < String, ? > fullPlan;

    @Query
    @NameInMap("IncPlan")
    private java.util.Map < String, ? > incPlan;

    @Query
    @NameInMap("PolicyId")
    private Long policyId;

    @Query
    @NameInMap("PolicyName")
    private String policyName;

    @Query
    @NameInMap("PolicyStatus")
    private String policyStatus;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Retention")
    private Integer retention;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("SpeedLimiter")
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
        this.resourceOwnerId = builder.resourceOwnerId;
        this.retention = builder.retention;
        this.sourceIp = builder.sourceIp;
        this.speedLimiter = builder.speedLimiter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyUniBackupPolicyRequest create() {
        return builder().build();
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return retention
     */
    public Integer getRetention() {
        return this.retention;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return speedLimiter
     */
    public Long getSpeedLimiter() {
        return this.speedLimiter;
    }

    public static final class Builder extends Request.Builder {
        private String accountName; 
        private String accountPassword; 
        private java.util.Map < String, ? > fullPlan; 
        private java.util.Map < String, ? > incPlan; 
        private Long policyId; 
        private String policyName; 
        private String policyStatus; 
        private Long resourceOwnerId; 
        private Integer retention; 
        private String sourceIp; 
        private Long speedLimiter; 

        /**
         * <p>AccountName.</p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>AccountPassword.</p>
         */
        public Builder accountPassword(String accountPassword) {
            this.putQueryParameter("AccountPassword", accountPassword);
            this.accountPassword = accountPassword;
            return this;
        }

        /**
         * <p>FullPlan.</p>
         */
        public Builder fullPlan(java.util.Map < String, ? > fullPlan) {
            this.putQueryParameter("FullPlan", fullPlan);
            this.fullPlan = fullPlan;
            return this;
        }

        /**
         * <p>IncPlan.</p>
         */
        public Builder incPlan(java.util.Map < String, ? > incPlan) {
            this.putQueryParameter("IncPlan", incPlan);
            this.incPlan = incPlan;
            return this;
        }

        /**
         * <p>PolicyId.</p>
         */
        public Builder policyId(Long policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>PolicyName.</p>
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * <p>PolicyStatus.</p>
         */
        public Builder policyStatus(String policyStatus) {
            this.putQueryParameter("PolicyStatus", policyStatus);
            this.policyStatus = policyStatus;
            return this;
        }

        /**
         * <p>ResourceOwnerId.</p>
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>Retention.</p>
         */
        public Builder retention(Integer retention) {
            this.putQueryParameter("Retention", retention);
            this.retention = retention;
            return this;
        }

        /**
         * <p>SourceIp.</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>SpeedLimiter.</p>
         */
        public Builder speedLimiter(Long speedLimiter) {
            this.putQueryParameter("SpeedLimiter", speedLimiter);
            this.speedLimiter = speedLimiter;
            return this;
        }

        public ModifyUniBackupPolicyRequest build() {
            return new ModifyUniBackupPolicyRequest(this);
        } 

    } 

}
