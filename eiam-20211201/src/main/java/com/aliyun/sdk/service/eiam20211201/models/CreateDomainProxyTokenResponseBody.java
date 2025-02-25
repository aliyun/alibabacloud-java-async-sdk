// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link CreateDomainProxyTokenResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDomainProxyTokenResponseBody</p>
 */
public class CreateDomainProxyTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainProxyTokenId")
    private String domainProxyTokenId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDomainProxyTokenResponseBody(Builder builder) {
        this.domainProxyTokenId = builder.domainProxyTokenId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDomainProxyTokenResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainProxyTokenId
     */
    public String getDomainProxyTokenId() {
        return this.domainProxyTokenId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String domainProxyTokenId; 
        private String requestId; 

        /**
         * DomainProxyTokenId.
         */
        public Builder domainProxyTokenId(String domainProxyTokenId) {
            this.domainProxyTokenId = domainProxyTokenId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDomainProxyTokenResponseBody build() {
            return new CreateDomainProxyTokenResponseBody(this);
        } 

    } 

}
