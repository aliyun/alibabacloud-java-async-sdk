// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPodEventsRequest} extends {@link RequestModel}
 *
 * <p>GetPodEventsRequest</p>
 */
public class GetPodEventsRequest extends Request {
    @Path
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    @Path
    @NameInMap("PodId")
    @Validation(required = true)
    private String podId;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("MaxEventsNum")
    private Integer maxEventsNum;

    @Query
    @NameInMap("PodUid")
    private String podUid;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private GetPodEventsRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.podId = builder.podId;
        this.endTime = builder.endTime;
        this.maxEventsNum = builder.maxEventsNum;
        this.podUid = builder.podUid;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPodEventsRequest create() {
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
     * @return podId
     */
    public String getPodId() {
        return this.podId;
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
     * @return podUid
     */
    public String getPodUid() {
        return this.podUid;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetPodEventsRequest, Builder> {
        private String jobId; 
        private String podId; 
        private String endTime; 
        private Integer maxEventsNum; 
        private String podUid; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetPodEventsRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.podId = request.podId;
            this.endTime = request.endTime;
            this.maxEventsNum = request.maxEventsNum;
            this.podUid = request.podUid;
            this.startTime = request.startTime;
        } 

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putPathParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * PodId.
         */
        public Builder podId(String podId) {
            this.putPathParameter("PodId", podId);
            this.podId = podId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * MaxEventsNum.
         */
        public Builder maxEventsNum(Integer maxEventsNum) {
            this.putQueryParameter("MaxEventsNum", maxEventsNum);
            this.maxEventsNum = maxEventsNum;
            return this;
        }

        /**
         * PodUid.
         */
        public Builder podUid(String podUid) {
            this.putQueryParameter("PodUid", podUid);
            this.podUid = podUid;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetPodEventsRequest build() {
            return new GetPodEventsRequest(this);
        } 

    } 

}
