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
 * {@link ListRLSamplesRequest} extends {@link RequestModel}
 *
 * <p>ListRLSamplesRequest</p>
 */
public class ListRLSamplesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 1000000, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private ListRLSamplesRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.endTime = builder.endTime;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRLSamplesRequest create() {
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListRLSamplesRequest, Builder> {
        private String jobId; 
        private String endTime; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListRLSamplesRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.endTime = request.endTime;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
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
         * <p>页码（从 1 开始，最大 1000000）；与 PageSize 必须同时提供，均不传则按默认分页 PageNumber=1、PageSize=10 返回</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>每页条数（最大 1000）；与 PageNumber 必须同时提供，均不传则默认 10</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
        public ListRLSamplesRequest build() {
            return new ListRLSamplesRequest(this);
        } 

    } 

}
