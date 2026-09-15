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
 * {@link TextTranslateRequest} extends {@link RequestModel}
 *
 * <p>TextTranslateRequest</p>
 */
public class TextTranslateRequest extends Request {
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

    private TextTranslateRequest(Builder builder) {
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

    public static TextTranslateRequest create() {
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

    public static final class Builder extends Request.Builder<TextTranslateRequest, Builder> {
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

        private Builder(TextTranslateRequest request) {
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
         * <p>This field represents your identity and facilitates communication for various issues. If you are an Alibaba internal organization, specify a value based on your actual scenario, such as BU name-product or BU name-chat. If you are an external Alibaba partner, specify the full name of your company. This company name must be consistent with the company name used when you registered your Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>MyCompany-Chat</p>
         */
        public Builder bizName(String bizName) {
            this.putBodyParameter("BizName", bizName);
            this.bizName = bizName;
            return this;
        }

        /**
         * <p>The format type of the source text. This parameter is optional. Valid values: text (plain text format) and html (web page format, which preserves HTML tags).</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        public Builder formatType(String formatType) {
            this.putBodyParameter("FormatType", formatType);
            this.formatType = formatType;
            return this;
        }

        /**
         * <p>The intervention glossary ID. This parameter is optional. The glossary must be created separately in the console, and its ID must be provided. If the glossary ID is empty, the translation results are not modified.</p>
         * 
         * <strong>example:</strong>
         * <p>glossary_1</p>
         */
        public Builder glossary(String glossary) {
            this.putBodyParameter("Glossary", glossary);
            this.glossary = glossary;
            return this;
        }

        /**
         * <p>The source language code. This parameter is optional. If not specified, the language is automatically detected. You can set this parameter to auto for language detection. For supported language directions, see <a href="https://www.alibabacloud.com/help/en/document_detail/3041883.html">Language direction mapping table</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        public Builder sourceLanguage(String sourceLanguage) {
            this.putBodyParameter("SourceLanguage", sourceLanguage);
            this.sourceLanguage = sourceLanguage;
            return this;
        }

        /**
         * <p>The list of texts to translate. This parameter is required. The total character length cannot exceed 50,000, and the list length cannot exceed 50.</p>
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
         * <p>The target language code. This parameter is required. For supported language directions, see <a href="https://www.alibabacloud.com/help/en/document_detail/3041883.html">Language direction mapping table</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ko</p>
         */
        public Builder targetLanguage(String targetLanguage) {
            this.putBodyParameter("TargetLanguage", targetLanguage);
            this.targetLanguage = targetLanguage;
            return this;
        }

        /**
         * <p>The business scenario identifier. You can pass in only one of the following values. When specified, the translation engine invokes the corresponding industry terminology library and style strategy to produce translations that better fit the industry. If this field is not specified or an invalid value is passed, the general translation strategy is used. Valid values: e-commerce-title (cross-border e-commerce product title translation), e-commerce-description (cross-border e-commerce product description translation), e-commerce-chat (cross-border e-commerce conversation translation), e-commerce-cpv (cross-border e-commerce product CPV attribute translation), novel (novel translation), game (game translation).</p>
         * 
         * <strong>example:</strong>
         * <p>e-commerce-title</p>
         */
        public Builder translateScene(String translateScene) {
            this.putBodyParameter("TranslateScene", translateScene);
            this.translateScene = translateScene;
            return this;
        }

        @Override
        public TextTranslateRequest build() {
            return new TextTranslateRequest(this);
        } 

    } 

}
