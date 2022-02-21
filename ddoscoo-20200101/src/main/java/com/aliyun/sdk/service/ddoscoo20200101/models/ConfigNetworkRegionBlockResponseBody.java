// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigNetworkRegionBlockResponseBody} extends {@link TeaModel}
 *
 * <p>ConfigNetworkRegionBlockResponseBody</p>
 */
public class ConfigNetworkRegionBlockResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ConfigNetworkRegionBlockResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigNetworkRegionBlockResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ConfigNetworkRegionBlockResponseBody build() {
            return new ConfigNetworkRegionBlockResponseBody(this);
        } 

    } 

}
