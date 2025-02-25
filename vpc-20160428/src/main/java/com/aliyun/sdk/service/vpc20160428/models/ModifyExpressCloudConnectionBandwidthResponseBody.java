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
 * {@link ModifyExpressCloudConnectionBandwidthResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyExpressCloudConnectionBandwidthResponseBody</p>
 */
public class ModifyExpressCloudConnectionBandwidthResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E6385514-B0CC-48E3-B9F9-F7BFF64460A2</p>
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
