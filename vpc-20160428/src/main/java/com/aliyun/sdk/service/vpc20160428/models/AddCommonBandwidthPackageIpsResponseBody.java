// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddCommonBandwidthPackageIpsResponseBody} extends {@link TeaModel}
 *
 * <p>AddCommonBandwidthPackageIpsResponseBody</p>
 */
public class AddCommonBandwidthPackageIpsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddCommonBandwidthPackageIpsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCommonBandwidthPackageIpsResponseBody create() {
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
         * <p>01FDDD49-C4B7-4D2A-A8E5-A93915C450A6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddCommonBandwidthPackageIpsResponseBody build() {
            return new AddCommonBandwidthPackageIpsResponseBody(this);
        } 

    } 

}
