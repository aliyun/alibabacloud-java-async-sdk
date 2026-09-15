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
 * {@link TextCorrectRequest} extends {@link RequestModel}
 *
 * <p>TextCorrectRequest</p>
 */
public class TextCorrectRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceLanguage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceText")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceText;

    private TextCorrectRequest(Builder builder) {
        super(builder);
        this.sourceLanguage = builder.sourceLanguage;
        this.sourceText = builder.sourceText;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TextCorrectRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceLanguage
     */
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    /**
     * @return sourceText
     */
    public String getSourceText() {
        return this.sourceText;
    }

    public static final class Builder extends Request.Builder<TextCorrectRequest, Builder> {
        private String sourceLanguage; 
        private String sourceText; 

        private Builder() {
            super();
        } 

        private Builder(TextCorrectRequest request) {
            super(request);
            this.sourceLanguage = request.sourceLanguage;
            this.sourceText = request.sourceText;
        } 

        /**
         * <p>The source language code. This parameter is required. You can set this parameter to auto for automatic language detection. 14 languages are supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>de</p>
         */
        public Builder sourceLanguage(String sourceLanguage) {
            this.putQueryParameter("SourceLanguage", sourceLanguage);
            this.sourceLanguage = sourceLanguage;
            return this;
        }

        /**
         * <p>The text to correct. This parameter is required.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Empfelung</p>
         */
        public Builder sourceText(String sourceText) {
            this.putQueryParameter("SourceText", sourceText);
            this.sourceText = sourceText;
            return this;
        }

        @Override
        public TextCorrectRequest build() {
            return new TextCorrectRequest(this);
        } 

    } 

}
