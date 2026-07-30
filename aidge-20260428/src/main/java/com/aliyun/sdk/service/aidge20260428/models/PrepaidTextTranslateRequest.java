// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link PrepaidTextTranslateRequest} extends {@link RequestModel}
 *
 * <p>PrepaidTextTranslateRequest</p>
 */
public class PrepaidTextTranslateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizName")
    private String bizName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FormatType")
    private String formatType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Glossary")
    private String glossary;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceLanguage")
    private String sourceLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceTextList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> sourceTextList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetLanguage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TranslateScene")
    private String translateScene;

    private PrepaidTextTranslateRequest(Builder builder) {
        super(builder);
        this.bizName = builder.bizName;
        this.formatType = builder.formatType;
        this.glossary = builder.glossary;
        this.sourceLanguage = builder.sourceLanguage;
        this.sourceTextList = builder.sourceTextList;
        this.targetLanguage = builder.targetLanguage;
        this.translateScene = builder.translateScene;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrepaidTextTranslateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizName
     */
    public String getBizName() {
        return this.bizName;
    }

    /**
     * @return formatType
     */
    public String getFormatType() {
        return this.formatType;
    }

    /**
     * @return glossary
     */
    public String getGlossary() {
        return this.glossary;
    }

    /**
     * @return sourceLanguage
     */
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    /**
     * @return sourceTextList
     */
    public java.util.List<String> getSourceTextList() {
        return this.sourceTextList;
    }

    /**
     * @return targetLanguage
     */
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    /**
     * @return translateScene
     */
    public String getTranslateScene() {
        return this.translateScene;
    }

    public static final class Builder extends Request.Builder<PrepaidTextTranslateRequest, Builder> {
        private String bizName; 
        private String formatType; 
        private String glossary; 
        private String sourceLanguage; 
        private java.util.List<String> sourceTextList; 
        private String targetLanguage; 
        private String translateScene; 

        private Builder() {
            super();
        } 

        private Builder(PrepaidTextTranslateRequest request) {
            super(request);
            this.bizName = request.bizName;
            this.formatType = request.formatType;
            this.glossary = request.glossary;
            this.sourceLanguage = request.sourceLanguage;
            this.sourceTextList = request.sourceTextList;
            this.targetLanguage = request.targetLanguage;
            this.translateScene = request.translateScene;
        } 

        /**
         * BizName.
         */
        public Builder bizName(String bizName) {
            this.putBodyParameter("BizName", bizName);
            this.bizName = bizName;
            return this;
        }

        /**
         * FormatType.
         */
        public Builder formatType(String formatType) {
            this.putBodyParameter("FormatType", formatType);
            this.formatType = formatType;
            return this;
        }

        /**
         * Glossary.
         */
        public Builder glossary(String glossary) {
            this.putBodyParameter("Glossary", glossary);
            this.glossary = glossary;
            return this;
        }

        /**
         * SourceLanguage.
         */
        public Builder sourceLanguage(String sourceLanguage) {
            this.putBodyParameter("SourceLanguage", sourceLanguage);
            this.sourceLanguage = sourceLanguage;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;Hello world&quot;]</p>
         */
        public Builder sourceTextList(java.util.List<String> sourceTextList) {
            String sourceTextListShrink = shrink(sourceTextList, "SourceTextList", "json");
            this.putBodyParameter("SourceTextList", sourceTextListShrink);
            this.sourceTextList = sourceTextList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder targetLanguage(String targetLanguage) {
            this.putBodyParameter("TargetLanguage", targetLanguage);
            this.targetLanguage = targetLanguage;
            return this;
        }

        /**
         * TranslateScene.
         */
        public Builder translateScene(String translateScene) {
            this.putBodyParameter("TranslateScene", translateScene);
            this.translateScene = translateScene;
            return this;
        }

        @Override
        public PrepaidTextTranslateRequest build() {
            return new PrepaidTextTranslateRequest(this);
        } 

    } 

}
