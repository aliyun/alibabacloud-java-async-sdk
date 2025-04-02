// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link ImageConfig} extends {@link TeaModel}
 *
 * <p>ImageConfig</p>
 */
public class ImageConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Auth")
    private String auth;

    @com.aliyun.core.annotation.NameInMap("DockerRegistry")
    private String dockerRegistry;

    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    private ImageConfig(Builder builder) {
        this.auth = builder.auth;
        this.dockerRegistry = builder.dockerRegistry;
        this.password = builder.password;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auth
     */
    public String getAuth() {
        return this.auth;
    }

    /**
     * @return dockerRegistry
     */
    public String getDockerRegistry() {
        return this.dockerRegistry;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder {
        private String auth; 
        private String dockerRegistry; 
        private String password; 
        private String username; 

        private Builder() {
        } 

        private Builder(ImageConfig model) {
            this.auth = model.auth;
            this.dockerRegistry = model.dockerRegistry;
            this.password = model.password;
            this.username = model.username;
        } 

        /**
         * Auth.
         */
        public Builder auth(String auth) {
            this.auth = auth;
            return this;
        }

        /**
         * DockerRegistry.
         */
        public Builder dockerRegistry(String dockerRegistry) {
            this.dockerRegistry = dockerRegistry;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public ImageConfig build() {
            return new ImageConfig(this);
        } 

    } 

}
