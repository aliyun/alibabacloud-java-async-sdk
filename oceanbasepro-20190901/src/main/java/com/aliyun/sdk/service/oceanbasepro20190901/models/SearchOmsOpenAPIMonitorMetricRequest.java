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
         * 查询起始时间，秒级时间戳
         */
        public Builder beginTime(Long beginTime) {
            this.putBodyParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * 查询结束时间，秒级时间戳
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * 最多查询点数
         */
        public Builder maxPointNum(Long maxPointNum) {
            this.putBodyParameter("MaxPointNum", maxPointNum);
            this.maxPointNum = maxPointNum;
            return this;
        }

        /**
         * 查询指标，如查询增量 TPS，则指定为 CONNECTOR_TPS (CONNECTOR_TPS: connector TPS, CONNECTOR_DELAY: connector delay, CONNECTOR_SOURCE_QUEUE_SIZE: connector source 端 queue size, CONNECTOR_IOPS: connector iops, CONNECTOR_WRITE_COST: connector sink 端写耗时, CONNECTOR_SOURCE_READ_COST: connector source 端读耗时, JDBCWRITER_DELAY: jdbcwriter 延时, JDBCWRITER_IOPS: jdbcwriter 流量, JDBCWRITER_RPS: jdbcwriter rps, STORE_DELAY: store delay, STORE_CONN: store conn 数目, STORE_IOPS: store 流量, STORE_TPS: store tps, CHECKER_SOURCE_NONE_RPS: 全量迁移 Checker，源端 RPS 瞬时信息。, CHECKER_SOURCE_AVG_RPS: 全量迁移 Checker，源端 RPS 平均信息。, CHECKER_DEST_NONE_RPS: 全量迁移 Checker，目标端 RPS 瞬时信息。, CHECKER_DEST_AVG_RPS: 全量迁移 Checker，目标端 RPS 平均信息。, CHECKER_SOURCE_NONE_RT: 全量迁移 Checker，源端 RT 瞬时信息。, CHECKER_SOURCE_AVG_RT: 全量迁移 Checker，源端 RT 平均信息。, CHECKER_DEST_NONE_RT: 全量迁移 Checker，目标端 RT，瞬时信息。, CHECKER_DEST_AVG_RT: 全量迁移 Checker，目标端 RT，平均信息。, CHECKER_SOURCE_NONE_READ_IOPS: 全量迁移 Checker，源端读取流量，瞬时信息。, CHECKER_SOURCE_AVG_READ_IOPS: 全量迁移 Checker，源端读取流量，平均信息。, CHECKER_DEST_NONE_WRITE_IOPS: 全量迁移 Checker，目标端写入流量，瞬时信息。, CHECKER_DEST_AVG_WRITE_IOPS: 全量迁移 Checker，目标端写入流量，平均信息。, CHECKER_VERIFY_SOURCE_NONE_RPS: 全量校验 Checker-Verify，源端 RPS，瞬时信息。, CHECKER_VERIFY_SOURCE_AVG_RPS: 全量校验 Checker-Verify，源端 RPS，平均信息。, CHECKER_VERIFY_DEST_NONE_RPS: 全量校验 Checker-Verify，目标端 RPS，瞬时信息。, CHECKER_VERIFY_DEST_AVG_RPS: 全量校验 Checker-Verify，目标端 RPS，平均信息。, CHECKER_VERIFY_SOURCE_NONE_RT: 全量校验 Checker-Verify，源端 RT，瞬时信息。, CHECKER_VERIFY_SOURCE_AVG_RT: 全量校验 Checker-Verify，源端 RT，平均信息。, CHECKER_VERIFY_DEST_NONE_RT: 全量校验 Checker-Verify，目标端 RT，瞬时信息。, CHECKER_VERIFY_DEST_AVG_RT: 全量校验 Checker-Verify，目标端 RT，平均信息。, CHECKER_VERIFY_SOURCE_NONE_READ_IOPS: 全量校验 Checker-Verify，源端读取流量，瞬时信息。, CHECKER_VERIFY_SOURCE_AVG_READ_IOPS: 全量校验 Checker-Verify，源端读取流量，平均信息。, CHECKER_VERIFY_DEST_NONE_READ_IOPS: 全量校验 Checker-Verify，目标端读取流量，瞬时信息。, CHECKER_VERIFY_DEST_AVG_READ_IOPS: 全量校验 Checker-Verify，目标端读取流量，平均信息。)
         */
        public Builder metric(String metric) {
            this.putBodyParameter("Metric", metric);
            this.metric = metric;
            return this;
        }

        /**
         * 页序号，分页查询时生效
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 页大小，分页查询时生效
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 查询项目 id
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * 实例规格 ID，创建项目时生效
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
