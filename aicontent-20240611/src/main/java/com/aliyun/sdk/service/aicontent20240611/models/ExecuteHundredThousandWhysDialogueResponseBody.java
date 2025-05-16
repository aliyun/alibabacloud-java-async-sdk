// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ExecuteHundredThousandWhysDialogueResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteHundredThousandWhysDialogueResponseBody</p>
 */
public class ExecuteHundredThousandWhysDialogueResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("choices")
    private java.util.List<Choices> choices;

    @com.aliyun.core.annotation.NameInMap("created")
    private Long created;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("model")
    private String model;

    @com.aliyun.core.annotation.NameInMap("object")
    private String object;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ExecuteHundredThousandWhysDialogueResponseBody(Builder builder) {
        this.choices = builder.choices;
        this.created = builder.created;
        this.id = builder.id;
        this.model = builder.model;
        this.object = builder.object;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteHundredThousandWhysDialogueResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return choices
     */
    public java.util.List<Choices> getChoices() {
        return this.choices;
    }

    /**
     * @return created
     */
    public Long getCreated() {
        return this.created;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Choices> choices; 
        private Long created; 
        private String id; 
        private String model; 
        private String object; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ExecuteHundredThousandWhysDialogueResponseBody model) {
            this.choices = model.choices;
            this.created = model.created;
            this.id = model.id;
            this.model = model.model;
            this.object = model.object;
            this.requestId = model.requestId;
        } 

        /**
         * choices.
         */
        public Builder choices(java.util.List<Choices> choices) {
            this.choices = choices;
            return this;
        }

        /**
         * created.
         */
        public Builder created(Long created) {
            this.created = created;
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
         * model.
         */
        public Builder model(String model) {
            this.model = model;
            return this;
        }

        /**
         * object.
         */
        public Builder object(String object) {
            this.object = object;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>DBFA232A-1176-50E6-95AE-50F7A62A28AD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExecuteHundredThousandWhysDialogueResponseBody build() {
            return new ExecuteHundredThousandWhysDialogueResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExecuteHundredThousandWhysDialogueResponseBody} extends {@link TeaModel}
     *
     * <p>ExecuteHundredThousandWhysDialogueResponseBody</p>
     */
    public static class Delta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        private Delta(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Delta create() {
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

            private Builder(Delta model) {
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

            public Delta build() {
                return new Delta(this);
            } 

        } 

    }
    /**
     * 
     * {@link ExecuteHundredThousandWhysDialogueResponseBody} extends {@link TeaModel}
     *
     * <p>ExecuteHundredThousandWhysDialogueResponseBody</p>
     */
    public static class Choices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("delta")
        private Delta delta;

        @com.aliyun.core.annotation.NameInMap("finish_reason")
        private String finishReason;

        @com.aliyun.core.annotation.NameInMap("index")
        private Long index;

        private Choices(Builder builder) {
            this.delta = builder.delta;
            this.finishReason = builder.finishReason;
            this.index = builder.index;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Choices create() {
            return builder().build();
        }

        /**
         * @return delta
         */
        public Delta getDelta() {
            return this.delta;
        }

        /**
         * @return finishReason
         */
        public String getFinishReason() {
            return this.finishReason;
        }

        /**
         * @return index
         */
        public Long getIndex() {
            return this.index;
        }

        public static final class Builder {
            private Delta delta; 
            private String finishReason; 
            private Long index; 

            private Builder() {
            } 

            private Builder(Choices model) {
                this.delta = model.delta;
                this.finishReason = model.finishReason;
                this.index = model.index;
            } 

            /**
             * delta.
             */
            public Builder delta(Delta delta) {
                this.delta = delta;
                return this;
            }

            /**
             * finish_reason.
             */
            public Builder finishReason(String finishReason) {
                this.finishReason = finishReason;
                return this;
            }

            /**
             * index.
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            public Choices build() {
                return new Choices(this);
            } 

        } 

    }
}
