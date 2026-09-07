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
 * {@link ListApprovalProcessesResponseBody} extends {@link TeaModel}
 *
 * <p>ListApprovalProcessesResponseBody</p>
 */
public class ListApprovalProcessesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Processes")
    private java.util.List<Processes> processes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private String totalNum;

    private ListApprovalProcessesResponseBody(Builder builder) {
        this.processes = builder.processes;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApprovalProcessesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return processes
     */
    public java.util.List<Processes> getProcesses() {
        return this.processes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNum
     */
    public String getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private java.util.List<Processes> processes; 
        private String requestId; 
        private String totalNum; 

        private Builder() {
        } 

        private Builder(ListApprovalProcessesResponseBody model) {
            this.processes = model.processes;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
        } 

        /**
         * <p>The list of approval processes.</p>
         */
        public Builder processes(java.util.List<Processes> processes) {
            this.processes = processes;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7E39C33B-F565-55C6-ACC2-953FCE7DA7D6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of approval processes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalNum(String totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public ListApprovalProcessesResponseBody build() {
            return new ListApprovalProcessesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApprovalProcessesResponseBody} extends {@link TeaModel}
     *
     * <p>ListApprovalProcessesResponseBody</p>
     */
    public static class AppUninstallPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolicyIds")
        private java.util.List<String> policyIds;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        private AppUninstallPolicies(Builder builder) {
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
            private java.util.List<String> policyIds; 
            private String schemaId; 

            private Builder() {
            } 

            private Builder(AppUninstallPolicies model) {
                this.policyIds = model.policyIds;
                this.schemaId = model.schemaId;
            } 

            /**
             * <p>The list of agent uninstallation policy IDs.</p>
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * <p>The approval template ID.</p>
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
     * {@link ListApprovalProcessesResponseBody} extends {@link TeaModel}
     *
     * <p>ListApprovalProcessesResponseBody</p>
     */
    public static class DeviceRegistrationPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolicyIds")
        private java.util.List<String> policyIds;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        private DeviceRegistrationPolicies(Builder builder) {
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
            private java.util.List<String> policyIds; 
            private String schemaId; 

            private Builder() {
            } 

            private Builder(DeviceRegistrationPolicies model) {
                this.policyIds = model.policyIds;
                this.schemaId = model.schemaId;
            } 

            /**
             * <p>The list of device registration policy IDs.</p>
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * <p>The approval template ID.</p>
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
     * {@link ListApprovalProcessesResponseBody} extends {@link TeaModel}
     *
     * <p>ListApprovalProcessesResponseBody</p>
     */
    public static class DlpSendPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolicyIds")
        private java.util.List<String> policyIds;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        private DlpSendPolicies(Builder builder) {
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
            private java.util.List<String> policyIds; 
            private String schemaId; 

            private Builder() {
            } 

            private Builder(DlpSendPolicies model) {
                this.policyIds = model.policyIds;
                this.schemaId = model.schemaId;
            } 

            /**
             * <p>The list of file outgoing policy IDs.</p>
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * <p>The approval template ID.</p>
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
     * {@link ListApprovalProcessesResponseBody} extends {@link TeaModel}
     *
     * <p>ListApprovalProcessesResponseBody</p>
     */
    public static class DomainBlacklistPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolicyIds")
        private java.util.List<String> policyIds;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        private DomainBlacklistPolicies(Builder builder) {
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
            private java.util.List<String> policyIds; 
            private String schemaId; 

            private Builder() {
            } 

            private Builder(DomainBlacklistPolicies model) {
                this.policyIds = model.policyIds;
                this.schemaId = model.schemaId;
            } 

            /**
             * <p>The list of domain name blacklist policy IDs.</p>
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * <p>The approval template ID.</p>
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
     * {@link ListApprovalProcessesResponseBody} extends {@link TeaModel}
     *
     * <p>ListApprovalProcessesResponseBody</p>
     */
    public static class DomainWhitelistPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolicyIds")
        private java.util.List<String> policyIds;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        private DomainWhitelistPolicies(Builder builder) {
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
            private java.util.List<String> policyIds; 
            private String schemaId; 

            private Builder() {
            } 

            private Builder(DomainWhitelistPolicies model) {
                this.policyIds = model.policyIds;
                this.schemaId = model.schemaId;
            } 

            /**
             * <p>The list of domain name whitelist policy IDs.</p>
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * <p>The approval template ID.</p>
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
     * {@link ListApprovalProcessesResponseBody} extends {@link TeaModel}
     *
     * <p>ListApprovalProcessesResponseBody</p>
     */
    public static class EndpointHardeningPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolicyIds")
        private java.util.List<String> policyIds;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        private EndpointHardeningPolicies(Builder builder) {
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
            private java.util.List<String> policyIds; 
            private String schemaId; 

            private Builder() {
            } 

            private Builder(EndpointHardeningPolicies model) {
                this.policyIds = model.policyIds;
                this.schemaId = model.schemaId;
            } 

            /**
             * <p>The list of domain name whitelist policy IDs.</p>
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * <p>The approval template ID.</p>
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
     * {@link ListApprovalProcessesResponseBody} extends {@link TeaModel}
     *
     * <p>ListApprovalProcessesResponseBody</p>
     */
    public static class PeripheralBlockPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolicyIds")
        private java.util.List<String> policyIds;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        private PeripheralBlockPolicies(Builder builder) {
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
            private java.util.List<String> policyIds; 
            private String schemaId; 

            private Builder() {
            } 

            private Builder(PeripheralBlockPolicies model) {
                this.policyIds = model.policyIds;
                this.schemaId = model.schemaId;
            } 

            /**
             * <p>The list of peripheral control policy IDs.</p>
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * <p>The approval template ID.</p>
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
     * {@link ListApprovalProcessesResponseBody} extends {@link TeaModel}
     *
     * <p>ListApprovalProcessesResponseBody</p>
     */
    public static class PrivateAccessBlockPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolicyIds")
        private java.util.List<String> policyIds;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        private PrivateAccessBlockPolicies(Builder builder) {
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
            private java.util.List<String> policyIds; 
            private String schemaId; 

            private Builder() {
            } 

            private Builder(PrivateAccessBlockPolicies model) {
                this.policyIds = model.policyIds;
                this.schemaId = model.schemaId;
            } 

            /**
             * <p>The list of peripheral control policy IDs.</p>
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * <p>The approval template ID.</p>
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
     * {@link ListApprovalProcessesResponseBody} extends {@link TeaModel}
     *
     * <p>ListApprovalProcessesResponseBody</p>
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
             * <p>审批人ID。</p>
             * 
             * <strong>example:</strong>
             * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
             */
            public Builder saseUserId(String saseUserId) {
                this.saseUserId = saseUserId;
                return this;
            }

            /**
             * <p>审批人用户名。</p>
             * 
             * <strong>example:</strong>
             * <p>王先生</p>
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
     * {@link ListApprovalProcessesResponseBody} extends {@link TeaModel}
     *
     * <p>ListApprovalProcessesResponseBody</p>
     */
    public static class SoftwareBlockPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolicyIds")
        private java.util.List<String> policyIds;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        private SoftwareBlockPolicies(Builder builder) {
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
            private java.util.List<String> policyIds; 
            private String schemaId; 

            private Builder() {
            } 

            private Builder(SoftwareBlockPolicies model) {
                this.policyIds = model.policyIds;
                this.schemaId = model.schemaId;
            } 

            /**
             * <p>The list of software blocking policy IDs.</p>
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * <p>The approval template ID.</p>
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
     * {@link ListApprovalProcessesResponseBody} extends {@link TeaModel}
     *
     * <p>ListApprovalProcessesResponseBody</p>
     */
    public static class SoftwareHardeningPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolicyIds")
        private java.util.List<String> policyIds;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        private SoftwareHardeningPolicies(Builder builder) {
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
            private java.util.List<String> policyIds; 
            private String schemaId; 

            private Builder() {
            } 

            private Builder(SoftwareHardeningPolicies model) {
                this.policyIds = model.policyIds;
                this.schemaId = model.schemaId;
            } 

            /**
             * <p>The list of software blocking policy IDs.</p>
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * <p>The approval template ID.</p>
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
     * {@link ListApprovalProcessesResponseBody} extends {@link TeaModel}
     *
     * <p>ListApprovalProcessesResponseBody</p>
     */
    public static class Processes extends TeaModel {
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

        private Processes(Builder builder) {
            this.appUninstallPolicies = builder.appUninstallPolicies;
            this.approvalType = builder.approvalType;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.deviceRegistrationPolicies = builder.deviceRegistrationPolicies;
            this.dlpSendPolicies = builder.dlpSendPolicies;
            this.domainBlacklistPolicies = builder.domainBlacklistPolicies;
            this.domainWhitelistPolicies = builder.domainWhitelistPolicies;
            this.endpointHardeningPolicies = builder.endpointHardeningPolicies;
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

        public static Processes create() {
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
            private PeripheralBlockPolicies peripheralBlockPolicies; 
            private PrivateAccessBlockPolicies privateAccessBlockPolicies; 
            private String processId; 
            private String processName; 
            private java.util.List<java.util.List<ProcessNodes>> processNodes; 
            private SoftwareBlockPolicies softwareBlockPolicies; 
            private SoftwareHardeningPolicies softwareHardeningPolicies; 

            private Builder() {
            } 

            private Builder(Processes model) {
                this.appUninstallPolicies = model.appUninstallPolicies;
                this.approvalType = model.approvalType;
                this.createTime = model.createTime;
                this.description = model.description;
                this.deviceRegistrationPolicies = model.deviceRegistrationPolicies;
                this.dlpSendPolicies = model.dlpSendPolicies;
                this.domainBlacklistPolicies = model.domainBlacklistPolicies;
                this.domainWhitelistPolicies = model.domainWhitelistPolicies;
                this.endpointHardeningPolicies = model.endpointHardeningPolicies;
                this.peripheralBlockPolicies = model.peripheralBlockPolicies;
                this.privateAccessBlockPolicies = model.privateAccessBlockPolicies;
                this.processId = model.processId;
                this.processName = model.processName;
                this.processNodes = model.processNodes;
                this.softwareBlockPolicies = model.softwareBlockPolicies;
                this.softwareHardeningPolicies = model.softwareHardeningPolicies;
            } 

            /**
             * <p>The list of policies associated with agent uninstallation.</p>
             */
            public Builder appUninstallPolicies(AppUninstallPolicies appUninstallPolicies) {
                this.appUninstallPolicies = appUninstallPolicies;
                return this;
            }

            /**
             * ApprovalType.
             */
            public Builder approvalType(Integer approvalType) {
                this.approvalType = approvalType;
                return this;
            }

            /**
             * <p>The time when the approval process was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-02-27 14:04:27</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the approval process.</p>
             * 
             * <strong>example:</strong>
             * <p>这是一个审批流程</p>
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
             * <p>The list of policies associated with file outgoing.</p>
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
             * EndpointHardeningPolicies.
             */
            public Builder endpointHardeningPolicies(EndpointHardeningPolicies endpointHardeningPolicies) {
                this.endpointHardeningPolicies = endpointHardeningPolicies;
                return this;
            }

            /**
             * <p>The list of policies associated with peripheral control.</p>
             */
            public Builder peripheralBlockPolicies(PeripheralBlockPolicies peripheralBlockPolicies) {
                this.peripheralBlockPolicies = peripheralBlockPolicies;
                return this;
            }

            /**
             * PrivateAccessBlockPolicies.
             */
            public Builder privateAccessBlockPolicies(PrivateAccessBlockPolicies privateAccessBlockPolicies) {
                this.privateAccessBlockPolicies = privateAccessBlockPolicies;
                return this;
            }

            /**
             * <p>The approval process ID.</p>
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
             * <p>测试</p>
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
             * SoftwareHardeningPolicies.
             */
            public Builder softwareHardeningPolicies(SoftwareHardeningPolicies softwareHardeningPolicies) {
                this.softwareHardeningPolicies = softwareHardeningPolicies;
                return this;
            }

            public Processes build() {
                return new Processes(this);
            } 

        } 

    }
}
