// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyExpressCloudConnectionBandwidthResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyExpressCloudConnectionBandwidthResponseBody</p>
 */
public class ModifyExpressCloudConnectionBandwidthResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyExpressCloudConnectionBandwidthResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyExpressCloudConnectionBandwidthResponseBody create() {
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

        public ModifyExpressCloudConnectionBandwidthResponseBody build() {
            return new ModifyExpressCloudConnectionBandwidthResponseBody(this);
        } 

    } 

}
