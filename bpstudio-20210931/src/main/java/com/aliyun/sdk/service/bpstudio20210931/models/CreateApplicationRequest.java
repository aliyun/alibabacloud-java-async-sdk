// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApplicationRequest} extends {@link RequestModel}
 *
 * <p>CreateApplicationRequest</p>
 */
public class CreateApplicationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AreaId")
    private String areaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Configuration")
    private java.util.Map < String, String > configuration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List < Instances> instances;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Variables")
    private java.util.Map < String, ? > variables;

    private CreateApplicationRequest(Builder builder) {
        super(builder);
        this.areaId = builder.areaId;
        this.clientToken = builder.clientToken;
        this.configuration = builder.configuration;
        this.instances = builder.instances;
        this.name = builder.name;
        this.resourceGroupId = builder.resourceGroupId;
        this.templateId = builder.templateId;
        this.variables = builder.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return areaId
     */
    public String getAreaId() {
        return this.areaId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return configuration
     */
    public java.util.Map < String, String > getConfiguration() {
        return this.configuration;
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return variables
     */
    public java.util.Map < String, ? > getVariables() {
        return this.variables;
    }

    public static final class Builder extends Request.Builder<CreateApplicationRequest, Builder> {
        private String areaId; 
        private String clientToken; 
        private java.util.Map < String, String > configuration; 
        private java.util.List < Instances> instances; 
        private String name; 
        private String resourceGroupId; 
        private String templateId; 
        private java.util.Map < String, ? > variables; 

        private Builder() {
            super();
        } 

        private Builder(CreateApplicationRequest request) {
            super(request);
            this.areaId = request.areaId;
            this.clientToken = request.clientToken;
            this.configuration = request.configuration;
            this.instances = request.instances;
            this.name = request.name;
            this.resourceGroupId = request.resourceGroupId;
            this.templateId = request.templateId;
            this.variables = request.variables;
        } 

        /**
         * The ID of the region.
         */
        public Builder areaId(String areaId) {
            this.putBodyParameter("AreaId", areaId);
            this.areaId = areaId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The parameters that are used to configure the application you want to create. For example, enableMonitor specifies whether to automatically create a CloudMonitor task for the application, and enableReport specifies whether to generate reports.
         */
        public Builder configuration(java.util.Map < String, String > configuration) {
            String configurationShrink = shrink(configuration, "Configuration", "json");
            this.putBodyParameter("Configuration", configurationShrink);
            this.configuration = configuration;
            return this;
        }

        /**
         * The instances in which you want to create the application. You can create applications in an existing virtual private cloud (VPC).
         */
        public Builder instances(java.util.List < Instances> instances) {
            String instancesShrink = shrink(instances, "Instances", "json");
            this.putBodyParameter("Instances", instancesShrink);
            this.instances = instances;
            return this;
        }

        /**
         * The name of the application.
         * <p>
         * 
         * *   The application name must be unique. You can call the [ListApplication](https://www.alibabacloud.com/help/en/bp-studio/latest/api-bpstudio-2021-09-31-listapplication) operation to query the existing applications.
         * *   The application name must be 2 to 128 characters in length. The name must start with a letter and cannot start with `http:// or https://`. The name can contain letters, digits, underscores (\_), and hyphens (-).
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the resource group to which the application you want to create belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The ID of the template.
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * The parameter values that are contained in the template. If the template contains no parameter values, the default values are used.
         */
        public Builder variables(java.util.Map < String, ? > variables) {
            String variablesShrink = shrink(variables, "Variables", "json");
            this.putBodyParameter("Variables", variablesShrink);
            this.variables = variables;
            return this;
        }

        @Override
        public CreateApplicationRequest build() {
            return new CreateApplicationRequest(this);
        } 

    } 

    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        private Instances(Builder builder) {
            this.id = builder.id;
            this.nodeName = builder.nodeName;
            this.nodeType = builder.nodeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        public static final class Builder {
            private String id; 
            private String nodeName; 
            private String nodeType; 

            /**
             * The ID of the instance.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the instance.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * The type of the instance.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
