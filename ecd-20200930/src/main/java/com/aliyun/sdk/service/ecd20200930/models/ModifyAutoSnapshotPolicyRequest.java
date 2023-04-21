// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAutoSnapshotPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyAutoSnapshotPolicyRequest</p>
 */
public class ModifyAutoSnapshotPolicyRequest extends Request {
    @Query
    @NameInMap("CronExpression")
    private String cronExpression;

    @Query
    @NameInMap("PolicyId")
    @Validation(required = true)
    private String policyId;

    @Query
    @NameInMap("PolicyName")
    @Validation(maxLength = 128, minLength = 2)
    private String policyName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RetentionDays")
    private Integer retentionDays;

    private ModifyAutoSnapshotPolicyRequest(Builder builder) {
        super(builder);
        this.cronExpression = builder.cronExpression;
        this.policyId = builder.policyId;
        this.policyName = builder.policyName;
        this.regionId = builder.regionId;
        this.retentionDays = builder.retentionDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAutoSnapshotPolicyRequest create() {
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
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
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

    public static final class Builder extends Request.Builder<ModifyAutoSnapshotPolicyRequest, Builder> {
        private String cronExpression; 
        private String policyId; 
        private String policyName; 
        private String regionId; 
        private Integer retentionDays; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAutoSnapshotPolicyRequest request) {
            super(request);
            this.cronExpression = request.cronExpression;
            this.policyId = request.policyId;
            this.policyName = request.policyName;
            this.regionId = request.regionId;
            this.retentionDays = request.retentionDays;
        } 

        /**
         * The CRON expression.
         */
        public Builder cronExpression(String cronExpression) {
            this.putQueryParameter("CronExpression", cronExpression);
            this.cronExpression = cronExpression;
            return this;
        }

        /**
         * The ID of the automatic snapshot policy.
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * The name of the automatic snapshot policy. The name must be 2 to 128 characters in length. The name can contain letters, digits, colons (:), underscores (\_), and hyphens (-). It must start with a letter but cannot start with [http:// or https://. The name can contain letters, digits, colons (:), underscores (\_), and hyphens (-). Default value: null.](http://https://。、（:）、（\_）（-）。：。)
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * The ID of the region where the automatic snapshot policy is created.
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
         * *   1 (default): The automatic snapshots are permanently retained.
         * *   1 to 65536: The automatic snapshots are retained for the specified number of days.
         */
        public Builder retentionDays(Integer retentionDays) {
            this.putQueryParameter("RetentionDays", retentionDays);
            this.retentionDays = retentionDays;
            return this;
        }

        @Override
        public ModifyAutoSnapshotPolicyRequest build() {
            return new ModifyAutoSnapshotPolicyRequest(this);
        } 

    } 

}
