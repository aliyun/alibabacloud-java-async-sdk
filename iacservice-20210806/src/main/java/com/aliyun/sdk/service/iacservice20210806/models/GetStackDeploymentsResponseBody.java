// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link GetStackDeploymentsResponseBody} extends {@link TeaModel}
 *
 * <p>GetStackDeploymentsResponseBody</p>
 */
public class GetStackDeploymentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("deployments")
    private java.util.List<Deployments> deployments;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private GetStackDeploymentsResponseBody(Builder builder) {
        this.deployments = builder.deployments;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStackDeploymentsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deployments
     */
    public java.util.List<Deployments> getDeployments() {
        return this.deployments;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Deployments> deployments; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(GetStackDeploymentsResponseBody model) {
            this.deployments = model.deployments;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * deployments.
         */
        public Builder deployments(java.util.List<Deployments> deployments) {
            this.deployments = deployments;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>BF72A6FB-B071-5F2E-A036-9D62545B962C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetStackDeploymentsResponseBody build() {
            return new GetStackDeploymentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStackDeploymentsResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackDeploymentsResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("autoApply")
        private Boolean autoApply;

        @com.aliyun.core.annotation.NameInMap("isDestroy")
        private Boolean isDestroy;

        private Config(Builder builder) {
            this.autoApply = builder.autoApply;
            this.isDestroy = builder.isDestroy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return autoApply
         */
        public Boolean getAutoApply() {
            return this.autoApply;
        }

        /**
         * @return isDestroy
         */
        public Boolean getIsDestroy() {
            return this.isDestroy;
        }

        public static final class Builder {
            private Boolean autoApply; 
            private Boolean isDestroy; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.autoApply = model.autoApply;
                this.isDestroy = model.isDestroy;
            } 

            /**
             * autoApply.
             */
            public Builder autoApply(Boolean autoApply) {
                this.autoApply = autoApply;
                return this;
            }

            /**
             * isDestroy.
             */
            public Builder isDestroy(Boolean isDestroy) {
                this.isDestroy = isDestroy;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStackDeploymentsResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackDeploymentsResponseBody</p>
     */
    public static class Outputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Outputs(Builder builder) {
            this.description = builder.description;
            this.expression = builder.expression;
            this.name = builder.name;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Outputs create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String expression; 
            private String name; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(Outputs model) {
                this.description = model.description;
                this.expression = model.expression;
                this.name = model.name;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * expression.
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Outputs build() {
                return new Outputs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStackDeploymentsResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackDeploymentsResponseBody</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("defaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("sensitive")
        private Boolean sensitive;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Parameters(Builder builder) {
            this.defaultValue = builder.defaultValue;
            this.description = builder.description;
            this.name = builder.name;
            this.sensitive = builder.sensitive;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sensitive
         */
        public Boolean getSensitive() {
            return this.sensitive;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String defaultValue; 
            private String description; 
            private String name; 
            private Boolean sensitive; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.defaultValue = model.defaultValue;
                this.description = model.description;
                this.name = model.name;
                this.sensitive = model.sensitive;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * defaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * sensitive.
             */
            public Builder sensitive(Boolean sensitive) {
                this.sensitive = sensitive;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStackDeploymentsResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackDeploymentsResponseBody</p>
     */
    public static class ModuleActionDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("add")
        private Integer add;

        @com.aliyun.core.annotation.NameInMap("change")
        private Integer change;

        @com.aliyun.core.annotation.NameInMap("destroy")
        private Integer destroy;

        private ModuleActionDetail(Builder builder) {
            this.add = builder.add;
            this.change = builder.change;
            this.destroy = builder.destroy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleActionDetail create() {
            return builder().build();
        }

        /**
         * @return add
         */
        public Integer getAdd() {
            return this.add;
        }

        /**
         * @return change
         */
        public Integer getChange() {
            return this.change;
        }

        /**
         * @return destroy
         */
        public Integer getDestroy() {
            return this.destroy;
        }

        public static final class Builder {
            private Integer add; 
            private Integer change; 
            private Integer destroy; 

            private Builder() {
            } 

            private Builder(ModuleActionDetail model) {
                this.add = model.add;
                this.change = model.change;
                this.destroy = model.destroy;
            } 

            /**
             * add.
             */
            public Builder add(Integer add) {
                this.add = add;
                return this;
            }

            /**
             * change.
             */
            public Builder change(Integer change) {
                this.change = change;
                return this;
            }

            /**
             * destroy.
             */
            public Builder destroy(Integer destroy) {
                this.destroy = destroy;
                return this;
            }

            public ModuleActionDetail build() {
                return new ModuleActionDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStackDeploymentsResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackDeploymentsResponseBody</p>
     */
    public static class ResourceChanges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("change")
        private String change;

        @com.aliyun.core.annotation.NameInMap("resourceActions")
        private java.util.List<String> resourceActions;

        @com.aliyun.core.annotation.NameInMap("resourceIdentifier")
        private String resourceIdentifier;

        private ResourceChanges(Builder builder) {
            this.change = builder.change;
            this.resourceActions = builder.resourceActions;
            this.resourceIdentifier = builder.resourceIdentifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceChanges create() {
            return builder().build();
        }

        /**
         * @return change
         */
        public String getChange() {
            return this.change;
        }

        /**
         * @return resourceActions
         */
        public java.util.List<String> getResourceActions() {
            return this.resourceActions;
        }

        /**
         * @return resourceIdentifier
         */
        public String getResourceIdentifier() {
            return this.resourceIdentifier;
        }

        public static final class Builder {
            private String change; 
            private java.util.List<String> resourceActions; 
            private String resourceIdentifier; 

            private Builder() {
            } 

            private Builder(ResourceChanges model) {
                this.change = model.change;
                this.resourceActions = model.resourceActions;
                this.resourceIdentifier = model.resourceIdentifier;
            } 

            /**
             * change.
             */
            public Builder change(String change) {
                this.change = change;
                return this;
            }

            /**
             * resourceActions.
             */
            public Builder resourceActions(java.util.List<String> resourceActions) {
                this.resourceActions = resourceActions;
                return this;
            }

            /**
             * resourceIdentifier.
             */
            public Builder resourceIdentifier(String resourceIdentifier) {
                this.resourceIdentifier = resourceIdentifier;
                return this;
            }

            public ResourceChanges build() {
                return new ResourceChanges(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStackDeploymentsResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackDeploymentsResponseBody</p>
     */
    public static class PlanOutputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("moduleAction")
        private String moduleAction;

        @com.aliyun.core.annotation.NameInMap("moduleActionDetail")
        private ModuleActionDetail moduleActionDetail;

        @com.aliyun.core.annotation.NameInMap("resourceChanges")
        private java.util.List<ResourceChanges> resourceChanges;

        @com.aliyun.core.annotation.NameInMap("stackModuleName")
        private String stackModuleName;

        private PlanOutputs(Builder builder) {
            this.moduleAction = builder.moduleAction;
            this.moduleActionDetail = builder.moduleActionDetail;
            this.resourceChanges = builder.resourceChanges;
            this.stackModuleName = builder.stackModuleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlanOutputs create() {
            return builder().build();
        }

        /**
         * @return moduleAction
         */
        public String getModuleAction() {
            return this.moduleAction;
        }

        /**
         * @return moduleActionDetail
         */
        public ModuleActionDetail getModuleActionDetail() {
            return this.moduleActionDetail;
        }

        /**
         * @return resourceChanges
         */
        public java.util.List<ResourceChanges> getResourceChanges() {
            return this.resourceChanges;
        }

        /**
         * @return stackModuleName
         */
        public String getStackModuleName() {
            return this.stackModuleName;
        }

        public static final class Builder {
            private String moduleAction; 
            private ModuleActionDetail moduleActionDetail; 
            private java.util.List<ResourceChanges> resourceChanges; 
            private String stackModuleName; 

            private Builder() {
            } 

            private Builder(PlanOutputs model) {
                this.moduleAction = model.moduleAction;
                this.moduleActionDetail = model.moduleActionDetail;
                this.resourceChanges = model.resourceChanges;
                this.stackModuleName = model.stackModuleName;
            } 

            /**
             * moduleAction.
             */
            public Builder moduleAction(String moduleAction) {
                this.moduleAction = moduleAction;
                return this;
            }

            /**
             * moduleActionDetail.
             */
            public Builder moduleActionDetail(ModuleActionDetail moduleActionDetail) {
                this.moduleActionDetail = moduleActionDetail;
                return this;
            }

            /**
             * resourceChanges.
             */
            public Builder resourceChanges(java.util.List<ResourceChanges> resourceChanges) {
                this.resourceChanges = resourceChanges;
                return this;
            }

            /**
             * stackModuleName.
             */
            public Builder stackModuleName(String stackModuleName) {
                this.stackModuleName = stackModuleName;
                return this;
            }

            public PlanOutputs build() {
                return new PlanOutputs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStackDeploymentsResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackDeploymentsResponseBody</p>
     */
    public static class Deployments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("configVersion")
        private String configVersion;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("deploymentName")
        private String deploymentName;

        @com.aliyun.core.annotation.NameInMap("deploymentNo")
        private String deploymentNo;

        @com.aliyun.core.annotation.NameInMap("deploymentVersion")
        private String deploymentVersion;

        @com.aliyun.core.annotation.NameInMap("elapsedTime")
        private Long elapsedTime;

        @com.aliyun.core.annotation.NameInMap("executeType")
        private String executeType;

        @com.aliyun.core.annotation.NameInMap("failedReason")
        private String failedReason;

        @com.aliyun.core.annotation.NameInMap("jobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("outputs")
        private java.util.List<Outputs> outputs;

        @com.aliyun.core.annotation.NameInMap("parameters")
        private java.util.List<Parameters> parameters;

        @com.aliyun.core.annotation.NameInMap("planOutputs")
        private java.util.List<PlanOutputs> planOutputs;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        private Deployments(Builder builder) {
            this.config = builder.config;
            this.configVersion = builder.configVersion;
            this.createTime = builder.createTime;
            this.deploymentName = builder.deploymentName;
            this.deploymentNo = builder.deploymentNo;
            this.deploymentVersion = builder.deploymentVersion;
            this.elapsedTime = builder.elapsedTime;
            this.executeType = builder.executeType;
            this.failedReason = builder.failedReason;
            this.jobId = builder.jobId;
            this.outputs = builder.outputs;
            this.parameters = builder.parameters;
            this.planOutputs = builder.planOutputs;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Deployments create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
        }

        /**
         * @return configVersion
         */
        public String getConfigVersion() {
            return this.configVersion;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deploymentName
         */
        public String getDeploymentName() {
            return this.deploymentName;
        }

        /**
         * @return deploymentNo
         */
        public String getDeploymentNo() {
            return this.deploymentNo;
        }

        /**
         * @return deploymentVersion
         */
        public String getDeploymentVersion() {
            return this.deploymentVersion;
        }

        /**
         * @return elapsedTime
         */
        public Long getElapsedTime() {
            return this.elapsedTime;
        }

        /**
         * @return executeType
         */
        public String getExecuteType() {
            return this.executeType;
        }

        /**
         * @return failedReason
         */
        public String getFailedReason() {
            return this.failedReason;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return outputs
         */
        public java.util.List<Outputs> getOutputs() {
            return this.outputs;
        }

        /**
         * @return parameters
         */
        public java.util.List<Parameters> getParameters() {
            return this.parameters;
        }

        /**
         * @return planOutputs
         */
        public java.util.List<PlanOutputs> getPlanOutputs() {
            return this.planOutputs;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private Config config; 
            private String configVersion; 
            private String createTime; 
            private String deploymentName; 
            private String deploymentNo; 
            private String deploymentVersion; 
            private Long elapsedTime; 
            private String executeType; 
            private String failedReason; 
            private String jobId; 
            private java.util.List<Outputs> outputs; 
            private java.util.List<Parameters> parameters; 
            private java.util.List<PlanOutputs> planOutputs; 
            private String status; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Deployments model) {
                this.config = model.config;
                this.configVersion = model.configVersion;
                this.createTime = model.createTime;
                this.deploymentName = model.deploymentName;
                this.deploymentNo = model.deploymentNo;
                this.deploymentVersion = model.deploymentVersion;
                this.elapsedTime = model.elapsedTime;
                this.executeType = model.executeType;
                this.failedReason = model.failedReason;
                this.jobId = model.jobId;
                this.outputs = model.outputs;
                this.parameters = model.parameters;
                this.planOutputs = model.planOutputs;
                this.status = model.status;
                this.taskId = model.taskId;
            } 

            /**
             * config.
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * configVersion.
             */
            public Builder configVersion(String configVersion) {
                this.configVersion = configVersion;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * deploymentName.
             */
            public Builder deploymentName(String deploymentName) {
                this.deploymentName = deploymentName;
                return this;
            }

            /**
             * deploymentNo.
             */
            public Builder deploymentNo(String deploymentNo) {
                this.deploymentNo = deploymentNo;
                return this;
            }

            /**
             * deploymentVersion.
             */
            public Builder deploymentVersion(String deploymentVersion) {
                this.deploymentVersion = deploymentVersion;
                return this;
            }

            /**
             * elapsedTime.
             */
            public Builder elapsedTime(Long elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * executeType.
             */
            public Builder executeType(String executeType) {
                this.executeType = executeType;
                return this;
            }

            /**
             * failedReason.
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * jobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * outputs.
             */
            public Builder outputs(java.util.List<Outputs> outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * parameters.
             */
            public Builder parameters(java.util.List<Parameters> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * planOutputs.
             */
            public Builder planOutputs(java.util.List<PlanOutputs> planOutputs) {
                this.planOutputs = planOutputs;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * taskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Deployments build() {
                return new Deployments(this);
            } 

        } 

    }
}
