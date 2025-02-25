// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConnectionSpec} extends {@link TeaModel}
 *
 * <p>ConnectionSpec</p>
 */
public class ConnectionSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("account")
    private GitAccount account;

    @com.aliyun.core.annotation.NameInMap("gitlabConfig")
    private GitLabConfig gitlabConfig;

    @com.aliyun.core.annotation.NameInMap("platform")
    @com.aliyun.core.annotation.Validation(required = true)
    private String platform;

    private ConnectionSpec(Builder builder) {
        this.account = builder.account;
        this.gitlabConfig = builder.gitlabConfig;
        this.platform = builder.platform;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConnectionSpec create() {
        return builder().build();
    }

    /**
     * @return account
     */
    public GitAccount getAccount() {
        return this.account;
    }

    /**
     * @return gitlabConfig
     */
    public GitLabConfig getGitlabConfig() {
        return this.gitlabConfig;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    public static final class Builder {
        private GitAccount account; 
        private GitLabConfig gitlabConfig; 
        private String platform; 

        /**
         * account.
         */
        public Builder account(GitAccount account) {
            this.account = account;
            return this;
        }

        /**
         * gitlabConfig.
         */
        public Builder gitlabConfig(GitLabConfig gitlabConfig) {
            this.gitlabConfig = gitlabConfig;
            return this;
        }

        /**
         * platform.
         */
        public Builder platform(String platform) {
            this.platform = platform;
            return this;
        }

        public ConnectionSpec build() {
            return new ConnectionSpec(this);
        } 

    } 

}
