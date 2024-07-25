// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateServicePolicyRequest} extends {@link RequestModel}
 *
 * <p>GenerateServicePolicyRequest</p>
 */
public class GenerateServicePolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationTypes")
    private java.util.List < String > operationTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceVersion")
    private String serviceVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrialType")
    private String trialType;

    private GenerateServicePolicyRequest(Builder builder) {
        super(builder);
        this.operationTypes = builder.operationTypes;
        this.regionId = builder.regionId;
        this.serviceId = builder.serviceId;
        this.serviceVersion = builder.serviceVersion;
        this.templateName = builder.templateName;
        this.trialType = builder.trialType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateServicePolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operationTypes
     */
    public java.util.List < String > getOperationTypes() {
        return this.operationTypes;
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
     * @return serviceVersion
     */
    public String getServiceVersion() {
        return this.serviceVersion;
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

    public static final class Builder extends Request.Builder<GenerateServicePolicyRequest, Builder> {
        private java.util.List < String > operationTypes; 
        private String regionId; 
        private String serviceId; 
        private String serviceVersion; 
        private String templateName; 
        private String trialType; 

        private Builder() {
            super();
        } 

        private Builder(GenerateServicePolicyRequest request) {
            super(request);
            this.operationTypes = request.operationTypes;
            this.regionId = request.regionId;
            this.serviceId = request.serviceId;
            this.serviceVersion = request.serviceVersion;
            this.templateName = request.templateName;
            this.trialType = request.trialType;
        } 

        /**
         * The type of operation N for which you want to generate the policy information.
         * <p>
         * 
         * Valid values:
         * 
         * *   CreateServiceInstance: creates a serviceInstance by calling the CreateServiceInstance operation.
         * *   UpdateServiceInstance: updates a serviceInstance by calling the UpdateServiceInstance operation.
         * *   DeleteServiceInstance: deletes a serviceInstance by calling the DeleteServiceInstance operation.
         * 
         * >  The default value is the combination of all valid values.
         */
        public Builder operationTypes(java.util.List < String > operationTypes) {
            this.putQueryParameter("OperationTypes", operationTypes);
            this.operationTypes = operationTypes;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The service ID.
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * The service version.
         */
        public Builder serviceVersion(String serviceVersion) {
            this.putQueryParameter("ServiceVersion", serviceVersion);
            this.serviceVersion = serviceVersion;
            return this;
        }

        /**
         * The name of the template.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * The trial policy. Valid values:
         * <p>
         * 
         * *   Trial: Trials are supported.
         * *   NotTrial: Trials are not supported.
         */
        public Builder trialType(String trialType) {
            this.putQueryParameter("TrialType", trialType);
            this.trialType = trialType;
            return this;
        }

        @Override
        public GenerateServicePolicyRequest build() {
            return new GenerateServicePolicyRequest(this);
        } 

    } 

}
