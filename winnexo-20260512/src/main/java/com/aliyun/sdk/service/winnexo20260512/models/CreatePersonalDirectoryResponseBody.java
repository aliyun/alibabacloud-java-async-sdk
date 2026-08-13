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
 * {@link CreatePersonalDirectoryResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePersonalDirectoryResponseBody</p>
 */
public class CreatePersonalDirectoryResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    private String operatingObjectName;

    @com.aliyun.core.annotation.NameInMap("parentDirectoryId")
    private String parentDirectoryId;

    @com.aliyun.core.annotation.NameInMap("path")
    private String path;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreatePersonalDirectoryResponseBody(Builder builder) {
        this.code = builder.code;
        this.description = builder.description;
        this.directoryId = builder.directoryId;
        this.directoryKind = builder.directoryKind;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.message = builder.message;
        this.name = builder.name;
        this.operatingObjectName = builder.operatingObjectName;
        this.parentDirectoryId = builder.parentDirectoryId;
        this.path = builder.path;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePersonalDirectoryResponseBody create() {
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
        private String operatingObjectName; 
        private String parentDirectoryId; 
        private String path; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreatePersonalDirectoryResponseBody model) {
            this.code = model.code;
            this.description = model.description;
            this.directoryId = model.directoryId;
            this.directoryKind = model.directoryKind;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.message = model.message;
            this.name = model.name;
            this.operatingObjectName = model.operatingObjectName;
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
         * <p>目录描述</p>
         * 
         * <strong>example:</strong>
         * <p>PublicApplication</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>新建目录 ID</p>
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
         * <p>2026-03-04 13:54:52</p>
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>修改时间戳（毫秒）</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-14T02:18:27Z</p>
         */
        public Builder gmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>文件名</p>
         * 
         * <strong>example:</strong>
         * <p>conn_ip_101</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>所属数字员工名称</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder operatingObjectName(String operatingObjectName) {
            this.operatingObjectName = operatingObjectName;
            return this;
        }

        /**
         * <p>父目录 ID（service 若回填默认根目录，这里返回回填后的父目录 ID）</p>
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
         * <p>oss://clg-paimon-4a00f1ac43464714b86fb54ca41a84c9/db-abc73646-6a08-4b96-820f-3d1d547a1e3b.db/tbl-c8a33522-5398-4f8e-9a2a-fba1efad94d1</p>
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>375701FC-2FB9-5782-BE8F-A3F5E2F2158C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePersonalDirectoryResponseBody build() {
            return new CreatePersonalDirectoryResponseBody(this);
        } 

    } 

}
