// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

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
 * {@link DescribeConversationContextResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConversationContextResponseBody</p>
 */
public class DescribeConversationContextResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConversationContext")
    private String conversationContext;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeConversationContextResponseBody(Builder builder) {
        this.conversationContext = builder.conversationContext;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConversationContextResponseBody create() {
        return builder().build();
    }

    /**
     * @return conversationContext
     */
    public String getConversationContext() {
        return this.conversationContext;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String conversationContext; 
        private String requestId; 

        /**
         * ConversationContext.
         */
        public Builder conversationContext(String conversationContext) {
            this.conversationContext = conversationContext;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeConversationContextResponseBody build() {
            return new DescribeConversationContextResponseBody(this);
        } 

    } 

}
