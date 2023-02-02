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
         * The query start time, which is a second-level timestamp.
         */
        public Builder beginTime(Long beginTime) {
            this.putBodyParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * The query end time, which is a second-level timestamp.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The maximum number of query points.
         */
        public Builder maxPointNum(Long maxPointNum) {
            this.putBodyParameter("MaxPointNum", maxPointNum);
            this.maxPointNum = maxPointNum;
            return this;
        }

        /**
         * The query metric. For example, if you want to query the incremental transactions per second (TPS), set the value to CONNECTOR_TPS. Valid values: CONNECTOR_TPS: the TPS of the Connector component; CONNECTOR_DELAY: the latency of the Connector component; CONNECTOR_SOURCE_QUEUE_SIZE: the queue size of the Connector source; CONNECTOR_IOPS: the Connector IOPS; CONNECTOR_WRITE_COST: the time spent in writing at the Connector destination; CONNECTOR_SOURCE_READ_COST: the time spent in reading at the Connector source; JDBCWRITER_DELAY: the latency of the JDBCWriter; JDBCWRITER_IOPS: the IOPS of the JDBCWriter; JDBCWRITER_RPS: the requests per second (RPS) of the JDBCWriter; STORE_DELAY: the latency of the Store component; STORE_CONN: the number of store connections; STORE_IOPS: the IOPS of the Store component; STORE_TPS: the TPS of the Store component; CHECKER_SOURCE_NONE_RPS: the instantaneous RPS of the Checker component at the source end during full migration; CHECKER_SOURCE_AVG_RPS: the average RPS of the Checker component at the source end during full migration; CHECKER_DEST_NONE_RPS: the instantaneous RPS of the Checker component at the destination end during full migration; CHECKER_DEST_AVG_RPS: the average RPS of the Checker component at the destination end during full migration; CHECKER_SOURCE_NONE_RT: the instantaneous response time (RT) of the Checker component at the source end during full migration; CHECKER_SOURCE_AVG_RT: the average RT of the Checker component at the source end during full migration; CHECKER_DEST_NONE_RT: the instantaneous RT of the Checker component at the destination end during full migration; CHECKER_DEST_AVG_RT: the average RT of the Checker component at the destination end during full migration; CHECKER_SOURCE_NONE_READ_IOPS: the instantaneous read IOPS of the Checker component at the source end during full migration; CHECKER_SOURCE_AVG_READ_IOPS: the average read IOPS of the Checker component at the source end during full migration; CHECKER_DEST_NONE_WRITE_IOPS: the instantaneous write IOPS of the Checker component at the destination end during full migration; CHECKER_DEST_AVG_WRITE_IOPS: the average write IOPS of the Checker component at the destination end during full migration; CHECKER_VERIFY_SOURCE_NONE_RPS: the instantaneous RPS of the Checker-Verify component at the source end during full verification; CHECKER_VERIFY_SOURCE_AVG_RPS: the average RPS of the Checker-Verify component at the source end during full verification; CHECKER_VERIFY_DEST_NONE_RPS: the instantaneous RPS of the Checker-Verify component at the destination end during full verification; CHECKER_VERIFY_DEST_AVG_RPS: the average RPS of the Checker-Verify component at the destination end during full verification; CHECKER_VERIFY_SOURCE_NONE_RT: the instantaneous RT of the Checker-Verify component at the source end during full verification; CHECKER_VERIFY_SOURCE_AVG_RT: the average RT of the Checker-Verify component at the source end during full verification; CHECKER_VERIFY_DEST_NONE_RT: the instantaneous RT of the Checker-Verify component at the destination end during full verification; CHECKER_VERIFY_DEST_AVG_RT: the average RT of the Checker-Verify component at the destination end during full verification; CHECKER_VERIFY_SOURCE_NONE_READ_IOPS: the instantaneous read IOPS of the Checker-Verify component at the source end during full verification; CHECKER_VERIFY_SOURCE_AVG_READ_IOPS: the average read IOPS of the Checker-Verify component at the source end during full verification; CHECKER_VERIFY_DEST_NONE_READ_IOPS: the instantaneous read IOPS of the Checker-Verify component at the destination end during full verification; and CHECKER_VERIFY_DEST_AVG_READ_IOPS: the average read IOPS of the Checker-Verify component at the destination end during full verification.
         */
        public Builder metric(String metric) {
            this.putBodyParameter("Metric", metric);
            this.metric = metric;
            return this;
        }

        /**
         * The page number, which takes effect in a pagination query.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The page size, which takes effect in a pagination query.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the project to query.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The ID of the migration instance. Generally, if you want to create a project on a public cloud, you must first purchase a migration instance.
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
