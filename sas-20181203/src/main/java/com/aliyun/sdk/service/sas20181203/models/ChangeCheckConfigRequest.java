// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeCheckConfigRequest} extends {@link RequestModel}
 *
 * <p>ChangeCheckConfigRequest</p>
 */
public class ChangeCheckConfigRequest extends Request {
    @Query
    @NameInMap("CycleDays")
    private java.util.List < Integer > cycleDays;

    @Query
    @NameInMap("EndTime")
    private Integer endTime;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StandardIds")
    private java.util.List < Long > standardIds;

    @Query
    @NameInMap("StartTime")
    private Integer startTime;

    private ChangeCheckConfigRequest(Builder builder) {
        super(builder);
        this.cycleDays = builder.cycleDays;
        this.endTime = builder.endTime;
        this.regionId = builder.regionId;
        this.standardIds = builder.standardIds;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeCheckConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cycleDays
     */
    public java.util.List < Integer > getCycleDays() {
        return this.cycleDays;
    }

    /**
     * @return endTime
     */
    public Integer getEndTime() {
        return this.endTime;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return standardIds
     */
    public java.util.List < Long > getStandardIds() {
        return this.standardIds;
    }

    /**
     * @return startTime
     */
    public Integer getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ChangeCheckConfigRequest, Builder> {
        private java.util.List < Integer > cycleDays; 
        private Integer endTime; 
        private String regionId; 
        private java.util.List < Long > standardIds; 
        private Integer startTime; 

        private Builder() {
            super();
        } 

        private Builder(ChangeCheckConfigRequest request) {
            super(request);
            this.cycleDays = request.cycleDays;
            this.endTime = request.endTime;
            this.regionId = request.regionId;
            this.standardIds = request.standardIds;
            this.startTime = request.startTime;
        } 

        /**
         * CycleDays.
         */
        public Builder cycleDays(java.util.List < Integer > cycleDays) {
            this.putQueryParameter("CycleDays", cycleDays);
            this.cycleDays = cycleDays;
            return this;
        }

        /**
         * The end time of the check. The value specifies a point in time in a day. The time period that is specified by the start time and end time must be one of the following time periods:
         * <p>
         * 
         * *   **00:00 to 06:00:** If you set the StartTime parameter to 0, you must set the EndTime parameter to 6.
         * *   **06:00 to 12:00**: If you set the StartTime parameter to 6, you must set the EndTime parameter to 12.
         * *   **12:00 to 18:00**: If you set the StartTime parameter to 12, you must set the EndTime parameter to 18.
         * *  **18:00 to 24:00:** If you set the StartTime parameter to 18, you must set the EndTime parameter to 24.
         */
        public Builder endTime(Integer endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The region ID of the bastion host to query.
         * <p>
         * 
         * >  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * An array that consists of the information about the check item.
         */
        public Builder standardIds(java.util.List < Long > standardIds) {
            this.putQueryParameter("StandardIds", standardIds);
            this.standardIds = standardIds;
            return this;
        }

        /**
         * The start time of the check. The value specifies a point in time in a day.
         */
        public Builder startTime(Integer startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ChangeCheckConfigRequest build() {
            return new ChangeCheckConfigRequest(this);
        } 

    } 

}
