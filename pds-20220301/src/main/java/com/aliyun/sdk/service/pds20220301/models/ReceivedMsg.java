// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link ReceivedMsg} extends {@link TeaModel}
 *
 * <p>ReceivedMsg</p>
 */
public class ReceivedMsg extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("has_read")
    private Boolean hasRead;

    @com.aliyun.core.annotation.NameInMap("msg_category")
    private String msgCategory;

    @com.aliyun.core.annotation.NameInMap("msg_content")
    private MsgContent msgContent;

    @com.aliyun.core.annotation.NameInMap("msg_id")
    private String msgId;

    @com.aliyun.core.annotation.NameInMap("msg_sub_category")
    private String msgSubCategory;

    @com.aliyun.core.annotation.NameInMap("msg_type")
    private String msgType;

    @com.aliyun.core.annotation.NameInMap("publish_at")
    private Long publishAt;

    @com.aliyun.core.annotation.NameInMap("read_at")
    private Long readAt;

    private ReceivedMsg(Builder builder) {
        this.hasRead = builder.hasRead;
        this.msgCategory = builder.msgCategory;
        this.msgContent = builder.msgContent;
        this.msgId = builder.msgId;
        this.msgSubCategory = builder.msgSubCategory;
        this.msgType = builder.msgType;
        this.publishAt = builder.publishAt;
        this.readAt = builder.readAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReceivedMsg create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hasRead
     */
    public Boolean getHasRead() {
        return this.hasRead;
    }

    /**
     * @return msgCategory
     */
    public String getMsgCategory() {
        return this.msgCategory;
    }

    /**
     * @return msgContent
     */
    public MsgContent getMsgContent() {
        return this.msgContent;
    }

    /**
     * @return msgId
     */
    public String getMsgId() {
        return this.msgId;
    }

    /**
     * @return msgSubCategory
     */
    public String getMsgSubCategory() {
        return this.msgSubCategory;
    }

    /**
     * @return msgType
     */
    public String getMsgType() {
        return this.msgType;
    }

    /**
     * @return publishAt
     */
    public Long getPublishAt() {
        return this.publishAt;
    }

    /**
     * @return readAt
     */
    public Long getReadAt() {
        return this.readAt;
    }

    public static final class Builder {
        private Boolean hasRead; 
        private String msgCategory; 
        private MsgContent msgContent; 
        private String msgId; 
        private String msgSubCategory; 
        private String msgType; 
        private Long publishAt; 
        private Long readAt; 

        private Builder() {
        } 

        private Builder(ReceivedMsg model) {
            this.hasRead = model.hasRead;
            this.msgCategory = model.msgCategory;
            this.msgContent = model.msgContent;
            this.msgId = model.msgId;
            this.msgSubCategory = model.msgSubCategory;
            this.msgType = model.msgType;
            this.publishAt = model.publishAt;
            this.readAt = model.readAt;
        } 

        /**
         * has_read.
         */
        public Builder hasRead(Boolean hasRead) {
            this.hasRead = hasRead;
            return this;
        }

        /**
         * msg_category.
         */
        public Builder msgCategory(String msgCategory) {
            this.msgCategory = msgCategory;
            return this;
        }

        /**
         * msg_content.
         */
        public Builder msgContent(MsgContent msgContent) {
            this.msgContent = msgContent;
            return this;
        }

        /**
         * msg_id.
         */
        public Builder msgId(String msgId) {
            this.msgId = msgId;
            return this;
        }

        /**
         * msg_sub_category.
         */
        public Builder msgSubCategory(String msgSubCategory) {
            this.msgSubCategory = msgSubCategory;
            return this;
        }

        /**
         * msg_type.
         */
        public Builder msgType(String msgType) {
            this.msgType = msgType;
            return this;
        }

        /**
         * publish_at.
         */
        public Builder publishAt(Long publishAt) {
            this.publishAt = publishAt;
            return this;
        }

        /**
         * read_at.
         */
        public Builder readAt(Long readAt) {
            this.readAt = readAt;
            return this;
        }

        public ReceivedMsg build() {
            return new ReceivedMsg(this);
        } 

    } 

    /**
     * 
     * {@link ReceivedMsg} extends {@link TeaModel}
     *
     * <p>ReceivedMsg</p>
     */
    public static class MsgContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("msg_data")
        private java.util.Map<String, ?> msgData;

        private MsgContent(Builder builder) {
            this.msgData = builder.msgData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MsgContent create() {
            return builder().build();
        }

        /**
         * @return msgData
         */
        public java.util.Map<String, ?> getMsgData() {
            return this.msgData;
        }

        public static final class Builder {
            private java.util.Map<String, ?> msgData; 

            private Builder() {
            } 

            private Builder(MsgContent model) {
                this.msgData = model.msgData;
            } 

            /**
             * msg_data.
             */
            public Builder msgData(java.util.Map<String, ?> msgData) {
                this.msgData = msgData;
                return this;
            }

            public MsgContent build() {
                return new MsgContent(this);
            } 

        } 

    }
}
