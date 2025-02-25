// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyAutoSnapshotPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyAutoSnapshotPolicyRequest</p>
 */
public class ModifyAutoSnapshotPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyName")
    private String policyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepeatWeekdays")
    private java.util.List < String > repeatWeekdays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetentionDays")
    @com.aliyun.core.annotation.Validation(maximum = 65536)
    private Integer retentionDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimePoints")
    private java.util.List < String > timePoints;

    private ModifyAutoSnapshotPolicyRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
        this.policyName = builder.policyName;
        this.regionId = builder.regionId;
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
     * @return repeatWeekdays
     */
    public java.util.List < String > getRepeatWeekdays() {
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
    public java.util.List < String > getTimePoints() {
        return this.timePoints;
    }

    public static final class Builder extends Request.Builder<ModifyAutoSnapshotPolicyRequest, Builder> {
        private String policyId; 
        private String policyName; 
        private String regionId; 
        private java.util.List < String > repeatWeekdays; 
        private Integer retentionDays; 
        private java.util.List < String > timePoints; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAutoSnapshotPolicyRequest request) {
            super(request);
            this.policyId = request.policyId;
            this.policyName = request.policyName;
            this.regionId = request.regionId;
            this.repeatWeekdays = request.repeatWeekdays;
            this.retentionDays = request.retentionDays;
            this.timePoints = request.timePoints;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-z5siir3iq3m**********</p>
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * PolicyName.
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
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
         * RepeatWeekdays.
         */
        public Builder repeatWeekdays(java.util.List < String > repeatWeekdays) {
            String repeatWeekdaysShrink = shrink(repeatWeekdays, "RepeatWeekdays", "json");
            this.putQueryParameter("RepeatWeekdays", repeatWeekdaysShrink);
            this.repeatWeekdays = repeatWeekdays;
            return this;
        }

        /**
         * RetentionDays.
         */
        public Builder retentionDays(Integer retentionDays) {
            this.putQueryParameter("RetentionDays", retentionDays);
            this.retentionDays = retentionDays;
            return this;
        }

        /**
         * TimePoints.
         */
        public Builder timePoints(java.util.List < String > timePoints) {
            String timePointsShrink = shrink(timePoints, "TimePoints", "json");
            this.putQueryParameter("TimePoints", timePointsShrink);
            this.timePoints = timePoints;
            return this;
        }

        @Override
        public ModifyAutoSnapshotPolicyRequest build() {
            return new ModifyAutoSnapshotPolicyRequest(this);
        } 

    } 

}
