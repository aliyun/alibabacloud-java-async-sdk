// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetRoutineStagingEnvIpResponseBody} extends {@link TeaModel}
 *
 * <p>GetRoutineStagingEnvIpResponseBody</p>
 */
public class GetRoutineStagingEnvIpResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IPV4")
    private java.util.List < String > IPV4;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetRoutineStagingEnvIpResponseBody(Builder builder) {
        this.IPV4 = builder.IPV4;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRoutineStagingEnvIpResponseBody create() {
        return builder().build();
    }

    /**
     * @return IPV4
     */
    public java.util.List < String > getIPV4() {
        return this.IPV4;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > IPV4; 
        private String requestId; 

        /**
         * IPV4.
         */
        public Builder IPV4(java.util.List < String > IPV4) {
            this.IPV4 = IPV4;
            return this;
        }

        /**
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRoutineStagingEnvIpResponseBody build() {
            return new GetRoutineStagingEnvIpResponseBody(this);
        } 

    } 

}
