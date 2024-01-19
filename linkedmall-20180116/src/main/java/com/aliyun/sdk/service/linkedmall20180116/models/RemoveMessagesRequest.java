// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveMessagesRequest} extends {@link RequestModel}
 *
 * <p>RemoveMessagesRequest</p>
 */
public class RemoveMessagesRequest extends Request {
    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("ExtJson")
    private String extJson;

    @Query
    @NameInMap("MessageIds")
    @Validation(required = true)
    private String messageIds;

    private RemoveMessagesRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.extJson = builder.extJson;
        this.messageIds = builder.messageIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveMessagesRequest create() {
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
     * @return extJson
     */
    public String getExtJson() {
        return this.extJson;
    }

    /**
     * @return messageIds
     */
    public String getMessageIds() {
        return this.messageIds;
    }

    public static final class Builder extends Request.Builder<RemoveMessagesRequest, Builder> {
        private String bizId; 
        private String extJson; 
        private String messageIds; 

        private Builder() {
            super();
        } 

        private Builder(RemoveMessagesRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.extJson = request.extJson;
            this.messageIds = request.messageIds;
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
         * ExtJson.
         */
        public Builder extJson(String extJson) {
            this.putQueryParameter("ExtJson", extJson);
            this.extJson = extJson;
            return this;
        }

        /**
         * MessageIds.
         */
        public Builder messageIds(String messageIds) {
            this.putQueryParameter("MessageIds", messageIds);
            this.messageIds = messageIds;
            return this;
        }

        @Override
        public RemoveMessagesRequest build() {
            return new RemoveMessagesRequest(this);
        } 

    } 

}
