// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link CheckCopyRuleVariableResponseBody} extends {@link TeaModel}
 *
 * <p>CheckCopyRuleVariableResponseBody</p>
 */
public class CheckCopyRuleVariableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private CheckCopyRuleVariableResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckCopyRuleVariableResponseBody create() {
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
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private ResultObject resultObject; 

        private Builder() {
        } 

        private Builder(CheckCopyRuleVariableResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned result information</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public CheckCopyRuleVariableResponseBody build() {
            return new CheckCopyRuleVariableResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckCopyRuleVariableResponseBody} extends {@link TeaModel}
     *
     * <p>CheckCopyRuleVariableResponseBody</p>
     */
    public static class Message extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Message(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Message create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long id; 
            private String name; 
            private String title; 
            private String type; 

            private Builder() {
            } 

            private Builder(Message model) {
                this.id = model.id;
                this.name = model.name;
                this.title = model.title;
                this.type = model.type;
            } 

            /**
             * <p>Primary key ID of the variable</p>
             * 
             * <strong>example:</strong>
             * <p>213</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Name of the variable</p>
             * 
             * <strong>example:</strong>
             * <p>age</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Title of the variable</p>
             * 
             * <strong>example:</strong>
             * <p>年龄</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>Type of the variable</p>
             * 
             * <strong>example:</strong>
             * <p>NATIVE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Message build() {
                return new Message(this);
            } 

        } 

    }
    /**
     * 
     * {@link CheckCopyRuleVariableResponseBody} extends {@link TeaModel}
     *
     * <p>CheckCopyRuleVariableResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private java.util.List<Message> message;

        private ResultObject(Builder builder) {
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public java.util.List<Message> getMessage() {
            return this.message;
        }

        public static final class Builder {
            private java.util.List<Message> message; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.message = model.message;
            } 

            /**
             * <p>Information.</p>
             */
            public Builder message(java.util.List<Message> message) {
                this.message = message;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
