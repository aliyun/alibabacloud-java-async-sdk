// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreateCronJobPolicyServerlessRequest} extends {@link RequestModel}
 *
 * <p>CreateCronJobPolicyServerlessRequest</p>
 */
public class CreateCronJobPolicyServerlessRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowShutDown")
    private String allowShutDown;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CronExpression")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cronExpression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleApRoNumMax")
    private String scaleApRoNumMax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleApRoNumMin")
    private String scaleApRoNumMin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleMax")
    private String scaleMax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleMin")
    private String scaleMin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleRoNumMax")
    private String scaleRoNumMax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleRoNumMin")
    private String scaleRoNumMin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecondsUntilAutoPause")
    private String secondsUntilAutoPause;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerlessRuleCpuEnlargeThreshold")
    private String serverlessRuleCpuEnlargeThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerlessRuleCpuShrinkThreshold")
    private String serverlessRuleCpuShrinkThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerlessRuleMode")
    private String serverlessRuleMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private CreateCronJobPolicyServerlessRequest(Builder builder) {
        super(builder);
        this.allowShutDown = builder.allowShutDown;
        this.cronExpression = builder.cronExpression;
        this.DBClusterId = builder.DBClusterId;
        this.endTime = builder.endTime;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scaleApRoNumMax = builder.scaleApRoNumMax;
        this.scaleApRoNumMin = builder.scaleApRoNumMin;
        this.scaleMax = builder.scaleMax;
        this.scaleMin = builder.scaleMin;
        this.scaleRoNumMax = builder.scaleRoNumMax;
        this.scaleRoNumMin = builder.scaleRoNumMin;
        this.secondsUntilAutoPause = builder.secondsUntilAutoPause;
        this.serverlessRuleCpuEnlargeThreshold = builder.serverlessRuleCpuEnlargeThreshold;
        this.serverlessRuleCpuShrinkThreshold = builder.serverlessRuleCpuShrinkThreshold;
        this.serverlessRuleMode = builder.serverlessRuleMode;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCronJobPolicyServerlessRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowShutDown
     */
    public String getAllowShutDown() {
        return this.allowShutDown;
    }

    /**
     * @return cronExpression
     */
    public String getCronExpression() {
        return this.cronExpression;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return scaleApRoNumMax
     */
    public String getScaleApRoNumMax() {
        return this.scaleApRoNumMax;
    }

    /**
     * @return scaleApRoNumMin
     */
    public String getScaleApRoNumMin() {
        return this.scaleApRoNumMin;
    }

    /**
     * @return scaleMax
     */
    public String getScaleMax() {
        return this.scaleMax;
    }

    /**
     * @return scaleMin
     */
    public String getScaleMin() {
        return this.scaleMin;
    }

    /**
     * @return scaleRoNumMax
     */
    public String getScaleRoNumMax() {
        return this.scaleRoNumMax;
    }

    /**
     * @return scaleRoNumMin
     */
    public String getScaleRoNumMin() {
        return this.scaleRoNumMin;
    }

    /**
     * @return secondsUntilAutoPause
     */
    public String getSecondsUntilAutoPause() {
        return this.secondsUntilAutoPause;
    }

    /**
     * @return serverlessRuleCpuEnlargeThreshold
     */
    public String getServerlessRuleCpuEnlargeThreshold() {
        return this.serverlessRuleCpuEnlargeThreshold;
    }

    /**
     * @return serverlessRuleCpuShrinkThreshold
     */
    public String getServerlessRuleCpuShrinkThreshold() {
        return this.serverlessRuleCpuShrinkThreshold;
    }

    /**
     * @return serverlessRuleMode
     */
    public String getServerlessRuleMode() {
        return this.serverlessRuleMode;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<CreateCronJobPolicyServerlessRequest, Builder> {
        private String allowShutDown; 
        private String cronExpression; 
        private String DBClusterId; 
        private String endTime; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scaleApRoNumMax; 
        private String scaleApRoNumMin; 
        private String scaleMax; 
        private String scaleMin; 
        private String scaleRoNumMax; 
        private String scaleRoNumMin; 
        private String secondsUntilAutoPause; 
        private String serverlessRuleCpuEnlargeThreshold; 
        private String serverlessRuleCpuShrinkThreshold; 
        private String serverlessRuleMode; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateCronJobPolicyServerlessRequest request) {
            super(request);
            this.allowShutDown = request.allowShutDown;
            this.cronExpression = request.cronExpression;
            this.DBClusterId = request.DBClusterId;
            this.endTime = request.endTime;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scaleApRoNumMax = request.scaleApRoNumMax;
            this.scaleApRoNumMin = request.scaleApRoNumMin;
            this.scaleMax = request.scaleMax;
            this.scaleMin = request.scaleMin;
            this.scaleRoNumMax = request.scaleRoNumMax;
            this.scaleRoNumMin = request.scaleRoNumMin;
            this.secondsUntilAutoPause = request.secondsUntilAutoPause;
            this.serverlessRuleCpuEnlargeThreshold = request.serverlessRuleCpuEnlargeThreshold;
            this.serverlessRuleCpuShrinkThreshold = request.serverlessRuleCpuShrinkThreshold;
            this.serverlessRuleMode = request.serverlessRuleMode;
            this.startTime = request.startTime;
        } 

        /**
         * <p>Specifies whether to enable no-activity suspension. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enables the feature.</p>
         * </li>
         * <li><p><strong>false</strong> (default): Disables the feature.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder allowShutDown(String allowShutDown) {
            this.putQueryParameter("AllowShutDown", allowShutDown);
            this.allowShutDown = allowShutDown;
            return this;
        }

        /**
         * <p>The Cron expression.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 13 * * ?</p>
         */
        public Builder cronExpression(String cronExpression) {
            this.putQueryParameter("CronExpression", cronExpression);
            this.cronExpression = cronExpression;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-xxxxxxxxxx</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The end time of the task. Use the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-23T01:01:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The maximum number of read-only column store nodes. Valid values: 0 to 15.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scaleApRoNumMax(String scaleApRoNumMax) {
            this.putQueryParameter("ScaleApRoNumMax", scaleApRoNumMax);
            this.scaleApRoNumMax = scaleApRoNumMax;
            return this;
        }

        /**
         * <p>The minimum number of read-only column store nodes. Valid values: 0 to 15.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scaleApRoNumMin(String scaleApRoNumMin) {
            this.putQueryParameter("ScaleApRoNumMin", scaleApRoNumMin);
            this.scaleApRoNumMin = scaleApRoNumMin;
            return this;
        }

        /**
         * <p>The maximum number of PCUs. The value must be from 1 to 32.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder scaleMax(String scaleMax) {
            this.putQueryParameter("ScaleMax", scaleMax);
            this.scaleMax = scaleMax;
            return this;
        }

        /**
         * <p>The minimum number of PolarDB Capacity Units (PCUs). The value must be from 0.25 to 32 and must be less than or equal to the value of ScaleMax.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scaleMin(String scaleMin) {
            this.putQueryParameter("ScaleMin", scaleMin);
            this.scaleMin = scaleMin;
            return this;
        }

        /**
         * <p>The maximum number of read-only nodes. Valid values: 0 to 15. The value must be greater than or equal to the value of ScaleRoNumMin.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder scaleRoNumMax(String scaleRoNumMax) {
            this.putQueryParameter("ScaleRoNumMax", scaleRoNumMax);
            this.scaleRoNumMax = scaleRoNumMax;
            return this;
        }

        /**
         * <p>The minimum number of read-only nodes. Valid values: 0 to 15.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder scaleRoNumMin(String scaleRoNumMin) {
            this.putQueryParameter("ScaleRoNumMin", scaleRoNumMin);
            this.scaleRoNumMin = scaleRoNumMin;
            return this;
        }

        /**
         * <p>The period of inactivity in minutes before the cluster is automatically paused. The value must be a multiple of 5 and range from 5 to 1440.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder secondsUntilAutoPause(String secondsUntilAutoPause) {
            this.putQueryParameter("SecondsUntilAutoPause", secondsUntilAutoPause);
            this.secondsUntilAutoPause = secondsUntilAutoPause;
            return this;
        }

        /**
         * <p>The CPU utilization percentage that triggers a scale-up. Valid values: 40 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder serverlessRuleCpuEnlargeThreshold(String serverlessRuleCpuEnlargeThreshold) {
            this.putQueryParameter("ServerlessRuleCpuEnlargeThreshold", serverlessRuleCpuEnlargeThreshold);
            this.serverlessRuleCpuEnlargeThreshold = serverlessRuleCpuEnlargeThreshold;
            return this;
        }

        /**
         * <p>The CPU utilization percentage that triggers a scale-down. Valid values: 10 to 100. The value of ServerlessRuleCpuEnlargeThreshold minus the value of this parameter must be 30 or greater.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder serverlessRuleCpuShrinkThreshold(String serverlessRuleCpuShrinkThreshold) {
            this.putQueryParameter("ServerlessRuleCpuShrinkThreshold", serverlessRuleCpuShrinkThreshold);
            this.serverlessRuleCpuShrinkThreshold = serverlessRuleCpuShrinkThreshold;
            return this;
        }

        /**
         * <p>The scaling sensitivity. Valid values:</p>
         * <ul>
         * <li><p>normal: standard</p>
         * </li>
         * <li><p>flexible: flexible</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder serverlessRuleMode(String serverlessRuleMode) {
            this.putQueryParameter("ServerlessRuleMode", serverlessRuleMode);
            this.serverlessRuleMode = serverlessRuleMode;
            return this;
        }

        /**
         * <p>The start time of the task. Use the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in Coordinated Universal Time (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-14T00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public CreateCronJobPolicyServerlessRequest build() {
            return new CreateCronJobPolicyServerlessRequest(this);
        } 

    } 

}
