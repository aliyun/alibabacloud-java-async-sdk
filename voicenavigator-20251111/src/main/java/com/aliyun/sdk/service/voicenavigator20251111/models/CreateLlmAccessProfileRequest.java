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
 * {@link CreateLlmAccessProfileRequest} extends {@link RequestModel}
 *
 * <p>CreateLlmAccessProfileRequest</p>
 */
public class CreateLlmAccessProfileRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Profile")
    private Profile profile;

    private CreateLlmAccessProfileRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.profile = builder.profile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLlmAccessProfileRequest create() {
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
     * @return profile
     */
    public Profile getProfile() {
        return this.profile;
    }

    public static final class Builder extends Request.Builder<CreateLlmAccessProfileRequest, Builder> {
        private String instanceId; 
        private Profile profile; 

        private Builder() {
            super();
        } 

        private Builder(CreateLlmAccessProfileRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.profile = request.profile;
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
        public CreateLlmAccessProfileRequest build() {
            return new CreateLlmAccessProfileRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateLlmAccessProfileRequest} extends {@link TeaModel}
     *
     * <p>CreateLlmAccessProfileRequest</p>
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
