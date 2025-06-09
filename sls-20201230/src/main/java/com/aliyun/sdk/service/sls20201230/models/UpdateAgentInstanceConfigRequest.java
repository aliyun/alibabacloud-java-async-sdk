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
 * {@link UpdateAgentInstanceConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateAgentInstanceConfigRequest</p>
 */
public class UpdateAgentInstanceConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("configType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("attributes")
    private java.util.Map<String, String> attributes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("grayConfigs")
    private java.util.List<AgentInstanceConfigGrayConfigs> grayConfigs;

    private UpdateAgentInstanceConfigRequest(Builder builder) {
        super(builder);
        this.configType = builder.configType;
        this.attributes = builder.attributes;
        this.config = builder.config;
        this.grayConfigs = builder.grayConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAgentInstanceConfigRequest create() {
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
    public java.util.Map<String, String> getAttributes() {
        return this.attributes;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return grayConfigs
     */
    public java.util.List<AgentInstanceConfigGrayConfigs> getGrayConfigs() {
        return this.grayConfigs;
    }

    public static final class Builder extends Request.Builder<UpdateAgentInstanceConfigRequest, Builder> {
        private String configType; 
        private java.util.Map<String, String> attributes; 
        private String config; 
        private java.util.List<AgentInstanceConfigGrayConfigs> grayConfigs; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAgentInstanceConfigRequest request) {
            super(request);
            this.configType = request.configType;
            this.attributes = request.attributes;
            this.config = request.config;
            this.grayConfigs = request.grayConfigs;
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
         * attributes.
         */
        public Builder attributes(java.util.Map<String, String> attributes) {
            String attributesShrink = shrink(attributes, "attributes", "json");
            this.putQueryParameter("attributes", attributesShrink);
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
         * grayConfigs.
         */
        public Builder grayConfigs(java.util.List<AgentInstanceConfigGrayConfigs> grayConfigs) {
            this.putBodyParameter("grayConfigs", grayConfigs);
            this.grayConfigs = grayConfigs;
            return this;
        }

        @Override
        public UpdateAgentInstanceConfigRequest build() {
            return new UpdateAgentInstanceConfigRequest(this);
        } 

    } 

}
