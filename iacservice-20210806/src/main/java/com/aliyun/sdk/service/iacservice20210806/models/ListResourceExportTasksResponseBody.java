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
 * {@link ListResourceExportTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceExportTasksResponseBody</p>
 */
public class ListResourceExportTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("exportTasks")
    private java.util.List<ExportTasks> exportTasks;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListResourceExportTasksResponseBody(Builder builder) {
        this.exportTasks = builder.exportTasks;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceExportTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exportTasks
     */
    public java.util.List<ExportTasks> getExportTasks() {
        return this.exportTasks;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
        private java.util.List<ExportTasks> exportTasks; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListResourceExportTasksResponseBody model) {
            this.exportTasks = model.exportTasks;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * exportTasks.
         */
        public Builder exportTasks(java.util.List<ExportTasks> exportTasks) {
            this.exportTasks = exportTasks;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * requestId.
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

        public ListResourceExportTasksResponseBody build() {
            return new ListResourceExportTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListResourceExportTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceExportTasksResponseBody</p>
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
     * {@link ListResourceExportTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceExportTasksResponseBody</p>
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
     * {@link ListResourceExportTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceExportTasksResponseBody</p>
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
     * {@link ListResourceExportTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceExportTasksResponseBody</p>
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
     * {@link ListResourceExportTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceExportTasksResponseBody</p>
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
     * {@link ListResourceExportTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceExportTasksResponseBody</p>
     */
    public static class ExportTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("elapsedTime")
        private Long elapsedTime;

        @com.aliyun.core.annotation.NameInMap("excludeRules")
        private java.util.List<ExcludeRules> excludeRules;

        @com.aliyun.core.annotation.NameInMap("exportStatus")
        private String exportStatus;

        @com.aliyun.core.annotation.NameInMap("exportTaskId")
        private String exportTaskId;

        @com.aliyun.core.annotation.NameInMap("exportToModule")
        private ExportToModule exportToModule;

        @com.aliyun.core.annotation.NameInMap("exportVersion")
        private String exportVersion;

        @com.aliyun.core.annotation.NameInMap("hasDestroy")
        private Boolean hasDestroy;

        @com.aliyun.core.annotation.NameInMap("includeRules")
        private java.util.List<IncludeRules> includeRules;

        @com.aliyun.core.annotation.NameInMap("modules")
        private java.util.List<Modules> modules;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("variables")
        private java.util.List<Variables> variables;

        private ExportTasks(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.elapsedTime = builder.elapsedTime;
            this.excludeRules = builder.excludeRules;
            this.exportStatus = builder.exportStatus;
            this.exportTaskId = builder.exportTaskId;
            this.exportToModule = builder.exportToModule;
            this.exportVersion = builder.exportVersion;
            this.hasDestroy = builder.hasDestroy;
            this.includeRules = builder.includeRules;
            this.modules = builder.modules;
            this.name = builder.name;
            this.status = builder.status;
            this.variables = builder.variables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExportTasks create() {
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
         * @return excludeRules
         */
        public java.util.List<ExcludeRules> getExcludeRules() {
            return this.excludeRules;
        }

        /**
         * @return exportStatus
         */
        public String getExportStatus() {
            return this.exportStatus;
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
         * @return hasDestroy
         */
        public Boolean getHasDestroy() {
            return this.hasDestroy;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
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
            private java.util.List<ExcludeRules> excludeRules; 
            private String exportStatus; 
            private String exportTaskId; 
            private ExportToModule exportToModule; 
            private String exportVersion; 
            private Boolean hasDestroy; 
            private java.util.List<IncludeRules> includeRules; 
            private java.util.List<Modules> modules; 
            private String name; 
            private String status; 
            private java.util.List<Variables> variables; 

            private Builder() {
            } 

            private Builder(ExportTasks model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.elapsedTime = model.elapsedTime;
                this.excludeRules = model.excludeRules;
                this.exportStatus = model.exportStatus;
                this.exportTaskId = model.exportTaskId;
                this.exportToModule = model.exportToModule;
                this.exportVersion = model.exportVersion;
                this.hasDestroy = model.hasDestroy;
                this.includeRules = model.includeRules;
                this.modules = model.modules;
                this.name = model.name;
                this.status = model.status;
                this.variables = model.variables;
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
             * exportStatus.
             */
            public Builder exportStatus(String exportStatus) {
                this.exportStatus = exportStatus;
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
             * hasDestroy.
             */
            public Builder hasDestroy(Boolean hasDestroy) {
                this.hasDestroy = hasDestroy;
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
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * variables.
             */
            public Builder variables(java.util.List<Variables> variables) {
                this.variables = variables;
                return this;
            }

            public ExportTasks build() {
                return new ExportTasks(this);
            } 

        } 

    }
}
