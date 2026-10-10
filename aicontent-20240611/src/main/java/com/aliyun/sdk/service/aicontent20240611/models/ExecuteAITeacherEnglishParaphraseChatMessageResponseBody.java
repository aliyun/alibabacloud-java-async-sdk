// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ExecuteAITeacherEnglishParaphraseChatMessageResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteAITeacherEnglishParaphraseChatMessageResponseBody</p>
 */
public class ExecuteAITeacherEnglishParaphraseChatMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("event")
    private String event;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ExecuteAITeacherEnglishParaphraseChatMessageResponseBody(Builder builder) {
        this.content = builder.content;
        this.event = builder.event;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteAITeacherEnglishParaphraseChatMessageResponseBody create() {
        return builder().build();
    }

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
     * @return event
     */
    public String getEvent() {
        return this.event;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String content; 
        private String event; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ExecuteAITeacherEnglishParaphraseChatMessageResponseBody model) {
            this.content = model.content;
            this.event = model.event;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The content associated with the event.</p>
         * 
         * <strong>example:</strong>
         * <p>how</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The event type.</p>
         * 
         * <strong>example:</strong>
         * <p>message</p>
         */
        public Builder event(String event) {
            this.event = event;
            return this;
        }

        /**
         * <p>The request ID. This ID is returned with every response and is useful for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExecuteAITeacherEnglishParaphraseChatMessageResponseBody build() {
            return new ExecuteAITeacherEnglishParaphraseChatMessageResponseBody(this);
        } 

    } 

}
