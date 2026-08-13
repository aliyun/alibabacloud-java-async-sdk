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
        this.description = builder.description;
        this.directoryId = builder.directoryId;
        this.name = builder.name;
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
        private String description; 
        private String directoryId; 
        private String name; 
        private Long parentId; 
        private String path; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTenantDirectoryRequest request) {
            super(request);
            this.description = request.description;
            this.directoryId = request.directoryId;
            this.name = request.name;
            this.parentId = request.parentId;
            this.path = request.path;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>新目录描述</p>
         * 
         * <strong>example:</strong>
         * <p>示例描述</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>目录唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>exampleDirectoryId</p>
         */
        public Builder directoryId(String directoryId) {
            this.putBodyParameter("directoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>文件名</p>
         * 
         * <strong>example:</strong>
         * <p>示例名称.pdf</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>新父目录内部主键</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder parentId(Long parentId) {
            this.putBodyParameter("parentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * <p>文件 OSS URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/oss/file.pdf">https://example.com/oss/file.pdf</a></p>
         */
        public Builder path(String path) {
            this.putBodyParameter("path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
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
