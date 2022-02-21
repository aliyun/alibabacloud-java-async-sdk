// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRoomResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateRoomResponseBody</p>
 */
public class UpdateRoomResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateRoomResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRoomResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateRoomResponseBody build() {
            return new UpdateRoomResponseBody(this);
        } 

    } 

}
