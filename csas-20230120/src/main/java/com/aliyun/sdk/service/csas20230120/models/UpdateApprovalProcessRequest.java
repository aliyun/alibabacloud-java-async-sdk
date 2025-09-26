// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link UpdateApprovalProcessRequest} extends {@link RequestModel}
 *
 * <p>UpdateApprovalProcessRequest</p>
 */
public class UpdateApprovalProcessRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApprovalType")
    private Integer approvalType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventLabel")
    private String eventLabel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExternalConfig")
    private String externalConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchSchemaConfigs")
    private MatchSchemaConfigs matchSchemaConfigs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MatchSchemas")
    private MatchSchemas matchSchemas;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProcessId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String processId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProcessName")
    private String processName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProcessNodes")
    private java.util.List<java.util.List<String>> processNodes;

    private UpdateApprovalProcessRequest(Builder builder) {
        super(builder);
        this.approvalType = builder.approvalType;
        this.description = builder.description;
        this.eventLabel = builder.eventLabel;
        this.externalConfig = builder.externalConfig;
        this.matchSchemaConfigs = builder.matchSchemaConfigs;
        this.matchSchemas = builder.matchSchemas;
        this.processId = builder.processId;
        this.processName = builder.processName;
        this.processNodes = builder.processNodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApprovalProcessRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return approvalType
     */
    public Integer getApprovalType() {
        return this.approvalType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return eventLabel
     */
    public String getEventLabel() {
        return this.eventLabel;
    }

    /**
     * @return externalConfig
     */
    public String getExternalConfig() {
        return this.externalConfig;
    }

    /**
     * @return matchSchemaConfigs
     */
    public MatchSchemaConfigs getMatchSchemaConfigs() {
        return this.matchSchemaConfigs;
    }

    /**
     * @return matchSchemas
     */
    public MatchSchemas getMatchSchemas() {
        return this.matchSchemas;
    }

    /**
     * @return processId
     */
    public String getProcessId() {
        return this.processId;
    }

    /**
     * @return processName
     */
    public String getProcessName() {
        return this.processName;
    }

    /**
     * @return processNodes
     */
    public java.util.List<java.util.List<String>> getProcessNodes() {
        return this.processNodes;
    }

    public static final class Builder extends Request.Builder<UpdateApprovalProcessRequest, Builder> {
        private Integer approvalType; 
        private String description; 
        private String eventLabel; 
        private String externalConfig; 
        private MatchSchemaConfigs matchSchemaConfigs; 
        private MatchSchemas matchSchemas; 
        private String processId; 
        private String processName; 
        private java.util.List<java.util.List<String>> processNodes; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApprovalProcessRequest request) {
            super(request);
            this.approvalType = request.approvalType;
            this.description = request.description;
            this.eventLabel = request.eventLabel;
            this.externalConfig = request.externalConfig;
            this.matchSchemaConfigs = request.matchSchemaConfigs;
            this.matchSchemas = request.matchSchemas;
            this.processId = request.processId;
            this.processName = request.processName;
            this.processNodes = request.processNodes;
        } 

        /**
         * ApprovalType.
         */
        public Builder approvalType(Integer approvalType) {
            this.putQueryParameter("ApprovalType", approvalType);
            this.approvalType = approvalType;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EventLabel.
         */
        public Builder eventLabel(String eventLabel) {
            this.putQueryParameter("EventLabel", eventLabel);
            this.eventLabel = eventLabel;
            return this;
        }

        /**
         * ExternalConfig.
         */
        public Builder externalConfig(String externalConfig) {
            this.putQueryParameter("ExternalConfig", externalConfig);
            this.externalConfig = externalConfig;
            return this;
        }

        /**
         * MatchSchemaConfigs.
         */
        public Builder matchSchemaConfigs(MatchSchemaConfigs matchSchemaConfigs) {
            String matchSchemaConfigsShrink = shrink(matchSchemaConfigs, "MatchSchemaConfigs", "json");
            this.putQueryParameter("MatchSchemaConfigs", matchSchemaConfigsShrink);
            this.matchSchemaConfigs = matchSchemaConfigs;
            return this;
        }

        /**
         * MatchSchemas.
         */
        public Builder matchSchemas(MatchSchemas matchSchemas) {
            String matchSchemasShrink = shrink(matchSchemas, "MatchSchemas", "json");
            this.putBodyParameter("MatchSchemas", matchSchemasShrink);
            this.matchSchemas = matchSchemas;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-process-f16bf74b2b29****</p>
         */
        public Builder processId(String processId) {
            this.putBodyParameter("ProcessId", processId);
            this.processId = processId;
            return this;
        }

        /**
         * ProcessName.
         */
        public Builder processName(String processName) {
            this.putBodyParameter("ProcessName", processName);
            this.processName = processName;
            return this;
        }

        /**
         * ProcessNodes.
         */
        public Builder processNodes(java.util.List<java.util.List<String>> processNodes) {
            this.putBodyParameter("ProcessNodes", processNodes);
            this.processNodes = processNodes;
            return this;
        }

        @Override
        public UpdateApprovalProcessRequest build() {
            return new UpdateApprovalProcessRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateApprovalProcessRequest} extends {@link TeaModel}
     *
     * <p>UpdateApprovalProcessRequest</p>
     */
    public static class FieldMap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayField")
        private String displayField;

        @com.aliyun.core.annotation.NameInMap("DisplayFieldValue")
        private String displayFieldValue;

        @com.aliyun.core.annotation.NameInMap("SystemField")
        private String systemField;

        private FieldMap(Builder builder) {
            this.displayField = builder.displayField;
            this.displayFieldValue = builder.displayFieldValue;
            this.systemField = builder.systemField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FieldMap create() {
            return builder().build();
        }

        /**
         * @return displayField
         */
        public String getDisplayField() {
            return this.displayField;
        }

        /**
         * @return displayFieldValue
         */
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        /**
         * @return systemField
         */
        public String getSystemField() {
            return this.systemField;
        }

        public static final class Builder {
            private String displayField; 
            private String displayFieldValue; 
            private String systemField; 

            private Builder() {
            } 

            private Builder(FieldMap model) {
                this.displayField = model.displayField;
                this.displayFieldValue = model.displayFieldValue;
                this.systemField = model.systemField;
            } 

            /**
             * DisplayField.
             */
            public Builder displayField(String displayField) {
                this.displayField = displayField;
                return this;
            }

            /**
             * DisplayFieldValue.
             */
            public Builder displayFieldValue(String displayFieldValue) {
                this.displayFieldValue = displayFieldValue;
                return this;
            }

            /**
             * SystemField.
             */
            public Builder systemField(String systemField) {
                this.systemField = systemField;
                return this;
            }

            public FieldMap build() {
                return new FieldMap(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateApprovalProcessRequest} extends {@link TeaModel}
     *
     * <p>UpdateApprovalProcessRequest</p>
     */
    public static class AppUninstallSchemaConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalProcessId")
        private String externalProcessId;

        @com.aliyun.core.annotation.NameInMap("FieldMap")
        private java.util.List<FieldMap> fieldMap;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        private AppUninstallSchemaConfig(Builder builder) {
            this.externalProcessId = builder.externalProcessId;
            this.fieldMap = builder.fieldMap;
            this.schemaId = builder.schemaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppUninstallSchemaConfig create() {
            return builder().build();
        }

        /**
         * @return externalProcessId
         */
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        /**
         * @return fieldMap
         */
        public java.util.List<FieldMap> getFieldMap() {
            return this.fieldMap;
        }

        /**
         * @return schemaId
         */
        public String getSchemaId() {
            return this.schemaId;
        }

        public static final class Builder {
            private String externalProcessId; 
            private java.util.List<FieldMap> fieldMap; 
            private String schemaId; 

            private Builder() {
            } 

            private Builder(AppUninstallSchemaConfig model) {
                this.externalProcessId = model.externalProcessId;
                this.fieldMap = model.fieldMap;
                this.schemaId = model.schemaId;
            } 

            /**
             * ExternalProcessId.
             */
            public Builder externalProcessId(String externalProcessId) {
                this.externalProcessId = externalProcessId;
                return this;
            }

            /**
             * FieldMap.
             */
            public Builder fieldMap(java.util.List<FieldMap> fieldMap) {
                this.fieldMap = fieldMap;
                return this;
            }

            /**
             * SchemaId.
             */
            public Builder schemaId(String schemaId) {
                this.schemaId = schemaId;
                return this;
            }

            public AppUninstallSchemaConfig build() {
                return new AppUninstallSchemaConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateApprovalProcessRequest} extends {@link TeaModel}
     *
     * <p>UpdateApprovalProcessRequest</p>
     */
    public static class DeviceRegistrationSchemaConfigFieldMap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayField")
        private String displayField;

        @com.aliyun.core.annotation.NameInMap("DisplayFieldValue")
        private String displayFieldValue;

        @com.aliyun.core.annotation.NameInMap("SystemField")
        private String systemField;

        private DeviceRegistrationSchemaConfigFieldMap(Builder builder) {
            this.displayField = builder.displayField;
            this.displayFieldValue = builder.displayFieldValue;
            this.systemField = builder.systemField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceRegistrationSchemaConfigFieldMap create() {
            return builder().build();
        }

        /**
         * @return displayField
         */
        public String getDisplayField() {
            return this.displayField;
        }

        /**
         * @return displayFieldValue
         */
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        /**
         * @return systemField
         */
        public String getSystemField() {
            return this.systemField;
        }

        public static final class Builder {
            private String displayField; 
            private String displayFieldValue; 
            private String systemField; 

            private Builder() {
            } 

            private Builder(DeviceRegistrationSchemaConfigFieldMap model) {
                this.displayField = model.displayField;
                this.displayFieldValue = model.displayFieldValue;
                this.systemField = model.systemField;
            } 

            /**
             * DisplayField.
             */
            public Builder displayField(String displayField) {
                this.displayField = displayField;
                return this;
            }

            /**
             * DisplayFieldValue.
             */
            public Builder displayFieldValue(String displayFieldValue) {
                this.displayFieldValue = displayFieldValue;
                return this;
            }

            /**
             * SystemField.
             */
            public Builder systemField(String systemField) {
                this.systemField = systemField;
                return this;
            }

            public DeviceRegistrationSchemaConfigFieldMap build() {
                return new DeviceRegistrationSchemaConfigFieldMap(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateApprovalProcessRequest} extends {@link TeaModel}
     *
     * <p>UpdateApprovalProcessRequest</p>
     */
    public static class DeviceRegistrationSchemaConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalProcessId")
        private String externalProcessId;

        @com.aliyun.core.annotation.NameInMap("FieldMap")
        private java.util.List<DeviceRegistrationSchemaConfigFieldMap> fieldMap;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        private DeviceRegistrationSchemaConfig(Builder builder) {
            this.externalProcessId = builder.externalProcessId;
            this.fieldMap = builder.fieldMap;
            this.schemaId = builder.schemaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceRegistrationSchemaConfig create() {
            return builder().build();
        }

        /**
         * @return externalProcessId
         */
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        /**
         * @return fieldMap
         */
        public java.util.List<DeviceRegistrationSchemaConfigFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        /**
         * @return schemaId
         */
        public String getSchemaId() {
            return this.schemaId;
        }

        public static final class Builder {
            private String externalProcessId; 
            private java.util.List<DeviceRegistrationSchemaConfigFieldMap> fieldMap; 
            private String schemaId; 

            private Builder() {
            } 

            private Builder(DeviceRegistrationSchemaConfig model) {
                this.externalProcessId = model.externalProcessId;
                this.fieldMap = model.fieldMap;
                this.schemaId = model.schemaId;
            } 

            /**
             * ExternalProcessId.
             */
            public Builder externalProcessId(String externalProcessId) {
                this.externalProcessId = externalProcessId;
                return this;
            }

            /**
             * FieldMap.
             */
            public Builder fieldMap(java.util.List<DeviceRegistrationSchemaConfigFieldMap> fieldMap) {
                this.fieldMap = fieldMap;
                return this;
            }

            /**
             * SchemaId.
             */
            public Builder schemaId(String schemaId) {
                this.schemaId = schemaId;
                return this;
            }

            public DeviceRegistrationSchemaConfig build() {
                return new DeviceRegistrationSchemaConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateApprovalProcessRequest} extends {@link TeaModel}
     *
     * <p>UpdateApprovalProcessRequest</p>
     */
    public static class DlpSendSchemaConfigFieldMap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayField")
        private String displayField;

        @com.aliyun.core.annotation.NameInMap("DisplayFieldValue")
        private String displayFieldValue;

        @com.aliyun.core.annotation.NameInMap("SystemField")
        private String systemField;

        private DlpSendSchemaConfigFieldMap(Builder builder) {
            this.displayField = builder.displayField;
            this.displayFieldValue = builder.displayFieldValue;
            this.systemField = builder.systemField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DlpSendSchemaConfigFieldMap create() {
            return builder().build();
        }

        /**
         * @return displayField
         */
        public String getDisplayField() {
            return this.displayField;
        }

        /**
         * @return displayFieldValue
         */
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        /**
         * @return systemField
         */
        public String getSystemField() {
            return this.systemField;
        }

        public static final class Builder {
            private String displayField; 
            private String displayFieldValue; 
            private String systemField; 

            private Builder() {
            } 

            private Builder(DlpSendSchemaConfigFieldMap model) {
                this.displayField = model.displayField;
                this.displayFieldValue = model.displayFieldValue;
                this.systemField = model.systemField;
            } 

            /**
             * DisplayField.
             */
            public Builder displayField(String displayField) {
                this.displayField = displayField;
                return this;
            }

            /**
             * DisplayFieldValue.
             */
            public Builder displayFieldValue(String displayFieldValue) {
                this.displayFieldValue = displayFieldValue;
                return this;
            }

            /**
             * SystemField.
             */
            public Builder systemField(String systemField) {
                this.systemField = systemField;
                return this;
            }

            public DlpSendSchemaConfigFieldMap build() {
                return new DlpSendSchemaConfigFieldMap(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateApprovalProcessRequest} extends {@link TeaModel}
     *
     * <p>UpdateApprovalProcessRequest</p>
     */
    public static class DlpSendSchemaConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalProcessId")
        private String externalProcessId;

        @com.aliyun.core.annotation.NameInMap("FieldMap")
        private java.util.List<DlpSendSchemaConfigFieldMap> fieldMap;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        private DlpSendSchemaConfig(Builder builder) {
            this.externalProcessId = builder.externalProcessId;
            this.fieldMap = builder.fieldMap;
            this.schemaId = builder.schemaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DlpSendSchemaConfig create() {
            return builder().build();
        }

        /**
         * @return externalProcessId
         */
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        /**
         * @return fieldMap
         */
        public java.util.List<DlpSendSchemaConfigFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        /**
         * @return schemaId
         */
        public String getSchemaId() {
            return this.schemaId;
        }

        public static final class Builder {
            private String externalProcessId; 
            private java.util.List<DlpSendSchemaConfigFieldMap> fieldMap; 
            private String schemaId; 

            private Builder() {
            } 

            private Builder(DlpSendSchemaConfig model) {
                this.externalProcessId = model.externalProcessId;
                this.fieldMap = model.fieldMap;
                this.schemaId = model.schemaId;
            } 

            /**
             * ExternalProcessId.
             */
            public Builder externalProcessId(String externalProcessId) {
                this.externalProcessId = externalProcessId;
                return this;
            }

            /**
             * FieldMap.
             */
            public Builder fieldMap(java.util.List<DlpSendSchemaConfigFieldMap> fieldMap) {
                this.fieldMap = fieldMap;
                return this;
            }

            /**
             * SchemaId.
             */
            public Builder schemaId(String schemaId) {
                this.schemaId = schemaId;
                return this;
            }

            public DlpSendSchemaConfig build() {
                return new DlpSendSchemaConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateApprovalProcessRequest} extends {@link TeaModel}
     *
     * <p>UpdateApprovalProcessRequest</p>
     */
    public static class DomainBlacklistSchemaConfigFieldMap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayField")
        private String displayField;

        @com.aliyun.core.annotation.NameInMap("DisplayFieldValue")
        private String displayFieldValue;

        @com.aliyun.core.annotation.NameInMap("SystemField")
        private String systemField;

        private DomainBlacklistSchemaConfigFieldMap(Builder builder) {
            this.displayField = builder.displayField;
            this.displayFieldValue = builder.displayFieldValue;
            this.systemField = builder.systemField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainBlacklistSchemaConfigFieldMap create() {
            return builder().build();
        }

        /**
         * @return displayField
         */
        public String getDisplayField() {
            return this.displayField;
        }

        /**
         * @return displayFieldValue
         */
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        /**
         * @return systemField
         */
        public String getSystemField() {
            return this.systemField;
        }

        public static final class Builder {
            private String displayField; 
            private String displayFieldValue; 
            private String systemField; 

            private Builder() {
            } 

            private Builder(DomainBlacklistSchemaConfigFieldMap model) {
                this.displayField = model.displayField;
                this.displayFieldValue = model.displayFieldValue;
                this.systemField = model.systemField;
            } 

            /**
             * DisplayField.
             */
            public Builder displayField(String displayField) {
                this.displayField = displayField;
                return this;
            }

            /**
             * DisplayFieldValue.
             */
            public Builder displayFieldValue(String displayFieldValue) {
                this.displayFieldValue = displayFieldValue;
                return this;
            }

            /**
             * SystemField.
             */
            public Builder systemField(String systemField) {
                this.systemField = systemField;
                return this;
            }

            public DomainBlacklistSchemaConfigFieldMap build() {
                return new DomainBlacklistSchemaConfigFieldMap(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateApprovalProcessRequest} extends {@link TeaModel}
     *
     * <p>UpdateApprovalProcessRequest</p>
     */
    public static class DomainBlacklistSchemaConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalProcessId")
        private String externalProcessId;

        @com.aliyun.core.annotation.NameInMap("FieldMap")
        private java.util.List<DomainBlacklistSchemaConfigFieldMap> fieldMap;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        private DomainBlacklistSchemaConfig(Builder builder) {
            this.externalProcessId = builder.externalProcessId;
            this.fieldMap = builder.fieldMap;
            this.schemaId = builder.schemaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainBlacklistSchemaConfig create() {
            return builder().build();
        }

        /**
         * @return externalProcessId
         */
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        /**
         * @return fieldMap
         */
        public java.util.List<DomainBlacklistSchemaConfigFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        /**
         * @return schemaId
         */
        public String getSchemaId() {
            return this.schemaId;
        }

        public static final class Builder {
            private String externalProcessId; 
            private java.util.List<DomainBlacklistSchemaConfigFieldMap> fieldMap; 
            private String schemaId; 

            private Builder() {
            } 

            private Builder(DomainBlacklistSchemaConfig model) {
                this.externalProcessId = model.externalProcessId;
                this.fieldMap = model.fieldMap;
                this.schemaId = model.schemaId;
            } 

            /**
             * ExternalProcessId.
             */
            public Builder externalProcessId(String externalProcessId) {
                this.externalProcessId = externalProcessId;
                return this;
            }

            /**
             * FieldMap.
             */
            public Builder fieldMap(java.util.List<DomainBlacklistSchemaConfigFieldMap> fieldMap) {
                this.fieldMap = fieldMap;
                return this;
            }

            /**
             * SchemaId.
             */
            public Builder schemaId(String schemaId) {
                this.schemaId = schemaId;
                return this;
            }

            public DomainBlacklistSchemaConfig build() {
                return new DomainBlacklistSchemaConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateApprovalProcessRequest} extends {@link TeaModel}
     *
     * <p>UpdateApprovalProcessRequest</p>
     */
    public static class DomainWhitelistSchemaConfigFieldMap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayField")
        private String displayField;

        @com.aliyun.core.annotation.NameInMap("DisplayFieldValue")
        private String displayFieldValue;

        @com.aliyun.core.annotation.NameInMap("SystemField")
        private String systemField;

        private DomainWhitelistSchemaConfigFieldMap(Builder builder) {
            this.displayField = builder.displayField;
            this.displayFieldValue = builder.displayFieldValue;
            this.systemField = builder.systemField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainWhitelistSchemaConfigFieldMap create() {
            return builder().build();
        }

        /**
         * @return displayField
         */
        public String getDisplayField() {
            return this.displayField;
        }

        /**
         * @return displayFieldValue
         */
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        /**
         * @return systemField
         */
        public String getSystemField() {
            return this.systemField;
        }

        public static final class Builder {
            private String displayField; 
            private String displayFieldValue; 
            private String systemField; 

            private Builder() {
            } 

            private Builder(DomainWhitelistSchemaConfigFieldMap model) {
                this.displayField = model.displayField;
                this.displayFieldValue = model.displayFieldValue;
                this.systemField = model.systemField;
            } 

            /**
             * DisplayField.
             */
            public Builder displayField(String displayField) {
                this.displayField = displayField;
                return this;
            }

            /**
             * DisplayFieldValue.
             */
            public Builder displayFieldValue(String displayFieldValue) {
                this.displayFieldValue = displayFieldValue;
                return this;
            }

            /**
             * SystemField.
             */
            public Builder systemField(String systemField) {
                this.systemField = systemField;
                return this;
            }

            public DomainWhitelistSchemaConfigFieldMap build() {
                return new DomainWhitelistSchemaConfigFieldMap(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateApprovalProcessRequest} extends {@link TeaModel}
     *
     * <p>UpdateApprovalProcessRequest</p>
     */
    public static class DomainWhitelistSchemaConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalProcessId")
        private String externalProcessId;

        @com.aliyun.core.annotation.NameInMap("FieldMap")
        private java.util.List<DomainWhitelistSchemaConfigFieldMap> fieldMap;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        private DomainWhitelistSchemaConfig(Builder builder) {
            this.externalProcessId = builder.externalProcessId;
            this.fieldMap = builder.fieldMap;
            this.schemaId = builder.schemaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainWhitelistSchemaConfig create() {
            return builder().build();
        }

        /**
         * @return externalProcessId
         */
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        /**
         * @return fieldMap
         */
        public java.util.List<DomainWhitelistSchemaConfigFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        /**
         * @return schemaId
         */
        public String getSchemaId() {
            return this.schemaId;
        }

        public static final class Builder {
            private String externalProcessId; 
            private java.util.List<DomainWhitelistSchemaConfigFieldMap> fieldMap; 
            private String schemaId; 

            private Builder() {
            } 

            private Builder(DomainWhitelistSchemaConfig model) {
                this.externalProcessId = model.externalProcessId;
                this.fieldMap = model.fieldMap;
                this.schemaId = model.schemaId;
            } 

            /**
             * ExternalProcessId.
             */
            public Builder externalProcessId(String externalProcessId) {
                this.externalProcessId = externalProcessId;
                return this;
            }

            /**
             * FieldMap.
             */
            public Builder fieldMap(java.util.List<DomainWhitelistSchemaConfigFieldMap> fieldMap) {
                this.fieldMap = fieldMap;
                return this;
            }

            /**
             * SchemaId.
             */
            public Builder schemaId(String schemaId) {
                this.schemaId = schemaId;
                return this;
            }

            public DomainWhitelistSchemaConfig build() {
                return new DomainWhitelistSchemaConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateApprovalProcessRequest} extends {@link TeaModel}
     *
     * <p>UpdateApprovalProcessRequest</p>
     */
    public static class EndpointHardeningSchemaConfigFieldMap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayField")
        private String displayField;

        @com.aliyun.core.annotation.NameInMap("DisplayFieldValue")
        private String displayFieldValue;

        @com.aliyun.core.annotation.NameInMap("SystemField")
        private String systemField;

        private EndpointHardeningSchemaConfigFieldMap(Builder builder) {
            this.displayField = builder.displayField;
            this.displayFieldValue = builder.displayFieldValue;
            this.systemField = builder.systemField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndpointHardeningSchemaConfigFieldMap create() {
            return builder().build();
        }

        /**
         * @return displayField
         */
        public String getDisplayField() {
            return this.displayField;
        }

        /**
         * @return displayFieldValue
         */
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        /**
         * @return systemField
         */
        public String getSystemField() {
            return this.systemField;
        }

        public static final class Builder {
            private String displayField; 
            private String displayFieldValue; 
            private String systemField; 

            private Builder() {
            } 

            private Builder(EndpointHardeningSchemaConfigFieldMap model) {
                this.displayField = model.displayField;
                this.displayFieldValue = model.displayFieldValue;
                this.systemField = model.systemField;
            } 

            /**
             * DisplayField.
             */
            public Builder displayField(String displayField) {
                this.displayField = displayField;
                return this;
            }

            /**
             * DisplayFieldValue.
             */
            public Builder displayFieldValue(String displayFieldValue) {
                this.displayFieldValue = displayFieldValue;
                return this;
            }

            /**
             * SystemField.
             */
            public Builder systemField(String systemField) {
                this.systemField = systemField;
                return this;
            }

            public EndpointHardeningSchemaConfigFieldMap build() {
                return new EndpointHardeningSchemaConfigFieldMap(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateApprovalProcessRequest} extends {@link TeaModel}
     *
     * <p>UpdateApprovalProcessRequest</p>
     */
    public static class EndpointHardeningSchemaConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalProcessId")
        private String externalProcessId;

        @com.aliyun.core.annotation.NameInMap("FieldMap")
        private java.util.List<EndpointHardeningSchemaConfigFieldMap> fieldMap;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        private EndpointHardeningSchemaConfig(Builder builder) {
            this.externalProcessId = builder.externalProcessId;
            this.fieldMap = builder.fieldMap;
            this.schemaId = builder.schemaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndpointHardeningSchemaConfig create() {
            return builder().build();
        }

        /**
         * @return externalProcessId
         */
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        /**
         * @return fieldMap
         */
        public java.util.List<EndpointHardeningSchemaConfigFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        /**
         * @return schemaId
         */
        public String getSchemaId() {
            return this.schemaId;
        }

        public static final class Builder {
            private String externalProcessId; 
            private java.util.List<EndpointHardeningSchemaConfigFieldMap> fieldMap; 
            private String schemaId; 

            private Builder() {
            } 

            private Builder(EndpointHardeningSchemaConfig model) {
                this.externalProcessId = model.externalProcessId;
                this.fieldMap = model.fieldMap;
                this.schemaId = model.schemaId;
            } 

            /**
             * ExternalProcessId.
             */
            public Builder externalProcessId(String externalProcessId) {
                this.externalProcessId = externalProcessId;
                return this;
            }

            /**
             * FieldMap.
             */
            public Builder fieldMap(java.util.List<EndpointHardeningSchemaConfigFieldMap> fieldMap) {
                this.fieldMap = fieldMap;
                return this;
            }

            /**
             * SchemaId.
             */
            public Builder schemaId(String schemaId) {
                this.schemaId = schemaId;
                return this;
            }

            public EndpointHardeningSchemaConfig build() {
                return new EndpointHardeningSchemaConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateApprovalProcessRequest} extends {@link TeaModel}
     *
     * <p>UpdateApprovalProcessRequest</p>
     */
    public static class PeripheralBlockSchemaConfigFieldMap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayField")
        private String displayField;

        @com.aliyun.core.annotation.NameInMap("DisplayFieldValue")
        private String displayFieldValue;

        @com.aliyun.core.annotation.NameInMap("SystemField")
        private String systemField;

        private PeripheralBlockSchemaConfigFieldMap(Builder builder) {
            this.displayField = builder.displayField;
            this.displayFieldValue = builder.displayFieldValue;
            this.systemField = builder.systemField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PeripheralBlockSchemaConfigFieldMap create() {
            return builder().build();
        }

        /**
         * @return displayField
         */
        public String getDisplayField() {
            return this.displayField;
        }

        /**
         * @return displayFieldValue
         */
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        /**
         * @return systemField
         */
        public String getSystemField() {
            return this.systemField;
        }

        public static final class Builder {
            private String displayField; 
            private String displayFieldValue; 
            private String systemField; 

            private Builder() {
            } 

            private Builder(PeripheralBlockSchemaConfigFieldMap model) {
                this.displayField = model.displayField;
                this.displayFieldValue = model.displayFieldValue;
                this.systemField = model.systemField;
            } 

            /**
             * DisplayField.
             */
            public Builder displayField(String displayField) {
                this.displayField = displayField;
                return this;
            }

            /**
             * DisplayFieldValue.
             */
            public Builder displayFieldValue(String displayFieldValue) {
                this.displayFieldValue = displayFieldValue;
                return this;
            }

            /**
             * SystemField.
             */
            public Builder systemField(String systemField) {
                this.systemField = systemField;
                return this;
            }

            public PeripheralBlockSchemaConfigFieldMap build() {
                return new PeripheralBlockSchemaConfigFieldMap(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateApprovalProcessRequest} extends {@link TeaModel}
     *
     * <p>UpdateApprovalProcessRequest</p>
     */
    public static class PeripheralBlockSchemaConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalProcessId")
        private String externalProcessId;

        @com.aliyun.core.annotation.NameInMap("FieldMap")
        private java.util.List<PeripheralBlockSchemaConfigFieldMap> fieldMap;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        private PeripheralBlockSchemaConfig(Builder builder) {
            this.externalProcessId = builder.externalProcessId;
            this.fieldMap = builder.fieldMap;
            this.schemaId = builder.schemaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PeripheralBlockSchemaConfig create() {
            return builder().build();
        }

        /**
         * @return externalProcessId
         */
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        /**
         * @return fieldMap
         */
        public java.util.List<PeripheralBlockSchemaConfigFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        /**
         * @return schemaId
         */
        public String getSchemaId() {
            return this.schemaId;
        }

        public static final class Builder {
            private String externalProcessId; 
            private java.util.List<PeripheralBlockSchemaConfigFieldMap> fieldMap; 
            private String schemaId; 

            private Builder() {
            } 

            private Builder(PeripheralBlockSchemaConfig model) {
                this.externalProcessId = model.externalProcessId;
                this.fieldMap = model.fieldMap;
                this.schemaId = model.schemaId;
            } 

            /**
             * ExternalProcessId.
             */
            public Builder externalProcessId(String externalProcessId) {
                this.externalProcessId = externalProcessId;
                return this;
            }

            /**
             * FieldMap.
             */
            public Builder fieldMap(java.util.List<PeripheralBlockSchemaConfigFieldMap> fieldMap) {
                this.fieldMap = fieldMap;
                return this;
            }

            /**
             * SchemaId.
             */
            public Builder schemaId(String schemaId) {
                this.schemaId = schemaId;
                return this;
            }

            public PeripheralBlockSchemaConfig build() {
                return new PeripheralBlockSchemaConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateApprovalProcessRequest} extends {@link TeaModel}
     *
     * <p>UpdateApprovalProcessRequest</p>
     */
    public static class SoftwareBlockSchemaConfigFieldMap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayField")
        private String displayField;

        @com.aliyun.core.annotation.NameInMap("DisplayFieldValue")
        private String displayFieldValue;

        @com.aliyun.core.annotation.NameInMap("SystemField")
        private String systemField;

        private SoftwareBlockSchemaConfigFieldMap(Builder builder) {
            this.displayField = builder.displayField;
            this.displayFieldValue = builder.displayFieldValue;
            this.systemField = builder.systemField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SoftwareBlockSchemaConfigFieldMap create() {
            return builder().build();
        }

        /**
         * @return displayField
         */
        public String getDisplayField() {
            return this.displayField;
        }

        /**
         * @return displayFieldValue
         */
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        /**
         * @return systemField
         */
        public String getSystemField() {
            return this.systemField;
        }

        public static final class Builder {
            private String displayField; 
            private String displayFieldValue; 
            private String systemField; 

            private Builder() {
            } 

            private Builder(SoftwareBlockSchemaConfigFieldMap model) {
                this.displayField = model.displayField;
                this.displayFieldValue = model.displayFieldValue;
                this.systemField = model.systemField;
            } 

            /**
             * DisplayField.
             */
            public Builder displayField(String displayField) {
                this.displayField = displayField;
                return this;
            }

            /**
             * DisplayFieldValue.
             */
            public Builder displayFieldValue(String displayFieldValue) {
                this.displayFieldValue = displayFieldValue;
                return this;
            }

            /**
             * SystemField.
             */
            public Builder systemField(String systemField) {
                this.systemField = systemField;
                return this;
            }

            public SoftwareBlockSchemaConfigFieldMap build() {
                return new SoftwareBlockSchemaConfigFieldMap(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateApprovalProcessRequest} extends {@link TeaModel}
     *
     * <p>UpdateApprovalProcessRequest</p>
     */
    public static class SoftwareBlockSchemaConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalProcessId")
        private String externalProcessId;

        @com.aliyun.core.annotation.NameInMap("FieldMap")
        private java.util.List<SoftwareBlockSchemaConfigFieldMap> fieldMap;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        private SoftwareBlockSchemaConfig(Builder builder) {
            this.externalProcessId = builder.externalProcessId;
            this.fieldMap = builder.fieldMap;
            this.schemaId = builder.schemaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SoftwareBlockSchemaConfig create() {
            return builder().build();
        }

        /**
         * @return externalProcessId
         */
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        /**
         * @return fieldMap
         */
        public java.util.List<SoftwareBlockSchemaConfigFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        /**
         * @return schemaId
         */
        public String getSchemaId() {
            return this.schemaId;
        }

        public static final class Builder {
            private String externalProcessId; 
            private java.util.List<SoftwareBlockSchemaConfigFieldMap> fieldMap; 
            private String schemaId; 

            private Builder() {
            } 

            private Builder(SoftwareBlockSchemaConfig model) {
                this.externalProcessId = model.externalProcessId;
                this.fieldMap = model.fieldMap;
                this.schemaId = model.schemaId;
            } 

            /**
             * ExternalProcessId.
             */
            public Builder externalProcessId(String externalProcessId) {
                this.externalProcessId = externalProcessId;
                return this;
            }

            /**
             * FieldMap.
             */
            public Builder fieldMap(java.util.List<SoftwareBlockSchemaConfigFieldMap> fieldMap) {
                this.fieldMap = fieldMap;
                return this;
            }

            /**
             * SchemaId.
             */
            public Builder schemaId(String schemaId) {
                this.schemaId = schemaId;
                return this;
            }

            public SoftwareBlockSchemaConfig build() {
                return new SoftwareBlockSchemaConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateApprovalProcessRequest} extends {@link TeaModel}
     *
     * <p>UpdateApprovalProcessRequest</p>
     */
    public static class SoftwareHardeningSchemaConfigFieldMap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayField")
        private String displayField;

        @com.aliyun.core.annotation.NameInMap("DisplayFieldValue")
        private String displayFieldValue;

        @com.aliyun.core.annotation.NameInMap("SystemField")
        private String systemField;

        private SoftwareHardeningSchemaConfigFieldMap(Builder builder) {
            this.displayField = builder.displayField;
            this.displayFieldValue = builder.displayFieldValue;
            this.systemField = builder.systemField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SoftwareHardeningSchemaConfigFieldMap create() {
            return builder().build();
        }

        /**
         * @return displayField
         */
        public String getDisplayField() {
            return this.displayField;
        }

        /**
         * @return displayFieldValue
         */
        public String getDisplayFieldValue() {
            return this.displayFieldValue;
        }

        /**
         * @return systemField
         */
        public String getSystemField() {
            return this.systemField;
        }

        public static final class Builder {
            private String displayField; 
            private String displayFieldValue; 
            private String systemField; 

            private Builder() {
            } 

            private Builder(SoftwareHardeningSchemaConfigFieldMap model) {
                this.displayField = model.displayField;
                this.displayFieldValue = model.displayFieldValue;
                this.systemField = model.systemField;
            } 

            /**
             * DisplayField.
             */
            public Builder displayField(String displayField) {
                this.displayField = displayField;
                return this;
            }

            /**
             * DisplayFieldValue.
             */
            public Builder displayFieldValue(String displayFieldValue) {
                this.displayFieldValue = displayFieldValue;
                return this;
            }

            /**
             * SystemField.
             */
            public Builder systemField(String systemField) {
                this.systemField = systemField;
                return this;
            }

            public SoftwareHardeningSchemaConfigFieldMap build() {
                return new SoftwareHardeningSchemaConfigFieldMap(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateApprovalProcessRequest} extends {@link TeaModel}
     *
     * <p>UpdateApprovalProcessRequest</p>
     */
    public static class SoftwareHardeningSchemaConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalProcessId")
        private String externalProcessId;

        @com.aliyun.core.annotation.NameInMap("FieldMap")
        private java.util.List<SoftwareHardeningSchemaConfigFieldMap> fieldMap;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        private SoftwareHardeningSchemaConfig(Builder builder) {
            this.externalProcessId = builder.externalProcessId;
            this.fieldMap = builder.fieldMap;
            this.schemaId = builder.schemaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SoftwareHardeningSchemaConfig create() {
            return builder().build();
        }

        /**
         * @return externalProcessId
         */
        public String getExternalProcessId() {
            return this.externalProcessId;
        }

        /**
         * @return fieldMap
         */
        public java.util.List<SoftwareHardeningSchemaConfigFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        /**
         * @return schemaId
         */
        public String getSchemaId() {
            return this.schemaId;
        }

        public static final class Builder {
            private String externalProcessId; 
            private java.util.List<SoftwareHardeningSchemaConfigFieldMap> fieldMap; 
            private String schemaId; 

            private Builder() {
            } 

            private Builder(SoftwareHardeningSchemaConfig model) {
                this.externalProcessId = model.externalProcessId;
                this.fieldMap = model.fieldMap;
                this.schemaId = model.schemaId;
            } 

            /**
             * ExternalProcessId.
             */
            public Builder externalProcessId(String externalProcessId) {
                this.externalProcessId = externalProcessId;
                return this;
            }

            /**
             * FieldMap.
             */
            public Builder fieldMap(java.util.List<SoftwareHardeningSchemaConfigFieldMap> fieldMap) {
                this.fieldMap = fieldMap;
                return this;
            }

            /**
             * SchemaId.
             */
            public Builder schemaId(String schemaId) {
                this.schemaId = schemaId;
                return this;
            }

            public SoftwareHardeningSchemaConfig build() {
                return new SoftwareHardeningSchemaConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateApprovalProcessRequest} extends {@link TeaModel}
     *
     * <p>UpdateApprovalProcessRequest</p>
     */
    public static class MatchSchemaConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppUninstallSchemaConfig")
        private AppUninstallSchemaConfig appUninstallSchemaConfig;

        @com.aliyun.core.annotation.NameInMap("DeviceRegistrationSchemaConfig")
        private DeviceRegistrationSchemaConfig deviceRegistrationSchemaConfig;

        @com.aliyun.core.annotation.NameInMap("DlpSendSchemaConfig")
        private DlpSendSchemaConfig dlpSendSchemaConfig;

        @com.aliyun.core.annotation.NameInMap("DomainBlacklistSchemaConfig")
        private DomainBlacklistSchemaConfig domainBlacklistSchemaConfig;

        @com.aliyun.core.annotation.NameInMap("DomainWhitelistSchemaConfig")
        private DomainWhitelistSchemaConfig domainWhitelistSchemaConfig;

        @com.aliyun.core.annotation.NameInMap("EndpointHardeningSchemaConfig")
        private EndpointHardeningSchemaConfig endpointHardeningSchemaConfig;

        @com.aliyun.core.annotation.NameInMap("PeripheralBlockSchemaConfig")
        private PeripheralBlockSchemaConfig peripheralBlockSchemaConfig;

        @com.aliyun.core.annotation.NameInMap("SoftwareBlockSchemaConfig")
        private SoftwareBlockSchemaConfig softwareBlockSchemaConfig;

        @com.aliyun.core.annotation.NameInMap("SoftwareHardeningSchemaConfig")
        private SoftwareHardeningSchemaConfig softwareHardeningSchemaConfig;

        private MatchSchemaConfigs(Builder builder) {
            this.appUninstallSchemaConfig = builder.appUninstallSchemaConfig;
            this.deviceRegistrationSchemaConfig = builder.deviceRegistrationSchemaConfig;
            this.dlpSendSchemaConfig = builder.dlpSendSchemaConfig;
            this.domainBlacklistSchemaConfig = builder.domainBlacklistSchemaConfig;
            this.domainWhitelistSchemaConfig = builder.domainWhitelistSchemaConfig;
            this.endpointHardeningSchemaConfig = builder.endpointHardeningSchemaConfig;
            this.peripheralBlockSchemaConfig = builder.peripheralBlockSchemaConfig;
            this.softwareBlockSchemaConfig = builder.softwareBlockSchemaConfig;
            this.softwareHardeningSchemaConfig = builder.softwareHardeningSchemaConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchSchemaConfigs create() {
            return builder().build();
        }

        /**
         * @return appUninstallSchemaConfig
         */
        public AppUninstallSchemaConfig getAppUninstallSchemaConfig() {
            return this.appUninstallSchemaConfig;
        }

        /**
         * @return deviceRegistrationSchemaConfig
         */
        public DeviceRegistrationSchemaConfig getDeviceRegistrationSchemaConfig() {
            return this.deviceRegistrationSchemaConfig;
        }

        /**
         * @return dlpSendSchemaConfig
         */
        public DlpSendSchemaConfig getDlpSendSchemaConfig() {
            return this.dlpSendSchemaConfig;
        }

        /**
         * @return domainBlacklistSchemaConfig
         */
        public DomainBlacklistSchemaConfig getDomainBlacklistSchemaConfig() {
            return this.domainBlacklistSchemaConfig;
        }

        /**
         * @return domainWhitelistSchemaConfig
         */
        public DomainWhitelistSchemaConfig getDomainWhitelistSchemaConfig() {
            return this.domainWhitelistSchemaConfig;
        }

        /**
         * @return endpointHardeningSchemaConfig
         */
        public EndpointHardeningSchemaConfig getEndpointHardeningSchemaConfig() {
            return this.endpointHardeningSchemaConfig;
        }

        /**
         * @return peripheralBlockSchemaConfig
         */
        public PeripheralBlockSchemaConfig getPeripheralBlockSchemaConfig() {
            return this.peripheralBlockSchemaConfig;
        }

        /**
         * @return softwareBlockSchemaConfig
         */
        public SoftwareBlockSchemaConfig getSoftwareBlockSchemaConfig() {
            return this.softwareBlockSchemaConfig;
        }

        /**
         * @return softwareHardeningSchemaConfig
         */
        public SoftwareHardeningSchemaConfig getSoftwareHardeningSchemaConfig() {
            return this.softwareHardeningSchemaConfig;
        }

        public static final class Builder {
            private AppUninstallSchemaConfig appUninstallSchemaConfig; 
            private DeviceRegistrationSchemaConfig deviceRegistrationSchemaConfig; 
            private DlpSendSchemaConfig dlpSendSchemaConfig; 
            private DomainBlacklistSchemaConfig domainBlacklistSchemaConfig; 
            private DomainWhitelistSchemaConfig domainWhitelistSchemaConfig; 
            private EndpointHardeningSchemaConfig endpointHardeningSchemaConfig; 
            private PeripheralBlockSchemaConfig peripheralBlockSchemaConfig; 
            private SoftwareBlockSchemaConfig softwareBlockSchemaConfig; 
            private SoftwareHardeningSchemaConfig softwareHardeningSchemaConfig; 

            private Builder() {
            } 

            private Builder(MatchSchemaConfigs model) {
                this.appUninstallSchemaConfig = model.appUninstallSchemaConfig;
                this.deviceRegistrationSchemaConfig = model.deviceRegistrationSchemaConfig;
                this.dlpSendSchemaConfig = model.dlpSendSchemaConfig;
                this.domainBlacklistSchemaConfig = model.domainBlacklistSchemaConfig;
                this.domainWhitelistSchemaConfig = model.domainWhitelistSchemaConfig;
                this.endpointHardeningSchemaConfig = model.endpointHardeningSchemaConfig;
                this.peripheralBlockSchemaConfig = model.peripheralBlockSchemaConfig;
                this.softwareBlockSchemaConfig = model.softwareBlockSchemaConfig;
                this.softwareHardeningSchemaConfig = model.softwareHardeningSchemaConfig;
            } 

            /**
             * AppUninstallSchemaConfig.
             */
            public Builder appUninstallSchemaConfig(AppUninstallSchemaConfig appUninstallSchemaConfig) {
                this.appUninstallSchemaConfig = appUninstallSchemaConfig;
                return this;
            }

            /**
             * DeviceRegistrationSchemaConfig.
             */
            public Builder deviceRegistrationSchemaConfig(DeviceRegistrationSchemaConfig deviceRegistrationSchemaConfig) {
                this.deviceRegistrationSchemaConfig = deviceRegistrationSchemaConfig;
                return this;
            }

            /**
             * DlpSendSchemaConfig.
             */
            public Builder dlpSendSchemaConfig(DlpSendSchemaConfig dlpSendSchemaConfig) {
                this.dlpSendSchemaConfig = dlpSendSchemaConfig;
                return this;
            }

            /**
             * DomainBlacklistSchemaConfig.
             */
            public Builder domainBlacklistSchemaConfig(DomainBlacklistSchemaConfig domainBlacklistSchemaConfig) {
                this.domainBlacklistSchemaConfig = domainBlacklistSchemaConfig;
                return this;
            }

            /**
             * DomainWhitelistSchemaConfig.
             */
            public Builder domainWhitelistSchemaConfig(DomainWhitelistSchemaConfig domainWhitelistSchemaConfig) {
                this.domainWhitelistSchemaConfig = domainWhitelistSchemaConfig;
                return this;
            }

            /**
             * EndpointHardeningSchemaConfig.
             */
            public Builder endpointHardeningSchemaConfig(EndpointHardeningSchemaConfig endpointHardeningSchemaConfig) {
                this.endpointHardeningSchemaConfig = endpointHardeningSchemaConfig;
                return this;
            }

            /**
             * PeripheralBlockSchemaConfig.
             */
            public Builder peripheralBlockSchemaConfig(PeripheralBlockSchemaConfig peripheralBlockSchemaConfig) {
                this.peripheralBlockSchemaConfig = peripheralBlockSchemaConfig;
                return this;
            }

            /**
             * SoftwareBlockSchemaConfig.
             */
            public Builder softwareBlockSchemaConfig(SoftwareBlockSchemaConfig softwareBlockSchemaConfig) {
                this.softwareBlockSchemaConfig = softwareBlockSchemaConfig;
                return this;
            }

            /**
             * SoftwareHardeningSchemaConfig.
             */
            public Builder softwareHardeningSchemaConfig(SoftwareHardeningSchemaConfig softwareHardeningSchemaConfig) {
                this.softwareHardeningSchemaConfig = softwareHardeningSchemaConfig;
                return this;
            }

            public MatchSchemaConfigs build() {
                return new MatchSchemaConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateApprovalProcessRequest} extends {@link TeaModel}
     *
     * <p>UpdateApprovalProcessRequest</p>
     */
    public static class MatchSchemas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppUninstallSchemaId")
        private String appUninstallSchemaId;

        @com.aliyun.core.annotation.NameInMap("DeviceRegistrationSchemaId")
        private String deviceRegistrationSchemaId;

        @com.aliyun.core.annotation.NameInMap("DlpSendSchemaId")
        private String dlpSendSchemaId;

        @com.aliyun.core.annotation.NameInMap("DomainBlacklistSchemaId")
        private String domainBlacklistSchemaId;

        @com.aliyun.core.annotation.NameInMap("DomainWhitelistSchemaId")
        private String domainWhitelistSchemaId;

        @com.aliyun.core.annotation.NameInMap("EndpointHardeningSchemaId")
        private String endpointHardeningSchemaId;

        @com.aliyun.core.annotation.NameInMap("PeripheralBlockSchemaId")
        private String peripheralBlockSchemaId;

        @com.aliyun.core.annotation.NameInMap("SoftwareBlockSchemaId")
        private String softwareBlockSchemaId;

        @com.aliyun.core.annotation.NameInMap("SoftwareHardeningSchemaId")
        private String softwareHardeningSchemaId;

        private MatchSchemas(Builder builder) {
            this.appUninstallSchemaId = builder.appUninstallSchemaId;
            this.deviceRegistrationSchemaId = builder.deviceRegistrationSchemaId;
            this.dlpSendSchemaId = builder.dlpSendSchemaId;
            this.domainBlacklistSchemaId = builder.domainBlacklistSchemaId;
            this.domainWhitelistSchemaId = builder.domainWhitelistSchemaId;
            this.endpointHardeningSchemaId = builder.endpointHardeningSchemaId;
            this.peripheralBlockSchemaId = builder.peripheralBlockSchemaId;
            this.softwareBlockSchemaId = builder.softwareBlockSchemaId;
            this.softwareHardeningSchemaId = builder.softwareHardeningSchemaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchSchemas create() {
            return builder().build();
        }

        /**
         * @return appUninstallSchemaId
         */
        public String getAppUninstallSchemaId() {
            return this.appUninstallSchemaId;
        }

        /**
         * @return deviceRegistrationSchemaId
         */
        public String getDeviceRegistrationSchemaId() {
            return this.deviceRegistrationSchemaId;
        }

        /**
         * @return dlpSendSchemaId
         */
        public String getDlpSendSchemaId() {
            return this.dlpSendSchemaId;
        }

        /**
         * @return domainBlacklistSchemaId
         */
        public String getDomainBlacklistSchemaId() {
            return this.domainBlacklistSchemaId;
        }

        /**
         * @return domainWhitelistSchemaId
         */
        public String getDomainWhitelistSchemaId() {
            return this.domainWhitelistSchemaId;
        }

        /**
         * @return endpointHardeningSchemaId
         */
        public String getEndpointHardeningSchemaId() {
            return this.endpointHardeningSchemaId;
        }

        /**
         * @return peripheralBlockSchemaId
         */
        public String getPeripheralBlockSchemaId() {
            return this.peripheralBlockSchemaId;
        }

        /**
         * @return softwareBlockSchemaId
         */
        public String getSoftwareBlockSchemaId() {
            return this.softwareBlockSchemaId;
        }

        /**
         * @return softwareHardeningSchemaId
         */
        public String getSoftwareHardeningSchemaId() {
            return this.softwareHardeningSchemaId;
        }

        public static final class Builder {
            private String appUninstallSchemaId; 
            private String deviceRegistrationSchemaId; 
            private String dlpSendSchemaId; 
            private String domainBlacklistSchemaId; 
            private String domainWhitelistSchemaId; 
            private String endpointHardeningSchemaId; 
            private String peripheralBlockSchemaId; 
            private String softwareBlockSchemaId; 
            private String softwareHardeningSchemaId; 

            private Builder() {
            } 

            private Builder(MatchSchemas model) {
                this.appUninstallSchemaId = model.appUninstallSchemaId;
                this.deviceRegistrationSchemaId = model.deviceRegistrationSchemaId;
                this.dlpSendSchemaId = model.dlpSendSchemaId;
                this.domainBlacklistSchemaId = model.domainBlacklistSchemaId;
                this.domainWhitelistSchemaId = model.domainWhitelistSchemaId;
                this.endpointHardeningSchemaId = model.endpointHardeningSchemaId;
                this.peripheralBlockSchemaId = model.peripheralBlockSchemaId;
                this.softwareBlockSchemaId = model.softwareBlockSchemaId;
                this.softwareHardeningSchemaId = model.softwareHardeningSchemaId;
            } 

            /**
             * AppUninstallSchemaId.
             */
            public Builder appUninstallSchemaId(String appUninstallSchemaId) {
                this.appUninstallSchemaId = appUninstallSchemaId;
                return this;
            }

            /**
             * DeviceRegistrationSchemaId.
             */
            public Builder deviceRegistrationSchemaId(String deviceRegistrationSchemaId) {
                this.deviceRegistrationSchemaId = deviceRegistrationSchemaId;
                return this;
            }

            /**
             * DlpSendSchemaId.
             */
            public Builder dlpSendSchemaId(String dlpSendSchemaId) {
                this.dlpSendSchemaId = dlpSendSchemaId;
                return this;
            }

            /**
             * DomainBlacklistSchemaId.
             */
            public Builder domainBlacklistSchemaId(String domainBlacklistSchemaId) {
                this.domainBlacklistSchemaId = domainBlacklistSchemaId;
                return this;
            }

            /**
             * DomainWhitelistSchemaId.
             */
            public Builder domainWhitelistSchemaId(String domainWhitelistSchemaId) {
                this.domainWhitelistSchemaId = domainWhitelistSchemaId;
                return this;
            }

            /**
             * EndpointHardeningSchemaId.
             */
            public Builder endpointHardeningSchemaId(String endpointHardeningSchemaId) {
                this.endpointHardeningSchemaId = endpointHardeningSchemaId;
                return this;
            }

            /**
             * PeripheralBlockSchemaId.
             */
            public Builder peripheralBlockSchemaId(String peripheralBlockSchemaId) {
                this.peripheralBlockSchemaId = peripheralBlockSchemaId;
                return this;
            }

            /**
             * SoftwareBlockSchemaId.
             */
            public Builder softwareBlockSchemaId(String softwareBlockSchemaId) {
                this.softwareBlockSchemaId = softwareBlockSchemaId;
                return this;
            }

            /**
             * SoftwareHardeningSchemaId.
             */
            public Builder softwareHardeningSchemaId(String softwareHardeningSchemaId) {
                this.softwareHardeningSchemaId = softwareHardeningSchemaId;
                return this;
            }

            public MatchSchemas build() {
                return new MatchSchemas(this);
            } 

        } 

    }
}
