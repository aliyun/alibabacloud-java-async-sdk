// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBasicIpSetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBasicIpSetResponseBody</p>
 */
public class CreateBasicIpSetResponseBody extends TeaModel {
    @NameInMap("IpSetId")
    private String ipSetId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateBasicIpSetResponseBody(Builder builder) {
        this.ipSetId = builder.ipSetId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBasicIpSetResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipSetId
     */
    public String getIpSetId() {
        return this.ipSetId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ipSetId; 
        private String requestId; 

        /**
         * 加速地域接入点Id
         */
        public Builder ipSetId(String ipSetId) {
            this.ipSetId = ipSetId;
            return this;
        }

        /**
         * 请求Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateBasicIpSetResponseBody build() {
            return new CreateBasicIpSetResponseBody(this);
        } 

    } 

}
