// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateGroupRequest</p>
 */
public class CreateGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoDestroy")
    private Boolean autoDestroy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoTrigger")
    private Boolean autoTrigger;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("forcedSetting")
    private Boolean forcedSetting;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("notifyConfig")
    private java.util.List < NotifyConfig> notifyConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("notifyOperationTypes")
    private java.util.List < String > notifyOperationTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("projectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ramRole")
    private String ramRole;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("reportExportField")
    private java.util.List < String > reportExportField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("reportExportPath")
    private String reportExportPath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("terraformProviderVersion")
    private String terraformProviderVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("triggerConfig")
    private java.util.List < TriggerConfig> triggerConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("triggerResourceType")
    private java.util.List < String > triggerResourceType;

    private CreateGroupRequest(Builder builder) {
        super(builder);
        this.autoDestroy = builder.autoDestroy;
        this.autoTrigger = builder.autoTrigger;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.forcedSetting = builder.forcedSetting;
        this.name = builder.name;
        this.notifyConfig = builder.notifyConfig;
        this.notifyOperationTypes = builder.notifyOperationTypes;
        this.projectId = builder.projectId;
        this.ramRole = builder.ramRole;
        this.reportExportField = builder.reportExportField;
        this.reportExportPath = builder.reportExportPath;
        this.terraformProviderVersion = builder.terraformProviderVersion;
        this.triggerConfig = builder.triggerConfig;
        this.triggerResourceType = builder.triggerResourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoDestroy
     */
    public Boolean getAutoDestroy() {
        return this.autoDestroy;
    }

    /**
     * @return autoTrigger
     */
    public Boolean getAutoTrigger() {
        return this.autoTrigger;
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
     * @return forcedSetting
     */
    public Boolean getForcedSetting() {
        return this.forcedSetting;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return notifyConfig
     */
    public java.util.List < NotifyConfig> getNotifyConfig() {
        return this.notifyConfig;
    }

    /**
     * @return notifyOperationTypes
     */
    public java.util.List < String > getNotifyOperationTypes() {
        return this.notifyOperationTypes;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return ramRole
     */
    public String getRamRole() {
        return this.ramRole;
    }

    /**
     * @return reportExportField
     */
    public java.util.List < String > getReportExportField() {
        return this.reportExportField;
    }

    /**
     * @return reportExportPath
     */
    public String getReportExportPath() {
        return this.reportExportPath;
    }

    /**
     * @return terraformProviderVersion
     */
    public String getTerraformProviderVersion() {
        return this.terraformProviderVersion;
    }

    /**
     * @return triggerConfig
     */
    public java.util.List < TriggerConfig> getTriggerConfig() {
        return this.triggerConfig;
    }

    /**
     * @return triggerResourceType
     */
    public java.util.List < String > getTriggerResourceType() {
        return this.triggerResourceType;
    }

    public static final class Builder extends Request.Builder<CreateGroupRequest, Builder> {
        private Boolean autoDestroy; 
        private Boolean autoTrigger; 
        private String clientToken; 
        private String description; 
        private Boolean forcedSetting; 
        private String name; 
        private java.util.List < NotifyConfig> notifyConfig; 
        private java.util.List < String > notifyOperationTypes; 
        private String projectId; 
        private String ramRole; 
        private java.util.List < String > reportExportField; 
        private String reportExportPath; 
        private String terraformProviderVersion; 
        private java.util.List < TriggerConfig> triggerConfig; 
        private java.util.List < String > triggerResourceType; 

        private Builder() {
            super();
        } 

        private Builder(CreateGroupRequest request) {
            super(request);
            this.autoDestroy = request.autoDestroy;
            this.autoTrigger = request.autoTrigger;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.forcedSetting = request.forcedSetting;
            this.name = request.name;
            this.notifyConfig = request.notifyConfig;
            this.notifyOperationTypes = request.notifyOperationTypes;
            this.projectId = request.projectId;
            this.ramRole = request.ramRole;
            this.reportExportField = request.reportExportField;
            this.reportExportPath = request.reportExportPath;
            this.terraformProviderVersion = request.terraformProviderVersion;
            this.triggerConfig = request.triggerConfig;
            this.triggerResourceType = request.triggerResourceType;
        } 

        /**
         * autoDestroy.
         */
        public Builder autoDestroy(Boolean autoDestroy) {
            this.putBodyParameter("autoDestroy", autoDestroy);
            this.autoDestroy = autoDestroy;
            return this;
        }

        /**
         * autoTrigger.
         */
        public Builder autoTrigger(Boolean autoTrigger) {
            this.putBodyParameter("autoTrigger", autoTrigger);
            this.autoTrigger = autoTrigger;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
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
         * forcedSetting.
         */
        public Builder forcedSetting(Boolean forcedSetting) {
            this.putBodyParameter("forcedSetting", forcedSetting);
            this.forcedSetting = forcedSetting;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * notifyConfig.
         */
        public Builder notifyConfig(java.util.List < NotifyConfig> notifyConfig) {
            this.putBodyParameter("notifyConfig", notifyConfig);
            this.notifyConfig = notifyConfig;
            return this;
        }

        /**
         * notifyOperationTypes.
         */
        public Builder notifyOperationTypes(java.util.List < String > notifyOperationTypes) {
            this.putBodyParameter("notifyOperationTypes", notifyOperationTypes);
            this.notifyOperationTypes = notifyOperationTypes;
            return this;
        }

        /**
         * projectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("projectId", projectId);
            this.projectId = projectId;
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
         * reportExportField.
         */
        public Builder reportExportField(java.util.List < String > reportExportField) {
            this.putBodyParameter("reportExportField", reportExportField);
            this.reportExportField = reportExportField;
            return this;
        }

        /**
         * reportExportPath.
         */
        public Builder reportExportPath(String reportExportPath) {
            this.putBodyParameter("reportExportPath", reportExportPath);
            this.reportExportPath = reportExportPath;
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
         * triggerConfig.
         */
        public Builder triggerConfig(java.util.List < TriggerConfig> triggerConfig) {
            this.putBodyParameter("triggerConfig", triggerConfig);
            this.triggerConfig = triggerConfig;
            return this;
        }

        /**
         * triggerResourceType.
         */
        public Builder triggerResourceType(java.util.List < String > triggerResourceType) {
            this.putBodyParameter("triggerResourceType", triggerResourceType);
            this.triggerResourceType = triggerResourceType;
            return this;
        }

        @Override
        public CreateGroupRequest build() {
            return new CreateGroupRequest(this);
        } 

    } 

    public static class NotifyConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("notifyPath")
        private String notifyPath;

        @com.aliyun.core.annotation.NameInMap("notifyType")
        private String notifyType;

        private NotifyConfig(Builder builder) {
            this.notifyPath = builder.notifyPath;
            this.notifyType = builder.notifyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotifyConfig create() {
            return builder().build();
        }

        /**
         * @return notifyPath
         */
        public String getNotifyPath() {
            return this.notifyPath;
        }

        /**
         * @return notifyType
         */
        public String getNotifyType() {
            return this.notifyType;
        }

        public static final class Builder {
            private String notifyPath; 
            private String notifyType; 

            /**
             * notifyPath.
             */
            public Builder notifyPath(String notifyPath) {
                this.notifyPath = notifyPath;
                return this;
            }

            /**
             * notifyType.
             */
            public Builder notifyType(String notifyType) {
                this.notifyType = notifyType;
                return this;
            }

            public NotifyConfig build() {
                return new NotifyConfig(this);
            } 

        } 

    }
    public static class TriggerConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("triggerStrategy")
        private String triggerStrategy;

        @com.aliyun.core.annotation.NameInMap("triggerValue")
        private String triggerValue;

        private TriggerConfig(Builder builder) {
            this.triggerStrategy = builder.triggerStrategy;
            this.triggerValue = builder.triggerValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TriggerConfig create() {
            return builder().build();
        }

        /**
         * @return triggerStrategy
         */
        public String getTriggerStrategy() {
            return this.triggerStrategy;
        }

        /**
         * @return triggerValue
         */
        public String getTriggerValue() {
            return this.triggerValue;
        }

        public static final class Builder {
            private String triggerStrategy; 
            private String triggerValue; 

            /**
             * triggerStrategy.
             */
            public Builder triggerStrategy(String triggerStrategy) {
                this.triggerStrategy = triggerStrategy;
                return this;
            }

            /**
             * triggerValue.
             */
            public Builder triggerValue(String triggerValue) {
                this.triggerValue = triggerValue;
                return this;
            }

            public TriggerConfig build() {
                return new TriggerConfig(this);
            } 

        } 

    }
}
