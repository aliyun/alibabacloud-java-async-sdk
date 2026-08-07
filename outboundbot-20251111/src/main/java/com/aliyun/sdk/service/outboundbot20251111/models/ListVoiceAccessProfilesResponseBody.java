// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20251111.models;

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
 * {@link ListVoiceAccessProfilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListVoiceAccessProfilesResponseBody</p>
 */
public class ListVoiceAccessProfilesResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListVoiceAccessProfilesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.params = builder.params;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVoiceAccessProfilesResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private java.util.List<String> params; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListVoiceAccessProfilesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>返回码</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>返回数据</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP状态码</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>错误信息</p>
         * 
         * <strong>example:</strong>
         * <p>Instance does not exist. Instance=outb001,.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>错误信息中的变量值列表</p>
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * <p>请求ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FDAC7-13C5-1B64-A853-999DF105B9EF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>是否调用成功</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListVoiceAccessProfilesResponseBody build() {
            return new ListVoiceAccessProfilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVoiceAccessProfilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListVoiceAccessProfilesResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("SecretId")
        private String secretId;

        @com.aliyun.core.annotation.NameInMap("SecretKey")
        private String secretKey;

        @com.aliyun.core.annotation.NameInMap("TtsApiKey")
        private String ttsApiKey;

        private Profile(Builder builder) {
            this.accessKey = builder.accessKey;
            this.apiKey = builder.apiKey;
            this.apiSecret = builder.apiSecret;
            this.appId = builder.appId;
            this.appKey = builder.appKey;
            this.asrAppKey = builder.asrAppKey;
            this.secretId = builder.secretId;
            this.secretKey = builder.secretKey;
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
         * @return secretId
         */
        public String getSecretId() {
            return this.secretId;
        }

        /**
         * @return secretKey
         */
        public String getSecretKey() {
            return this.secretKey;
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
            private String secretId; 
            private String secretKey; 
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
                this.secretId = model.secretId;
                this.secretKey = model.secretKey;
                this.ttsApiKey = model.ttsApiKey;
            } 

            /**
             * <p>访问密钥</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * <p>百炼同时使用</p>
             * 
             * <strong>example:</strong>
             * <p>a9872e2342952e248727798f642936c7</p>
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * <p>API密钥</p>
             * 
             * <strong>example:</strong>
             * <p>c0358c6e51c1013b446fdeb21a3a5d2e</p>
             */
            public Builder apiSecret(String apiSecret) {
                this.apiSecret = apiSecret;
                return this;
            }

            /**
             * <p>科大讯飞使用</p>
             * 
             * <strong>example:</strong>
             * <p>9479688350</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>豆包使用</p>
             * 
             * <strong>example:</strong>
             * <p>DW0yKRHQEe1nAd8c</p>
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * <p>货拉拉使用</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder asrAppKey(String asrAppKey) {
                this.asrAppKey = asrAppKey;
                return this;
            }

            /**
             * <p>腾讯云使用，appId 已存在</p>
             * 
             * <strong>example:</strong>
             * <p>sci_r3b3e62udqcujnkerrorqztnpu</p>
             */
            public Builder secretId(String secretId) {
                this.secretId = secretId;
                return this;
            }

            /**
             * <p>密钥</p>
             * 
             * <strong>example:</strong>
             * <p>y5MZfFdW6yBZgJdKonHZBA</p>
             */
            public Builder secretKey(String secretKey) {
                this.secretKey = secretKey;
                return this;
            }

            /**
             * <p>TTS服务API Key</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
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
     * {@link ListVoiceAccessProfilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListVoiceAccessProfilesResponseBody</p>
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
             * <p>接入配置ID</p>
             * 
             * <strong>example:</strong>
             * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b15</p>
             */
            public Builder accessProfileId(String accessProfileId) {
                this.accessProfileId = accessProfileId;
                return this;
            }

            /**
             * <p>能力列表</p>
             */
            public Builder capabilities(java.util.List<String> capabilities) {
                this.capabilities = capabilities;
                return this;
            }

            /**
             * <p>创建时间，毫秒级时间戳</p>
             * 
             * <strong>example:</strong>
             * <p>1735660800000</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>实例ID</p>
             * 
             * <strong>example:</strong>
             * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>目前支持IFLYTEK、VOLC</p>
             * 
             * <strong>example:</strong>
             * <p>BAILIAN</p>
             */
            public Builder nlsEngine(String nlsEngine) {
                this.nlsEngine = nlsEngine;
                return this;
            }

            /**
             * <p>引擎显示名称(例如：豆包、货拉拉)</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder nlsEngineName(String nlsEngineName) {
                this.nlsEngineName = nlsEngineName;
                return this;
            }

            /**
             * <p>配置</p>
             */
            public Builder profile(Profile profile) {
                this.profile = profile;
                return this;
            }

            /**
             * <p>更新时间，毫秒级时间戳</p>
             * 
             * <strong>example:</strong>
             * <p>1735660800000</p>
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
     * {@link ListVoiceAccessProfilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListVoiceAccessProfilesResponseBody</p>
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
             * <p>页码，从1开始</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>每页记录数</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>符合条件的记录总数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>数据列表</p>
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
