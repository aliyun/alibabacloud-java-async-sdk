// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link ServiceConfig} extends {@link TeaModel}
 *
 * <p>ServiceConfig</p>
 */
public class ServiceConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CodeServerAuth")
    private String codeServerAuth;

    @com.aliyun.core.annotation.NameInMap("CodeServerPassword")
    private String codeServerPassword;

    @com.aliyun.core.annotation.NameInMap("JupyterServerAuth")
    private String jupyterServerAuth;

    @com.aliyun.core.annotation.NameInMap("JupyterServerPassword")
    private String jupyterServerPassword;

    private ServiceConfig(Builder builder) {
        this.codeServerAuth = builder.codeServerAuth;
        this.codeServerPassword = builder.codeServerPassword;
        this.jupyterServerAuth = builder.jupyterServerAuth;
        this.jupyterServerPassword = builder.jupyterServerPassword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ServiceConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codeServerAuth
     */
    public String getCodeServerAuth() {
        return this.codeServerAuth;
    }

    /**
     * @return codeServerPassword
     */
    public String getCodeServerPassword() {
        return this.codeServerPassword;
    }

    /**
     * @return jupyterServerAuth
     */
    public String getJupyterServerAuth() {
        return this.jupyterServerAuth;
    }

    /**
     * @return jupyterServerPassword
     */
    public String getJupyterServerPassword() {
        return this.jupyterServerPassword;
    }

    public static final class Builder {
        private String codeServerAuth; 
        private String codeServerPassword; 
        private String jupyterServerAuth; 
        private String jupyterServerPassword; 

        private Builder() {
        } 

        private Builder(ServiceConfig model) {
            this.codeServerAuth = model.codeServerAuth;
            this.codeServerPassword = model.codeServerPassword;
            this.jupyterServerAuth = model.jupyterServerAuth;
            this.jupyterServerPassword = model.jupyterServerPassword;
        } 

        /**
         * CodeServerAuth.
         */
        public Builder codeServerAuth(String codeServerAuth) {
            this.codeServerAuth = codeServerAuth;
            return this;
        }

        /**
         * CodeServerPassword.
         */
        public Builder codeServerPassword(String codeServerPassword) {
            this.codeServerPassword = codeServerPassword;
            return this;
        }

        /**
         * JupyterServerAuth.
         */
        public Builder jupyterServerAuth(String jupyterServerAuth) {
            this.jupyterServerAuth = jupyterServerAuth;
            return this;
        }

        /**
         * JupyterServerPassword.
         */
        public Builder jupyterServerPassword(String jupyterServerPassword) {
            this.jupyterServerPassword = jupyterServerPassword;
            return this;
        }

        public ServiceConfig build() {
            return new ServiceConfig(this);
        } 

    } 

}
