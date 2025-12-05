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
 * {@link GetJMeterSamplingLogsRequest} extends {@link RequestModel}
 *
 * <p>GetJMeterSamplingLogsRequest</p>
 */
public class GetJMeterSamplingLogsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentId")
    private Long agentId;

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
    @com.aliyun.core.annotation.NameInMap("MaxRT")
    private Integer maxRT;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinRT")
    private Integer minRT;

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
    @com.aliyun.core.annotation.NameInMap("ResponseCode")
    private String responseCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SamplerId")
    private Integer samplerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Thread")
    private String thread;

    private GetJMeterSamplingLogsRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.beginTime = builder.beginTime;
        this.endTime = builder.endTime;
        this.keyword = builder.keyword;
        this.maxRT = builder.maxRT;
        this.minRT = builder.minRT;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.reportId = builder.reportId;
        this.responseCode = builder.responseCode;
        this.samplerId = builder.samplerId;
        this.success = builder.success;
        this.thread = builder.thread;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJMeterSamplingLogsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public Long getAgentId() {
        return this.agentId;
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
     * @return maxRT
     */
    public Integer getMaxRT() {
        return this.maxRT;
    }

    /**
     * @return minRT
     */
    public Integer getMinRT() {
        return this.minRT;
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
     * @return responseCode
     */
    public String getResponseCode() {
        return this.responseCode;
    }

    /**
     * @return samplerId
     */
    public Integer getSamplerId() {
        return this.samplerId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return thread
     */
    public String getThread() {
        return this.thread;
    }

    public static final class Builder extends Request.Builder<GetJMeterSamplingLogsRequest, Builder> {
        private Long agentId; 
        private Long beginTime; 
        private Long endTime; 
        private String keyword; 
        private Integer maxRT; 
        private Integer minRT; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String reportId; 
        private String responseCode; 
        private Integer samplerId; 
        private Boolean success; 
        private String thread; 

        private Builder() {
            super();
        } 

        private Builder(GetJMeterSamplingLogsRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.beginTime = request.beginTime;
            this.endTime = request.endTime;
            this.keyword = request.keyword;
            this.maxRT = request.maxRT;
            this.minRT = request.minRT;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.reportId = request.reportId;
            this.responseCode = request.responseCode;
            this.samplerId = request.samplerId;
            this.success = request.success;
            this.thread = request.thread;
        } 

        /**
         * <p>The ID of the load generator. This parameter is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>14238000</p>
         */
        public Builder agentId(Long agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1637157073000</p>
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>The end of the time range to query. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1637157076000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The keyword. You can use the keyword in the value of <strong>SceneName</strong> for fuzzy searching or use the value of <strong>SceneID</strong> for exact searching.</p>
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
         * <p>The maximum response time. Unit: ms.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder maxRT(Integer maxRT) {
            this.putQueryParameter("MaxRT", maxRT);
            this.maxRT = maxRT;
            return this;
        }

        /**
         * <p>The minimum response time. Unit: ms.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder minRT(Integer minRT) {
            this.putQueryParameter("MinRT", minRT);
            this.minRT = minRT;
            return this;
        }

        /**
         * <p>The page number.</p>
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
         * <p>The number of entries per page.</p>
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
         * <p>The ID of the report.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7R4RE352</p>
         */
        public Builder reportId(String reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder responseCode(String responseCode) {
            this.putQueryParameter("ResponseCode", responseCode);
            this.responseCode = responseCode;
            return this;
        }

        /**
         * <p>The ID of the sampler. The value starts from 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder samplerId(Integer samplerId) {
            this.putQueryParameter("SamplerId", samplerId);
            this.samplerId = samplerId;
            return this;
        }

        /**
         * <p>Specifies whether the sampling is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.putQueryParameter("Success", success);
            this.success = success;
            return this;
        }

        /**
         * <p>The name of the thread. Fuzzy searching is supported. If you specify multiple threads, separate the threads with spaces.</p>
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
        public GetJMeterSamplingLogsRequest build() {
            return new GetJMeterSamplingLogsRequest(this);
        } 

    } 

}
