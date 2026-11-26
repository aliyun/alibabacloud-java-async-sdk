// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link CreateTenantDirectoryRequest} extends {@link RequestModel}
 *
 * <p>CreateTenantDirectoryRequest</p>
 */
public class CreateTenantDirectoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("appToken")
    private String appToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("changeRecordEnabled")
    private Boolean changeRecordEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ooVisibilityMode")
    private String ooVisibilityMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operatingObjectNames")
    private java.util.List<String> operatingObjectNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserCode")
    private String opsUserCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserId")
    private String opsUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parentId")
    private Long parentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("path")
    private String path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private CreateTenantDirectoryRequest(Builder builder) {
        super(builder);
        this.appToken = builder.appToken;
        this.changeRecordEnabled = builder.changeRecordEnabled;
        this.description = builder.description;
        this.name = builder.name;
        this.ooVisibilityMode = builder.ooVisibilityMode;
        this.operatingObjectNames = builder.operatingObjectNames;
        this.opsUserCode = builder.opsUserCode;
        this.opsUserId = builder.opsUserId;
        this.parentId = builder.parentId;
        this.path = builder.path;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTenantDirectoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appToken
     */
    public String getAppToken() {
        return this.appToken;
    }

    /**
     * @return changeRecordEnabled
     */
    public Boolean getChangeRecordEnabled() {
        return this.changeRecordEnabled;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ooVisibilityMode
     */
    public String getOoVisibilityMode() {
        return this.ooVisibilityMode;
    }

    /**
     * @return operatingObjectNames
     */
    public java.util.List<String> getOperatingObjectNames() {
        return this.operatingObjectNames;
    }

    /**
     * @return opsUserCode
     */
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    /**
     * @return opsUserId
     */
    public String getOpsUserId() {
        return this.opsUserId;
    }

    /**
     * @return parentId
     */
    public Long getParentId() {
        return this.parentId;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<CreateTenantDirectoryRequest, Builder> {
        private String appToken; 
        private Boolean changeRecordEnabled; 
        private String description; 
        private String name; 
        private String ooVisibilityMode; 
        private java.util.List<String> operatingObjectNames; 
        private String opsUserCode; 
        private String opsUserId; 
        private Long parentId; 
        private String path; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTenantDirectoryRequest request) {
            super(request);
            this.appToken = request.appToken;
            this.changeRecordEnabled = request.changeRecordEnabled;
            this.description = request.description;
            this.name = request.name;
            this.ooVisibilityMode = request.ooVisibilityMode;
            this.operatingObjectNames = request.operatingObjectNames;
            this.opsUserCode = request.opsUserCode;
            this.opsUserId = request.opsUserId;
            this.parentId = request.parentId;
            this.path = request.path;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The platform application credential. Pass this parameter when you use the application proxy mode, and specify the operator by using opsUserId or opsUserCode based on the application configuration. Do not use real credentials in logs or public examples.</p>
         * 
         * <strong>example:</strong>
         * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder appToken(String appToken) {
            this.putQueryParameter("appToken", appToken);
            this.appToken = appToken;
            return this;
        }

        /**
         * <p>Specifies whether to generate AI version summaries for subsequent content updates. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.
         * If this parameter is omitted or set to null, the configuration is not changed. Disabling this feature does not delete existing summaries. This parameter is supported only for standard enterprise knowledge base root directories.</li>
         * </ul>
         */
        public Builder changeRecordEnabled(Boolean changeRecordEnabled) {
            this.putBodyParameter("changeRecordEnabled", changeRecordEnabled);
            this.changeRecordEnabled = changeRecordEnabled;
            return this;
        }

        /**
         * <p>The purpose or content description of the directory. If this parameter is omitted, the value is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>Team product materials and operation guides</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the directory. The name must be 1 to 256 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Product knowledge base</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The digital employee association mode. ALL indicates that the directory is visible to all digital employees, and operatingObjectNames must be omitted, set to null, or set to an empty array. SPECIFIED indicates association by list, and operatingObjectNames must be explicitly provided. An empty array indicates that no employees are associated. If this parameter is omitted or set to null, the association configuration is not changed. This parameter is supported only for standard enterprise knowledge base root directories.</p>
         * 
         * <strong>example:</strong>
         * <p>SPECIFIED</p>
         */
        public Builder ooVisibilityMode(String ooVisibilityMode) {
            this.putBodyParameter("ooVisibilityMode", ooVisibilityMode);
            this.ooVisibilityMode = ooVisibilityMode;
            return this;
        }

        /**
         * <p>The list of internal names of the specified associated digital employees. This parameter must be used together with ooVisibilityMode. This parameter is required when ooVisibilityMode is set to SPECIFIED. An empty array indicates that all associations are cleared. When ooVisibilityMode is set to ALL, this parameter must be omitted, set to null, or set to an empty array. You can specify up to 100 items. Each item must be 1 to 256 characters in length after leading and trailing spaces are removed. The server verifies that the employees exist and are available in the current tenant, and fully replaces the associations after deduplication.</p>
         */
        public Builder operatingObjectNames(java.util.List<String> operatingObjectNames) {
            String operatingObjectNamesShrink = shrink(operatingObjectNames, "operatingObjectNames", "json");
            this.putBodyParameter("operatingObjectNames", operatingObjectNamesShrink);
            this.operatingObjectNames = operatingObjectNames;
            return this;
        }

        /**
         * <p>The unique code of the proxied user in the tenant. This parameter is used only when the identity mapping mode of the application credential is source_uid. You cannot use this parameter to bypass tenant or knowledge base permission verification.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder opsUserCode(String opsUserCode) {
            this.putQueryParameter("opsUserCode", opsUserCode);
            this.opsUserCode = opsUserCode;
            return this;
        }

        /**
         * <p>The ID of the proxied WINNEXO platform user. This parameter is used only when the identity mapping mode of the application credential is winnexo_uid. You cannot use this parameter to bypass tenant or knowledge base permission verification.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder opsUserId(String opsUserId) {
            this.putQueryParameter("opsUserId", opsUserId);
            this.opsUserId = opsUserId;
            return this;
        }

        /**
         * <p>The internal primary key of the parent directory. If this parameter is omitted or set to null, an enterprise knowledge base root directory is created. If this parameter is specified, a subdirectory is created. This parameter must be omitted or set to null when digital employee association or version summary configurations are included.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder parentId(Long parentId) {
            this.putBodyParameter("parentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * <p>The path of the directory. If this parameter is omitted or set to null, the server calculates the path based on the parent directory and the name.</p>
         * 
         * <strong>example:</strong>
         * <p>/Product knowledge base</p>
         */
        public Builder path(String path) {
            this.putBodyParameter("path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>The ID of the target tenant. This parameter is used for tenant routing in public requests. The server authentication chain verifies access permissions based on this parameter. You cannot use this parameter to access unauthorized tenants.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public CreateTenantDirectoryRequest build() {
            return new CreateTenantDirectoryRequest(this);
        } 

    } 

}
