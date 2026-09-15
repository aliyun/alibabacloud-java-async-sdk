// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link PublicUpdateTemplateRegistryAuthConfig} extends {@link TeaModel}
 *
 * <p>PublicUpdateTemplateRegistryAuthConfig</p>
 */
public class PublicUpdateTemplateRegistryAuthConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("password")
    private String password;

    @com.aliyun.core.annotation.NameInMap("userName")
    private String userName;

    private PublicUpdateTemplateRegistryAuthConfig(Builder builder) {
        this.password = builder.password;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublicUpdateTemplateRegistryAuthConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder {
        private String password; 
        private String userName; 

        private Builder() {
        } 

        private Builder(PublicUpdateTemplateRegistryAuthConfig model) {
            this.password = model.password;
            this.userName = model.userName;
        } 

        /**
         * password.
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * userName.
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public PublicUpdateTemplateRegistryAuthConfig build() {
            return new PublicUpdateTemplateRegistryAuthConfig(this);
        } 

    } 

}
