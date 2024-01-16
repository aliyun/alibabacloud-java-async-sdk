// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyComponentAssetResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyComponentAssetResponseBody</p>
 */
public class ModifyComponentAssetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyComponentAssetResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyComponentAssetResponseBody create() {
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

        public ModifyComponentAssetResponseBody build() {
            return new ModifyComponentAssetResponseBody(this);
        } 

    } 

}
