// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ValuateTemplateRequest} extends {@link RequestModel}
 *
 * <p>ValuateTemplateRequest</p>
 */
public class ValuateTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AreaId")
    private String areaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List < Instances> instances;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Variables")
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
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder areaId(String areaId) {
            this.putBodyParameter("AreaId", areaId);
            this.areaId = areaId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1600765710019</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The instances to be replaced.</p>
         */
        public Builder instances(java.util.List < Instances> instances) {
            String instancesShrink = shrink(instances, "Instances", "json");
            this.putBodyParameter("Instances", instancesShrink);
            this.instances = instances;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the application belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmyjt3c5om3fi</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The template ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0KSHPM6SJU03TNZP</p>
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The parameter values that are contained in the template. If the template contains no parameter values, the default values are used.</p>
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

    /**
     * 
     * {@link ValuateTemplateRequest} extends {@link TeaModel}
     *
     * <p>ValuateTemplateRequest</p>
     */
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
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1q56trhtaq40vlq5oj</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the application instance that is displayed on the diagram.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
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
