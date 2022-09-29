// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateReceiverResponseBody} extends {@link TeaModel}
 *
 * <p>CreateReceiverResponseBody</p>
 */
public class CreateReceiverResponseBody extends TeaModel {
    @NameInMap("ReceiverId")
    private String receiverId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateReceiverResponseBody(Builder builder) {
        this.receiverId = builder.receiverId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateReceiverResponseBody create() {
        return builder().build();
    }

    /**
     * @return receiverId
     */
    public String getReceiverId() {
        return this.receiverId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String receiverId; 
        private String requestId; 

        /**
         * ReceiverId.
         */
        public Builder receiverId(String receiverId) {
            this.receiverId = receiverId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateReceiverResponseBody build() {
            return new CreateReceiverResponseBody(this);
        } 

    } 

}
