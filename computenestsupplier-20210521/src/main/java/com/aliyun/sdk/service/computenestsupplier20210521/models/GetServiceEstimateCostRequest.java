// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceEstimateCostRequest} extends {@link RequestModel}
 *
 * <p>GetServiceEstimateCostRequest</p>
 */
public class GetServiceEstimateCostRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Commodity")
    private Commodity commodity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.Map < String, ? > parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceInstanceId")
    private String serviceInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceVersion")
    private String serviceVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecificationName")
    private String specificationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    private GetServiceEstimateCostRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.commodity = builder.commodity;
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
        this.serviceId = builder.serviceId;
        this.serviceInstanceId = builder.serviceInstanceId;
        this.serviceVersion = builder.serviceVersion;
        this.specificationName = builder.specificationName;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceEstimateCostRequest create() {
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
     * @return commodity
     */
    public Commodity getCommodity() {
        return this.commodity;
    }

    /**
     * @return parameters
     */
    public java.util.Map < String, ? > getParameters() {
        return this.parameters;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceInstanceId
     */
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    /**
     * @return serviceVersion
     */
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    /**
     * @return specificationName
     */
    public String getSpecificationName() {
        return this.specificationName;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder extends Request.Builder<GetServiceEstimateCostRequest, Builder> {
        private String clientToken; 
        private Commodity commodity; 
        private java.util.Map < String, ? > parameters; 
        private String regionId; 
        private String serviceId; 
        private String serviceInstanceId; 
        private String serviceVersion; 
        private String specificationName; 
        private String templateName; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceEstimateCostRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.commodity = request.commodity;
            this.parameters = request.parameters;
            this.regionId = request.regionId;
            this.serviceId = request.serviceId;
            this.serviceInstanceId = request.serviceInstanceId;
            this.serviceVersion = request.serviceVersion;
            this.specificationName = request.specificationName;
            this.templateName = request.templateName;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Commodity.
         */
        public Builder commodity(Commodity commodity) {
            String commodityShrink = shrink(commodity, "Commodity", "json");
            this.putQueryParameter("Commodity", commodityShrink);
            this.commodity = commodity;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(java.util.Map < String, ? > parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putQueryParameter("Parameters", parametersShrink);
            this.parameters = parameters;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ServiceId.
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * ServiceInstanceId.
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.putQueryParameter("ServiceInstanceId", serviceInstanceId);
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        /**
         * ServiceVersion.
         */
        public Builder serviceVersion(String serviceVersion) {
            this.putQueryParameter("ServiceVersion", serviceVersion);
            this.serviceVersion = serviceVersion;
            return this;
        }

        /**
         * SpecificationName.
         */
        public Builder specificationName(String specificationName) {
            this.putQueryParameter("SpecificationName", specificationName);
            this.specificationName = specificationName;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        @Override
        public GetServiceEstimateCostRequest build() {
            return new GetServiceEstimateCostRequest(this);
        } 

    } 

    public static class Commodity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PayPeriod")
        private Integer payPeriod;

        @com.aliyun.core.annotation.NameInMap("PayPeriodUnit")
        private String payPeriodUnit;

        private Commodity(Builder builder) {
            this.payPeriod = builder.payPeriod;
            this.payPeriodUnit = builder.payPeriodUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Commodity create() {
            return builder().build();
        }

        /**
         * @return payPeriod
         */
        public Integer getPayPeriod() {
            return this.payPeriod;
        }

        /**
         * @return payPeriodUnit
         */
        public String getPayPeriodUnit() {
            return this.payPeriodUnit;
        }

        public static final class Builder {
            private Integer payPeriod; 
            private String payPeriodUnit; 

            /**
             * PayPeriod.
             */
            public Builder payPeriod(Integer payPeriod) {
                this.payPeriod = payPeriod;
                return this;
            }

            /**
             * PayPeriodUnit.
             */
            public Builder payPeriodUnit(String payPeriodUnit) {
                this.payPeriodUnit = payPeriodUnit;
                return this;
            }

            public Commodity build() {
                return new Commodity(this);
            } 

        } 

    }
}
