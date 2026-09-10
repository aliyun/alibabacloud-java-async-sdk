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
 * {@link GetResourceExportTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceExportTaskResponseBody</p>
 */
public class GetResourceExportTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("task")
    private Task task;

    private GetResourceExportTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.task = builder.task;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceExportTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return task
     */
    public Task getTask() {
        return this.task;
    }

    public static final class Builder {
        private String requestId; 
        private Task task; 

        private Builder() {
        } 

        private Builder(GetResourceExportTaskResponseBody model) {
            this.requestId = model.requestId;
            this.task = model.task;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FC49AA8C-0A19-5556-8929-E7447F18D529</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task information.</p>
         */
        public Builder task(Task task) {
            this.task = task;
            return this;
        }

        public GetResourceExportTaskResponseBody build() {
            return new GetResourceExportTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetResourceExportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceExportTaskResponseBody</p>
     */
    public static class ExportToModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("sourcePath")
        private String sourcePath;

        @com.aliyun.core.annotation.NameInMap("statePath")
        private String statePath;

        private ExportToModule(Builder builder) {
            this.source = builder.source;
            this.sourcePath = builder.sourcePath;
            this.statePath = builder.statePath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExportToModule create() {
            return builder().build();
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourcePath
         */
        public String getSourcePath() {
            return this.sourcePath;
        }

        /**
         * @return statePath
         */
        public String getStatePath() {
            return this.statePath;
        }

        public static final class Builder {
            private String source; 
            private String sourcePath; 
            private String statePath; 

            private Builder() {
            } 

            private Builder(ExportToModule model) {
                this.source = model.source;
                this.sourcePath = model.sourcePath;
                this.statePath = model.statePath;
            } 

            /**
             * <p>The module type in which the exported template is saved. Valid values:</p>
             * <ul>
             * <li>OSS: OSS.</li>
             * <li>Registry: Terraform Registry.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The path where the template content is saved.</p>
             * <ul>
             * <li><p>If Source is set to Registry, the format is: &quot;cloudregistry::iacservice//&quot;</p>
             * </li>
             * <li><p>If Source is set to OSS, the format is: &quot;oss::https://.oss-cn-hangzhou.aliyuncs.com/xxx.zip&quot;</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>oss::https://.oss-cn-hangzhou.aliyuncs.com/xxx.zip</p>
             */
            public Builder sourcePath(String sourcePath) {
                this.sourcePath = sourcePath;
                return this;
            }

            /**
             * <p>The path of the state file that corresponds to the module.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder statePath(String statePath) {
                this.statePath = statePath;
                return this;
            }

            public ExportToModule build() {
                return new ExportToModule(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourceExportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceExportTaskResponseBody</p>
     */
    public static class IncludeRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("values")
        private java.util.List<String> values;

        private IncludeRules(Builder builder) {
            this.key = builder.key;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IncludeRules create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(IncludeRules model) {
                this.key = model.key;
                this.values = model.values;
            } 

            /**
             * <p>The name of the include rule for resource export. Valid values:</p>
             * <ul>
             * <li>ResourceType: required. The resource type. Example: ALIYUN::VPC::VPC.</li>
             * <li>RegionId: required. The region to which the resource belongs. Only one region is supported. Example: cn-chengdu.</li>
             * <li>\<ResourceType>:Id: the resource ID. Example: ALIYUN::VPC::VPC:Id.</li>
             * <li>ResourceGroupId: the resource group ID. Example: rg-1234.</li>
             * <li>ZoneId: the zone to which the resource belongs. Only one zone is supported. Example: cn-hangzhou-h.</li>
             * </ul>
             * <p>By default, the relationship between multiple filter conditions is AND, which means a resource must match all filter conditions to be considered a match.</p>
             * 
             * <strong>example:</strong>
             * <p>RegionId</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The values of the include rules for resource export.</p>
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public IncludeRules build() {
                return new IncludeRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourceExportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceExportTaskResponseBody</p>
     */
    public static class Modules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("sourcePath")
        private String sourcePath;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Modules(Builder builder) {
            this.source = builder.source;
            this.sourcePath = builder.sourcePath;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Modules create() {
            return builder().build();
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourcePath
         */
        public String getSourcePath() {
            return this.sourcePath;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String source; 
            private String sourcePath; 
            private String version; 

            private Builder() {
            } 

            private Builder(Modules model) {
                this.source = model.source;
                this.sourcePath = model.sourcePath;
                this.version = model.version;
            } 

            /**
             * <p>The module type where the exported template is located. Two formats are supported: CloudRegistry and OSS. If you specify the ExportToModule parameter, both formats are returned. Otherwise, only CloudRegistry is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The download address of the exported template in the module.</p>
             * <ul>
             * <li><p>If Source is set to CloudRegistry, the format is: &quot;cloudregistry::iacservice//&quot;</p>
             * </li>
             * <li><p>If Source is set to OSS, the format is: &quot;oss::https://.oss-cn-hangzhou.aliyuncs.com/xxx.zip&quot;</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>oss::https://.oss-cn-hangzhou.aliyuncs.com/xxx.zip</p>
             */
            public Builder sourcePath(String sourcePath) {
                this.sourcePath = sourcePath;
                return this;
            }

            /**
             * <p>The version of the module where the exported template is located.</p>
             * 
             * <strong>example:</strong>
             * <p>v3</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Modules build() {
                return new Modules(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourceExportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceExportTaskResponseBody</p>
     */
    public static class Variables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("properties")
        private java.util.List<String> properties;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        private Variables(Builder builder) {
            this.properties = builder.properties;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Variables create() {
            return builder().build();
        }

        /**
         * @return properties
         */
        public java.util.List<String> getProperties() {
            return this.properties;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private java.util.List<String> properties; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(Variables model) {
                this.properties = model.properties;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The list of properties of the Terraform resource that corresponds to the resource type.</p>
             */
            public Builder properties(java.util.List<String> properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN::VPC::VSwitch</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public Variables build() {
                return new Variables(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourceExportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceExportTaskResponseBody</p>
     */
    public static class Task extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("elapsedTime")
        private Long elapsedTime;

        @com.aliyun.core.annotation.NameInMap("exportTaskId")
        private String exportTaskId;

        @com.aliyun.core.annotation.NameInMap("exportToModule")
        private ExportToModule exportToModule;

        @com.aliyun.core.annotation.NameInMap("exportVersion")
        private String exportVersion;

        @com.aliyun.core.annotation.NameInMap("failedReason")
        private String failedReason;

        @com.aliyun.core.annotation.NameInMap("includeRules")
        private java.util.List<IncludeRules> includeRules;

        @com.aliyun.core.annotation.NameInMap("modifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("modules")
        private java.util.List<Modules> modules;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ramRole")
        private String ramRole;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("taskOutputPath")
        private String taskOutputPath;

        @com.aliyun.core.annotation.NameInMap("terraformContext")
        private java.util.Map<String, ?> terraformContext;

        @com.aliyun.core.annotation.NameInMap("terraformProviderVersion")
        private String terraformProviderVersion;

        @com.aliyun.core.annotation.NameInMap("terraformVersion")
        private String terraformVersion;

        @com.aliyun.core.annotation.NameInMap("triggerStrategy")
        private String triggerStrategy;

        @com.aliyun.core.annotation.NameInMap("variables")
        private java.util.List<Variables> variables;

        private Task(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.elapsedTime = builder.elapsedTime;
            this.exportTaskId = builder.exportTaskId;
            this.exportToModule = builder.exportToModule;
            this.exportVersion = builder.exportVersion;
            this.failedReason = builder.failedReason;
            this.includeRules = builder.includeRules;
            this.modifyTime = builder.modifyTime;
            this.modules = builder.modules;
            this.name = builder.name;
            this.ramRole = builder.ramRole;
            this.status = builder.status;
            this.taskOutputPath = builder.taskOutputPath;
            this.terraformContext = builder.terraformContext;
            this.terraformProviderVersion = builder.terraformProviderVersion;
            this.terraformVersion = builder.terraformVersion;
            this.triggerStrategy = builder.triggerStrategy;
            this.variables = builder.variables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Task create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return elapsedTime
         */
        public Long getElapsedTime() {
            return this.elapsedTime;
        }

        /**
         * @return exportTaskId
         */
        public String getExportTaskId() {
            return this.exportTaskId;
        }

        /**
         * @return exportToModule
         */
        public ExportToModule getExportToModule() {
            return this.exportToModule;
        }

        /**
         * @return exportVersion
         */
        public String getExportVersion() {
            return this.exportVersion;
        }

        /**
         * @return failedReason
         */
        public String getFailedReason() {
            return this.failedReason;
        }

        /**
         * @return includeRules
         */
        public java.util.List<IncludeRules> getIncludeRules() {
            return this.includeRules;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return modules
         */
        public java.util.List<Modules> getModules() {
            return this.modules;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ramRole
         */
        public String getRamRole() {
            return this.ramRole;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskOutputPath
         */
        public String getTaskOutputPath() {
            return this.taskOutputPath;
        }

        /**
         * @return terraformContext
         */
        public java.util.Map<String, ?> getTerraformContext() {
            return this.terraformContext;
        }

        /**
         * @return terraformProviderVersion
         */
        public String getTerraformProviderVersion() {
            return this.terraformProviderVersion;
        }

        /**
         * @return terraformVersion
         */
        public String getTerraformVersion() {
            return this.terraformVersion;
        }

        /**
         * @return triggerStrategy
         */
        public String getTriggerStrategy() {
            return this.triggerStrategy;
        }

        /**
         * @return variables
         */
        public java.util.List<Variables> getVariables() {
            return this.variables;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private Long elapsedTime; 
            private String exportTaskId; 
            private ExportToModule exportToModule; 
            private String exportVersion; 
            private String failedReason; 
            private java.util.List<IncludeRules> includeRules; 
            private String modifyTime; 
            private java.util.List<Modules> modules; 
            private String name; 
            private String ramRole; 
            private String status; 
            private String taskOutputPath; 
            private java.util.Map<String, ?> terraformContext; 
            private String terraformProviderVersion; 
            private String terraformVersion; 
            private String triggerStrategy; 
            private java.util.List<Variables> variables; 

            private Builder() {
            } 

            private Builder(Task model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.elapsedTime = model.elapsedTime;
                this.exportTaskId = model.exportTaskId;
                this.exportToModule = model.exportToModule;
                this.exportVersion = model.exportVersion;
                this.failedReason = model.failedReason;
                this.includeRules = model.includeRules;
                this.modifyTime = model.modifyTime;
                this.modules = model.modules;
                this.name = model.name;
                this.ramRole = model.ramRole;
                this.status = model.status;
                this.taskOutputPath = model.taskOutputPath;
                this.terraformContext = model.terraformContext;
                this.terraformProviderVersion = model.terraformProviderVersion;
                this.terraformVersion = model.terraformVersion;
                this.triggerStrategy = model.triggerStrategy;
                this.variables = model.variables;
            } 

            /**
             * <p>The time when the task was created, in UTC in ISO 8601 format (YYYY-MM-DDTHH:mm:ssZ).</p>
             * 
             * <strong>example:</strong>
             * <p>2022-06-15T02:44:37Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The task description.</p>
             * 
             * <strong>example:</strong>
             * <p>this is description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The execution duration.</p>
             * 
             * <strong>example:</strong>
             * <p>4533</p>
             */
            public Builder elapsedTime(Long elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * <p>The ID of the resource export task.</p>
             * 
             * <strong>example:</strong>
             * <p>ex-al1111jlfh53i6mo4o94jj</p>
             */
            public Builder exportTaskId(String exportTaskId) {
                this.exportTaskId = exportTaskId;
                return this;
            }

            /**
             * <p>Saves the exported template as a module. If this parameter is not set, the template is automatically saved in the Registry.</p>
             */
            public Builder exportToModule(ExportToModule exportToModule) {
                this.exportToModule = exportToModule;
                return this;
            }

            /**
             * <p>The resource export version.</p>
             * 
             * <strong>example:</strong>
             * <p>v2</p>
             */
            public Builder exportVersion(String exportVersion) {
                this.exportVersion = exportVersion;
                return this;
            }

            /**
             * <p>The failure reason.</p>
             * 
             * <strong>example:</strong>
             * <p>Reason</p>
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * <p>The values of the include rules for resource export.</p>
             */
            public Builder includeRules(java.util.List<IncludeRules> includeRules) {
                this.includeRules = includeRules;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>2023-06-07T09:19:11Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The module configurations after resource export.</p>
             */
            public Builder modules(java.util.List<Modules> modules) {
                this.modules = modules;
                return this;
            }

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc_all</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>role</p>
             */
            public Builder ramRole(String ramRole) {
                this.ramRole = ramRole;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li>Available: the task is available and no job is running.</li>
             * <li>Running: a job is currently running.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task output path.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder taskOutputPath(String taskOutputPath) {
                this.taskOutputPath = taskOutputPath;
                return this;
            }

            /**
             * <p>The Terraform context.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder terraformContext(java.util.Map<String, ?> terraformContext) {
                this.terraformContext = terraformContext;
                return this;
            }

            /**
             * <p>The Terraform provider version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.246.0</p>
             */
            public Builder terraformProviderVersion(String terraformProviderVersion) {
                this.terraformProviderVersion = terraformProviderVersion;
                return this;
            }

            /**
             * <p>The Terraform version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.5.7</p>
             */
            public Builder terraformVersion(String terraformVersion) {
                this.terraformVersion = terraformVersion;
                return this;
            }

            /**
             * <p>The trigger strategy. Valid values:</p>
             * <ul>
             * <li>Auto: triggered when rules are modified or the trigger strategy is changed to Auto.</li>
             * <li>Manual: manually triggered.</li>
             * </ul>
             * <p>Default value: Manual.</p>
             * 
             * <strong>example:</strong>
             * <p>Manual</p>
             */
            public Builder triggerStrategy(String triggerStrategy) {
                this.triggerStrategy = triggerStrategy;
                return this;
            }

            /**
             * <p>The list of variables. The parameters of the exported resources are set as variables.</p>
             */
            public Builder variables(java.util.List<Variables> variables) {
                this.variables = variables;
                return this;
            }

            public Task build() {
                return new Task(this);
            } 

        } 

    }
}
