// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_push20220225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMsgStatRequest} extends {@link RequestModel}
 *
 * <p>QueryMsgStatRequest</p>
 */
public class QueryMsgStatRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MsgId")
    private String msgId;

    private QueryMsgStatRequest(Builder builder) {
        super(builder);
        this.msgId = builder.msgId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMsgStatRequest create() {
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

    public static final class Builder extends Request.Builder<QueryMsgStatRequest, Builder> {
        private String msgId; 

        private Builder() {
            super();
        } 

        private Builder(QueryMsgStatRequest request) {
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
        public QueryMsgStatRequest build() {
            return new QueryMsgStatRequest(this);
        } 

    } 

}
