// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableInstanceIpv6AddressResponseBody} extends {@link TeaModel}
 *
 * <p>EnableInstanceIpv6AddressResponseBody</p>
 */
public class EnableInstanceIpv6AddressResponseBody extends TeaModel {
    @NameInMap("Data")
    private Boolean data;

    @NameInMap("RequestId")
    private String requestId;

    private EnableInstanceIpv6AddressResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableInstanceIpv6AddressResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Boolean getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean data; 
        private String requestId; 

        /**
         * The result of the request.
         */
        public Builder data(Boolean data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EnableInstanceIpv6AddressResponseBody build() {
            return new EnableInstanceIpv6AddressResponseBody(this);
        } 

    } 

}
