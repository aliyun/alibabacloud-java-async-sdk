// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link DescribeInstanceAuthInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceAuthInfoResponseBody</p>
 */
public class DescribeInstanceAuthInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiKeys")
    private ApiKeys apiKeys;

    @com.aliyun.core.annotation.NameInMap("ConfigList")
    private java.util.List<ConfigList> configList;

    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("JwtSecret")
    private String jwtSecret;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceAuthInfoResponseBody(Builder builder) {
        this.apiKeys = builder.apiKeys;
        this.configList = builder.configList;
        this.instanceName = builder.instanceName;
        this.jwtSecret = builder.jwtSecret;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceAuthInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKeys
     */
    public ApiKeys getApiKeys() {
        return this.apiKeys;
    }

    /**
     * @return configList
     */
    public java.util.List<ConfigList> getConfigList() {
        return this.configList;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return jwtSecret
     */
    public String getJwtSecret() {
        return this.jwtSecret;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ApiKeys apiKeys; 
        private java.util.List<ConfigList> configList; 
        private String instanceName; 
        private String jwtSecret; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeInstanceAuthInfoResponseBody model) {
            this.apiKeys = model.apiKeys;
            this.configList = model.configList;
            this.instanceName = model.instanceName;
            this.jwtSecret = model.jwtSecret;
            this.requestId = model.requestId;
        } 

        /**
         * <p>API Keys</p>
         */
        public Builder apiKeys(ApiKeys apiKeys) {
            this.apiKeys = apiKeys;
            return this;
        }

        /**
         * ConfigList.
         */
        public Builder configList(java.util.List<ConfigList> configList) {
            this.configList = configList;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * JwtSecret.
         */
        public Builder jwtSecret(String jwtSecret) {
            this.jwtSecret = jwtSecret;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceAuthInfoResponseBody build() {
            return new DescribeInstanceAuthInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceAuthInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceAuthInfoResponseBody</p>
     */
    public static class ApiKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnonKey")
        private String anonKey;

        @com.aliyun.core.annotation.NameInMap("ServiceKey")
        private String serviceKey;

        private ApiKeys(Builder builder) {
            this.anonKey = builder.anonKey;
            this.serviceKey = builder.serviceKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiKeys create() {
            return builder().build();
        }

        /**
         * @return anonKey
         */
        public String getAnonKey() {
            return this.anonKey;
        }

        /**
         * @return serviceKey
         */
        public String getServiceKey() {
            return this.serviceKey;
        }

        public static final class Builder {
            private String anonKey; 
            private String serviceKey; 

            private Builder() {
            } 

            private Builder(ApiKeys model) {
                this.anonKey = model.anonKey;
                this.serviceKey = model.serviceKey;
            } 

            /**
             * <p>Supabase ANON_KEY</p>
             * 
             * <strong>example:</strong>
             * <p>eyxxxJ9.ey****</p>
             */
            public Builder anonKey(String anonKey) {
                this.anonKey = anonKey;
                return this;
            }

            /**
             * <p>Supabase SERVICE_ROLE_KEY</p>
             * 
             * <strong>example:</strong>
             * <p>eyxxxJ9.ey****KfQ.DaYxxxt4Q</p>
             */
            public Builder serviceKey(String serviceKey) {
                this.serviceKey = serviceKey;
                return this;
            }

            public ApiKeys build() {
                return new ApiKeys(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceAuthInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceAuthInfoResponseBody</p>
     */
    public static class ConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ConfigList(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(ConfigList model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ConfigList build() {
                return new ConfigList(this);
            } 

        } 

    }
}
