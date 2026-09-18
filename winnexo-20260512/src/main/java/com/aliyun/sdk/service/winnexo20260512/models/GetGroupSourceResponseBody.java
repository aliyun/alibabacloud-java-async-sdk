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
 * {@link GetGroupSourceResponseBody} extends {@link TeaModel}
 *
 * <p>GetGroupSourceResponseBody</p>
 */
public class GetGroupSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("scope")
    private String scope;

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

    private GetGroupSourceResponseBody(Builder builder) {
        this.code = builder.code;
        this.description = builder.description;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.groupId = builder.groupId;
        this.message = builder.message;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.scope = builder.scope;
        this.sourceId = builder.sourceId;
        this.sourceKind = builder.sourceKind;
        this.sourceTags = builder.sourceTags;
        this.sourceType = builder.sourceType;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGroupSourceResponseBody create() {
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
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
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
     * @return scope
     */
    public String getScope() {
        return this.scope;
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

    public static final class Builder {
        private String code; 
        private String description; 
        private String gmtCreate; 
        private String gmtModified; 
        private String groupId; 
        private String message; 
        private String name; 
        private String requestId; 
        private String scope; 
        private String sourceId; 
        private String sourceKind; 
        private String sourceTags; 
        private String sourceType; 
        private String status; 

        private Builder() {
        } 

        private Builder(GetGroupSourceResponseBody model) {
            this.code = model.code;
            this.description = model.description;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.groupId = model.groupId;
            this.message = model.message;
            this.name = model.name;
            this.requestId = model.requestId;
            this.scope = model.scope;
            this.sourceId = model.sourceId;
            this.sourceKind = model.sourceKind;
            this.sourceTags = model.sourceTags;
            this.sourceType = model.sourceType;
            this.status = model.status;
        } 

        /**
         * <p>业务状态码</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>资料描述</p>
         * 
         * <strong>example:</strong>
         * <p>recorder function</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>创建时间，ISO8601格式</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-26T10:00:00+08:00</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>修改时间，ISO8601格式</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-20T14:00:00+08:00</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>本次授权读取的协作空间ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleGroupId</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>错误描述</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>资料名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例名称.pdf</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>请求追踪ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>资料实际范围；引用资料保留 PERSONAL 或 TENANT</p>
         * 
         * <strong>example:</strong>
         * <p>GROUP</p>
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * <p>资料ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSourceId</p>
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>知识归属类型，沿用 Source 分类</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder sourceKind(String sourceKind) {
            this.sourceKind = sourceKind;
            return this;
        }

        /**
         * <p>资料标签JSON字符串列表</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;重点&quot;,&quot;文档&quot;]</p>
         */
        public Builder sourceTags(String sourceTags) {
            this.sourceTags = sourceTags;
            return this;
        }

        /**
         * <p>资料类型，例如 TEXT、FILE、ONLINE_DOC、FEISHU</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>当前资料状态，例如 READY、RUNNING、FAILED</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetGroupSourceResponseBody build() {
            return new GetGroupSourceResponseBody(this);
        } 

    } 

}
