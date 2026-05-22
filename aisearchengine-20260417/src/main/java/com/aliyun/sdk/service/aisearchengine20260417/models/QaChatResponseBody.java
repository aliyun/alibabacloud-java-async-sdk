// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aisearchengine20260417.models;

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
 * {@link QaChatResponseBody} extends {@link TeaModel}
 *
 * <p>QaChatResponseBody</p>
 */
public class QaChatResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("event")
    private String event;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    private QaChatResponseBody(Builder builder) {
        this.data = builder.data;
        this.event = builder.event;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QaChatResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private Data data; 
        private String event; 
        private String id; 

        private Builder() {
        } 

        private Builder(QaChatResponseBody model) {
            this.data = model.data;
            this.event = model.event;
            this.id = model.id;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public QaChatResponseBody build() {
            return new QaChatResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QaChatResponseBody} extends {@link TeaModel}
     *
     * <p>QaChatResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private String data;

        @com.aliyun.core.annotation.NameInMap("delta")
        private String delta;

        @com.aliyun.core.annotation.NameInMap("errorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("errorText")
        private String errorText;

        @com.aliyun.core.annotation.NameInMap("finishReason")
        private String finishReason;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("requestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("retryable")
        private Boolean retryable;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Data(Builder builder) {
            this.data = builder.data;
            this.delta = builder.delta;
            this.errorCode = builder.errorCode;
            this.errorText = builder.errorText;
            this.finishReason = builder.finishReason;
            this.id = builder.id;
            this.requestId = builder.requestId;
            this.retryable = builder.retryable;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        /**
         * @return delta
         */
        public String getDelta() {
            return this.delta;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorText
         */
        public String getErrorText() {
            return this.errorText;
        }

        /**
         * @return finishReason
         */
        public String getFinishReason() {
            return this.finishReason;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return retryable
         */
        public Boolean getRetryable() {
            return this.retryable;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String data; 
            private String delta; 
            private String errorCode; 
            private String errorText; 
            private String finishReason; 
            private String id; 
            private String requestId; 
            private Boolean retryable; 
            private String type; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.data = model.data;
                this.delta = model.delta;
                this.errorCode = model.errorCode;
                this.errorText = model.errorText;
                this.finishReason = model.finishReason;
                this.id = model.id;
                this.requestId = model.requestId;
                this.retryable = model.retryable;
                this.type = model.type;
            } 

            /**
             * data.
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * delta.
             */
            public Builder delta(String delta) {
                this.delta = delta;
                return this;
            }

            /**
             * errorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * errorText.
             */
            public Builder errorText(String errorText) {
                this.errorText = errorText;
                return this;
            }

            /**
             * finishReason.
             */
            public Builder finishReason(String finishReason) {
                this.finishReason = finishReason;
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
             * requestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * retryable.
             */
            public Builder retryable(Boolean retryable) {
                this.retryable = retryable;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
