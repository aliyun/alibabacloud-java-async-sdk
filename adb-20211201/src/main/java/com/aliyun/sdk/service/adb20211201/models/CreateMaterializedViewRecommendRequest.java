// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link CreateMaterializedViewRecommendRequest} extends {@link RequestModel}
 *
 * <p>CreateMaterializedViewRecommendRequest</p>
 */
public class CreateMaterializedViewRecommendRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinRewriteQueryCount")
    private Integer minRewriteQueryCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinRewriteQueryPattern")
    private Integer minRewriteQueryPattern;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanQueriesRange")
    private Integer scanQueriesRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SchedulingDay")
    private String schedulingDay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SchedulingPolicy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String schedulingPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlowQueryThreshold")
    private Integer slowQueryThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecifiedTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String specifiedTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    private CreateMaterializedViewRecommendRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.description = builder.description;
        this.minRewriteQueryCount = builder.minRewriteQueryCount;
        this.minRewriteQueryPattern = builder.minRewriteQueryPattern;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scanQueriesRange = builder.scanQueriesRange;
        this.schedulingDay = builder.schedulingDay;
        this.schedulingPolicy = builder.schedulingPolicy;
        this.slowQueryThreshold = builder.slowQueryThreshold;
        this.specifiedTime = builder.specifiedTime;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMaterializedViewRecommendRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return minRewriteQueryCount
     */
    public Integer getMinRewriteQueryCount() {
        return this.minRewriteQueryCount;
    }

    /**
     * @return minRewriteQueryPattern
     */
    public Integer getMinRewriteQueryPattern() {
        return this.minRewriteQueryPattern;
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
     * @return scanQueriesRange
     */
    public Integer getScanQueriesRange() {
        return this.scanQueriesRange;
    }

    /**
     * @return schedulingDay
     */
    public String getSchedulingDay() {
        return this.schedulingDay;
    }

    /**
     * @return schedulingPolicy
     */
    public String getSchedulingPolicy() {
        return this.schedulingPolicy;
    }

    /**
     * @return slowQueryThreshold
     */
    public Integer getSlowQueryThreshold() {
        return this.slowQueryThreshold;
    }

    /**
     * @return specifiedTime
     */
    public String getSpecifiedTime() {
        return this.specifiedTime;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<CreateMaterializedViewRecommendRequest, Builder> {
        private String DBClusterId; 
        private String description; 
        private Integer minRewriteQueryCount; 
        private Integer minRewriteQueryPattern; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer scanQueriesRange; 
        private String schedulingDay; 
        private String schedulingPolicy; 
        private Integer slowQueryThreshold; 
        private String specifiedTime; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(CreateMaterializedViewRecommendRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.description = request.description;
            this.minRewriteQueryCount = request.minRewriteQueryCount;
            this.minRewriteQueryPattern = request.minRewriteQueryPattern;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scanQueriesRange = request.scanQueriesRange;
            this.schedulingDay = request.schedulingDay;
            this.schedulingPolicy = request.schedulingPolicy;
            this.slowQueryThreshold = request.slowQueryThreshold;
            this.specifiedTime = request.specifiedTime;
            this.taskName = request.taskName;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-8vbwm***</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The description of the recommendation task.</p>
         * 
         * <strong>example:</strong>
         * <p>task desc</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Pattern匹配的最少慢查询个数</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder minRewriteQueryCount(Integer minRewriteQueryCount) {
            this.putQueryParameter("MinRewriteQueryCount", minRewriteQueryCount);
            this.minRewriteQueryCount = minRewriteQueryCount;
            return this;
        }

        /**
         * <p>最小可加速的Pattern数量</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder minRewriteQueryPattern(Integer minRewriteQueryPattern) {
            this.putQueryParameter("MinRewriteQueryPattern", minRewriteQueryPattern);
            this.minRewriteQueryPattern = minRewriteQueryPattern;
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
         * <p>The time range for scanning data. Unit: days. Default value: 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder scanQueriesRange(Integer scanQueriesRange) {
            this.putQueryParameter("ScanQueriesRange", scanQueriesRange);
            this.scanQueriesRange = scanQueriesRange;
            return this;
        }

        /**
         * <p>This parameter is valid only when SchedulingPolicy is set to weekly. Valid values:</p>
         * <ul>
         * <li>Monday</li>
         * <li>Tuesday</li>
         * <li>Wednesday</li>
         * <li>Thursday</li>
         * <li>Friday</li>
         * <li>Saturday</li>
         * <li>Sunday</li>
         * </ul>
         * <p>Separate multiple days with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>Monday;Wednesday</p>
         */
        public Builder schedulingDay(String schedulingDay) {
            this.putQueryParameter("SchedulingDay", schedulingDay);
            this.schedulingDay = schedulingDay;
            return this;
        }

        /**
         * <p>The scheduling policy of the recommendation task. Valid values:</p>
         * <p>daily</p>
         * <p>weekly</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>weekly</p>
         */
        public Builder schedulingPolicy(String schedulingPolicy) {
            this.putQueryParameter("SchedulingPolicy", schedulingPolicy);
            this.schedulingPolicy = schedulingPolicy;
            return this;
        }

        /**
         * <p>慢查询阈值</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder slowQueryThreshold(Integer slowQueryThreshold) {
            this.putQueryParameter("SlowQueryThreshold", slowQueryThreshold);
            this.slowQueryThreshold = slowQueryThreshold;
            return this;
        }

        /**
         * <p>The execution time of the recommendation task. Specify the time in the HH:MM:SS format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10:00:00</p>
         */
        public Builder specifiedTime(String specifiedTime) {
            this.putQueryParameter("SpecifiedTime", specifiedTime);
            this.specifiedTime = specifiedTime;
            return this;
        }

        /**
         * <p>The name of the recommendation task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>task_n1</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public CreateMaterializedViewRecommendRequest build() {
            return new CreateMaterializedViewRecommendRequest(this);
        } 

    } 

}
