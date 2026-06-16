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

    private TextTranslateRequest(Builder builder) {
        super(builder);
        this.formatType = builder.formatType;
        this.glossary = builder.glossary;
        this.sourceLanguage = builder.sourceLanguage;
        this.sourceTextList = builder.sourceTextList;
        this.targetLanguage = builder.targetLanguage;
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

    public static final class Builder extends Request.Builder<TextTranslateRequest, Builder> {
        private String formatType; 
        private String glossary; 
        private String sourceLanguage; 
        private java.util.List<String> sourceTextList; 
        private String targetLanguage; 

        private Builder() {
            super();
        } 

        private Builder(TextTranslateRequest request) {
            super(request);
            this.formatType = request.formatType;
            this.glossary = request.glossary;
            this.sourceLanguage = request.sourceLanguage;
            this.sourceTextList = request.sourceTextList;
            this.targetLanguage = request.targetLanguage;
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

        @Override
        public TextTranslateRequest build() {
            return new TextTranslateRequest(this);
        } 

    } 

}
