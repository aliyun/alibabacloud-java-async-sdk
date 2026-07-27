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
 * {@link ListAppPluginFilesRequest} extends {@link RequestModel}
 *
 * <p>ListAppPluginFilesRequest</p>
 */
public class ListAppPluginFilesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginId")
    private String pluginId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginVersion")
    private String pluginVersion;

    private ListAppPluginFilesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.pluginId = builder.pluginId;
        this.pluginVersion = builder.pluginVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppPluginFilesRequest create() {
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

    /**
     * @return pluginVersion
     */
    public String getPluginVersion() {
        return this.pluginVersion;
    }

    public static final class Builder extends Request.Builder<ListAppPluginFilesRequest, Builder> {
        private String regionId; 
        private String pluginId; 
        private String pluginVersion; 

        private Builder() {
            super();
        } 

        private Builder(ListAppPluginFilesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.pluginId = request.pluginId;
            this.pluginVersion = request.pluginVersion;
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

        /**
         * PluginVersion.
         */
        public Builder pluginVersion(String pluginVersion) {
            this.putQueryParameter("PluginVersion", pluginVersion);
            this.pluginVersion = pluginVersion;
            return this;
        }

        @Override
        public ListAppPluginFilesRequest build() {
            return new ListAppPluginFilesRequest(this);
        } 

    } 

}
