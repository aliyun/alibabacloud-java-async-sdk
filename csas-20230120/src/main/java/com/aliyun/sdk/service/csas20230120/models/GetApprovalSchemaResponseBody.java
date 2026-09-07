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
 * {@link GetApprovalSchemaResponseBody} extends {@link TeaModel}
 *
 * <p>GetApprovalSchemaResponseBody</p>
 */
public class GetApprovalSchemaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Schema")
    private Schema schema;

    private GetApprovalSchemaResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.schema = builder.schema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApprovalSchemaResponseBody create() {
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
     * @return schema
     */
    public Schema getSchema() {
        return this.schema;
    }

    public static final class Builder {
        private String requestId; 
        private Schema schema; 

        private Builder() {
        } 

        private Builder(GetApprovalSchemaResponseBody model) {
            this.requestId = model.requestId;
            this.schema = model.schema;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EFE7EBB2-449D-5BBB-B381-CA7839BC1649</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The approval template.</p>
         */
        public Builder schema(Schema schema) {
            this.schema = schema;
            return this;
        }

        public GetApprovalSchemaResponseBody build() {
            return new GetApprovalSchemaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetApprovalSchemaResponseBody} extends {@link TeaModel}
     *
     * <p>GetApprovalSchemaResponseBody</p>
     */
    public static class Schema extends TeaModel {
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

        private Schema(Builder builder) {
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

        public static Schema create() {
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

            private Builder(Schema model) {
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
             * <p>The time when the approval template was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-02-14 11:57:51</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the approval template.</p>
             * 
             * <strong>example:</strong>
             * <p>这是一个模板</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the template is an official template.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The policy type. Valid values:</p>
             * <ul>
             * <li><p><strong>DomainBlacklist</strong>: Domain name blacklist.</p>
             * </li>
             * <li><p><strong>DomainWhitelist</strong>: Domain name whitelist.</p>
             * </li>
             * <li><p><strong>SoftwareBlock</strong>: Software blocking.</p>
             * </li>
             * <li><p><strong>AppUninstall</strong>: Application uninstallation.</p>
             * </li>
             * <li><p><strong>DlpSend</strong>: Outbound file transfer.</p>
             * </li>
             * <li><p><strong>PeripheralBlock</strong>: Peripheral control.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DlpSend</p>
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * <p>The content of the approval template.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;form&quot;: {&quot;labelCol&quot;: 6,&quot;wrapperCol&quot;: 12}}</p>
             */
            public Builder schemaContent(String schemaContent) {
                this.schemaContent = schemaContent;
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

            /**
             * <p>The name of the approval template.</p>
             * 
             * <strong>example:</strong>
             * <p>测试</p>
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * <p>The version of the approval template.</p>
             * 
             * <strong>example:</strong>
             * <p>1715680940</p>
             */
            public Builder schemaVersion(Long schemaVersion) {
                this.schemaVersion = schemaVersion;
                return this;
            }

            public Schema build() {
                return new Schema(this);
            } 

        } 

    }
}
