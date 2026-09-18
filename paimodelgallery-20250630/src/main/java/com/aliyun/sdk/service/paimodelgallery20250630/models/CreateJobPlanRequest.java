// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paimodelgallery20250630.models;

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
 * {@link CreateJobPlanRequest} extends {@link RequestModel}
 *
 * <p>CreateJobPlanRequest</p>
 */
public class CreateJobPlanRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobPlanName")
    private String jobPlanName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobPlanSteps")
    private java.util.List<JobPlanSteps> jobPlanSteps;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobPlanType")
    private String jobPlanType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateJobPlanRequest(Builder builder) {
        super(builder);
        this.jobPlanName = builder.jobPlanName;
        this.jobPlanSteps = builder.jobPlanSteps;
        this.jobPlanType = builder.jobPlanType;
        this.tag = builder.tag;
        this.templateId = builder.templateId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateJobPlanRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobPlanName
     */
    public String getJobPlanName() {
        return this.jobPlanName;
    }

    /**
     * @return jobPlanSteps
     */
    public java.util.List<JobPlanSteps> getJobPlanSteps() {
        return this.jobPlanSteps;
    }

    /**
     * @return jobPlanType
     */
    public String getJobPlanType() {
        return this.jobPlanType;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateJobPlanRequest, Builder> {
        private String jobPlanName; 
        private java.util.List<JobPlanSteps> jobPlanSteps; 
        private String jobPlanType; 
        private java.util.List<Tag> tag; 
        private String templateId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateJobPlanRequest request) {
            super(request);
            this.jobPlanName = request.jobPlanName;
            this.jobPlanSteps = request.jobPlanSteps;
            this.jobPlanType = request.jobPlanType;
            this.tag = request.tag;
            this.templateId = request.templateId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The name of the job plan.</p>
         * 
         * <strong>example:</strong>
         * <p>ModelGalleryxxx</p>
         */
        public Builder jobPlanName(String jobPlanName) {
            this.putBodyParameter("JobPlanName", jobPlanName);
            this.jobPlanName = jobPlanName;
            return this;
        }

        /**
         * <p>The steps of the job plan.</p>
         */
        public Builder jobPlanSteps(java.util.List<JobPlanSteps> jobPlanSteps) {
            this.putBodyParameter("JobPlanSteps", jobPlanSteps);
            this.jobPlanSteps = jobPlanSteps;
            return this;
        }

        /**
         * <p>The type of the job plan.</p>
         * 
         * <strong>example:</strong>
         * <p>Distillation</p>
         */
        public Builder jobPlanType(String jobPlanType) {
            this.putBodyParameter("JobPlanType", jobPlanType);
            this.jobPlanType = jobPlanType;
            return this;
        }

        /**
         * <p>Note: According to the Alibaba Cloud tag system specification, this parameter name is in singular form.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the scenario-specific distillation template, obtained from ListDistillationTemplates. If this parameter is not specified, a general-purpose job plan is created.</p>
         * 
         * <strong>example:</strong>
         * <p>advanced_cot_distill</p>
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>62469</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateJobPlanRequest build() {
            return new CreateJobPlanRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateJobPlanRequest} extends {@link TeaModel}
     *
     * <p>CreateJobPlanRequest</p>
     */
    public static class JobPlanSteps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobPlanStepName")
        private String jobPlanStepName;

        @com.aliyun.core.annotation.NameInMap("JobPlanStepSpec")
        private java.util.Map<String, ?> jobPlanStepSpec;

        @com.aliyun.core.annotation.NameInMap("JobPlanStepType")
        private String jobPlanStepType;

        private JobPlanSteps(Builder builder) {
            this.jobPlanStepName = builder.jobPlanStepName;
            this.jobPlanStepSpec = builder.jobPlanStepSpec;
            this.jobPlanStepType = builder.jobPlanStepType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobPlanSteps create() {
            return builder().build();
        }

        /**
         * @return jobPlanStepName
         */
        public String getJobPlanStepName() {
            return this.jobPlanStepName;
        }

        /**
         * @return jobPlanStepSpec
         */
        public java.util.Map<String, ?> getJobPlanStepSpec() {
            return this.jobPlanStepSpec;
        }

        /**
         * @return jobPlanStepType
         */
        public String getJobPlanStepType() {
            return this.jobPlanStepType;
        }

        public static final class Builder {
            private String jobPlanStepName; 
            private java.util.Map<String, ?> jobPlanStepSpec; 
            private String jobPlanStepType; 

            private Builder() {
            } 

            private Builder(JobPlanSteps model) {
                this.jobPlanStepName = model.jobPlanStepName;
                this.jobPlanStepSpec = model.jobPlanStepSpec;
                this.jobPlanStepType = model.jobPlanStepType;
            } 

            /**
             * <p>The name of the job plan step.</p>
             * 
             * <strong>example:</strong>
             * <p>DatasetSynthesis</p>
             */
            public Builder jobPlanStepName(String jobPlanStepName) {
                this.jobPlanStepName = jobPlanStepName;
                return this;
            }

            /**
             * <p>The detailed configuration of the job plan step.</p>
             */
            public Builder jobPlanStepSpec(java.util.Map<String, ?> jobPlanStepSpec) {
                this.jobPlanStepSpec = jobPlanStepSpec;
                return this;
            }

            /**
             * <p>The type of the job plan step.</p>
             * 
             * <strong>example:</strong>
             * <p>PAIFlow</p>
             */
            public Builder jobPlanStepType(String jobPlanStepType) {
                this.jobPlanStepType = jobPlanStepType;
                return this;
            }

            public JobPlanSteps build() {
                return new JobPlanSteps(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateJobPlanRequest} extends {@link TeaModel}
     *
     * <p>CreateJobPlanRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p><strong>Key</strong></p>
             * 
             * <strong>example:</strong>
             * <p>foo</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p><strong>Value</strong></p>
             * 
             * <strong>example:</strong>
             * <p>bar</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
