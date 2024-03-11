// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdc20201214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIceDurPeriodByDaySubTypeRequest} extends {@link RequestModel}
 *
 * <p>DescribeIceDurPeriodByDaySubTypeRequest</p>
 */
public class DescribeIceDurPeriodByDaySubTypeRequest extends Request {
    @Query
    @NameInMap("EndTs")
    @Validation(required = true)
    private Long endTs;

    @Query
    @NameInMap("JobType")
    @Validation(required = true)
    private String jobType;

    @Query
    @NameInMap("StartTs")
    @Validation(required = true)
    private Long startTs;

    @Query
    @NameInMap("TimeZone")
    @Validation(required = true)
    private String timeZone;

    private DescribeIceDurPeriodByDaySubTypeRequest(Builder builder) {
        super(builder);
        this.endTs = builder.endTs;
        this.jobType = builder.jobType;
        this.startTs = builder.startTs;
        this.timeZone = builder.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIceDurPeriodByDaySubTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTs
     */
    public Long getEndTs() {
        return this.endTs;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return startTs
     */
    public Long getStartTs() {
        return this.startTs;
    }

    /**
     * @return timeZone
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    public static final class Builder extends Request.Builder<DescribeIceDurPeriodByDaySubTypeRequest, Builder> {
        private Long endTs; 
        private String jobType; 
        private Long startTs; 
        private String timeZone; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIceDurPeriodByDaySubTypeRequest request) {
            super(request);
            this.endTs = request.endTs;
            this.jobType = request.jobType;
            this.startTs = request.startTs;
            this.timeZone = request.timeZone;
        } 

        /**
         * EndTs.
         */
        public Builder endTs(Long endTs) {
            this.putQueryParameter("EndTs", endTs);
            this.endTs = endTs;
            return this;
        }

        /**
         * JobType.
         */
        public Builder jobType(String jobType) {
            this.putQueryParameter("JobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * StartTs.
         */
        public Builder startTs(Long startTs) {
            this.putQueryParameter("StartTs", startTs);
            this.startTs = startTs;
            return this;
        }

        /**
         * TimeZone.
         */
        public Builder timeZone(String timeZone) {
            this.putQueryParameter("TimeZone", timeZone);
            this.timeZone = timeZone;
            return this;
        }

        @Override
        public DescribeIceDurPeriodByDaySubTypeRequest build() {
            return new DescribeIceDurPeriodByDaySubTypeRequest(this);
        } 

    } 

}
