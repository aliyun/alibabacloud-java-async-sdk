// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link AiPolicyRedisConfig} extends {@link TeaModel}
 *
 * <p>AiPolicyRedisConfig</p>
 */
public class AiPolicyRedisConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("databaseNumber")
    private Integer databaseNumber;

    @com.aliyun.core.annotation.NameInMap("host")
    private String host;

    @com.aliyun.core.annotation.NameInMap("password")
    private String password;

    @com.aliyun.core.annotation.NameInMap("port")
    private Integer port;

    @com.aliyun.core.annotation.NameInMap("timeout")
    private Integer timeout;

    @com.aliyun.core.annotation.NameInMap("username")
    private String username;

    private AiPolicyRedisConfig(Builder builder) {
        this.databaseNumber = builder.databaseNumber;
        this.host = builder.host;
        this.password = builder.password;
        this.port = builder.port;
        this.timeout = builder.timeout;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiPolicyRedisConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databaseNumber
     */
    public Integer getDatabaseNumber() {
        return this.databaseNumber;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder {
        private Integer databaseNumber; 
        private String host; 
        private String password; 
        private Integer port; 
        private Integer timeout; 
        private String username; 

        private Builder() {
        } 

        private Builder(AiPolicyRedisConfig model) {
            this.databaseNumber = model.databaseNumber;
            this.host = model.host;
            this.password = model.password;
            this.port = model.port;
            this.timeout = model.timeout;
            this.username = model.username;
        } 

        /**
         * databaseNumber.
         */
        public Builder databaseNumber(Integer databaseNumber) {
            this.databaseNumber = databaseNumber;
            return this;
        }

        /**
         * host.
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * password.
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * port.
         */
        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        /**
         * timeout.
         */
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * username.
         */
        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public AiPolicyRedisConfig build() {
            return new AiPolicyRedisConfig(this);
        } 

    } 

}
