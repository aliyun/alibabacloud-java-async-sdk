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
 * {@link GetAppPluginConfigRequest} extends {@link RequestModel}
 *
 * <p>GetAppPluginConfigRequest</p>
 */
public class GetAppPluginConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PluginId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pluginId;

    private GetAppPluginConfigRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.pluginId = builder.pluginId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppPluginConfigRequest create() {
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

    public static final class Builder extends Request.Builder<GetAppPluginConfigRequest, Builder> {
        private String bizId; 
        private String pluginId; 

        private Builder() {
            super();
        } 

        private Builder(GetAppPluginConfigRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.pluginId = request.pluginId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WS20250801154628000001</p>
         */
        public Builder bizId(String bizId) {
            this.putBodyParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
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
        public GetAppPluginConfigRequest build() {
            return new GetAppPluginConfigRequest(this);
        } 

    } 

}
