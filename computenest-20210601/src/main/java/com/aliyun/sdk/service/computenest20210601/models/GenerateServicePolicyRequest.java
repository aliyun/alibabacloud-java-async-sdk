// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The type of operation N for which you want to generate the policy information.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>CreateServiceInstance: creates a serviceInstance by calling the CreateServiceInstance operation.</li>
         * <li>UpdateServiceInstance: updates a serviceInstance by calling the UpdateServiceInstance operation.</li>
         * <li>DeleteServiceInstance: deletes a serviceInstance by calling the DeleteServiceInstance operation.</li>
         * </ul>
         * <blockquote>
         * <p> The default value is the combination of all valid values.</p>
         * </blockquote>
         */
        public Builder operationTypes(java.util.List < String > operationTypes) {
            this.putQueryParameter("OperationTypes", operationTypes);
            this.operationTypes = operationTypes;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
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
         * <p>service-b3e9ed878b0c4xxxxxx</p>
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The service version.</p>
         * 
         * <strong>example:</strong>
         * <p>draft</p>
         */
        public Builder serviceVersion(String serviceVersion) {
            this.putQueryParameter("ServiceVersion", serviceVersion);
            this.serviceVersion = serviceVersion;
            return this;
        }

        /**
         * <p>The name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>GPU-单机版</p>
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
        public GenerateServicePolicyRequest build() {
            return new GenerateServicePolicyRequest(this);
        } 

    } 

}
