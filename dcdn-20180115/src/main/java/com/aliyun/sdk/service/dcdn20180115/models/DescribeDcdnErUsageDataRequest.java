// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnErUsageDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnErUsageDataRequest</p>
 */
public class DescribeDcdnErUsageDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoutineID")
    private String routineID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Spec")
    private String spec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SplitBy")
    private String splitBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
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
         * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <blockquote>
         * <p>The end time must be later than the start time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2018-10-31T16:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the routine.</p>
         * 
         * <strong>example:</strong>
         * <p>routine1.test</p>
         */
        public Builder routineID(String routineID) {
            this.putQueryParameter("RoutineID", routineID);
            this.routineID = routineID;
            return this;
        }

        /**
         * <p>The specification of the routine. Valid values:</p>
         * <ul>
         * <li>5ms</li>
         * <li>50ms</li>
         * <li>100ms</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>50ms</p>
         */
        public Builder spec(String spec) {
            this.putQueryParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        /**
         * <p>Specifies how the results are grouped. If you set this parameter to routine, the returned results are grouped based on the routine ID. If you set this parameter to spec, the returned results are grouped based on the routine specification.</p>
         * <blockquote>
         * <p>If you leave this parameter empty, the returned results are not grouped.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>routine</p>
         */
        public Builder splitBy(String splitBy) {
            this.putQueryParameter("SplitBy", splitBy);
            this.splitBy = splitBy;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-10-30T16:00:00Z</p>
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
