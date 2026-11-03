// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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

    @com.aliyun.core.annotation.NameInMap("role")
    private String role;

    @com.aliyun.core.annotation.NameInMap("userName")
    private String userName;

    private RegistryAuthConfig(Builder builder) {
        this.password = builder.password;
        this.role = builder.role;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegistryAuthConfig create() {
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
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder {
        private String password; 
        private String role; 
        private String userName; 

        private Builder() {
        } 

        private Builder(RegistryAuthConfig model) {
            this.password = model.password;
            this.role = model.role;
            this.userName = model.userName;
        } 

        /**
         * <p>password</p>
         * 
         * <strong>example:</strong>
         * <p>abc***</p>
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * <p>role to get c</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::142xxxx:role/xxxxxx</p>
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * <p>userName</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
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
