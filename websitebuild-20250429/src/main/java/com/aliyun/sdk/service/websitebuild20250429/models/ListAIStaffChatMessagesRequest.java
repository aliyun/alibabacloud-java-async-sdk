// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link ListAIStaffChatMessagesRequest} extends {@link RequestModel}
 *
 * <p>ListAIStaffChatMessagesRequest</p>
 */
public class ListAIStaffChatMessagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConversationId")
    private String conversationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartCreateTime")
    private String startCreateTime;

    private ListAIStaffChatMessagesRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.conversationId = builder.conversationId;
        this.pageSize = builder.pageSize;
        this.startCreateTime = builder.startCreateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAIStaffChatMessagesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startCreateTime
     */
    public String getStartCreateTime() {
        return this.startCreateTime;
    }

    public static final class Builder extends Request.Builder<ListAIStaffChatMessagesRequest, Builder> {
        private String bizId; 
        private String conversationId; 
        private Integer pageSize; 
        private String startCreateTime; 

        private Builder() {
            super();
        } 

        private Builder(ListAIStaffChatMessagesRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.conversationId = request.conversationId;
            this.pageSize = request.pageSize;
            this.startCreateTime = request.startCreateTime;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * ConversationId.
         */
        public Builder conversationId(String conversationId) {
            this.putBodyParameter("ConversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * StartCreateTime.
         */
        public Builder startCreateTime(String startCreateTime) {
            this.putBodyParameter("StartCreateTime", startCreateTime);
            this.startCreateTime = startCreateTime;
            return this;
        }

        @Override
        public ListAIStaffChatMessagesRequest build() {
            return new ListAIStaffChatMessagesRequest(this);
        } 

    } 

}
