// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20251111.models;

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
 * {@link GetSubscriptionResponseBody} extends {@link TeaModel}
 *
 * <p>GetSubscriptionResponseBody</p>
 */
public class GetSubscriptionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.List<String> params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSubscriptionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.params = builder.params;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSubscriptionResponseBody create() {
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
     * @return params
     */
    public java.util.List<String> getParams() {
        return this.params;
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
        private java.util.List<String> params; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetSubscriptionResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>返回码</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>返回数据</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP状态码</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>错误信息</p>
         * 
         * <strong>example:</strong>
         * <p>Instance does not exist. Instance=ob-1234567890</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>错误信息中的变量值列表</p>
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * <p>请求ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FDAC7-13C5-1B64-A853-999DF105B9EF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>是否调用成功</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSubscriptionResponseBody build() {
            return new GetSubscriptionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSubscriptionResponseBody} extends {@link TeaModel}
     *
     * <p>GetSubscriptionResponseBody</p>
     */
    public static class EventList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Disabled")
        private Boolean disabled;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private EventList(Builder builder) {
            this.disabled = builder.disabled;
            this.displayName = builder.displayName;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventList create() {
            return builder().build();
        }

        /**
         * @return disabled
         */
        public Boolean getDisabled() {
            return this.disabled;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Boolean disabled; 
            private String displayName; 
            private String name; 

            private Builder() {
            } 

            private Builder(EventList model) {
                this.disabled = model.disabled;
                this.displayName = model.displayName;
                this.name = model.name;
            } 

            /**
             * <p>true 表示禁用，false 表示启用</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * <p>显示名称</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>名称</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public EventList build() {
                return new EventList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSubscriptionResponseBody} extends {@link TeaModel}
     *
     * <p>GetSubscriptionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Disabled")
        private Boolean disabled;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("EventList")
        private java.util.List<EventList> eventList;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MqInstanceId")
        private String mqInstanceId;

        @com.aliyun.core.annotation.NameInMap("MqType")
        private String mqType;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("ProducerId")
        private String producerId;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private Data(Builder builder) {
            this.disabled = builder.disabled;
            this.endpoint = builder.endpoint;
            this.eventList = builder.eventList;
            this.instanceId = builder.instanceId;
            this.mqInstanceId = builder.mqInstanceId;
            this.mqType = builder.mqType;
            this.password = builder.password;
            this.producerId = builder.producerId;
            this.topic = builder.topic;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return disabled
         */
        public Boolean getDisabled() {
            return this.disabled;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return eventList
         */
        public java.util.List<EventList> getEventList() {
            return this.eventList;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return mqInstanceId
         */
        public String getMqInstanceId() {
            return this.mqInstanceId;
        }

        /**
         * @return mqType
         */
        public String getMqType() {
            return this.mqType;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return producerId
         */
        public String getProducerId() {
            return this.producerId;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private Boolean disabled; 
            private String endpoint; 
            private java.util.List<EventList> eventList; 
            private String instanceId; 
            private String mqInstanceId; 
            private String mqType; 
            private String password; 
            private String producerId; 
            private String topic; 
            private String userName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.disabled = model.disabled;
                this.endpoint = model.endpoint;
                this.eventList = model.eventList;
                this.instanceId = model.instanceId;
                this.mqInstanceId = model.mqInstanceId;
                this.mqType = model.mqType;
                this.password = model.password;
                this.producerId = model.producerId;
                this.topic = model.topic;
                this.userName = model.userName;
            } 

            /**
             * <p>true 表示禁用，false 表示启用</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * <p>接入点</p>
             * 
             * <strong>example:</strong>
             * <p>rmq-cn-h964u01wh12.cn-hangzhou.rmq.aliyuncs.com:8080</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>事件列表</p>
             */
            public Builder eventList(java.util.List<EventList> eventList) {
                this.eventList = eventList;
                return this;
            }

            /**
             * <p>实例ID</p>
             * 
             * <strong>example:</strong>
             * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>MQ的实例ID</p>
             * 
             * <strong>example:</strong>
             * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
             */
            public Builder mqInstanceId(String mqInstanceId) {
                this.mqInstanceId = mqInstanceId;
                return this;
            }

            /**
             * <p>消息队列类型</p>
             * 
             * <strong>example:</strong>
             * <p>ROCKET_MQ_4</p>
             */
            public Builder mqType(String mqType) {
                this.mqType = mqType;
                return this;
            }

            /**
             * <p>田南+伽雷可斯</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>生产者ID</p>
             * 
             * <strong>example:</strong>
             * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
             */
            public Builder producerId(String producerId) {
                this.producerId = producerId;
                return this;
            }

            /**
             * <p>主题</p>
             * 
             * <strong>example:</strong>
             * <p>OUTBOUND_BOT_TOPIC</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * <p>伽雷可斯</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
