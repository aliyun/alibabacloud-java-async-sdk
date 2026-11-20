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
 * {@link CreateConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateConfigRequest</p>
 */
public class CreateConfigRequest extends Request {
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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private CreateConfigRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.configType = builder.configType;
        this.name = builder.name;
        this.configKey = builder.configKey;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConfigRequest create() {
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

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<CreateConfigRequest, Builder> {
        private String clusterId; 
        private String configType; 
        private String name; 
        private String configKey; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(CreateConfigRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.configType = request.configType;
            this.name = request.name;
            this.configKey = request.configKey;
            this.value = request.value;
        } 

        /**
         * <p>The region to which the service belongs. Required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The configuration type. Required. Only <code>service</code> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>service</p>
         */
        public Builder configType(String configType) {
            this.putPathParameter("ConfigType", configType);
            this.configType = configType;
            return this;
        }

        /**
         * <p>The service name. Required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_llm_service</p>
         */
        public Builder name(String name) {
            this.putPathParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The name of the dynamic parameter. Required. The name supports letters, digits, periods, underscores, hyphens, and forward slashes, and can be up to 100 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>rate_limit</p>
         */
        public Builder configKey(String configKey) {
            this.putPathParameter("ConfigKey", configKey);
            this.configKey = configKey;
            return this;
        }

        /**
         * <p>The value of the dynamic parameter. Required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;model&quot;: &quot;gpt-4&quot;}</p>
         */
        public Builder value(String value) {
            this.putBodyParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public CreateConfigRequest build() {
            return new CreateConfigRequest(this);
        } 

    } 

}
