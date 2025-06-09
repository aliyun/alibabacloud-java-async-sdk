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
    @com.aliyun.core.annotation.NameInMap("configType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("attributes")
    @com.aliyun.core.annotation.Validation(required = true)
    private String attributes;

    private GetAgentInstanceConfigRequest(Builder builder) {
        super(builder);
        this.configType = builder.configType;
        this.attributes = builder.attributes;
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
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
    }

    /**
     * @return attributes
     */
    public String getAttributes() {
        return this.attributes;
    }

    public static final class Builder extends Request.Builder<GetAgentInstanceConfigRequest, Builder> {
        private String configType; 
        private String attributes; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentInstanceConfigRequest request) {
            super(request);
            this.configType = request.configType;
            this.attributes = request.attributes;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder configType(String configType) {
            this.putPathParameter("configType", configType);
            this.configType = configType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder attributes(String attributes) {
            this.putQueryParameter("attributes", attributes);
            this.attributes = attributes;
            return this;
        }

        @Override
        public GetAgentInstanceConfigRequest build() {
            return new GetAgentInstanceConfigRequest(this);
        } 

    } 

}
