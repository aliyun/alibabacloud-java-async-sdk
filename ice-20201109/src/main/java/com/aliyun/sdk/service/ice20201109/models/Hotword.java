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
         * Language.
         */
        public Builder language(String language) {
            this.language = language;
            return this;
        }

        /**
         * Text.
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }

        /**
         * TranspositionResultList.
         */
        public Builder transpositionResultList(java.util.List<TranspositionResult> transpositionResultList) {
            this.transpositionResultList = transpositionResultList;
            return this;
        }

        /**
         * Weight.
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
