// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20230516.models;

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
 * {@link TaskCallChatsResponseBody} extends {@link TeaModel}
 *
 * <p>TaskCallChatsResponseBody</p>
 */
public class TaskCallChatsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private java.util.List<Model> model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private Long timestamp;

    private TaskCallChatsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.timestamp = builder.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TaskCallChatsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public java.util.List<Model> getModel() {
        return this.model;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return timestamp
     */
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static final class Builder {
        private Long code; 
        private String message; 
        private java.util.List<Model> model; 
        private String requestId; 
        private Boolean success; 
        private Long timestamp; 

        private Builder() {
        } 

        private Builder(TaskCallChatsResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.model = model.model;
            this.requestId = model.requestId;
            this.success = model.success;
            this.timestamp = model.timestamp;
        } 

        /**
         * Code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(java.util.List<Model> model) {
            this.model = model;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Timestamp.
         */
        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public TaskCallChatsResponseBody build() {
            return new TaskCallChatsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TaskCallChatsResponseBody} extends {@link TeaModel}
     *
     * <p>TaskCallChatsResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("FromNumber")
        private String fromNumber;

        private Model(Builder builder) {
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.fromNumber = builder.fromNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return fromNumber
         */
        public String getFromNumber() {
            return this.fromNumber;
        }

        public static final class Builder {
            private String content; 
            private String createTime; 
            private String fromNumber; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.content = model.content;
                this.createTime = model.createTime;
                this.fromNumber = model.fromNumber;
            } 

            /**
             * <p>说话内容</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>说话时间</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-13 14:56:46.604</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>说话号码</p>
             * 
             * <strong>example:</strong>
             * <p>138*****265</p>
             */
            public Builder fromNumber(String fromNumber) {
                this.fromNumber = fromNumber;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
