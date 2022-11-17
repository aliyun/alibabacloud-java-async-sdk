// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTenantMetricsRequest} extends {@link RequestModel}
 *
 * <p>DescribeTenantMetricsRequest</p>
 */
public class DescribeTenantMetricsRequest extends Request {
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
    @Deprecated
    private String tenantId;

    @Body
    @NameInMap("TenantIdList")
    private String tenantIdList;

    @Body
    @NameInMap("TenantName")
    @Deprecated
    private String tenantName;

    private DescribeTenantMetricsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.metrics = builder.metrics;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.tenantId = builder.tenantId;
        this.tenantIdList = builder.tenantIdList;
        this.tenantName = builder.tenantName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTenantMetricsRequest create() {
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

    /**
     * @return tenantIdList
     */
    public String getTenantIdList() {
        return this.tenantIdList;
    }

    /**
     * @return tenantName
     */
    public String getTenantName() {
        return this.tenantName;
    }

    public static final class Builder extends Request.Builder<DescribeTenantMetricsRequest, Builder> {
        private String regionId; 
        private String endTime; 
        private String instanceId; 
        private String metrics; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String startTime; 
        private String tenantId; 
        private String tenantIdList; 
        private String tenantName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTenantMetricsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.metrics = request.metrics;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
            this.tenantId = request.tenantId;
            this.tenantIdList = request.tenantIdList;
            this.tenantName = request.tenantName;
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
         * 监控数据的结束时间。该时间只支持UTC时间，格式为：YYYY-MM-DDThh:mm:ssZ。
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * 监控指标。当前可支持的指标及说明参考：https://help.aliyun.com/document_detail/212125.html
         */
        public Builder metrics(String metrics) {
            this.putBodyParameter("Metrics", metrics);
            this.metrics = metrics;
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
         * 监控数据的起始时间。该时间只支持UTC时间，格式为：YYYY-MM-DDThh:mm:ssZ。
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * 租户ID。该参数待废弃，请使用TenantIdList。
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * 租户ID列表
         */
        public Builder tenantIdList(String tenantIdList) {
            this.putBodyParameter("TenantIdList", tenantIdList);
            this.tenantIdList = tenantIdList;
            return this;
        }

        /**
         * 租户名称。 长度为2~20 个字符，支持英文字母、数字和下划线，区分大小写，必须以字母或下划线开头。 不可设置为 sys。参数待废弃，请使用TenantIdList。
         */
        public Builder tenantName(String tenantName) {
            this.putBodyParameter("TenantName", tenantName);
            this.tenantName = tenantName;
            return this;
        }

        @Override
        public DescribeTenantMetricsRequest build() {
            return new DescribeTenantMetricsRequest(this);
        } 

    } 

}
