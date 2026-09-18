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
 * {@link JobPlan} extends {@link TeaModel}
 *
 * <p>JobPlan</p>
 */
public class JobPlan extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("JobPlanCurrentStep")
    private String jobPlanCurrentStep;

    @com.aliyun.core.annotation.NameInMap("JobPlanId")
    private String jobPlanId;

    @com.aliyun.core.annotation.NameInMap("JobPlanName")
    private String jobPlanName;

    @com.aliyun.core.annotation.NameInMap("JobPlanSteps")
    private java.util.List<JobPlanSteps> jobPlanSteps;

    @com.aliyun.core.annotation.NameInMap("JobPlanType")
    private String jobPlanType;

    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private JobPlan(Builder builder) {
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.jobPlanCurrentStep = builder.jobPlanCurrentStep;
        this.jobPlanId = builder.jobPlanId;
        this.jobPlanName = builder.jobPlanName;
        this.jobPlanSteps = builder.jobPlanSteps;
        this.jobPlanType = builder.jobPlanType;
        this.ownerId = builder.ownerId;
        this.tags = builder.tags;
        this.templateId = builder.templateId;
        this.templateName = builder.templateName;
        this.userId = builder.userId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JobPlan create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return jobPlanCurrentStep
     */
    public String getJobPlanCurrentStep() {
        return this.jobPlanCurrentStep;
    }

    /**
     * @return jobPlanId
     */
    public String getJobPlanId() {
        return this.jobPlanId;
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
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String jobPlanCurrentStep; 
        private String jobPlanId; 
        private String jobPlanName; 
        private java.util.List<JobPlanSteps> jobPlanSteps; 
        private String jobPlanType; 
        private String ownerId; 
        private java.util.List<Tags> tags; 
        private String templateId; 
        private String templateName; 
        private String userId; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(JobPlan model) {
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.jobPlanCurrentStep = model.jobPlanCurrentStep;
            this.jobPlanId = model.jobPlanId;
            this.jobPlanName = model.jobPlanName;
            this.jobPlanSteps = model.jobPlanSteps;
            this.jobPlanType = model.jobPlanType;
            this.ownerId = model.ownerId;
            this.tags = model.tags;
            this.templateId = model.templateId;
            this.templateName = model.templateName;
            this.userId = model.userId;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * JobPlanCurrentStep.
         */
        public Builder jobPlanCurrentStep(String jobPlanCurrentStep) {
            this.jobPlanCurrentStep = jobPlanCurrentStep;
            return this;
        }

        /**
         * JobPlanId.
         */
        public Builder jobPlanId(String jobPlanId) {
            this.jobPlanId = jobPlanId;
            return this;
        }

        /**
         * JobPlanName.
         */
        public Builder jobPlanName(String jobPlanName) {
            this.jobPlanName = jobPlanName;
            return this;
        }

        /**
         * JobPlanSteps.
         */
        public Builder jobPlanSteps(java.util.List<JobPlanSteps> jobPlanSteps) {
            this.jobPlanSteps = jobPlanSteps;
            return this;
        }

        /**
         * JobPlanType.
         */
        public Builder jobPlanType(String jobPlanType) {
            this.jobPlanType = jobPlanType;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The distillation template ID used when creating the task plan. An empty value indicates that this is not a scenario-specific distillation task.</p>
         * 
         * <strong>example:</strong>
         * <p>advanced_cot_distill</p>
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The display name of the distillation template used, localized based on the language specified in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>Chain-of-Thought Reasoning Distillation</p>
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public JobPlan build() {
            return new JobPlan(this);
        } 

    } 

    /**
     * 
     * {@link JobPlan} extends {@link TeaModel}
     *
     * <p>JobPlan</p>
     */
    public static class JobPlanSteps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobPlanStepId")
        private String jobPlanStepId;

        @com.aliyun.core.annotation.NameInMap("JobPlanStepName")
        private String jobPlanStepName;

        @com.aliyun.core.annotation.NameInMap("JobPlanStepSpec")
        private java.util.Map<String, ?> jobPlanStepSpec;

        @com.aliyun.core.annotation.NameInMap("JobPlanStepType")
        private String jobPlanStepType;

        private JobPlanSteps(Builder builder) {
            this.jobPlanStepId = builder.jobPlanStepId;
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
         * @return jobPlanStepId
         */
        public String getJobPlanStepId() {
            return this.jobPlanStepId;
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
            private String jobPlanStepId; 
            private String jobPlanStepName; 
            private java.util.Map<String, ?> jobPlanStepSpec; 
            private String jobPlanStepType; 

            private Builder() {
            } 

            private Builder(JobPlanSteps model) {
                this.jobPlanStepId = model.jobPlanStepId;
                this.jobPlanStepName = model.jobPlanStepName;
                this.jobPlanStepSpec = model.jobPlanStepSpec;
                this.jobPlanStepType = model.jobPlanStepType;
            } 

            /**
             * JobPlanStepId.
             */
            public Builder jobPlanStepId(String jobPlanStepId) {
                this.jobPlanStepId = jobPlanStepId;
                return this;
            }

            /**
             * JobPlanStepName.
             */
            public Builder jobPlanStepName(String jobPlanStepName) {
                this.jobPlanStepName = jobPlanStepName;
                return this;
            }

            /**
             * JobPlanStepSpec.
             */
            public Builder jobPlanStepSpec(java.util.Map<String, ?> jobPlanStepSpec) {
                this.jobPlanStepSpec = jobPlanStepSpec;
                return this;
            }

            /**
             * JobPlanStepType.
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
     * {@link JobPlan} extends {@link TeaModel}
     *
     * <p>JobPlan</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
