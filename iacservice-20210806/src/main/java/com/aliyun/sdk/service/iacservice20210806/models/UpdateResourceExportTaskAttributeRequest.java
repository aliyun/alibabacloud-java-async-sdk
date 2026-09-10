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
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("exportToModule")
    private ExportToModule exportToModule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("includeRules")
    private java.util.List<IncludeRules> includeRules;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
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
        this.description = builder.description;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
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
        private String description; 
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
            this.description = request.description;
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
         * <p>The ID of the resource export task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ex-al1811jl980g5ffd115nhgt</p>
         */
        public Builder exportTaskId(String exportTaskId) {
            this.putPathParameter("exportTaskId", exportTaskId);
            this.exportTaskId = exportTaskId;
            return this;
        }

        /**
         * <p>The idempotency token. Format: [0-9a-zA-Z-]{1,64}. We recommend that you use a UUID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a65451293e64979ba7a4b573950217fe</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>this is description</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Saves the exported template as a module. If this parameter is not set, the template is automatically saved in the registry.</p>
         */
        public Builder exportToModule(ExportToModule exportToModule) {
            this.putBodyParameter("exportToModule", exportToModule);
            this.exportToModule = exportToModule;
            return this;
        }

        /**
         * <p>The list of include rules used when exporting resources.</p>
         */
        public Builder includeRules(java.util.List<IncludeRules> includeRules) {
            this.putBodyParameter("includeRules", includeRules);
            this.includeRules = includeRules;
            return this;
        }

        /**
         * <p>The name of the resource export task. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name must be 2 to 128 characters in length.</li>
         * <li>The name can contain letters, digits, Chinese characters, hyphens (-), underscores (_), and periods (.). The name cannot start or end with a hyphen, underscore, or period.</li>
         * <li>The name must be unique among resource export tasks within the current account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TaskName</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>ramName</p>
         */
        public Builder ramRole(String ramRole) {
            this.putBodyParameter("ramRole", ramRole);
            this.ramRole = ramRole;
            return this;
        }

        /**
         * <p>The Terraform provider version. Call <strong>ListTerraformProviderVersions</strong> to view the supported versions. Default value: the latest version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.183.0</p>
         */
        public Builder terraformProviderVersion(String terraformProviderVersion) {
            this.putBodyParameter("terraformProviderVersion", terraformProviderVersion);
            this.terraformProviderVersion = terraformProviderVersion;
            return this;
        }

        /**
         * <p>The Terraform version. Call <strong>ListAvailableTerraformVersions</strong> to view the supported versions. Default value: 1.5.7.</p>
         * 
         * <strong>example:</strong>
         * <p>1.5.7</p>
         */
        public Builder terraformVersion(String terraformVersion) {
            this.putBodyParameter("terraformVersion", terraformVersion);
            this.terraformVersion = terraformVersion;
            return this;
        }

        /**
         * <p>The trigger strategy. Valid values:</p>
         * <ul>
         * <li>Auto: triggered automatically when rules are modified or the trigger strategy is changed to Auto.</li>
         * <li>Manual: triggered manually.</li>
         * </ul>
         * <p>Default value: Manual.</p>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        public Builder triggerStrategy(String triggerStrategy) {
            this.putBodyParameter("triggerStrategy", triggerStrategy);
            this.triggerStrategy = triggerStrategy;
            return this;
        }

        /**
         * <p>The list of variables. Sets exported resource parameters as variables.</p>
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
             * <li>OSS: OSS</li>
             * <li>Registry: Terraform Registry.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Registry</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The path for saving the template content. Set this parameter when source is set to OSS. Format: oss::https://<bucket>.oss-<region>.aliyuncs.com/<path>.zip.</p>
             * 
             * <strong>example:</strong>
             * <p>oss::<a href="https://iac-daily.oss-ap-southeast-1.aliyuncs.com/iacservice/vpc.zip">https://iac-daily.oss-ap-southeast-1.aliyuncs.com/iacservice/vpc.zip</a></p>
             */
            public Builder sourcePath(String sourcePath) {
                this.sourcePath = sourcePath;
                return this;
            }

            /**
             * <p>The path for saving the template state file. Set this parameter when source is set to OSS. Format: oss::https://<bucket>.oss-<region>.aliyuncs.com/<path>/terraform.tfstate.</p>
             * 
             * <strong>example:</strong>
             * <p>oss::<a href="https://iac-daily.oss-ap-southeast-1.aliyuncs.com/default/terraform.tfstate">https://iac-daily.oss-ap-southeast-1.aliyuncs.com/default/terraform.tfstate</a></p>
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
             * <p>The name of the include rule for resource export. Valid values:</p>
             * <ul>
             * <li>ResourceType: required. The resource type. Call <strong>ListResourceTypes</strong> to view the supported resources. Example: ALIYUN::VPC::VPC.</li>
             * <li>RegionId: required. The region to which the resource belongs. Only one region is supported. Example: cn-chengdu.</li>
             * <li><ResourceType>:Id: the resource ID. Example: ALIYUN::VPC::VPC:Id.</li>
             * <li>ResourceGroupId: the resource group ID. Example: rg-1234.</li>
             * <li>ZoneId: the zone to which the resource belongs. Only one zone is supported. Example: ap-southeast-1-h.</li>
             * </ul>
             * <p>Multiple filter conditions have an AND relationship by default. A resource must meet all filter conditions to be considered a match.</p>
             * 
             * <strong>example:</strong>
             * <p>RegionId</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The values of an include rule for resource export.</p>
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
             * <p>The list of Terraform resource properties corresponding to the resource type.</p>
             */
            public Builder properties(java.util.List<String> properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>The resource type. Call <strong>ListResourceTypes</strong> to view the supported resources.</p>
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
}
