// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sfmmultimodalapp20250909.models;

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
 * {@link CreateMemoryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMemoryResponseBody</p>
 */
public class CreateMemoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateMemoryResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMemoryResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateMemoryResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public CreateMemoryResponseBody build() {
            return new CreateMemoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateMemoryResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMemoryResponseBody</p>
     */
    public static class MemoryNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("MemoryNodeId")
        private String memoryNodeId;

        private MemoryNodes(Builder builder) {
            this.content = builder.content;
            this.event = builder.event;
            this.memoryNodeId = builder.memoryNodeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemoryNodes create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return memoryNodeId
         */
        public String getMemoryNodeId() {
            return this.memoryNodeId;
        }

        public static final class Builder {
            private String content; 
            private String event; 
            private String memoryNodeId; 

            private Builder() {
            } 

            private Builder(MemoryNodes model) {
                this.content = model.content;
                this.event = model.event;
                this.memoryNodeId = model.memoryNodeId;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * MemoryNodeId.
             */
            public Builder memoryNodeId(String memoryNodeId) {
                this.memoryNodeId = memoryNodeId;
                return this;
            }

            public MemoryNodes build() {
                return new MemoryNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMemoryResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMemoryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MemoryNodes")
        private java.util.List<MemoryNodes> memoryNodes;

        private Data(Builder builder) {
            this.memoryNodes = builder.memoryNodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return memoryNodes
         */
        public java.util.List<MemoryNodes> getMemoryNodes() {
            return this.memoryNodes;
        }

        public static final class Builder {
            private java.util.List<MemoryNodes> memoryNodes; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.memoryNodes = model.memoryNodes;
            } 

            /**
             * MemoryNodes.
             */
            public Builder memoryNodes(java.util.List<MemoryNodes> memoryNodes) {
                this.memoryNodes = memoryNodes;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
