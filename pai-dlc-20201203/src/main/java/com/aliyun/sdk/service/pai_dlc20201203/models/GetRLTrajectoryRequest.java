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
 * {@link GetRLTrajectoryRequest} extends {@link RequestModel}
 *
 * <p>GetRLTrajectoryRequest</p>
 */
public class GetRLTrajectoryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromptUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String promptUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SampleIndex")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sampleIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private GetRLTrajectoryRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.endTime = builder.endTime;
        this.promptUid = builder.promptUid;
        this.sampleIndex = builder.sampleIndex;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRLTrajectoryRequest create() {
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
     * @return promptUid
     */
    public String getPromptUid() {
        return this.promptUid;
    }

    /**
     * @return sampleIndex
     */
    public String getSampleIndex() {
        return this.sampleIndex;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetRLTrajectoryRequest, Builder> {
        private String jobId; 
        private String endTime; 
        private String promptUid; 
        private String sampleIndex; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetRLTrajectoryRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.endTime = request.endTime;
            this.promptUid = request.promptUid;
            this.sampleIndex = request.sampleIndex;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The job ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc5yfk7eyg95lac</p>
         */
        public Builder jobId(String jobId) {
            this.putPathParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The end time of the query window in UTC RFC3339 format. Default value: now.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-07T00:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The sample UID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3afcfbdf-3956-4ab2-b9cb-f9c204b8fc9c</p>
         */
        public Builder promptUid(String promptUid) {
            this.putQueryParameter("PromptUid", promptUid);
            this.promptUid = promptUid;
            return this;
        }

        /**
         * <p>The trajectory index.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        public Builder sampleIndex(String sampleIndex) {
            this.putQueryParameter("SampleIndex", sampleIndex);
            this.sampleIndex = sampleIndex;
            return this;
        }

        /**
         * <p>The start time of the query window in UTC RFC3339 format. Default value: EndTime-7d.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-04T00:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetRLTrajectoryRequest build() {
            return new GetRLTrajectoryRequest(this);
        } 

    } 

}
