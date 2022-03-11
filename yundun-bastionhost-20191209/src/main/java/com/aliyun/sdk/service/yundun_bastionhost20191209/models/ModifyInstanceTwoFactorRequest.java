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
    @NameInMap("DingTalkConfig")
    private String dingTalkConfig;

    @Query
    @NameInMap("EnableTwoFactor")
    private String enableTwoFactor;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("MessageLanguage")
    private String messageLanguage;

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
        this.dingTalkConfig = builder.dingTalkConfig;
        this.enableTwoFactor = builder.enableTwoFactor;
        this.instanceId = builder.instanceId;
        this.messageLanguage = builder.messageLanguage;
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
     * @return dingTalkConfig
     */
    public String getDingTalkConfig() {
        return this.dingTalkConfig;
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
     * @return messageLanguage
     */
    public String getMessageLanguage() {
        return this.messageLanguage;
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
        private String dingTalkConfig; 
        private String enableTwoFactor; 
        private String instanceId; 
        private String messageLanguage; 
        private String regionId; 
        private String skipTwoFactorTime; 
        private String twoFactorMethods; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceTwoFactorRequest request) {
            super(request);
            this.dingTalkConfig = request.dingTalkConfig;
            this.enableTwoFactor = request.enableTwoFactor;
            this.instanceId = request.instanceId;
            this.messageLanguage = request.messageLanguage;
            this.regionId = request.regionId;
            this.skipTwoFactorTime = request.skipTwoFactorTime;
            this.twoFactorMethods = request.twoFactorMethods;
        } 

        /**
         * DingTalkConfig.
         */
        public Builder dingTalkConfig(String dingTalkConfig) {
            this.putQueryParameter("DingTalkConfig", dingTalkConfig);
            this.dingTalkConfig = dingTalkConfig;
            return this;
        }

        /**
         * EnableTwoFactor.
         */
        public Builder enableTwoFactor(String enableTwoFactor) {
            this.putQueryParameter("EnableTwoFactor", enableTwoFactor);
            this.enableTwoFactor = enableTwoFactor;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MessageLanguage.
         */
        public Builder messageLanguage(String messageLanguage) {
            this.putQueryParameter("MessageLanguage", messageLanguage);
            this.messageLanguage = messageLanguage;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SkipTwoFactorTime.
         */
        public Builder skipTwoFactorTime(String skipTwoFactorTime) {
            this.putQueryParameter("SkipTwoFactorTime", skipTwoFactorTime);
            this.skipTwoFactorTime = skipTwoFactorTime;
            return this;
        }

        /**
         * TwoFactorMethods.
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
