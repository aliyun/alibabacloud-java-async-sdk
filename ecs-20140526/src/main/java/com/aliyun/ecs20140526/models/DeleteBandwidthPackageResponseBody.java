// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBandwidthPackageResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteBandwidthPackageResponseBody</p>
 */
public class DeleteBandwidthPackageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteBandwidthPackageResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBandwidthPackageResponseBody create() {
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

        public DeleteBandwidthPackageResponseBody build() {
            return new DeleteBandwidthPackageResponseBody(this);
        } 

    } 

}
