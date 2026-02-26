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
 * {@link DocumentParseSummaryOption} extends {@link TeaModel}
 *
 * <p>DocumentParseSummaryOption</p>
 */
public class DocumentParseSummaryOption extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChapterSummarize")
    private Boolean chapterSummarize;

    @com.aliyun.core.annotation.NameInMap("Summarize")
    private Boolean summarize;

    private DocumentParseSummaryOption(Builder builder) {
        this.chapterSummarize = builder.chapterSummarize;
        this.summarize = builder.summarize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DocumentParseSummaryOption create() {
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
     * @return summarize
     */
    public Boolean getSummarize() {
        return this.summarize;
    }

    public static final class Builder {
        private Boolean chapterSummarize; 
        private Boolean summarize; 

        private Builder() {
        } 

        private Builder(DocumentParseSummaryOption model) {
            this.chapterSummarize = model.chapterSummarize;
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
         * Summarize.
         */
        public Builder summarize(Boolean summarize) {
            this.summarize = summarize;
            return this;
        }

        public DocumentParseSummaryOption build() {
            return new DocumentParseSummaryOption(this);
        } 

    } 

}
