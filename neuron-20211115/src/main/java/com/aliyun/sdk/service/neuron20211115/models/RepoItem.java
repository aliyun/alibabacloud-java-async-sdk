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
 * {@link RepoItem} extends {@link TeaModel}
 *
 * <p>RepoItem</p>
 */
public class RepoItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("codeLines")
    private Long codeLines;

    @com.aliyun.core.annotation.NameInMap("gitProjectUrl")
    private String gitProjectUrl;

    @com.aliyun.core.annotation.NameInMap("owner")
    private String owner;

    @com.aliyun.core.annotation.NameInMap("repoShortUrl")
    private String repoShortUrl;

    @com.aliyun.core.annotation.NameInMap("repoUrl")
    private String repoUrl;

    @com.aliyun.core.annotation.NameInMap("summary")
    private String summary;

    private RepoItem(Builder builder) {
        this.codeLines = builder.codeLines;
        this.gitProjectUrl = builder.gitProjectUrl;
        this.owner = builder.owner;
        this.repoShortUrl = builder.repoShortUrl;
        this.repoUrl = builder.repoUrl;
        this.summary = builder.summary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RepoItem create() {
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
     * @return gitProjectUrl
     */
    public String getGitProjectUrl() {
        return this.gitProjectUrl;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
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

    /**
     * @return summary
     */
    public String getSummary() {
        return this.summary;
    }

    public static final class Builder {
        private Long codeLines; 
        private String gitProjectUrl; 
        private String owner; 
        private String repoShortUrl; 
        private String repoUrl; 
        private String summary; 

        private Builder() {
        } 

        private Builder(RepoItem model) {
            this.codeLines = model.codeLines;
            this.gitProjectUrl = model.gitProjectUrl;
            this.owner = model.owner;
            this.repoShortUrl = model.repoShortUrl;
            this.repoUrl = model.repoUrl;
            this.summary = model.summary;
        } 

        /**
         * codeLines.
         */
        public Builder codeLines(Long codeLines) {
            this.codeLines = codeLines;
            return this;
        }

        /**
         * gitProjectUrl.
         */
        public Builder gitProjectUrl(String gitProjectUrl) {
            this.gitProjectUrl = gitProjectUrl;
            return this;
        }

        /**
         * owner.
         */
        public Builder owner(String owner) {
            this.owner = owner;
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
         * repoUrl.
         */
        public Builder repoUrl(String repoUrl) {
            this.repoUrl = repoUrl;
            return this;
        }

        /**
         * summary.
         */
        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }

        public RepoItem build() {
            return new RepoItem(this);
        } 

    } 

}
