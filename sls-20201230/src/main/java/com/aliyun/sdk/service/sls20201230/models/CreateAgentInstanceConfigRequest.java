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
    @com.aliyun.core.annotation.NameInMap("config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configMatcher")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configMatcher;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("isGray")
    private Boolean isGray;

    private CreateAgentInstanceConfigRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.configMatcher = builder.configMatcher;
        this.configName = builder.configName;
        this.isGray = builder.isGray;
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
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return configMatcher
     */
    public String getConfigMatcher() {
        return this.configMatcher;
    }

    /**
     * @return configName
     */
    public String getConfigName() {
        return this.configName;
    }

    /**
     * @return isGray
     */
    public Boolean getIsGray() {
        return this.isGray;
    }

    public static final class Builder extends Request.Builder<CreateAgentInstanceConfigRequest, Builder> {
        private String config; 
        private String configMatcher; 
        private String configName; 
        private Boolean isGray; 

        private Builder() {
            super();
        } 

        private Builder(CreateAgentInstanceConfigRequest request) {
            super(request);
            this.config = request.config;
            this.configMatcher = request.configMatcher;
            this.configName = request.configName;
            this.isGray = request.isGray;
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
        public Builder configMatcher(String configMatcher) {
            this.putBodyParameter("configMatcher", configMatcher);
            this.configMatcher = configMatcher;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder configName(String configName) {
            this.putBodyParameter("configName", configName);
            this.configName = configName;
            return this;
        }

        /**
         * isGray.
         */
        public Builder isGray(Boolean isGray) {
            this.putBodyParameter("isGray", isGray);
            this.isGray = isGray;
            return this;
        }

        @Override
        public CreateAgentInstanceConfigRequest build() {
            return new CreateAgentInstanceConfigRequest(this);
        } 

    } 

}
