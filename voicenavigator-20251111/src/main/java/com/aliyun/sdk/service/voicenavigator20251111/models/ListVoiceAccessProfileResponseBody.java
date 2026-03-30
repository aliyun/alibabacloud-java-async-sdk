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
 * {@link ListVoiceAccessProfileResponseBody} extends {@link TeaModel}
 *
 * <p>ListVoiceAccessProfileResponseBody</p>
 */
public class ListVoiceAccessProfileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.List<String> params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListVoiceAccessProfileResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.params = builder.params;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVoiceAccessProfileResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return params
     */
    public java.util.List<String> getParams() {
        return this.params;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private java.util.List<String> params; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListVoiceAccessProfileResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
            this.requestId = model.requestId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Params.
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListVoiceAccessProfileResponseBody build() {
            return new ListVoiceAccessProfileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVoiceAccessProfileResponseBody} extends {@link TeaModel}
     *
     * <p>ListVoiceAccessProfileResponseBody</p>
     */
    public static class Profile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKey")
        private String accessKey;

        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("ApiSecret")
        private String apiSecret;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppKey")
        private String appKey;

        @com.aliyun.core.annotation.NameInMap("AsrAppKey")
        private String asrAppKey;

        @com.aliyun.core.annotation.NameInMap("TtsApiKey")
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
    /**
     * 
     * {@link ListVoiceAccessProfileResponseBody} extends {@link TeaModel}
     *
     * <p>ListVoiceAccessProfileResponseBody</p>
     */
    public static class VoiceAccessProfiles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessProfileId")
        private String accessProfileId;

        @com.aliyun.core.annotation.NameInMap("Capabilities")
        private java.util.List<String> capabilities;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("NlsEngine")
        private String nlsEngine;

        @com.aliyun.core.annotation.NameInMap("NlsEngineName")
        private String nlsEngineName;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private Profile profile;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private Long updatedTime;

        private VoiceAccessProfiles(Builder builder) {
            this.accessProfileId = builder.accessProfileId;
            this.capabilities = builder.capabilities;
            this.createdTime = builder.createdTime;
            this.instanceId = builder.instanceId;
            this.nlsEngine = builder.nlsEngine;
            this.nlsEngineName = builder.nlsEngineName;
            this.profile = builder.profile;
            this.updatedTime = builder.updatedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VoiceAccessProfiles create() {
            return builder().build();
        }

        /**
         * @return accessProfileId
         */
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

        /**
         * @return capabilities
         */
        public java.util.List<String> getCapabilities() {
            return this.capabilities;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
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
         * @return nlsEngineName
         */
        public String getNlsEngineName() {
            return this.nlsEngineName;
        }

        /**
         * @return profile
         */
        public Profile getProfile() {
            return this.profile;
        }

        /**
         * @return updatedTime
         */
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public static final class Builder {
            private String accessProfileId; 
            private java.util.List<String> capabilities; 
            private Long createdTime; 
            private String instanceId; 
            private String nlsEngine; 
            private String nlsEngineName; 
            private Profile profile; 
            private Long updatedTime; 

            private Builder() {
            } 

            private Builder(VoiceAccessProfiles model) {
                this.accessProfileId = model.accessProfileId;
                this.capabilities = model.capabilities;
                this.createdTime = model.createdTime;
                this.instanceId = model.instanceId;
                this.nlsEngine = model.nlsEngine;
                this.nlsEngineName = model.nlsEngineName;
                this.profile = model.profile;
                this.updatedTime = model.updatedTime;
            } 

            /**
             * AccessProfileId.
             */
            public Builder accessProfileId(String accessProfileId) {
                this.accessProfileId = accessProfileId;
                return this;
            }

            /**
             * Capabilities.
             */
            public Builder capabilities(java.util.List<String> capabilities) {
                this.capabilities = capabilities;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * NlsEngine.
             */
            public Builder nlsEngine(String nlsEngine) {
                this.nlsEngine = nlsEngine;
                return this;
            }

            /**
             * NlsEngineName.
             */
            public Builder nlsEngineName(String nlsEngineName) {
                this.nlsEngineName = nlsEngineName;
                return this;
            }

            /**
             * Profile.
             */
            public Builder profile(Profile profile) {
                this.profile = profile;
                return this;
            }

            /**
             * UpdatedTime.
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            public VoiceAccessProfiles build() {
                return new VoiceAccessProfiles(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListVoiceAccessProfileResponseBody} extends {@link TeaModel}
     *
     * <p>ListVoiceAccessProfileResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("VoiceAccessProfiles")
        private java.util.List<VoiceAccessProfiles> voiceAccessProfiles;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.voiceAccessProfiles = builder.voiceAccessProfiles;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return voiceAccessProfiles
         */
        public java.util.List<VoiceAccessProfiles> getVoiceAccessProfiles() {
            return this.voiceAccessProfiles;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 
            private java.util.List<VoiceAccessProfiles> voiceAccessProfiles; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
                this.voiceAccessProfiles = model.voiceAccessProfiles;
            } 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * VoiceAccessProfiles.
             */
            public Builder voiceAccessProfiles(java.util.List<VoiceAccessProfiles> voiceAccessProfiles) {
                this.voiceAccessProfiles = voiceAccessProfiles;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
