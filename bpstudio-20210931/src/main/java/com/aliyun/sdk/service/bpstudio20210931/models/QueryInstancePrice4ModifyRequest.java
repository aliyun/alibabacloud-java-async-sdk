// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

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
 * {@link QueryInstancePrice4ModifyRequest} extends {@link RequestModel}
 *
 * <p>QueryInstancePrice4ModifyRequest</p>
 */
public class QueryInstancePrice4ModifyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Configuration")
    private java.util.Map<String, ?> configuration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private QueryInstancePrice4ModifyRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.configuration = builder.configuration;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryInstancePrice4ModifyRequest create() {
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
     * @return configuration
     */
    public java.util.Map<String, ?> getConfiguration() {
        return this.configuration;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<QueryInstancePrice4ModifyRequest, Builder> {
        private String applicationId; 
        private java.util.Map<String, ?> configuration; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(QueryInstancePrice4ModifyRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.configuration = request.configuration;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>002XWH7MXB8MJRU0</p>
         */
        public Builder applicationId(String applicationId) {
            this.putBodyParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Configuration.
         */
        public Builder configuration(java.util.Map<String, ?> configuration) {
            String configurationShrink = shrink(configuration, "Configuration", "json");
            this.putBodyParameter("Configuration", configurationShrink);
            this.configuration = configuration;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf66k9143r2ch*****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public QueryInstancePrice4ModifyRequest build() {
            return new QueryInstancePrice4ModifyRequest(this);
        } 

    } 

}
