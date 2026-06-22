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
 * {@link DocumentReadOption} extends {@link TeaModel}
 *
 * <p>DocumentReadOption</p>
 */
public class DocumentReadOption extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private DocumentReadKeywordOption keyword;

    @com.aliyun.core.annotation.NameInMap("Narrator")
    private DocumentReadNarratorOption narrator;

    @com.aliyun.core.annotation.NameInMap("Question")
    private DocumentReadQuestionOption question;

    @com.aliyun.core.annotation.NameInMap("Summary")
    private DocumentReadSummaryOption summary;

    private DocumentReadOption(Builder builder) {
        this.keyword = builder.keyword;
        this.narrator = builder.narrator;
        this.question = builder.question;
        this.summary = builder.summary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DocumentReadOption create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyword
     */
    public DocumentReadKeywordOption getKeyword() {
        return this.keyword;
    }

    /**
     * @return narrator
     */
    public DocumentReadNarratorOption getNarrator() {
        return this.narrator;
    }

    /**
     * @return question
     */
    public DocumentReadQuestionOption getQuestion() {
        return this.question;
    }

    /**
     * @return summary
     */
    public DocumentReadSummaryOption getSummary() {
        return this.summary;
    }

    public static final class Builder {
        private DocumentReadKeywordOption keyword; 
        private DocumentReadNarratorOption narrator; 
        private DocumentReadQuestionOption question; 
        private DocumentReadSummaryOption summary; 

        private Builder() {
        } 

        private Builder(DocumentReadOption model) {
            this.keyword = model.keyword;
            this.narrator = model.narrator;
            this.question = model.question;
            this.summary = model.summary;
        } 

        /**
         * Keyword.
         */
        public Builder keyword(DocumentReadKeywordOption keyword) {
            this.keyword = keyword;
            return this;
        }

        /**
         * Narrator.
         */
        public Builder narrator(DocumentReadNarratorOption narrator) {
            this.narrator = narrator;
            return this;
        }

        /**
         * Question.
         */
        public Builder question(DocumentReadQuestionOption question) {
            this.question = question;
            return this;
        }

        /**
         * Summary.
         */
        public Builder summary(DocumentReadSummaryOption summary) {
            this.summary = summary;
            return this;
        }

        public DocumentReadOption build() {
            return new DocumentReadOption(this);
        } 

    } 

}
