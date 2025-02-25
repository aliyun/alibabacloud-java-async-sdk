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
    @com.aliyun.core.annotation.NameInMap("OperationName")
    private String operationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.Map<String, ?> parameters;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrialType")
    private String trialType;

    private GetServiceEstimateCostRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.commodity = builder.commodity;
        this.operationName = builder.operationName;
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
        this.serviceId = builder.serviceId;
        this.serviceInstanceId = builder.serviceInstanceId;
        this.serviceVersion = builder.serviceVersion;
        this.specificationName = builder.specificationName;
        this.templateName = builder.templateName;
        this.trialType = builder.trialType;
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
     * @return operationName
     */
    public String getOperationName() {
        return this.operationName;
    }

    /**
     * @return parameters
     */
    public java.util.Map<String, ?> getParameters() {
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

    /**
     * @return trialType
     */
    public String getTrialType() {
        return this.trialType;
    }

    public static final class Builder extends Request.Builder<GetServiceEstimateCostRequest, Builder> {
        private String clientToken; 
        private Commodity commodity; 
        private String operationName; 
        private java.util.Map<String, ?> parameters; 
        private String regionId; 
        private String serviceId; 
        private String serviceInstanceId; 
        private String serviceVersion; 
        private String specificationName; 
        private String templateName; 
        private String trialType; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceEstimateCostRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.commodity = request.commodity;
            this.operationName = request.operationName;
            this.parameters = request.parameters;
            this.regionId = request.regionId;
            this.serviceId = request.serviceId;
            this.serviceInstanceId = request.serviceInstanceId;
            this.serviceVersion = request.serviceVersion;
            this.specificationName = request.specificationName;
            this.templateName = request.templateName;
            this.trialType = request.trialType;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>qwertyuiop</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The information about the subscription duration.</p>
         */
        public Builder commodity(Commodity commodity) {
            String commodityShrink = shrink(commodity, "Commodity", "json");
            this.putQueryParameter("Commodity", commodityShrink);
            this.commodity = commodity;
            return this;
        }

        /**
         * <p>The name of the configuration change operation.</p>
         * 
         * <strong>example:</strong>
         * <p>Parameter change</p>
         */
        public Builder operationName(String operationName) {
            this.putQueryParameter("OperationName", operationName);
            this.operationName = operationName;
            return this;
        }

        /**
         * <p>The parameters that are specified to deploy the service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;RegionId&quot;: &quot;cn-hangzhou&quot;, &quot;InstanceType&quot;: &quot;ecs.g5.large&quot;}</p>
         */
        public Builder parameters(java.util.Map<String, ?> parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putQueryParameter("Parameters", parametersShrink);
            this.parameters = parameters;
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
         * <p>The service ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>service-12xxxxxx</p>
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The service instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>si-d6ab3a63ccbb4b17xxxx</p>
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.putQueryParameter("ServiceInstanceId", serviceInstanceId);
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        /**
         * <p>The service version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder serviceVersion(String serviceVersion) {
            this.putQueryParameter("ServiceVersion", serviceVersion);
            this.serviceVersion = serviceVersion;
            return this;
        }

        /**
         * <p>The name of the package specification.</p>
         * 
         * <strong>example:</strong>
         * <p>Package 1</p>
         */
        public Builder specificationName(String specificationName) {
            this.putQueryParameter("SpecificationName", specificationName);
            this.specificationName = specificationName;
            return this;
        }

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>Template 1</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>The trial policy. Valid values:</p>
         * <ul>
         * <li>Trial: Trials are supported.</li>
         * <li>NotTrial: Trials are not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NotTrial</p>
         */
        public Builder trialType(String trialType) {
            this.putQueryParameter("TrialType", trialType);
            this.trialType = trialType;
            return this;
        }

        @Override
        public GetServiceEstimateCostRequest build() {
            return new GetServiceEstimateCostRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceEstimateCostRequest} extends {@link TeaModel}
     *
     * <p>GetServiceEstimateCostRequest</p>
     */
    public static class Commodity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CouponId")
        private String couponId;

        @com.aliyun.core.annotation.NameInMap("PayPeriod")
        private Integer payPeriod;

        @com.aliyun.core.annotation.NameInMap("PayPeriodUnit")
        private String payPeriodUnit;

        private Commodity(Builder builder) {
            this.couponId = builder.couponId;
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
         * @return couponId
         */
        public String getCouponId() {
            return this.couponId;
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
            private String couponId; 
            private Integer payPeriod; 
            private String payPeriodUnit; 

            /**
             * <p>优惠券ID</p>
             * 
             * <strong>example:</strong>
             * <p>302070970220</p>
             */
            public Builder couponId(String couponId) {
                this.couponId = couponId;
                return this;
            }

            /**
             * <p>The subscription duration.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder payPeriod(Integer payPeriod) {
                this.payPeriod = payPeriod;
                return this;
            }

            /**
             * <p>The unit of the subscription duration. Valid values:</p>
             * <ul>
             * <li>Year</li>
             * <li>Month</li>
             * <li>Day</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Year</p>
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
