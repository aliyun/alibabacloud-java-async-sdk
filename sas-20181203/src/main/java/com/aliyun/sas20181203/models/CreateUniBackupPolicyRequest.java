// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateUniBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateUniBackupPolicyRequest</p>
 */
public class CreateUniBackupPolicyRequest extends Request {
    @Query
    @NameInMap("AccountName")
    private String accountName;

    @Query
    @NameInMap("AccountPassword")
    private String accountPassword;

    @Query
    @NameInMap("DatabaseAddByUser")
    private String databaseAddByUser;

    @Query
    @NameInMap("DatabaseType")
    private String databaseType;

    @Query
    @NameInMap("FullPlan")
    private java.util.Map < String, ? > fullPlan;

    @Query
    @NameInMap("IncPlan")
    private java.util.Map < String, ? > incPlan;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("PolicyName")
    private String policyName;

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

    @Query
    @NameInMap("UniRegionId")
    private String uniRegionId;

    @Query
    @NameInMap("Uuid")
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
        this.resourceOwnerId = builder.resourceOwnerId;
        this.retention = builder.retention;
        this.sourceIp = builder.sourceIp;
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

    public static final class Builder extends Request.Builder {
        private String accountName; 
        private String accountPassword; 
        private String databaseAddByUser; 
        private String databaseType; 
        private java.util.Map < String, ? > fullPlan; 
        private java.util.Map < String, ? > incPlan; 
        private String instanceId; 
        private String policyName; 
        private Long resourceOwnerId; 
        private Integer retention; 
        private String sourceIp; 
        private Long speedLimiter; 
        private String uniRegionId; 
        private String uuid; 

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
         * <p>DatabaseAddByUser.</p>
         */
        public Builder databaseAddByUser(String databaseAddByUser) {
            this.putQueryParameter("DatabaseAddByUser", databaseAddByUser);
            this.databaseAddByUser = databaseAddByUser;
            return this;
        }

        /**
         * <p>DatabaseType.</p>
         */
        public Builder databaseType(String databaseType) {
            this.putQueryParameter("DatabaseType", databaseType);
            this.databaseType = databaseType;
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
         * <p>InstanceId.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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

        /**
         * <p>UniRegionId.</p>
         */
        public Builder uniRegionId(String uniRegionId) {
            this.putQueryParameter("UniRegionId", uniRegionId);
            this.uniRegionId = uniRegionId;
            return this;
        }

        /**
         * <p>Uuid.</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        public CreateUniBackupPolicyRequest build() {
            return new CreateUniBackupPolicyRequest(this);
        } 

    } 

}
