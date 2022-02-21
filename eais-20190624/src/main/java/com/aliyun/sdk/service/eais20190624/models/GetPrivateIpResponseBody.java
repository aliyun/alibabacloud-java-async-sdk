// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPrivateIpResponseBody} extends {@link TeaModel}
 *
 * <p>GetPrivateIpResponseBody</p>
 */
public class GetPrivateIpResponseBody extends TeaModel {
    @NameInMap("PrivateIp")
    private String privateIp;

    @NameInMap("RequestId")
    private String requestId;

    private GetPrivateIpResponseBody(Builder builder) {
        this.privateIp = builder.privateIp;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPrivateIpResponseBody create() {
        return builder().build();
    }

    /**
     * @return privateIp
     */
    public String getPrivateIp() {
        return this.privateIp;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String privateIp; 
        private String requestId; 

        /**
         * PrivateIp.
         */
        public Builder privateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPrivateIpResponseBody build() {
            return new GetPrivateIpResponseBody(this);
        } 

    } 

}
