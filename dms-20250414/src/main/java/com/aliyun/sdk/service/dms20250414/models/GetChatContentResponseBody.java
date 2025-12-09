// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link GetChatContentResponseBody} extends {@link TeaModel}
 *
 * <p>GetChatContentResponseBody</p>
 */
public class GetChatContentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("checkpoint")
    private Long checkpoint;

    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("content_type")
    private String contentType;

    @com.aliyun.core.annotation.NameInMap("event_type")
    private String eventType;

    @com.aliyun.core.annotation.NameInMap("level")
    private Long level;

    private GetChatContentResponseBody(Builder builder) {
        this.category = builder.category;
        this.checkpoint = builder.checkpoint;
        this.content = builder.content;
        this.contentType = builder.contentType;
        this.eventType = builder.eventType;
        this.level = builder.level;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChatContentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return checkpoint
     */
    public Long getCheckpoint() {
        return this.checkpoint;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return level
     */
    public Long getLevel() {
        return this.level;
    }

    public static final class Builder {
        private String category; 
        private Long checkpoint; 
        private String content; 
        private String contentType; 
        private String eventType; 
        private Long level; 

        private Builder() {
        } 

        private Builder(GetChatContentResponseBody model) {
            this.category = model.category;
            this.checkpoint = model.checkpoint;
            this.content = model.content;
            this.contentType = model.contentType;
            this.eventType = model.eventType;
            this.level = model.level;
        } 

        /**
         * category.
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * checkpoint.
         */
        public Builder checkpoint(Long checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }

        /**
         * content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * content_type.
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * event_type.
         */
        public Builder eventType(String eventType) {
            this.eventType = eventType;
            return this;
        }

        /**
         * level.
         */
        public Builder level(Long level) {
            this.level = level;
            return this;
        }

        public GetChatContentResponseBody build() {
            return new GetChatContentResponseBody(this);
        } 

    } 

}
