// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNodeMetricsRequest} extends {@link RequestModel}
 *
 * <p>DescribeNodeMetricsRequest</p>
 */
public class DescribeNodeMetricsRequest extends Request {
    @Body
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Body
    @NameInMap("FuzzyName")
    private Boolean fuzzyName;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("Metrics")
    @Validation(required = true)
    private String metrics;

    @Body
    @NameInMap("NodeIdList")
    private String nodeIdList;

    @Body
    @NameInMap("NodeName")
    private String nodeName;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    private DescribeNodeMetricsRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.fuzzyName = builder.fuzzyName;
        this.instanceId = builder.instanceId;
        this.metrics = builder.metrics;
        this.nodeIdList = builder.nodeIdList;
        this.nodeName = builder.nodeName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNodeMetricsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return fuzzyName
     */
    public Boolean getFuzzyName() {
        return this.fuzzyName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return metrics
     */
    public String getMetrics() {
        return this.metrics;
    }

    /**
     * @return nodeIdList
     */
    public String getNodeIdList() {
        return this.nodeIdList;
    }

    /**
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<DescribeNodeMetricsRequest, Builder> {
        private String endTime; 
        private Boolean fuzzyName; 
        private String instanceId; 
        private String metrics; 
        private String nodeIdList; 
        private String nodeName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String startTime; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNodeMetricsRequest response) {
            super(response);
            this.endTime = response.endTime;
            this.fuzzyName = response.fuzzyName;
            this.instanceId = response.instanceId;
            this.metrics = response.metrics;
            this.nodeIdList = response.nodeIdList;
            this.nodeName = response.nodeName;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.startTime = response.startTime;
            this.tenantId = response.tenantId;
        } 

        /**
         * 参数历史查看的结束时间。
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * FuzzyName.
         */
        public Builder fuzzyName(Boolean fuzzyName) {
            this.putBodyParameter("FuzzyName", fuzzyName);
            this.fuzzyName = fuzzyName;
            return this;
        }

        /**
         * Oceanbase集群ID。
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 监控指标
         */
        public Builder metrics(String metrics) {
            this.putBodyParameter("Metrics", metrics);
            this.metrics = metrics;
            return this;
        }

        /**
         * 节点列表
         */
        public Builder nodeIdList(String nodeIdList) {
            this.putBodyParameter("NodeIdList", nodeIdList);
            this.nodeIdList = nodeIdList;
            return this;
        }

        /**
         * 节点名称
         */
        public Builder nodeName(String nodeName) {
            this.putBodyParameter("NodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * 分页查询的页码。 起始值：1 默认值：1
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 分页查询时设置的每页行数。 最大值：100 默认值：10
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 地域ID。
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 参数历史查看的起始时间。
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * 租户ID。
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public DescribeNodeMetricsRequest build() {
            return new DescribeNodeMetricsRequest(this);
        } 

    } 

}
