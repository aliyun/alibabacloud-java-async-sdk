// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

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
 * {@link GetLinkageAttributesTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetLinkageAttributesTemplateRequest</p>
 */
public class GetLinkageAttributesTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AreaId")
    private String areaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List<Instances> instances;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 50)
    private Long maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetVariable")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetVariable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Variables")
    private java.util.Map<String, ?> variables;

    private GetLinkageAttributesTemplateRequest(Builder builder) {
        super(builder);
        this.areaId = builder.areaId;
        this.instances = builder.instances;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.targetVariable = builder.targetVariable;
        this.templateId = builder.templateId;
        this.variables = builder.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLinkageAttributesTemplateRequest create() {
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
     * @return instances
     */
    public java.util.List<Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return targetVariable
     */
    public String getTargetVariable() {
        return this.targetVariable;
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
    public java.util.Map<String, ?> getVariables() {
        return this.variables;
    }

    public static final class Builder extends Request.Builder<GetLinkageAttributesTemplateRequest, Builder> {
        private String areaId; 
        private java.util.List<Instances> instances; 
        private Long maxResults; 
        private String nextToken; 
        private String targetVariable; 
        private String templateId; 
        private java.util.Map<String, ?> variables; 

        private Builder() {
            super();
        } 

        private Builder(GetLinkageAttributesTemplateRequest request) {
            super(request);
            this.areaId = request.areaId;
            this.instances = request.instances;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.targetVariable = request.targetVariable;
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
         * Instances.
         */
        public Builder instances(java.util.List<Instances> instances) {
            String instancesShrink = shrink(instances, "Instances", "json");
            this.putBodyParameter("Instances", instancesShrink);
            this.instances = instances;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>${instance_type}</p>
         */
        public Builder targetVariable(String targetVariable) {
            this.putBodyParameter("TargetVariable", targetVariable);
            this.targetVariable = targetVariable;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>XFKR6WYRVS24S07R</p>
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * Variables.
         */
        public Builder variables(java.util.Map<String, ?> variables) {
            String variablesShrink = shrink(variables, "Variables", "json");
            this.putBodyParameter("Variables", variablesShrink);
            this.variables = variables;
            return this;
        }

        @Override
        public GetLinkageAttributesTemplateRequest build() {
            return new GetLinkageAttributesTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetLinkageAttributesTemplateRequest} extends {@link TeaModel}
     *
     * <p>GetLinkageAttributesTemplateRequest</p>
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

            private Builder() {
            } 

            private Builder(Instances model) {
                this.id = model.id;
                this.nodeName = model.nodeName;
                this.nodeType = model.nodeType;
            } 

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
