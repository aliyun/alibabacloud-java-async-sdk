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
 * {@link ListResourceExportTaskVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceExportTaskVersionsResponseBody</p>
 */
public class ListResourceExportTaskVersionsResponseBody extends TeaModel {
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

    private ListResourceExportTaskVersionsResponseBody(Builder builder) {
        this.exportTasks = builder.exportTasks;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceExportTaskVersionsResponseBody create() {
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

        private Builder(ListResourceExportTaskVersionsResponseBody model) {
            this.exportTasks = model.exportTasks;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of export task versions.</p>
         */
        public Builder exportTasks(java.util.List<ExportTasks> exportTasks) {
            this.exportTasks = exportTasks;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of results per page. Default value: 20. Minimum value: 1. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>860FDEEE-1CA3-55F3-97F6-63FC40B7962D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>72</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListResourceExportTaskVersionsResponseBody build() {
            return new ListResourceExportTaskVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListResourceExportTaskVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceExportTaskVersionsResponseBody</p>
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
             * <p>The module type to which the exported template is saved. Valid values:</p>
             * <ul>
             * <li>OSS: OSS</li>
             * <li>Registry: Terraform Registry</li>
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
             * <p>The path of the State file that corresponds to the module.</p>
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
     * {@link ListResourceExportTaskVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceExportTaskVersionsResponseBody</p>
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
             * <p>By default, multiple filter conditions are evaluated with an AND operator. A resource must match all filter conditions to be considered a match.</p>
             * 
             * <strong>example:</strong>
             * <p>RegionId</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The values of the include rule for resource export.</p>
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
     * {@link ListResourceExportTaskVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceExportTaskVersionsResponseBody</p>
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
             * <p>The module type where the exported template is located. Two formats are supported: CloudRegistry and OSS. If the ExportToModule parameter is specified, both formats are returned. Otherwise, only CloudRegistry is returned.</p>
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
             * <p>v1</p>
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
     * {@link ListResourceExportTaskVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceExportTaskVersionsResponseBody</p>
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
             * <p>The list of Terraform resource properties that correspond to the resource type.</p>
             */
            public Builder properties(java.util.List<String> properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>Vswitch</p>
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
     * {@link ListResourceExportTaskVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceExportTaskVersionsResponseBody</p>
     */
    public static class ExportTasks extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("managedTaskId")
        private String managedTaskId;

        @com.aliyun.core.annotation.NameInMap("modules")
        private java.util.List<Modules> modules;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("terraformProviderVersion")
        private String terraformProviderVersion;

        @com.aliyun.core.annotation.NameInMap("variables")
        private java.util.List<Variables> variables;

        private ExportTasks(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.elapsedTime = builder.elapsedTime;
            this.exportTaskId = builder.exportTaskId;
            this.exportToModule = builder.exportToModule;
            this.exportVersion = builder.exportVersion;
            this.failedReason = builder.failedReason;
            this.includeRules = builder.includeRules;
            this.managedTaskId = builder.managedTaskId;
            this.modules = builder.modules;
            this.name = builder.name;
            this.status = builder.status;
            this.terraformProviderVersion = builder.terraformProviderVersion;
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
         * @return managedTaskId
         */
        public String getManagedTaskId() {
            return this.managedTaskId;
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
         * @return terraformProviderVersion
         */
        public String getTerraformProviderVersion() {
            return this.terraformProviderVersion;
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
            private String managedTaskId; 
            private java.util.List<Modules> modules; 
            private String name; 
            private String status; 
            private String terraformProviderVersion; 
            private java.util.List<Variables> variables; 

            private Builder() {
            } 

            private Builder(ExportTasks model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.elapsedTime = model.elapsedTime;
                this.exportTaskId = model.exportTaskId;
                this.exportToModule = model.exportToModule;
                this.exportVersion = model.exportVersion;
                this.failedReason = model.failedReason;
                this.includeRules = model.includeRules;
                this.managedTaskId = model.managedTaskId;
                this.modules = model.modules;
                this.name = model.name;
                this.status = model.status;
                this.terraformProviderVersion = model.terraformProviderVersion;
                this.variables = model.variables;
            } 

            /**
             * <p>The creation time in UTC. The time follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-05-11T02:18:50Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description.</p>
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
             * <p>4521</p>
             */
            public Builder elapsedTime(Long elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * <p>The ID of the resource export task.</p>
             * 
             * <strong>example:</strong>
             * <p>ex-al1711jl6hd8u5crggeq6v</p>
             */
            public Builder exportTaskId(String exportTaskId) {
                this.exportTaskId = exportTaskId;
                return this;
            }

            /**
             * <p>The module to which the exported template is saved. If this parameter is not specified, the template is automatically saved in the Registry.</p>
             */
            public Builder exportToModule(ExportToModule exportToModule) {
                this.exportToModule = exportToModule;
                return this;
            }

            /**
             * <p>The resource export version.</p>
             * 
             * <strong>example:</strong>
             * <p>v3</p>
             */
            public Builder exportVersion(String exportVersion) {
                this.exportVersion = exportVersion;
                return this;
            }

            /**
             * <p>The reason for the export failure.</p>
             * 
             * <strong>example:</strong>
             * <p>Reason</p>
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * <p>The list of include rules used when exporting resources.</p>
             */
            public Builder includeRules(java.util.List<IncludeRules> includeRules) {
                this.includeRules = includeRules;
                return this;
            }

            /**
             * managedTaskId.
             */
            public Builder managedTaskId(String managedTaskId) {
                this.managedTaskId = managedTaskId;
                return this;
            }

            /**
             * <p>The module configurations of the exported resources.</p>
             */
            public Builder modules(java.util.List<Modules> modules) {
                this.modules = modules;
                return this;
            }

            /**
             * <p>The name of the export task.</p>
             * 
             * <strong>example:</strong>
             * <p>TaskName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The version export status. Valid values:</p>
             * <ul>
             * <li>Queue: queued</li>
             * <li>Pending: preparing to run</li>
             * <li>Success: succeeded</li>
             * <li>Errored: failed</li>
             * <li>Canceled: canceled</li>
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
             * <p>The Terraform Provider version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.206.0</p>
             */
            public Builder terraformProviderVersion(String terraformProviderVersion) {
                this.terraformProviderVersion = terraformProviderVersion;
                return this;
            }

            /**
             * <p>The list of variables. Parameters of exported resources are set as variables.</p>
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
