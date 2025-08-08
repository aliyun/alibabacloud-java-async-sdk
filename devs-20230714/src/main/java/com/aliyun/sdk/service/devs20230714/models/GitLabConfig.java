// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link GitLabConfig} extends {@link TeaModel}
 *
 * <p>GitLabConfig</p>
 */
public class GitLabConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("isFixedIP")
    private Boolean isFixedIP;

    @com.aliyun.core.annotation.NameInMap("token")
    private String token;

    @com.aliyun.core.annotation.NameInMap("uri")
    private String uri;

    private GitLabConfig(Builder builder) {
        this.isFixedIP = builder.isFixedIP;
        this.token = builder.token;
        this.uri = builder.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GitLabConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isFixedIP
     */
    public Boolean getIsFixedIP() {
        return this.isFixedIP;
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
        private Boolean isFixedIP; 
        private String token; 
        private String uri; 

        private Builder() {
        } 

        private Builder(GitLabConfig model) {
            this.isFixedIP = model.isFixedIP;
            this.token = model.token;
            this.uri = model.uri;
        } 

        /**
         * isFixedIP.
         */
        public Builder isFixedIP(Boolean isFixedIP) {
            this.isFixedIP = isFixedIP;
            return this;
        }

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
