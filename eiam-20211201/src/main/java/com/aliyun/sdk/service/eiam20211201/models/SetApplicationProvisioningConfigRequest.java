// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetApplicationProvisioningConfigRequest} extends {@link RequestModel}
 *
 * <p>SetApplicationProvisioningConfigRequest</p>
 */
public class SetApplicationProvisioningConfigRequest extends Request {
    @Query
    @NameInMap("ApplicationId")
    @Validation(required = true, maxLength = 64)
    private String applicationId;

    @Query
    @NameInMap("CallbackProvisioningConfig")
    private CallbackProvisioningConfig callbackProvisioningConfig;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true, maxLength = 64)
    private String instanceId;

    @Query
    @NameInMap("ProvisionPassword")
    private Boolean provisionPassword;

    @Query
    @NameInMap("ProvisionProtocolType")
    @Validation(required = true, maxLength = 64)
    private String provisionProtocolType;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private SetApplicationProvisioningConfigRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.callbackProvisioningConfig = builder.callbackProvisioningConfig;
        this.instanceId = builder.instanceId;
        this.provisionPassword = builder.provisionPassword;
        this.provisionProtocolType = builder.provisionProtocolType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetApplicationProvisioningConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return callbackProvisioningConfig
     */
    public CallbackProvisioningConfig getCallbackProvisioningConfig() {
        return this.callbackProvisioningConfig;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return provisionPassword
     */
    public Boolean getProvisionPassword() {
        return this.provisionPassword;
    }

    /**
     * @return provisionProtocolType
     */
    public String getProvisionProtocolType() {
        return this.provisionProtocolType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SetApplicationProvisioningConfigRequest, Builder> {
        private String applicationId; 
        private CallbackProvisioningConfig callbackProvisioningConfig; 
        private String instanceId; 
        private Boolean provisionPassword; 
        private String provisionProtocolType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SetApplicationProvisioningConfigRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.callbackProvisioningConfig = request.callbackProvisioningConfig;
            this.instanceId = request.instanceId;
            this.provisionPassword = request.provisionPassword;
            this.provisionProtocolType = request.provisionProtocolType;
            this.regionId = request.regionId;
        } 

        /**
         * IDaaS的应用资源ID。
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * IDaaS回调同步配置，当provisionProtocolType为idaas_callback时填写该配置
         */
        public Builder callbackProvisioningConfig(CallbackProvisioningConfig callbackProvisioningConfig) {
            this.putQueryParameter("CallbackProvisioningConfig", callbackProvisioningConfig);
            this.callbackProvisioningConfig = callbackProvisioningConfig;
            return this;
        }

        /**
         * IDaaS EIAM的实例id
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 同步信息是否包含密码
         */
        public Builder provisionPassword(Boolean provisionPassword) {
            this.putQueryParameter("ProvisionPassword", provisionPassword);
            this.provisionPassword = provisionPassword;
            return this;
        }

        /**
         * 同步协议类型
         */
        public Builder provisionProtocolType(String provisionProtocolType) {
            this.putQueryParameter("ProvisionProtocolType", provisionProtocolType);
            this.provisionProtocolType = provisionProtocolType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public SetApplicationProvisioningConfigRequest build() {
            return new SetApplicationProvisioningConfigRequest(this);
        } 

    } 

    public static class CallbackProvisioningConfig extends TeaModel {
        @NameInMap("CallbackUrl")
        private String callbackUrl;

        @NameInMap("EncryptKey")
        private String encryptKey;

        @NameInMap("EncryptRequired")
        private Boolean encryptRequired;

        @NameInMap("ListenEventScopes")
        private java.util.List < String > listenEventScopes;

        private CallbackProvisioningConfig(Builder builder) {
            this.callbackUrl = builder.callbackUrl;
            this.encryptKey = builder.encryptKey;
            this.encryptRequired = builder.encryptRequired;
            this.listenEventScopes = builder.listenEventScopes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallbackProvisioningConfig create() {
            return builder().build();
        }

        /**
         * @return callbackUrl
         */
        public String getCallbackUrl() {
            return this.callbackUrl;
        }

        /**
         * @return encryptKey
         */
        public String getEncryptKey() {
            return this.encryptKey;
        }

        /**
         * @return encryptRequired
         */
        public Boolean getEncryptRequired() {
            return this.encryptRequired;
        }

        /**
         * @return listenEventScopes
         */
        public java.util.List < String > getListenEventScopes() {
            return this.listenEventScopes;
        }

        public static final class Builder {
            private String callbackUrl; 
            private String encryptKey; 
            private Boolean encryptRequired; 
            private java.util.List < String > listenEventScopes; 

            /**
             * IDaaS回调SP地址，当provisionProtocolType为idaas_callback时必填
             */
            public Builder callbackUrl(String callbackUrl) {
                this.callbackUrl = callbackUrl;
                return this;
            }

            /**
             * IDaaS回调对称加密秘钥
             */
            public Builder encryptKey(String encryptKey) {
                this.encryptKey = encryptKey;
                return this;
            }

            /**
             * IDaaS回调是否加密
             */
            public Builder encryptRequired(Boolean encryptRequired) {
                this.encryptRequired = encryptRequired;
                return this;
            }

            /**
             * IDaaS回调事件监听范围
             */
            public Builder listenEventScopes(java.util.List < String > listenEventScopes) {
                this.listenEventScopes = listenEventScopes;
                return this;
            }

            public CallbackProvisioningConfig build() {
                return new CallbackProvisioningConfig(this);
            } 

        } 

    }
}
