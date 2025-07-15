// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link SendLiveMessageUserResponseBody} extends {@link TeaModel}
 *
 * <p>SendLiveMessageUserResponseBody</p>
 */
public class SendLiveMessageUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MsgTid")
    private String msgTid;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SendLiveMessageUserResponseBody(Builder builder) {
        this.msgTid = builder.msgTid;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendLiveMessageUserResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return msgTid
     */
    public String getMsgTid() {
        return this.msgTid;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String msgTid; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SendLiveMessageUserResponseBody model) {
            this.msgTid = model.msgTid;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the message, which is a unique identifier that can be used to delete the message. The ID can be up to 64 bytes in length and can contain letters and digits.</p>
         * 
         * <strong>example:</strong>
         * <p>169830****</p>
         */
        public Builder msgTid(String msgTid) {
            this.msgTid = msgTid;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6CFDE7AB-571A-14EA-B072-989FF753****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SendLiveMessageUserResponseBody build() {
            return new SendLiveMessageUserResponseBody(this);
        } 

    } 

}
