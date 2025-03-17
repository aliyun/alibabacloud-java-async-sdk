// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link DeleteVodPackagingConfigurationRequest} extends {@link RequestModel}
 *
 * <p>DeleteVodPackagingConfigurationRequest</p>
 */
public class DeleteVodPackagingConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigurationName")
    private String configurationName;

    private DeleteVodPackagingConfigurationRequest(Builder builder) {
        super(builder);
        this.configurationName = builder.configurationName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVodPackagingConfigurationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configurationName
     */
    public String getConfigurationName() {
        return this.configurationName;
    }

    public static final class Builder extends Request.Builder<DeleteVodPackagingConfigurationRequest, Builder> {
        private String configurationName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVodPackagingConfigurationRequest request) {
            super(request);
            this.configurationName = request.configurationName;
        } 

        /**
         * <p>The name of the packaging configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>hls_3s</p>
         */
        public Builder configurationName(String configurationName) {
            this.putQueryParameter("ConfigurationName", configurationName);
            this.configurationName = configurationName;
            return this;
        }

        @Override
        public DeleteVodPackagingConfigurationRequest build() {
            return new DeleteVodPackagingConfigurationRequest(this);
        } 

    } 

}
