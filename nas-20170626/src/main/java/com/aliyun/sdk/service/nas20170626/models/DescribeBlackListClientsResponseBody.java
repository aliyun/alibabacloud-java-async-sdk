// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBlackListClientsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBlackListClientsResponseBody</p>
 */
public class DescribeBlackListClientsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Clients")
    private String clients;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeBlackListClientsResponseBody(Builder builder) {
        this.clients = builder.clients;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBlackListClientsResponseBody create() {
        return builder().build();
    }

    /**
     * @return clients
     */
    public String getClients() {
        return this.clients;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String clients; 
        private String requestId; 

        /**
         * The IDs of clients and the status of each client. This parameter contains a JSON object, for example, {"client1": "EVICTING","client2":"EVICTED"}.
         * <p>
         * 
         * Available client statuses include:
         * 
         * *   EVICTING indicates that a client is being removed
         * *   EVICTED indicates that a client is removed
         * *   ACCEPTING indicates that the write access to the file system is being granted to a client
         * *   ACCEPTABLE indicates that the write access to the file system is granted to a client
         */
        public Builder clients(String clients) {
            this.clients = clients;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBlackListClientsResponseBody build() {
            return new DescribeBlackListClientsResponseBody(this);
        } 

    } 

}
