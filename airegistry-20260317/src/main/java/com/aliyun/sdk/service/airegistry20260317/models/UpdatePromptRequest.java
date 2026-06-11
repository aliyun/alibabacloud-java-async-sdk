// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airegistry20260317.models;

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
 * {@link UpdatePromptRequest} extends {@link RequestModel}
 *
 * <p>UpdatePromptRequest</p>
 */
public class UpdatePromptRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizTags")
    private java.util.List<String> bizTags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.Map<String, ?> labels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromptKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String promptKey;

    private UpdatePromptRequest(Builder builder) {
        super(builder);
        this.bizTags = builder.bizTags;
        this.description = builder.description;
        this.labels = builder.labels;
        this.namespaceId = builder.namespaceId;
        this.promptKey = builder.promptKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePromptRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizTags
     */
    public java.util.List<String> getBizTags() {
        return this.bizTags;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return labels
     */
    public java.util.Map<String, ?> getLabels() {
        return this.labels;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return promptKey
     */
    public String getPromptKey() {
        return this.promptKey;
    }

    public static final class Builder extends Request.Builder<UpdatePromptRequest, Builder> {
        private java.util.List<String> bizTags; 
        private String description; 
        private java.util.Map<String, ?> labels; 
        private String namespaceId; 
        private String promptKey; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePromptRequest request) {
            super(request);
            this.bizTags = request.bizTags;
            this.description = request.description;
            this.labels = request.labels;
            this.namespaceId = request.namespaceId;
            this.promptKey = request.promptKey;
        } 

        /**
         * BizTags.
         */
        public Builder bizTags(java.util.List<String> bizTags) {
            String bizTagsShrink = shrink(bizTags, "BizTags", "json");
            this.putQueryParameter("BizTags", bizTagsShrink);
            this.bizTags = bizTags;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.Map<String, ?> labels) {
            String labelsShrink = shrink(labels, "Labels", "json");
            this.putQueryParameter("Labels", labelsShrink);
            this.labels = labels;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customer-service-qa</p>
         */
        public Builder promptKey(String promptKey) {
            this.putQueryParameter("PromptKey", promptKey);
            this.promptKey = promptKey;
            return this;
        }

        @Override
        public UpdatePromptRequest build() {
            return new UpdatePromptRequest(this);
        } 

    } 

}
