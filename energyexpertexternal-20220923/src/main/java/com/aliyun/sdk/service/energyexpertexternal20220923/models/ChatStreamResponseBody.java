// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link ChatStreamResponseBody} extends {@link TeaModel}
 *
 * <p>ChatStreamResponseBody</p>
 */
public class ChatStreamResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private ChatItem data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ChatStreamResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatStreamResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public ChatItem getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ChatItem data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ChatStreamResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Q&amp;A content.</p>
         */
        public Builder data(ChatItem data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ChatStreamResponseBody build() {
            return new ChatStreamResponseBody(this);
        } 

    } 

}
