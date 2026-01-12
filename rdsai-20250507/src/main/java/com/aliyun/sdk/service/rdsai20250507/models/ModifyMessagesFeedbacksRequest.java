// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link ModifyMessagesFeedbacksRequest} extends {@link RequestModel}
 *
 * <p>ModifyMessagesFeedbacksRequest</p>
 */
public class ModifyMessagesFeedbacksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageId")
    private String messageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rating")
    private String rating;

    private ModifyMessagesFeedbacksRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.messageId = builder.messageId;
        this.rating = builder.rating;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMessagesFeedbacksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * @return rating
     */
    public String getRating() {
        return this.rating;
    }

    public static final class Builder extends Request.Builder<ModifyMessagesFeedbacksRequest, Builder> {
        private String content; 
        private String messageId; 
        private String rating; 

        private Builder() {
            super();
        } 

        private Builder(ModifyMessagesFeedbacksRequest request) {
            super(request);
            this.content = request.content;
            this.messageId = request.messageId;
            this.rating = request.rating;
        } 

        /**
         * <p>The rating of the message.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>like</li>
         * <li>dislike</li>
         * </ul>
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>The operation that you want to perform. Set the value to <strong>ModifyMessagesFeedbacks</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>yy9rkn6q-js75-0dka-0cc2-6b5o86uj****</p>
         */
        public Builder messageId(String messageId) {
            this.putQueryParameter("MessageId", messageId);
            this.messageId = messageId;
            return this;
        }

        /**
         * <p>The message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>like</p>
         */
        public Builder rating(String rating) {
            this.putQueryParameter("Rating", rating);
            this.rating = rating;
            return this;
        }

        @Override
        public ModifyMessagesFeedbacksRequest build() {
            return new ModifyMessagesFeedbacksRequest(this);
        } 

    } 

}
