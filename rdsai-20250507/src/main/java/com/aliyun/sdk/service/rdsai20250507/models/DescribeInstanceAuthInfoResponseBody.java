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

    @com.aliyun.core.annotation.NameInMap("BranchName")
    private String branchName;

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
        this.branchName = builder.branchName;
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
     * @return branchName
     */
    public String getBranchName() {
        return this.branchName;
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
        private String branchName; 
        private java.util.List<ConfigList> configList; 
        private String instanceName; 
        private String jwtSecret; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeInstanceAuthInfoResponseBody model) {
            this.apiKeys = model.apiKeys;
            this.branchName = model.branchName;
            this.configList = model.configList;
            this.instanceName = model.instanceName;
            this.jwtSecret = model.jwtSecret;
            this.requestId = model.requestId;
        } 

        /**
         * <p>API Keys。</p>
         */
        public Builder apiKeys(ApiKeys apiKeys) {
            this.apiKeys = apiKeys;
            return this;
        }

        /**
         * BranchName.
         */
        public Builder branchName(String branchName) {
            this.branchName = branchName;
            return this;
        }

        /**
         * <p>The list of authentication configurations.</p>
         */
        public Builder configList(java.util.List<ConfigList> configList) {
            this.configList = configList;
            return this;
        }

        /**
         * <p>The instance ID of the AI application.</p>
         * 
         * <strong>example:</strong>
         * <p>ra-supabase-8moov5lxba****</p>
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The JWT secret.</p>
         * 
         * <strong>example:</strong>
         * <p>g7jgepleljS8nxAwsOd2EDWkBWi7JcU1m2Gj****</p>
         */
        public Builder jwtSecret(String jwtSecret) {
            this.jwtSecret = jwtSecret;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
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

        @com.aliyun.core.annotation.NameInMap("E2bApiKey")
        private String e2bApiKey;

        @com.aliyun.core.annotation.NameInMap("ServiceKey")
        private String serviceKey;

        private ApiKeys(Builder builder) {
            this.anonKey = builder.anonKey;
            this.e2bApiKey = builder.e2bApiKey;
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
         * @return e2bApiKey
         */
        public String getE2bApiKey() {
            return this.e2bApiKey;
        }

        /**
         * @return serviceKey
         */
        public String getServiceKey() {
            return this.serviceKey;
        }

        public static final class Builder {
            private String anonKey; 
            private String e2bApiKey; 
            private String serviceKey; 

            private Builder() {
            } 

            private Builder(ApiKeys model) {
                this.anonKey = model.anonKey;
                this.e2bApiKey = model.e2bApiKey;
                this.serviceKey = model.serviceKey;
            } 

            /**
             * <p>The ANON_KEY of Supabase.</p>
             * 
             * <strong>example:</strong>
             * <p>eyJ0eXAiOiJKV1QiLCJhbGciOiJIUz<strong><strong>J9.eyJpc3MiOiJzdXBhYmFzZSIsInJvbGUiOiJhbm9uIiwiaWF0IjoxNzU1Nzg1ODc1LCJleHAiOjEzMjY2NDI1ODc1fQ.EGNFdeWRZBsdB051EzQsBwvDJveC9IMEXWUCDLX</strong></strong></p>
             */
            public Builder anonKey(String anonKey) {
                this.anonKey = anonKey;
                return this;
            }

            /**
             * E2bApiKey.
             */
            public Builder e2bApiKey(String e2bApiKey) {
                this.e2bApiKey = e2bApiKey;
                return this;
            }

            /**
             * <p>The SERVICE_ROLE_KEY of Supabase.</p>
             * 
             * <strong>example:</strong>
             * <p>eyJ0eXAiOiJKV1QiLCJhbGciOiJIUz<strong><strong>J9.eyJpc3MiOiJzdXBhYmFzZSIsInJvbGUiOiJzZXJ2aWNlX3JvbGUiLCJpYXQiOjE3NTU3ODU4NzUsImV4cCI6MTMyNjY0MjU4NzV9.oJt4UF8cpSDOvjW39IM4fLp2750rEvxFnkNqcVM</strong></strong></p>
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
             * <p>The name of the configuration item. Valid values:</p>
             * <ul>
             * <li><strong>GOTRUE_EXTERNAL_EMAIL_ENABLED</strong>: external email enabled.</li>
             * <li><strong>GOTRUE_SITE_URL</strong>: the website URL displayed when the AI application sends emails.</li>
             * <li><strong>GOTRUE_SMTP_PORT</strong>: the port of the SMTP provider.</li>
             * <li><strong>GOTRUE_SMTP_SENDER_NAME</strong>: the name of the email sender.</li>
             * <li><strong>GOTRUE_SMTP_USER</strong>: the username of the SMTP provider.</li>
             * <li><strong>GOTRUE_SMTP_PASS</strong>: the secret of the SMTP provider.</li>
             * <li><strong>GOTRUE_SMTP_ADMIN_EMAIL</strong>: the email address of the SMTP provider.</li>
             * <li><strong>GOTRUE_SMTP_HOST</strong>: the host address of the SMTP provider.</li>
             * <li><strong>GOTRUE_MAILER_AUTOCONFIRM</strong>: specifies whether to enable autoconfirm.</li>
             * <li><strong>GOTRUE_MAILER_OTP_EXP</strong>: the validity period of the one-time password (OTP). Unit: seconds.</li>
             * <li><strong>GOTRUE_MAILER_OTP_LENGTH</strong>: the length of the one-time password (OTP) verification code. The value must be an integer greater than or equal to 6.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>GOTRUE_SITE_URL</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://8.152">http://8.152</a>. XXX.XXX</p>
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
