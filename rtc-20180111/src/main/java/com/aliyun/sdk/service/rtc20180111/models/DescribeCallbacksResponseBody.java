// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link DescribeCallbacksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCallbacksResponseBody</p>
 */
public class DescribeCallbacksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Callbacks")
    private java.util.List<Callbacks> callbacks;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callbacks
     */
    public java.util.List<Callbacks> getCallbacks() {
        return this.callbacks;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Callbacks> callbacks; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeCallbacksResponseBody model) {
            this.callbacks = model.callbacks;
            this.requestId = model.requestId;
        } 

        /**
         * <p>A list of subscribed events for the application.</p>
         */
        public Builder callbacks(java.util.List<Callbacks> callbacks) {
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
        private java.util.List<Integer> subEvent;

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
        public java.util.List<Integer> getSubEvent() {
            return this.subEvent;
        }

        public static final class Builder {
            private String category; 
            private String checkStatus; 
            private String code; 
            private String conf; 
            private String msg; 
            private Integer status; 
            private java.util.List<Integer> subEvent; 

            private Builder() {
            } 

            private Builder(Callbacks model) {
                this.category = model.category;
                this.checkStatus = model.checkStatus;
                this.code = model.code;
                this.conf = model.conf;
                this.msg = model.msg;
                this.status = model.status;
                this.subEvent = model.subEvent;
            } 

            /**
             * <p>The callback code.</p>
             * 
             * <strong>example:</strong>
             * <p>RecordEvent</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The callback validation status. 0 indicates validating. 1 indicates validation successful. 2 indicates validation failed.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder checkStatus(String checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * <p>The callback validation code.</p>
             * 
             * <strong>example:</strong>
             * <p>RESPONSE_INVALID</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The webhook address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
             */
            public Builder conf(String conf) {
                this.conf = conf;
                return this;
            }

            /**
             * <p>The callback validation message.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * <p>The callback status. 0 indicates enabled. 1 indicates disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The sub-events. For more information, see Callback overview.
             * Recording events:</p>
             * <ul>
             * <li><p><strong>2010</strong>: The service status of the recording changes.</p>
             * </li>
             * <li><p><strong>2011</strong>: The status of the recording audio stream changes.</p>
             * </li>
             * <li><p><strong>2012</strong>: The status of the recording video stream changes.</p>
             * </li>
             * </ul>
             */
            public Builder subEvent(java.util.List<Integer> subEvent) {
                this.subEvent = subEvent;
                return this;
            }

            public Callbacks build() {
                return new Callbacks(this);
            } 

        } 

    }
}
