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
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
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
             * ApiType.
             */
            public Builder apiType(String apiType) {
                this.apiType = apiType;
                return this;
            }

            /**
             * BaseUrl.
             */
            public Builder baseUrl(String baseUrl) {
                this.baseUrl = baseUrl;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ProviderUrl.
             */
            public Builder providerUrl(String providerUrl) {
                this.providerUrl = providerUrl;
                return this;
            }

            /**
             * Tags.
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Endpoints.
             */
            public Builder endpoints(java.util.List<Endpoints> endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * ProviderName.
             */
            public Builder providerName(String providerName) {
                this.providerName = providerName;
                return this;
            }

            /**
             * ProviderUrl.
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
