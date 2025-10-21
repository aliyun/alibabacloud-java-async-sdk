// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rai20240701.models;

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
 * {@link ListModelCategoryRequest} extends {@link RequestModel}
 *
 * <p>ListModelCategoryRequest</p>
 */
public class ListModelCategoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentSafeImageSupported")
    private Integer contentSafeImageSupported;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentSafeTextSupported")
    private Integer contentSafeTextSupported;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelCategoryName")
    private String modelCategoryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelSource")
    private String modelSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromptAttackTextSupported")
    private Integer promptAttackTextSupported;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SensitiveTopicTextSupported")
    private Integer sensitiveTopicTextSupported;

    private ListModelCategoryRequest(Builder builder) {
        super(builder);
        this.contentSafeImageSupported = builder.contentSafeImageSupported;
        this.contentSafeTextSupported = builder.contentSafeTextSupported;
        this.modelCategoryName = builder.modelCategoryName;
        this.modelSource = builder.modelSource;
        this.promptAttackTextSupported = builder.promptAttackTextSupported;
        this.sensitiveTopicTextSupported = builder.sensitiveTopicTextSupported;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelCategoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contentSafeImageSupported
     */
    public Integer getContentSafeImageSupported() {
        return this.contentSafeImageSupported;
    }

    /**
     * @return contentSafeTextSupported
     */
    public Integer getContentSafeTextSupported() {
        return this.contentSafeTextSupported;
    }

    /**
     * @return modelCategoryName
     */
    public String getModelCategoryName() {
        return this.modelCategoryName;
    }

    /**
     * @return modelSource
     */
    public String getModelSource() {
        return this.modelSource;
    }

    /**
     * @return promptAttackTextSupported
     */
    public Integer getPromptAttackTextSupported() {
        return this.promptAttackTextSupported;
    }

    /**
     * @return sensitiveTopicTextSupported
     */
    public Integer getSensitiveTopicTextSupported() {
        return this.sensitiveTopicTextSupported;
    }

    public static final class Builder extends Request.Builder<ListModelCategoryRequest, Builder> {
        private Integer contentSafeImageSupported; 
        private Integer contentSafeTextSupported; 
        private String modelCategoryName; 
        private String modelSource; 
        private Integer promptAttackTextSupported; 
        private Integer sensitiveTopicTextSupported; 

        private Builder() {
            super();
        } 

        private Builder(ListModelCategoryRequest request) {
            super(request);
            this.contentSafeImageSupported = request.contentSafeImageSupported;
            this.contentSafeTextSupported = request.contentSafeTextSupported;
            this.modelCategoryName = request.modelCategoryName;
            this.modelSource = request.modelSource;
            this.promptAttackTextSupported = request.promptAttackTextSupported;
            this.sensitiveTopicTextSupported = request.sensitiveTopicTextSupported;
        } 

        /**
         * ContentSafeImageSupported.
         */
        public Builder contentSafeImageSupported(Integer contentSafeImageSupported) {
            this.putQueryParameter("ContentSafeImageSupported", contentSafeImageSupported);
            this.contentSafeImageSupported = contentSafeImageSupported;
            return this;
        }

        /**
         * ContentSafeTextSupported.
         */
        public Builder contentSafeTextSupported(Integer contentSafeTextSupported) {
            this.putQueryParameter("ContentSafeTextSupported", contentSafeTextSupported);
            this.contentSafeTextSupported = contentSafeTextSupported;
            return this;
        }

        /**
         * ModelCategoryName.
         */
        public Builder modelCategoryName(String modelCategoryName) {
            this.putQueryParameter("ModelCategoryName", modelCategoryName);
            this.modelCategoryName = modelCategoryName;
            return this;
        }

        /**
         * ModelSource.
         */
        public Builder modelSource(String modelSource) {
            this.putQueryParameter("ModelSource", modelSource);
            this.modelSource = modelSource;
            return this;
        }

        /**
         * PromptAttackTextSupported.
         */
        public Builder promptAttackTextSupported(Integer promptAttackTextSupported) {
            this.putQueryParameter("PromptAttackTextSupported", promptAttackTextSupported);
            this.promptAttackTextSupported = promptAttackTextSupported;
            return this;
        }

        /**
         * SensitiveTopicTextSupported.
         */
        public Builder sensitiveTopicTextSupported(Integer sensitiveTopicTextSupported) {
            this.putQueryParameter("SensitiveTopicTextSupported", sensitiveTopicTextSupported);
            this.sensitiveTopicTextSupported = sensitiveTopicTextSupported;
            return this;
        }

        @Override
        public ListModelCategoryRequest build() {
            return new ListModelCategoryRequest(this);
        } 

    } 

}
