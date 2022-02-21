// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSslVpnServerResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSslVpnServerResponseBody</p>
 */
public class CreateSslVpnServerResponseBody extends TeaModel {
    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SslVpnServerId")
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

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SslVpnServerId.
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
