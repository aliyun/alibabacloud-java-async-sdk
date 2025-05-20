// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mseap20210118.models;

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
 * {@link SendNotificationForPartnerResponseBody} extends {@link TeaModel}
 *
 * <p>SendNotificationForPartnerResponseBody</p>
 */
public class SendNotificationForPartnerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("MsgId")
    private String msgId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SendNotificationForPartnerResponseBody(Builder builder) {
        this.errorMsg = builder.errorMsg;
        this.msgId = builder.msgId;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendNotificationForPartnerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return msgId
     */
    public String getMsgId() {
        return this.msgId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorMsg; 
        private String msgId; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(SendNotificationForPartnerResponseBody model) {
            this.errorMsg = model.errorMsg;
            this.msgId = model.msgId;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * MsgId.
         */
        public Builder msgId(String msgId) {
            this.msgId = msgId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SendNotificationForPartnerResponseBody build() {
            return new SendNotificationForPartnerResponseBody(this);
        } 

    } 

}
