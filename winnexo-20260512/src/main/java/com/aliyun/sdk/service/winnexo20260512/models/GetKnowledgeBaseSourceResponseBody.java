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
 * {@link GetKnowledgeBaseSourceResponseBody} extends {@link TeaModel}
 *
 * <p>GetKnowledgeBaseSourceResponseBody</p>
 */
public class GetKnowledgeBaseSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("directoryId")
    private String directoryId;

    @com.aliyun.core.annotation.NameInMap("directoryPath")
    private String directoryPath;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private Long gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private Long gmtModified;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sourceId")
    private String sourceId;

    @com.aliyun.core.annotation.NameInMap("sourceKind")
    private String sourceKind;

    @com.aliyun.core.annotation.NameInMap("sourceTags")
    private String sourceTags;

    @com.aliyun.core.annotation.NameInMap("sourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("statusMessage")
    private String statusMessage;

    private GetKnowledgeBaseSourceResponseBody(Builder builder) {
        this.code = builder.code;
        this.description = builder.description;
        this.directoryId = builder.directoryId;
        this.directoryPath = builder.directoryPath;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.message = builder.message;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.sourceId = builder.sourceId;
        this.sourceKind = builder.sourceKind;
        this.sourceTags = builder.sourceTags;
        this.sourceType = builder.sourceType;
        this.status = builder.status;
        this.statusMessage = builder.statusMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKnowledgeBaseSourceResponseBody create() {
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
     * @return directoryPath
     */
    public String getDirectoryPath() {
        return this.directoryPath;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return sourceKind
     */
    public String getSourceKind() {
        return this.sourceKind;
    }

    /**
     * @return sourceTags
     */
    public String getSourceTags() {
        return this.sourceTags;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return statusMessage
     */
    public String getStatusMessage() {
        return this.statusMessage;
    }

    public static final class Builder {
        private String code; 
        private String description; 
        private String directoryId; 
        private String directoryPath; 
        private Long gmtCreate; 
        private Long gmtModified; 
        private String message; 
        private String name; 
        private String requestId; 
        private String sourceId; 
        private String sourceKind; 
        private String sourceTags; 
        private String sourceType; 
        private String status; 
        private String statusMessage; 

        private Builder() {
        } 

        private Builder(GetKnowledgeBaseSourceResponseBody model) {
            this.code = model.code;
            this.description = model.description;
            this.directoryId = model.directoryId;
            this.directoryPath = model.directoryPath;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.message = model.message;
            this.name = model.name;
            this.requestId = model.requestId;
            this.sourceId = model.sourceId;
            this.sourceKind = model.sourceKind;
            this.sourceTags = model.sourceTags;
            this.sourceType = model.sourceType;
            this.status = model.status;
            this.statusMessage = model.statusMessage;
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
         * <p>知识描述</p>
         * 
         * <strong>example:</strong>
         * <p>示例描述</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>所属分类 ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleDirectoryId</p>
         */
        public Builder directoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>所属分类完整路径</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder directoryPath(String directoryPath) {
            this.directoryPath = directoryPath;
            return this;
        }

        /**
         * <p>创建时间戳（毫秒）</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>修改时间戳（毫秒）</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>示例名称.pdf</p>
         */
        public Builder name(String name) {
            this.name = name;
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
         * <p>知识 ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSourceId</p>
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>知识 KB 归属类型：aliding_kb_doc（阿里钉知识库文档）/ normal（普通知识）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder sourceKind(String sourceKind) {
            this.sourceKind = sourceKind;
            return this;
        }

        /**
         * <p>知识标签（JSON 字符串列表）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder sourceTags(String sourceTags) {
            this.sourceTags = sourceTags;
            return this;
        }

        /**
         * <p>知识类型（TEXT / FILE / ONLINE_DOC 等）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>处理状态（READY / RUNNING / FAILED 等）</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>状态附加信息（如失败原因）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder statusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }

        public GetKnowledgeBaseSourceResponseBody build() {
            return new GetKnowledgeBaseSourceResponseBody(this);
        } 

    } 

}
