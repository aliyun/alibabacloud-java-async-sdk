// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImageConfig} extends {@link TeaModel}
 *
 * <p>ImageConfig</p>
 */
public class ImageConfig extends TeaModel {
    @NameInMap("Auth")
    private String auth;

    @NameInMap("DockerRegistry")
    private String dockerRegistry;

    @NameInMap("Password")
    private String password;

    @NameInMap("Username")
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
