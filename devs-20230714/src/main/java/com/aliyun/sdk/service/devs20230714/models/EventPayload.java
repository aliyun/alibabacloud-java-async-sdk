// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EventPayload} extends {@link TeaModel}
 *
 * <p>EventPayload</p>
 */
public class EventPayload extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("codeup")
    private CodeupEventPayload codeup;

    @com.aliyun.core.annotation.NameInMap("gitee")
    private GiteeEventPayload gitee;

    @com.aliyun.core.annotation.NameInMap("github")
    private GithubEventPayload github;

    @com.aliyun.core.annotation.NameInMap("gitlab")
    private GitlabEventPayload gitlab;

    @com.aliyun.core.annotation.NameInMap("manual")
    private ManualEventPayload manual;

    private EventPayload(Builder builder) {
        this.codeup = builder.codeup;
        this.gitee = builder.gitee;
        this.github = builder.github;
        this.gitlab = builder.gitlab;
        this.manual = builder.manual;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EventPayload create() {
        return builder().build();
    }

    /**
     * @return codeup
     */
    public CodeupEventPayload getCodeup() {
        return this.codeup;
    }

    /**
     * @return gitee
     */
    public GiteeEventPayload getGitee() {
        return this.gitee;
    }

    /**
     * @return github
     */
    public GithubEventPayload getGithub() {
        return this.github;
    }

    /**
     * @return gitlab
     */
    public GitlabEventPayload getGitlab() {
        return this.gitlab;
    }

    /**
     * @return manual
     */
    public ManualEventPayload getManual() {
        return this.manual;
    }

    public static final class Builder {
        private CodeupEventPayload codeup; 
        private GiteeEventPayload gitee; 
        private GithubEventPayload github; 
        private GitlabEventPayload gitlab; 
        private ManualEventPayload manual; 

        /**
         * codeup.
         */
        public Builder codeup(CodeupEventPayload codeup) {
            this.codeup = codeup;
            return this;
        }

        /**
         * gitee.
         */
        public Builder gitee(GiteeEventPayload gitee) {
            this.gitee = gitee;
            return this;
        }

        /**
         * github.
         */
        public Builder github(GithubEventPayload github) {
            this.github = github;
            return this;
        }

        /**
         * gitlab.
         */
        public Builder gitlab(GitlabEventPayload gitlab) {
            this.gitlab = gitlab;
            return this;
        }

        /**
         * manual.
         */
        public Builder manual(ManualEventPayload manual) {
            this.manual = manual;
            return this;
        }

        public EventPayload build() {
            return new EventPayload(this);
        } 

    } 

}
