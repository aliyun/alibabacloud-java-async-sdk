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
 * {@link GetVodPackagingConfigurationRequest} extends {@link RequestModel}
 *
 * <p>GetVodPackagingConfigurationRequest</p>
 */
public class GetVodPackagingConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigurationName")
    private String configurationName;

    private GetVodPackagingConfigurationRequest(Builder builder) {
        super(builder);
        this.configurationName = builder.configurationName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVodPackagingConfigurationRequest create() {
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

    public static final class Builder extends Request.Builder<GetVodPackagingConfigurationRequest, Builder> {
        private String configurationName; 

        private Builder() {
            super();
        } 

        private Builder(GetVodPackagingConfigurationRequest request) {
            super(request);
            this.configurationName = request.configurationName;
        } 

        /**
         * ConfigurationName.
         */
        public Builder configurationName(String configurationName) {
            this.putQueryParameter("ConfigurationName", configurationName);
            this.configurationName = configurationName;
            return this;
        }

        @Override
        public GetVodPackagingConfigurationRequest build() {
            return new GetVodPackagingConfigurationRequest(this);
        } 

    } 

}
