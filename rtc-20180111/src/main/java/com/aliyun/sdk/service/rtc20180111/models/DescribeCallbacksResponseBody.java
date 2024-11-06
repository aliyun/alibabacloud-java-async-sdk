// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCallbacksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCallbacksResponseBody</p>
 */
public class DescribeCallbacksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Callbacks")
    private java.util.List < Callbacks> callbacks;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCallbacksResponseBody(Builder builder) {
        this.callbacks = builder.callbacks;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCallbacksResponseBody create() {
        return builder().build();
    }

    /**
     * @return callbacks
     */
    public java.util.List < Callbacks> getCallbacks() {
        return this.callbacks;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Callbacks> callbacks; 
        private String requestId; 

        /**
         * Callbacks.
         */
        public Builder callbacks(java.util.List < Callbacks> callbacks) {
            this.callbacks = callbacks;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCallbacksResponseBody build() {
            return new DescribeCallbacksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCallbacksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCallbacksResponseBody</p>
     */
    public static class Callbacks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("CheckStatus")
        private String checkStatus;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Conf")
        private String conf;

        @com.aliyun.core.annotation.NameInMap("Msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SubEvent")
        private java.util.List < Integer > subEvent;

        private Callbacks(Builder builder) {
            this.category = builder.category;
            this.checkStatus = builder.checkStatus;
            this.code = builder.code;
            this.conf = builder.conf;
            this.msg = builder.msg;
            this.status = builder.status;
            this.subEvent = builder.subEvent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Callbacks create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return checkStatus
         */
        public String getCheckStatus() {
            return this.checkStatus;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return conf
         */
        public String getConf() {
            return this.conf;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return subEvent
         */
        public java.util.List < Integer > getSubEvent() {
            return this.subEvent;
        }

        public static final class Builder {
            private String category; 
            private String checkStatus; 
            private String code; 
            private String conf; 
            private String msg; 
            private Integer status; 
            private java.util.List < Integer > subEvent; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * CheckStatus.
             */
            public Builder checkStatus(String checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Conf.
             */
            public Builder conf(String conf) {
                this.conf = conf;
                return this;
            }

            /**
             * Msg.
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * SubEvent.
             */
            public Builder subEvent(java.util.List < Integer > subEvent) {
                this.subEvent = subEvent;
                return this;
            }

            public Callbacks build() {
                return new Callbacks(this);
            } 

        } 

    }
}
