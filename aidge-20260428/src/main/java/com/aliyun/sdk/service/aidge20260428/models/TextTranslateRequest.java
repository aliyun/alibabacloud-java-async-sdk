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
         * <p>This field represents your identity and facilitates communication for various issues. If you are an internal Alibaba organization, we recommend that you specify this parameter based on the actual scenario, such as BU name-product or BU name-chat. If you are an external Alibaba partner, we recommend that you specify the full name of your company. The company name must be the same as the company name you used when registering your Alibaba Cloud account.</p>
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
         * <p>The format type of the source text. This parameter is optional. Valid values:</p>
         * <ul>
         * <li>text: Plain text format.</li>
         * <li>html: Web page format, which retains HTML tags.</li>
         * </ul>
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
         * <p>The ID of the intervention glossary. This parameter is optional. You must create the glossary in the console and provide its ID. If the provided intervention glossary ID is empty, the translation results are not modified.</p>
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
         * <p>The source language code. If this parameter is not specified, the language is automatically detected. This parameter is optional. You can set this parameter to auto for language identification.<br>&lt;props=&quot;china&quot;&gt;For supported language pairs, see <a href="https://www.alibabacloud.com/help/en/document_detail/3041883.html">Language pair mapping table</a>.      </p>
         * <p>&lt;props=&quot;intl&quot;&gt;For supported language pairs, see <a href="https://www.alibabacloud.com/help/zh/aidge/language-direction-mapping">Language pair mapping table</a>.</p>
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
         * <p>The list of text to be translated. This parameter is required. The total character length cannot exceed 50,000, and the list length cannot exceed 50.</p>
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
         * <p>The target language code. This parameter is required.<br>&lt;props=&quot;china&quot;&gt;For supported language pairs, see <a href="https://www.alibabacloud.com/help/en/document_detail/3041883.html">Language pair mapping table</a>.      </p>
         * <p>&lt;props=&quot;intl&quot;&gt;For supported language pairs, see <a href="https://www.alibabacloud.com/help/zh/aidge/language-direction-mapping">Language pair mapping table</a>.</p>
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
         * <p>The business scenario identifier. You can specify only one of the following values. After the value is specified, the translation engine calls the terminology library and style policy of the corresponding industry to output translations that better fit the industry. If this parameter is not specified or an invalid value is specified, the general translation policy is used. Valid values:</p>
         * <ul>
         * <li>e-commerce-title: Cross-border e-commerce product title translation.</li>
         * <li>e-commerce-description: Cross-border e-commerce product description translation.</li>
         * <li>e-commerce-chat: Cross-border e-commerce conversation translation.</li>
         * <li>e-commerce-cpv: Cross-border e-commerce product CPV attribute translation.</li>
         * <li>novel: Novel translation.</li>
         * <li>game: Game translation.</li>
         * </ul>
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
