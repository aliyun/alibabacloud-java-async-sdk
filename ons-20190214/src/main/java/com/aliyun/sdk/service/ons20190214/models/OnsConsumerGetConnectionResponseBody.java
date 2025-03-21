// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

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
 * {@link OnsConsumerGetConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>OnsConsumerGetConnectionResponseBody</p>
 */
public class OnsConsumerGetConnectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private OnsConsumerGetConnectionResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsConsumerGetConnectionResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>DE4140C7-F42D-473D-A5FF-B1E31692****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsConsumerGetConnectionResponseBody build() {
            return new OnsConsumerGetConnectionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link OnsConsumerGetConnectionResponseBody} extends {@link TeaModel}
     *
     * <p>OnsConsumerGetConnectionResponseBody</p>
     */
    public static class ConnectionDo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientAddr")
        private String clientAddr;

        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private ConnectionDo(Builder builder) {
            this.clientAddr = builder.clientAddr;
            this.clientId = builder.clientId;
            this.language = builder.language;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConnectionDo create() {
            return builder().build();
        }

        /**
         * @return clientAddr
         */
        public String getClientAddr() {
            return this.clientAddr;
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String clientAddr; 
            private String clientId; 
            private String language; 
            private String version; 

            /**
             * <p>The IP address and port number of the consumer client.</p>
             * 
             * <strong>example:</strong>
             * <p>30.5.121.**</p>
             */
            public Builder clientAddr(String clientAddr) {
                this.clientAddr = clientAddr;
                return this;
            }

            /**
             * <p>The ID of the consumer client.</p>
             * 
             * <strong>example:</strong>
             * <p>30.5.121.**@24813#-1999745829#-1737591554#453111174894656</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The programming language in which the consumer application was developed.</p>
             * 
             * <strong>example:</strong>
             * <p>JAVA</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The version of the consumer client.</p>
             * 
             * <strong>example:</strong>
             * <p>V4_3_6</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public ConnectionDo build() {
                return new ConnectionDo(this);
            } 

        } 

    }
    /**
     * 
     * {@link OnsConsumerGetConnectionResponseBody} extends {@link TeaModel}
     *
     * <p>OnsConsumerGetConnectionResponseBody</p>
     */
    public static class ConnectionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionDo")
        private java.util.List<ConnectionDo> connectionDo;

        private ConnectionList(Builder builder) {
            this.connectionDo = builder.connectionDo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConnectionList create() {
            return builder().build();
        }

        /**
         * @return connectionDo
         */
        public java.util.List<ConnectionDo> getConnectionDo() {
            return this.connectionDo;
        }

        public static final class Builder {
            private java.util.List<ConnectionDo> connectionDo; 

            /**
             * ConnectionDo.
             */
            public Builder connectionDo(java.util.List<ConnectionDo> connectionDo) {
                this.connectionDo = connectionDo;
                return this;
            }

            public ConnectionList build() {
                return new ConnectionList(this);
            } 

        } 

    }
    /**
     * 
     * {@link OnsConsumerGetConnectionResponseBody} extends {@link TeaModel}
     *
     * <p>OnsConsumerGetConnectionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionList")
        private ConnectionList connectionList;

        @com.aliyun.core.annotation.NameInMap("MessageModel")
        private String messageModel;

        private Data(Builder builder) {
            this.connectionList = builder.connectionList;
            this.messageModel = builder.messageModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return connectionList
         */
        public ConnectionList getConnectionList() {
            return this.connectionList;
        }

        /**
         * @return messageModel
         */
        public String getMessageModel() {
            return this.messageModel;
        }

        public static final class Builder {
            private ConnectionList connectionList; 
            private String messageModel; 

            /**
             * <p>The client connection information of the consumer group.</p>
             */
            public Builder connectionList(ConnectionList connectionList) {
                this.connectionList = connectionList;
                return this;
            }

            /**
             * MessageModel.
             */
            public Builder messageModel(String messageModel) {
                this.messageModel = messageModel;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
