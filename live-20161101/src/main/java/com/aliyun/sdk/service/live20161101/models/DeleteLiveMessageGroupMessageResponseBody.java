// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DeleteLiveMessageGroupMessageResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteLiveMessageGroupMessageResponseBody</p>
 */
public class DeleteLiveMessageGroupMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("MessageId")
    private String messageId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteLiveMessageGroupMessageResponseBody(Builder builder) {
        this.groupId = builder.groupId;
        this.messageId = builder.messageId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLiveMessageGroupMessageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String groupId; 
        private String messageId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteLiveMessageGroupMessageResponseBody model) {
            this.groupId = model.groupId;
            this.messageId = model.messageId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>grouptest</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of the deleted or non-existent message.</p>
         * 
         * <strong>example:</strong>
         * <p>a74a8fbd3cfe4b2daa8517e4e3******</p>
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B95BE680-5A6A-1CAD-8AB1-09DFF5D6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteLiveMessageGroupMessageResponseBody build() {
            return new DeleteLiveMessageGroupMessageResponseBody(this);
        } 

    } 

}
