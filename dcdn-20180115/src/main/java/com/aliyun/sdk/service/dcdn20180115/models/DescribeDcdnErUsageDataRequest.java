// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnErUsageDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnErUsageDataRequest</p>
 */
public class DescribeDcdnErUsageDataRequest extends Request {
    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("RoutineID")
    private String routineID;

    @Query
    @NameInMap("Spec")
    private String spec;

    @Query
    @NameInMap("SplitBy")
    private String splitBy;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private DescribeDcdnErUsageDataRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.routineID = builder.routineID;
        this.spec = builder.spec;
        this.splitBy = builder.splitBy;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnErUsageDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return routineID
     */
    public String getRoutineID() {
        return this.routineID;
    }

    /**
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    /**
     * @return splitBy
     */
    public String getSplitBy() {
        return this.splitBy;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnErUsageDataRequest, Builder> {
        private String endTime; 
        private String routineID; 
        private String spec; 
        private String splitBy; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnErUsageDataRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.routineID = request.routineID;
            this.spec = request.spec;
            this.splitBy = request.splitBy;
            this.startTime = request.startTime;
        } 

        /**
         * The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         * <p>
         * 
         * > The end time must be later than the start time.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The ID of the routine.
         */
        public Builder routineID(String routineID) {
            this.putQueryParameter("RoutineID", routineID);
            this.routineID = routineID;
            return this;
        }

        /**
         * The specification of the routine. Valid values:
         * <p>
         * 
         * *   5ms
         * *   50ms
         * *   100ms
         */
        public Builder spec(String spec) {
            this.putQueryParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        /**
         * Specifies how the results are grouped. If you set this parameter to routine, the returned results are grouped based on the routine ID. If you set this parameter to spec, the returned results are grouped based on the routine specification.
         * <p>
         * 
         * > If you leave this parameter empty, the returned results are not grouped.
         */
        public Builder splitBy(String splitBy) {
            this.putQueryParameter("SplitBy", splitBy);
            this.splitBy = splitBy;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDcdnErUsageDataRequest build() {
            return new DescribeDcdnErUsageDataRequest(this);
        } 

    } 

}
