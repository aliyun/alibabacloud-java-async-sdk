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
 * {@link GetVideoAnalysisOption} extends {@link TeaModel}
 *
 * <p>GetVideoAnalysisOption</p>
 */
public class GetVideoAnalysisOption extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChapterSummary")
    private Boolean chapterSummary;

    @com.aliyun.core.annotation.NameInMap("Keyword")
    private Boolean keyword;

    @com.aliyun.core.annotation.NameInMap("PPT")
    private Boolean PPT;

    @com.aliyun.core.annotation.NameInMap("Question")
    private Boolean question;

    @com.aliyun.core.annotation.NameInMap("Summary")
    private Boolean summary;

    @com.aliyun.core.annotation.NameInMap("Transcript")
    private Boolean transcript;

    @com.aliyun.core.annotation.NameInMap("TranscriptChapterSummary")
    private Boolean transcriptChapterSummary;

    @com.aliyun.core.annotation.NameInMap("TranscriptSummary")
    private Boolean transcriptSummary;

    private GetVideoAnalysisOption(Builder builder) {
        this.chapterSummary = builder.chapterSummary;
        this.keyword = builder.keyword;
        this.PPT = builder.PPT;
        this.question = builder.question;
        this.summary = builder.summary;
        this.transcript = builder.transcript;
        this.transcriptChapterSummary = builder.transcriptChapterSummary;
        this.transcriptSummary = builder.transcriptSummary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoAnalysisOption create() {
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
     * @return keyword
     */
    public Boolean getKeyword() {
        return this.keyword;
    }

    /**
     * @return PPT
     */
    public Boolean getPPT() {
        return this.PPT;
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

    /**
     * @return transcript
     */
    public Boolean getTranscript() {
        return this.transcript;
    }

    /**
     * @return transcriptChapterSummary
     */
    public Boolean getTranscriptChapterSummary() {
        return this.transcriptChapterSummary;
    }

    /**
     * @return transcriptSummary
     */
    public Boolean getTranscriptSummary() {
        return this.transcriptSummary;
    }

    public static final class Builder {
        private Boolean chapterSummary; 
        private Boolean keyword; 
        private Boolean PPT; 
        private Boolean question; 
        private Boolean summary; 
        private Boolean transcript; 
        private Boolean transcriptChapterSummary; 
        private Boolean transcriptSummary; 

        private Builder() {
        } 

        private Builder(GetVideoAnalysisOption model) {
            this.chapterSummary = model.chapterSummary;
            this.keyword = model.keyword;
            this.PPT = model.PPT;
            this.question = model.question;
            this.summary = model.summary;
            this.transcript = model.transcript;
            this.transcriptChapterSummary = model.transcriptChapterSummary;
            this.transcriptSummary = model.transcriptSummary;
        } 

        /**
         * <p>Specifies whether to retrieve the chapter-based summary of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder chapterSummary(Boolean chapterSummary) {
            this.chapterSummary = chapterSummary;
            return this;
        }

        /**
         * <p>Specifies whether to retrieve keywords.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder keyword(Boolean keyword) {
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>Specifies whether to retrieve the PPT from the video. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder PPT(Boolean PPT) {
            this.PPT = PPT;
            return this;
        }

        /**
         * <p>Specifies whether to retrieve the generated questions and corresponding answers.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder question(Boolean question) {
            this.question = question;
            return this;
        }

        /**
         * <p>Specifies whether to retrieve the full-text summary.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder summary(Boolean summary) {
            this.summary = summary;
            return this;
        }

        /**
         * <p>Specifies whether to retrieve the dialogue in the video. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder transcript(Boolean transcript) {
            this.transcript = transcript;
            return this;
        }

        /**
         * <p>Specifies whether to retrieve the segmented summary generated from the dialogue in the video. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder transcriptChapterSummary(Boolean transcriptChapterSummary) {
            this.transcriptChapterSummary = transcriptChapterSummary;
            return this;
        }

        /**
         * <p>Specifies whether to retrieve the summary generated from the dialogue in the video. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder transcriptSummary(Boolean transcriptSummary) {
            this.transcriptSummary = transcriptSummary;
            return this;
        }

        public GetVideoAnalysisOption build() {
            return new GetVideoAnalysisOption(this);
        } 

    } 

}
