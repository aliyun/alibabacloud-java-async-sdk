// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link DocumentParseOption} extends {@link TeaModel}
 *
 * <p>DocumentParseOption</p>
 */
public class DocumentParseOption extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private DocumentParseKeywordOption keyword;

    @com.aliyun.core.annotation.NameInMap("Narrator")
    private DocumentParseNarratorOption narrator;

    @com.aliyun.core.annotation.NameInMap("Question")
    private DocumentParseQuestionOption question;

    @com.aliyun.core.annotation.NameInMap("Summary")
    private DocumentParseSummaryOption summary;

    private DocumentParseOption(Builder builder) {
        this.keyword = builder.keyword;
        this.narrator = builder.narrator;
        this.question = builder.question;
        this.summary = builder.summary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DocumentParseOption create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyword
     */
    public DocumentParseKeywordOption getKeyword() {
        return this.keyword;
    }

    /**
     * @return narrator
     */
    public DocumentParseNarratorOption getNarrator() {
        return this.narrator;
    }

    /**
     * @return question
     */
    public DocumentParseQuestionOption getQuestion() {
        return this.question;
    }

    /**
     * @return summary
     */
    public DocumentParseSummaryOption getSummary() {
        return this.summary;
    }

    public static final class Builder {
        private DocumentParseKeywordOption keyword; 
        private DocumentParseNarratorOption narrator; 
        private DocumentParseQuestionOption question; 
        private DocumentParseSummaryOption summary; 

        private Builder() {
        } 

        private Builder(DocumentParseOption model) {
            this.keyword = model.keyword;
            this.narrator = model.narrator;
            this.question = model.question;
            this.summary = model.summary;
        } 

        /**
         * Keyword.
         */
        public Builder keyword(DocumentParseKeywordOption keyword) {
            this.keyword = keyword;
            return this;
        }

        /**
         * Narrator.
         */
        public Builder narrator(DocumentParseNarratorOption narrator) {
            this.narrator = narrator;
            return this;
        }

        /**
         * Question.
         */
        public Builder question(DocumentParseQuestionOption question) {
            this.question = question;
            return this;
        }

        /**
         * Summary.
         */
        public Builder summary(DocumentParseSummaryOption summary) {
            this.summary = summary;
            return this;
        }

        public DocumentParseOption build() {
            return new DocumentParseOption(this);
        } 

    } 

}
