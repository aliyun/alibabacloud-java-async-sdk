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
 * {@link VideoReadOption} extends {@link TeaModel}
 *
 * <p>VideoReadOption</p>
 */
public class VideoReadOption extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private VideoReadKeywordOption keyword;

    @com.aliyun.core.annotation.NameInMap("PPT")
    private VideoReadPPTOption PPT;

    @com.aliyun.core.annotation.NameInMap("Question")
    private VideoReadQuestionOption question;

    @com.aliyun.core.annotation.NameInMap("Summary")
    private VideoReadSummaryOption summary;

    private VideoReadOption(Builder builder) {
        this.keyword = builder.keyword;
        this.PPT = builder.PPT;
        this.question = builder.question;
        this.summary = builder.summary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VideoReadOption create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyword
     */
    public VideoReadKeywordOption getKeyword() {
        return this.keyword;
    }

    /**
     * @return PPT
     */
    public VideoReadPPTOption getPPT() {
        return this.PPT;
    }

    /**
     * @return question
     */
    public VideoReadQuestionOption getQuestion() {
        return this.question;
    }

    /**
     * @return summary
     */
    public VideoReadSummaryOption getSummary() {
        return this.summary;
    }

    public static final class Builder {
        private VideoReadKeywordOption keyword; 
        private VideoReadPPTOption PPT; 
        private VideoReadQuestionOption question; 
        private VideoReadSummaryOption summary; 

        private Builder() {
        } 

        private Builder(VideoReadOption model) {
            this.keyword = model.keyword;
            this.PPT = model.PPT;
            this.question = model.question;
            this.summary = model.summary;
        } 

        /**
         * Keyword.
         */
        public Builder keyword(VideoReadKeywordOption keyword) {
            this.keyword = keyword;
            return this;
        }

        /**
         * PPT.
         */
        public Builder PPT(VideoReadPPTOption PPT) {
            this.PPT = PPT;
            return this;
        }

        /**
         * Question.
         */
        public Builder question(VideoReadQuestionOption question) {
            this.question = question;
            return this;
        }

        /**
         * Summary.
         */
        public Builder summary(VideoReadSummaryOption summary) {
            this.summary = summary;
            return this;
        }

        public VideoReadOption build() {
            return new VideoReadOption(this);
        } 

    } 

}
