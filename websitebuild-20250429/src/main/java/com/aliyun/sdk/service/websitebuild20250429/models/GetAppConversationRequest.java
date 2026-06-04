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
 * {@link GetAppConversationRequest} extends {@link RequestModel}
 *
 * <p>GetAppConversationRequest</p>
 */
public class GetAppConversationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BotId")
    private String botId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConversationId")
    private String conversationId;

    private GetAppConversationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.botId = builder.botId;
        this.conversationId = builder.conversationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppConversationRequest create() {
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
     * @return botId
     */
    public String getBotId() {
        return this.botId;
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    public static final class Builder extends Request.Builder<GetAppConversationRequest, Builder> {
        private String regionId; 
        private String botId; 
        private String conversationId; 

        private Builder() {
            super();
        } 

        private Builder(GetAppConversationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.botId = request.botId;
            this.conversationId = request.conversationId;
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
         * BotId.
         */
        public Builder botId(String botId) {
            this.putQueryParameter("BotId", botId);
            this.botId = botId;
            return this;
        }

        /**
         * ConversationId.
         */
        public Builder conversationId(String conversationId) {
            this.putQueryParameter("ConversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        @Override
        public GetAppConversationRequest build() {
            return new GetAppConversationRequest(this);
        } 

    } 

}
