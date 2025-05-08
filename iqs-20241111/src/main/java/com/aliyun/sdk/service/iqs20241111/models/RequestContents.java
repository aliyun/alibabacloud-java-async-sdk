// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link RequestContents} extends {@link TeaModel}
 *
 * <p>RequestContents</p>
 */
public class RequestContents extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("mainText")
    private Boolean mainText;

    @com.aliyun.core.annotation.NameInMap("markdownText")
    private Boolean markdownText;

    @com.aliyun.core.annotation.NameInMap("rerankScore")
    private Boolean rerankScore;

    @com.aliyun.core.annotation.NameInMap("summary")
    private Boolean summary;

    private RequestContents(Builder builder) {
        this.mainText = builder.mainText;
        this.markdownText = builder.markdownText;
        this.rerankScore = builder.rerankScore;
        this.summary = builder.summary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RequestContents create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mainText
     */
    public Boolean getMainText() {
        return this.mainText;
    }

    /**
     * @return markdownText
     */
    public Boolean getMarkdownText() {
        return this.markdownText;
    }

    /**
     * @return rerankScore
     */
    public Boolean getRerankScore() {
        return this.rerankScore;
    }

    /**
     * @return summary
     */
    public Boolean getSummary() {
        return this.summary;
    }

    public static final class Builder {
        private Boolean mainText; 
        private Boolean markdownText; 
        private Boolean rerankScore; 
        private Boolean summary; 

        private Builder() {
        } 

        private Builder(RequestContents model) {
            this.mainText = model.mainText;
            this.markdownText = model.markdownText;
            this.rerankScore = model.rerankScore;
            this.summary = model.summary;
        } 

        /**
         * mainText.
         */
        public Builder mainText(Boolean mainText) {
            this.mainText = mainText;
            return this;
        }

        /**
         * markdownText.
         */
        public Builder markdownText(Boolean markdownText) {
            this.markdownText = markdownText;
            return this;
        }

        /**
         * rerankScore.
         */
        public Builder rerankScore(Boolean rerankScore) {
            this.rerankScore = rerankScore;
            return this;
        }

        /**
         * summary.
         */
        public Builder summary(Boolean summary) {
            this.summary = summary;
            return this;
        }

        public RequestContents build() {
            return new RequestContents(this);
        } 

    } 

}
