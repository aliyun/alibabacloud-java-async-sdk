// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAutoSnapshotPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateAutoSnapshotPolicyRequest</p>
 */
public class CreateAutoSnapshotPolicyRequest extends Request {
    @Query
    @NameInMap("CronExpression")
    @Validation(required = true)
    private String cronExpression;

    @Query
    @NameInMap("PolicyName")
    @Validation(required = true, maxLength = 128, minLength = 2)
    private String policyName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RetentionDays")
    @Validation(required = true)
    private Integer retentionDays;

    private CreateAutoSnapshotPolicyRequest(Builder builder) {
        super(builder);
        this.cronExpression = builder.cronExpression;
        this.policyName = builder.policyName;
        this.regionId = builder.regionId;
        this.retentionDays = builder.retentionDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAutoSnapshotPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cronExpression
     */
    public String getCronExpression() {
        return this.cronExpression;
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return retentionDays
     */
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    public static final class Builder extends Request.Builder<CreateAutoSnapshotPolicyRequest, Builder> {
        private String cronExpression; 
        private String policyName; 
        private String regionId; 
        private Integer retentionDays; 

        private Builder() {
            super();
        } 

        private Builder(CreateAutoSnapshotPolicyRequest request) {
            super(request);
            this.cronExpression = request.cronExpression;
            this.policyName = request.policyName;
            this.regionId = request.regionId;
            this.retentionDays = request.retentionDays;
        } 

        /**
         * The CRON expression for periodic scheduling.
         */
        public Builder cronExpression(String cronExpression) {
            this.putQueryParameter("CronExpression", cronExpression);
            this.cronExpression = cronExpression;
            return this;
        }

        /**
         * The name of the automatic snapshot policy.
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * The ID of the region where the automatic snapshot policy is created. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The retention period of automatic snapshots. Unit: days. Valid values:
         * <p>
         * 
         * *   \-1: Automatic snapshots are retained until they are deleted.
         * *   1 to 65536: Automatic snapshots are retained for the specified number of days.
         */
        public Builder retentionDays(Integer retentionDays) {
            this.putQueryParameter("RetentionDays", retentionDays);
            this.retentionDays = retentionDays;
            return this;
        }

        @Override
        public CreateAutoSnapshotPolicyRequest build() {
            return new CreateAutoSnapshotPolicyRequest(this);
        } 

    } 

}
