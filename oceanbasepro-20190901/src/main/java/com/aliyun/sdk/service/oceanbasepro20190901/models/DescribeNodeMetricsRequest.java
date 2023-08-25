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
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

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

    @Body
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    private DescribeNodeMetricsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.metrics = builder.metrics;
        this.nodeIdList = builder.nodeIdList;
        this.nodeName = builder.nodeName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
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
        private String regionId; 
        private String endTime; 
        private String instanceId; 
        private String metrics; 
        private String nodeIdList; 
        private String nodeName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String startTime; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNodeMetricsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.metrics = request.metrics;
            this.nodeIdList = request.nodeIdList;
            this.nodeName = request.nodeName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
            this.tenantId = request.tenantId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * $.parameters[7].schema.description
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The list of nodes.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * $.parameters[7].schema.enumValueTitles
         */
        public Builder metrics(String metrics) {
            this.putBodyParameter("Metrics", metrics);
            this.metrics = metrics;
            return this;
        }

        /**
         * $.parameters[10].schema.description
         */
        public Builder nodeIdList(String nodeIdList) {
            this.putBodyParameter("NodeIdList", nodeIdList);
            this.nodeIdList = nodeIdList;
            return this;
        }

        /**
         * $.parameters[8].schema.example
         */
        public Builder nodeName(String nodeName) {
            this.putBodyParameter("NodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * $.parameters[6].schema.description
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The ID of the tenant.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * $.parameters[9].schema.example
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * $.parameters[6].schema.enumValueTitles
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
