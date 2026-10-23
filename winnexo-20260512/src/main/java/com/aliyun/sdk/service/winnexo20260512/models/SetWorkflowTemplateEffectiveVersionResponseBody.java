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
 * {@link SetWorkflowTemplateEffectiveVersionResponseBody} extends {@link TeaModel}
 *
 * <p>SetWorkflowTemplateEffectiveVersionResponseBody</p>
 */
public class SetWorkflowTemplateEffectiveVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("createdByUserId")
    private Long createdByUserId;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("effectiveVersion")
    private String effectiveVersion;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("steps")
    private java.util.List<Steps> steps;

    @com.aliyun.core.annotation.NameInMap("templateId")
    private String templateId;

    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    @com.aliyun.core.annotation.NameInMap("versionDescription")
    private String versionDescription;

    @com.aliyun.core.annotation.NameInMap("versionStatus")
    private String versionStatus;

    private SetWorkflowTemplateEffectiveVersionResponseBody(Builder builder) {
        this.code = builder.code;
        this.createdByUserId = builder.createdByUserId;
        this.description = builder.description;
        this.effectiveVersion = builder.effectiveVersion;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.message = builder.message;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.steps = builder.steps;
        this.templateId = builder.templateId;
        this.version = builder.version;
        this.versionDescription = builder.versionDescription;
        this.versionStatus = builder.versionStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetWorkflowTemplateEffectiveVersionResponseBody create() {
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
     * @return createdByUserId
     */
    public Long getCreatedByUserId() {
        return this.createdByUserId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return effectiveVersion
     */
    public String getEffectiveVersion() {
        return this.effectiveVersion;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return steps
     */
    public java.util.List<Steps> getSteps() {
        return this.steps;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @return versionDescription
     */
    public String getVersionDescription() {
        return this.versionDescription;
    }

    /**
     * @return versionStatus
     */
    public String getVersionStatus() {
        return this.versionStatus;
    }

    public static final class Builder {
        private String code; 
        private Long createdByUserId; 
        private String description; 
        private String effectiveVersion; 
        private String gmtCreate; 
        private String gmtModified; 
        private String message; 
        private String name; 
        private String requestId; 
        private java.util.List<Steps> steps; 
        private String templateId; 
        private String version; 
        private String versionDescription; 
        private String versionStatus; 

        private Builder() {
        } 

        private Builder(SetWorkflowTemplateEffectiveVersionResponseBody model) {
            this.code = model.code;
            this.createdByUserId = model.createdByUserId;
            this.description = model.description;
            this.effectiveVersion = model.effectiveVersion;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.message = model.message;
            this.name = model.name;
            this.requestId = model.requestId;
            this.steps = model.steps;
            this.templateId = model.templateId;
            this.version = model.version;
            this.versionDescription = model.versionDescription;
            this.versionStatus = model.versionStatus;
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
         * <p>The user ID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder createdByUserId(Long createdByUserId) {
            this.createdByUserId = createdByUserId;
            return this;
        }

        /**
         * <p>The description of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The current effective version number of the template. An empty value indicates that only a draft exists and the template cannot be used for work items.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder effectiveVersion(String effectiveVersion) {
            this.effectiveVersion = effectiveVersion;
            return this;
        }

        /**
         * <p>The creation time in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The modification time in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The error description.</p>
         * 
         * <strong>example:</strong>
         * <p>The requested resource does not exist</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The request tracking ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ordered steps.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder steps(java.util.List<Steps> steps) {
            this.steps = steps;
            return this;
        }

        /**
         * <p>The ID of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>tpl_example</p>
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The version number to which the returned content belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * <p>The change description of the version. An empty value indicates that no description is provided.</p>
         * 
         * <strong>example:</strong>
         * <p>Added a review step</p>
         */
        public Builder versionDescription(String versionDescription) {
            this.versionDescription = versionDescription;
            return this;
        }

        /**
         * <p>The version status. Valid values:</p>
         * <ul>
         * <li>DRAFT: Draft.</li>
         * <li>SUBMITTED: Submitted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUBMITTED</p>
         */
        public Builder versionStatus(String versionStatus) {
            this.versionStatus = versionStatus;
            return this;
        }

        public SetWorkflowTemplateEffectiveVersionResponseBody build() {
            return new SetWorkflowTemplateEffectiveVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SetWorkflowTemplateEffectiveVersionResponseBody} extends {@link TeaModel}
     *
     * <p>SetWorkflowTemplateEffectiveVersionResponseBody</p>
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
             * <p>The name of the step.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The name of the digital worker executor. This parameter is required when ownerType is set to AGENT.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder ownerAgentName(String ownerAgentName) {
                this.ownerAgentName = ownerAgentName;
                return this;
            }

            /**
             * <p>The type of the executor. Valid values:</p>
             * <ul>
             * <li>MEMBER: Workspace member.</li>
             * <li>AGENT: Digital worker.</li>
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
             * <p>The user ID of the member executor. This parameter is required when ownerType is set to MEMBER.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ownerUserId(Long ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * <p>The list of user IDs of the owners (formerly reviewers). This parameter is valid only for steps with a digital worker executor and is always empty for steps with a member executor.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder reviewerUserIds(java.util.List<Long> reviewerUserIds) {
                this.reviewerUserIds = reviewerUserIds;
                return this;
            }

            /**
             * <p>The order of the step.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sortOrder(Long sortOrder) {
                this.sortOrder = sortOrder;
                return this;
            }

            /**
             * <p>The array of ordered step description segments. Supported types include text, mention, skill, app, files, and web_search. When plain text is entered, a single text segment is returned. The fields and nested attachments of each segment are retained as-is by the backend.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;type&quot;:&quot;text&quot;,&quot;content&quot;:&quot;Organize input materials&quot;}]</p>
             */
            public Builder specification(String specification) {
                this.specification = specification;
                return this;
            }

            /**
             * <p>The array of structured step description segments. Supported types include text, mention, skill, app, files, and web_search. The fields and nested attachments of each segment are retained as-is by the backend.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;type&quot;:&quot;text&quot;,&quot;content&quot;:&quot;Organize input materials&quot;}]</p>
             */
            public Builder specificationJson(java.util.List<java.util.Map<String, ?>> specificationJson) {
                this.specificationJson = specificationJson;
                return this;
            }

            /**
             * <p>The ID of the step.</p>
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
}
