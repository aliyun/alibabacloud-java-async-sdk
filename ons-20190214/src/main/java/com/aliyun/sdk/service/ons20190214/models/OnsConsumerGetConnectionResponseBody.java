// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsConsumerGetConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>OnsConsumerGetConnectionResponseBody</p>
 */
public class OnsConsumerGetConnectionResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
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
         * The data that is returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsConsumerGetConnectionResponseBody build() {
            return new OnsConsumerGetConnectionResponseBody(this);
        } 

    } 

    public static class ConnectionDo extends TeaModel {
        @NameInMap("ClientAddr")
        private String clientAddr;

        @NameInMap("ClientId")
        private String clientId;

        @NameInMap("Language")
        private String language;

        @NameInMap("Version")
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
             * The IP address and port number of the consumer instance.
             */
            public Builder clientAddr(String clientAddr) {
                this.clientAddr = clientAddr;
                return this;
            }

            /**
             * The ID of the consumer instance.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * The programming language in which the consumer application was developed.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * The version of the consumer client.
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
    public static class ConnectionList extends TeaModel {
        @NameInMap("ConnectionDo")
        private java.util.List < ConnectionDo> connectionDo;

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
        public java.util.List < ConnectionDo> getConnectionDo() {
            return this.connectionDo;
        }

        public static final class Builder {
            private java.util.List < ConnectionDo> connectionDo; 

            /**
             * ConnectionDo.
             */
            public Builder connectionDo(java.util.List < ConnectionDo> connectionDo) {
                this.connectionDo = connectionDo;
                return this;
            }

            public ConnectionList build() {
                return new ConnectionList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ConnectionList")
        private ConnectionList connectionList;

        private Data(Builder builder) {
            this.connectionList = builder.connectionList;
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

        public static final class Builder {
            private ConnectionList connectionList; 

            /**
             * The connection information about the consumers in the specified group.
             */
            public Builder connectionList(ConnectionList connectionList) {
                this.connectionList = connectionList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
