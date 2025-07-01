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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeBlackListClientsResponseBody model) {
            this.clients = model.clients;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The IDs of clients and the status of each client. The parameter value is a JSON string, for example, <code>{&quot;client1&quot;: &quot;EVICTING&quot;,&quot;client2&quot;:&quot;EVICTED&quot;}</code>.</p>
         * <p>Available client statuses include:</p>
         * <ul>
         * <li>EVICTING: The client is being evicted.</li>
         * <li>EVICTED: The client is evicted.</li>
         * <li>ACCEPTING: The write access to the file system is being granted to the client.</li>
         * <li>ACCEPTABLE: The write access to the file system is granted to the client.</li>
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
         * <p>The request ID.</p>
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
