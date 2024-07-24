// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceProvisionsRequest} extends {@link RequestModel}
 *
 * <p>GetServiceProvisionsRequest</p>
 */
public class GetServiceProvisionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.List < Parameters> parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Services")
    private java.util.List < Services> services;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateBody")
    private String templateBody;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateURL")
    private String templateURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateVersion")
    private String templateVersion;

    private GetServiceProvisionsRequest(Builder builder) {
        super(builder);
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
        this.services = builder.services;
        this.templateBody = builder.templateBody;
        this.templateId = builder.templateId;
        this.templateURL = builder.templateURL;
        this.templateVersion = builder.templateVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceProvisionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return parameters
     */
    public java.util.List < Parameters> getParameters() {
        return this.parameters;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return services
     */
    public java.util.List < Services> getServices() {
        return this.services;
    }

    /**
     * @return templateBody
     */
    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateURL
     */
    public String getTemplateURL() {
        return this.templateURL;
    }

    /**
     * @return templateVersion
     */
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public static final class Builder extends Request.Builder<GetServiceProvisionsRequest, Builder> {
        private java.util.List < Parameters> parameters; 
        private String regionId; 
        private java.util.List < Services> services; 
        private String templateBody; 
        private String templateId; 
        private String templateURL; 
        private String templateVersion; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceProvisionsRequest request) {
            super(request);
            this.parameters = request.parameters;
            this.regionId = request.regionId;
            this.services = request.services;
            this.templateBody = request.templateBody;
            this.templateId = request.templateId;
            this.templateURL = request.templateURL;
            this.templateVersion = request.templateVersion;
        } 

        /**
         * The parameters.
         */
        public Builder parameters(java.util.List < Parameters> parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The services.
         */
        public Builder services(java.util.List < Services> services) {
            this.putQueryParameter("Services", services);
            this.services = services;
            return this;
        }

        /**
         * TemplateBody.
         */
        public Builder templateBody(String templateBody) {
            this.putBodyParameter("TemplateBody", templateBody);
            this.templateBody = templateBody;
            return this;
        }

        /**
         * The template ID. This parameter applies to shared and private templates.
         * <p>
         * 
         * You must and can specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, and Services.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an Object Storage Service (OSS) bucket, such as oss://ros/template/demo or oss://ros/template/demo?RegionId=cn-hangzhou. The template body must be 1 to 524,288 bytes in length. If you do not specify the region ID of the OSS bucket, the value of RegionId is used.
         * <p>
         * 
         * You must and can specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, and Services.
         */
        public Builder templateURL(String templateURL) {
            this.putQueryParameter("TemplateURL", templateURL);
            this.templateURL = templateURL;
            return this;
        }

        /**
         * The version of the template. If you do not specify this parameter, the latest version is used.
         * <p>
         * 
         * This parameter takes effect only when TemplateId is specified.
         */
        public Builder templateVersion(String templateVersion) {
            this.putQueryParameter("TemplateVersion", templateVersion);
            this.templateVersion = templateVersion;
            return this;
        }

        @Override
        public GetServiceProvisionsRequest build() {
            return new GetServiceProvisionsRequest(this);
        } 

    } 

    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParameterKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String parameterKey;

        @com.aliyun.core.annotation.NameInMap("ParameterValue")
        @com.aliyun.core.annotation.Validation(required = true)
        private String parameterValue;

        private Parameters(Builder builder) {
            this.parameterKey = builder.parameterKey;
            this.parameterValue = builder.parameterValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return parameterKey
         */
        public String getParameterKey() {
            return this.parameterKey;
        }

        /**
         * @return parameterValue
         */
        public String getParameterValue() {
            return this.parameterValue;
        }

        public static final class Builder {
            private String parameterKey; 
            private String parameterValue; 

            /**
             * The name of the parameter. If you do not specify the name and value of a parameter, Resource Orchestration Service (ROS) uses the default name and value that are specified in the template.
             * <p>
             * 
             * > The Parameters parameter is optional. If you specify Parameters, you must specify ParameterKey.
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * The value of the parameter.
             * <p>
             * 
             * > The Parameters parameter is optional. If you specify Parameters, you must specify ParameterValue.
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
    public static class Services extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServiceName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String serviceName;

        private Services(Builder builder) {
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Services create() {
            return builder().build();
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private String serviceName; 

            /**
             * The name of the service or feature. Valid values:
             * <p>
             * 
             * *   AHAS: Application High Availability Service
             * *   ARMS: Application Real-Time Monitoring Service (ARMS)
             * *   ApiGateway: API Gateway
             * *   BatchCompute: Batch Compute
             * *   BrainIndustrial: Industrial Brain
             * *   CloudStorageGateway: Cloud Storage Gateway (CSG)
             * *   CMS: CloudMonitor
             * *   CR: Container Registry
             * *   CS: Container Service for Kubernetes (ACK)
             * *   DCDN: Dynamic Content Delivery Network (DCDN)
             * *   DataHub: DataHub
             * *   DataWorks: DataWorks
             * *   EDAS: Enterprise Distributed Application Service (EDAS)
             * *   EHPC: E-HPC
             * *   EMAS: Enterprise Mobile Application Studio (EMAS)
             * *   FC: Function Compute
             * *   FNF: CloudFlow (SWF)
             * *   MaxCompute: MaxCompute
             * *   MNS: Message Service (MNS)
             * *   HBR: Cloud Backup
             * *   IMM: Intelligent Media Management (IMM)
             * *   IOT: IoT Platform
             * *   KMS: Key Management Service (KMS)
             * *   NAS: Apsara File Storage NAS (NAS)
             * *   NLP: Natural Language Processing (NLP)
             * *   OSS: Object Storage Service (OSS)
             * *   OTS: Tablestore
             * *   PrivateLink: PrivateLink
             * *   PrivateZone: Alibaba Cloud DNS PrivateZone
             * *   RocketMQ: ApsaraMQ for RocketMQ
             * *   SAE: Serverless App Engine (SAE)
             * *   SLS: Simple Log Service (SLS)
             * *   TrafficMirror: traffic mirroring
             * *   VS: Video Surveillance System
             * *   Xtrace: Managed Service for OpenTelemetry
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public Services build() {
                return new Services(this);
            } 

        } 

    }
}
