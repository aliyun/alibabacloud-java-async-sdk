// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListModelProviderEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>ListModelProviderEndpointsResponseBody</p>
 */
public class ListModelProviderEndpointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListModelProviderEndpointsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelProviderEndpointsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListModelProviderEndpointsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data object.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID, which uniquely identifies the request.</p>
         * 
         * <strong>example:</strong>
         * <p>XXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListModelProviderEndpointsResponseBody build() {
            return new ListModelProviderEndpointsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListModelProviderEndpointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelProviderEndpointsResponseBody</p>
     */
    public static class Endpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiType")
        private String apiType;

        @com.aliyun.core.annotation.NameInMap("BaseUrl")
        private String baseUrl;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProviderUrl")
        private String providerUrl;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<String> tags;

        private Endpoints(Builder builder) {
            this.apiType = builder.apiType;
            this.baseUrl = builder.baseUrl;
            this.description = builder.description;
            this.name = builder.name;
            this.providerUrl = builder.providerUrl;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return apiType
         */
        public String getApiType() {
            return this.apiType;
        }

        /**
         * @return baseUrl
         */
        public String getBaseUrl() {
            return this.baseUrl;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return providerUrl
         */
        public String getProviderUrl() {
            return this.providerUrl;
        }

        /**
         * @return tags
         */
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String apiType; 
            private String baseUrl; 
            private String description; 
            private String name; 
            private String providerUrl; 
            private java.util.List<String> tags; 

            private Builder() {
            } 

            private Builder(Endpoints model) {
                this.apiType = model.apiType;
                this.baseUrl = model.baseUrl;
                this.description = model.description;
                this.name = model.name;
                this.providerUrl = model.providerUrl;
                this.tags = model.tags;
            } 

            /**
             * <p>The API compatibility type, such as openai-compatible or anthropic-compatible.</p>
             * 
             * <strong>example:</strong>
             * <p>openai-compatible</p>
             */
            public Builder apiType(String apiType) {
                this.apiType = apiType;
                return this;
            }

            /**
             * <p>The API base URL, such as <a href="https://coding.dashscope.aliyuncs.com/v1">https://coding.dashscope.aliyuncs.com/v1</a>.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://coding.dashscope.aliyuncs.com/v1">https://coding.dashscope.aliyuncs.com/v1</a></p>
             */
            public Builder baseUrl(String baseUrl) {
                this.baseUrl = baseUrl;
                return this;
            }

            /**
             * <p>The endpoint description, such as Coding Plan - OpenAI compatible protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>Coding Plan - OpenAI</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The endpoint identifier name, such as coding-openai or cn-beijing.</p>
             * 
             * <strong>example:</strong>
             * <p>coding-openai</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The provider URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://test">https://test</a></p>
             */
            public Builder providerUrl(String providerUrl) {
                this.providerUrl = providerUrl;
                return this;
            }

            /**
             * <p>The list of tags used for categorization and filtering, such as coding-plan, on-demand, or cn-beijing.</p>
             */
            public Builder tags(java.util.List<String> tags) {
                this.tags = tags;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListModelProviderEndpointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelProviderEndpointsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Endpoints")
        private java.util.List<Endpoints> endpoints;

        @com.aliyun.core.annotation.NameInMap("ProviderName")
        private String providerName;

        @com.aliyun.core.annotation.NameInMap("ProviderUrl")
        private String providerUrl;

        private Data(Builder builder) {
            this.description = builder.description;
            this.endpoints = builder.endpoints;
            this.providerName = builder.providerName;
            this.providerUrl = builder.providerUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endpoints
         */
        public java.util.List<Endpoints> getEndpoints() {
            return this.endpoints;
        }

        /**
         * @return providerName
         */
        public String getProviderName() {
            return this.providerName;
        }

        /**
         * @return providerUrl
         */
        public String getProviderUrl() {
            return this.providerUrl;
        }

        public static final class Builder {
            private String description; 
            private java.util.List<Endpoints> endpoints; 
            private String providerName; 
            private String providerUrl; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.description = model.description;
                this.endpoints = model.endpoints;
                this.providerName = model.providerName;
                this.providerUrl = model.providerUrl;
            } 

            /**
             * <p>The provider description, such as Alibaba Cloud Bailian.</p>
             * 
             * <strong>example:</strong>
             * <p>Qwen Plus series models</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The list of all endpoints under the provider.</p>
             */
            public Builder endpoints(java.util.List<Endpoints> endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * <p>The provider name, such as bailian or moonshot.</p>
             * 
             * <strong>example:</strong>
             * <p>bailian</p>
             */
            public Builder providerName(String providerName) {
                this.providerName = providerName;
                return this;
            }

            /**
             * <p>The provider website URL, which is used to direct users to obtain an API key.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://test">https://test</a></p>
             */
            public Builder providerUrl(String providerUrl) {
                this.providerUrl = providerUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
