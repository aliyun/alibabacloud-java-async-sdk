// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
         * <p>The queried clients.</p>
         */
        public Builder clients(Clients clients) {
            this.clients = clients;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of IP addresses returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A70BEE5D-76D3-49FB-B58F-1F398211****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of IP addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeMountedClientsResponseBody build() {
            return new DescribeMountedClientsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMountedClientsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMountedClientsResponseBody</p>
     */
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
             * <p>The IP address of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>10.10.10.1</p>
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
    /**
     * 
     * {@link DescribeMountedClientsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMountedClientsResponseBody</p>
     */
    public static class Clients extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Client")
        private java.util.List<Client> client;

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
        public java.util.List<Client> getClient() {
            return this.client;
        }

        public static final class Builder {
            private java.util.List<Client> client; 

            /**
             * Client.
             */
            public Builder client(java.util.List<Client> client) {
                this.client = client;
                return this;
            }

            public Clients build() {
                return new Clients(this);
            } 

        } 

    }
}
