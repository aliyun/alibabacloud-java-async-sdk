// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcipam20230228.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIpamPoolResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIpamPoolResponseBody</p>
 */
public class CreateIpamPoolResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IpamPoolId")
    private String ipamPoolId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateIpamPoolResponseBody(Builder builder) {
        this.ipamPoolId = builder.ipamPoolId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIpamPoolResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipamPoolId
     */
    public String getIpamPoolId() {
        return this.ipamPoolId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ipamPoolId; 
        private String requestId; 

        /**
         * IpamPoolId.
         */
        public Builder ipamPoolId(String ipamPoolId) {
            this.ipamPoolId = ipamPoolId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateIpamPoolResponseBody build() {
            return new CreateIpamPoolResponseBody(this);
        } 

    } 

}
