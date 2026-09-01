// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link UpdateCheckScopeConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateCheckScopeConfigRequest</p>
 */
public class UpdateCheckScopeConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoConfig")
    private String autoConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoType")
    private Integer autoType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    private String configId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private Integer type;

    private UpdateCheckScopeConfigRequest(Builder builder) {
        super(builder);
        this.autoConfig = builder.autoConfig;
        this.autoType = builder.autoType;
        this.configId = builder.configId;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCheckScopeConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoConfig
     */
    public String getAutoConfig() {
        return this.autoConfig;
    }

    /**
     * @return autoType
     */
    public Integer getAutoType() {
        return this.autoType;
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<UpdateCheckScopeConfigRequest, Builder> {
        private String autoConfig; 
        private Integer autoType; 
        private String configId; 
        private Long resourceDirectoryAccountId; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCheckScopeConfigRequest request) {
            super(request);
            this.autoConfig = request.autoConfig;
            this.autoType = request.autoType;
            this.configId = request.configId;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.type = request.type;
        } 

        /**
         * AutoConfig.
         */
        public Builder autoConfig(String autoConfig) {
            this.putQueryParameter("AutoConfig", autoConfig);
            this.autoConfig = autoConfig;
            return this;
        }

        /**
         * AutoType.
         */
        public Builder autoType(Integer autoType) {
            this.putQueryParameter("AutoType", autoType);
            this.autoType = autoType;
            return this;
        }

        /**
         * ConfigId.
         */
        public Builder configId(String configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * ResourceDirectoryAccountId.
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public UpdateCheckScopeConfigRequest build() {
            return new UpdateCheckScopeConfigRequest(this);
        } 

    } 

}
