// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConsumerConnectionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListConsumerConnectionsResponseBody</p>
 */
public class ListConsumerConnectionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("dynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("dynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ListConsumerConnectionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConsumerConnectionsResponseBody create() {
        return builder().build();
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
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
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
        private String dynamicCode; 
        private String dynamicMessage; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The returned error code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The dynamic error code.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * The dynamic error message.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request. Each request has a unique ID. You can use this ID to troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListConsumerConnectionsResponseBody build() {
            return new ListConsumerConnectionsResponseBody(this);
        } 

    } 

    public static class Connections extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("egressIp")
        private String egressIp;

        @com.aliyun.core.annotation.NameInMap("hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("messageModel")
        private String messageModel;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Connections(Builder builder) {
            this.clientId = builder.clientId;
            this.egressIp = builder.egressIp;
            this.hostname = builder.hostname;
            this.language = builder.language;
            this.messageModel = builder.messageModel;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Connections create() {
            return builder().build();
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return egressIp
         */
        public String getEgressIp() {
            return this.egressIp;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return messageModel
         */
        public String getMessageModel() {
            return this.messageModel;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String clientId; 
            private String egressIp; 
            private String hostname; 
            private String language; 
            private String messageModel; 
            private String version; 

            /**
             * The ID of the client.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * Host IP/Public IP
             */
            public Builder egressIp(String egressIp) {
                this.egressIp = egressIp;
                return this;
            }

            /**
             * The `hostname` of the cloud-native box.
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * The language of the client.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * Consumption Mode
             * <p>
             * - BROADCASTING
             * - CLUSTERING
             */
            public Builder messageModel(String messageModel) {
                this.messageModel = messageModel;
                return this;
            }

            /**
             * The version of the client.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Connections build() {
                return new Connections(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("connections")
        private java.util.List < Connections> connections;

        @com.aliyun.core.annotation.NameInMap("consumerGroupId")
        private String consumerGroupId;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        private Data(Builder builder) {
            this.connections = builder.connections;
            this.consumerGroupId = builder.consumerGroupId;
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return connections
         */
        public java.util.List < Connections> getConnections() {
            return this.connections;
        }

        /**
         * @return consumerGroupId
         */
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private java.util.List < Connections> connections; 
            private String consumerGroupId; 
            private String instanceId; 
            private String regionId; 

            /**
             * The client connection list
             */
            public Builder connections(java.util.List < Connections> connections) {
                this.connections = connections;
                return this;
            }

            /**
             * The consumer group ID.
             */
            public Builder consumerGroupId(String consumerGroupId) {
                this.consumerGroupId = consumerGroupId;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The ID of the region in which the instance resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
