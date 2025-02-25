// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateWaitingRoomResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWaitingRoomResponseBody</p>
 */
public class CreateWaitingRoomResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WaitingRoomId")
    private String waitingRoomId;

    private CreateWaitingRoomResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.waitingRoomId = builder.waitingRoomId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWaitingRoomResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return waitingRoomId
     */
    public String getWaitingRoomId() {
        return this.waitingRoomId;
    }

    public static final class Builder {
        private String requestId; 
        private String waitingRoomId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>85H66C7B-671A-4297-9187-2C4477247A74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WaitingRoomId.
         */
        public Builder waitingRoomId(String waitingRoomId) {
            this.waitingRoomId = waitingRoomId;
            return this;
        }

        public CreateWaitingRoomResponseBody build() {
            return new CreateWaitingRoomResponseBody(this);
        } 

    } 

}
