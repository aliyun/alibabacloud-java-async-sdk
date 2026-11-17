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
 * {@link UpdateConsumerRequest} extends {@link RequestModel}
 *
 * <p>UpdateConsumerRequest</p>
 */
public class UpdateConsumerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("consumerId")
    private String consumerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("akSkIdentityConfigs")
    private java.util.List<AkSkIdentityConfig> akSkIdentityConfigs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("apikeyIdentityConfig")
    private ApiKeyIdentityConfig apikeyIdentityConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clearExpireAt")
    private Boolean clearExpireAt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enableAfterRenewal")
    private Boolean enableAfterRenewal;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expireAt")
    private Long expireAt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("jwtIdentityConfig")
    private JwtIdentityConfig jwtIdentityConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("renew")
    private Boolean renew;

    private UpdateConsumerRequest(Builder builder) {
        super(builder);
        this.consumerId = builder.consumerId;
        this.akSkIdentityConfigs = builder.akSkIdentityConfigs;
        this.apikeyIdentityConfig = builder.apikeyIdentityConfig;
        this.clearExpireAt = builder.clearExpireAt;
        this.description = builder.description;
        this.enable = builder.enable;
        this.enableAfterRenewal = builder.enableAfterRenewal;
        this.expireAt = builder.expireAt;
        this.jwtIdentityConfig = builder.jwtIdentityConfig;
        this.renew = builder.renew;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConsumerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumerId
     */
    public String getConsumerId() {
        return this.consumerId;
    }

    /**
     * @return akSkIdentityConfigs
     */
    public java.util.List<AkSkIdentityConfig> getAkSkIdentityConfigs() {
        return this.akSkIdentityConfigs;
    }

    /**
     * @return apikeyIdentityConfig
     */
    public ApiKeyIdentityConfig getApikeyIdentityConfig() {
        return this.apikeyIdentityConfig;
    }

    /**
     * @return clearExpireAt
     */
    public Boolean getClearExpireAt() {
        return this.clearExpireAt;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return enableAfterRenewal
     */
    public Boolean getEnableAfterRenewal() {
        return this.enableAfterRenewal;
    }

    /**
     * @return expireAt
     */
    public Long getExpireAt() {
        return this.expireAt;
    }

    /**
     * @return jwtIdentityConfig
     */
    public JwtIdentityConfig getJwtIdentityConfig() {
        return this.jwtIdentityConfig;
    }

    /**
     * @return renew
     */
    public Boolean getRenew() {
        return this.renew;
    }

    public static final class Builder extends Request.Builder<UpdateConsumerRequest, Builder> {
        private String consumerId; 
        private java.util.List<AkSkIdentityConfig> akSkIdentityConfigs; 
        private ApiKeyIdentityConfig apikeyIdentityConfig; 
        private Boolean clearExpireAt; 
        private String description; 
        private Boolean enable; 
        private Boolean enableAfterRenewal; 
        private Long expireAt; 
        private JwtIdentityConfig jwtIdentityConfig; 
        private Boolean renew; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConsumerRequest request) {
            super(request);
            this.consumerId = request.consumerId;
            this.akSkIdentityConfigs = request.akSkIdentityConfigs;
            this.apikeyIdentityConfig = request.apikeyIdentityConfig;
            this.clearExpireAt = request.clearExpireAt;
            this.description = request.description;
            this.enable = request.enable;
            this.enableAfterRenewal = request.enableAfterRenewal;
            this.expireAt = request.expireAt;
            this.jwtIdentityConfig = request.jwtIdentityConfig;
            this.renew = request.renew;
        } 

        /**
         * <p>The consumer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-cvfmq9um1hkg1teictkg</p>
         */
        public Builder consumerId(String consumerId) {
            this.putPathParameter("consumerId", consumerId);
            this.consumerId = consumerId;
            return this;
        }

        /**
         * <p>The list of AK/SK identity authentication configurations.</p>
         */
        public Builder akSkIdentityConfigs(java.util.List<AkSkIdentityConfig> akSkIdentityConfigs) {
            this.putBodyParameter("akSkIdentityConfigs", akSkIdentityConfigs);
            this.akSkIdentityConfigs = akSkIdentityConfigs;
            return this;
        }

        /**
         * <p>The API key identity authentication configuration.</p>
         */
        public Builder apikeyIdentityConfig(ApiKeyIdentityConfig apikeyIdentityConfig) {
            this.putBodyParameter("apikeyIdentityConfig", apikeyIdentityConfig);
            this.apikeyIdentityConfig = apikeyIdentityConfig;
            return this;
        }

        /**
         * <p>Specifies whether to clear the expiration time and restore permanent validity. If this parameter is set to true, expireAt cannot be specified at the same time. The default value is false, which indicates that the expiration time is not cleared.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder clearExpireAt(Boolean clearExpireAt) {
            this.putBodyParameter("clearExpireAt", clearExpireAt);
            this.clearExpireAt = clearExpireAt;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Test consumer</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to enable the consumer.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enable(Boolean enable) {
            this.putBodyParameter("enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>Specifies whether to enable the consumer after renewal. This parameter can be set to true only when renew=true. The default value is false, which retains the current enabled or disabled state and does not implicitly enable a manually disabled consumer.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableAfterRenewal(Boolean enableAfterRenewal) {
            this.putBodyParameter("enableAfterRenewal", enableAfterRenewal);
            this.enableAfterRenewal = enableAfterRenewal;
            return this;
        }

        /**
         * <p>The expiration time of the consumer, in UTC UNIX seconds. It must be a positive integer and later than the current time. If this parameter is not specified, the original value is retained. This parameter cannot be set at the same time as clearExpireAt=true. If renew=true, the value must be later than the original unexpired expiration time. If the configuration is saved but fails to be delivered, a retry with the original expiration time is allowed, but shortening the expiration time is still prohibited.</p>
         * 
         * <strong>example:</strong>
         * <p>1893456000</p>
         */
        public Builder expireAt(Long expireAt) {
            this.putBodyParameter("expireAt", expireAt);
            this.expireAt = expireAt;
            return this;
        }

        /**
         * <p>The JWT identity authentication configuration.</p>
         */
        public Builder jwtIdentityConfig(JwtIdentityConfig jwtIdentityConfig) {
            this.putBodyParameter("jwtIdentityConfig", jwtIdentityConfig);
            this.jwtIdentityConfig = jwtIdentityConfig;
            return this;
        }

        /**
         * <p>Specifies whether to only renew the consumer. If this parameter is set to true, only the validity period is updated and the consumer is explicitly enabled at the same time. The latest credentials, description, and authorizations on the server are retained. You must set expireAt or clearExpireAt=true, and you cannot specify identity configurations or description. The default value is false, which retains the original consumer update semantics.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder renew(Boolean renew) {
            this.putBodyParameter("renew", renew);
            this.renew = renew;
            return this;
        }

        @Override
        public UpdateConsumerRequest build() {
            return new UpdateConsumerRequest(this);
        } 

    } 

}
