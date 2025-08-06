// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDailyAsyncJobRequest} extends {@link RequestModel}
 *
 * <p>DescribeDailyAsyncJobRequest</p>
 */
public class DescribeDailyAsyncJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobState")
    private String jobState;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeDailyAsyncJobRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.jobState = builder.jobState;
        this.jobType = builder.jobType;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDailyAsyncJobRequest create() {
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
     * @return jobState
     */
    public String getJobState() {
        return this.jobState;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDailyAsyncJobRequest, Builder> {
        private String endTime; 
        private String jobState; 
        private String jobType; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDailyAsyncJobRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.jobState = request.jobState;
            this.jobType = request.jobType;
            this.startTime = request.startTime;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * JobState.
         */
        public Builder jobState(String jobState) {
            this.putQueryParameter("JobState", jobState);
            this.jobState = jobState;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder jobType(String jobType) {
            this.putQueryParameter("JobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDailyAsyncJobRequest build() {
            return new DescribeDailyAsyncJobRequest(this);
        } 

    } 

}
