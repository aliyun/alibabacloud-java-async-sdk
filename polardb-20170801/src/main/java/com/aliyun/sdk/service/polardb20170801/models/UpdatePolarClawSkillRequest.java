// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link UpdatePolarClawSkillRequest} extends {@link RequestModel}
 *
 * <p>UpdatePolarClawSkillRequest</p>
 */
public class UpdatePolarClawSkillRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    private String apiKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Env")
    private java.util.Map<String, String> env;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillKey;

    private UpdatePolarClawSkillRequest(Builder builder) {
        super(builder);
        this.apiKey = builder.apiKey;
        this.applicationId = builder.applicationId;
        this.enabled = builder.enabled;
        this.env = builder.env;
        this.skillKey = builder.skillKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePolarClawSkillRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return env
     */
    public java.util.Map<String, String> getEnv() {
        return this.env;
    }

    /**
     * @return skillKey
     */
    public String getSkillKey() {
        return this.skillKey;
    }

    public static final class Builder extends Request.Builder<UpdatePolarClawSkillRequest, Builder> {
        private String apiKey; 
        private String applicationId; 
        private Boolean enabled; 
        private java.util.Map<String, String> env; 
        private String skillKey; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePolarClawSkillRequest request) {
            super(request);
            this.apiKey = request.apiKey;
            this.applicationId = request.applicationId;
            this.enabled = request.enabled;
            this.env = request.env;
            this.skillKey = request.skillKey;
        } 

        /**
         * ApiKey.
         */
        public Builder apiKey(String apiKey) {
            this.putQueryParameter("ApiKey", apiKey);
            this.apiKey = apiKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-xxx</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * Env.
         */
        public Builder env(java.util.Map<String, String> env) {
            String envShrink = shrink(env, "Env", "json");
            this.putQueryParameter("Env", envShrink);
            this.env = env;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alibacloud-rds-copilot</p>
         */
        public Builder skillKey(String skillKey) {
            this.putQueryParameter("SkillKey", skillKey);
            this.skillKey = skillKey;
            return this;
        }

        @Override
        public UpdatePolarClawSkillRequest build() {
            return new UpdatePolarClawSkillRequest(this);
        } 

    } 

}
