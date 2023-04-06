// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetPasswordInitializationConfigurationRequest} extends {@link RequestModel}
 *
 * <p>SetPasswordInitializationConfigurationRequest</p>
 */
public class SetPasswordInitializationConfigurationRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true, maxLength = 64)
    private String instanceId;

    @Query
    @NameInMap("PasswordForcedUpdateStatus")
    @Validation(maxLength = 32)
    private String passwordForcedUpdateStatus;

    @Query
    @NameInMap("PasswordInitializationNotificationChannels")
    @Validation(maxLength = 32)
    private java.util.List < String > passwordInitializationNotificationChannels;

    @Query
    @NameInMap("PasswordInitializationStatus")
    @Validation(required = true, maxLength = 32)
    private String passwordInitializationStatus;

    @Query
    @NameInMap("PasswordInitializationType")
    @Validation(maxLength = 32)
    private String passwordInitializationType;

    private SetPasswordInitializationConfigurationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.passwordForcedUpdateStatus = builder.passwordForcedUpdateStatus;
        this.passwordInitializationNotificationChannels = builder.passwordInitializationNotificationChannels;
        this.passwordInitializationStatus = builder.passwordInitializationStatus;
        this.passwordInitializationType = builder.passwordInitializationType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetPasswordInitializationConfigurationRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return passwordForcedUpdateStatus
     */
    public String getPasswordForcedUpdateStatus() {
        return this.passwordForcedUpdateStatus;
    }

    /**
     * @return passwordInitializationNotificationChannels
     */
    public java.util.List < String > getPasswordInitializationNotificationChannels() {
        return this.passwordInitializationNotificationChannels;
    }

    /**
     * @return passwordInitializationStatus
     */
    public String getPasswordInitializationStatus() {
        return this.passwordInitializationStatus;
    }

    /**
     * @return passwordInitializationType
     */
    public String getPasswordInitializationType() {
        return this.passwordInitializationType;
    }

    public static final class Builder extends Request.Builder<SetPasswordInitializationConfigurationRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String passwordForcedUpdateStatus; 
        private java.util.List < String > passwordInitializationNotificationChannels; 
        private String passwordInitializationStatus; 
        private String passwordInitializationType; 

        private Builder() {
            super();
        } 

        private Builder(SetPasswordInitializationConfigurationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.passwordForcedUpdateStatus = request.passwordForcedUpdateStatus;
            this.passwordInitializationNotificationChannels = request.passwordInitializationNotificationChannels;
            this.passwordInitializationStatus = request.passwordInitializationStatus;
            this.passwordInitializationType = request.passwordInitializationType;
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
         * IDaaS EIAM实例的ID。
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 密码强制更新状态。枚举取值:enabled(开启)、disabled(禁用)
         */
        public Builder passwordForcedUpdateStatus(String passwordForcedUpdateStatus) {
            this.putQueryParameter("PasswordForcedUpdateStatus", passwordForcedUpdateStatus);
            this.passwordForcedUpdateStatus = passwordForcedUpdateStatus;
            return this;
        }

        /**
         * 密码初始化通知渠道。枚举取值:email(邮件)、sms(短信)
         */
        public Builder passwordInitializationNotificationChannels(java.util.List < String > passwordInitializationNotificationChannels) {
            this.putQueryParameter("PasswordInitializationNotificationChannels", passwordInitializationNotificationChannels);
            this.passwordInitializationNotificationChannels = passwordInitializationNotificationChannels;
            return this;
        }

        /**
         * 密码初始化配置状态。枚举取值:enabled(开启)、disabled(禁用)
         */
        public Builder passwordInitializationStatus(String passwordInitializationStatus) {
            this.putQueryParameter("PasswordInitializationStatus", passwordInitializationStatus);
            this.passwordInitializationStatus = passwordInitializationStatus;
            return this;
        }

        /**
         * 密码初始化方式。当passwordInitializationStatus取值为enabled时必传。枚举取值:random(随机)
         */
        public Builder passwordInitializationType(String passwordInitializationType) {
            this.putQueryParameter("PasswordInitializationType", passwordInitializationType);
            this.passwordInitializationType = passwordInitializationType;
            return this;
        }

        @Override
        public SetPasswordInitializationConfigurationRequest build() {
            return new SetPasswordInitializationConfigurationRequest(this);
        } 

    } 

}
