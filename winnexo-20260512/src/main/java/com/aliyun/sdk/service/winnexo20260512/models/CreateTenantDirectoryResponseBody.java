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
 * {@link CreateTenantDirectoryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTenantDirectoryResponseBody</p>
 */
public class CreateTenantDirectoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("directoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String directoryId;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private Long gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private Long gmtModified;

    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    private String operatingObjectName;

    @com.aliyun.core.annotation.NameInMap("parentId")
    private Long parentId;

    @com.aliyun.core.annotation.NameInMap("path")
    @com.aliyun.core.annotation.Validation(required = true)
    private String path;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("tenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long tenantId;

    @com.aliyun.core.annotation.NameInMap("userId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long userId;

    private CreateTenantDirectoryResponseBody(Builder builder) {
        this.code = builder.code;
        this.description = builder.description;
        this.directoryId = builder.directoryId;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.message = builder.message;
        this.name = builder.name;
        this.operatingObjectName = builder.operatingObjectName;
        this.parentId = builder.parentId;
        this.path = builder.path;
        this.requestId = builder.requestId;
        this.tenantId = builder.tenantId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTenantDirectoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return gmtCreate
     */
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public Long getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String code; 
        private String description; 
        private String directoryId; 
        private Long gmtCreate; 
        private Long gmtModified; 
        private Long id; 
        private String message; 
        private String name; 
        private String operatingObjectName; 
        private Long parentId; 
        private String path; 
        private String requestId; 
        private Long tenantId; 
        private Long userId; 

        private Builder() {
        } 

        private Builder(CreateTenantDirectoryResponseBody model) {
            this.code = model.code;
            this.description = model.description;
            this.directoryId = model.directoryId;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.id = model.id;
            this.message = model.message;
            this.name = model.name;
            this.operatingObjectName = model.operatingObjectName;
            this.parentId = model.parentId;
            this.path = model.path;
            this.requestId = model.requestId;
            this.tenantId = model.tenantId;
            this.userId = model.userId;
        } 

        /**
         * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>目录描述</p>
         * 
         * <strong>example:</strong>
         * <p>示例描述</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>目录唯一标识</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleDirectoryId</p>
         */
        public Builder directoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>创建时间戳</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>修改时间戳</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder gmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>文件名</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例名称.pdf</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>历史运营对象名称</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder operatingObjectName(String operatingObjectName) {
            this.operatingObjectName = operatingObjectName;
            return this;
        }

        /**
         * <p>父目录内部主键</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder parentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }

        /**
         * <p>文件 OSS URL</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/oss/file.pdf">https://example.com/oss/file.pdf</a></p>
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>租户 ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>创建人用户 ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public CreateTenantDirectoryResponseBody build() {
            return new CreateTenantDirectoryResponseBody(this);
        } 

    } 

}
