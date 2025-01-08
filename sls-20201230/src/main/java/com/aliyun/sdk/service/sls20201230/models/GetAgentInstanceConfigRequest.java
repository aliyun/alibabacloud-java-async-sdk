// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link GetAgentInstanceConfigRequest} extends {@link RequestModel}
 *
 * <p>GetAgentInstanceConfigRequest</p>
 */
public class GetAgentInstanceConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("configName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configName;

    private GetAgentInstanceConfigRequest(Builder builder) {
        super(builder);
        this.configName = builder.configName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentInstanceConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configName
     */
    public String getConfigName() {
        return this.configName;
    }

    public static final class Builder extends Request.Builder<GetAgentInstanceConfigRequest, Builder> {
        private String configName; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentInstanceConfigRequest request) {
            super(request);
            this.configName = request.configName;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder configName(String configName) {
            this.putPathParameter("configName", configName);
            this.configName = configName;
            return this;
        }

        @Override
        public GetAgentInstanceConfigRequest build() {
            return new GetAgentInstanceConfigRequest(this);
        } 

    } 

}
