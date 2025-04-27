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
 * {@link UpdateApprovalProcessResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateApprovalProcessResponseBody</p>
 */
public class UpdateApprovalProcessResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Process")
    private Process process;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateApprovalProcessResponseBody(Builder builder) {
        this.process = builder.process;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApprovalProcessResponseBody create() {
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

        private Builder(UpdateApprovalProcessResponseBody model) {
            this.process = model.process;
            this.requestId = model.requestId;
        } 

        /**
         * Process.
         */
        public Builder process(Process process) {
            this.process = process;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateApprovalProcessResponseBody build() {
            return new UpdateApprovalProcessResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateApprovalProcessResponseBody</p>
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
             * PolicyIds.
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * SchemaId.
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
     * {@link UpdateApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateApprovalProcessResponseBody</p>
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
             * PolicyIds.
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * SchemaId.
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
     * {@link UpdateApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateApprovalProcessResponseBody</p>
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
             * PolicyIds.
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * SchemaId.
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
     * {@link UpdateApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateApprovalProcessResponseBody</p>
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
             * PolicyIds.
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * SchemaId.
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
     * {@link UpdateApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateApprovalProcessResponseBody</p>
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
             * PolicyIds.
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * SchemaId.
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
     * {@link UpdateApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateApprovalProcessResponseBody</p>
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
             * PolicyIds.
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * SchemaId.
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
     * {@link UpdateApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateApprovalProcessResponseBody</p>
     */
    public static class PeripheraBlockPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolicyIds")
        private java.util.List<String> policyIds;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        private PeripheraBlockPolicies(Builder builder) {
            this.policyIds = builder.policyIds;
            this.schemaId = builder.schemaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PeripheraBlockPolicies create() {
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

            private Builder(PeripheraBlockPolicies model) {
                this.policyIds = model.policyIds;
                this.schemaId = model.schemaId;
            } 

            /**
             * PolicyIds.
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * SchemaId.
             */
            public Builder schemaId(String schemaId) {
                this.schemaId = schemaId;
                return this;
            }

            public PeripheraBlockPolicies build() {
                return new PeripheraBlockPolicies(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateApprovalProcessResponseBody</p>
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
             * SaseUserId.
             */
            public Builder saseUserId(String saseUserId) {
                this.saseUserId = saseUserId;
                return this;
            }

            /**
             * Username.
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
     * {@link UpdateApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateApprovalProcessResponseBody</p>
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
             * PolicyIds.
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * SchemaId.
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
     * {@link UpdateApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateApprovalProcessResponseBody</p>
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
             * PolicyIds.
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * SchemaId.
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
     * {@link UpdateApprovalProcessResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateApprovalProcessResponseBody</p>
     */
    public static class Process extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppUninstallPolicies")
        private AppUninstallPolicies appUninstallPolicies;

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

        @com.aliyun.core.annotation.NameInMap("PeripheraBlockPolicies")
        private PeripheraBlockPolicies peripheraBlockPolicies;

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
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.deviceRegistrationPolicies = builder.deviceRegistrationPolicies;
            this.dlpSendPolicies = builder.dlpSendPolicies;
            this.domainBlacklistPolicies = builder.domainBlacklistPolicies;
            this.domainWhitelistPolicies = builder.domainWhitelistPolicies;
            this.endpointHardeningPolicies = builder.endpointHardeningPolicies;
            this.peripheraBlockPolicies = builder.peripheraBlockPolicies;
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
         * @return peripheraBlockPolicies
         */
        public PeripheraBlockPolicies getPeripheraBlockPolicies() {
            return this.peripheraBlockPolicies;
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
            private String createTime; 
            private String description; 
            private DeviceRegistrationPolicies deviceRegistrationPolicies; 
            private DlpSendPolicies dlpSendPolicies; 
            private DomainBlacklistPolicies domainBlacklistPolicies; 
            private DomainWhitelistPolicies domainWhitelistPolicies; 
            private EndpointHardeningPolicies endpointHardeningPolicies; 
            private PeripheraBlockPolicies peripheraBlockPolicies; 
            private String processId; 
            private String processName; 
            private java.util.List<java.util.List<ProcessNodes>> processNodes; 
            private SoftwareBlockPolicies softwareBlockPolicies; 
            private SoftwareHardeningPolicies softwareHardeningPolicies; 

            private Builder() {
            } 

            private Builder(Process model) {
                this.appUninstallPolicies = model.appUninstallPolicies;
                this.createTime = model.createTime;
                this.description = model.description;
                this.deviceRegistrationPolicies = model.deviceRegistrationPolicies;
                this.dlpSendPolicies = model.dlpSendPolicies;
                this.domainBlacklistPolicies = model.domainBlacklistPolicies;
                this.domainWhitelistPolicies = model.domainWhitelistPolicies;
                this.endpointHardeningPolicies = model.endpointHardeningPolicies;
                this.peripheraBlockPolicies = model.peripheraBlockPolicies;
                this.processId = model.processId;
                this.processName = model.processName;
                this.processNodes = model.processNodes;
                this.softwareBlockPolicies = model.softwareBlockPolicies;
                this.softwareHardeningPolicies = model.softwareHardeningPolicies;
            } 

            /**
             * AppUninstallPolicies.
             */
            public Builder appUninstallPolicies(AppUninstallPolicies appUninstallPolicies) {
                this.appUninstallPolicies = appUninstallPolicies;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DeviceRegistrationPolicies.
             */
            public Builder deviceRegistrationPolicies(DeviceRegistrationPolicies deviceRegistrationPolicies) {
                this.deviceRegistrationPolicies = deviceRegistrationPolicies;
                return this;
            }

            /**
             * DlpSendPolicies.
             */
            public Builder dlpSendPolicies(DlpSendPolicies dlpSendPolicies) {
                this.dlpSendPolicies = dlpSendPolicies;
                return this;
            }

            /**
             * DomainBlacklistPolicies.
             */
            public Builder domainBlacklistPolicies(DomainBlacklistPolicies domainBlacklistPolicies) {
                this.domainBlacklistPolicies = domainBlacklistPolicies;
                return this;
            }

            /**
             * DomainWhitelistPolicies.
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
             * PeripheraBlockPolicies.
             */
            public Builder peripheraBlockPolicies(PeripheraBlockPolicies peripheraBlockPolicies) {
                this.peripheraBlockPolicies = peripheraBlockPolicies;
                return this;
            }

            /**
             * ProcessId.
             */
            public Builder processId(String processId) {
                this.processId = processId;
                return this;
            }

            /**
             * ProcessName.
             */
            public Builder processName(String processName) {
                this.processName = processName;
                return this;
            }

            /**
             * ProcessNodes.
             */
            public Builder processNodes(java.util.List<java.util.List<ProcessNodes>> processNodes) {
                this.processNodes = processNodes;
                return this;
            }

            /**
             * SoftwareBlockPolicies.
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

            public Process build() {
                return new Process(this);
            } 

        } 

    }
}
