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
 * {@link GetDocumentAnalysisOption} extends {@link TeaModel}
 *
 * <p>GetDocumentAnalysisOption</p>
 */
public class GetDocumentAnalysisOption extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChapterSummary")
    private Boolean chapterSummary;

    @com.aliyun.core.annotation.NameInMap("ChapterSummaryOption")
    private DocumentChapterSummarizeOption chapterSummaryOption;

    @com.aliyun.core.annotation.NameInMap("Images")
    private Boolean images;

    @com.aliyun.core.annotation.NameInMap("Keyword")
    private Boolean keyword;

    @com.aliyun.core.annotation.NameInMap("Layouts")
    private Boolean layouts;

    @com.aliyun.core.annotation.NameInMap("Narrator")
    private Boolean narrator;

    @com.aliyun.core.annotation.NameInMap("Question")
    private Boolean question;

    @com.aliyun.core.annotation.NameInMap("Summary")
    private Boolean summary;

    private GetDocumentAnalysisOption(Builder builder) {
        this.chapterSummary = builder.chapterSummary;
        this.chapterSummaryOption = builder.chapterSummaryOption;
        this.images = builder.images;
        this.keyword = builder.keyword;
        this.layouts = builder.layouts;
        this.narrator = builder.narrator;
        this.question = builder.question;
        this.summary = builder.summary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDocumentAnalysisOption create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chapterSummary
     */
    public Boolean getChapterSummary() {
        return this.chapterSummary;
    }

    /**
     * @return chapterSummaryOption
     */
    public DocumentChapterSummarizeOption getChapterSummaryOption() {
        return this.chapterSummaryOption;
    }

    /**
     * @return images
     */
    public Boolean getImages() {
        return this.images;
    }

    /**
     * @return keyword
     */
    public Boolean getKeyword() {
        return this.keyword;
    }

    /**
     * @return layouts
     */
    public Boolean getLayouts() {
        return this.layouts;
    }

    /**
     * @return narrator
     */
    public Boolean getNarrator() {
        return this.narrator;
    }

    /**
     * @return question
     */
    public Boolean getQuestion() {
        return this.question;
    }

    /**
     * @return summary
     */
    public Boolean getSummary() {
        return this.summary;
    }

    public static final class Builder {
        private Boolean chapterSummary; 
        private DocumentChapterSummarizeOption chapterSummaryOption; 
        private Boolean images; 
        private Boolean keyword; 
        private Boolean layouts; 
        private Boolean narrator; 
        private Boolean question; 
        private Boolean summary; 

        private Builder() {
        } 

        private Builder(GetDocumentAnalysisOption model) {
            this.chapterSummary = model.chapterSummary;
            this.chapterSummaryOption = model.chapterSummaryOption;
            this.images = model.images;
            this.keyword = model.keyword;
            this.layouts = model.layouts;
            this.narrator = model.narrator;
            this.question = model.question;
            this.summary = model.summary;
        } 

        /**
         * ChapterSummary.
         */
        public Builder chapterSummary(Boolean chapterSummary) {
            this.chapterSummary = chapterSummary;
            return this;
        }

        /**
         * ChapterSummaryOption.
         */
        public Builder chapterSummaryOption(DocumentChapterSummarizeOption chapterSummaryOption) {
            this.chapterSummaryOption = chapterSummaryOption;
            return this;
        }

        /**
         * Images.
         */
        public Builder images(Boolean images) {
            this.images = images;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(Boolean keyword) {
            this.keyword = keyword;
            return this;
        }

        /**
         * Layouts.
         */
        public Builder layouts(Boolean layouts) {
            this.layouts = layouts;
            return this;
        }

        /**
         * Narrator.
         */
        public Builder narrator(Boolean narrator) {
            this.narrator = narrator;
            return this;
        }

        /**
         * Question.
         */
        public Builder question(Boolean question) {
            this.question = question;
            return this;
        }

        /**
         * Summary.
         */
        public Builder summary(Boolean summary) {
            this.summary = summary;
            return this;
        }

        public GetDocumentAnalysisOption build() {
            return new GetDocumentAnalysisOption(this);
        } 

    } 

}
