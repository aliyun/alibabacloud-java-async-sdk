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
 * {@link CreateKnowledgeBaseAliDingDocResponseBody} extends {@link TeaModel}
 *
 * <p>CreateKnowledgeBaseAliDingDocResponseBody</p>
 */
public class CreateKnowledgeBaseAliDingDocResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("directoryId")
    private String directoryId;

    @com.aliyun.core.annotation.NameInMap("filePublicUrl")
    private String filePublicUrl;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

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

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private CreateKnowledgeBaseAliDingDocResponseBody(Builder builder) {
        this.code = builder.code;
        this.directoryId = builder.directoryId;
        this.filePublicUrl = builder.filePublicUrl;
        this.gmtCreate = builder.gmtCreate;
        this.message = builder.message;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.scope = builder.scope;
        this.sourceId = builder.sourceId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKnowledgeBaseAliDingDocResponseBody create() {
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
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return filePublicUrl
     */
    public String getFilePublicUrl() {
        return this.filePublicUrl;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String code; 
        private String directoryId; 
        private String filePublicUrl; 
        private String gmtCreate; 
        private String message; 
        private String name; 
        private String requestId; 
        private String scope; 
        private String sourceId; 
        private String status; 

        private Builder() {
        } 

        private Builder(CreateKnowledgeBaseAliDingDocResponseBody model) {
            this.code = model.code;
            this.directoryId = model.directoryId;
            this.filePublicUrl = model.filePublicUrl;
            this.gmtCreate = model.gmtCreate;
            this.message = model.message;
            this.name = model.name;
            this.requestId = model.requestId;
            this.scope = model.scope;
            this.sourceId = model.sourceId;
            this.status = model.status;
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
         * <p>绑定的目录 ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleDirectoryId</p>
         */
        public Builder directoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>文档公开 URL（echo 回入参）</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
         */
        public Builder filePublicUrl(String filePublicUrl) {
            this.filePublicUrl = filePublicUrl;
            return this;
        }

        /**
         * <p>创建时间 ISO8601</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-22 16:03:27</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>资源显示名称</p>
         * 
         * <strong>example:</strong>
         * <p>p-toolset-b8a1de80-e9f5-49f3-8a12-873d378889c6</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>F42FC60B-C54D-5DFB-A8EC-04625BFFF1F7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>资源 scope，固定为 TENANT</p>
         * 
         * <strong>example:</strong>
         * <p>repo</p>
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * <p>新建资源 ID</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>资源状态</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;observedGeneration&quot;: 7, &quot;servicesInstances&quot;: {}, &quot;observedTime&quot;: &quot;2025-12-17T11:57:07Z&quot;, &quot;servicesWithPendingChanges&quot;: [], &quot;latestEnvironmentDeploymentName&quot;: &quot;manual-1765972627273-k7GZvr&quot;}</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CreateKnowledgeBaseAliDingDocResponseBody build() {
            return new CreateKnowledgeBaseAliDingDocResponseBody(this);
        } 

    } 

}
