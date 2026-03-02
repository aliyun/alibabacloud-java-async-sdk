// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link RepoMetric} extends {@link TeaModel}
 *
 * <p>RepoMetric</p>
 */
public class RepoMetric extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("codeLines")
    private Long codeLines;

    @com.aliyun.core.annotation.NameInMap("commitCnt")
    private Long commitCnt;

    @com.aliyun.core.annotation.NameInMap("developerCnt")
    private Long developerCnt;

    @com.aliyun.core.annotation.NameInMap("refreshDate")
    private String refreshDate;

    @com.aliyun.core.annotation.NameInMap("repoShortUrl")
    private String repoShortUrl;

    @com.aliyun.core.annotation.NameInMap("repoUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String repoUrl;

    private RepoMetric(Builder builder) {
        this.codeLines = builder.codeLines;
        this.commitCnt = builder.commitCnt;
        this.developerCnt = builder.developerCnt;
        this.refreshDate = builder.refreshDate;
        this.repoShortUrl = builder.repoShortUrl;
        this.repoUrl = builder.repoUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RepoMetric create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codeLines
     */
    public Long getCodeLines() {
        return this.codeLines;
    }

    /**
     * @return commitCnt
     */
    public Long getCommitCnt() {
        return this.commitCnt;
    }

    /**
     * @return developerCnt
     */
    public Long getDeveloperCnt() {
        return this.developerCnt;
    }

    /**
     * @return refreshDate
     */
    public String getRefreshDate() {
        return this.refreshDate;
    }

    /**
     * @return repoShortUrl
     */
    public String getRepoShortUrl() {
        return this.repoShortUrl;
    }

    /**
     * @return repoUrl
     */
    public String getRepoUrl() {
        return this.repoUrl;
    }

    public static final class Builder {
        private Long codeLines; 
        private Long commitCnt; 
        private Long developerCnt; 
        private String refreshDate; 
        private String repoShortUrl; 
        private String repoUrl; 

        private Builder() {
        } 

        private Builder(RepoMetric model) {
            this.codeLines = model.codeLines;
            this.commitCnt = model.commitCnt;
            this.developerCnt = model.developerCnt;
            this.refreshDate = model.refreshDate;
            this.repoShortUrl = model.repoShortUrl;
            this.repoUrl = model.repoUrl;
        } 

        /**
         * codeLines.
         */
        public Builder codeLines(Long codeLines) {
            this.codeLines = codeLines;
            return this;
        }

        /**
         * commitCnt.
         */
        public Builder commitCnt(Long commitCnt) {
            this.commitCnt = commitCnt;
            return this;
        }

        /**
         * developerCnt.
         */
        public Builder developerCnt(Long developerCnt) {
            this.developerCnt = developerCnt;
            return this;
        }

        /**
         * refreshDate.
         */
        public Builder refreshDate(String refreshDate) {
            this.refreshDate = refreshDate;
            return this;
        }

        /**
         * repoShortUrl.
         */
        public Builder repoShortUrl(String repoShortUrl) {
            this.repoShortUrl = repoShortUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:git@gitlab.alibaba-inc.com">git@gitlab.alibaba-inc.com</a>:neuron/catalog.git</p>
         */
        public Builder repoUrl(String repoUrl) {
            this.repoUrl = repoUrl;
            return this;
        }

        public RepoMetric build() {
            return new RepoMetric(this);
        } 

    } 

}
