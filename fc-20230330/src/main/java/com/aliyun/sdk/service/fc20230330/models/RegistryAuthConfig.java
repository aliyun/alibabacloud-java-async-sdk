// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link RegistryAuthConfig} extends {@link TeaModel}
 *
 * <p>RegistryAuthConfig</p>
 */
public class RegistryAuthConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("password")
    private String password;

    @com.aliyun.core.annotation.NameInMap("userName")
    private String userName;

    private RegistryAuthConfig(Builder builder) {
        this.password = builder.password;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegistryAuthConfig create() {
        return builder().build();
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

        public RegistryAuthConfig build() {
            return new RegistryAuthConfig(this);
        } 

    } 

}
