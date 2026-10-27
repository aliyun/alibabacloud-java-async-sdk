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
 * {@link ListLlmAccessProfilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListLlmAccessProfilesResponseBody</p>
 */
public class ListLlmAccessProfilesResponseBody extends TeaModel {
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

    private ListLlmAccessProfilesResponseBody(Builder builder) {
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

    public static ListLlmAccessProfilesResponseBody create() {
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

        private Builder(ListLlmAccessProfilesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The internal error code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The paginated list of third-party model configurations.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance af81a389-91f0-4157-8d82-720edd02b66a
         *  does not exist.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>A list of dynamic parameters associated with the error.</p>
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * <p>A unique identifier for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ED56B723-5802-5C32-865F-6E20B06D2455</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListLlmAccessProfilesResponseBody build() {
            return new ListLlmAccessProfilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLlmAccessProfilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListLlmAccessProfilesResponseBody</p>
     */
    public static class Profile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NluAccessType")
        private String nluAccessType;

        @com.aliyun.core.annotation.NameInMap("NluEngine")
        private String nluEngine;

        private Profile(Builder builder) {
            this.apiKey = builder.apiKey;
            this.endpoint = builder.endpoint;
            this.name = builder.name;
            this.nluAccessType = builder.nluAccessType;
            this.nluEngine = builder.nluEngine;
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

        /**
         * @return nluAccessType
         */
        public String getNluAccessType() {
            return this.nluAccessType;
        }

        /**
         * @return nluEngine
         */
        public String getNluEngine() {
            return this.nluEngine;
        }

        public static final class Builder {
            private String apiKey; 
            private String endpoint; 
            private String name; 
            private String nluAccessType; 
            private String nluEngine; 

            private Builder() {
            } 

            private Builder(Profile model) {
                this.apiKey = model.apiKey;
                this.endpoint = model.endpoint;
                this.name = model.name;
                this.nluAccessType = model.nluAccessType;
                this.nluEngine = model.nluEngine;
            } 

            /**
             * <p>The API key.</p>
             * 
             * <strong>example:</strong>
             * <p>akm-93929110-d7c1-4014-8678-613aacd58fa2</p>
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * <p>The service endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>api.llm.enpoint.example.com</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The name of the configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>千问Omni</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The NLU access type.</p>
             * 
             * <strong>example:</strong>
             * <p>MANAGED</p>
             */
            public Builder nluAccessType(String nluAccessType) {
                this.nluAccessType = nluAccessType;
                return this;
            }

            /**
             * <p>The NLU engine.</p>
             * 
             * <strong>example:</strong>
             * <p>BEEBOT</p>
             */
            public Builder nluEngine(String nluEngine) {
                this.nluEngine = nluEngine;
                return this;
            }

            public Profile build() {
                return new Profile(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListLlmAccessProfilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListLlmAccessProfilesResponseBody</p>
     */
    public static class LlmAccessProfiles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessProfileId")
        private String accessProfileId;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private Profile profile;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private Long updatedTime;

        private LlmAccessProfiles(Builder builder) {
            this.accessProfileId = builder.accessProfileId;
            this.createdTime = builder.createdTime;
            this.instanceId = builder.instanceId;
            this.profile = builder.profile;
            this.updatedTime = builder.updatedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LlmAccessProfiles create() {
            return builder().build();
        }

        /**
         * @return accessProfileId
         */
        public String getAccessProfileId() {
            return this.accessProfileId;
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
            private Long createdTime; 
            private String instanceId; 
            private Profile profile; 
            private Long updatedTime; 

            private Builder() {
            } 

            private Builder(LlmAccessProfiles model) {
                this.accessProfileId = model.accessProfileId;
                this.createdTime = model.createdTime;
                this.instanceId = model.instanceId;
                this.profile = model.profile;
                this.updatedTime = model.updatedTime;
            } 

            /**
             * <p>The configuration ID.</p>
             * 
             * <strong>example:</strong>
             * <p>af81a389-91f0-4157-8d82-720edd02b66b</p>
             */
            public Builder accessProfileId(String accessProfileId) {
                this.accessProfileId = accessProfileId;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1747620752000</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>8fe2b8b1cdd446318610ccbc70bcfff0</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The parameter configuration.</p>
             */
            public Builder profile(Profile profile) {
                this.profile = profile;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>1768788798</p>
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            public LlmAccessProfiles build() {
                return new LlmAccessProfiles(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListLlmAccessProfilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListLlmAccessProfilesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LlmAccessProfiles")
        private java.util.List<LlmAccessProfiles> llmAccessProfiles;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.llmAccessProfiles = builder.llmAccessProfiles;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return llmAccessProfiles
         */
        public java.util.List<LlmAccessProfiles> getLlmAccessProfiles() {
            return this.llmAccessProfiles;
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

        public static final class Builder {
            private java.util.List<LlmAccessProfiles> llmAccessProfiles; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.llmAccessProfiles = model.llmAccessProfiles;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of third-party model configurations.</p>
             */
            public Builder llmAccessProfiles(java.util.List<LlmAccessProfiles> llmAccessProfiles) {
                this.llmAccessProfiles = llmAccessProfiles;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
