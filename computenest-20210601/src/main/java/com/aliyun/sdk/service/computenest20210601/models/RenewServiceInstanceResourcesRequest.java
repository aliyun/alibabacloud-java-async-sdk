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
 * {@link RenewServiceInstanceResourcesRequest} extends {@link RequestModel}
 *
 * <p>RenewServiceInstanceResourcesRequest</p>
 */
public class RenewServiceInstanceResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

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

    private RenewServiceInstanceResourcesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.regionId = builder.regionId;
        this.resourcePeriod = builder.resourcePeriod;
        this.serviceInstanceId = builder.serviceInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewServiceInstanceResourcesRequest create() {
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

    public static final class Builder extends Request.Builder<RenewServiceInstanceResourcesRequest, Builder> {
        private String clientToken; 
        private Integer period; 
        private String periodUnit; 
        private String regionId; 
        private java.util.List<ResourcePeriod> resourcePeriod; 
        private String serviceInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(RenewServiceInstanceResourcesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.regionId = request.regionId;
            this.resourcePeriod = request.resourcePeriod;
            this.serviceInstanceId = request.serviceInstanceId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
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
         * <p>The renewal duration for all prepaid resources in the service instance. The unit is specified by PeriodUnit.</p>
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
         * <p>The time unit for the renewal duration of all prepaid resources in the service instance, which is the unit for the Period parameter. Valid values: Month, Year. Default value: Month.</p>
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
         * <p>Region ID.</p>
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
         * <p>List of resource renewals.</p>
         */
        public Builder resourcePeriod(java.util.List<ResourcePeriod> resourcePeriod) {
            this.putQueryParameter("ResourcePeriod", resourcePeriod);
            this.resourcePeriod = resourcePeriod;
            return this;
        }

        /**
         * <p>Service instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>si-b58c874912fc4294****</p>
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.putQueryParameter("ServiceInstanceId", serviceInstanceId);
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        @Override
        public RenewServiceInstanceResourcesRequest build() {
            return new RenewServiceInstanceResourcesRequest(this);
        } 

    } 

    /**
     * 
     * {@link RenewServiceInstanceResourcesRequest} extends {@link TeaModel}
     *
     * <p>RenewServiceInstanceResourcesRequest</p>
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

            /**
             * <p>The renewal duration for the resource. The unit is specified by PeriodUnit.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The time unit for the renewal duration of the resource, which is the unit for the Period parameter. Valid values: Month, Year. Default value: Month.</p>
             * 
             * <strong>example:</strong>
             * <p>Month</p>
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * <p>Resource ARN (Aliyun Resource Name).</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ecs:cn-hongkong:1488317743351199:instance/i-j6c6f3lbky38o8rpeqw2</p>
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
