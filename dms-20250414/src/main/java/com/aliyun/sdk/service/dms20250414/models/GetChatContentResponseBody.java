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

    @com.aliyun.core.annotation.NameInMap("timestamp")
    private String timestamp;

    private GetChatContentResponseBody(Builder builder) {
        this.category = builder.category;
        this.checkpoint = builder.checkpoint;
        this.content = builder.content;
        this.contentType = builder.contentType;
        this.eventType = builder.eventType;
        this.level = builder.level;
        this.timestamp = builder.timestamp;
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

    /**
     * @return timestamp
     */
    public String getTimestamp() {
        return this.timestamp;
    }

    public static final class Builder {
        private String category; 
        private Long checkpoint; 
        private String content; 
        private String contentType; 
        private String eventType; 
        private Long level; 
        private String timestamp; 

        private Builder() {
        } 

        private Builder(GetChatContentResponseBody model) {
            this.category = model.category;
            this.checkpoint = model.checkpoint;
            this.content = model.content;
            this.contentType = model.contentType;
            this.eventType = model.eventType;
            this.level = model.level;
            this.timestamp = model.timestamp;
        } 

        /**
         * <p>The category of the message, used to assist in parsing the content of the json type. For example, <code>PLAN</code> indicates that the message is a display of an execution plan and conforms to the execution plan schema.</p>
         * 
         * <strong>example:</strong>
         * <p>PLAN</p>
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * <p>The checkpoint value.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder checkpoint(Long checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }

        /**
         * <p>The message content.</p>
         * 
         * <strong>example:</strong>
         * <p>Data understanding completed.</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The type of the content field. Valid values: <code>[str, json]</code>. When the value is json, the content field can be further parsed as a JSON structure.</p>
         * 
         * <strong>example:</strong>
         * <p>str</p>
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>The type of the message, used to distinguish control signals from actual messages. For example, <code>CHAT_START</code> indicates the beginning of an Agent reply, <code>CHAT_FINISH</code> indicates the end of an Agent reply, <code>DATA</code> indicates a message carrying content, and <code>DELTA</code> indicates a part of an incrementally output message.</p>
         * 
         * <strong>example:</strong>
         * <p>DATA</p>
         */
        public Builder eventType(String eventType) {
            this.eventType = eventType;
            return this;
        }

        /**
         * <p>The output level of the message. A higher level indicates higher importance.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder level(Long level) {
            this.level = level;
            return this;
        }

        /**
         * <p>The UNIX timestamp in seconds when this message was generated by the Agent.</p>
         * 
         * <strong>example:</strong>
         * <p>1774578047</p>
         */
        public Builder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public GetChatContentResponseBody build() {
            return new GetChatContentResponseBody(this);
        } 

    } 

}
