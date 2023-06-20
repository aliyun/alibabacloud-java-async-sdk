// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValuateTemplateRequest} extends {@link RequestModel}
 *
 * <p>ValuateTemplateRequest</p>
 */
public class ValuateTemplateRequest extends Request {
    @Body
    @NameInMap("AreaId")
    private String areaId;

    @Body
    @NameInMap("ClientToken")
    @Validation(required = true)
    private String clientToken;

    @Body
    @NameInMap("Instances")
    private java.util.List < Instances> instances;

    @Body
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Body
    @NameInMap("TemplateId")
    @Validation(required = true)
    private String templateId;

    @Body
    @NameInMap("Variables")
    private java.util.Map < String, String > variables;

    private ValuateTemplateRequest(Builder builder) {
        super(builder);
        this.areaId = builder.areaId;
        this.clientToken = builder.clientToken;
        this.instances = builder.instances;
        this.resourceGroupId = builder.resourceGroupId;
        this.templateId = builder.templateId;
        this.variables = builder.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValuateTemplateRequest create() {
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
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
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
    public java.util.Map < String, String > getVariables() {
        return this.variables;
    }

    public static final class Builder extends Request.Builder<ValuateTemplateRequest, Builder> {
        private String areaId; 
        private String clientToken; 
        private java.util.List < Instances> instances; 
        private String resourceGroupId; 
        private String templateId; 
        private java.util.Map < String, String > variables; 

        private Builder() {
            super();
        } 

        private Builder(ValuateTemplateRequest request) {
            super(request);
            this.areaId = request.areaId;
            this.clientToken = request.clientToken;
            this.instances = request.instances;
            this.resourceGroupId = request.resourceGroupId;
            this.templateId = request.templateId;
            this.variables = request.variables;
        } 

        /**
         * AreaId.
         */
        public Builder areaId(String areaId) {
            this.putBodyParameter("AreaId", areaId);
            this.areaId = areaId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Instances.
         */
        public Builder instances(java.util.List < Instances> instances) {
            String instancesShrink = shrink(instances, "Instances", "json");
            this.putBodyParameter("Instances", instancesShrink);
            this.instances = instances;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * Variables.
         */
        public Builder variables(java.util.Map < String, String > variables) {
            String variablesShrink = shrink(variables, "Variables", "json");
            this.putBodyParameter("Variables", variablesShrink);
            this.variables = variables;
            return this;
        }

        @Override
        public ValuateTemplateRequest build() {
            return new ValuateTemplateRequest(this);
        } 

    } 

    public static class Instances extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("NodeName")
        private String nodeName;

        @NameInMap("NodeType")
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * NodeType.
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
