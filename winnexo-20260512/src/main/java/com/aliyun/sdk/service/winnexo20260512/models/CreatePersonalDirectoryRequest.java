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
 * {@link CreatePersonalDirectoryRequest} extends {@link RequestModel}
 *
 * <p>CreatePersonalDirectoryRequest</p>
 */
public class CreatePersonalDirectoryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    private String operatingObjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parentDirectoryId")
    private String parentDirectoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private CreatePersonalDirectoryRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
        this.operatingObjectName = builder.operatingObjectName;
        this.parentDirectoryId = builder.parentDirectoryId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePersonalDirectoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return operatingObjectName
     */
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    /**
     * @return parentDirectoryId
     */
    public String getParentDirectoryId() {
        return this.parentDirectoryId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<CreatePersonalDirectoryRequest, Builder> {
        private String description; 
        private String name; 
        private String operatingObjectName; 
        private String parentDirectoryId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePersonalDirectoryRequest request) {
            super(request);
            this.description = request.description;
            this.name = request.name;
            this.operatingObjectName = request.operatingObjectName;
            this.parentDirectoryId = request.parentDirectoryId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>目录描述（可选）</p>
         * 
         * <strong>example:</strong>
         * <p>hangzhou-release-version-3-eventbridge-numeric-queue-fix-20260529</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>目录名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sandbox-conversation-webpage-github-default-p32JG2</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>数字员工名称（已废弃：不再作为个人资源隔离条件，仅保留用于来源追溯）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder operatingObjectName(String operatingObjectName) {
            this.putBodyParameter("operatingObjectName", operatingObjectName);
            this.operatingObjectName = operatingObjectName;
            return this;
        }

        /**
         * <p>父目录 ID；不传时新目录挂在用户的默认根目录下，传入时必须是当前用户的已有个人目录</p>
         * 
         * <strong>example:</strong>
         * <p>wd-lxykjnnw4lyl9eq</p>
         */
        public Builder parentDirectoryId(String parentDirectoryId) {
            this.putBodyParameter("parentDirectoryId", parentDirectoryId);
            this.parentDirectoryId = parentDirectoryId;
            return this;
        }

        /**
         * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
         * 
         * <strong>example:</strong>
         * <p>235454102432001</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public CreatePersonalDirectoryRequest build() {
            return new CreatePersonalDirectoryRequest(this);
        } 

    } 

}
