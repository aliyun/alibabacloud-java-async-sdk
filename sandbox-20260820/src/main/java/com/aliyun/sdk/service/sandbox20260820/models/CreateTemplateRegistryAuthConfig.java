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
 * {@link CreateTemplateRegistryAuthConfig} extends {@link TeaModel}
 *
 * <p>CreateTemplateRegistryAuthConfig</p>
 */
public class CreateTemplateRegistryAuthConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("password")
    private String password;

    @com.aliyun.core.annotation.NameInMap("userName")
    private String userName;

    private CreateTemplateRegistryAuthConfig(Builder builder) {
        this.password = builder.password;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTemplateRegistryAuthConfig create() {
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

        private Builder(CreateTemplateRegistryAuthConfig model) {
            this.password = model.password;
            this.userName = model.userName;
        } 

        /**
         * <p>The logon password or access token for the image repository. The value is encrypted on the server side and is not returned in plaintext when queried.</p>
         * 
         * <strong>example:</strong>
         * <p>Passw0rd****</p>
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * <p>The username for logging on to the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>sandbox-puller</p>
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public CreateTemplateRegistryAuthConfig build() {
            return new CreateTemplateRegistryAuthConfig(this);
        } 

    } 

}
