// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIpProtectionResponseBody} extends {@link TeaModel}
 *
 * <p>GetIpProtectionResponseBody</p>
 */
public class GetIpProtectionResponseBody extends TeaModel {
    @NameInMap("IpProtection")
    private String ipProtection;

    @NameInMap("RequestId")
    private String requestId;

    private GetIpProtectionResponseBody(Builder builder) {
        this.ipProtection = builder.ipProtection;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIpProtectionResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipProtection
     */
    public String getIpProtection() {
        return this.ipProtection;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ipProtection; 
        private String requestId; 

        /**
         * IpProtection.
         */
        public Builder ipProtection(String ipProtection) {
            this.ipProtection = ipProtection;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetIpProtectionResponseBody build() {
            return new GetIpProtectionResponseBody(this);
        } 

    } 

}
