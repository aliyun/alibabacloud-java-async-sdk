// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link DeleteConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteConfigRequest</p>
 */
public class DeleteConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ConfigType")
    private String configType;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ConfigKey")
    private String configKey;

    private DeleteConfigRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.configType = builder.configType;
        this.name = builder.name;
        this.configKey = builder.configKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return configKey
     */
    public String getConfigKey() {
        return this.configKey;
    }

    public static final class Builder extends Request.Builder<DeleteConfigRequest, Builder> {
        private String clusterId; 
        private String configType; 
        private String name; 
        private String configKey; 

        private Builder() {
            super();
        } 

        private Builder(DeleteConfigRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.configType = request.configType;
            this.name = request.name;
            this.configKey = request.configKey;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ConfigType.
         */
        public Builder configType(String configType) {
            this.putPathParameter("ConfigType", configType);
            this.configType = configType;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putPathParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ConfigKey.
         */
        public Builder configKey(String configKey) {
            this.putPathParameter("ConfigKey", configKey);
            this.configKey = configKey;
            return this;
        }

        @Override
        public DeleteConfigRequest build() {
            return new DeleteConfigRequest(this);
        } 

    } 

}
