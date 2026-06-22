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
 * {@link DocumentReadSummaryOption} extends {@link TeaModel}
 *
 * <p>DocumentReadSummaryOption</p>
 */
public class DocumentReadSummaryOption extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChapterSummarize")
    private Boolean chapterSummarize;

    @com.aliyun.core.annotation.NameInMap("ChapterSummarizeOption")
    private DocumentChapterSummarizeOption chapterSummarizeOption;

    @com.aliyun.core.annotation.NameInMap("Summarize")
    private Boolean summarize;

    private DocumentReadSummaryOption(Builder builder) {
        this.chapterSummarize = builder.chapterSummarize;
        this.chapterSummarizeOption = builder.chapterSummarizeOption;
        this.summarize = builder.summarize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DocumentReadSummaryOption create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chapterSummarize
     */
    public Boolean getChapterSummarize() {
        return this.chapterSummarize;
    }

    /**
     * @return chapterSummarizeOption
     */
    public DocumentChapterSummarizeOption getChapterSummarizeOption() {
        return this.chapterSummarizeOption;
    }

    /**
     * @return summarize
     */
    public Boolean getSummarize() {
        return this.summarize;
    }

    public static final class Builder {
        private Boolean chapterSummarize; 
        private DocumentChapterSummarizeOption chapterSummarizeOption; 
        private Boolean summarize; 

        private Builder() {
        } 

        private Builder(DocumentReadSummaryOption model) {
            this.chapterSummarize = model.chapterSummarize;
            this.chapterSummarizeOption = model.chapterSummarizeOption;
            this.summarize = model.summarize;
        } 

        /**
         * ChapterSummarize.
         */
        public Builder chapterSummarize(Boolean chapterSummarize) {
            this.chapterSummarize = chapterSummarize;
            return this;
        }

        /**
         * ChapterSummarizeOption.
         */
        public Builder chapterSummarizeOption(DocumentChapterSummarizeOption chapterSummarizeOption) {
            this.chapterSummarizeOption = chapterSummarizeOption;
            return this;
        }

        /**
         * Summarize.
         */
        public Builder summarize(Boolean summarize) {
            this.summarize = summarize;
            return this;
        }

        public DocumentReadSummaryOption build() {
            return new DocumentReadSummaryOption(this);
        } 

    } 

}
