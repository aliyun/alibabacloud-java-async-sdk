// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteIpv6InternetBandwidthResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteIpv6InternetBandwidthResponseBody</p>
 */
public class DeleteIpv6InternetBandwidthResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteIpv6InternetBandwidthResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIpv6InternetBandwidthResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E07E0FE6-5C21-405F-AF82-7613AA81EF92</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteIpv6InternetBandwidthResponseBody build() {
            return new DeleteIpv6InternetBandwidthResponseBody(this);
        } 

    } 

}
