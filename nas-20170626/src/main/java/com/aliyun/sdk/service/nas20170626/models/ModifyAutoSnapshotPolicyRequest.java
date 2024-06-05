// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAutoSnapshotPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyAutoSnapshotPolicyRequest</p>
 */
public class ModifyAutoSnapshotPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String autoSnapshotPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicyName")
    private String autoSnapshotPolicyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepeatWeekdays")
    private String repeatWeekdays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetentionDays")
    @com.aliyun.core.annotation.Validation(maximum = 65536)
    private Integer retentionDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimePoints")
    private String timePoints;

    private ModifyAutoSnapshotPolicyRequest(Builder builder) {
        super(builder);
        this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
        this.autoSnapshotPolicyName = builder.autoSnapshotPolicyName;
        this.repeatWeekdays = builder.repeatWeekdays;
        this.retentionDays = builder.retentionDays;
        this.timePoints = builder.timePoints;
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
     * @return autoSnapshotPolicyId
     */
    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

    /**
     * @return autoSnapshotPolicyName
     */
    public String getAutoSnapshotPolicyName() {
        return this.autoSnapshotPolicyName;
    }

    /**
     * @return repeatWeekdays
     */
    public String getRepeatWeekdays() {
        return this.repeatWeekdays;
    }

    /**
     * @return retentionDays
     */
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    /**
     * @return timePoints
     */
    public String getTimePoints() {
        return this.timePoints;
    }

    public static final class Builder extends Request.Builder<ModifyAutoSnapshotPolicyRequest, Builder> {
        private String autoSnapshotPolicyId; 
        private String autoSnapshotPolicyName; 
        private String repeatWeekdays; 
        private Integer retentionDays; 
        private String timePoints; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAutoSnapshotPolicyRequest request) {
            super(request);
            this.autoSnapshotPolicyId = request.autoSnapshotPolicyId;
            this.autoSnapshotPolicyName = request.autoSnapshotPolicyName;
            this.repeatWeekdays = request.repeatWeekdays;
            this.retentionDays = request.retentionDays;
            this.timePoints = request.timePoints;
        } 

        /**
         * The ID of the automatic snapshot policy.
         * <p>
         * 
         * You can call the DescribeAutoSnapshotPolicies operation to view available automatic snapshot policies.
         */
        public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.putQueryParameter("AutoSnapshotPolicyId", autoSnapshotPolicyId);
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }

        /**
         * The name of the automatic snapshot policy. If you do not specify this parameter, the policy name is not changed.
         * <p>
         * 
         * Limits:
         * 
         * *   The name must be 2 to 128 characters in length.
         * *   The name must start with a letter.
         * *   The name can contain digits, letters, colons (:), underscores (\_), and hyphens (-). It cannot start with `http://` or `https://`.
         */
        public Builder autoSnapshotPolicyName(String autoSnapshotPolicyName) {
            this.putQueryParameter("AutoSnapshotPolicyName", autoSnapshotPolicyName);
            this.autoSnapshotPolicyName = autoSnapshotPolicyName;
            return this;
        }

        /**
         * The days of a week on which auto snapshots are created.
         * <p>
         * 
         * Cycle: week.
         * 
         * Valid values: 1 to 7. The value 1 indicates Monday. If you want to create multiple auto snapshots within a week, you can specify multiple days from Monday to Sunday and separate the days with commas (,). You can specify a maximum of seven days.
         */
        public Builder repeatWeekdays(String repeatWeekdays) {
            this.putQueryParameter("RepeatWeekdays", repeatWeekdays);
            this.repeatWeekdays = repeatWeekdays;
            return this;
        }

        /**
         * The retention period of auto snapshots.
         * <p>
         * 
         * Unit: days.
         * 
         * Valid values:
         * 
         * *   \-1 (default): Auto snapshots are permanently retained. After the number of auto snapshots exceeds the upper limit, the earliest auto snapshot is automatically deleted.
         * *   1 to 65536: Auto snapshots are retained for the specified number of days. After the retention period of auto snapshots expires, the auto snapshots are automatically deleted.
         */
        public Builder retentionDays(Integer retentionDays) {
            this.putQueryParameter("RetentionDays", retentionDays);
            this.retentionDays = retentionDays;
            return this;
        }

        /**
         * The points in time at which auto snapshots are created.
         * <p>
         * 
         * Unit: hours.
         * 
         * Valid values: 0 to 23. The values from 0 to 23 indicate a total of 24 hours from 00:00 to 23:00. For example, the value 1 indicates 01:00. If you want to create multiple auto snapshots within a day, you can specify multiple points in time and separate the points in time with commas (,). You can specify a maximum of 24 points in time.
         */
        public Builder timePoints(String timePoints) {
            this.putQueryParameter("TimePoints", timePoints);
            this.timePoints = timePoints;
            return this;
        }

        @Override
        public ModifyAutoSnapshotPolicyRequest build() {
            return new ModifyAutoSnapshotPolicyRequest(this);
        } 

    } 

}
