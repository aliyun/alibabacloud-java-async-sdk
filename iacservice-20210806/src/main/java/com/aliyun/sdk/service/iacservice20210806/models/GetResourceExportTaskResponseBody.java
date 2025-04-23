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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * task.
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
    public static class ExcludeRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("values")
        private java.util.List<String> values;

        private ExcludeRules(Builder builder) {
            this.key = builder.key;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExcludeRules create() {
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

            private Builder(ExcludeRules model) {
                this.key = model.key;
                this.values = model.values;
            } 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * values.
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public ExcludeRules build() {
                return new ExcludeRules(this);
            } 

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
             * source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * sourcePath.
             */
            public Builder sourcePath(String sourcePath) {
                this.sourcePath = sourcePath;
                return this;
            }

            /**
             * statePath.
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
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * values.
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
             * source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * sourcePath.
             */
            public Builder sourcePath(String sourcePath) {
                this.sourcePath = sourcePath;
                return this;
            }

            /**
             * version.
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
             * properties.
             */
            public Builder properties(java.util.List<String> properties) {
                this.properties = properties;
                return this;
            }

            /**
             * resourceType.
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
        @com.aliyun.core.annotation.NameInMap("configPath")
        private String configPath;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("elapsedTime")
        private Long elapsedTime;

        @com.aliyun.core.annotation.NameInMap("excludeRules")
        private java.util.List<ExcludeRules> excludeRules;

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
            this.configPath = builder.configPath;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.elapsedTime = builder.elapsedTime;
            this.excludeRules = builder.excludeRules;
            this.exportTaskId = builder.exportTaskId;
            this.exportToModule = builder.exportToModule;
            this.exportVersion = builder.exportVersion;
            this.failedReason = builder.failedReason;
            this.includeRules = builder.includeRules;
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
         * @return configPath
         */
        public String getConfigPath() {
            return this.configPath;
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
         * @return excludeRules
         */
        public java.util.List<ExcludeRules> getExcludeRules() {
            return this.excludeRules;
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
            private String configPath; 
            private String createTime; 
            private String description; 
            private Long elapsedTime; 
            private java.util.List<ExcludeRules> excludeRules; 
            private String exportTaskId; 
            private ExportToModule exportToModule; 
            private String exportVersion; 
            private String failedReason; 
            private java.util.List<IncludeRules> includeRules; 
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
                this.configPath = model.configPath;
                this.createTime = model.createTime;
                this.description = model.description;
                this.elapsedTime = model.elapsedTime;
                this.excludeRules = model.excludeRules;
                this.exportTaskId = model.exportTaskId;
                this.exportToModule = model.exportToModule;
                this.exportVersion = model.exportVersion;
                this.failedReason = model.failedReason;
                this.includeRules = model.includeRules;
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
             * configPath.
             */
            public Builder configPath(String configPath) {
                this.configPath = configPath;
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
             * description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * excludeRules.
             */
            public Builder excludeRules(java.util.List<ExcludeRules> excludeRules) {
                this.excludeRules = excludeRules;
                return this;
            }

            /**
             * exportTaskId.
             */
            public Builder exportTaskId(String exportTaskId) {
                this.exportTaskId = exportTaskId;
                return this;
            }

            /**
             * exportToModule.
             */
            public Builder exportToModule(ExportToModule exportToModule) {
                this.exportToModule = exportToModule;
                return this;
            }

            /**
             * exportVersion.
             */
            public Builder exportVersion(String exportVersion) {
                this.exportVersion = exportVersion;
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
             * includeRules.
             */
            public Builder includeRules(java.util.List<IncludeRules> includeRules) {
                this.includeRules = includeRules;
                return this;
            }

            /**
             * modules.
             */
            public Builder modules(java.util.List<Modules> modules) {
                this.modules = modules;
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
             * ramRole.
             */
            public Builder ramRole(String ramRole) {
                this.ramRole = ramRole;
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
             * taskOutputPath.
             */
            public Builder taskOutputPath(String taskOutputPath) {
                this.taskOutputPath = taskOutputPath;
                return this;
            }

            /**
             * terraformContext.
             */
            public Builder terraformContext(java.util.Map<String, ?> terraformContext) {
                this.terraformContext = terraformContext;
                return this;
            }

            /**
             * terraformProviderVersion.
             */
            public Builder terraformProviderVersion(String terraformProviderVersion) {
                this.terraformProviderVersion = terraformProviderVersion;
                return this;
            }

            /**
             * terraformVersion.
             */
            public Builder terraformVersion(String terraformVersion) {
                this.terraformVersion = terraformVersion;
                return this;
            }

            /**
             * triggerStrategy.
             */
            public Builder triggerStrategy(String triggerStrategy) {
                this.triggerStrategy = triggerStrategy;
                return this;
            }

            /**
             * variables.
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
