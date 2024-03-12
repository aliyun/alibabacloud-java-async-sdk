// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertInterveneGlobalReplyRequest} extends {@link RequestModel}
 *
 * <p>InsertInterveneGlobalReplyRequest</p>
 */
public class InsertInterveneGlobalReplyRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Body
    @NameInMap("ReplyMessagList")
    private java.util.List < ReplyMessagList> replyMessagList;

    private InsertInterveneGlobalReplyRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.replyMessagList = builder.replyMessagList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertInterveneGlobalReplyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return replyMessagList
     */
    public java.util.List < ReplyMessagList> getReplyMessagList() {
        return this.replyMessagList;
    }

    public static final class Builder extends Request.Builder<InsertInterveneGlobalReplyRequest, Builder> {
        private String agentKey; 
        private java.util.List < ReplyMessagList> replyMessagList; 

        private Builder() {
            super();
        } 

        private Builder(InsertInterveneGlobalReplyRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.replyMessagList = request.replyMessagList;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * ReplyMessagList.
         */
        public Builder replyMessagList(java.util.List < ReplyMessagList> replyMessagList) {
            String replyMessagListShrink = shrink(replyMessagList, "ReplyMessagList", "json");
            this.putBodyParameter("ReplyMessagList", replyMessagListShrink);
            this.replyMessagList = replyMessagList;
            return this;
        }

        @Override
        public InsertInterveneGlobalReplyRequest build() {
            return new InsertInterveneGlobalReplyRequest(this);
        } 

    } 

    public static class ReplyMessagList extends TeaModel {
        @NameInMap("Message")
        private String message;

        @NameInMap("ReplyType")
        private String replyType;

        private ReplyMessagList(Builder builder) {
            this.message = builder.message;
            this.replyType = builder.replyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReplyMessagList create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return replyType
         */
        public String getReplyType() {
            return this.replyType;
        }

        public static final class Builder {
            private String message; 
            private String replyType; 

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * ReplyType.
             */
            public Builder replyType(String replyType) {
                this.replyType = replyType;
                return this;
            }

            public ReplyMessagList build() {
                return new ReplyMessagList(this);
            } 

        } 

    }
}
