// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetServiceInstanceSubscriptionEstimateCostRequest} extends {@link RequestModel}
 *
 * <p>GetServiceInstanceSubscriptionEstimateCostRequest</p>
 */
public class GetServiceInstanceSubscriptionEstimateCostRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourcePeriod")
    private java.util.List<ResourcePeriod> resourcePeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceInstanceId;

    private GetServiceInstanceSubscriptionEstimateCostRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.orderType = builder.orderType;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.regionId = builder.regionId;
        this.resourcePeriod = builder.resourcePeriod;
        this.serviceInstanceId = builder.serviceInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceInstanceSubscriptionEstimateCostRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourcePeriod
     */
    public java.util.List<ResourcePeriod> getResourcePeriod() {
        return this.resourcePeriod;
    }

    /**
     * @return serviceInstanceId
     */
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public static final class Builder extends Request.Builder<GetServiceInstanceSubscriptionEstimateCostRequest, Builder> {
        private String clientToken; 
        private String orderType; 
        private Integer period; 
        private String periodUnit; 
        private String regionId; 
        private java.util.List<ResourcePeriod> resourcePeriod; 
        private String serviceInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceInstanceSubscriptionEstimateCostRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.orderType = request.orderType;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.regionId = request.regionId;
            this.resourcePeriod = request.resourcePeriod;
            this.serviceInstanceId = request.serviceInstanceId;
        } 

        /**
         * <p>A client-generated token that ensures the idempotence of the request. The token must be unique for each request. It can contain only ASCII characters and cannot be longer than 64 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The order type. Valid value: Renewal.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Renewal</p>
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * <p>The renewal duration for all subscription resources of the service instance. The unit is specified by PeriodUnit.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The unit of the renewal duration for all subscription resources of the service instance. This is the unit for the Period parameter. Valid values: Month and Year. Default value: Month.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The renewal configuration for the resources.</p>
         */
        public Builder resourcePeriod(java.util.List<ResourcePeriod> resourcePeriod) {
            this.putQueryParameter("ResourcePeriod", resourcePeriod);
            this.resourcePeriod = resourcePeriod;
            return this;
        }

        /**
         * <p>The service instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>si-d6ab3a63ccbb4b17****</p>
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.putQueryParameter("ServiceInstanceId", serviceInstanceId);
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        @Override
        public GetServiceInstanceSubscriptionEstimateCostRequest build() {
            return new GetServiceInstanceSubscriptionEstimateCostRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceInstanceSubscriptionEstimateCostRequest} extends {@link TeaModel}
     *
     * <p>GetServiceInstanceSubscriptionEstimateCostRequest</p>
     */
    public static class ResourcePeriod extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Period")
        private Integer period;

        @com.aliyun.core.annotation.NameInMap("PeriodUnit")
        private String periodUnit;

        @com.aliyun.core.annotation.NameInMap("ResourceArn")
        private String resourceArn;

        private ResourcePeriod(Builder builder) {
            this.period = builder.period;
            this.periodUnit = builder.periodUnit;
            this.resourceArn = builder.resourceArn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcePeriod create() {
            return builder().build();
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return periodUnit
         */
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        /**
         * @return resourceArn
         */
        public String getResourceArn() {
            return this.resourceArn;
        }

        public static final class Builder {
            private Integer period; 
            private String periodUnit; 
            private String resourceArn; 

            private Builder() {
            } 

            private Builder(ResourcePeriod model) {
                this.period = model.period;
                this.periodUnit = model.periodUnit;
                this.resourceArn = model.resourceArn;
            } 

            /**
             * <p>The renewal duration. The unit is specified by PeriodUnit.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The unit of the renewal duration for the resource. This is the unit for the Period parameter. Valid values: Month and Year. Default value: Month.</p>
             * 
             * <strong>example:</strong>
             * <p>Month</p>
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ecs:cn-guangzhou:1361753504587228:instance/i-7xv9pgeqvhxg10jji3vd</p>
             */
            public Builder resourceArn(String resourceArn) {
                this.resourceArn = resourceArn;
                return this;
            }

            public ResourcePeriod build() {
                return new ResourcePeriod(this);
            } 

        } 

    }
}
