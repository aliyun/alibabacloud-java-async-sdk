// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopEpnInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>StopEpnInstanceResponseBody</p>
 */
public class StopEpnInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private StopEpnInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopEpnInstanceResponseBody create() {
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

        public StopEpnInstanceResponseBody build() {
            return new StopEpnInstanceResponseBody(this);
        } 

    } 

}
