// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RepoSource} extends {@link TeaModel}
 *
 * <p>RepoSource</p>
 */
public class RepoSource extends TeaModel {
    @NameInMap("owner")
    private String owner;

    @NameInMap("provider")
    private String provider;

    @NameInMap("repo")
    private String repo;

    private RepoSource(Builder builder) {
        this.owner = builder.owner;
        this.provider = builder.provider;
        this.repo = builder.repo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RepoSource create() {
        return builder().build();
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return repo
     */
    public String getRepo() {
        return this.repo;
    }

    public static final class Builder {
        private String owner; 
        private String provider; 
        private String repo; 

        /**
         * 代码源账号
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * 代码源VCS
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        /**
         * 代码库名字
         */
        public Builder repo(String repo) {
            this.repo = repo;
            return this;
        }

        public RepoSource build() {
            return new RepoSource(this);
        } 

    } 

}
