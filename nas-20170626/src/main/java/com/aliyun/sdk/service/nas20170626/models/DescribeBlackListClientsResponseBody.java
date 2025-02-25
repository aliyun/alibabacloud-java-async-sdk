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
         * <p>The IDs of clients and the status of each client. This parameter contains a JSON object, for example, {&quot;client1&quot;: &quot;EVICTING&quot;,&quot;client2&quot;:&quot;EVICTED&quot;}.</p>
         * <p>Available client statuses include:</p>
         * <ul>
         * <li>EVICTING indicates that a client is being removed</li>
         * <li>EVICTED indicates that a client is removed</li>
         * <li>ACCEPTING indicates that the write access to the file system is being granted to a client</li>
         * <li>ACCEPTABLE indicates that the write access to the file system is granted to a client</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;client1&quot;: &quot;EVICTING&quot;,&quot;client2&quot;:&quot;EVICTED&quot;}</p>
         */
        public Builder clients(String clients) {
            this.clients = clients;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A70BEE5D-76D3-49FB-B58F-1F398211A5C3</p>
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
