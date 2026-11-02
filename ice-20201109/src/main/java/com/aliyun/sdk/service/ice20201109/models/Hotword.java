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
 * {@link Hotword} extends {@link TeaModel}
 *
 * <p>Hotword</p>
 */
public class Hotword extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.NameInMap("Text")
    private String text;

    @com.aliyun.core.annotation.NameInMap("TranspositionResultList")
    private java.util.List<TranspositionResult> transpositionResultList;

    @com.aliyun.core.annotation.NameInMap("Weight")
    private Integer weight;

    private Hotword(Builder builder) {
        this.language = builder.language;
        this.text = builder.text;
        this.transpositionResultList = builder.transpositionResultList;
        this.weight = builder.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Hotword create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    /**
     * @return transpositionResultList
     */
    public java.util.List<TranspositionResult> getTranspositionResultList() {
        return this.transpositionResultList;
    }

    /**
     * @return weight
     */
    public Integer getWeight() {
        return this.weight;
    }

    public static final class Builder {
        private String language; 
        private String text; 
        private java.util.List<TranspositionResult> transpositionResultList; 
        private Integer weight; 

        private Builder() {
        } 

        private Builder(Hotword model) {
            this.language = model.language;
            this.text = model.text;
            this.transpositionResultList = model.transpositionResultList;
            this.weight = model.weight;
        } 

        /**
         * <p>The language of the hotword text. Valid values:</p>
         * <ul>
         * <li>For structured media analysis and ASR: zh: Chinese en: English</li>
         * <li>For video translation: Supports 53 languages.</li>
         * <li></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder language(String language) {
            this.language = language;
            return this;
        }

        /**
         * <p>The text of the hotword.</p>
         * <ul>
         * <li>For structured media analysis and ASR:</li>
         * <li><ul>
         * <li>Chinese: Up to 15 characters.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>English: Up to 10 words, separated by spaces.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>Mixed: Each letter is counted as one character (following the Chinese limit).</li>
         * </ul>
         * </li>
         * <li>For video translation: Up to 100 characters.</li>
         * <li></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }

        /**
         * <ul>
         * <li>Predefined translation results for the hotword.</li>
         * <li>This field is only used in translation-related scenarios.</li>
         * </ul>
         */
        public Builder transpositionResultList(java.util.List<TranspositionResult> transpositionResultList) {
            this.transpositionResultList = transpositionResultList;
            return this;
        }

        /**
         * <p>The weight of the hotword.</p>
         * <ol>
         * <li>Valid values: [-6,5].</li>
         * <li>A positive value increases the likelihood of the word being recognized, while a negative value decreases the likelihood.</li>
         * <li>A value of -6 specifies that recognition of this word should be minimized.</li>
         * <li>Recommended value: 2.</li>
         * <li>If the desired effect is not achieved, you can increase the weight. However, excessively high weights may negatively impact the recognition accuracy of other words.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder weight(Integer weight) {
            this.weight = weight;
            return this;
        }

        public Hotword build() {
            return new Hotword(this);
        } 

    } 

}
