// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCalculationJobsRequest} extends {@link RequestModel}
 *
 * <p>CreateCalculationJobsRequest</p>
 */
public class CreateCalculationJobsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ABMetricIds")
    private String ABMetricIds;

    @Body
    @NameInMap("EndDate")
    private String endDate;

    @Body
    @NameInMap("InstanceId")
    private String instanceId;

    @Body
    @NameInMap("StartDate")
    private String startDate;

    private CreateCalculationJobsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ABMetricIds = builder.ABMetricIds;
        this.endDate = builder.endDate;
        this.instanceId = builder.instanceId;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCalculationJobsRequest create() {
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
     * @return ABMetricIds
     */
    public String getABMetricIds() {
        return this.ABMetricIds;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<CreateCalculationJobsRequest, Builder> {
        private String regionId; 
        private String ABMetricIds; 
        private String endDate; 
        private String instanceId; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(CreateCalculationJobsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.ABMetricIds = request.ABMetricIds;
            this.endDate = request.endDate;
            this.instanceId = request.instanceId;
            this.startDate = request.startDate;
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
         * ABMetricIds.
         */
        public Builder ABMetricIds(String ABMetricIds) {
            this.putBodyParameter("ABMetricIds", ABMetricIds);
            this.ABMetricIds = ABMetricIds;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public CreateCalculationJobsRequest build() {
            return new CreateCalculationJobsRequest(this);
        } 

    } 

}
