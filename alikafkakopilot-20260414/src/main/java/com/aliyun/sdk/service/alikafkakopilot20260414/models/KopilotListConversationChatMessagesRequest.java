// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafkakopilot20260414.models;

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
 * {@link KopilotListConversationChatMessagesRequest} extends {@link RequestModel}
 *
 * <p>KopilotListConversationChatMessagesRequest</p>
 */
public class KopilotListConversationChatMessagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeforeTurnId")
    private Integer beforeTurnId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    private KopilotListConversationChatMessagesRequest(Builder builder) {
        super(builder);
        this.beforeTurnId = builder.beforeTurnId;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KopilotListConversationChatMessagesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beforeTurnId
     */
    public Integer getBeforeTurnId() {
        return this.beforeTurnId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<KopilotListConversationChatMessagesRequest, Builder> {
        private Integer beforeTurnId; 
        private Integer pageSize; 
        private String regionId; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(KopilotListConversationChatMessagesRequest request) {
            super(request);
            this.beforeTurnId = request.beforeTurnId;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.sessionId = request.sessionId;
        } 

        /**
         * BeforeTurnId.
         */
        public Builder beforeTurnId(Integer beforeTurnId) {
            this.putQueryParameter("BeforeTurnId", beforeTurnId);
            this.beforeTurnId = beforeTurnId;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public KopilotListConversationChatMessagesRequest build() {
            return new KopilotListConversationChatMessagesRequest(this);
        } 

    } 

}
