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
 * {@link CreateWaitingRoomEventResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWaitingRoomEventResponseBody</p>
 */
public class CreateWaitingRoomEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WaitingRoomEventId")
    private Long waitingRoomEventId;

    private CreateWaitingRoomEventResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.waitingRoomEventId = builder.waitingRoomEventId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWaitingRoomEventResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return waitingRoomEventId
     */
    public Long getWaitingRoomEventId() {
        return this.waitingRoomEventId;
    }

    public static final class Builder {
        private String requestId; 
        private Long waitingRoomEventId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A123425345</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WaitingRoomEventId.
         */
        public Builder waitingRoomEventId(Long waitingRoomEventId) {
            this.waitingRoomEventId = waitingRoomEventId;
            return this;
        }

        public CreateWaitingRoomEventResponseBody build() {
            return new CreateWaitingRoomEventResponseBody(this);
        } 

    } 

}
