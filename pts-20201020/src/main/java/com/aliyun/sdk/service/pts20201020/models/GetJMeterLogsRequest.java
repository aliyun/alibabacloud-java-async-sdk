// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

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
 * {@link GetJMeterLogsRequest} extends {@link RequestModel}
 *
 * <p>GetJMeterLogsRequest</p>
 */
public class GetJMeterLogsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentIndex")
    private Integer agentIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    private Long beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Level")
    private String level;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000000, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 200, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reportId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Thread")
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
         * <p>Specifies that the operational logs of the stress tester identified as number 0 are returned if the agent index is invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder agentIndex(Integer agentIndex) {
            this.putQueryParameter("AgentIndex", agentIndex);
            this.agentIndex = agentIndex;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1637115306000</p>
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>The end of the time range to query. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1637115309000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The log level. Valid values:</p>
         * <ul>
         * <li>ERROR</li>
         * <li>WARN</li>
         * <li>INFO (default)</li>
         * <li>DEBUG</li>
         * <li>TRACE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        public Builder level(String level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * <p>This parameter is required.</p>
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
         * <p>The number of entries to return per page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The report ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>KS2YE3J2</p>
         */
        public Builder reportId(String reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        /**
         * <p>The thread name.</p>
         * 
         * <strong>example:</strong>
         * <p>main</p>
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
