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
 * {@link CreatePersonalAlidingKnowledgeBaseResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePersonalAlidingKnowledgeBaseResponseBody</p>
 */
public class CreatePersonalAlidingKnowledgeBaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("directoryId")
    private String directoryId;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("kbUrl")
    private String kbUrl;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    private String operatingObjectName;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private CreatePersonalAlidingKnowledgeBaseResponseBody(Builder builder) {
        this.code = builder.code;
        this.directoryId = builder.directoryId;
        this.gmtCreate = builder.gmtCreate;
        this.kbUrl = builder.kbUrl;
        this.message = builder.message;
        this.name = builder.name;
        this.operatingObjectName = builder.operatingObjectName;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePersonalAlidingKnowledgeBaseResponseBody create() {
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
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return kbUrl
     */
    public String getKbUrl() {
        return this.kbUrl;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String gmtCreate; 
        private String kbUrl; 
        private String message; 
        private String name; 
        private String operatingObjectName; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(CreatePersonalAlidingKnowledgeBaseResponseBody model) {
            this.code = model.code;
            this.directoryId = model.directoryId;
            this.gmtCreate = model.gmtCreate;
            this.kbUrl = model.kbUrl;
            this.message = model.message;
            this.name = model.name;
            this.operatingObjectName = model.operatingObjectName;
            this.requestId = model.requestId;
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
         * <p>新建知识库根目录 ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleDirectoryId</p>
         */
        public Builder directoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>创建时间 ISO8601</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-14T02:18:27Z</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>知识库 URL（echo 回入参，便于调用方对齐）</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
         */
        public Builder kbUrl(String kbUrl) {
            this.kbUrl = kbUrl;
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
         * <p>p-toolset-3dcef7ca-31b9-4d1c-8692-1ef03099cad3</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>所属数字员工名称（echo 回入参，可为 null）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder operatingObjectName(String operatingObjectName) {
            this.operatingObjectName = operatingObjectName;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>E68654BD-F7BA-5837-8686-5645D739A47C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>知识库根目录状态（创建后为 RUNNING；后台同步完成后转 READY 或 FAILED）</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CreatePersonalAlidingKnowledgeBaseResponseBody build() {
            return new CreatePersonalAlidingKnowledgeBaseResponseBody(this);
        } 

    } 

}
