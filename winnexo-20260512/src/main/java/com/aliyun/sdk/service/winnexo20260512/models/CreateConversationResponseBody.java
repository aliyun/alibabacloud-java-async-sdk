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
 * {@link CreateConversationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateConversationResponseBody</p>
 */
public class CreateConversationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("conversationId")
    private String conversationId;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("metadata")
    private java.util.Map<String, ?> metadata;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    private CreateConversationResponseBody(Builder builder) {
        this.code = builder.code;
        this.conversationId = builder.conversationId;
        this.createdAt = builder.createdAt;
        this.message = builder.message;
        this.metadata = builder.metadata;
        this.requestId = builder.requestId;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConversationResponseBody create() {
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
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return metadata
     */
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder {
        private String code; 
        private String conversationId; 
        private String createdAt; 
        private String message; 
        private java.util.Map<String, ?> metadata; 
        private String requestId; 
        private String title; 

        private Builder() {
        } 

        private Builder(CreateConversationResponseBody model) {
            this.code = model.code;
            this.conversationId = model.conversationId;
            this.createdAt = model.createdAt;
            this.message = model.message;
            this.metadata = model.metadata;
            this.requestId = model.requestId;
            this.title = model.title;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>3a59769c-e631-4b48-84f3-c9bf3a8ae940</p>
         */
        public Builder conversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }

        /**
         * <p>会话创建时间戳（秒）</p>
         * 
         * <strong>example:</strong>
         * <p>1784513941206</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>The current zone list is illegal.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * metadata.
         */
        public Builder metadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>A5241B90-8FF4-565C-977A-0CE1842AED72</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>会话标题（已按调用方语言国际化）</p>
         * 
         * <strong>example:</strong>
         * <p>Incident RCA: alert-0885feb7-3d4b-4da5-90f0-0119dfbbf555:up0shc25tp0kueo0afeobvhk81</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public CreateConversationResponseBody build() {
            return new CreateConversationResponseBody(this);
        } 

    } 

}
