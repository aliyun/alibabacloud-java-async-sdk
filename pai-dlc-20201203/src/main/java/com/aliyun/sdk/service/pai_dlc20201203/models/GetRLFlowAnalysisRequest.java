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
 * {@link GetRLFlowAnalysisRequest} extends {@link RequestModel}
 *
 * <p>GetRLFlowAnalysisRequest</p>
 */
public class GetRLFlowAnalysisRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private GetRLFlowAnalysisRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRLFlowAnalysisRequest create() {
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetRLFlowAnalysisRequest, Builder> {
        private String jobId; 
        private String endTime; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetRLFlowAnalysisRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.endTime = request.endTime;
            this.startTime = request.startTime;
        } 

        /**
         * <p>作业 ID</p>
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
         * <p>查询窗口截止时间，采用 RFC3339 格式。未提供时使用服务端当前 UTC 时间，并向下对齐到 30 秒边界。为容纳日志采集延迟，实际读取的采集时间上界在该值基础上延后 5 分钟，并非严格按事件发生时间过滤。</p>
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
         * <p>查询窗口起始时间，采用 RFC3339 格式。未提供时默认为 EndTime 前 7 天；必须早于 EndTime，时间跨度不得超过 30 天。</p>
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
        public GetRLFlowAnalysisRequest build() {
            return new GetRLFlowAnalysisRequest(this);
        } 

    } 

}
