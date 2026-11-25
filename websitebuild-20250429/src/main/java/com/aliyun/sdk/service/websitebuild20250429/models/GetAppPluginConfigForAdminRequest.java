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
 * {@link GetAppPluginConfigForAdminRequest} extends {@link RequestModel}
 *
 * <p>GetAppPluginConfigForAdminRequest</p>
 */
public class GetAppPluginConfigForAdminRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PluginId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pluginId;

    private GetAppPluginConfigForAdminRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.pluginId = builder.pluginId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppPluginConfigForAdminRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return pluginId
     */
    public String getPluginId() {
        return this.pluginId;
    }

    public static final class Builder extends Request.Builder<GetAppPluginConfigForAdminRequest, Builder> {
        private String bizId; 
        private String pluginId; 

        private Builder() {
            super();
        } 

        private Builder(GetAppPluginConfigForAdminRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.pluginId = request.pluginId;
        } 

        /**
         * <p>The business ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WD20250821161210000001</p>
         */
        public Builder bizId(String bizId) {
            this.putBodyParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>The gateway plugin ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1bae9ceaceea432d91c7069fab0dfc02</p>
         */
        public Builder pluginId(String pluginId) {
            this.putBodyParameter("PluginId", pluginId);
            this.pluginId = pluginId;
            return this;
        }

        @Override
        public GetAppPluginConfigForAdminRequest build() {
            return new GetAppPluginConfigForAdminRequest(this);
        } 

    } 

}
