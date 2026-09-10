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
         * <p>The deployment results of the stack.</p>
         */
        public Builder deployments(java.util.List<Deployments> deployments) {
            this.deployments = deployments;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BF72A6FB-B071-5F2E-A036-9D62545B962C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
             * <p>Specifies whether to automatically execute the task. Default value: false. Valid values:</p>
             * <ul>
             * <li><strong>false</strong>: No.</li>
             * <li><strong>true</strong>: Yes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoApply(Boolean autoApply) {
                this.autoApply = autoApply;
                return this;
            }

            /**
             * <p>Indicates whether this is a destroy job.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>The name of the SLS log project</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The expression that can reference component outputs, in the format: component.{component name}.{component output name}.</p>
             * 
             * <strong>example:</strong>
             * <p>component.sls.project_name</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>project_name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The parameter type.</p>
             * 
             * <strong>example:</strong>
             * <p>string</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The actual value after the deployment is completed.</p>
             * 
             * <strong>example:</strong>
             * <p>log-project-xxxx</p>
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
             * <p>The default value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>region of the resource</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>region</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Specifies whether the parameter is sensitive. Sensitive parameter values are not visible in the console or API. Valid values:</p>
             * <ul>
             * <li>true: Sensitive.</li>
             * <li>false: Not sensitive.</li>
             * </ul>
             */
            public Builder sensitive(Boolean sensitive) {
                this.sensitive = sensitive;
                return this;
            }

            /**
             * <p>The parameter type.</p>
             * 
             * <strong>example:</strong>
             * <p>string</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The parameter value.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-southeast-6</p>
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
             * <p>The number of resources to be created.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder add(Integer add) {
                this.add = add;
                return this;
            }

            /**
             * <p>The number of resources to be changed.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder change(Integer change) {
                this.change = change;
                return this;
            }

            /**
             * <p>The number of resources to be destroyed.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
             * <p>The diff information of the resource change.</p>
             * 
             * <strong>example:</strong>
             * <p>~ resource \&quot;alicloud_log_store\&quot; \&quot;default\&quot; {\n        id                    = \&quot;alb-log-project-v1-ph-xxxxx:alb-log-store-ph\&quot;\n      ~ max_split_shard_count = 64 -&gt; 32\n        name                  = \&quot;alb-log-store-ph\&quot;\n\n        # (13 unchanged attributes hidden)\n    }</p>
             */
            public Builder change(String change) {
                this.change = change;
                return this;
            }

            /**
             * <p>The types of resource change actions included in this resource change.</p>
             */
            public Builder resourceActions(java.util.List<String> resourceActions) {
                this.resourceActions = resourceActions;
                return this;
            }

            /**
             * <p>The unique identifier of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>alicloud_log_store.default</p>
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
             * <p>The change type of the component. Valid values:</p>
             * <ul>
             * <li>create: All resource changes in the component are creations.</li>
             * <li>delete: All resource changes in the component are deletions.</li>
             * <li>read: All resource changes in the component are reads.</li>
             * <li>update: Resource changes in the component include two or more types among creation, deletion, and read.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>update</p>
             */
            public Builder moduleAction(String moduleAction) {
                this.moduleAction = moduleAction;
                return this;
            }

            /**
             * <p>The number of resources to be created, updated, and destroyed in this deployment.</p>
             */
            public Builder moduleActionDetail(ModuleActionDetail moduleActionDetail) {
                this.moduleActionDetail = moduleActionDetail;
                return this;
            }

            /**
             * <p>The resource change information.</p>
             */
            public Builder resourceChanges(java.util.List<ResourceChanges> resourceChanges) {
                this.resourceChanges = resourceChanges;
                return this;
            }

            /**
             * <p>The component name of the stack.</p>
             * 
             * <strong>example:</strong>
             * <p>sls</p>
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

        @com.aliyun.core.annotation.NameInMap("logOutputPath")
        private String logOutputPath;

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
            this.logOutputPath = builder.logOutputPath;
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
         * @return logOutputPath
         */
        public String getLogOutputPath() {
            return this.logOutputPath;
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
            private String logOutputPath; 
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
                this.logOutputPath = model.logOutputPath;
                this.outputs = model.outputs;
                this.parameters = model.parameters;
                this.planOutputs = model.planOutputs;
                this.status = model.status;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The configuration item.</p>
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The configuration version, such as v1. The initial value is v1. The version number increments each time the stack is updated or refreshed and the configuration changes.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder configVersion(String configVersion) {
                this.configVersion = configVersion;
                return this;
            }

            /**
             * <p>The creation time in UTC, in the format of YYYY-MM-DDTHH:mm:ssZ (ISO 8601).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-01T12:10:18Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The deployment name.</p>
             * 
             * <strong>example:</strong>
             * <p>production</p>
             */
            public Builder deploymentName(String deploymentName) {
                this.deploymentName = deploymentName;
                return this;
            }

            /**
             * <p>The deployment number. The deployment number for each stack starts from 1 and increments each time a deployment is successfully triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder deploymentNo(String deploymentNo) {
                this.deploymentNo = deploymentNo;
                return this;
            }

            /**
             * <p>Deprecated field.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder deploymentVersion(String deploymentVersion) {
                this.deploymentVersion = deploymentVersion;
                return this;
            }

            /**
             * <p>The execution duration, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>38000</p>
             */
            public Builder elapsedTime(Long elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * <p>The execution type.</p>
             * <p>Manual: Manual execution (default).</p>
             * <p>Auto: Automatic execution.</p>
             * 
             * <strong>example:</strong>
             * <p>Manual</p>
             */
            public Builder executeType(String executeType) {
                this.executeType = executeType;
                return this;
            }

            /**
             * <p>The failure reason.</p>
             * 
             * <strong>example:</strong>
             * <p>\n Error: Invalid value for input variable\n \n   on main.tf line 17, in module \&quot;alb\&quot;:\n   17:   log_project           = var.log_project.project_name\n \n The given value is not suitable for module.alb.var.log_project declared at\n modules/alb/main.tf:34,1-23: string required.\n╵\n</p>
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>job-as154vldqt46mv0ixxxxx</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>OSS object key prefix for deployment logs</p>
             */
            public Builder logOutputPath(String logOutputPath) {
                this.logOutputPath = logOutputPath;
                return this;
            }

            /**
             * <p>The outputs.</p>
             */
            public Builder outputs(java.util.List<Outputs> outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * <p>The parameter set content.</p>
             */
            public Builder parameters(java.util.List<Parameters> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The state file output results.</p>
             */
            public Builder planOutputs(java.util.List<PlanOutputs> planOutputs) {
                this.planOutputs = planOutputs;
                return this;
            }

            /**
             * <p>The deployment status.</p>
             * <table>
             * <thead>
             * <tr>
             * <th>Name</th>
             * <th>Description</th>
             * </tr>
             * </thead>
             * <tbody><tr>
             * <td>Pending</td>
             * <td>The initial status after the deployment is created.</td>
             * </tr>
             * <tr>
             * <td>PriorityQueued</td>
             * <td>Priority queuing in progress.</td>
             * </tr>
             * <tr>
             * <td>PlanQueued</td>
             * <td>The deployment is queuing because no workflow is available after creation.</td>
             * </tr>
             * <tr>
             * <td>ApplyQueued</td>
             * <td>The deployment is queuing because no workflow is available during execution.</td>
             * </tr>
             * <tr>
             * <td>Planning</td>
             * <td>The resource deployment is in the Plan phase.</td>
             * </tr>
             * <tr>
             * <td>Planned</td>
             * <td>The resource deployment has completed the Plan phase.</td>
             * </tr>
             * <tr>
             * <td>ConfigProactiveInProgress</td>
             * <td>Compliance pre-check in progress.</td>
             * </tr>
             * <tr>
             * <td>ConfigProactiveSuccess</td>
             * <td>Compliance pre-check succeeded.</td>
             * </tr>
             * <tr>
             * <td>DetectInProgress</td>
             * <td>Drift detection in progress.</td>
             * </tr>
             * <tr>
             * <td>ImportQueued</td>
             * <td>The deployment is queuing because no workflow is available during Import execution.</td>
             * </tr>
             * <tr>
             * <td>Importing</td>
             * <td>The resource deployment is in the Import phase.</td>
             * </tr>
             * <tr>
             * <td>Imported</td>
             * <td>The resource deployment has completed the Import phase.</td>
             * </tr>
             * <tr>
             * <td>StateQueued</td>
             * <td>The deployment is queuing because no workflow is available during state command execution.</td>
             * </tr>
             * <tr>
             * <td>Stating</td>
             * <td>The resource deployment is executing the state command.</td>
             * </tr>
             * <tr>
             * <td>Stated</td>
             * <td>The resource deployment has completed the state command execution.</td>
             * </tr>
             * <tr>
             * <td>Confirmed</td>
             * <td>The resource deployment has been confirmed after the Plan phase.</td>
             * </tr>
             * <tr>
             * <td>PlannedAndFinished</td>
             * <td>No diff was found after the Plan phase. The deployment is in a final status.</td>
             * </tr>
             * <tr>
             * <td>Applying</td>
             * <td>The resource deployment is in the Apply phase.</td>
             * </tr>
             * <tr>
             * <td>Applied</td>
             * <td>The resource deployment has completed the Apply phase.</td>
             * </tr>
             * <tr>
             * <td>Discarded</td>
             * <td>The resource deployment has been discarded and is in a final status.</td>
             * </tr>
             * <tr>
             * <td>Errored</td>
             * <td>The deployment execution encountered an error and is in a final status.</td>
             * </tr>
             * <tr>
             * <td>ConfigProactiveFailure</td>
             * <td>Compliance pre-check failed.</td>
             * </tr>
             * <tr>
             * <td>Canceled</td>
             * <td>The deployment execution has been canceled and is in a final status.</td>
             * </tr>
             * </tbody></table>
             * 
             * <strong>example:</strong>
             * <p>Pending</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>task-as1d4vld8ogb2l32xxxxxx</p>
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
