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
 * {@link AgentServiceConfig} extends {@link TeaModel}
 *
 * <p>AgentServiceConfig</p>
 */
public class AgentServiceConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("address")
    @com.aliyun.core.annotation.Validation(required = true)
    private String address;

    @com.aliyun.core.annotation.NameInMap("dashScopeConfig")
    private DashScopeConfig dashScopeConfig;

    @com.aliyun.core.annotation.NameInMap("difyConfig")
    private DifyConfig difyConfig;

    @com.aliyun.core.annotation.NameInMap("enableHealthCheck")
    private Boolean enableHealthCheck;

    @com.aliyun.core.annotation.NameInMap("protocols")
    private java.util.List<String> protocols;

    @com.aliyun.core.annotation.NameInMap("provider")
    @com.aliyun.core.annotation.Validation(required = true)
    private String provider;

    private AgentServiceConfig(Builder builder) {
        this.address = builder.address;
        this.dashScopeConfig = builder.dashScopeConfig;
        this.difyConfig = builder.difyConfig;
        this.enableHealthCheck = builder.enableHealthCheck;
        this.protocols = builder.protocols;
        this.provider = builder.provider;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgentServiceConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return dashScopeConfig
     */
    public DashScopeConfig getDashScopeConfig() {
        return this.dashScopeConfig;
    }

    /**
     * @return difyConfig
     */
    public DifyConfig getDifyConfig() {
        return this.difyConfig;
    }

    /**
     * @return enableHealthCheck
     */
    public Boolean getEnableHealthCheck() {
        return this.enableHealthCheck;
    }

    /**
     * @return protocols
     */
    public java.util.List<String> getProtocols() {
        return this.protocols;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    public static final class Builder {
        private String address; 
        private DashScopeConfig dashScopeConfig; 
        private DifyConfig difyConfig; 
        private Boolean enableHealthCheck; 
        private java.util.List<String> protocols; 
        private String provider; 

        private Builder() {
        } 

        private Builder(AgentServiceConfig model) {
            this.address = model.address;
            this.dashScopeConfig = model.dashScopeConfig;
            this.difyConfig = model.difyConfig;
            this.enableHealthCheck = model.enableHealthCheck;
            this.protocols = model.protocols;
            this.provider = model.provider;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dashscope.aliyuncs.com/api/v1">https://dashscope.aliyuncs.com/api/v1</a></p>
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * dashScopeConfig.
         */
        public Builder dashScopeConfig(DashScopeConfig dashScopeConfig) {
            this.dashScopeConfig = dashScopeConfig;
            return this;
        }

        /**
         * difyConfig.
         */
        public Builder difyConfig(DifyConfig difyConfig) {
            this.difyConfig = difyConfig;
            return this;
        }

        /**
         * enableHealthCheck.
         */
        public Builder enableHealthCheck(Boolean enableHealthCheck) {
            this.enableHealthCheck = enableHealthCheck;
            return this;
        }

        /**
         * protocols.
         */
        public Builder protocols(java.util.List<String> protocols) {
            this.protocols = protocols;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        public AgentServiceConfig build() {
            return new AgentServiceConfig(this);
        } 

    } 

    /**
     * 
     * {@link AgentServiceConfig} extends {@link TeaModel}
     *
     * <p>AgentServiceConfig</p>
     */
    public static class AppCredentials extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("appId")
        private String appId;

        private AppCredentials(Builder builder) {
            this.apiKey = builder.apiKey;
            this.appId = builder.appId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppCredentials create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        public static final class Builder {
            private String apiKey; 
            private String appId; 

            private Builder() {
            } 

            private Builder(AppCredentials model) {
                this.apiKey = model.apiKey;
                this.appId = model.appId;
            } 

            /**
             * apiKey.
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * appId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            public AppCredentials build() {
                return new AppCredentials(this);
            } 

        } 

    }
    /**
     * 
     * {@link AgentServiceConfig} extends {@link TeaModel}
     *
     * <p>AgentServiceConfig</p>
     */
    public static class DashScopeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appCredentials")
        private java.util.List<AppCredentials> appCredentials;

        private DashScopeConfig(Builder builder) {
            this.appCredentials = builder.appCredentials;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DashScopeConfig create() {
            return builder().build();
        }

        /**
         * @return appCredentials
         */
        public java.util.List<AppCredentials> getAppCredentials() {
            return this.appCredentials;
        }

        public static final class Builder {
            private java.util.List<AppCredentials> appCredentials; 

            private Builder() {
            } 

            private Builder(DashScopeConfig model) {
                this.appCredentials = model.appCredentials;
            } 

            /**
             * appCredentials.
             */
            public Builder appCredentials(java.util.List<AppCredentials> appCredentials) {
                this.appCredentials = appCredentials;
                return this;
            }

            public DashScopeConfig build() {
                return new DashScopeConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link AgentServiceConfig} extends {@link TeaModel}
     *
     * <p>AgentServiceConfig</p>
     */
    public static class DifyConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("botType")
        private String botType;

        private DifyConfig(Builder builder) {
            this.apiKey = builder.apiKey;
            this.botType = builder.botType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DifyConfig create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return botType
         */
        public String getBotType() {
            return this.botType;
        }

        public static final class Builder {
            private String apiKey; 
            private String botType; 

            private Builder() {
            } 

            private Builder(DifyConfig model) {
                this.apiKey = model.apiKey;
                this.botType = model.botType;
            } 

            /**
             * apiKey.
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * botType.
             */
            public Builder botType(String botType) {
                this.botType = botType;
                return this;
            }

            public DifyConfig build() {
                return new DifyConfig(this);
            } 

        } 

    }
}
