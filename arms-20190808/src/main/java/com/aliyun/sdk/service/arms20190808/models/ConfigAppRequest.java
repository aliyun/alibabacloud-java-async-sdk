// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigAppRequest} extends {@link RequestModel}
 *
 * <p>ConfigAppRequest</p>
 */
public class ConfigAppRequest extends Request {
    @Query
    @NameInMap("AppIds")
    @Validation(required = true)
    private String appIds;

    @Query
    @NameInMap("Enable")
    private String enable;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ConfigAppRequest(Builder builder) {
        super(builder);
        this.appIds = builder.appIds;
        this.enable = builder.enable;
        this.regionId = builder.regionId;
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

    public static final class Builder extends Request.Builder<ConfigAppRequest, Builder> {
        private String appIds; 
        private String enable; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ConfigAppRequest response) {
            super(response);
            this.appIds = response.appIds;
            this.enable = response.enable;
            this.regionId = response.regionId;
        } 

        /**
         * AppIds.
         */
        public Builder appIds(String appIds) {
            this.putQueryParameter("AppIds", appIds);
            this.appIds = appIds;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(String enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
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

        @Override
        public ConfigAppRequest build() {
            return new ConfigAppRequest(this);
        } 

    } 

}
