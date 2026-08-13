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
 * {@link UpdateChatSessionResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateChatSessionResponseBody</p>
 */
public class UpdateChatSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("session")
    private Session session;

    private UpdateChatSessionResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.session = builder.session;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateChatSessionResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return session
     */
    public Session getSession() {
        return this.session;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Session session; 

        private Builder() {
        } 

        private Builder(UpdateChatSessionResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.session = model.session;
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
         * session.
         */
        public Builder session(Session session) {
            this.session = session;
            return this;
        }

        public UpdateChatSessionResponseBody build() {
            return new UpdateChatSessionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateChatSessionResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateChatSessionResponseBody</p>
     */
    public static class Session extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createdAt")
        private Long createdAt;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("isExpired")
        private Boolean isExpired;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private java.util.Map<String, ?> metadata;

        @com.aliyun.core.annotation.NameInMap("model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("object")
        private String object;

        @com.aliyun.core.annotation.NameInMap("objectId")
        private String objectId;

        @com.aliyun.core.annotation.NameInMap("operatingObjectName")
        private java.util.List<String> operatingObjectName;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private Long updatedAt;

        private Session(Builder builder) {
            this.createdAt = builder.createdAt;
            this.id = builder.id;
            this.isExpired = builder.isExpired;
            this.metadata = builder.metadata;
            this.model = builder.model;
            this.object = builder.object;
            this.objectId = builder.objectId;
            this.operatingObjectName = builder.operatingObjectName;
            this.title = builder.title;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Session create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public Long getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return isExpired
         */
        public Boolean getIsExpired() {
            return this.isExpired;
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
        }

        /**
         * @return objectId
         */
        public String getObjectId() {
            return this.objectId;
        }

        /**
         * @return operatingObjectName
         */
        public java.util.List<String> getOperatingObjectName() {
            return this.operatingObjectName;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return updatedAt
         */
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private Long createdAt; 
            private String id; 
            private Boolean isExpired; 
            private java.util.Map<String, ?> metadata; 
            private String model; 
            private String object; 
            private String objectId; 
            private java.util.List<String> operatingObjectName; 
            private String title; 
            private Long updatedAt; 

            private Builder() {
            } 

            private Builder(Session model) {
                this.createdAt = model.createdAt;
                this.id = model.id;
                this.isExpired = model.isExpired;
                this.metadata = model.metadata;
                this.model = model.model;
                this.object = model.object;
                this.objectId = model.objectId;
                this.operatingObjectName = model.operatingObjectName;
                this.title = model.title;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * <p>创建时间</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder createdAt(Long createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>消息ID</p>
             * 
             * <strong>example:</strong>
             * <p>exampleId</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>创建时间是否超过30天</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isExpired(Boolean isExpired) {
                this.isExpired = isExpired;
                return this;
            }

            /**
             * <p>关联对象ID</p>
             * 
             * <strong>example:</strong>
             * <p>exampleObjectId</p>
             */
            public Builder metadata(java.util.Map<String, ?> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>会话使用的抽象模型名（quick/standard/flagship）</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>类型</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * objectId.
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * <p>operatingObjectName</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder operatingObjectName(java.util.List<String> operatingObjectName) {
                this.operatingObjectName = operatingObjectName;
                return this;
            }

            /**
             * <p>标题</p>
             * 
             * <strong>example:</strong>
             * <p>示例标题</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>更新时间</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder updatedAt(Long updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Session build() {
                return new Session(this);
            } 

        } 

    }
}
