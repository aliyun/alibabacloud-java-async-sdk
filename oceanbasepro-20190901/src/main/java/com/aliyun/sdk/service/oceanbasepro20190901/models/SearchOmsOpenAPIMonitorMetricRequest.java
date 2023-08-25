// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchOmsOpenAPIMonitorMetricRequest} extends {@link RequestModel}
 *
 * <p>SearchOmsOpenAPIMonitorMetricRequest</p>
 */
public class SearchOmsOpenAPIMonitorMetricRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("BeginTime")
    private Long beginTime;

    @Body
    @NameInMap("EndTime")
    private Long endTime;

    @Body
    @NameInMap("MaxPointNum")
    private Long maxPointNum;

    @Body
    @NameInMap("Metric")
    private String metric;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("ProjectId")
    private String projectId;

    @Body
    @NameInMap("WorkerGradeId")
    private String workerGradeId;

    private SearchOmsOpenAPIMonitorMetricRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.beginTime = builder.beginTime;
        this.endTime = builder.endTime;
        this.maxPointNum = builder.maxPointNum;
        this.metric = builder.metric;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.workerGradeId = builder.workerGradeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchOmsOpenAPIMonitorMetricRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return maxPointNum
     */
    public Long getMaxPointNum() {
        return this.maxPointNum;
    }

    /**
     * @return metric
     */
    public String getMetric() {
        return this.metric;
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
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return workerGradeId
     */
    public String getWorkerGradeId() {
        return this.workerGradeId;
    }

    public static final class Builder extends Request.Builder<SearchOmsOpenAPIMonitorMetricRequest, Builder> {
        private String regionId; 
        private Long beginTime; 
        private Long endTime; 
        private Long maxPointNum; 
        private String metric; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String projectId; 
        private String workerGradeId; 

        private Builder() {
            super();
        } 

        private Builder(SearchOmsOpenAPIMonitorMetricRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.beginTime = request.beginTime;
            this.endTime = request.endTime;
            this.maxPointNum = request.maxPointNum;
            this.metric = request.metric;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.workerGradeId = request.workerGradeId;
        } 

        /**
         * 实例所属的地域ID。您可以调用DescribeRegions查看最新的阿里云地域列表。
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Alibaba Cloud provides SDKs in different languages to help you quickly integrate Alibaba Cloud products and services by using APIs. We recommend that you use an SDK to call APIs. In this way, you do not need to sign for verification.
         */
        public Builder beginTime(Long beginTime) {
            this.putBodyParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * It is an Alibaba Cloud asset management and configuration tool, with which you can manage multiple Alibaba Cloud products and services by using commands. It is easy to use and a good helper in migration to cloud.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Contact the administrator.
         */
        public Builder maxPointNum(Long maxPointNum) {
            this.putBodyParameter("MaxPointNum", maxPointNum);
            this.maxPointNum = maxPointNum;
            return this;
        }

        /**
         * The business data returned.
         */
        public Builder metric(String metric) {
            this.putBodyParameter("Metric", metric);
            this.metric = metric;
            return this;
        }

        /**
         * The information about the object.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * A millisecond-level timestamp.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The value corresponding to the time.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The name of the metric.
         */
        public Builder workerGradeId(String workerGradeId) {
            this.putBodyParameter("WorkerGradeId", workerGradeId);
            this.workerGradeId = workerGradeId;
            return this;
        }

        @Override
        public SearchOmsOpenAPIMonitorMetricRequest build() {
            return new SearchOmsOpenAPIMonitorMetricRequest(this);
        } 

    } 

}
