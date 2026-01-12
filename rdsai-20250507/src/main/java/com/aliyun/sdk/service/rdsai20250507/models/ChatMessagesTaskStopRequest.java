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
 * {@link ChatMessagesTaskStopRequest} extends {@link RequestModel}
 *
 * <p>ChatMessagesTaskStopRequest</p>
 */
public class ChatMessagesTaskStopRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private ChatMessagesTaskStopRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatMessagesTaskStopRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<ChatMessagesTaskStopRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(ChatMessagesTaskStopRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * <p>The operation that you want to perform. Set the value to <strong>ChatMessagesTaskStop</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>09a81048-0528-4de5-9dbd-12c8a12b****</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public ChatMessagesTaskStopRequest build() {
            return new ChatMessagesTaskStopRequest(this);
        } 

    } 

}
