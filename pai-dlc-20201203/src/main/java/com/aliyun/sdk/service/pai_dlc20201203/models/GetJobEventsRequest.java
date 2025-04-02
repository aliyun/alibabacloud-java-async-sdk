// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link GetJobEventsRequest} extends {@link RequestModel}
 *
 * <p>GetJobEventsRequest</p>
 */
public class GetJobEventsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxEventsNum")
    @com.aliyun.core.annotation.Validation(maximum = 10000, minimum = 1)
    private Integer maxEventsNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private GetJobEventsRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.endTime = builder.endTime;
        this.maxEventsNum = builder.maxEventsNum;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobEventsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return maxEventsNum
     */
    public Integer getMaxEventsNum() {
        return this.maxEventsNum;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetJobEventsRequest, Builder> {
        private String jobId; 
        private String endTime; 
        private Integer maxEventsNum; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetJobEventsRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.endTime = request.endTime;
            this.maxEventsNum = request.maxEventsNum;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The job ID. Call <a href="https://help.aliyun.com/document_detail/459676.html">ListJobs</a> to get the job ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc-20210126170216-*******</p>
         */
        public Builder jobId(String jobId) {
            this.putPathParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The end time (UTC) of the time range for querying events. The default value is the current time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-08T18:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The maximum number of events that can be returned. Default value: 2000.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxEventsNum(Integer maxEventsNum) {
            this.putQueryParameter("MaxEventsNum", maxEventsNum);
            this.maxEventsNum = maxEventsNum;
            return this;
        }

        /**
         * <p>The start time (UTC) of the time range for querying events. The default value is 7 days ago.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-08T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetJobEventsRequest build() {
            return new GetJobEventsRequest(this);
        } 

    } 

}
