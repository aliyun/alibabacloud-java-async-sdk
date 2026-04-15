// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20251111.models;

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
 * {@link UpdateLlmAccessProfileRequest} extends {@link RequestModel}
 *
 * <p>UpdateLlmAccessProfileRequest</p>
 */
public class UpdateLlmAccessProfileRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessProfileId")
    private String accessProfileId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Profile")
    private Profile profile;

    private UpdateLlmAccessProfileRequest(Builder builder) {
        super(builder);
        this.accessProfileId = builder.accessProfileId;
        this.instanceId = builder.instanceId;
        this.profile = builder.profile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLlmAccessProfileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessProfileId
     */
    public String getAccessProfileId() {
        return this.accessProfileId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return profile
     */
    public Profile getProfile() {
        return this.profile;
    }

    public static final class Builder extends Request.Builder<UpdateLlmAccessProfileRequest, Builder> {
        private String accessProfileId; 
        private String instanceId; 
        private Profile profile; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLlmAccessProfileRequest request) {
            super(request);
            this.accessProfileId = request.accessProfileId;
            this.instanceId = request.instanceId;
            this.profile = request.profile;
        } 

        /**
         * AccessProfileId.
         */
        public Builder accessProfileId(String accessProfileId) {
            this.putBodyParameter("AccessProfileId", accessProfileId);
            this.accessProfileId = accessProfileId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Profile.
         */
        public Builder profile(Profile profile) {
            String profileShrink = shrink(profile, "Profile", "json");
            this.putBodyParameter("Profile", profileShrink);
            this.profile = profile;
            return this;
        }

        @Override
        public UpdateLlmAccessProfileRequest build() {
            return new UpdateLlmAccessProfileRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateLlmAccessProfileRequest} extends {@link TeaModel}
     *
     * <p>UpdateLlmAccessProfileRequest</p>
     */
    public static class Profile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Profile(Builder builder) {
            this.apiKey = builder.apiKey;
            this.endpoint = builder.endpoint;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Profile create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String apiKey; 
            private String endpoint; 
            private String name; 

            private Builder() {
            } 

            private Builder(Profile model) {
                this.apiKey = model.apiKey;
                this.endpoint = model.endpoint;
                this.name = model.name;
            } 

            /**
             * ApiKey.
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * Endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Profile build() {
                return new Profile(this);
            } 

        } 

    }
}
