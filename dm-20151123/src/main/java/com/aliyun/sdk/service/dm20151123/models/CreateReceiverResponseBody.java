// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link CreateReceiverResponseBody} extends {@link TeaModel}
 *
 * <p>CreateReceiverResponseBody</p>
 */
public class CreateReceiverResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ReceiverId")
    private String receiverId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateReceiverResponseBody model) {
            this.receiverId = model.receiverId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Receiver list ID</p>
         * 
         * <strong>example:</strong>
         * <p>7312e09b8fffc5c7b2e2fbf5b6dc2073</p>
         */
        public Builder receiverId(String receiverId) {
            this.receiverId = receiverId;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>10A1AD70-E48E-476D-98D9-39BD92193837</p>
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
