// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClientSourceIpResponseBody} extends {@link TeaModel}
 *
 * <p>GetClientSourceIpResponseBody</p>
 */
public class GetClientSourceIpResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClientIp")
    private String clientIp;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetClientSourceIpResponseBody(Builder builder) {
        this.clientIp = builder.clientIp;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClientSourceIpResponseBody create() {
        return builder().build();
    }

    /**
     * @return clientIp
     */
    public String getClientIp() {
        return this.clientIp;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String clientIp; 
        private String requestId; 

        /**
         * ClientIp.
         */
        public Builder clientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetClientSourceIpResponseBody build() {
            return new GetClientSourceIpResponseBody(this);
        } 

    } 

}
