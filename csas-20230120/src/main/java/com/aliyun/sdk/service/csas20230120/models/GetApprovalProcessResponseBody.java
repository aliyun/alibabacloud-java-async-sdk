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
 * {@link GetApprovalProcessResponseBody} extends {@link TeaModel}
 *
 * <p>GetApprovalProcessResponseBody</p>
 */
public class GetApprovalProcessResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Process")
    private Process process;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetApprovalProcessResponseBody(Builder builder) {
        this.process = builder.process;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApprovalProcessResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return process
     */
    public Process getProcess() {
        return this.process;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Process process; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetApprovalProcessResponseBody model) {
            this.process = model.process;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The approval process.</p>
         */
        public Builder process(Process process) {
            this.process = process;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C81E0B4B-AAEB-5FDD-B27E-3F5AF7EBD7EF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApprovalProcessResponseBody build() {
            return new GetApprovalProcessResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>GetApprovalProcessResponseBody</p>
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
             * <p>The name of the control in the external approval form.</p>
             * 
             * <strong>example:</strong>
             * <p>Registration reason</p>
             */
            public Builder displayField(String displayField) {
                this.displayField = displayField;
                return this;
            }

            /**
             * <p>The identifier of the control in the external approval form. DingTalk approval returns the control label. WeCom and Lark approvals return the value in the &quot;Control type%%%Control ID&quot; format.</p>
             * 
             * <strong>example:</strong>
             * <p>Textarea%%%widget-1a2b****</p>
             */
            public Builder displayFieldValue(String displayFieldValue) {
                this.displayFieldValue = displayFieldValue;
                return this;
            }

            /**
             * <p>The system field identifier, such as approvalReason.</p>
             * 
             * <strong>example:</strong>
             * <p>approvalReason</p>
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
     * {@link GetApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>GetApprovalProcessResponseBody</p>
     */
    public static class AppUninstallPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalProcessId")
        private String externalProcessId;

        @com.aliyun.core.annotation.NameInMap("FieldMap")
        private java.util.List<FieldMap> fieldMap;

        @com.aliyun.core.annotation.NameInMap("PolicyIds")
        private java.util.List<String> policyIds;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        private AppUninstallPolicies(Builder builder) {
            this.externalProcessId = builder.externalProcessId;
            this.fieldMap = builder.fieldMap;
            this.policyIds = builder.policyIds;
            this.schemaId = builder.schemaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppUninstallPolicies create() {
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
         * @return policyIds
         */
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
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
            private java.util.List<String> policyIds; 
            private String schemaId; 

            private Builder() {
            } 

            private Builder(AppUninstallPolicies model) {
                this.externalProcessId = model.externalProcessId;
                this.fieldMap = model.fieldMap;
                this.policyIds = model.policyIds;
                this.schemaId = model.schemaId;
            } 

            /**
             * <p>The ID of the external approval process. If the approval type is 1 (DingTalk approval), this parameter corresponds to the DingTalk process code. If the approval type is 2 (WeCom approval), this parameter corresponds to the template ID. If the approval type is 3 (Lark approval), this parameter corresponds to the approval definition code. If the approval type is 0 (built-in approval), this parameter is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>PROC-1a2b3c4d5e6f****</p>
             */
            public Builder externalProcessId(String externalProcessId) {
                this.externalProcessId = externalProcessId;
                return this;
            }

            /**
             * <p>The list of mappings between system fields and external approval form controls.</p>
             */
            public Builder fieldMap(java.util.List<FieldMap> fieldMap) {
                this.fieldMap = fieldMap;
                return this;
            }

            /**
             * <p>The list of endpoint uninstall policy IDs.</p>
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * <p>The ID of the approval template.</p>
             * 
             * <strong>example:</strong>
             * <p>approval-schema-090134f1ebff****</p>
             */
            public Builder schemaId(String schemaId) {
                this.schemaId = schemaId;
                return this;
            }

            public AppUninstallPolicies build() {
                return new AppUninstallPolicies(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>GetApprovalProcessResponseBody</p>
     */
    public static class DeviceRegistrationPoliciesFieldMap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayField")
        private String displayField;

        @com.aliyun.core.annotation.NameInMap("DisplayFieldValue")
        private String displayFieldValue;

        @com.aliyun.core.annotation.NameInMap("SystemField")
        private String systemField;

        private DeviceRegistrationPoliciesFieldMap(Builder builder) {
            this.displayField = builder.displayField;
            this.displayFieldValue = builder.displayFieldValue;
            this.systemField = builder.systemField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceRegistrationPoliciesFieldMap create() {
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

            private Builder(DeviceRegistrationPoliciesFieldMap model) {
                this.displayField = model.displayField;
                this.displayFieldValue = model.displayFieldValue;
                this.systemField = model.systemField;
            } 

            /**
             * <p>The name of the control in the external approval form.</p>
             * 
             * <strong>example:</strong>
             * <p>Registered domain name</p>
             */
            public Builder displayField(String displayField) {
                this.displayField = displayField;
                return this;
            }

            /**
             * <p>The identifier of the control in the external approval form. DingTalk approval returns the control label. WeCom and Lark approvals return the value in the &quot;Control type%%%Control ID&quot; format.</p>
             * 
             * <strong>example:</strong>
             * <p>Textarea%%%widget-1a2b****</p>
             */
            public Builder displayFieldValue(String displayFieldValue) {
                this.displayFieldValue = displayFieldValue;
                return this;
            }

            /**
             * <p>The identifier of the system field, such as report_domain.</p>
             * 
             * <strong>example:</strong>
             * <p>report_domain</p>
             */
            public Builder systemField(String systemField) {
                this.systemField = systemField;
                return this;
            }

            public DeviceRegistrationPoliciesFieldMap build() {
                return new DeviceRegistrationPoliciesFieldMap(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>GetApprovalProcessResponseBody</p>
     */
    public static class DeviceRegistrationPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalProcessId")
        private String externalProcessId;

        @com.aliyun.core.annotation.NameInMap("FieldMap")
        private java.util.List<DeviceRegistrationPoliciesFieldMap> fieldMap;

        @com.aliyun.core.annotation.NameInMap("PolicyIds")
        private java.util.List<String> policyIds;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        private DeviceRegistrationPolicies(Builder builder) {
            this.externalProcessId = builder.externalProcessId;
            this.fieldMap = builder.fieldMap;
            this.policyIds = builder.policyIds;
            this.schemaId = builder.schemaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceRegistrationPolicies create() {
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
        public java.util.List<DeviceRegistrationPoliciesFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        /**
         * @return policyIds
         */
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        /**
         * @return schemaId
         */
        public String getSchemaId() {
            return this.schemaId;
        }

        public static final class Builder {
            private String externalProcessId; 
            private java.util.List<DeviceRegistrationPoliciesFieldMap> fieldMap; 
            private java.util.List<String> policyIds; 
            private String schemaId; 

            private Builder() {
            } 

            private Builder(DeviceRegistrationPolicies model) {
                this.externalProcessId = model.externalProcessId;
                this.fieldMap = model.fieldMap;
                this.policyIds = model.policyIds;
                this.schemaId = model.schemaId;
            } 

            /**
             * <p>The ID of the external approval process. If the approval type is 1 (DingTalk approval), this parameter corresponds to the DingTalk process code. If the approval type is 2 (WeCom approval), this parameter corresponds to the template ID. If the approval type is 3 (Lark approval), this parameter corresponds to the approval definition code. If the approval type is 0 (built-in approval), this parameter is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>PROC-1a2b3c4d5e6f****</p>
             */
            public Builder externalProcessId(String externalProcessId) {
                this.externalProcessId = externalProcessId;
                return this;
            }

            /**
             * <p>The list of mappings between system fields and external approval form controls.</p>
             */
            public Builder fieldMap(java.util.List<DeviceRegistrationPoliciesFieldMap> fieldMap) {
                this.fieldMap = fieldMap;
                return this;
            }

            /**
             * <p>The list of device registration policy IDs.</p>
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * <p>The ID of the approval template.</p>
             * 
             * <strong>example:</strong>
             * <p>approval-schema-090134f1ebff****</p>
             */
            public Builder schemaId(String schemaId) {
                this.schemaId = schemaId;
                return this;
            }

            public DeviceRegistrationPolicies build() {
                return new DeviceRegistrationPolicies(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>GetApprovalProcessResponseBody</p>
     */
    public static class DlpSendPoliciesFieldMap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayField")
        private String displayField;

        @com.aliyun.core.annotation.NameInMap("DisplayFieldValue")
        private String displayFieldValue;

        @com.aliyun.core.annotation.NameInMap("SystemField")
        private String systemField;

        private DlpSendPoliciesFieldMap(Builder builder) {
            this.displayField = builder.displayField;
            this.displayFieldValue = builder.displayFieldValue;
            this.systemField = builder.systemField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DlpSendPoliciesFieldMap create() {
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

            private Builder(DlpSendPoliciesFieldMap model) {
                this.displayField = model.displayField;
                this.displayFieldValue = model.displayFieldValue;
                this.systemField = model.systemField;
            } 

            /**
             * <p>The name of the control in the external approval form.</p>
             * 
             * <strong>example:</strong>
             * <p>File name</p>
             */
            public Builder displayField(String displayField) {
                this.displayField = displayField;
                return this;
            }

            /**
             * <p>The identifier of the control in the external approval form. DingTalk approval returns the control label. WeCom and Lark approvals return the value in the &quot;Control type%%%Control ID&quot; format.</p>
             * 
             * <strong>example:</strong>
             * <p>Textarea%%%widget-1a2b****</p>
             */
            public Builder displayFieldValue(String displayFieldValue) {
                this.displayFieldValue = displayFieldValue;
                return this;
            }

            /**
             * <p>The system field identifier, such as fileName.</p>
             * 
             * <strong>example:</strong>
             * <p>fileName</p>
             */
            public Builder systemField(String systemField) {
                this.systemField = systemField;
                return this;
            }

            public DlpSendPoliciesFieldMap build() {
                return new DlpSendPoliciesFieldMap(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>GetApprovalProcessResponseBody</p>
     */
    public static class DlpSendPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalProcessId")
        private String externalProcessId;

        @com.aliyun.core.annotation.NameInMap("FieldMap")
        private java.util.List<DlpSendPoliciesFieldMap> fieldMap;

        @com.aliyun.core.annotation.NameInMap("PolicyIds")
        private java.util.List<String> policyIds;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        private DlpSendPolicies(Builder builder) {
            this.externalProcessId = builder.externalProcessId;
            this.fieldMap = builder.fieldMap;
            this.policyIds = builder.policyIds;
            this.schemaId = builder.schemaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DlpSendPolicies create() {
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
        public java.util.List<DlpSendPoliciesFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        /**
         * @return policyIds
         */
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        /**
         * @return schemaId
         */
        public String getSchemaId() {
            return this.schemaId;
        }

        public static final class Builder {
            private String externalProcessId; 
            private java.util.List<DlpSendPoliciesFieldMap> fieldMap; 
            private java.util.List<String> policyIds; 
            private String schemaId; 

            private Builder() {
            } 

            private Builder(DlpSendPolicies model) {
                this.externalProcessId = model.externalProcessId;
                this.fieldMap = model.fieldMap;
                this.policyIds = model.policyIds;
                this.schemaId = model.schemaId;
            } 

            /**
             * <p>The ID of the external approval process. If the approval type is 1 (DingTalk approval), this parameter corresponds to the DingTalk process code. If the approval type is 2 (WeCom approval), this parameter corresponds to the template ID. If the approval type is 3 (Lark approval), this parameter corresponds to the approval definition code. If the approval type is 0 (built-in approval), this parameter is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>PROC-1a2b3c4d5e6f****</p>
             */
            public Builder externalProcessId(String externalProcessId) {
                this.externalProcessId = externalProcessId;
                return this;
            }

            /**
             * <p>The list of mappings between system fields and external approval form controls.</p>
             */
            public Builder fieldMap(java.util.List<DlpSendPoliciesFieldMap> fieldMap) {
                this.fieldMap = fieldMap;
                return this;
            }

            /**
             * <p>The list of outbound file transfer policy IDs.</p>
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * <p>The ID of the approval template.</p>
             * 
             * <strong>example:</strong>
             * <p>approval-schema-090134f1ebff****</p>
             */
            public Builder schemaId(String schemaId) {
                this.schemaId = schemaId;
                return this;
            }

            public DlpSendPolicies build() {
                return new DlpSendPolicies(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>GetApprovalProcessResponseBody</p>
     */
    public static class DomainBlacklistPoliciesFieldMap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayField")
        private String displayField;

        @com.aliyun.core.annotation.NameInMap("DisplayFieldValue")
        private String displayFieldValue;

        @com.aliyun.core.annotation.NameInMap("SystemField")
        private String systemField;

        private DomainBlacklistPoliciesFieldMap(Builder builder) {
            this.displayField = builder.displayField;
            this.displayFieldValue = builder.displayFieldValue;
            this.systemField = builder.systemField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainBlacklistPoliciesFieldMap create() {
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

            private Builder(DomainBlacklistPoliciesFieldMap model) {
                this.displayField = model.displayField;
                this.displayFieldValue = model.displayFieldValue;
                this.systemField = model.systemField;
            } 

            /**
             * <p>The name of the control in the external approval form.</p>
             * 
             * <strong>example:</strong>
             * <p>Reported access website</p>
             */
            public Builder displayField(String displayField) {
                this.displayField = displayField;
                return this;
            }

            /**
             * <p>The identifier of the control in the external approval form. DingTalk approval returns the control label. WeCom and Lark approvals return the value in the &quot;Control type%%%Control ID&quot; format.</p>
             * 
             * <strong>example:</strong>
             * <p>Textarea%%%widget-1a2b****</p>
             */
            public Builder displayFieldValue(String displayFieldValue) {
                this.displayFieldValue = displayFieldValue;
                return this;
            }

            /**
             * <p>The identifier of the system field, such as reportDomain.</p>
             * 
             * <strong>example:</strong>
             * <p>reportDomain</p>
             */
            public Builder systemField(String systemField) {
                this.systemField = systemField;
                return this;
            }

            public DomainBlacklistPoliciesFieldMap build() {
                return new DomainBlacklistPoliciesFieldMap(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>GetApprovalProcessResponseBody</p>
     */
    public static class DomainBlacklistPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalProcessId")
        private String externalProcessId;

        @com.aliyun.core.annotation.NameInMap("FieldMap")
        private java.util.List<DomainBlacklistPoliciesFieldMap> fieldMap;

        @com.aliyun.core.annotation.NameInMap("PolicyIds")
        private java.util.List<String> policyIds;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        private DomainBlacklistPolicies(Builder builder) {
            this.externalProcessId = builder.externalProcessId;
            this.fieldMap = builder.fieldMap;
            this.policyIds = builder.policyIds;
            this.schemaId = builder.schemaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainBlacklistPolicies create() {
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
        public java.util.List<DomainBlacklistPoliciesFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        /**
         * @return policyIds
         */
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        /**
         * @return schemaId
         */
        public String getSchemaId() {
            return this.schemaId;
        }

        public static final class Builder {
            private String externalProcessId; 
            private java.util.List<DomainBlacklistPoliciesFieldMap> fieldMap; 
            private java.util.List<String> policyIds; 
            private String schemaId; 

            private Builder() {
            } 

            private Builder(DomainBlacklistPolicies model) {
                this.externalProcessId = model.externalProcessId;
                this.fieldMap = model.fieldMap;
                this.policyIds = model.policyIds;
                this.schemaId = model.schemaId;
            } 

            /**
             * <p>The ID of the external approval process. If the approval type is 1 (DingTalk approval), this parameter corresponds to the DingTalk process code. If the approval type is 2 (WeCom approval), this parameter corresponds to the template ID. If the approval type is 3 (Lark approval), this parameter corresponds to the approval definition code. If the approval type is 0 (built-in approval), this parameter is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>PROC-1a2b3c4d5e6f****</p>
             */
            public Builder externalProcessId(String externalProcessId) {
                this.externalProcessId = externalProcessId;
                return this;
            }

            /**
             * <p>The list of mappings between system fields and external approval form controls.</p>
             */
            public Builder fieldMap(java.util.List<DomainBlacklistPoliciesFieldMap> fieldMap) {
                this.fieldMap = fieldMap;
                return this;
            }

            /**
             * <p>The list of domain name blacklist policy IDs.</p>
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * <p>The ID of the approval template.</p>
             * 
             * <strong>example:</strong>
             * <p>approval-schema-090134f1ebff****</p>
             */
            public Builder schemaId(String schemaId) {
                this.schemaId = schemaId;
                return this;
            }

            public DomainBlacklistPolicies build() {
                return new DomainBlacklistPolicies(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>GetApprovalProcessResponseBody</p>
     */
    public static class DomainWhitelistPoliciesFieldMap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayField")
        private String displayField;

        @com.aliyun.core.annotation.NameInMap("DisplayFieldValue")
        private String displayFieldValue;

        @com.aliyun.core.annotation.NameInMap("SystemField")
        private String systemField;

        private DomainWhitelistPoliciesFieldMap(Builder builder) {
            this.displayField = builder.displayField;
            this.displayFieldValue = builder.displayFieldValue;
            this.systemField = builder.systemField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainWhitelistPoliciesFieldMap create() {
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

            private Builder(DomainWhitelistPoliciesFieldMap model) {
                this.displayField = model.displayField;
                this.displayFieldValue = model.displayFieldValue;
                this.systemField = model.systemField;
            } 

            /**
             * <p>The name of the control in the external approval form.</p>
             * 
             * <strong>example:</strong>
             * <p>Reported access website</p>
             */
            public Builder displayField(String displayField) {
                this.displayField = displayField;
                return this;
            }

            /**
             * <p>The identifier of the control in the external approval form. DingTalk approval returns the control label. WeCom and Lark approvals return the value in the &quot;Control type%%%Control ID&quot; format.</p>
             * 
             * <strong>example:</strong>
             * <p>Textarea%%%widget-1a2b****</p>
             */
            public Builder displayFieldValue(String displayFieldValue) {
                this.displayFieldValue = displayFieldValue;
                return this;
            }

            /**
             * <p>The identifier of the system field, such as reportDomain.</p>
             * 
             * <strong>example:</strong>
             * <p>reportDomain</p>
             */
            public Builder systemField(String systemField) {
                this.systemField = systemField;
                return this;
            }

            public DomainWhitelistPoliciesFieldMap build() {
                return new DomainWhitelistPoliciesFieldMap(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>GetApprovalProcessResponseBody</p>
     */
    public static class DomainWhitelistPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalProcessId")
        private String externalProcessId;

        @com.aliyun.core.annotation.NameInMap("FieldMap")
        private java.util.List<DomainWhitelistPoliciesFieldMap> fieldMap;

        @com.aliyun.core.annotation.NameInMap("PolicyIds")
        private java.util.List<String> policyIds;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        private DomainWhitelistPolicies(Builder builder) {
            this.externalProcessId = builder.externalProcessId;
            this.fieldMap = builder.fieldMap;
            this.policyIds = builder.policyIds;
            this.schemaId = builder.schemaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainWhitelistPolicies create() {
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
        public java.util.List<DomainWhitelistPoliciesFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        /**
         * @return policyIds
         */
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        /**
         * @return schemaId
         */
        public String getSchemaId() {
            return this.schemaId;
        }

        public static final class Builder {
            private String externalProcessId; 
            private java.util.List<DomainWhitelistPoliciesFieldMap> fieldMap; 
            private java.util.List<String> policyIds; 
            private String schemaId; 

            private Builder() {
            } 

            private Builder(DomainWhitelistPolicies model) {
                this.externalProcessId = model.externalProcessId;
                this.fieldMap = model.fieldMap;
                this.policyIds = model.policyIds;
                this.schemaId = model.schemaId;
            } 

            /**
             * <p>The ID of the external approval process. If the approval type is 1 (DingTalk approval), this parameter corresponds to the DingTalk process code. If the approval type is 2 (WeCom approval), this parameter corresponds to the template ID. If the approval type is 3 (Lark approval), this parameter corresponds to the approval definition code. If the approval type is 0 (built-in approval), this parameter is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>PROC-1a2b3c4d5e6f****</p>
             */
            public Builder externalProcessId(String externalProcessId) {
                this.externalProcessId = externalProcessId;
                return this;
            }

            /**
             * <p>The list of mappings between system fields and external approval form controls.</p>
             */
            public Builder fieldMap(java.util.List<DomainWhitelistPoliciesFieldMap> fieldMap) {
                this.fieldMap = fieldMap;
                return this;
            }

            /**
             * <p>The list of domain name whitelist policy IDs.</p>
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * <p>The ID of the approval template.</p>
             * 
             * <strong>example:</strong>
             * <p>approval-schema-090134f1ebff****</p>
             */
            public Builder schemaId(String schemaId) {
                this.schemaId = schemaId;
                return this;
            }

            public DomainWhitelistPolicies build() {
                return new DomainWhitelistPolicies(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>GetApprovalProcessResponseBody</p>
     */
    public static class EndpointHardeningPoliciesFieldMap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayField")
        private String displayField;

        @com.aliyun.core.annotation.NameInMap("DisplayFieldValue")
        private String displayFieldValue;

        @com.aliyun.core.annotation.NameInMap("SystemField")
        private String systemField;

        private EndpointHardeningPoliciesFieldMap(Builder builder) {
            this.displayField = builder.displayField;
            this.displayFieldValue = builder.displayFieldValue;
            this.systemField = builder.systemField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndpointHardeningPoliciesFieldMap create() {
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

            private Builder(EndpointHardeningPoliciesFieldMap model) {
                this.displayField = model.displayField;
                this.displayFieldValue = model.displayFieldValue;
                this.systemField = model.systemField;
            } 

            /**
             * <p>The name of the control in the external approval form.</p>
             * 
             * <strong>example:</strong>
             * <p>Process name</p>
             */
            public Builder displayField(String displayField) {
                this.displayField = displayField;
                return this;
            }

            /**
             * <p>The identifier of the control in the external approval form. DingTalk approval returns the control label. WeCom and Lark approvals return the value in the &quot;Control type%%%Control ID&quot; format.</p>
             * 
             * <strong>example:</strong>
             * <p>Textarea%%%widget-1a2b****</p>
             */
            public Builder displayFieldValue(String displayFieldValue) {
                this.displayFieldValue = displayFieldValue;
                return this;
            }

            /**
             * <p>The system field identifier, such as processName.</p>
             * 
             * <strong>example:</strong>
             * <p>processName</p>
             */
            public Builder systemField(String systemField) {
                this.systemField = systemField;
                return this;
            }

            public EndpointHardeningPoliciesFieldMap build() {
                return new EndpointHardeningPoliciesFieldMap(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>GetApprovalProcessResponseBody</p>
     */
    public static class EndpointHardeningPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalProcessId")
        private String externalProcessId;

        @com.aliyun.core.annotation.NameInMap("FieldMap")
        private java.util.List<EndpointHardeningPoliciesFieldMap> fieldMap;

        @com.aliyun.core.annotation.NameInMap("PolicyIds")
        private java.util.List<String> policyIds;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        private EndpointHardeningPolicies(Builder builder) {
            this.externalProcessId = builder.externalProcessId;
            this.fieldMap = builder.fieldMap;
            this.policyIds = builder.policyIds;
            this.schemaId = builder.schemaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndpointHardeningPolicies create() {
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
        public java.util.List<EndpointHardeningPoliciesFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        /**
         * @return policyIds
         */
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        /**
         * @return schemaId
         */
        public String getSchemaId() {
            return this.schemaId;
        }

        public static final class Builder {
            private String externalProcessId; 
            private java.util.List<EndpointHardeningPoliciesFieldMap> fieldMap; 
            private java.util.List<String> policyIds; 
            private String schemaId; 

            private Builder() {
            } 

            private Builder(EndpointHardeningPolicies model) {
                this.externalProcessId = model.externalProcessId;
                this.fieldMap = model.fieldMap;
                this.policyIds = model.policyIds;
                this.schemaId = model.schemaId;
            } 

            /**
             * <p>The ID of the external approval process. If the approval type is 1 (DingTalk approval), this parameter corresponds to the DingTalk process code. If the approval type is 2 (WeCom approval), this parameter corresponds to the template ID. If the approval type is 3 (Lark approval), this parameter corresponds to the approval definition code. If the approval type is 0 (built-in approval), this parameter is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>PROC-1a2b3c4d5e6f****</p>
             */
            public Builder externalProcessId(String externalProcessId) {
                this.externalProcessId = externalProcessId;
                return this;
            }

            /**
             * <p>The list of mappings between system fields and external approval form controls.</p>
             */
            public Builder fieldMap(java.util.List<EndpointHardeningPoliciesFieldMap> fieldMap) {
                this.fieldMap = fieldMap;
                return this;
            }

            /**
             * <p>The list of endpoint hardening policy IDs.</p>
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * <p>The ID of the approval template.</p>
             * 
             * <strong>example:</strong>
             * <p>approval-schema-090134f1ebff****</p>
             */
            public Builder schemaId(String schemaId) {
                this.schemaId = schemaId;
                return this;
            }

            public EndpointHardeningPolicies build() {
                return new EndpointHardeningPolicies(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>GetApprovalProcessResponseBody</p>
     */
    public static class PeripheralBlockPoliciesFieldMap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayField")
        private String displayField;

        @com.aliyun.core.annotation.NameInMap("DisplayFieldValue")
        private String displayFieldValue;

        @com.aliyun.core.annotation.NameInMap("SystemField")
        private String systemField;

        private PeripheralBlockPoliciesFieldMap(Builder builder) {
            this.displayField = builder.displayField;
            this.displayFieldValue = builder.displayFieldValue;
            this.systemField = builder.systemField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PeripheralBlockPoliciesFieldMap create() {
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

            private Builder(PeripheralBlockPoliciesFieldMap model) {
                this.displayField = model.displayField;
                this.displayFieldValue = model.displayFieldValue;
                this.systemField = model.systemField;
            } 

            /**
             * <p>The name of the control in the external approval form.</p>
             * 
             * <strong>example:</strong>
             * <p>Operating system</p>
             */
            public Builder displayField(String displayField) {
                this.displayField = displayField;
                return this;
            }

            /**
             * <p>The identifier of the control in the external approval form. DingTalk approval returns the control label. WeCom and Lark approvals return the value in the &quot;Control type%%%Control ID&quot; format.</p>
             * 
             * <strong>example:</strong>
             * <p>Textarea%%%widget-1a2b****</p>
             */
            public Builder displayFieldValue(String displayFieldValue) {
                this.displayFieldValue = displayFieldValue;
                return this;
            }

            /**
             * <p>The system field identifier, such as devType.</p>
             * 
             * <strong>example:</strong>
             * <p>devType</p>
             */
            public Builder systemField(String systemField) {
                this.systemField = systemField;
                return this;
            }

            public PeripheralBlockPoliciesFieldMap build() {
                return new PeripheralBlockPoliciesFieldMap(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>GetApprovalProcessResponseBody</p>
     */
    public static class PeripheralBlockPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalProcessId")
        private String externalProcessId;

        @com.aliyun.core.annotation.NameInMap("FieldMap")
        private java.util.List<PeripheralBlockPoliciesFieldMap> fieldMap;

        @com.aliyun.core.annotation.NameInMap("PolicyIds")
        private java.util.List<String> policyIds;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        private PeripheralBlockPolicies(Builder builder) {
            this.externalProcessId = builder.externalProcessId;
            this.fieldMap = builder.fieldMap;
            this.policyIds = builder.policyIds;
            this.schemaId = builder.schemaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PeripheralBlockPolicies create() {
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
        public java.util.List<PeripheralBlockPoliciesFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        /**
         * @return policyIds
         */
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        /**
         * @return schemaId
         */
        public String getSchemaId() {
            return this.schemaId;
        }

        public static final class Builder {
            private String externalProcessId; 
            private java.util.List<PeripheralBlockPoliciesFieldMap> fieldMap; 
            private java.util.List<String> policyIds; 
            private String schemaId; 

            private Builder() {
            } 

            private Builder(PeripheralBlockPolicies model) {
                this.externalProcessId = model.externalProcessId;
                this.fieldMap = model.fieldMap;
                this.policyIds = model.policyIds;
                this.schemaId = model.schemaId;
            } 

            /**
             * <p>The ID of the external approval process. If the approval type is 1 (DingTalk approval), this parameter corresponds to the DingTalk process code. If the approval type is 2 (WeCom approval), this parameter corresponds to the template ID. If the approval type is 3 (Lark approval), this parameter corresponds to the approval definition code. If the approval type is 0 (built-in approval), this parameter is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>PROC-1a2b3c4d5e6f****</p>
             */
            public Builder externalProcessId(String externalProcessId) {
                this.externalProcessId = externalProcessId;
                return this;
            }

            /**
             * <p>The list of mappings between system fields and external approval form controls.</p>
             */
            public Builder fieldMap(java.util.List<PeripheralBlockPoliciesFieldMap> fieldMap) {
                this.fieldMap = fieldMap;
                return this;
            }

            /**
             * <p>The list of peripheral control policy IDs.</p>
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * <p>The ID of the approval template.</p>
             * 
             * <strong>example:</strong>
             * <p>approval-schema-090134f1ebff****</p>
             */
            public Builder schemaId(String schemaId) {
                this.schemaId = schemaId;
                return this;
            }

            public PeripheralBlockPolicies build() {
                return new PeripheralBlockPolicies(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>GetApprovalProcessResponseBody</p>
     */
    public static class PrivateAccessBlockPoliciesFieldMap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayField")
        private String displayField;

        @com.aliyun.core.annotation.NameInMap("DisplayFieldValue")
        private String displayFieldValue;

        @com.aliyun.core.annotation.NameInMap("SystemField")
        private String systemField;

        private PrivateAccessBlockPoliciesFieldMap(Builder builder) {
            this.displayField = builder.displayField;
            this.displayFieldValue = builder.displayFieldValue;
            this.systemField = builder.systemField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateAccessBlockPoliciesFieldMap create() {
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

            private Builder(PrivateAccessBlockPoliciesFieldMap model) {
                this.displayField = model.displayField;
                this.displayFieldValue = model.displayFieldValue;
                this.systemField = model.systemField;
            } 

            /**
             * <p>The name of the control in the external approval form.</p>
             * 
             * <strong>example:</strong>
             * <p>Application ID</p>
             */
            public Builder displayField(String displayField) {
                this.displayField = displayField;
                return this;
            }

            /**
             * <p>The identifier of the control in the external approval form. DingTalk approval returns the control label. WeCom and Lark approvals return the value in the &quot;Control type%%%Control ID&quot; format.</p>
             * 
             * <strong>example:</strong>
             * <p>Textarea%%%widget-1a2b****</p>
             */
            public Builder displayFieldValue(String displayFieldValue) {
                this.displayFieldValue = displayFieldValue;
                return this;
            }

            /**
             * <p>The system field identifier, such as applicationId.</p>
             * 
             * <strong>example:</strong>
             * <p>applicationId</p>
             */
            public Builder systemField(String systemField) {
                this.systemField = systemField;
                return this;
            }

            public PrivateAccessBlockPoliciesFieldMap build() {
                return new PrivateAccessBlockPoliciesFieldMap(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>GetApprovalProcessResponseBody</p>
     */
    public static class PrivateAccessBlockPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalProcessId")
        private String externalProcessId;

        @com.aliyun.core.annotation.NameInMap("FieldMap")
        private java.util.List<PrivateAccessBlockPoliciesFieldMap> fieldMap;

        @com.aliyun.core.annotation.NameInMap("PolicyIds")
        private java.util.List<String> policyIds;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        private PrivateAccessBlockPolicies(Builder builder) {
            this.externalProcessId = builder.externalProcessId;
            this.fieldMap = builder.fieldMap;
            this.policyIds = builder.policyIds;
            this.schemaId = builder.schemaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateAccessBlockPolicies create() {
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
        public java.util.List<PrivateAccessBlockPoliciesFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        /**
         * @return policyIds
         */
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        /**
         * @return schemaId
         */
        public String getSchemaId() {
            return this.schemaId;
        }

        public static final class Builder {
            private String externalProcessId; 
            private java.util.List<PrivateAccessBlockPoliciesFieldMap> fieldMap; 
            private java.util.List<String> policyIds; 
            private String schemaId; 

            private Builder() {
            } 

            private Builder(PrivateAccessBlockPolicies model) {
                this.externalProcessId = model.externalProcessId;
                this.fieldMap = model.fieldMap;
                this.policyIds = model.policyIds;
                this.schemaId = model.schemaId;
            } 

            /**
             * <p>The ID of the external approval process. If the approval type is 1 (DingTalk approval), this parameter corresponds to the DingTalk process code. If the approval type is 2 (WeCom approval), this parameter corresponds to the template ID. If the approval type is 3 (Lark approval), this parameter corresponds to the approval definition code. If the approval type is 0 (built-in approval), this parameter is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>PROC-1a2b3c4d5e6f****</p>
             */
            public Builder externalProcessId(String externalProcessId) {
                this.externalProcessId = externalProcessId;
                return this;
            }

            /**
             * <p>The list of mappings between system fields and external approval form controls.</p>
             */
            public Builder fieldMap(java.util.List<PrivateAccessBlockPoliciesFieldMap> fieldMap) {
                this.fieldMap = fieldMap;
                return this;
            }

            /**
             * <p>The list of internal network access control policy IDs.</p>
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * <p>The ID of the approval template.</p>
             * 
             * <strong>example:</strong>
             * <p>approval-schema-090134f1ebff****</p>
             */
            public Builder schemaId(String schemaId) {
                this.schemaId = schemaId;
                return this;
            }

            public PrivateAccessBlockPolicies build() {
                return new PrivateAccessBlockPolicies(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>GetApprovalProcessResponseBody</p>
     */
    public static class ProcessNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SaseUserId")
        private String saseUserId;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private ProcessNodes(Builder builder) {
            this.saseUserId = builder.saseUserId;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProcessNodes create() {
            return builder().build();
        }

        /**
         * @return saseUserId
         */
        public String getSaseUserId() {
            return this.saseUserId;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String saseUserId; 
            private String username; 

            private Builder() {
            } 

            private Builder(ProcessNodes model) {
                this.saseUserId = model.saseUserId;
                this.username = model.username;
            } 

            /**
             * <p>The ID of the approver.</p>
             * 
             * <strong>example:</strong>
             * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
             */
            public Builder saseUserId(String saseUserId) {
                this.saseUserId = saseUserId;
                return this;
            }

            /**
             * <p>The username of the approver.</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public ProcessNodes build() {
                return new ProcessNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>GetApprovalProcessResponseBody</p>
     */
    public static class SoftwareBlockPoliciesFieldMap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayField")
        private String displayField;

        @com.aliyun.core.annotation.NameInMap("DisplayFieldValue")
        private String displayFieldValue;

        @com.aliyun.core.annotation.NameInMap("SystemField")
        private String systemField;

        private SoftwareBlockPoliciesFieldMap(Builder builder) {
            this.displayField = builder.displayField;
            this.displayFieldValue = builder.displayFieldValue;
            this.systemField = builder.systemField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SoftwareBlockPoliciesFieldMap create() {
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

            private Builder(SoftwareBlockPoliciesFieldMap model) {
                this.displayField = model.displayField;
                this.displayFieldValue = model.displayFieldValue;
                this.systemField = model.systemField;
            } 

            /**
             * <p>The name of the control in the external approval form.</p>
             * 
             * <strong>example:</strong>
             * <p>Reported software</p>
             */
            public Builder displayField(String displayField) {
                this.displayField = displayField;
                return this;
            }

            /**
             * <p>The identifier of the control in the external approval form. DingTalk approval returns the control label. WeCom and Lark approvals return the value in the &quot;Control type%%%Control ID&quot; format.</p>
             * 
             * <strong>example:</strong>
             * <p>Textarea%%%widget-1a2b****</p>
             */
            public Builder displayFieldValue(String displayFieldValue) {
                this.displayFieldValue = displayFieldValue;
                return this;
            }

            /**
             * <p>The identifier of the system field, such as softwareName.</p>
             * 
             * <strong>example:</strong>
             * <p>softwareName</p>
             */
            public Builder systemField(String systemField) {
                this.systemField = systemField;
                return this;
            }

            public SoftwareBlockPoliciesFieldMap build() {
                return new SoftwareBlockPoliciesFieldMap(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>GetApprovalProcessResponseBody</p>
     */
    public static class SoftwareBlockPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalProcessId")
        private String externalProcessId;

        @com.aliyun.core.annotation.NameInMap("FieldMap")
        private java.util.List<SoftwareBlockPoliciesFieldMap> fieldMap;

        @com.aliyun.core.annotation.NameInMap("PolicyIds")
        private java.util.List<String> policyIds;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        private SoftwareBlockPolicies(Builder builder) {
            this.externalProcessId = builder.externalProcessId;
            this.fieldMap = builder.fieldMap;
            this.policyIds = builder.policyIds;
            this.schemaId = builder.schemaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SoftwareBlockPolicies create() {
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
        public java.util.List<SoftwareBlockPoliciesFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        /**
         * @return policyIds
         */
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        /**
         * @return schemaId
         */
        public String getSchemaId() {
            return this.schemaId;
        }

        public static final class Builder {
            private String externalProcessId; 
            private java.util.List<SoftwareBlockPoliciesFieldMap> fieldMap; 
            private java.util.List<String> policyIds; 
            private String schemaId; 

            private Builder() {
            } 

            private Builder(SoftwareBlockPolicies model) {
                this.externalProcessId = model.externalProcessId;
                this.fieldMap = model.fieldMap;
                this.policyIds = model.policyIds;
                this.schemaId = model.schemaId;
            } 

            /**
             * <p>The ID of the external approval process. If the approval type is 1 (DingTalk approval), this parameter corresponds to the DingTalk process code. If the approval type is 2 (WeCom approval), this parameter corresponds to the template ID. If the approval type is 3 (Lark approval), this parameter corresponds to the approval definition code. If the approval type is 0 (built-in approval), this parameter is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>PROC-1a2b3c4d5e6f****</p>
             */
            public Builder externalProcessId(String externalProcessId) {
                this.externalProcessId = externalProcessId;
                return this;
            }

            /**
             * <p>The list of mappings between system fields and external approval form controls.</p>
             */
            public Builder fieldMap(java.util.List<SoftwareBlockPoliciesFieldMap> fieldMap) {
                this.fieldMap = fieldMap;
                return this;
            }

            /**
             * <p>The list of software blocking policy IDs.</p>
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * <p>The ID of the approval template.</p>
             * 
             * <strong>example:</strong>
             * <p>approval-schema-090134f1ebff****</p>
             */
            public Builder schemaId(String schemaId) {
                this.schemaId = schemaId;
                return this;
            }

            public SoftwareBlockPolicies build() {
                return new SoftwareBlockPolicies(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>GetApprovalProcessResponseBody</p>
     */
    public static class SoftwareHardeningPoliciesFieldMap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayField")
        private String displayField;

        @com.aliyun.core.annotation.NameInMap("DisplayFieldValue")
        private String displayFieldValue;

        @com.aliyun.core.annotation.NameInMap("SystemField")
        private String systemField;

        private SoftwareHardeningPoliciesFieldMap(Builder builder) {
            this.displayField = builder.displayField;
            this.displayFieldValue = builder.displayFieldValue;
            this.systemField = builder.systemField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SoftwareHardeningPoliciesFieldMap create() {
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

            private Builder(SoftwareHardeningPoliciesFieldMap model) {
                this.displayField = model.displayField;
                this.displayFieldValue = model.displayFieldValue;
                this.systemField = model.systemField;
            } 

            /**
             * <p>The name of the control in the external approval form.</p>
             * 
             * <strong>example:</strong>
             * <p>Process name</p>
             */
            public Builder displayField(String displayField) {
                this.displayField = displayField;
                return this;
            }

            /**
             * <p>The identifier of the control in the external approval form. DingTalk approval returns the control label. WeCom and Lark approvals return the value in the &quot;Control type%%%Control ID&quot; format.</p>
             * 
             * <strong>example:</strong>
             * <p>Textarea%%%widget-1a2b****</p>
             */
            public Builder displayFieldValue(String displayFieldValue) {
                this.displayFieldValue = displayFieldValue;
                return this;
            }

            /**
             * <p>The system field identifier, such as processName.</p>
             * 
             * <strong>example:</strong>
             * <p>processName</p>
             */
            public Builder systemField(String systemField) {
                this.systemField = systemField;
                return this;
            }

            public SoftwareHardeningPoliciesFieldMap build() {
                return new SoftwareHardeningPoliciesFieldMap(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>GetApprovalProcessResponseBody</p>
     */
    public static class SoftwareHardeningPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalProcessId")
        private String externalProcessId;

        @com.aliyun.core.annotation.NameInMap("FieldMap")
        private java.util.List<SoftwareHardeningPoliciesFieldMap> fieldMap;

        @com.aliyun.core.annotation.NameInMap("PolicyIds")
        private java.util.List<String> policyIds;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        private SoftwareHardeningPolicies(Builder builder) {
            this.externalProcessId = builder.externalProcessId;
            this.fieldMap = builder.fieldMap;
            this.policyIds = builder.policyIds;
            this.schemaId = builder.schemaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SoftwareHardeningPolicies create() {
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
        public java.util.List<SoftwareHardeningPoliciesFieldMap> getFieldMap() {
            return this.fieldMap;
        }

        /**
         * @return policyIds
         */
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        /**
         * @return schemaId
         */
        public String getSchemaId() {
            return this.schemaId;
        }

        public static final class Builder {
            private String externalProcessId; 
            private java.util.List<SoftwareHardeningPoliciesFieldMap> fieldMap; 
            private java.util.List<String> policyIds; 
            private String schemaId; 

            private Builder() {
            } 

            private Builder(SoftwareHardeningPolicies model) {
                this.externalProcessId = model.externalProcessId;
                this.fieldMap = model.fieldMap;
                this.policyIds = model.policyIds;
                this.schemaId = model.schemaId;
            } 

            /**
             * <p>The ID of the external approval process. If the approval type is 1 (DingTalk approval), this parameter corresponds to the DingTalk process code. If the approval type is 2 (WeCom approval), this parameter corresponds to the template ID. If the approval type is 3 (Lark approval), this parameter corresponds to the approval definition code. If the approval type is 0 (built-in approval), this parameter is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>PROC-1a2b3c4d5e6f****</p>
             */
            public Builder externalProcessId(String externalProcessId) {
                this.externalProcessId = externalProcessId;
                return this;
            }

            /**
             * <p>The list of mappings between system fields and external approval form controls.</p>
             */
            public Builder fieldMap(java.util.List<SoftwareHardeningPoliciesFieldMap> fieldMap) {
                this.fieldMap = fieldMap;
                return this;
            }

            /**
             * <p>The list of software hardening policy IDs.</p>
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * <p>The ID of the approval template.</p>
             * 
             * <strong>example:</strong>
             * <p>approval-schema-090134f1ebff****</p>
             */
            public Builder schemaId(String schemaId) {
                this.schemaId = schemaId;
                return this;
            }

            public SoftwareHardeningPolicies build() {
                return new SoftwareHardeningPolicies(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>GetApprovalProcessResponseBody</p>
     */
    public static class Process extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppUninstallPolicies")
        private AppUninstallPolicies appUninstallPolicies;

        @com.aliyun.core.annotation.NameInMap("ApprovalType")
        private Integer approvalType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DeviceRegistrationPolicies")
        private DeviceRegistrationPolicies deviceRegistrationPolicies;

        @com.aliyun.core.annotation.NameInMap("DlpSendPolicies")
        private DlpSendPolicies dlpSendPolicies;

        @com.aliyun.core.annotation.NameInMap("DomainBlacklistPolicies")
        private DomainBlacklistPolicies domainBlacklistPolicies;

        @com.aliyun.core.annotation.NameInMap("DomainWhitelistPolicies")
        private DomainWhitelistPolicies domainWhitelistPolicies;

        @com.aliyun.core.annotation.NameInMap("EndpointHardeningPolicies")
        private EndpointHardeningPolicies endpointHardeningPolicies;

        @com.aliyun.core.annotation.NameInMap("EventLabel")
        private String eventLabel;

        @com.aliyun.core.annotation.NameInMap("ExternalConfig")
        private String externalConfig;

        @com.aliyun.core.annotation.NameInMap("PeripheralBlockPolicies")
        private PeripheralBlockPolicies peripheralBlockPolicies;

        @com.aliyun.core.annotation.NameInMap("PrivateAccessBlockPolicies")
        private PrivateAccessBlockPolicies privateAccessBlockPolicies;

        @com.aliyun.core.annotation.NameInMap("ProcessId")
        private String processId;

        @com.aliyun.core.annotation.NameInMap("ProcessName")
        private String processName;

        @com.aliyun.core.annotation.NameInMap("ProcessNodes")
        private java.util.List<java.util.List<ProcessNodes>> processNodes;

        @com.aliyun.core.annotation.NameInMap("SoftwareBlockPolicies")
        private SoftwareBlockPolicies softwareBlockPolicies;

        @com.aliyun.core.annotation.NameInMap("SoftwareHardeningPolicies")
        private SoftwareHardeningPolicies softwareHardeningPolicies;

        private Process(Builder builder) {
            this.appUninstallPolicies = builder.appUninstallPolicies;
            this.approvalType = builder.approvalType;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.deviceRegistrationPolicies = builder.deviceRegistrationPolicies;
            this.dlpSendPolicies = builder.dlpSendPolicies;
            this.domainBlacklistPolicies = builder.domainBlacklistPolicies;
            this.domainWhitelistPolicies = builder.domainWhitelistPolicies;
            this.endpointHardeningPolicies = builder.endpointHardeningPolicies;
            this.eventLabel = builder.eventLabel;
            this.externalConfig = builder.externalConfig;
            this.peripheralBlockPolicies = builder.peripheralBlockPolicies;
            this.privateAccessBlockPolicies = builder.privateAccessBlockPolicies;
            this.processId = builder.processId;
            this.processName = builder.processName;
            this.processNodes = builder.processNodes;
            this.softwareBlockPolicies = builder.softwareBlockPolicies;
            this.softwareHardeningPolicies = builder.softwareHardeningPolicies;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Process create() {
            return builder().build();
        }

        /**
         * @return appUninstallPolicies
         */
        public AppUninstallPolicies getAppUninstallPolicies() {
            return this.appUninstallPolicies;
        }

        /**
         * @return approvalType
         */
        public Integer getApprovalType() {
            return this.approvalType;
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
         * @return deviceRegistrationPolicies
         */
        public DeviceRegistrationPolicies getDeviceRegistrationPolicies() {
            return this.deviceRegistrationPolicies;
        }

        /**
         * @return dlpSendPolicies
         */
        public DlpSendPolicies getDlpSendPolicies() {
            return this.dlpSendPolicies;
        }

        /**
         * @return domainBlacklistPolicies
         */
        public DomainBlacklistPolicies getDomainBlacklistPolicies() {
            return this.domainBlacklistPolicies;
        }

        /**
         * @return domainWhitelistPolicies
         */
        public DomainWhitelistPolicies getDomainWhitelistPolicies() {
            return this.domainWhitelistPolicies;
        }

        /**
         * @return endpointHardeningPolicies
         */
        public EndpointHardeningPolicies getEndpointHardeningPolicies() {
            return this.endpointHardeningPolicies;
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
         * @return peripheralBlockPolicies
         */
        public PeripheralBlockPolicies getPeripheralBlockPolicies() {
            return this.peripheralBlockPolicies;
        }

        /**
         * @return privateAccessBlockPolicies
         */
        public PrivateAccessBlockPolicies getPrivateAccessBlockPolicies() {
            return this.privateAccessBlockPolicies;
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
        public java.util.List<java.util.List<ProcessNodes>> getProcessNodes() {
            return this.processNodes;
        }

        /**
         * @return softwareBlockPolicies
         */
        public SoftwareBlockPolicies getSoftwareBlockPolicies() {
            return this.softwareBlockPolicies;
        }

        /**
         * @return softwareHardeningPolicies
         */
        public SoftwareHardeningPolicies getSoftwareHardeningPolicies() {
            return this.softwareHardeningPolicies;
        }

        public static final class Builder {
            private AppUninstallPolicies appUninstallPolicies; 
            private Integer approvalType; 
            private String createTime; 
            private String description; 
            private DeviceRegistrationPolicies deviceRegistrationPolicies; 
            private DlpSendPolicies dlpSendPolicies; 
            private DomainBlacklistPolicies domainBlacklistPolicies; 
            private DomainWhitelistPolicies domainWhitelistPolicies; 
            private EndpointHardeningPolicies endpointHardeningPolicies; 
            private String eventLabel; 
            private String externalConfig; 
            private PeripheralBlockPolicies peripheralBlockPolicies; 
            private PrivateAccessBlockPolicies privateAccessBlockPolicies; 
            private String processId; 
            private String processName; 
            private java.util.List<java.util.List<ProcessNodes>> processNodes; 
            private SoftwareBlockPolicies softwareBlockPolicies; 
            private SoftwareHardeningPolicies softwareHardeningPolicies; 

            private Builder() {
            } 

            private Builder(Process model) {
                this.appUninstallPolicies = model.appUninstallPolicies;
                this.approvalType = model.approvalType;
                this.createTime = model.createTime;
                this.description = model.description;
                this.deviceRegistrationPolicies = model.deviceRegistrationPolicies;
                this.dlpSendPolicies = model.dlpSendPolicies;
                this.domainBlacklistPolicies = model.domainBlacklistPolicies;
                this.domainWhitelistPolicies = model.domainWhitelistPolicies;
                this.endpointHardeningPolicies = model.endpointHardeningPolicies;
                this.eventLabel = model.eventLabel;
                this.externalConfig = model.externalConfig;
                this.peripheralBlockPolicies = model.peripheralBlockPolicies;
                this.privateAccessBlockPolicies = model.privateAccessBlockPolicies;
                this.processId = model.processId;
                this.processName = model.processName;
                this.processNodes = model.processNodes;
                this.softwareBlockPolicies = model.softwareBlockPolicies;
                this.softwareHardeningPolicies = model.softwareHardeningPolicies;
            } 

            /**
             * <p>The list of associated endpoint uninstall policies.</p>
             */
            public Builder appUninstallPolicies(AppUninstallPolicies appUninstallPolicies) {
                this.appUninstallPolicies = appUninstallPolicies;
                return this;
            }

            /**
             * <p>The approval type. Valid values:</p>
             * <ul>
             * <li>0: Built-in approval.</li>
             * <li>1: DingTalk approval.</li>
             * <li>2: WeCom approval.</li>
             * <li>3: Lark approval.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder approvalType(Integer approvalType) {
                this.approvalType = approvalType;
                return this;
            }

            /**
             * <p>The time when the approval process was created. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-25 10:44:09</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the approval process.</p>
             * 
             * <strong>example:</strong>
             * <p>Approval flow for office network public domain name whitelist reporting.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The list of policies associated with device registration.</p>
             */
            public Builder deviceRegistrationPolicies(DeviceRegistrationPolicies deviceRegistrationPolicies) {
                this.deviceRegistrationPolicies = deviceRegistrationPolicies;
                return this;
            }

            /**
             * <p>The list of associated outbound file transfer policies.</p>
             */
            public Builder dlpSendPolicies(DlpSendPolicies dlpSendPolicies) {
                this.dlpSendPolicies = dlpSendPolicies;
                return this;
            }

            /**
             * <p>The list of policies associated with the domain name blacklist.</p>
             */
            public Builder domainBlacklistPolicies(DomainBlacklistPolicies domainBlacklistPolicies) {
                this.domainBlacklistPolicies = domainBlacklistPolicies;
                return this;
            }

            /**
             * <p>The list of policies associated with the domain name whitelist.</p>
             */
            public Builder domainWhitelistPolicies(DomainWhitelistPolicies domainWhitelistPolicies) {
                this.domainWhitelistPolicies = domainWhitelistPolicies;
                return this;
            }

            /**
             * <p>The list of associated endpoint hardening policies.</p>
             */
            public Builder endpointHardeningPolicies(EndpointHardeningPolicies endpointHardeningPolicies) {
                this.endpointHardeningPolicies = endpointHardeningPolicies;
                return this;
            }

            /**
             * <p>The event callback URL. When the approval type is 1 (DingTalk approval) or 3 (Lark approval), this parameter returns the complete event callback URL of the external platform. For other approval types, this parameter is empty.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://callback.example.com/sase/api/v1/approval/dingtalk/callback/approval-event-1a2b">https://callback.example.com/sase/api/v1/approval/dingtalk/callback/approval-event-1a2b</a>****</p>
             */
            public Builder eventLabel(String eventLabel) {
                this.eventLabel = eventLabel;
                return this;
            }

            /**
             * <p>The external approval configuration. When the approval type is 1 (DingTalk approval) or 3 (Lark approval), this parameter includes the integration configuration for the external approval platform, including appKey, appSecret, eventVerifyToken, and eventAesKey. For other approval types, this parameter is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;appKey&quot;:&quot;dingabc1234****&quot;,&quot;appSecret&quot;:&quot;a1b2c3d4****&quot;,&quot;eventVerifyToken&quot;:&quot;e5f6a7b8****&quot;,&quot;eventAesKey&quot;:&quot;c9d0e1f2****&quot;}</p>
             */
            public Builder externalConfig(String externalConfig) {
                this.externalConfig = externalConfig;
                return this;
            }

            /**
             * <p>The list of associated peripheral control policies.</p>
             */
            public Builder peripheralBlockPolicies(PeripheralBlockPolicies peripheralBlockPolicies) {
                this.peripheralBlockPolicies = peripheralBlockPolicies;
                return this;
            }

            /**
             * <p>The list of policies associated with internal network access control.</p>
             */
            public Builder privateAccessBlockPolicies(PrivateAccessBlockPolicies privateAccessBlockPolicies) {
                this.privateAccessBlockPolicies = privateAccessBlockPolicies;
                return this;
            }

            /**
             * <p>The ID of the approval process.</p>
             * 
             * <strong>example:</strong>
             * <p>approval-process-35ee09077ee9****</p>
             */
            public Builder processId(String processId) {
                this.processId = processId;
                return this;
            }

            /**
             * <p>The name of the approval process.</p>
             * 
             * <strong>example:</strong>
             * <p>Office network public domain name whitelist approval</p>
             */
            public Builder processName(String processName) {
                this.processName = processName;
                return this;
            }

            /**
             * <p>The list of approval nodes.</p>
             */
            public Builder processNodes(java.util.List<java.util.List<ProcessNodes>> processNodes) {
                this.processNodes = processNodes;
                return this;
            }

            /**
             * <p>The list of policies associated with software blocking.</p>
             */
            public Builder softwareBlockPolicies(SoftwareBlockPolicies softwareBlockPolicies) {
                this.softwareBlockPolicies = softwareBlockPolicies;
                return this;
            }

            /**
             * <p>The list of associated software hardening policies.</p>
             */
            public Builder softwareHardeningPolicies(SoftwareHardeningPolicies softwareHardeningPolicies) {
                this.softwareHardeningPolicies = softwareHardeningPolicies;
                return this;
            }

            public Process build() {
                return new Process(this);
            } 

        } 

    }
}
