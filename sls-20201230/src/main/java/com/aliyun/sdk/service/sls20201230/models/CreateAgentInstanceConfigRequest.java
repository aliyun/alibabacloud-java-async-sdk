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
 * {@link CreateAgentInstanceConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateAgentInstanceConfigRequest</p>
 */
public class CreateAgentInstanceConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("attributes")
    @com.aliyun.core.annotation.Validation(required = true)
    private String attributes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("grayConfigs")
    private String grayConfigs;

    private CreateAgentInstanceConfigRequest(Builder builder) {
        super(builder);
        this.attributes = builder.attributes;
        this.config = builder.config;
        this.configType = builder.configType;
        this.grayConfigs = builder.grayConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgentInstanceConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attributes
     */
    public String getAttributes() {
        return this.attributes;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
    }

    /**
     * @return grayConfigs
     */
    public String getGrayConfigs() {
        return this.grayConfigs;
    }

    public static final class Builder extends Request.Builder<CreateAgentInstanceConfigRequest, Builder> {
        private String attributes; 
        private String config; 
        private String configType; 
        private String grayConfigs; 

        private Builder() {
            super();
        } 

        private Builder(CreateAgentInstanceConfigRequest request) {
            super(request);
            this.attributes = request.attributes;
            this.config = request.config;
            this.configType = request.configType;
            this.grayConfigs = request.grayConfigs;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder attributes(String attributes) {
            this.putBodyParameter("attributes", attributes);
            this.attributes = attributes;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder config(String config) {
            this.putBodyParameter("config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder configType(String configType) {
            this.putBodyParameter("configType", configType);
            this.configType = configType;
            return this;
        }

        /**
         * grayConfigs.
         */
        public Builder grayConfigs(String grayConfigs) {
            this.putBodyParameter("grayConfigs", grayConfigs);
            this.grayConfigs = grayConfigs;
            return this;
        }

        @Override
        public CreateAgentInstanceConfigRequest build() {
            return new CreateAgentInstanceConfigRequest(this);
        } 

    } 

}
