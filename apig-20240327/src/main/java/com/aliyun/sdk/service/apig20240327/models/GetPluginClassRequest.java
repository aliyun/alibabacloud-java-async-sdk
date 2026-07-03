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
 * {@link GetPluginClassRequest} extends {@link RequestModel}
 *
 * <p>GetPluginClassRequest</p>
 */
public class GetPluginClassRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pluginClassId")
    private String pluginClassId;

    private GetPluginClassRequest(Builder builder) {
        super(builder);
        this.pluginClassId = builder.pluginClassId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPluginClassRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pluginClassId
     */
    public String getPluginClassId() {
        return this.pluginClassId;
    }

    public static final class Builder extends Request.Builder<GetPluginClassRequest, Builder> {
        private String pluginClassId; 

        private Builder() {
            super();
        } 

        private Builder(GetPluginClassRequest request) {
            super(request);
            this.pluginClassId = request.pluginClassId;
        } 

        /**
         * pluginClassId.
         */
        public Builder pluginClassId(String pluginClassId) {
            this.putPathParameter("pluginClassId", pluginClassId);
            this.pluginClassId = pluginClassId;
            return this;
        }

        @Override
        public GetPluginClassRequest build() {
            return new GetPluginClassRequest(this);
        } 

    } 

}
