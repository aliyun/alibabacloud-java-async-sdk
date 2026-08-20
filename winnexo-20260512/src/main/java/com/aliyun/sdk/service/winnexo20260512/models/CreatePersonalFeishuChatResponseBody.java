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
 * {@link CreatePersonalFeishuChatResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePersonalFeishuChatResponseBody</p>
 */
public class CreatePersonalFeishuChatResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("chatId")
    private String chatId;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("directoryId")
    private String directoryId;

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

    private CreatePersonalFeishuChatResponseBody(Builder builder) {
        this.chatId = builder.chatId;
        this.code = builder.code;
        this.directoryId = builder.directoryId;
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

    public static CreatePersonalFeishuChatResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chatId
     */
    public String getChatId() {
        return this.chatId;
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
        private String chatId; 
        private String code; 
        private String directoryId; 
        private String gmtCreate; 
        private String message; 
        private String name; 
        private String requestId; 
        private String scope; 
        private String sourceId; 
        private String status; 

        private Builder() {
        } 

        private Builder(CreatePersonalFeishuChatResponseBody model) {
            this.chatId = model.chatId;
            this.code = model.code;
            this.directoryId = model.directoryId;
            this.gmtCreate = model.gmtCreate;
            this.message = model.message;
            this.name = model.name;
            this.requestId = model.requestId;
            this.scope = model.scope;
            this.sourceId = model.sourceId;
            this.status = model.status;
        } 

        /**
         * <p>飞书群聊 ID</p>
         * 
         * <strong>example:</strong>
         * <p>oc_abc123</p>
         */
        public Builder chatId(String chatId) {
            this.chatId = chatId;
            return this;
        }

        /**
         * <p>业务状态码：成功为 200，失败为后端错误码</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>请求指定的目标个人目录 ID；默认根目录场景为空</p>
         * 
         * <strong>example:</strong>
         * <p>dir_personal_1</p>
         */
        public Builder directoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>创建时间 ISO8601</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-18T10:30:00+08:00</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
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
         * <p>资源名称；成功拉取群信息后为飞书群名</p>
         * 
         * <strong>example:</strong>
         * <p>产品研发群</p>
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
         * <p>资源范围，固定为 PERSONAL</p>
         * 
         * <strong>example:</strong>
         * <p>PERSONAL</p>
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * <p>新建 Source ID</p>
         * 
         * <strong>example:</strong>
         * <p>src_feishu_1</p>
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>资源状态</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CreatePersonalFeishuChatResponseBody build() {
            return new CreatePersonalFeishuChatResponseBody(this);
        } 

    } 

}
