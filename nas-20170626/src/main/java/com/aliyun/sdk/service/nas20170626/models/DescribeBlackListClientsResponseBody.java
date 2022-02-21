// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBlackListClientsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBlackListClientsResponseBody</p>
 */
public class DescribeBlackListClientsResponseBody extends TeaModel {
    @NameInMap("Clients")
    private String clients;

    @NameInMap("RequestId")
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
         * Clients.
         */
        public Builder clients(String clients) {
            this.clients = clients;
            return this;
        }

        /**
         * RequestId.
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
