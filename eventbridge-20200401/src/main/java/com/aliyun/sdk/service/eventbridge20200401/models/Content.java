// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link Content} extends {@link TeaModel}
 *
 * <p>Content</p>
 */
public class Content extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MessageAttachments")
    private java.util.List<AguiMessage> messageAttachments;

    @com.aliyun.core.annotation.NameInMap("QueryAttachments")
    private java.util.List<QueryAttachment> queryAttachments;

    @com.aliyun.core.annotation.NameInMap("TextAttachments")
    private java.util.List<String> textAttachments;

    private Content(Builder builder) {
        this.messageAttachments = builder.messageAttachments;
        this.queryAttachments = builder.queryAttachments;
        this.textAttachments = builder.textAttachments;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Content create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return messageAttachments
     */
    public java.util.List<AguiMessage> getMessageAttachments() {
        return this.messageAttachments;
    }

    /**
     * @return queryAttachments
     */
    public java.util.List<QueryAttachment> getQueryAttachments() {
        return this.queryAttachments;
    }

    /**
     * @return textAttachments
     */
    public java.util.List<String> getTextAttachments() {
        return this.textAttachments;
    }

    public static final class Builder {
        private java.util.List<AguiMessage> messageAttachments; 
        private java.util.List<QueryAttachment> queryAttachments; 
        private java.util.List<String> textAttachments; 

        private Builder() {
        } 

        private Builder(Content model) {
            this.messageAttachments = model.messageAttachments;
            this.queryAttachments = model.queryAttachments;
            this.textAttachments = model.textAttachments;
        } 

        /**
         * MessageAttachments.
         */
        public Builder messageAttachments(java.util.List<AguiMessage> messageAttachments) {
            this.messageAttachments = messageAttachments;
            return this;
        }

        /**
         * QueryAttachments.
         */
        public Builder queryAttachments(java.util.List<QueryAttachment> queryAttachments) {
            this.queryAttachments = queryAttachments;
            return this;
        }

        /**
         * TextAttachments.
         */
        public Builder textAttachments(java.util.List<String> textAttachments) {
            this.textAttachments = textAttachments;
            return this;
        }

        public Content build() {
            return new Content(this);
        } 

    } 

}
