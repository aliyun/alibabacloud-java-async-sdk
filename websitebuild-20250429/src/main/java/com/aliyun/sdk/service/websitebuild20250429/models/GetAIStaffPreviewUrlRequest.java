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
 * {@link GetAIStaffPreviewUrlRequest} extends {@link RequestModel}
 *
 * <p>GetAIStaffPreviewUrlRequest</p>
 */
public class GetAIStaffPreviewUrlRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConversationId")
    private String conversationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Restart")
    private Boolean restart;

    private GetAIStaffPreviewUrlRequest(Builder builder) {
        super(builder);
        this.conversationId = builder.conversationId;
        this.restart = builder.restart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAIStaffPreviewUrlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return restart
     */
    public Boolean getRestart() {
        return this.restart;
    }

    public static final class Builder extends Request.Builder<GetAIStaffPreviewUrlRequest, Builder> {
        private String conversationId; 
        private Boolean restart; 

        private Builder() {
            super();
        } 

        private Builder(GetAIStaffPreviewUrlRequest request) {
            super(request);
            this.conversationId = request.conversationId;
            this.restart = request.restart;
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
         * Restart.
         */
        public Builder restart(Boolean restart) {
            this.putBodyParameter("Restart", restart);
            this.restart = restart;
            return this;
        }

        @Override
        public GetAIStaffPreviewUrlRequest build() {
            return new GetAIStaffPreviewUrlRequest(this);
        } 

    } 

}
