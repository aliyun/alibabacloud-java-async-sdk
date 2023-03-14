// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceTwoFactorRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceTwoFactorRequest</p>
 */
public class ModifyInstanceTwoFactorRequest extends Request {
    @Query
    @NameInMap("EnableTwoFactor")
    private String enableTwoFactor;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SkipTwoFactorTime")
    private String skipTwoFactorTime;

    @Query
    @NameInMap("TwoFactorMethods")
    private String twoFactorMethods;

    private ModifyInstanceTwoFactorRequest(Builder builder) {
        super(builder);
        this.enableTwoFactor = builder.enableTwoFactor;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.skipTwoFactorTime = builder.skipTwoFactorTime;
        this.twoFactorMethods = builder.twoFactorMethods;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceTwoFactorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableTwoFactor
     */
    public String getEnableTwoFactor() {
        return this.enableTwoFactor;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return skipTwoFactorTime
     */
    public String getSkipTwoFactorTime() {
        return this.skipTwoFactorTime;
    }

    /**
     * @return twoFactorMethods
     */
    public String getTwoFactorMethods() {
        return this.twoFactorMethods;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceTwoFactorRequest, Builder> {
        private String enableTwoFactor; 
        private String instanceId; 
        private String regionId; 
        private String skipTwoFactorTime; 
        private String twoFactorMethods; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceTwoFactorRequest request) {
            super(request);
            this.enableTwoFactor = request.enableTwoFactor;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.skipTwoFactorTime = request.skipTwoFactorTime;
            this.twoFactorMethods = request.twoFactorMethods;
        } 

        /**
         * Specifies whether to enable two-factor authentication. Valid values:
         * <p>
         * 
         * *   **true**: enables two-factor authentication.
         * *   **false**: disables two-factor authentication.
         */
        public Builder enableTwoFactor(String enableTwoFactor) {
            this.putQueryParameter("EnableTwoFactor", enableTwoFactor);
            this.enableTwoFactor = enableTwoFactor;
            return this;
        }

        /**
         * The ID of the bastion host.
         * <p>
         * 
         * >  You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The region ID of the bastion host.
         * <p>
         * 
         * >  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The duration within which two-factor authentication is not required after a local user passes two-factor authentication. Valid values: 0 to 168. Unit: hours. If you set this parameter to 0, the local user must pass two-factor authentication every time the local user logs on to the bastion host.
         */
        public Builder skipTwoFactorTime(String skipTwoFactorTime) {
            this.putQueryParameter("SkipTwoFactorTime", skipTwoFactorTime);
            this.skipTwoFactorTime = skipTwoFactorTime;
            return this;
        }

        /**
         * One or more methods that are used to send a verification code if two-factor authentication is enabled. If you set the EnableTwoFactor parameter to true, you must specify at least one method. Valid values:
         * <p>
         * 
         * *   **sms**: text message
         * *   **email**: email
         * *   **dingtalk**: Notice in DingTalk
         */
        public Builder twoFactorMethods(String twoFactorMethods) {
            this.putQueryParameter("TwoFactorMethods", twoFactorMethods);
            this.twoFactorMethods = twoFactorMethods;
            return this;
        }

        @Override
        public ModifyInstanceTwoFactorRequest build() {
            return new ModifyInstanceTwoFactorRequest(this);
        } 

    } 

}
