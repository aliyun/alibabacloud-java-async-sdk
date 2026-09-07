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
 * {@link ListApprovalProcessesForApprovalSchemasResponseBody} extends {@link TeaModel}
 *
 * <p>ListApprovalProcessesForApprovalSchemasResponseBody</p>
 */
public class ListApprovalProcessesForApprovalSchemasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Schemas")
    private java.util.List<Schemas> schemas;

    private ListApprovalProcessesForApprovalSchemasResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.schemas = builder.schemas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApprovalProcessesForApprovalSchemasResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return schemas
     */
    public java.util.List<Schemas> getSchemas() {
        return this.schemas;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Schemas> schemas; 

        private Builder() {
        } 

        private Builder(ListApprovalProcessesForApprovalSchemasResponseBody model) {
            this.requestId = model.requestId;
            this.schemas = model.schemas;
        } 

        /**
         * <p>The ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>BE4FB974-11BC-5453-9BE1-1606A73EACA6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>A list of approval templates.</p>
         */
        public Builder schemas(java.util.List<Schemas> schemas) {
            this.schemas = schemas;
            return this;
        }

        public ListApprovalProcessesForApprovalSchemasResponseBody build() {
            return new ListApprovalProcessesForApprovalSchemasResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApprovalProcessesForApprovalSchemasResponseBody} extends {@link TeaModel}
     *
     * <p>ListApprovalProcessesForApprovalSchemasResponseBody</p>
     */
    public static class Processes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ProcessId")
        private String processId;

        @com.aliyun.core.annotation.NameInMap("ProcessName")
        private String processName;

        private Processes(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.processId = builder.processId;
            this.processName = builder.processName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Processes create() {
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

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String processId; 
            private String processName; 

            private Builder() {
            } 

            private Builder(Processes model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.processId = model.processId;
                this.processName = model.processName;
            } 

            /**
             * <p>The time when the approval flow was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-25 10:44:09</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the approval flow.</p>
             * 
             * <strong>example:</strong>
             * <p>这是一个审批流程</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the approval flow.</p>
             * 
             * <strong>example:</strong>
             * <p>approval-process-dc61e92ba5c5****</p>
             */
            public Builder processId(String processId) {
                this.processId = processId;
                return this;
            }

            /**
             * <p>The name of the approval flow.</p>
             * 
             * <strong>example:</strong>
             * <p>测试</p>
             */
            public Builder processName(String processName) {
                this.processName = processName;
                return this;
            }

            public Processes build() {
                return new Processes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApprovalProcessesForApprovalSchemasResponseBody} extends {@link TeaModel}
     *
     * <p>ListApprovalProcessesForApprovalSchemasResponseBody</p>
     */
    public static class Schemas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Processes")
        private java.util.List<Processes> processes;

        @com.aliyun.core.annotation.NameInMap("SchemaId")
        private String schemaId;

        private Schemas(Builder builder) {
            this.processes = builder.processes;
            this.schemaId = builder.schemaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Schemas create() {
            return builder().build();
        }

        /**
         * @return processes
         */
        public java.util.List<Processes> getProcesses() {
            return this.processes;
        }

        /**
         * @return schemaId
         */
        public String getSchemaId() {
            return this.schemaId;
        }

        public static final class Builder {
            private java.util.List<Processes> processes; 
            private String schemaId; 

            private Builder() {
            } 

            private Builder(Schemas model) {
                this.processes = model.processes;
                this.schemaId = model.schemaId;
            } 

            /**
             * <p>A collection of approval flows.</p>
             */
            public Builder processes(java.util.List<Processes> processes) {
                this.processes = processes;
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

            public Schemas build() {
                return new Schemas(this);
            } 

        } 

    }
}
