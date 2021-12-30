// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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

    public static final class Builder extends Request.Builder<Builder> {
        private String dingTalkConfig; 
        private String enableTwoFactor; 
        private String instanceId; 
        private String messageLanguage; 
        private String regionId; 
        private String skipTwoFactorTime; 
        private String twoFactorMethods; 

        /**
         * <p>DingTalkConfig.</p>
         */
        public Builder dingTalkConfig(String dingTalkConfig) {
            this.putQueryParameter("DingTalkConfig", dingTalkConfig);
            this.dingTalkConfig = dingTalkConfig;
            return this;
        }

        /**
         * <p>EnableTwoFactor.</p>
         */
        public Builder enableTwoFactor(String enableTwoFactor) {
            this.putQueryParameter("EnableTwoFactor", enableTwoFactor);
            this.enableTwoFactor = enableTwoFactor;
            return this;
        }

        /**
         * <p>InstanceId.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>MessageLanguage.</p>
         */
        public Builder messageLanguage(String messageLanguage) {
            this.putQueryParameter("MessageLanguage", messageLanguage);
            this.messageLanguage = messageLanguage;
            return this;
        }

        /**
         * <p>RegionId.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>SkipTwoFactorTime.</p>
         */
        public Builder skipTwoFactorTime(String skipTwoFactorTime) {
            this.putQueryParameter("SkipTwoFactorTime", skipTwoFactorTime);
            this.skipTwoFactorTime = skipTwoFactorTime;
            return this;
        }

        /**
         * <p>TwoFactorMethods.</p>
         */
        public Builder twoFactorMethods(String twoFactorMethods) {
            this.putQueryParameter("TwoFactorMethods", twoFactorMethods);
            this.twoFactorMethods = twoFactorMethods;
            return this;
        }

        public ModifyInstanceTwoFactorRequest build() {
            return new ModifyInstanceTwoFactorRequest(this);
        } 

    } 

}
