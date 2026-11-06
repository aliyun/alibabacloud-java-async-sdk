// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link ExportWorkflowTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>ExportWorkflowTemplateResponseBody</p>
 */
public class ExportWorkflowTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("template")
    private Template template;

    private ExportWorkflowTemplateResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.template = builder.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportWorkflowTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return template
     */
    public Template getTemplate() {
        return this.template;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Template template; 

        private Builder() {
        } 

        private Builder(ExportWorkflowTemplateResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.template = model.template;
        } 

        /**
         * <p>The business status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The requested resource does not exist</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The simplified template definition that can be re-imported.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;name\&quot;:\&quot;客户投诉处理流程\&quot;,\&quot;schemaVersion\&quot;:2}</p>
         */
        public Builder template(Template template) {
            this.template = template;
            return this;
        }

        public ExportWorkflowTemplateResponseBody build() {
            return new ExportWorkflowTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExportWorkflowTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>ExportWorkflowTemplateResponseBody</p>
     */
    public static class Steps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modelMode")
        private String modelMode;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ownerAgentName")
        private String ownerAgentName;

        @com.aliyun.core.annotation.NameInMap("ownerType")
        private String ownerType;

        @com.aliyun.core.annotation.NameInMap("ownerUserId")
        private Long ownerUserId;

        @com.aliyun.core.annotation.NameInMap("reviewOutput")
        private Boolean reviewOutput;

        @com.aliyun.core.annotation.NameInMap("reviewerUserIds")
        private java.util.List<Long> reviewerUserIds;

        @com.aliyun.core.annotation.NameInMap("sortOrder")
        private Long sortOrder;

        @com.aliyun.core.annotation.NameInMap("specification")
        private String specification;

        @com.aliyun.core.annotation.NameInMap("specificationJson")
        private java.util.List<java.util.Map<String, ?>> specificationJson;

        @com.aliyun.core.annotation.NameInMap("stepId")
        private String stepId;

        private Steps(Builder builder) {
            this.modelMode = builder.modelMode;
            this.name = builder.name;
            this.ownerAgentName = builder.ownerAgentName;
            this.ownerType = builder.ownerType;
            this.ownerUserId = builder.ownerUserId;
            this.reviewOutput = builder.reviewOutput;
            this.reviewerUserIds = builder.reviewerUserIds;
            this.sortOrder = builder.sortOrder;
            this.specification = builder.specification;
            this.specificationJson = builder.specificationJson;
            this.stepId = builder.stepId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Steps create() {
            return builder().build();
        }

        /**
         * @return modelMode
         */
        public String getModelMode() {
            return this.modelMode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ownerAgentName
         */
        public String getOwnerAgentName() {
            return this.ownerAgentName;
        }

        /**
         * @return ownerType
         */
        public String getOwnerType() {
            return this.ownerType;
        }

        /**
         * @return ownerUserId
         */
        public Long getOwnerUserId() {
            return this.ownerUserId;
        }

        /**
         * @return reviewOutput
         */
        public Boolean getReviewOutput() {
            return this.reviewOutput;
        }

        /**
         * @return reviewerUserIds
         */
        public java.util.List<Long> getReviewerUserIds() {
            return this.reviewerUserIds;
        }

        /**
         * @return sortOrder
         */
        public Long getSortOrder() {
            return this.sortOrder;
        }

        /**
         * @return specification
         */
        public String getSpecification() {
            return this.specification;
        }

        /**
         * @return specificationJson
         */
        public java.util.List<java.util.Map<String, ?>> getSpecificationJson() {
            return this.specificationJson;
        }

        /**
         * @return stepId
         */
        public String getStepId() {
            return this.stepId;
        }

        public static final class Builder {
            private String modelMode; 
            private String name; 
            private String ownerAgentName; 
            private String ownerType; 
            private Long ownerUserId; 
            private Boolean reviewOutput; 
            private java.util.List<Long> reviewerUserIds; 
            private Long sortOrder; 
            private String specification; 
            private java.util.List<java.util.Map<String, ?>> specificationJson; 
            private String stepId; 

            private Builder() {
            } 

            private Builder(Steps model) {
                this.modelMode = model.modelMode;
                this.name = model.name;
                this.ownerAgentName = model.ownerAgentName;
                this.ownerType = model.ownerType;
                this.ownerUserId = model.ownerUserId;
                this.reviewOutput = model.reviewOutput;
                this.reviewerUserIds = model.reviewerUserIds;
                this.sortOrder = model.sortOrder;
                this.specification = model.specification;
                this.specificationJson = model.specificationJson;
                this.stepId = model.stepId;
            } 

            /**
             * <p>The model tier.</p>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder modelMode(String modelMode) {
                this.modelMode = modelMode;
                return this;
            }

            /**
             * <p>The step name.</p>
             * 
             * <strong>example:</strong>
             * <p>Customer complaint handling process</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The name of the agent owner.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder ownerAgentName(String ownerAgentName) {
                this.ownerAgentName = ownerAgentName;
                return this;
            }

            /**
             * <p>The owner type. Valid values:</p>
             * <ul>
             * <li>MEMBER: Human.</li>
             * <li>AGENT: Agent.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MEMBER</p>
             */
            public Builder ownerType(String ownerType) {
                this.ownerType = ownerType;
                return this;
            }

            /**
             * <p>The user ID of the human owner.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ownerUserId(Long ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * <p>是否人工审核产出物，默认关闭；仅数字员工可开启，审核待办自动发负责人</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder reviewOutput(Boolean reviewOutput) {
                this.reviewOutput = reviewOutput;
                return this;
            }

            /**
             * <p>The user IDs of the reviewers.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder reviewerUserIds(java.util.List<Long> reviewerUserIds) {
                this.reviewerUserIds = reviewerUserIds;
                return this;
            }

            /**
             * <p>The step order.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sortOrder(Long sortOrder) {
                this.sortOrder = sortOrder;
                return this;
            }

            /**
             * <p>The step handling instructions.</p>
             * 
             * <strong>example:</strong>
             * <p>Collect customer information and submit it to the owner for review</p>
             */
            public Builder specification(String specification) {
                this.specification = specification;
                return this;
            }

            /**
             * <p>The ordered array of fragments. Supports text, mention, skill, app, files, and web_search. Preserves referenced identities and order.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;type&quot;:&quot;text&quot;,&quot;content&quot;:&quot;整理输入资料&quot;}]</p>
             */
            public Builder specificationJson(java.util.List<java.util.Map<String, ?>> specificationJson) {
                this.specificationJson = specificationJson;
                return this;
            }

            /**
             * <p>The step ID.</p>
             * 
             * <strong>example:</strong>
             * <p>collect</p>
             */
            public Builder stepId(String stepId) {
                this.stepId = stepId;
                return this;
            }

            public Steps build() {
                return new Steps(this);
            } 

        } 

    }
    /**
     * 
     * {@link ExportWorkflowTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>ExportWorkflowTemplateResponseBody</p>
     */
    public static class Template extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("edges")
        private java.util.List<java.util.Map<String, ?>> edges;

        @com.aliyun.core.annotation.NameInMap("layout")
        private java.util.Map<String, ?> layout;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("schemaVersion")
        private Long schemaVersion;

        @com.aliyun.core.annotation.NameInMap("steps")
        private java.util.List<Steps> steps;

        private Template(Builder builder) {
            this.description = builder.description;
            this.edges = builder.edges;
            this.layout = builder.layout;
            this.name = builder.name;
            this.schemaVersion = builder.schemaVersion;
            this.steps = builder.steps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Template create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return edges
         */
        public java.util.List<java.util.Map<String, ?>> getEdges() {
            return this.edges;
        }

        /**
         * @return layout
         */
        public java.util.Map<String, ?> getLayout() {
            return this.layout;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return schemaVersion
         */
        public Long getSchemaVersion() {
            return this.schemaVersion;
        }

        /**
         * @return steps
         */
        public java.util.List<Steps> getSteps() {
            return this.steps;
        }

        public static final class Builder {
            private String description; 
            private java.util.List<java.util.Map<String, ?>> edges; 
            private java.util.Map<String, ?> layout; 
            private String name; 
            private Long schemaVersion; 
            private java.util.List<Steps> steps; 

            private Builder() {
            } 

            private Builder(Template model) {
                this.description = model.description;
                this.edges = model.edges;
                this.layout = model.layout;
                this.name = model.name;
                this.schemaVersion = model.schemaVersion;
                this.steps = model.steps;
            } 

            /**
             * <p>The template description.</p>
             * 
             * <strong>example:</strong>
             * <p>Standard process for handling customer complaints</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>节点依赖边；每项包含from/to，引用稳定stepId</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder edges(java.util.List<java.util.Map<String, ?>> edges) {
                this.edges = edges;
                return this;
            }

            /**
             * <p>可选画布布局，按stepId索引；只影响展示，不决定依赖</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;collect&quot;:{&quot;x&quot;:0,&quot;y&quot;:0},&quot;review&quot;:{&quot;x&quot;:240,&quot;y&quot;:0}}</p>
             */
            public Builder layout(java.util.Map<String, ?> layout) {
                this.layout = layout;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>Customer complaint handling process</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>模板结构版本，当前为2，与业务版本vN独立</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder schemaVersion(Long schemaVersion) {
                this.schemaVersion = schemaVersion;
                return this;
            }

            /**
             * <p>The standardized steps.</p>
             * 
             * <strong>example:</strong>
             * <p>[{\&quot;stepId\&quot;:\&quot;collect\&quot;,\&quot;sortOrder\&quot;:1,\&quot;name\&quot;:\&quot;收集客户信息\&quot;}]</p>
             */
            public Builder steps(java.util.List<Steps> steps) {
                this.steps = steps;
                return this;
            }

            public Template build() {
                return new Template(this);
            } 

        } 

    }
}
