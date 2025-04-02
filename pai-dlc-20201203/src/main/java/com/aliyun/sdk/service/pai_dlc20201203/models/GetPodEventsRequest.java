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
 * {@link GetPodEventsRequest} extends {@link RequestModel}
 *
 * <p>GetPodEventsRequest</p>
 */
public class GetPodEventsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("PodId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String podId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxEventsNum")
    private Integer maxEventsNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PodUid")
    private String podUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
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
         * <p>The job ID. Call <a href="https://help.aliyun.com/document_detail/459676.html">ListJobs</a> to get the job ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc-20210126170216-*****</p>
         */
        public Builder jobId(String jobId) {
            this.putPathParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The node ID. Call <a href="https://help.aliyun.com/document_detail/459677.html">GetJob</a> to get the node ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc-20210126170216-mtl37ge7gkvdz-chief-0</p>
         */
        public Builder podId(String podId) {
            this.putPathParameter("PodId", podId);
            this.podId = podId;
            return this;
        }

        /**
         * <p>The end time (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-09T16:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The maximum number of events that can be returned.</p>
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
         * <p>The node UID. Call <a href="https://help.aliyun.com/document_detail/459677.html">GetJob</a> to get the node UID.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc-20210126170216-*****-chief-0</p>
         */
        public Builder podUid(String podUid) {
            this.putQueryParameter("PodUid", podUid);
            this.podUid = podUid;
            return this;
        }

        /**
         * <p>The start time (UTC).</p>
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
        public GetPodEventsRequest build() {
            return new GetPodEventsRequest(this);
        } 

    } 

}
