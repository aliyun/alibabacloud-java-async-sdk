// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link SearchAliDingGroupChatsResponseBody} extends {@link TeaModel}
 *
 * <p>SearchAliDingGroupChatsResponseBody</p>
 */
public class SearchAliDingGroupChatsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("hasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextCursor")
    private String nextCursor;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private SearchAliDingGroupChatsResponseBody(Builder builder) {
        this.code = builder.code;
        this.hasMore = builder.hasMore;
        this.items = builder.items;
        this.message = builder.message;
        this.nextCursor = builder.nextCursor;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchAliDingGroupChatsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextCursor
     */
    public String getNextCursor() {
        return this.nextCursor;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Boolean hasMore; 
        private java.util.List<Items> items; 
        private String message; 
        private String nextCursor; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SearchAliDingGroupChatsResponseBody model) {
            this.code = model.code;
            this.hasMore = model.hasMore;
            this.items = model.items;
            this.message = model.message;
            this.nextCursor = model.nextCursor;
            this.requestId = model.requestId;
        } 

        /**
         * <p>业务状态码</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>是否还有下一页</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>下一页分页游标，末页为空</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder nextCursor(String nextCursor) {
            this.nextCursor = nextCursor;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>request-id</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SearchAliDingGroupChatsResponseBody build() {
            return new SearchAliDingGroupChatsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchAliDingGroupChatsResponseBody} extends {@link TeaModel}
     *
     * <p>SearchAliDingGroupChatsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chatId")
        private String chatId;

        @com.aliyun.core.annotation.NameInMap("conversationType")
        private String conversationType;

        @com.aliyun.core.annotation.NameInMap("muted")
        private Boolean muted;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private Items(Builder builder) {
            this.chatId = builder.chatId;
            this.conversationType = builder.conversationType;
            this.muted = builder.muted;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return chatId
         */
        public String getChatId() {
            return this.chatId;
        }

        /**
         * @return conversationType
         */
        public String getConversationType() {
            return this.conversationType;
        }

        /**
         * @return muted
         */
        public Boolean getMuted() {
            return this.muted;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String chatId; 
            private String conversationType; 
            private Boolean muted; 
            private String title; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.chatId = model.chatId;
                this.conversationType = model.conversationType;
                this.muted = model.muted;
                this.title = model.title;
            } 

            /**
             * <p>阿里钉群聊 ID</p>
             * 
             * <strong>example:</strong>
             * <p>cid-example</p>
             */
            public Builder chatId(String chatId) {
                this.chatId = chatId;
                return this;
            }

            /**
             * <p>会话类型</p>
             * 
             * <strong>example:</strong>
             * <p>INTERNAL_GROUP</p>
             */
            public Builder conversationType(String conversationType) {
                this.conversationType = conversationType;
                return this;
            }

            /**
             * <p>当前用户是否开启免打扰</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder muted(Boolean muted) {
                this.muted = muted;
                return this;
            }

            /**
             * <p>群聊标题</p>
             * 
             * <strong>example:</strong>
             * <p>客户项目群</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
