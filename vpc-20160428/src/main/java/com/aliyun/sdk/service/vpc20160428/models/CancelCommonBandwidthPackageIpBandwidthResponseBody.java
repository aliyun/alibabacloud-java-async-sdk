// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CancelCommonBandwidthPackageIpBandwidthResponseBody} extends {@link TeaModel}
 *
 * <p>CancelCommonBandwidthPackageIpBandwidthResponseBody</p>
 */
public class CancelCommonBandwidthPackageIpBandwidthResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CancelCommonBandwidthPackageIpBandwidthResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelCommonBandwidthPackageIpBandwidthResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(CancelCommonBandwidthPackageIpBandwidthResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>63D187BF-A30A-4DD6-B68D-FF182C96D8A2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CancelCommonBandwidthPackageIpBandwidthResponseBody build() {
            return new CancelCommonBandwidthPackageIpBandwidthResponseBody(this);
        } 

    } 

}
