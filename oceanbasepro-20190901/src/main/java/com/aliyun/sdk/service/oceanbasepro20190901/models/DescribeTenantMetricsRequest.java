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

    @Body
    @NameInMap("TenantIdList")
    private String tenantIdList;

    @Body
    @NameInMap("TenantName")
    private String tenantName;

    private DescribeTenantMetricsRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.fuzzyName = builder.fuzzyName;
        this.instanceId = builder.instanceId;
        this.metrics = builder.metrics;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
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
        private String endTime; 
        private Boolean fuzzyName; 
        private String instanceId; 
        private String metrics; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String startTime; 
        private String tenantId; 
        private String tenantIdList; 
        private String tenantName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTenantMetricsRequest response) {
            super(response);
            this.endTime = response.endTime;
            this.fuzzyName = response.fuzzyName;
            this.instanceId = response.instanceId;
            this.metrics = response.metrics;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.startTime = response.startTime;
            this.tenantId = response.tenantId;
            this.tenantIdList = response.tenantIdList;
            this.tenantName = response.tenantName;
        } 

        /**
         * ????????????????????????????????????
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
         * Oceanbase??????ID???
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ????????????
         */
        public Builder metrics(String metrics) {
            this.putBodyParameter("Metrics", metrics);
            this.metrics = metrics;
            return this;
        }

        /**
         * ???????????????????????? ????????????1 ????????????1
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * ??????????????????????????????????????? ????????????100 ????????????10
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ??????ID???
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ????????????????????????????????????
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * ??????ID???
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * ??????ID??????
         */
        public Builder tenantIdList(String tenantIdList) {
            this.putBodyParameter("TenantIdList", tenantIdList);
            this.tenantIdList = tenantIdList;
            return this;
        }

        /**
         * ??????????????? ?????????2~20 ???????????????????????????????????????????????????????????????????????????????????????????????????????????? ??????????????? sys???
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
