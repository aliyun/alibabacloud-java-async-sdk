// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paicopilot20250731.models;

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
 * {@link ListChatsResponseBody} extends {@link TeaModel}
 *
 * <p>ListChatsResponseBody</p>
 */
public class ListChatsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Chats")
    private java.util.List<Chat> chats;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListChatsResponseBody(Builder builder) {
        this.chats = builder.chats;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChatsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chats
     */
    public java.util.List<Chat> getChats() {
        return this.chats;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Chat> chats; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListChatsResponseBody model) {
            this.chats = model.chats;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Chats.
         */
        public Builder chats(java.util.List<Chat> chats) {
            this.chats = chats;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListChatsResponseBody build() {
            return new ListChatsResponseBody(this);
        } 

    } 

}
