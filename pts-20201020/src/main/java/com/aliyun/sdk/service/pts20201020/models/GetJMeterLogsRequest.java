// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJMeterLogsRequest} extends {@link RequestModel}
 *
 * <p>GetJMeterLogsRequest</p>
 */
public class GetJMeterLogsRequest extends Request {
    @Query
    @NameInMap("AgentIndex")
    private Integer agentIndex;

    @Query
    @NameInMap("BeginTime")
    private Long beginTime;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("Level")
    private String level;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true, maximum = 10000000, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 200, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("ReportId")
    @Validation(required = true)
    private String reportId;

    @Query
    @NameInMap("Thread")
    private String thread;

    private GetJMeterLogsRequest(Builder builder) {
        super(builder);
        this.agentIndex = builder.agentIndex;
        this.beginTime = builder.beginTime;
        this.endTime = builder.endTime;
        this.keyword = builder.keyword;
        this.level = builder.level;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.reportId = builder.reportId;
        this.thread = builder.thread;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJMeterLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentIndex
     */
    public Integer getAgentIndex() {
        return this.agentIndex;
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
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
     * @return reportId
     */
    public String getReportId() {
        return this.reportId;
    }

    /**
     * @return thread
     */
    public String getThread() {
        return this.thread;
    }

    public static final class Builder extends Request.Builder<GetJMeterLogsRequest, Builder> {
        private Integer agentIndex; 
        private Long beginTime; 
        private Long endTime; 
        private String keyword; 
        private String level; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String reportId; 
        private String thread; 

        private Builder() {
            super();
        } 

        private Builder(GetJMeterLogsRequest request) {
            super(request);
            this.agentIndex = request.agentIndex;
            this.beginTime = request.beginTime;
            this.endTime = request.endTime;
            this.keyword = request.keyword;
            this.level = request.level;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.reportId = request.reportId;
            this.thread = request.thread;
        } 

        /**
         * 第几台引擎，起始为0
         */
        public Builder agentIndex(Integer agentIndex) {
            this.putQueryParameter("AgentIndex", agentIndex);
            this.agentIndex = agentIndex;
            return this;
        }

        /**
         * 开始时间
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * 结束时间
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * 关键字
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * 日志等级
         */
        public Builder level(String level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 报告ID
         */
        public Builder reportId(String reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        /**
         * 线程名
         */
        public Builder thread(String thread) {
            this.putQueryParameter("Thread", thread);
            this.thread = thread;
            return this;
        }

        @Override
        public GetJMeterLogsRequest build() {
            return new GetJMeterLogsRequest(this);
        } 

    } 

}
