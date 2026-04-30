// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link GetPolarClawConfigRequest} extends {@link RequestModel}
 *
 * <p>GetPolarClawConfigRequest</p>
 */
public class GetPolarClawConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigPath")
    private String configPath;

    private GetPolarClawConfigRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.configPath = builder.configPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPolarClawConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return configPath
     */
    public String getConfigPath() {
        return this.configPath;
    }

    public static final class Builder extends Request.Builder<GetPolarClawConfigRequest, Builder> {
        private String applicationId; 
        private String configPath; 

        private Builder() {
            super();
        } 

        private Builder(GetPolarClawConfigRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.configPath = request.configPath;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * ConfigPath.
         */
        public Builder configPath(String configPath) {
            this.putQueryParameter("ConfigPath", configPath);
            this.configPath = configPath;
            return this;
        }

        @Override
        public GetPolarClawConfigRequest build() {
            return new GetPolarClawConfigRequest(this);
        } 

    } 

}
