// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link UninstallAppPluginRequest} extends {@link RequestModel}
 *
 * <p>UninstallAppPluginRequest</p>
 */
public class UninstallAppPluginRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginId")
    private String pluginId;

    private UninstallAppPluginRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.pluginId = builder.pluginId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UninstallAppPluginRequest create() {
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
     * @return pluginId
     */
    public String getPluginId() {
        return this.pluginId;
    }

    public static final class Builder extends Request.Builder<UninstallAppPluginRequest, Builder> {
        private String regionId; 
        private String pluginId; 

        private Builder() {
            super();
        } 

        private Builder(UninstallAppPluginRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.pluginId = request.pluginId;
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
         * PluginId.
         */
        public Builder pluginId(String pluginId) {
            this.putQueryParameter("PluginId", pluginId);
            this.pluginId = pluginId;
            return this;
        }

        @Override
        public UninstallAppPluginRequest build() {
            return new UninstallAppPluginRequest(this);
        } 

    } 

}
