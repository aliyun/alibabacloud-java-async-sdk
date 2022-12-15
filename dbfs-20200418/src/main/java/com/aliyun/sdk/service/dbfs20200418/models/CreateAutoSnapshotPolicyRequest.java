// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

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
    @NameInMap("PolicyName")
    @Validation(required = true)
    private String policyName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RepeatWeekdays")
    @Validation(required = true)
    private java.util.List < String > repeatWeekdays;

    @Query
    @NameInMap("RetentionDays")
    @Validation(required = true, maximum = 65536)
    private Integer retentionDays;

    @Query
    @NameInMap("TimePoints")
    @Validation(required = true)
    private java.util.List < String > timePoints;

    private CreateAutoSnapshotPolicyRequest(Builder builder) {
        super(builder);
        this.policyName = builder.policyName;
        this.regionId = builder.regionId;
        this.repeatWeekdays = builder.repeatWeekdays;
        this.retentionDays = builder.retentionDays;
        this.timePoints = builder.timePoints;
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

    public static final class Builder extends Request.Builder<CreateAutoSnapshotPolicyRequest, Builder> {
        private String policyName; 
        private String regionId; 
        private java.util.List < String > repeatWeekdays; 
        private Integer retentionDays; 
        private java.util.List < String > timePoints; 

        private Builder() {
            super();
        } 

        private Builder(CreateAutoSnapshotPolicyRequest request) {
            super(request);
            this.policyName = request.policyName;
            this.regionId = request.regionId;
            this.repeatWeekdays = request.repeatWeekdays;
            this.retentionDays = request.retentionDays;
            this.timePoints = request.timePoints;
        } 

        /**
         * 自动快照策略名称
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 重复星期
         */
        public Builder repeatWeekdays(java.util.List < String > repeatWeekdays) {
            String repeatWeekdaysShrink = shrink(repeatWeekdays, "RepeatWeekdays", "json");
            this.putQueryParameter("RepeatWeekdays", repeatWeekdaysShrink);
            this.repeatWeekdays = repeatWeekdays;
            return this;
        }

        /**
         * 保留天数
         */
        public Builder retentionDays(Integer retentionDays) {
            this.putQueryParameter("RetentionDays", retentionDays);
            this.retentionDays = retentionDays;
            return this;
        }

        /**
         * 重复时间
         */
        public Builder timePoints(java.util.List < String > timePoints) {
            String timePointsShrink = shrink(timePoints, "TimePoints", "json");
            this.putQueryParameter("TimePoints", timePointsShrink);
            this.timePoints = timePoints;
            return this;
        }

        @Override
        public CreateAutoSnapshotPolicyRequest build() {
            return new CreateAutoSnapshotPolicyRequest(this);
        } 

    } 

}
