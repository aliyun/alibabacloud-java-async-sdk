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
 * {@link UpdateResourceExportTaskAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateResourceExportTaskAttributeRequest</p>
 */
public class UpdateResourceExportTaskAttributeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("exportTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String exportTaskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configPath")
    private String configPath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("excludeRules")
    private java.util.List<ExcludeRules> excludeRules;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("exportToModule")
    private ExportToModule exportToModule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("includeRules")
    private java.util.List<IncludeRules> includeRules;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ramRole")
    private String ramRole;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("terraformProviderVersion")
    private String terraformProviderVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("terraformVersion")
    private String terraformVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("triggerStrategy")
    private String triggerStrategy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("variables")
    private java.util.List<Variables> variables;

    private UpdateResourceExportTaskAttributeRequest(Builder builder) {
        super(builder);
        this.exportTaskId = builder.exportTaskId;
        this.clientToken = builder.clientToken;
        this.configPath = builder.configPath;
        this.description = builder.description;
        this.excludeRules = builder.excludeRules;
        this.exportToModule = builder.exportToModule;
        this.includeRules = builder.includeRules;
        this.name = builder.name;
        this.ramRole = builder.ramRole;
        this.terraformProviderVersion = builder.terraformProviderVersion;
        this.terraformVersion = builder.terraformVersion;
        this.triggerStrategy = builder.triggerStrategy;
        this.variables = builder.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResourceExportTaskAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exportTaskId
     */
    public String getExportTaskId() {
        return this.exportTaskId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return configPath
     */
    public String getConfigPath() {
        return this.configPath;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return excludeRules
     */
    public java.util.List<ExcludeRules> getExcludeRules() {
        return this.excludeRules;
    }

    /**
     * @return exportToModule
     */
    public ExportToModule getExportToModule() {
        return this.exportToModule;
    }

    /**
     * @return includeRules
     */
    public java.util.List<IncludeRules> getIncludeRules() {
        return this.includeRules;
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

    public static final class Builder extends Request.Builder<UpdateResourceExportTaskAttributeRequest, Builder> {
        private String exportTaskId; 
        private String clientToken; 
        private String configPath; 
        private String description; 
        private java.util.List<ExcludeRules> excludeRules; 
        private ExportToModule exportToModule; 
        private java.util.List<IncludeRules> includeRules; 
        private String name; 
        private String ramRole; 
        private String terraformProviderVersion; 
        private String terraformVersion; 
        private String triggerStrategy; 
        private java.util.List<Variables> variables; 

        private Builder() {
            super();
        } 

        private Builder(UpdateResourceExportTaskAttributeRequest request) {
            super(request);
            this.exportTaskId = request.exportTaskId;
            this.clientToken = request.clientToken;
            this.configPath = request.configPath;
            this.description = request.description;
            this.excludeRules = request.excludeRules;
            this.exportToModule = request.exportToModule;
            this.includeRules = request.includeRules;
            this.name = request.name;
            this.ramRole = request.ramRole;
            this.terraformProviderVersion = request.terraformProviderVersion;
            this.terraformVersion = request.terraformVersion;
            this.triggerStrategy = request.triggerStrategy;
            this.variables = request.variables;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder exportTaskId(String exportTaskId) {
            this.putPathParameter("exportTaskId", exportTaskId);
            this.exportTaskId = exportTaskId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * configPath.
         */
        public Builder configPath(String configPath) {
            this.putBodyParameter("configPath", configPath);
            this.configPath = configPath;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * excludeRules.
         */
        public Builder excludeRules(java.util.List<ExcludeRules> excludeRules) {
            this.putBodyParameter("excludeRules", excludeRules);
            this.excludeRules = excludeRules;
            return this;
        }

        /**
         * exportToModule.
         */
        public Builder exportToModule(ExportToModule exportToModule) {
            this.putBodyParameter("exportToModule", exportToModule);
            this.exportToModule = exportToModule;
            return this;
        }

        /**
         * includeRules.
         */
        public Builder includeRules(java.util.List<IncludeRules> includeRules) {
            this.putBodyParameter("includeRules", includeRules);
            this.includeRules = includeRules;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * ramRole.
         */
        public Builder ramRole(String ramRole) {
            this.putBodyParameter("ramRole", ramRole);
            this.ramRole = ramRole;
            return this;
        }

        /**
         * terraformProviderVersion.
         */
        public Builder terraformProviderVersion(String terraformProviderVersion) {
            this.putBodyParameter("terraformProviderVersion", terraformProviderVersion);
            this.terraformProviderVersion = terraformProviderVersion;
            return this;
        }

        /**
         * terraformVersion.
         */
        public Builder terraformVersion(String terraformVersion) {
            this.putBodyParameter("terraformVersion", terraformVersion);
            this.terraformVersion = terraformVersion;
            return this;
        }

        /**
         * triggerStrategy.
         */
        public Builder triggerStrategy(String triggerStrategy) {
            this.putBodyParameter("triggerStrategy", triggerStrategy);
            this.triggerStrategy = triggerStrategy;
            return this;
        }

        /**
         * variables.
         */
        public Builder variables(java.util.List<Variables> variables) {
            this.putBodyParameter("variables", variables);
            this.variables = variables;
            return this;
        }

        @Override
        public UpdateResourceExportTaskAttributeRequest build() {
            return new UpdateResourceExportTaskAttributeRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateResourceExportTaskAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateResourceExportTaskAttributeRequest</p>
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
     * {@link UpdateResourceExportTaskAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateResourceExportTaskAttributeRequest</p>
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
     * {@link UpdateResourceExportTaskAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateResourceExportTaskAttributeRequest</p>
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
     * {@link UpdateResourceExportTaskAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateResourceExportTaskAttributeRequest</p>
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
}
