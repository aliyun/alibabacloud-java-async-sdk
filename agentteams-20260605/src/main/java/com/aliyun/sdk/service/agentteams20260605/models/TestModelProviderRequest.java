// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605.models;

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
 * {@link TestModelProviderRequest} extends {@link RequestModel}
 *
 * <p>TestModelProviderRequest</p>
 */
public class TestModelProviderRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModelName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Prompt")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProviderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String providerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProviderName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String providerName;

    private TestModelProviderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.modelName = builder.modelName;
        this.prompt = builder.prompt;
        this.providerId = builder.providerId;
        this.providerName = builder.providerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TestModelProviderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return providerId
     */
    public String getProviderId() {
        return this.providerId;
    }

    /**
     * @return providerName
     */
    public String getProviderName() {
        return this.providerName;
    }

    public static final class Builder extends Request.Builder<TestModelProviderRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String modelName; 
        private String prompt; 
        private String providerId; 
        private String providerName; 

        private Builder() {
            super();
        } 

        private Builder(TestModelProviderRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.modelName = request.modelName;
            this.prompt = request.prompt;
            this.providerId = request.providerId;
            this.providerName = request.providerName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-xxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AgentTeams</p>
         */
        public Builder modelName(String modelName) {
            this.putBodyParameter("ModelName", modelName);
            this.modelName = modelName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello, how are you?</p>
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder providerId(String providerId) {
            this.putBodyParameter("ProviderId", providerId);
            this.providerId = providerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-provider</p>
         */
        public Builder providerName(String providerName) {
            this.putBodyParameter("ProviderName", providerName);
            this.providerName = providerName;
            return this;
        }

        @Override
        public TestModelProviderRequest build() {
            return new TestModelProviderRequest(this);
        } 

    } 

}
