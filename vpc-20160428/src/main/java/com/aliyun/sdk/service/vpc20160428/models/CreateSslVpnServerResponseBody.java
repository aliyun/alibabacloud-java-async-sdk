// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link CreateSslVpnServerResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSslVpnServerResponseBody</p>
 */
public class CreateSslVpnServerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SslVpnServerId")
    private String sslVpnServerId;

    private CreateSslVpnServerResponseBody(Builder builder) {
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.sslVpnServerId = builder.sslVpnServerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSslVpnServerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sslVpnServerId
     */
    public String getSslVpnServerId() {
        return this.sslVpnServerId;
    }

    public static final class Builder {
        private String name; 
        private String requestId; 
        private String sslVpnServerId; 

        private Builder() {
        } 

        private Builder(CreateSslVpnServerResponseBody model) {
            this.name = model.name;
            this.requestId = model.requestId;
            this.sslVpnServerId = model.sslVpnServerId;
        } 

        /**
         * <p>The SSL server name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E98A9651-7098-40C7-8F85-C818D1EBBA85</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the SSL server.</p>
         * 
         * <strong>example:</strong>
         * <p>vss-bp18q7hzj6largv4v****</p>
         */
        public Builder sslVpnServerId(String sslVpnServerId) {
            this.sslVpnServerId = sslVpnServerId;
            return this;
        }

        public CreateSslVpnServerResponseBody build() {
            return new CreateSslVpnServerResponseBody(this);
        } 

    } 

}
