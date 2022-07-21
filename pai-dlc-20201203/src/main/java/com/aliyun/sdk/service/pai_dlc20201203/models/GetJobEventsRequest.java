// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobEventsRequest} extends {@link RequestModel}
 *
 * <p>GetJobEventsRequest</p>
 */
public class GetJobEventsRequest extends Request {
    @Path
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("MaxEventsNum")
    @Validation(maximum = 10000, minimum = 1)
    private Integer maxEventsNum;

    @Query
    @NameInMap("StartTime")
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
         * 作业ID
         */
        public Builder jobId(String jobId) {
            this.putPathParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * 查询事件的时间区间的截止时间，默认值是当前。
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * 获取事件的最大数目，默认值：2000
         */
        public Builder maxEventsNum(Integer maxEventsNum) {
            this.putQueryParameter("MaxEventsNum", maxEventsNum);
            this.maxEventsNum = maxEventsNum;
            return this;
        }

        /**
         * 查询事件的时间区间的起始时间，默认值是7天前。
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
