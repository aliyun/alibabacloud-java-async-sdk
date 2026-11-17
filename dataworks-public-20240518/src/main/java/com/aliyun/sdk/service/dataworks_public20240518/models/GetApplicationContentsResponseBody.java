// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetApplicationContentsResponseBody} extends {@link TeaModel}
 *
 * <p>GetApplicationContentsResponseBody</p>
 */
public class GetApplicationContentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetApplicationContentsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationContentsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetApplicationContentsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The process instance and the associated request details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID. You can use this ID to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>34267E2E-0335-1A60-A1F0-ADA530890CBA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApplicationContentsResponseBody build() {
            return new GetApplicationContentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetApplicationContentsResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationContentsResponseBody</p>
     */
    public static class Grantee extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrincipalId")
        private String principalId;

        @com.aliyun.core.annotation.NameInMap("PrincipalType")
        private String principalType;

        private Grantee(Builder builder) {
            this.principalId = builder.principalId;
            this.principalType = builder.principalType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Grantee create() {
            return builder().build();
        }

        /**
         * @return principalId
         */
        public String getPrincipalId() {
            return this.principalId;
        }

        /**
         * @return principalType
         */
        public String getPrincipalType() {
            return this.principalType;
        }

        public static final class Builder {
            private String principalId; 
            private String principalType; 

            private Builder() {
            } 

            private Builder(Grantee model) {
                this.principalId = model.principalId;
                this.principalType = model.principalType;
            } 

            /**
             * <p>The authorization principal ID. The mapped ID has different semantics for different principal types:</p>
             * <ul>
             * <li><p>RamUser: the DataWorks user ID.</p>
             * </li>
             * <li><p>RamRole: the DataWorks user ID starting with &quot;ROLE_&quot;.</p>
             * </li>
             * <li><p>DlfRole: the DlfNext role name.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ROLE_3133343434</p>
             */
            public Builder principalId(String principalId) {
                this.principalId = principalId;
                return this;
            }

            /**
             * <p>The authorization principal type. Valid values:</p>
             * <ul>
             * <li>RamUser</li>
             * <li>RamRole</li>
             * <li>DlfRole</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RamRole</p>
             */
            public Builder principalType(String principalType) {
                this.principalType = principalType;
                return this;
            }

            public Grantee build() {
                return new Grantee(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApplicationContentsResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationContentsResponseBody</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefSchema")
        private String defSchema;

        @com.aliyun.core.annotation.NameInMap("DefVersion")
        private String defVersion;

        @com.aliyun.core.annotation.NameInMap("MetaData")
        private String metaData;

        private Resource(Builder builder) {
            this.defSchema = builder.defSchema;
            this.defVersion = builder.defVersion;
            this.metaData = builder.metaData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return defSchema
         */
        public String getDefSchema() {
            return this.defSchema;
        }

        /**
         * @return defVersion
         */
        public String getDefVersion() {
            return this.defVersion;
        }

        /**
         * @return metaData
         */
        public String getMetaData() {
            return this.metaData;
        }

        public static final class Builder {
            private String defSchema; 
            private String defVersion; 
            private String metaData; 

            private Builder() {
            } 

            private Builder(Resource model) {
                this.defSchema = model.defSchema;
                this.defVersion = model.defVersion;
                this.metaData = model.metaData;
            } 

            /**
             * <p>The resource type.</p>
             * <p>Note: The resource types supported by the system are constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.name.</p>
             * <p>Appendix: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for the international site</a></p>
             * 
             * <strong>example:</strong>
             * <p>MaxCompute</p>
             */
            public Builder defSchema(String defSchema) {
                this.defSchema = defSchema;
                return this;
            }

            /**
             * <p>The resource parsing version is constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.version.</p>
             * <p><a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for the international site</a></p>
             * 
             * <strong>example:</strong>
             * <p>v1.0.0</p>
             */
            public Builder defVersion(String defVersion) {
                this.defVersion = defVersion;
                return this;
            }

            /**
             * <p>The resource metadata declaration.</p>
             * <p>Note: The metadata is constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.resources. A valid resource declaration must include the full-path metadata declaration from level 0 to the validLeaf level.</p>
             * <p>Appendix: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for the international site</a></p>
             * 
             * <strong>example:</strong>
             * <p>&quot;{\&quot;schema\&quot;:\&quot;default\&quot;,\&quot;threeTierModel\&quot;:false,\&quot;workspace\&quot;:\&quot;449656\&quot;,\&quot;project\&quot;:\&quot;sync_destination\&quot;,\&quot;table\&quot;:\&quot;order_table\&quot;,\&quot;tenant\&quot;:\&quot;524997424564736\&quot;}&quot;</p>
             */
            public Builder metaData(String metaData) {
                this.metaData = metaData;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApplicationContentsResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationContentsResponseBody</p>
     */
    public static class Contents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessTypes")
        private java.util.List<String> accessTypes;

        @com.aliyun.core.annotation.NameInMap("AuthMethod")
        private String authMethod;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DefSchema")
        private String defSchema;

        @com.aliyun.core.annotation.NameInMap("ExpirationTime")
        private Long expirationTime;

        @com.aliyun.core.annotation.NameInMap("FinalAccessTypes")
        private java.util.List<String> finalAccessTypes;

        @com.aliyun.core.annotation.NameInMap("Grantee")
        private Grantee grantee;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ProcessInstanceId")
        private String processInstanceId;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private Resource resource;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private Contents(Builder builder) {
            this.accessTypes = builder.accessTypes;
            this.authMethod = builder.authMethod;
            this.createTime = builder.createTime;
            this.defSchema = builder.defSchema;
            this.expirationTime = builder.expirationTime;
            this.finalAccessTypes = builder.finalAccessTypes;
            this.grantee = builder.grantee;
            this.id = builder.id;
            this.processInstanceId = builder.processInstanceId;
            this.resource = builder.resource;
            this.resourceName = builder.resourceName;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contents create() {
            return builder().build();
        }

        /**
         * @return accessTypes
         */
        public java.util.List<String> getAccessTypes() {
            return this.accessTypes;
        }

        /**
         * @return authMethod
         */
        public String getAuthMethod() {
            return this.authMethod;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return defSchema
         */
        public String getDefSchema() {
            return this.defSchema;
        }

        /**
         * @return expirationTime
         */
        public Long getExpirationTime() {
            return this.expirationTime;
        }

        /**
         * @return finalAccessTypes
         */
        public java.util.List<String> getFinalAccessTypes() {
            return this.finalAccessTypes;
        }

        /**
         * @return grantee
         */
        public Grantee getGrantee() {
            return this.grantee;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return processInstanceId
         */
        public String getProcessInstanceId() {
            return this.processInstanceId;
        }

        /**
         * @return resource
         */
        public Resource getResource() {
            return this.resource;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private java.util.List<String> accessTypes; 
            private String authMethod; 
            private Long createTime; 
            private String defSchema; 
            private Long expirationTime; 
            private java.util.List<String> finalAccessTypes; 
            private Grantee grantee; 
            private String id; 
            private String processInstanceId; 
            private Resource resource; 
            private String resourceName; 
            private String status; 
            private String tenantId; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(Contents model) {
                this.accessTypes = model.accessTypes;
                this.authMethod = model.authMethod;
                this.createTime = model.createTime;
                this.defSchema = model.defSchema;
                this.expirationTime = model.expirationTime;
                this.finalAccessTypes = model.finalAccessTypes;
                this.grantee = model.grantee;
                this.id = model.id;
                this.processInstanceId = model.processInstanceId;
                this.resource = model.resource;
                this.resourceName = model.resourceName;
                this.status = model.status;
                this.tenantId = model.tenantId;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The list of requested permissions.</p>
             * <p>Note: Different levels of resources support different types of permission requests, which are uniformly constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.isValidLeaf, accessTypeRestrictions, and authMethodAccessTypes.</p>
             * <p>Appendix: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for the international site</a></p>
             */
            public Builder accessTypes(java.util.List<String> accessTypes) {
                this.accessTypes = accessTypes;
                return this;
            }

            /**
             * <p>The authorization method. Currently, only SEVERLESS_STARROCKS supports specifying the authorization method: ranger and starrocksManager.</p>
             * <p>Note: Different resources support different authorization methods, which are uniformly constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.authMethods.</p>
             * <p>Appendix: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for the international site</a></p>
             * 
             * <strong>example:</strong>
             * <p>ranger</p>
             */
            public Builder authMethod(String authMethod) {
                this.authMethod = authMethod;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1773972024000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * <p>Note: The resource types supported by the system are constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.name.</p>
             * <p>Appendix: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for the international site</a></p>
             * 
             * <strong>example:</strong>
             * <p>MaxCompute</p>
             */
            public Builder defSchema(String defSchema) {
                this.defSchema = defSchema;
                return this;
            }

            /**
             * <p>The expiration date of the permission. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1785835708000</p>
             */
            public Builder expirationTime(Long expirationTime) {
                this.expirationTime = expirationTime;
                return this;
            }

            /**
             * <p>The list of resource operation permissions that are finally approved.</p>
             */
            public Builder finalAccessTypes(java.util.List<String> finalAccessTypes) {
                this.finalAccessTypes = finalAccessTypes;
                return this;
            }

            /**
             * <p>The description of the authorization principal. </p>
             * <p>Note: The authorization principal types supported by the system are constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.authPrincipal.</p>
             * <p>Appendix: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for the international site</a></p>
             */
            public Builder grantee(Grantee grantee) {
                this.grantee = grantee;
                return this;
            }

            /**
             * <p>The unique identifier of the request item.</p>
             * 
             * <strong>example:</strong>
             * <p>Y9H7AKFmjhWzLYdZNDZA5</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the approval process instance for the request.</p>
             * 
             * <strong>example:</strong>
             * <p>777799223</p>
             */
            public Builder processInstanceId(String processInstanceId) {
                this.processInstanceId = processInstanceId;
                return this;
            }

            /**
             * <p>The resource declaration. The resource description is constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.</p>
             * <p>Appendix: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for the international site</a></p>
             */
            public Builder resource(Resource resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>The least privilege resource type.</p>
             * <p>Note: The least privilege resource types are constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.resources[*].isValidLeaf being true.</p>
             * <p>Appendix: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for the international site</a></p>
             * 
             * <strong>example:</strong>
             * <p>table</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>The approval status. Valid values:</p>
             * <ul>
             * <li>WaitApproval: pending approval</li>
             * <li>Confirmed: pending authorization</li>
             * <li>RejectApproval: approval rejected</li>
             * <li>AuthorizeSucceed: authorization succeeded</li>
             * <li>AuthorizeFailed: authorization failed</li>
             * <li>Deleted: deleted</li>
             * <li>Canceled: canceled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Deleted</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>69973837489</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>1773972024000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Contents build() {
                return new Contents(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApplicationContentsResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationContentsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationTime")
        private Long applicationTime;

        @com.aliyun.core.annotation.NameInMap("Contents")
        private java.util.List<Contents> contents;

        @com.aliyun.core.annotation.NameInMap("DefSchema")
        private String defSchema;

        @com.aliyun.core.annotation.NameInMap("ProcessInstanceId")
        private String processInstanceId;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.applicationTime = builder.applicationTime;
            this.contents = builder.contents;
            this.defSchema = builder.defSchema;
            this.processInstanceId = builder.processInstanceId;
            this.reason = builder.reason;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return applicationTime
         */
        public Long getApplicationTime() {
            return this.applicationTime;
        }

        /**
         * @return contents
         */
        public java.util.List<Contents> getContents() {
            return this.contents;
        }

        /**
         * @return defSchema
         */
        public String getDefSchema() {
            return this.defSchema;
        }

        /**
         * @return processInstanceId
         */
        public String getProcessInstanceId() {
            return this.processInstanceId;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long applicationTime; 
            private java.util.List<Contents> contents; 
            private String defSchema; 
            private String processInstanceId; 
            private String reason; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.applicationTime = model.applicationTime;
                this.contents = model.contents;
                this.defSchema = model.defSchema;
                this.processInstanceId = model.processInstanceId;
                this.reason = model.reason;
                this.status = model.status;
            } 

            /**
             * <p>The time when the request was submitted. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1779675618000</p>
             */
            public Builder applicationTime(Long applicationTime) {
                this.applicationTime = applicationTime;
                return this;
            }

            /**
             * <p>The list of request items.</p>
             */
            public Builder contents(java.util.List<Contents> contents) {
                this.contents = contents;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * <p>Note: The resource types supported by the system are constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.name.</p>
             * <p>Appendix: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for the international site</a></p>
             * 
             * <strong>example:</strong>
             * <p>MaxCompute</p>
             */
            public Builder defSchema(String defSchema) {
                this.defSchema = defSchema;
                return this;
            }

            /**
             * <p>The process instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>332066440109224007</p>
             */
            public Builder processInstanceId(String processInstanceId) {
                this.processInstanceId = processInstanceId;
                return this;
            }

            /**
             * <p>The reason for the request.</p>
             * 
             * <strong>example:</strong>
             * <p>Business requirement</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The approval status. Valid values:</p>
             * <ul>
             * <li>WaitApproval: pending approval</li>
             * <li>Confirmed: pending authorization</li>
             * <li>RejectApproval: approval rejected</li>
             * <li>AuthorizeSucceed: authorization succeeded</li>
             * <li>AuthorizeFailed: authorization failed</li>
             * <li>Deleted: deleted</li>
             * <li>Canceled: canceled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WaitApproval</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
