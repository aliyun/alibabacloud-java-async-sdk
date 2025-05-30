// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link TranspositionResult} extends {@link TeaModel}
 *
 * <p>TranspositionResult</p>
 */
public class TranspositionResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("TargetLanguage")
    private String targetLanguage;

    @com.aliyun.core.annotation.NameInMap("TranslatedText")
    private String translatedText;

    private TranspositionResult(Builder builder) {
        this.targetLanguage = builder.targetLanguage;
        this.translatedText = builder.translatedText;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TranspositionResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return targetLanguage
     */
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    /**
     * @return translatedText
     */
    public String getTranslatedText() {
        return this.translatedText;
    }

    public static final class Builder {
        private String targetLanguage; 
        private String translatedText; 

        private Builder() {
        } 

        private Builder(TranspositionResult model) {
            this.targetLanguage = model.targetLanguage;
            this.translatedText = model.translatedText;
        } 

        /**
         * TargetLanguage.
         */
        public Builder targetLanguage(String targetLanguage) {
            this.targetLanguage = targetLanguage;
            return this;
        }

        /**
         * TranslatedText.
         */
        public Builder translatedText(String translatedText) {
            this.translatedText = translatedText;
            return this;
        }

        public TranspositionResult build() {
            return new TranspositionResult(this);
        } 

    } 

}
