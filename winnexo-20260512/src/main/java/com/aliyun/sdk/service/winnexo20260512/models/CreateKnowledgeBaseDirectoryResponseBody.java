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
 * {@link CreateKnowledgeBaseDirectoryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateKnowledgeBaseDirectoryResponseBody</p>
 */
public class CreateKnowledgeBaseDirectoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("directoryId")
    private String directoryId;

    @com.aliyun.core.annotation.NameInMap("directoryKind")
    private String directoryKind;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private Long gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private Long gmtModified;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("parentDirectoryId")
    private String parentDirectoryId;

    @com.aliyun.core.annotation.NameInMap("path")
    private String path;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateKnowledgeBaseDirectoryResponseBody(Builder builder) {
        this.code = builder.code;
        this.description = builder.description;
        this.directoryId = builder.directoryId;
        this.directoryKind = builder.directoryKind;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.message = builder.message;
        this.name = builder.name;
        this.parentDirectoryId = builder.parentDirectoryId;
        this.path = builder.path;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKnowledgeBaseDirectoryResponseBody create() {
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
     * @return directoryKind
     */
    public String getDirectoryKind() {
        return this.directoryKind;
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
     * @return parentDirectoryId
     */
    public String getParentDirectoryId() {
        return this.parentDirectoryId;
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

    public static final class Builder {
        private String code; 
        private String description; 
        private String directoryId; 
        private String directoryKind; 
        private Long gmtCreate; 
        private Long gmtModified; 
        private String message; 
        private String name; 
        private String parentDirectoryId; 
        private String path; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateKnowledgeBaseDirectoryResponseBody model) {
            this.code = model.code;
            this.description = model.description;
            this.directoryId = model.directoryId;
            this.directoryKind = model.directoryKind;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.message = model.message;
            this.name = model.name;
            this.parentDirectoryId = model.parentDirectoryId;
            this.path = model.path;
            this.requestId = model.requestId;
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
         * <p>分类描述</p>
         * 
         * <strong>example:</strong>
         * <p>This is default function description by fc-deploy component</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>新建分类 ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleDirectoryId</p>
         */
        public Builder directoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>目录 KB 归属类型：normal / aliding_kb_root / aliding_kb_internal</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder directoryKind(String directoryKind) {
            this.directoryKind = directoryKind;
            return this;
        }

        /**
         * <p>创建时间戳（毫秒）</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-14T02:18:27Z</p>
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>修改时间戳（毫秒）</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-19T01:48:56Z</p>
         */
        public Builder gmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
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
         * 
         * <strong>example:</strong>
         * <p>p-toolset-89550434-4e20-4e4e-bcac-9ab81b82c5b3</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>父分类 ID；新分类挂在租户根目录下时返回 null</p>
         * 
         * <strong>example:</strong>
         * <p>wd-lxykjnnw4lyl9eq</p>
         */
        public Builder parentDirectoryId(String parentDirectoryId) {
            this.parentDirectoryId = parentDirectoryId;
            return this;
        }

        /**
         * <p>文件 OSS URL</p>
         * 
         * <strong>example:</strong>
         * <p>UVCIpI0siUski9iw</p>
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>C474BFC7-7B11-5D92-971E-74AA82EC495B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateKnowledgeBaseDirectoryResponseBody build() {
            return new CreateKnowledgeBaseDirectoryResponseBody(this);
        } 

    } 

}
