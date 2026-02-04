// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GetIdentityProviderAdvancedConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetIdentityProviderAdvancedConfigurationResponseBody</p>
 */
public class GetIdentityProviderAdvancedConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdvancedConfiguration")
    private AdvancedConfiguration advancedConfiguration;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetIdentityProviderAdvancedConfigurationResponseBody(Builder builder) {
        this.advancedConfiguration = builder.advancedConfiguration;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIdentityProviderAdvancedConfigurationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return advancedConfiguration
     */
    public AdvancedConfiguration getAdvancedConfiguration() {
        return this.advancedConfiguration;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AdvancedConfiguration advancedConfiguration; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetIdentityProviderAdvancedConfigurationResponseBody model) {
            this.advancedConfiguration = model.advancedConfiguration;
            this.requestId = model.requestId;
        } 

        /**
         * AdvancedConfiguration.
         */
        public Builder advancedConfiguration(AdvancedConfiguration advancedConfiguration) {
            this.advancedConfiguration = advancedConfiguration;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetIdentityProviderAdvancedConfigurationResponseBody build() {
            return new GetIdentityProviderAdvancedConfigurationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetIdentityProviderAdvancedConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderAdvancedConfigurationResponseBody</p>
     */
    public static class DingtalkAdvancedConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppKey")
        private String appKey;

        @com.aliyun.core.annotation.NameInMap("AppSecret")
        private String appSecret;

        private DingtalkAdvancedConfig(Builder builder) {
            this.appKey = builder.appKey;
            this.appSecret = builder.appSecret;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DingtalkAdvancedConfig create() {
            return builder().build();
        }

        /**
         * @return appKey
         */
        public String getAppKey() {
            return this.appKey;
        }

        /**
         * @return appSecret
         */
        public String getAppSecret() {
            return this.appSecret;
        }

        public static final class Builder {
            private String appKey; 
            private String appSecret; 

            private Builder() {
            } 

            private Builder(DingtalkAdvancedConfig model) {
                this.appKey = model.appKey;
                this.appSecret = model.appSecret;
            } 

            /**
             * <p>IDaaS EIAM 钉钉一方应用的AppKey</p>
             * 
             * <strong>example:</strong>
             * <p>ding5xo9rg0csw3f6xxx</p>
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * <p>IDaaS EIAM 钉钉一方应用的AppSecret</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder appSecret(String appSecret) {
                this.appSecret = appSecret;
                return this;
            }

            public DingtalkAdvancedConfig build() {
                return new DingtalkAdvancedConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIdentityProviderAdvancedConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderAdvancedConfigurationResponseBody</p>
     */
    public static class AdvancedConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DingtalkAdvancedConfig")
        private DingtalkAdvancedConfig dingtalkAdvancedConfig;

        @com.aliyun.core.annotation.NameInMap("IdentityProviderId")
        private String identityProviderId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private AdvancedConfiguration(Builder builder) {
            this.dingtalkAdvancedConfig = builder.dingtalkAdvancedConfig;
            this.identityProviderId = builder.identityProviderId;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvancedConfiguration create() {
            return builder().build();
        }

        /**
         * @return dingtalkAdvancedConfig
         */
        public DingtalkAdvancedConfig getDingtalkAdvancedConfig() {
            return this.dingtalkAdvancedConfig;
        }

        /**
         * @return identityProviderId
         */
        public String getIdentityProviderId() {
            return this.identityProviderId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private DingtalkAdvancedConfig dingtalkAdvancedConfig; 
            private String identityProviderId; 
            private String instanceId; 

            private Builder() {
            } 

            private Builder(AdvancedConfiguration model) {
                this.dingtalkAdvancedConfig = model.dingtalkAdvancedConfig;
                this.identityProviderId = model.identityProviderId;
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>钉钉高阶配置</p>
             */
            public Builder dingtalkAdvancedConfig(DingtalkAdvancedConfig dingtalkAdvancedConfig) {
                this.dingtalkAdvancedConfig = dingtalkAdvancedConfig;
                return this;
            }

            /**
             * <p>IDaaS EIAM 身份提供方ID</p>
             * 
             * <strong>example:</strong>
             * <p>idp_na2rzpyc67zr7ixdfy35zgrxxx</p>
             */
            public Builder identityProviderId(String identityProviderId) {
                this.identityProviderId = identityProviderId;
                return this;
            }

            /**
             * <p>IDaaS EIAM 实例Id</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_kpvmhktvun6u66dgpjh3l4wxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public AdvancedConfiguration build() {
                return new AdvancedConfiguration(this);
            } 

        } 

    }
}
