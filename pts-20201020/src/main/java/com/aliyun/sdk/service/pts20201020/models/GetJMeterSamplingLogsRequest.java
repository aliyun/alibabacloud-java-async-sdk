// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJMeterSamplingLogsRequest} extends {@link RequestModel}
 *
 * <p>GetJMeterSamplingLogsRequest</p>
 */
public class GetJMeterSamplingLogsRequest extends Request {
    @Query
    @NameInMap("AgentId")
    private Long agentId;

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
    @NameInMap("MaxRT")
    private Integer maxRT;

    @Query
    @NameInMap("MinRT")
    private Integer minRT;

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
    @NameInMap("ResponseCode")
    private String responseCode;

    @Query
    @NameInMap("SamplerId")
    private Integer samplerId;

    @Query
    @NameInMap("Success")
    private Boolean success;

    @Query
    @NameInMap("Thread")
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
         * 压测引擎编号
         */
        public Builder agentId(Long agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
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
         * 最大响应时间，单位ms
         */
        public Builder maxRT(Integer maxRT) {
            this.putQueryParameter("MaxRT", maxRT);
            this.maxRT = maxRT;
            return this;
        }

        /**
         * 最小响应时间，单位ms
         */
        public Builder minRT(Integer minRT) {
            this.putQueryParameter("MinRT", minRT);
            this.minRT = minRT;
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
         * ResponseCode.
         */
        public Builder responseCode(String responseCode) {
            this.putQueryParameter("ResponseCode", responseCode);
            this.responseCode = responseCode;
            return this;
        }

        /**
         * 第几个采样器，从0开始
         */
        public Builder samplerId(Integer samplerId) {
            this.putQueryParameter("SamplerId", samplerId);
            this.samplerId = samplerId;
            return this;
        }

        /**
         * 采样结果是否成功
         */
        public Builder success(Boolean success) {
            this.putQueryParameter("Success", success);
            this.success = success;
            return this;
        }

        /**
         * 线程
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
