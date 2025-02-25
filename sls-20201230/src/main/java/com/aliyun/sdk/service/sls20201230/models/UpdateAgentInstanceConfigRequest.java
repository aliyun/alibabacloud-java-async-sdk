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
    @com.aliyun.core.annotation.NameInMap("configName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configMatcher")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configMatcher;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("isGray")
    private Boolean isGray;

    private UpdateAgentInstanceConfigRequest(Builder builder) {
        super(builder);
        this.configName = builder.configName;
        this.config = builder.config;
        this.configMatcher = builder.configMatcher;
        this.isGray = builder.isGray;
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
     * @return configName
     */
    public String getConfigName() {
        return this.configName;
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
     * @return isGray
     */
    public Boolean getIsGray() {
        return this.isGray;
    }

    public static final class Builder extends Request.Builder<UpdateAgentInstanceConfigRequest, Builder> {
        private String configName; 
        private String config; 
        private String configMatcher; 
        private Boolean isGray; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAgentInstanceConfigRequest request) {
            super(request);
            this.configName = request.configName;
            this.config = request.config;
            this.configMatcher = request.configMatcher;
            this.isGray = request.isGray;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder configName(String configName) {
            this.putPathParameter("configName", configName);
            this.configName = configName;
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
        public Builder configMatcher(String configMatcher) {
            this.putBodyParameter("configMatcher", configMatcher);
            this.configMatcher = configMatcher;
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
        public UpdateAgentInstanceConfigRequest build() {
            return new UpdateAgentInstanceConfigRequest(this);
        } 

    } 

}
