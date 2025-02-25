// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GitLabConfig} extends {@link TeaModel}
 *
 * <p>GitLabConfig</p>
 */
public class GitLabConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("token")
    private String token;

    @com.aliyun.core.annotation.NameInMap("uri")
    private String uri;

    private GitLabConfig(Builder builder) {
        this.token = builder.token;
        this.uri = builder.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GitLabConfig create() {
        return builder().build();
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    public static final class Builder {
        private String token; 
        private String uri; 

        /**
         * token.
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * uri.
         */
        public Builder uri(String uri) {
            this.uri = uri;
            return this;
        }

        public GitLabConfig build() {
            return new GitLabConfig(this);
        } 

    } 

}
