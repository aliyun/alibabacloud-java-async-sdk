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
 * {@link ListApprovalSchemasForApprovalProcessesResponseBody} extends {@link TeaModel}
 *
 * <p>ListApprovalSchemasForApprovalProcessesResponseBody</p>
 */
public class ListApprovalSchemasForApprovalProcessesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Processes")
    private java.util.List<Processes> processes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListApprovalSchemasForApprovalProcessesResponseBody(Builder builder) {
        this.processes = builder.processes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApprovalSchemasForApprovalProcessesResponseBody create() {
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

    public static final class Builder {
        private java.util.List<Processes> processes; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListApprovalSchemasForApprovalProcessesResponseBody model) {
            this.processes = model.processes;
            this.requestId = model.requestId;
        } 

        /**
         * Processes.
         */
        public Builder processes(java.util.List<Processes> processes) {
            this.processes = processes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListApprovalSchemasForApprovalProcessesResponseBody build() {
            return new ListApprovalSchemasForApprovalProcessesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApprovalSchemasForApprovalProcessesResponseBody} extends {@link TeaModel}
     *
     * <p>ListApprovalSchemasForApprovalProcessesResponseBody</p>
     */
    public static class Schemas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        @com.aliyun.core.annotation.NameInMap("SchemaContent")
        private String schemaContent;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("SchemaVersion")
        private Long schemaVersion;

        private Schemas(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.isDefault = builder.isDefault;
            this.policyType = builder.policyType;
            this.schemaContent = builder.schemaContent;
            this.schemaId = builder.schemaId;
            this.schemaName = builder.schemaName;
            this.schemaVersion = builder.schemaVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Schemas create() {
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
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        /**
         * @return schemaContent
         */
        public String getSchemaContent() {
            return this.schemaContent;
        }

        /**
         * @return schemaId
         */
        public String getSchemaId() {
            return this.schemaId;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        /**
         * @return schemaVersion
         */
        public Long getSchemaVersion() {
            return this.schemaVersion;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private Boolean isDefault; 
            private String policyType; 
            private String schemaContent; 
            private String schemaId; 
            private String schemaName; 
            private Long schemaVersion; 

            private Builder() {
            } 

            private Builder(Schemas model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.isDefault = model.isDefault;
                this.policyType = model.policyType;
                this.schemaContent = model.schemaContent;
                this.schemaId = model.schemaId;
                this.schemaName = model.schemaName;
                this.schemaVersion = model.schemaVersion;
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
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * PolicyType.
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * SchemaContent.
             */
            public Builder schemaContent(String schemaContent) {
                this.schemaContent = schemaContent;
                return this;
            }

            /**
             * SchemaId.
             */
            public Builder schemaId(String schemaId) {
                this.schemaId = schemaId;
                return this;
            }

            /**
             * SchemaName.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * SchemaVersion.
             */
            public Builder schemaVersion(Long schemaVersion) {
                this.schemaVersion = schemaVersion;
                return this;
            }

            public Schemas build() {
                return new Schemas(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApprovalSchemasForApprovalProcessesResponseBody} extends {@link TeaModel}
     *
     * <p>ListApprovalSchemasForApprovalProcessesResponseBody</p>
     */
    public static class Processes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProcessId")
        private String processId;

        @com.aliyun.core.annotation.NameInMap("Schemas")
        private java.util.List<Schemas> schemas;

        private Processes(Builder builder) {
            this.processId = builder.processId;
            this.schemas = builder.schemas;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Processes create() {
            return builder().build();
        }

        /**
         * @return processId
         */
        public String getProcessId() {
            return this.processId;
        }

        /**
         * @return schemas
         */
        public java.util.List<Schemas> getSchemas() {
            return this.schemas;
        }

        public static final class Builder {
            private String processId; 
            private java.util.List<Schemas> schemas; 

            private Builder() {
            } 

            private Builder(Processes model) {
                this.processId = model.processId;
                this.schemas = model.schemas;
            } 

            /**
             * ProcessId.
             */
            public Builder processId(String processId) {
                this.processId = processId;
                return this;
            }

            /**
             * Schemas.
             */
            public Builder schemas(java.util.List<Schemas> schemas) {
                this.schemas = schemas;
                return this;
            }

            public Processes build() {
                return new Processes(this);
            } 

        } 

    }
}
