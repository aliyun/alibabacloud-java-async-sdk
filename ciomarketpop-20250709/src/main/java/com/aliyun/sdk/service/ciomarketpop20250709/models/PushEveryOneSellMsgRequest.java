// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ciomarketpop20250709.models;

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
 * {@link PushEveryOneSellMsgRequest} extends {@link RequestModel}
 *
 * <p>PushEveryOneSellMsgRequest</p>
 */
public class PushEveryOneSellMsgRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DingIdList")
    private java.util.List<String> dingIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PushMsg")
    private String pushMsg;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PushType")
    private String pushType;

    private PushEveryOneSellMsgRequest(Builder builder) {
        super(builder);
        this.dingIdList = builder.dingIdList;
        this.pushMsg = builder.pushMsg;
        this.pushType = builder.pushType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushEveryOneSellMsgRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dingIdList
     */
    public java.util.List<String> getDingIdList() {
        return this.dingIdList;
    }

    /**
     * @return pushMsg
     */
    public String getPushMsg() {
        return this.pushMsg;
    }

    /**
     * @return pushType
     */
    public String getPushType() {
        return this.pushType;
    }

    public static final class Builder extends Request.Builder<PushEveryOneSellMsgRequest, Builder> {
        private java.util.List<String> dingIdList; 
        private String pushMsg; 
        private String pushType; 

        private Builder() {
            super();
        } 

        private Builder(PushEveryOneSellMsgRequest request) {
            super(request);
            this.dingIdList = request.dingIdList;
            this.pushMsg = request.pushMsg;
            this.pushType = request.pushType;
        } 

        /**
         * DingIdList.
         */
        public Builder dingIdList(java.util.List<String> dingIdList) {
            String dingIdListShrink = shrink(dingIdList, "DingIdList", "json");
            this.putBodyParameter("DingIdList", dingIdListShrink);
            this.dingIdList = dingIdList;
            return this;
        }

        /**
         * PushMsg.
         */
        public Builder pushMsg(String pushMsg) {
            this.putBodyParameter("PushMsg", pushMsg);
            this.pushMsg = pushMsg;
            return this;
        }

        /**
         * PushType.
         */
        public Builder pushType(String pushType) {
            this.putBodyParameter("PushType", pushType);
            this.pushType = pushType;
            return this;
        }

        @Override
        public PushEveryOneSellMsgRequest build() {
            return new PushEveryOneSellMsgRequest(this);
        } 

    } 

}
