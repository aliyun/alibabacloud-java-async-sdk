// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateAutoSnapshotPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateAutoSnapshotPolicyRequest</p>
 */
public class CreateAutoSnapshotPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepeatWeekdays")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > repeatWeekdays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetentionDays")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 65536)
    private Integer retentionDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimePoints")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>policyTest</p>
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
         * <p>This parameter is required.</p>
         */
        public Builder repeatWeekdays(java.util.List < String > repeatWeekdays) {
            String repeatWeekdaysShrink = shrink(repeatWeekdays, "RepeatWeekdays", "json");
            this.putQueryParameter("RepeatWeekdays", repeatWeekdaysShrink);
            this.repeatWeekdays = repeatWeekdays;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder retentionDays(Integer retentionDays) {
            this.putQueryParameter("RetentionDays", retentionDays);
            this.retentionDays = retentionDays;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
