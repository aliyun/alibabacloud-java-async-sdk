// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetMemoryHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetMemoryHistoryResponseBody</p>
 */
public class GetMemoryHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("results")
    private java.util.List<Results> results;

    private GetMemoryHistoryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMemoryHistoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return results
     */
    public java.util.List<Results> getResults() {
        return this.results;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Results> results; 

        private Builder() {
        } 

        private Builder(GetMemoryHistoryResponseBody model) {
            this.requestId = model.requestId;
            this.results = model.results;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * results.
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        public GetMemoryHistoryResponseBody build() {
            return new GetMemoryHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMemoryHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>GetMemoryHistoryResponseBody</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        private Input(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String content; 
            private String role; 

            private Builder() {
            } 

            private Builder(Input model) {
                this.content = model.content;
                this.role = model.role;
            } 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMemoryHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>GetMemoryHistoryResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("input")
        private java.util.List<Input> input;

        @com.aliyun.core.annotation.NameInMap("memoryId")
        private String memoryId;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private java.util.Map<String, ?> metadata;

        @com.aliyun.core.annotation.NameInMap("newMemory")
        private String newMemory;

        @com.aliyun.core.annotation.NameInMap("oldMemory")
        private String oldMemory;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private Results(Builder builder) {
            this.createdAt = builder.createdAt;
            this.event = builder.event;
            this.id = builder.id;
            this.input = builder.input;
            this.memoryId = builder.memoryId;
            this.metadata = builder.metadata;
            this.newMemory = builder.newMemory;
            this.oldMemory = builder.oldMemory;
            this.updatedAt = builder.updatedAt;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return input
         */
        public java.util.List<Input> getInput() {
            return this.input;
        }

        /**
         * @return memoryId
         */
        public String getMemoryId() {
            return this.memoryId;
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        /**
         * @return newMemory
         */
        public String getNewMemory() {
            return this.newMemory;
        }

        /**
         * @return oldMemory
         */
        public String getOldMemory() {
            return this.oldMemory;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String createdAt; 
            private String event; 
            private String id; 
            private java.util.List<Input> input; 
            private String memoryId; 
            private java.util.Map<String, ?> metadata; 
            private String newMemory; 
            private String oldMemory; 
            private String updatedAt; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.createdAt = model.createdAt;
                this.event = model.event;
                this.id = model.id;
                this.input = model.input;
                this.memoryId = model.memoryId;
                this.metadata = model.metadata;
                this.newMemory = model.newMemory;
                this.oldMemory = model.oldMemory;
                this.updatedAt = model.updatedAt;
                this.userId = model.userId;
            } 

            /**
             * createdAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * input.
             */
            public Builder input(java.util.List<Input> input) {
                this.input = input;
                return this;
            }

            /**
             * memoryId.
             */
            public Builder memoryId(String memoryId) {
                this.memoryId = memoryId;
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
             * newMemory.
             */
            public Builder newMemory(String newMemory) {
                this.newMemory = newMemory;
                return this;
            }

            /**
             * oldMemory.
             */
            public Builder oldMemory(String oldMemory) {
                this.oldMemory = oldMemory;
                return this;
            }

            /**
             * updatedAt.
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
