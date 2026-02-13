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
 * {@link AISearchStreamRequest} extends {@link RequestModel}
 *
 * <p>AISearchStreamRequest</p>
 */
public class AISearchStreamRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("folderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String folderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("message")
    private java.util.List<AISearchMessageItem> message;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("question")
    @com.aliyun.core.annotation.Validation(required = true)
    private String question;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceTypeNeeded")
    private java.util.List<String> resourceTypeNeeded;

    private AISearchStreamRequest(Builder builder) {
        super(builder);
        this.folderId = builder.folderId;
        this.message = builder.message;
        this.question = builder.question;
        this.resourceTypeNeeded = builder.resourceTypeNeeded;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AISearchStreamRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return folderId
     */
    public String getFolderId() {
        return this.folderId;
    }

    /**
     * @return message
     */
    public java.util.List<AISearchMessageItem> getMessage() {
        return this.message;
    }

    /**
     * @return question
     */
    public String getQuestion() {
        return this.question;
    }

    /**
     * @return resourceTypeNeeded
     */
    public java.util.List<String> getResourceTypeNeeded() {
        return this.resourceTypeNeeded;
    }

    public static final class Builder extends Request.Builder<AISearchStreamRequest, Builder> {
        private String folderId; 
        private java.util.List<AISearchMessageItem> message; 
        private String question; 
        private java.util.List<String> resourceTypeNeeded; 

        private Builder() {
            super();
        } 

        private Builder(AISearchStreamRequest request) {
            super(request);
            this.folderId = request.folderId;
            this.message = request.message;
            this.question = request.question;
            this.resourceTypeNeeded = request.resourceTypeNeeded;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1a851c4a-1d65-11ef-99a7-ssfsfdd</p>
         */
        public Builder folderId(String folderId) {
            this.putBodyParameter("folderId", folderId);
            this.folderId = folderId;
            return this;
        }

        /**
         * message.
         */
        public Builder message(java.util.List<AISearchMessageItem> message) {
            this.putBodyParameter("message", message);
            this.message = message;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>“my net is slow, what can I do?”</p>
         */
        public Builder question(String question) {
            this.putBodyParameter("question", question);
            this.question = question;
            return this;
        }

        /**
         * resourceTypeNeeded.
         */
        public Builder resourceTypeNeeded(java.util.List<String> resourceTypeNeeded) {
            this.putBodyParameter("resourceTypeNeeded", resourceTypeNeeded);
            this.resourceTypeNeeded = resourceTypeNeeded;
            return this;
        }

        @Override
        public AISearchStreamRequest build() {
            return new AISearchStreamRequest(this);
        } 

    } 

}
