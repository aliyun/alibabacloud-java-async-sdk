// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLiveRoomResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteLiveRoomResponseBody</p>
 */
public class DeleteLiveRoomResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteLiveRoomResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLiveRoomResponseBody create() {
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

        public DeleteLiveRoomResponseBody build() {
            return new DeleteLiveRoomResponseBody(this);
        } 

    } 

}
