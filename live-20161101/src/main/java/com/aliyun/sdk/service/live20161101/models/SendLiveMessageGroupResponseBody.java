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
 * {@link SendLiveMessageGroupResponseBody} extends {@link TeaModel}
 *
 * <p>SendLiveMessageGroupResponseBody</p>
 */
public class SendLiveMessageGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MsgTid")
    private String msgTid;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SendLiveMessageGroupResponseBody(Builder builder) {
        this.msgTid = builder.msgTid;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendLiveMessageGroupResponseBody create() {
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

        private Builder(SendLiveMessageGroupResponseBody model) {
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
         * <p>E4C1245F-597B-1BD1-B9BB-9D220E99****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SendLiveMessageGroupResponseBody build() {
            return new SendLiveMessageGroupResponseBody(this);
        } 

    } 

}
