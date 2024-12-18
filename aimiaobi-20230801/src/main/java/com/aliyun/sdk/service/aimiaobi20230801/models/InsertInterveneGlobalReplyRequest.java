// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link InsertInterveneGlobalReplyRequest} extends {@link RequestModel}
 *
 * <p>InsertInterveneGlobalReplyRequest</p>
 */
public class InsertInterveneGlobalReplyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReplyMessagList")
    private java.util.List<ReplyMessagList> replyMessagList;

    private InsertInterveneGlobalReplyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
    public java.util.List<ReplyMessagList> getReplyMessagList() {
        return this.replyMessagList;
    }

    public static final class Builder extends Request.Builder<InsertInterveneGlobalReplyRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private java.util.List<ReplyMessagList> replyMessagList; 

        private Builder() {
            super();
        } 

        private Builder(InsertInterveneGlobalReplyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.replyMessagList = request.replyMessagList;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx_efm</p>
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * ReplyMessagList.
         */
        public Builder replyMessagList(java.util.List<ReplyMessagList> replyMessagList) {
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

    /**
     * 
     * {@link InsertInterveneGlobalReplyRequest} extends {@link TeaModel}
     *
     * <p>InsertInterveneGlobalReplyRequest</p>
     */
    public static class ReplyMessagList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("ReplyType")
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
