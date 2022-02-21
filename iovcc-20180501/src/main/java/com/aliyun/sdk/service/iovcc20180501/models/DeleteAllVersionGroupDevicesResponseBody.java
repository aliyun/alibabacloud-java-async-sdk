// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAllVersionGroupDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteAllVersionGroupDevicesResponseBody</p>
 */
public class DeleteAllVersionGroupDevicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteAllVersionGroupDevicesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAllVersionGroupDevicesResponseBody create() {
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

        public DeleteAllVersionGroupDevicesResponseBody build() {
            return new DeleteAllVersionGroupDevicesResponseBody(this);
        } 

    } 

}
