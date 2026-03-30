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
 * {@link CreateVoiceAccessProfileRequest} extends {@link RequestModel}
 *
 * <p>CreateVoiceAccessProfileRequest</p>
 */
public class CreateVoiceAccessProfileRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NlsEngine")
    private String nlsEngine;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Profile")
    private Profile profile;

    private CreateVoiceAccessProfileRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.nlsEngine = builder.nlsEngine;
        this.profile = builder.profile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVoiceAccessProfileRequest create() {
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
     * @return nlsEngine
     */
    public String getNlsEngine() {
        return this.nlsEngine;
    }

    /**
     * @return profile
     */
    public Profile getProfile() {
        return this.profile;
    }

    public static final class Builder extends Request.Builder<CreateVoiceAccessProfileRequest, Builder> {
        private String instanceId; 
        private String nlsEngine; 
        private Profile profile; 

        private Builder() {
            super();
        } 

        private Builder(CreateVoiceAccessProfileRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.nlsEngine = request.nlsEngine;
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
         * NlsEngine.
         */
        public Builder nlsEngine(String nlsEngine) {
            this.putBodyParameter("NlsEngine", nlsEngine);
            this.nlsEngine = nlsEngine;
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
        public CreateVoiceAccessProfileRequest build() {
            return new CreateVoiceAccessProfileRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateVoiceAccessProfileRequest} extends {@link TeaModel}
     *
     * <p>CreateVoiceAccessProfileRequest</p>
     */
    public static class Profile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKey")
        @com.aliyun.core.annotation.Validation(maxLength = 64)
        private String accessKey;

        @com.aliyun.core.annotation.NameInMap("ApiKey")
        @com.aliyun.core.annotation.Validation(maxLength = 64)
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("ApiSecret")
        @com.aliyun.core.annotation.Validation(maxLength = 64)
        private String apiSecret;

        @com.aliyun.core.annotation.NameInMap("AppId")
        @com.aliyun.core.annotation.Validation(maxLength = 64)
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppKey")
        @com.aliyun.core.annotation.Validation(maxLength = 64)
        private String appKey;

        @com.aliyun.core.annotation.NameInMap("AsrAppKey")
        @com.aliyun.core.annotation.Validation(maxLength = 64)
        private String asrAppKey;

        @com.aliyun.core.annotation.NameInMap("TtsApiKey")
        @com.aliyun.core.annotation.Validation(maxLength = 64)
        private String ttsApiKey;

        private Profile(Builder builder) {
            this.accessKey = builder.accessKey;
            this.apiKey = builder.apiKey;
            this.apiSecret = builder.apiSecret;
            this.appId = builder.appId;
            this.appKey = builder.appKey;
            this.asrAppKey = builder.asrAppKey;
            this.ttsApiKey = builder.ttsApiKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Profile create() {
            return builder().build();
        }

        /**
         * @return accessKey
         */
        public String getAccessKey() {
            return this.accessKey;
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return apiSecret
         */
        public String getApiSecret() {
            return this.apiSecret;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appKey
         */
        public String getAppKey() {
            return this.appKey;
        }

        /**
         * @return asrAppKey
         */
        public String getAsrAppKey() {
            return this.asrAppKey;
        }

        /**
         * @return ttsApiKey
         */
        public String getTtsApiKey() {
            return this.ttsApiKey;
        }

        public static final class Builder {
            private String accessKey; 
            private String apiKey; 
            private String apiSecret; 
            private String appId; 
            private String appKey; 
            private String asrAppKey; 
            private String ttsApiKey; 

            private Builder() {
            } 

            private Builder(Profile model) {
                this.accessKey = model.accessKey;
                this.apiKey = model.apiKey;
                this.apiSecret = model.apiSecret;
                this.appId = model.appId;
                this.appKey = model.appKey;
                this.asrAppKey = model.asrAppKey;
                this.ttsApiKey = model.ttsApiKey;
            } 

            /**
             * AccessKey.
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * ApiKey.
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * ApiSecret.
             */
            public Builder apiSecret(String apiSecret) {
                this.apiSecret = apiSecret;
                return this;
            }

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppKey.
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * AsrAppKey.
             */
            public Builder asrAppKey(String asrAppKey) {
                this.asrAppKey = asrAppKey;
                return this;
            }

            /**
             * TtsApiKey.
             */
            public Builder ttsApiKey(String ttsApiKey) {
                this.ttsApiKey = ttsApiKey;
                return this;
            }

            public Profile build() {
                return new Profile(this);
            } 

        } 

    }
}
