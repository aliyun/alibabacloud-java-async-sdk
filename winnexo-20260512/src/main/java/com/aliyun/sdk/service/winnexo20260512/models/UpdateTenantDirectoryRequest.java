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
 * {@link UpdateTenantDirectoryRequest} extends {@link RequestModel}
 *
 * <p>UpdateTenantDirectoryRequest</p>
 */
public class UpdateTenantDirectoryRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("directoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
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

    private UpdateTenantDirectoryRequest(Builder builder) {
        super(builder);
        this.appToken = builder.appToken;
        this.changeRecordEnabled = builder.changeRecordEnabled;
        this.description = builder.description;
        this.directoryId = builder.directoryId;
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

    public static UpdateTenantDirectoryRequest create() {
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
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
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

    public static final class Builder extends Request.Builder<UpdateTenantDirectoryRequest, Builder> {
        private String appToken; 
        private Boolean changeRecordEnabled; 
        private String description; 
        private String directoryId; 
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

        private Builder(UpdateTenantDirectoryRequest request) {
            super(request);
            this.appToken = request.appToken;
            this.changeRecordEnabled = request.changeRecordEnabled;
            this.description = request.description;
            this.directoryId = request.directoryId;
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
         * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
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
         * <p>后续内容更新的AI版本摘要开关；false关闭，未传/null保持既有语义，不删除既有摘要</p>
         */
        public Builder changeRecordEnabled(Boolean changeRecordEnabled) {
            this.putBodyParameter("changeRecordEnabled", changeRecordEnabled);
            this.changeRecordEnabled = changeRecordEnabled;
            return this;
        }

        /**
         * <p>The new directory description. If this parameter is omitted or set to null, the original value is retained.</p>
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
         * <p>The business ID of the enterprise knowledge base directory for the current tenant, which is not the internal primary key. When digital employee associations or version summary configurations are included, the target must be the root directory of a standard enterprise knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-example</p>
         */
        public Builder directoryId(String directoryId) {
            this.putBodyParameter("directoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The new directory name. It can be up to 256 characters in length. If this parameter is omitted or set to null, the original value is retained.</p>
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
         * <p>数字员工关联模式；仅普通企业知识库根可设置。未传/null保持既有语义；SPECIFIED须显式提供名单，ALL仅允许省略或空名单</p>
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
         * <p>数字员工内部名称列表，最多100项，每项非空且最多256字符；SPECIFIED空数组表示不关联任何员工，非空名单按去重后全量替换</p>
         */
        public Builder operatingObjectNames(java.util.List<String> operatingObjectNames) {
            String operatingObjectNamesShrink = shrink(operatingObjectNames, "operatingObjectNames", "json");
            this.putBodyParameter("operatingObjectNames", operatingObjectNamesShrink);
            this.operatingObjectNames = operatingObjectNames;
            return this;
        }

        /**
         * <p>代理用户编码（租户内唯一），仅当应用凭证配置为 source_uid 时使用</p>
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
         * <p>代理用户ID（WINNEXO 平台用户ID），仅当应用凭证配置为 winnexo_uid 时使用</p>
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
         * <p>The internal primary key of the new parent folder. If this parameter is omitted or set to null, the original parent folder is retained. If a non-null value is passed, knowledge base management permissions for the target parent folder are required. This parameter cannot be committed at the same time as the digital employee associate or version summary configurations.</p>
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
         * <p>The new directory path. If this parameter is omitted or set to null, a new path is not explicitly specified and is processed by the directory service.</p>
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
         * <p>The ID of the target tenant. It is used for tenant routing in public requests. The server-side authentication chain verifies access permissions. You cannot use this parameter to access unauthorized tenants.</p>
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
        public UpdateTenantDirectoryRequest build() {
            return new UpdateTenantDirectoryRequest(this);
        } 

    } 

}
