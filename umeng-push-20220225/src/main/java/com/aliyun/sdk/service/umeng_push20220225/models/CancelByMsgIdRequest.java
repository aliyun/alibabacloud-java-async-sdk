// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_push20220225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelByMsgIdRequest} extends {@link RequestModel}
 *
 * <p>CancelByMsgIdRequest</p>
 */
public class CancelByMsgIdRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MsgId")
    private String msgId;

    private CancelByMsgIdRequest(Builder builder) {
        super(builder);
        this.msgId = builder.msgId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelByMsgIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return msgId
     */
    public String getMsgId() {
        return this.msgId;
    }

    public static final class Builder extends Request.Builder<CancelByMsgIdRequest, Builder> {
        private String msgId; 

        private Builder() {
            super();
        } 

        private Builder(CancelByMsgIdRequest request) {
            super(request);
            this.msgId = request.msgId;
        } 

        /**
         * MsgId.
         */
        public Builder msgId(String msgId) {
            this.putBodyParameter("MsgId", msgId);
            this.msgId = msgId;
            return this;
        }

        @Override
        public CancelByMsgIdRequest build() {
            return new CancelByMsgIdRequest(this);
        } 

    } 

}
