// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The parameters.</p>
         */
        public Builder parameters(java.util.List < Parameters> parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The services.</p>
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
         * <p>The template ID. This parameter applies to shared and private templates.</p>
         * <p>You must and can specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, and Services.</p>
         * 
         * <strong>example:</strong>
         * <p>5ecd1e10-b0e9-4389-a565-e4c15efc****</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an Object Storage Service (OSS) bucket, such as oss://ros/template/demo or oss://ros/template/demo?RegionId=cn-hangzhou. The template body must be 1 to 524,288 bytes in length. If you do not specify the region ID of the OSS bucket, the value of RegionId is used.</p>
         * <p>You must and can specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, and Services.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://ros-template/demo</p>
         */
        public Builder templateURL(String templateURL) {
            this.putQueryParameter("TemplateURL", templateURL);
            this.templateURL = templateURL;
            return this;
        }

        /**
         * <p>The version of the template. If you do not specify this parameter, the latest version is used.</p>
         * <p>This parameter takes effect only when TemplateId is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
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

    /**
     * 
     * {@link GetServiceProvisionsRequest} extends {@link TeaModel}
     *
     * <p>GetServiceProvisionsRequest</p>
     */
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
             * <p>The name of the parameter. If you do not specify the name and value of a parameter, Resource Orchestration Service (ROS) uses the default name and value that are specified in the template.</p>
             * <blockquote>
             * <p>The Parameters parameter is optional. If you specify Parameters, you must specify ParameterKey.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Amount</p>
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * <p>The value of the parameter.</p>
             * <blockquote>
             * <p>The Parameters parameter is optional. If you specify Parameters, you must specify ParameterValue.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
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
    /**
     * 
     * {@link GetServiceProvisionsRequest} extends {@link TeaModel}
     *
     * <p>GetServiceProvisionsRequest</p>
     */
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
             * <p>The name of the service or feature. Valid values:</p>
             * <ul>
             * <li>AHAS: Application High Availability Service</li>
             * <li>ARMS: Application Real-Time Monitoring Service (ARMS)</li>
             * <li>ApiGateway: API Gateway</li>
             * <li>BatchCompute: Batch Compute</li>
             * <li>BrainIndustrial: Industrial Brain</li>
             * <li>CloudStorageGateway: Cloud Storage Gateway (CSG)</li>
             * <li>CMS: CloudMonitor</li>
             * <li>CR: Container Registry</li>
             * <li>CS: Container Service for Kubernetes (ACK)</li>
             * <li>DCDN: Dynamic Content Delivery Network (DCDN)</li>
             * <li>DataHub: DataHub</li>
             * <li>DataWorks: DataWorks</li>
             * <li>EDAS: Enterprise Distributed Application Service (EDAS)</li>
             * <li>EHPC: E-HPC</li>
             * <li>EMAS: Enterprise Mobile Application Studio (EMAS)</li>
             * <li>FC: Function Compute</li>
             * <li>FNF: CloudFlow (SWF)</li>
             * <li>MaxCompute: MaxCompute</li>
             * <li>MNS: Message Service (MNS)</li>
             * <li>HBR: Cloud Backup</li>
             * <li>IMM: Intelligent Media Management (IMM)</li>
             * <li>IOT: IoT Platform</li>
             * <li>KMS: Key Management Service (KMS)</li>
             * <li>NAS: Apsara File Storage NAS (NAS)</li>
             * <li>NLP: Natural Language Processing (NLP)</li>
             * <li>OSS: Object Storage Service (OSS)</li>
             * <li>OTS: Tablestore</li>
             * <li>PrivateLink: PrivateLink</li>
             * <li>PrivateZone: Alibaba Cloud DNS PrivateZone</li>
             * <li>RocketMQ: ApsaraMQ for RocketMQ</li>
             * <li>SAE: Serverless App Engine (SAE)</li>
             * <li>SLS: Simple Log Service (SLS)</li>
             * <li>TrafficMirror: traffic mirroring</li>
             * <li>VS: Video Surveillance System</li>
             * <li>Xtrace: Managed Service for OpenTelemetry</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>EHPC</p>
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
