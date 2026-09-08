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
         * <p>The Redis database number.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder databaseNumber(Integer databaseNumber) {
            this.databaseNumber = databaseNumber;
            return this;
        }

        /**
         * <p>The Redis host address.</p>
         * 
         * <strong>example:</strong>
         * <p>r-xxx.redis.rds.aliyuncs.com</p>
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * <p>The Redis password.</p>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * <p>The Redis port.</p>
         * 
         * <strong>example:</strong>
         * <p>6379</p>
         */
        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        /**
         * <p>The timeout period, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * <p>The Redis username.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
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
