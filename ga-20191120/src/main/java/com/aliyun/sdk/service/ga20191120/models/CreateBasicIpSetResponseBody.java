// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBasicIpSetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBasicIpSetResponseBody</p>
 */
public class CreateBasicIpSetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IpSetId")
    private String ipSetId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * The region ID of the GA instance.
         */
        public Builder ipSetId(String ipSetId) {
            this.ipSetId = ipSetId;
            return this;
        }

        /**
         * The request ID.
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
