// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCommonBandwidthPackageIpBandwidthResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyCommonBandwidthPackageIpBandwidthResponseBody</p>
 */
public class ModifyCommonBandwidthPackageIpBandwidthResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyCommonBandwidthPackageIpBandwidthResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCommonBandwidthPackageIpBandwidthResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyCommonBandwidthPackageIpBandwidthResponseBody build() {
            return new ModifyCommonBandwidthPackageIpBandwidthResponseBody(this);
        } 

    } 

}
