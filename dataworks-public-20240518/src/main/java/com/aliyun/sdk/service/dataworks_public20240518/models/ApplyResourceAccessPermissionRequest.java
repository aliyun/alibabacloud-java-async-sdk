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
 * {@link ApplyResourceAccessPermissionRequest} extends {@link RequestModel}
 *
 * <p>ApplyResourceAccessPermissionRequest</p>
 */
public class ApplyResourceAccessPermissionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplyContents")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ApplyContents> applyContents;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Reason")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reason;

    private ApplyResourceAccessPermissionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applyContents = builder.applyContents;
        this.clientToken = builder.clientToken;
        this.reason = builder.reason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyResourceAccessPermissionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return applyContents
     */
    public java.util.List<ApplyContents> getApplyContents() {
        return this.applyContents;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    public static final class Builder extends Request.Builder<ApplyResourceAccessPermissionRequest, Builder> {
        private String regionId; 
        private java.util.List<ApplyContents> applyContents; 
        private String clientToken; 
        private String reason; 

        private Builder() {
            super();
        } 

        private Builder(ApplyResourceAccessPermissionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applyContents = request.applyContents;
            this.clientToken = request.clientToken;
            this.reason = request.reason;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The list of resource permission request entries.</p>
         * <p>This parameter is required.</p>
         */
        public Builder applyContents(java.util.List<ApplyContents> applyContents) {
            String applyContentsShrink = shrink(applyContents, "ApplyContents", "json");
            this.putBodyParameter("ApplyContents", applyContentsShrink);
            this.applyContents = applyContents;
            return this;
        }

        /**
         * <p>The idempotency token. Used to prevent duplicate operations caused by multiple calls.</p>
         * 
         * <strong>example:</strong>
         * <p>ABFUOEUOTRTRJKE</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The reason for the request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Business development needs</p>
         */
        public Builder reason(String reason) {
            this.putBodyParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        @Override
        public ApplyResourceAccessPermissionRequest build() {
            return new ApplyResourceAccessPermissionRequest(this);
        } 

    } 

    /**
     * 
     * {@link ApplyResourceAccessPermissionRequest} extends {@link TeaModel}
     *
     * <p>ApplyResourceAccessPermissionRequest</p>
     */
    public static class Grantee extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrincipalId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String principalId;

        @com.aliyun.core.annotation.NameInMap("PrincipalType")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The principal ID. The ID has different meanings depending on the principal type:</p>
             * <ul>
             * <li><p>RamUser: DataWorks UserId</p>
             * </li>
             * <li><p>RamRole: DataWorks UserId prefixed with &quot;ROLE_&quot;</p>
             * </li>
             * <li><p>DlfRole: DlfNext role name</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ROLE_32237475848545</p>
             */
            public Builder principalId(String principalId) {
                this.principalId = principalId;
                return this;
            }

            /**
             * <p>The principal type. Valid values:</p>
             * <ul>
             * <li>RamRole</li>
             * <li>RamUser</li>
             * <li>DlfRole</li>
             * </ul>
             * <p>This parameter is required.</p>
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
     * {@link ApplyResourceAccessPermissionRequest} extends {@link TeaModel}
     *
     * <p>ApplyResourceAccessPermissionRequest</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefSchema")
        @com.aliyun.core.annotation.Validation(required = true)
        private String defSchema;

        @com.aliyun.core.annotation.NameInMap("DefVersion")
        private String defVersion;

        @com.aliyun.core.annotation.NameInMap("MetaData")
        private java.util.Map<String, ?> metaData;

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
        public java.util.Map<String, ?> getMetaData() {
            return this.metaData;
        }

        public static final class Builder {
            private String defSchema; 
            private String defVersion; 
            private java.util.Map<String, ?> metaData; 

            private Builder() {
            } 

            private Builder(Resource model) {
                this.defSchema = model.defSchema;
                this.defVersion = model.defVersion;
                this.metaData = model.metaData;
            } 

            /**
             * <p>The resource type.</p>
             * <p><strong>Note</strong>: The resource types that can be requested are constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.name.</p>
             * <p>See also: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation (Chinese)</a></p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>MaxCompute</p>
             */
            public Builder defSchema(String defSchema) {
                this.defSchema = defSchema;
                return this;
            }

            /**
             * <p>The resource parsing version, constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.version.</p>
             * <p><a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation (Chinese)</a></p>
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
             * <p><strong>Note</strong>: The metadata is constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.resources. A valid resource declaration must include the full-path metadata declaration from level 0 to the validLeaf level.</p>
             * <p>See also: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation (Chinese)</a></p>
             */
            public Builder metaData(java.util.Map<String, ?> metaData) {
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
     * {@link ApplyResourceAccessPermissionRequest} extends {@link TeaModel}
     *
     * <p>ApplyResourceAccessPermissionRequest</p>
     */
    public static class ApplyContents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessTypes")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> accessTypes;

        @com.aliyun.core.annotation.NameInMap("AuthMethod")
        private String authMethod;

        @com.aliyun.core.annotation.NameInMap("ExpirationTime")
        private Long expirationTime;

        @com.aliyun.core.annotation.NameInMap("Grantee")
        @com.aliyun.core.annotation.Validation(required = true)
        private Grantee grantee;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private Resource resource;

        private ApplyContents(Builder builder) {
            this.accessTypes = builder.accessTypes;
            this.authMethod = builder.authMethod;
            this.expirationTime = builder.expirationTime;
            this.grantee = builder.grantee;
            this.resource = builder.resource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplyContents create() {
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
         * @return expirationTime
         */
        public Long getExpirationTime() {
            return this.expirationTime;
        }

        /**
         * @return grantee
         */
        public Grantee getGrantee() {
            return this.grantee;
        }

        /**
         * @return resource
         */
        public Resource getResource() {
            return this.resource;
        }

        public static final class Builder {
            private java.util.List<String> accessTypes; 
            private String authMethod; 
            private Long expirationTime; 
            private Grantee grantee; 
            private Resource resource; 

            private Builder() {
            } 

            private Builder(ApplyContents model) {
                this.accessTypes = model.accessTypes;
                this.authMethod = model.authMethod;
                this.expirationTime = model.expirationTime;
                this.grantee = model.grantee;
                this.resource = model.resource;
            } 

            /**
             * <p>The list of requested access types.</p>
             * <p><strong>Note</strong>: Different resource levels support different access types. All access types are constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.isValidLeaf, accessTypeRestrictions, and authMethodAccessTypes.</p>
             * <p>See also: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation (Chinese)</a></p>
             * <p>This parameter is required.</p>
             */
            public Builder accessTypes(java.util.List<String> accessTypes) {
                this.accessTypes = accessTypes;
                return this;
            }

            /**
             * <p>The authorization method. Currently, only SEVERLESS_STARROCKS supports specifying an authorization method: ranger or starrocksManager.</p>
             * <p><strong>Note</strong>: Different resources support different authorization methods. All authorization methods are constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.authMethods.</p>
             * <p>See also: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation (Chinese)</a></p>
             * 
             * <strong>example:</strong>
             * <p>ranger</p>
             */
            public Builder authMethod(String authMethod) {
                this.authMethod = authMethod;
                return this;
            }

            /**
             * <p>The permission expiration time, in millisecond-level timestamp format.</p>
             * 
             * <strong>example:</strong>
             * <p>1785835708000</p>
             */
            public Builder expirationTime(Long expirationTime) {
                this.expirationTime = expirationTime;
                return this;
            }

            /**
             * <p>The grantee description.</p>
             * <p><strong>Note</strong>: The supported principal types are constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.authPrincipal.</p>
             * <p>See also: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation (Chinese)</a></p>
             * <p>This parameter is required.</p>
             */
            public Builder grantee(Grantee grantee) {
                this.grantee = grantee;
                return this;
            }

            /**
             * <p>The resource description.</p>
             */
            public Builder resource(Resource resource) {
                this.resource = resource;
                return this;
            }

            public ApplyContents build() {
                return new ApplyContents(this);
            } 

        } 

    }
}
