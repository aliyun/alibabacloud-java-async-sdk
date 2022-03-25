// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVirtualNodeResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateVirtualNodeResponseBody</p>
 */
public class UpdateVirtualNodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateVirtualNodeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVirtualNodeResponseBody create() {
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

        public UpdateVirtualNodeResponseBody build() {
            return new UpdateVirtualNodeResponseBody(this);
        } 

    } 

}
