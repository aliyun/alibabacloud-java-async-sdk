// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHybridCloudClusterBypassStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyHybridCloudClusterBypassStatusResponseBody</p>
 */
public class ModifyHybridCloudClusterBypassStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyHybridCloudClusterBypassStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHybridCloudClusterBypassStatusResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyHybridCloudClusterBypassStatusResponseBody build() {
            return new ModifyHybridCloudClusterBypassStatusResponseBody(this);
        } 

    } 

}
