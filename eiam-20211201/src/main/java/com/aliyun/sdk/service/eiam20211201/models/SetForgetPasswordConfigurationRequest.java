// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetForgetPasswordConfigurationRequest} extends {@link RequestModel}
 *
 * <p>SetForgetPasswordConfigurationRequest</p>
 */
public class SetForgetPasswordConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthenticationChannels")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private java.util.List < String > authenticationChannels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForgetPasswordStatus")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 32)
    private String forgetPasswordStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private SetForgetPasswordConfigurationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.authenticationChannels = builder.authenticationChannels;
        this.forgetPasswordStatus = builder.forgetPasswordStatus;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetForgetPasswordConfigurationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return authenticationChannels
     */
    public java.util.List < String > getAuthenticationChannels() {
        return this.authenticationChannels;
    }

    /**
     * @return forgetPasswordStatus
     */
    public String getForgetPasswordStatus() {
        return this.forgetPasswordStatus;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<SetForgetPasswordConfigurationRequest, Builder> {
        private String regionId; 
        private java.util.List < String > authenticationChannels; 
        private String forgetPasswordStatus; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(SetForgetPasswordConfigurationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.authenticationChannels = request.authenticationChannels;
            this.forgetPasswordStatus = request.forgetPasswordStatus;
            this.instanceId = request.instanceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 身份认证渠道。枚举取值:email(邮件)、sms(短信)
         */
        public Builder authenticationChannels(java.util.List < String > authenticationChannels) {
            this.putQueryParameter("AuthenticationChannels", authenticationChannels);
            this.authenticationChannels = authenticationChannels;
            return this;
        }

        /**
         * 忘记密码配置状态。枚举取值:enabled(开启)、disabled(禁用)
         */
        public Builder forgetPasswordStatus(String forgetPasswordStatus) {
            this.putQueryParameter("ForgetPasswordStatus", forgetPasswordStatus);
            this.forgetPasswordStatus = forgetPasswordStatus;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public SetForgetPasswordConfigurationRequest build() {
            return new SetForgetPasswordConfigurationRequest(this);
        } 

    } 

}
