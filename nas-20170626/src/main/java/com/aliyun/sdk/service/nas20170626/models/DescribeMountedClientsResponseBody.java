// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMountedClientsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMountedClientsResponseBody</p>
 */
public class DescribeMountedClientsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Clients")
    private Clients clients;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeMountedClientsResponseBody(Builder builder) {
        this.clients = builder.clients;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMountedClientsResponseBody create() {
        return builder().build();
    }

    /**
     * @return clients
     */
    public Clients getClients() {
        return this.clients;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Clients clients; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The queried clients.
         */
        public Builder clients(Clients clients) {
            this.clients = clients;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of IP addresses returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of IP addresses.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeMountedClientsResponseBody build() {
            return new DescribeMountedClientsResponseBody(this);
        } 

    } 

    public static class Client extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientIP")
        private String clientIP;

        private Client(Builder builder) {
            this.clientIP = builder.clientIP;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Client create() {
            return builder().build();
        }

        /**
         * @return clientIP
         */
        public String getClientIP() {
            return this.clientIP;
        }

        public static final class Builder {
            private String clientIP; 

            /**
             * The IP address of the client.
             */
            public Builder clientIP(String clientIP) {
                this.clientIP = clientIP;
                return this;
            }

            public Client build() {
                return new Client(this);
            } 

        } 

    }
    public static class Clients extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Client")
        private java.util.List < Client> client;

        private Clients(Builder builder) {
            this.client = builder.client;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clients create() {
            return builder().build();
        }

        /**
         * @return client
         */
        public java.util.List < Client> getClient() {
            return this.client;
        }

        public static final class Builder {
            private java.util.List < Client> client; 

            /**
             * Client.
             */
            public Builder client(java.util.List < Client> client) {
                this.client = client;
                return this;
            }

            public Clients build() {
                return new Clients(this);
            } 

        } 

    }
}
