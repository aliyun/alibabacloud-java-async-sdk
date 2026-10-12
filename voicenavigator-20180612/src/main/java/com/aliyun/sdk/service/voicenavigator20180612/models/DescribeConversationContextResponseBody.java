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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeConversationContextResponseBody model) {
            this.conversationContext = model.conversationContext;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The session context data.</p>
         * 
         * <strong>example:</strong>
         * <p>{         &quot;CallingNumber&quot;: &quot;135815***&quot;,         &quot;AdditionalContext&quot;: &quot;&quot;,         &quot;ConversationId&quot;: &quot;361c8a53-0e29-42f3-8aa7-c7752d010399&quot;     }</p>
         */
        public Builder conversationContext(String conversationContext) {
            this.conversationContext = conversationContext;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b19af5ce5314ac08108d1b33fe20e15</p>
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
