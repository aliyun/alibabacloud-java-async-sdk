// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGeoFenceResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteGeoFenceResponseBody</p>
 */
public class DeleteGeoFenceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteGeoFenceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGeoFenceResponseBody create() {
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

        public DeleteGeoFenceResponseBody build() {
            return new DeleteGeoFenceResponseBody(this);
        } 

    } 

}
