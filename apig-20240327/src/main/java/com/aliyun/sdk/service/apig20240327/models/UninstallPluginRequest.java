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
 * {@link UninstallPluginRequest} extends {@link RequestModel}
 *
 * <p>UninstallPluginRequest</p>
 */
public class UninstallPluginRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pluginId")
    private String pluginId;

    private UninstallPluginRequest(Builder builder) {
        super(builder);
        this.pluginId = builder.pluginId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UninstallPluginRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pluginId
     */
    public String getPluginId() {
        return this.pluginId;
    }

    public static final class Builder extends Request.Builder<UninstallPluginRequest, Builder> {
        private String pluginId; 

        private Builder() {
            super();
        } 

        private Builder(UninstallPluginRequest request) {
            super(request);
            this.pluginId = request.pluginId;
        } 

        /**
         * <p>The plug-in ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pl-cvd2b36m1hkhdosfhar0</p>
         */
        public Builder pluginId(String pluginId) {
            this.putPathParameter("pluginId", pluginId);
            this.pluginId = pluginId;
            return this;
        }

        @Override
        public UninstallPluginRequest build() {
            return new UninstallPluginRequest(this);
        } 

    } 

}
