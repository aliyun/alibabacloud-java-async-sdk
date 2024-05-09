// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigAppRequest} extends {@link RequestModel}
 *
 * <p>ConfigAppRequest</p>
 */
public class ConfigAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    private String enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ConfigAppRequest(Builder builder) {
        super(builder);
        this.appIds = builder.appIds;
        this.enable = builder.enable;
        this.regionId = builder.regionId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appIds
     */
    public String getAppIds() {
        return this.appIds;
    }

    /**
     * @return enable
     */
    public String getEnable() {
        return this.enable;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ConfigAppRequest, Builder> {
        private String appIds; 
        private String enable; 
        private String regionId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ConfigAppRequest request) {
            super(request);
            this.appIds = request.appIds;
            this.enable = request.enable;
            this.regionId = request.regionId;
            this.type = request.type;
        } 

        /**
         * The process identifier (PID) of the application. Separate multiple PIDs with commas (,).
         */
        public Builder appIds(String appIds) {
            this.putQueryParameter("AppIds", appIds);
            this.appIds = appIds;
            return this;
        }

        /**
         * Specifies whether to turn on or off the main switch of the ARMS agent. The monitoring stops after the switch is turned off. If you do not specify this parameter, the main switch status of the ARMS agent is queried.
         * <p>
         * 
         * *   `true`: turns on the switch
         * *   `false`: turns off the switch
         */
        public Builder enable(String enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The type of the application. Set the value to **TRACE**.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ConfigAppRequest build() {
            return new ConfigAppRequest(this);
        } 

    } 

}
