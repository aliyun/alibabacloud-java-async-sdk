// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianvoicebot20250101.models;

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
 * {@link UpdateVoiceAccessProfileRequest} extends {@link RequestModel}
 *
 * <p>UpdateVoiceAccessProfileRequest</p>
 */
public class UpdateVoiceAccessProfileRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessProfileId")
    private String accessProfileId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BusinessUnitId")
    private String businessUnitId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NlsEngine")
    private String nlsEngine;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Profile")
    private Profile profile;

    private UpdateVoiceAccessProfileRequest(Builder builder) {
        super(builder);
        this.accessProfileId = builder.accessProfileId;
        this.businessUnitId = builder.businessUnitId;
        this.nlsEngine = builder.nlsEngine;
        this.profile = builder.profile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVoiceAccessProfileRequest create() {
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
     * @return businessUnitId
     */
    public String getBusinessUnitId() {
        return this.businessUnitId;
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

    public static final class Builder extends Request.Builder<UpdateVoiceAccessProfileRequest, Builder> {
        private String accessProfileId; 
        private String businessUnitId; 
        private String nlsEngine; 
        private Profile profile; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVoiceAccessProfileRequest request) {
            super(request);
            this.accessProfileId = request.accessProfileId;
            this.businessUnitId = request.businessUnitId;
            this.nlsEngine = request.nlsEngine;
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
         * BusinessUnitId.
         */
        public Builder businessUnitId(String businessUnitId) {
            this.putBodyParameter("BusinessUnitId", businessUnitId);
            this.businessUnitId = businessUnitId;
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
        public UpdateVoiceAccessProfileRequest build() {
            return new UpdateVoiceAccessProfileRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateVoiceAccessProfileRequest} extends {@link TeaModel}
     *
     * <p>UpdateVoiceAccessProfileRequest</p>
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
