// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link CreateProjectNotifyReceiverResponseBody} extends {@link TeaModel}
 *
 * <p>CreateProjectNotifyReceiverResponseBody</p>
 */
public class CreateProjectNotifyReceiverResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ReceiverId")
    private String receiverId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateProjectNotifyReceiverResponseBody(Builder builder) {
        this.receiverId = builder.receiverId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProjectNotifyReceiverResponseBody create() {
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

        private Builder(CreateProjectNotifyReceiverResponseBody model) {
            this.receiverId = model.receiverId;
            this.requestId = model.requestId;
        } 

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

        public CreateProjectNotifyReceiverResponseBody build() {
            return new CreateProjectNotifyReceiverResponseBody(this);
        } 

    } 

}
