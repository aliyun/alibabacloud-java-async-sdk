// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link ContainerConfiguration} extends {@link TeaModel}
 *
 * <p>ContainerConfiguration</p>
 */
public class ContainerConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("acrInstanceId")
    private String acrInstanceId;

    @com.aliyun.core.annotation.NameInMap("image")
    private String image;

    @com.aliyun.core.annotation.NameInMap("registryCredential")
    private RegistryCredential registryCredential;

    private ContainerConfiguration(Builder builder) {
        this.acrInstanceId = builder.acrInstanceId;
        this.image = builder.image;
        this.registryCredential = builder.registryCredential;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContainerConfiguration create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acrInstanceId
     */
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * @return registryCredential
     */
    public RegistryCredential getRegistryCredential() {
        return this.registryCredential;
    }

    public static final class Builder {
        private String acrInstanceId; 
        private String image; 
        private RegistryCredential registryCredential; 

        private Builder() {
        } 

        private Builder(ContainerConfiguration model) {
            this.acrInstanceId = model.acrInstanceId;
            this.image = model.image;
            this.registryCredential = model.registryCredential;
        } 

        /**
         * acrInstanceId.
         */
        public Builder acrInstanceId(String acrInstanceId) {
            this.acrInstanceId = acrInstanceId;
            return this;
        }

        /**
         * image.
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        /**
         * registryCredential.
         */
        public Builder registryCredential(RegistryCredential registryCredential) {
            this.registryCredential = registryCredential;
            return this;
        }

        public ContainerConfiguration build() {
            return new ContainerConfiguration(this);
        } 

    } 

    /**
     * 
     * {@link ContainerConfiguration} extends {@link TeaModel}
     *
     * <p>ContainerConfiguration</p>
     */
    public static class RegistryCredential extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("username")
        private String username;

        private RegistryCredential(Builder builder) {
            this.password = builder.password;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegistryCredential create() {
            return builder().build();
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
            private String password; 
            private String username; 

            private Builder() {
            } 

            private Builder(RegistryCredential model) {
                this.password = model.password;
                this.username = model.username;
            } 

            /**
             * password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public RegistryCredential build() {
                return new RegistryCredential(this);
            } 

        } 

    }
}
