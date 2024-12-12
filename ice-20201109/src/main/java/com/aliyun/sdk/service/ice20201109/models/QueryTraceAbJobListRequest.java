// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryTraceAbJobListRequest} extends {@link RequestModel}
 *
 * <p>QueryTraceAbJobListRequest</p>
 */
public class QueryTraceAbJobListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTimeEnd")
    private Long createTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTimeStart")
    private Long createTimeStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TraceMediaId")
    private String traceMediaId;

    private QueryTraceAbJobListRequest(Builder builder) {
        super(builder);
        this.createTimeEnd = builder.createTimeEnd;
        this.createTimeStart = builder.createTimeStart;
        this.jobId = builder.jobId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.traceMediaId = builder.traceMediaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTraceAbJobListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTimeEnd
     */
    public Long getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    /**
     * @return createTimeStart
     */
    public Long getCreateTimeStart() {
        return this.createTimeStart;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return traceMediaId
     */
    public String getTraceMediaId() {
        return this.traceMediaId;
    }

    public static final class Builder extends Request.Builder<QueryTraceAbJobListRequest, Builder> {
        private Long createTimeEnd; 
        private Long createTimeStart; 
        private String jobId; 
        private Long pageNumber; 
        private Long pageSize; 
        private String traceMediaId; 

        private Builder() {
            super();
        } 

        private Builder(QueryTraceAbJobListRequest request) {
            super(request);
            this.createTimeEnd = request.createTimeEnd;
            this.createTimeStart = request.createTimeStart;
            this.jobId = request.jobId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.traceMediaId = request.traceMediaId;
        } 

        /**
         * CreateTimeEnd.
         */
        public Builder createTimeEnd(Long createTimeEnd) {
            this.putQueryParameter("CreateTimeEnd", createTimeEnd);
            this.createTimeEnd = createTimeEnd;
            return this;
        }

        /**
         * CreateTimeStart.
         */
        public Builder createTimeStart(Long createTimeStart) {
            this.putQueryParameter("CreateTimeStart", createTimeStart);
            this.createTimeStart = createTimeStart;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * TraceMediaId.
         */
        public Builder traceMediaId(String traceMediaId) {
            this.putQueryParameter("TraceMediaId", traceMediaId);
            this.traceMediaId = traceMediaId;
            return this;
        }

        @Override
        public QueryTraceAbJobListRequest build() {
            return new QueryTraceAbJobListRequest(this);
        } 

    } 

}
