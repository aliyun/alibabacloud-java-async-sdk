// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLiveRoomResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateLiveRoomResponseBody</p>
 */
public class UpdateLiveRoomResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateLiveRoomResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLiveRoomResponseBody create() {
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

        public UpdateLiveRoomResponseBody build() {
            return new UpdateLiveRoomResponseBody(this);
        } 

    } 

}
