// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link UpdateInstanceSettingsRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceSettingsRequest</p>
 */
public class UpdateInstanceSettingsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("esConfig")
    private java.util.Map<String, String> esConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("force")
    private Boolean force;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("updateStrategy")
    private String updateStrategy;

    private UpdateInstanceSettingsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.esConfig = builder.esConfig;
        this.clientToken = builder.clientToken;
        this.force = builder.force;
        this.updateStrategy = builder.updateStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceSettingsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return esConfig
     */
    public java.util.Map<String, String> getEsConfig() {
        return this.esConfig;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return updateStrategy
     */
    public String getUpdateStrategy() {
        return this.updateStrategy;
    }

    public static final class Builder extends Request.Builder<UpdateInstanceSettingsRequest, Builder> {
        private String instanceId; 
        private java.util.Map<String, String> esConfig; 
        private String clientToken; 
        private Boolean force; 
        private String updateStrategy; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceSettingsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.esConfig = request.esConfig;
            this.clientToken = request.clientToken;
            this.force = request.force;
            this.updateStrategy = request.updateStrategy;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-nif1q9o8r0008****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The YML file configuration of the instance.</p>
         */
        public Builder esConfig(java.util.Map<String, String> esConfig) {
            this.putBodyParameter("esConfig", esConfig);
            this.esConfig = esConfig;
            return this;
        }

        /**
         * <p>A unique token used to ensure the idempotence of the request. The client generates this value. The value must be unique among different requests and cannot exceed 64 ASCII characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to forcibly apply the change.</p>
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("force", force);
            this.force = force;
            return this;
        }

        /**
         * <p>The change strategy for Elasticsearch (for example, the change method used during index updates, cluster upgrades, or service deployments). Valid values:</p>
         * <ul>
         * <li>blue_green: blue-green change. Achieves seamless switchover by running two identical environments (blue and green) in parallel.</li>
         * <li>normal: in-place change. Performs changes directly in the current environment (for example, upgrades or scaling) without requiring additional resources.</li>
         * <li>intelligent: intelligent change. The system automatically analyzes the change type and environment state, and dynamically selects the optimal change method (blue-green change or in-place change).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder updateStrategy(String updateStrategy) {
            this.putQueryParameter("updateStrategy", updateStrategy);
            this.updateStrategy = updateStrategy;
            return this;
        }

        @Override
        public UpdateInstanceSettingsRequest build() {
            return new UpdateInstanceSettingsRequest(this);
        } 

    } 

}
