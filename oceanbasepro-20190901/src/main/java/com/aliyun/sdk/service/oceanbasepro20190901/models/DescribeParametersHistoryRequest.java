// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeParametersHistoryRequest} extends {@link RequestModel}
 *
 * <p>DescribeParametersHistoryRequest</p>
 */
public class DescribeParametersHistoryRequest extends Request {
    @Body
    @NameInMap("Dimension")
    @Validation(required = true)
    private String dimension;

    @Body
    @NameInMap("DimensionValue")
    private String dimensionValue;

    @Body
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("PageNumber")
    @Validation(required = true, maximum = 999999, minimum = 1)
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 999999, minimum = 1)
    private Integer pageSize;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private DescribeParametersHistoryRequest(Builder builder) {
        super(builder);
        this.dimension = builder.dimension;
        this.dimensionValue = builder.dimensionValue;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeParametersHistoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dimension
     */
    public String getDimension() {
        return this.dimension;
    }

    /**
     * @return dimensionValue
     */
    public String getDimensionValue() {
        return this.dimensionValue;
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

    public static final class Builder extends Request.Builder<DescribeParametersHistoryRequest, Builder> {
        private String dimension; 
        private String dimensionValue; 
        private String endTime; 
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeParametersHistoryRequest response) {
            super(response);
            this.dimension = response.dimension;
            this.dimensionValue = response.dimensionValue;
            this.endTime = response.endTime;
            this.instanceId = response.instanceId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.startTime = response.startTime;
        } 

        /**
         * ??????????????? ?????????????????????CLUSTER)????????????TENANT???
         */
        public Builder dimension(String dimension) {
            this.putBodyParameter("Dimension", dimension);
            this.dimension = dimension;
            return this;
        }

        /**
         * ?????????????????????????????? ??????????????????????????????????????????????????????????????????????????????TenantId???
         */
        public Builder dimensionValue(String dimensionValue) {
            this.putBodyParameter("DimensionValue", dimensionValue);
            this.dimensionValue = dimensionValue;
            return this;
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
         * Oceanbase??????ID???
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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

        @Override
        public DescribeParametersHistoryRequest build() {
            return new DescribeParametersHistoryRequest(this);
        } 

    } 

}
