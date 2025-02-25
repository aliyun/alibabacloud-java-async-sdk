// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
    private java.util.Map<String, ?> fullPlan;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncPlan")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> incPlan;

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
    public java.util.Map<String, ?> getFullPlan() {
        return this.fullPlan;
    }

    /**
     * @return incPlan
     */
    public java.util.Map<String, ?> getIncPlan() {
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
        private java.util.Map<String, ?> fullPlan; 
        private java.util.Map<String, ?> incPlan; 
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
         * <p>The name of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>The password of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>Pass****</p>
         */
        public Builder accountPassword(String accountPassword) {
            this.putQueryParameter("AccountPassword", accountPassword);
            this.accountPassword = accountPassword;
            return this;
        }

        /**
         * <p>Specifies whether the database is manually added. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder databaseAddByUser(String databaseAddByUser) {
            this.putQueryParameter("DatabaseAddByUser", databaseAddByUser);
            this.databaseAddByUser = databaseAddByUser;
            return this;
        }

        /**
         * <p>The type of the database. Valid values:</p>
         * <ul>
         * <li><strong>MYSQL</strong></li>
         * <li><strong>ORACLE</strong></li>
         * <li><strong>MSSQL</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MYSQL</p>
         */
        public Builder databaseType(String databaseType) {
            this.putQueryParameter("DatabaseType", databaseType);
            this.databaseType = databaseType;
            return this;
        }

        /**
         * <p>The policy for full data backup. The value of this parameter is a JSON string. The JSON string contains the following fields:</p>
         * <ul>
         * <li><strong>start</strong>: the start time of a backup task.</li>
         * <li><strong>interval</strong>: the interval of backup tasks.</li>
         * <li><strong>type</strong>: the unit of the interval.</li>
         * <li><strong>days</strong>: the days of a week on which a backup task is performed.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;days&quot;:[4],&quot;interval&quot;:1,&quot;planType&quot;:&quot;weekly&quot;,&quot;startTime&quot;:&quot;22:00:00&quot;}</p>
         */
        public Builder fullPlan(java.util.Map<String, ?> fullPlan) {
            String fullPlanShrink = shrink(fullPlan, "FullPlan", "json");
            this.putQueryParameter("FullPlan", fullPlanShrink);
            this.fullPlan = fullPlan;
            return this;
        }

        /**
         * <p>The policy for incremental data backup. The value of this parameter is a JSON string. The JSON string contains the following fields:</p>
         * <ul>
         * <li><strong>start</strong>: the start time of a backup task.</li>
         * <li><strong>interval</strong>: the interval of backup tasks.</li>
         * <li><strong>type</strong>: the unit of the interval.</li>
         * <li><strong>days</strong>: the days of a week on which a backup task is performed.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;interval&quot;:1,&quot;planType&quot;:&quot;daily&quot;,&quot;startTime&quot;:&quot;23:30:00&quot;}</p>
         */
        public Builder incPlan(java.util.Map<String, ?> incPlan) {
            String incPlanShrink = shrink(incPlan, "IncPlan", "json");
            this.putQueryParameter("IncPlan", incPlanShrink);
            this.incPlan = incPlan;
            return this;
        }

        /**
         * <p>The ID of the Elastic Compute Service (ECS) instance.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeUniBackupDatabase~~">DescribeUniBackupDatabase</a> operation to query the IDs of ECS instances.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1fu4aqltf1huhc****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the anti-ransomware policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql-policy</p>
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * <p>The retention period of backup data.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder retention(Integer retention) {
            this.putQueryParameter("Retention", retention);
            this.retention = retention;
            return this;
        }

        /**
         * <p>The maximum network bandwidth that is allowed during data backup. Unit: bytes.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5242880</p>
         */
        public Builder speedLimiter(Long speedLimiter) {
            this.putQueryParameter("SpeedLimiter", speedLimiter);
            this.speedLimiter = speedLimiter;
            return this;
        }

        /**
         * <p>The region in which the server resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder uniRegionId(String uniRegionId) {
            this.putQueryParameter("UniRegionId", uniRegionId);
            this.uniRegionId = uniRegionId;
            return this;
        }

        /**
         * <p>The UUID of the server whose data is backed up based on the anti-ransomware policy.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/141932.html">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>045cad48-eb08-4047-a70c-713aec7b****</p>
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
