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
    @NameInMap("StandardIds")
    private java.util.List < Long > standardIds;

    @Query
    @NameInMap("StartTime")
    private Integer startTime;

    private ChangeCheckConfigRequest(Builder builder) {
        super(builder);
        this.cycleDays = builder.cycleDays;
        this.endTime = builder.endTime;
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
        private java.util.List < Long > standardIds; 
        private Integer startTime; 

        private Builder() {
            super();
        } 

        private Builder(ChangeCheckConfigRequest request) {
            super(request);
            this.cycleDays = request.cycleDays;
            this.endTime = request.endTime;
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
         * EndTime.
         */
        public Builder endTime(Integer endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * StandardIds.
         */
        public Builder standardIds(java.util.List < Long > standardIds) {
            this.putQueryParameter("StandardIds", standardIds);
            this.standardIds = standardIds;
            return this;
        }

        /**
         * StartTime.
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
