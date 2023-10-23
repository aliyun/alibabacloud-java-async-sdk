// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ots20160620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindInstance2VpcResponseBody} extends {@link TeaModel}
 *
 * <p>BindInstance2VpcResponseBody</p>
 */
public class BindInstance2VpcResponseBody extends TeaModel {
    @NameInMap("Domain")
    private String domain;

    @NameInMap("Endpoint")
    private String endpoint;

    @NameInMap("RequestId")
    private String requestId;

    private BindInstance2VpcResponseBody(Builder builder) {
        this.domain = builder.domain;
        this.endpoint = builder.endpoint;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindInstance2VpcResponseBody create() {
        return builder().build();
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String domain; 
        private String endpoint; 
        private String requestId; 

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * Endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BindInstance2VpcResponseBody build() {
            return new BindInstance2VpcResponseBody(this);
        } 

    } 

}
