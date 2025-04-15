// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link ListApiDestinationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListApiDestinationsResponseBody</p>
 */
public class ListApiDestinationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListApiDestinationsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApiDestinationsResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListApiDestinationsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned response code. The value Success indicates that the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message. If the request is successful, success is returned. If the request failed, an error code is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>96D7C0AB-DCE5-5E82-96B8-4725E1706BB1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListApiDestinationsResponseBody build() {
            return new ListApiDestinationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApiDestinationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListApiDestinationsResponseBody</p>
     */
    public static class HttpApiParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        private HttpApiParameters(Builder builder) {
            this.endpoint = builder.endpoint;
            this.method = builder.method;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpApiParameters create() {
            return builder().build();
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        public static final class Builder {
            private String endpoint; 
            private String method; 

            private Builder() {
            } 

            private Builder(HttpApiParameters model) {
                this.endpoint = model.endpoint;
                this.method = model.method;
            } 

            /**
             * <p>The endpoint of the API destination.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://127.0.0.1:8001/api">http://127.0.0.1:8001/api</a></p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The HTTP request method. Valid values:</p>
             * <ul>
             * <li><p>POST</p>
             * </li>
             * <li><p>GET</p>
             * </li>
             * <li><p>DELETE</p>
             * </li>
             * <li><p>PUT</p>
             * </li>
             * <li><p>HEAD</p>
             * </li>
             * <li><p>TRACE</p>
             * </li>
             * <li><p>PATCH</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>POST</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            public HttpApiParameters build() {
                return new HttpApiParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApiDestinationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListApiDestinationsResponseBody</p>
     */
    public static class ApiDestinations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiDestinationName")
        private String apiDestinationName;

        @com.aliyun.core.annotation.NameInMap("ConnectionName")
        private String connectionName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("HttpApiParameters")
        private HttpApiParameters httpApiParameters;

        private ApiDestinations(Builder builder) {
            this.apiDestinationName = builder.apiDestinationName;
            this.connectionName = builder.connectionName;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.httpApiParameters = builder.httpApiParameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiDestinations create() {
            return builder().build();
        }

        /**
         * @return apiDestinationName
         */
        public String getApiDestinationName() {
            return this.apiDestinationName;
        }

        /**
         * @return connectionName
         */
        public String getConnectionName() {
            return this.connectionName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return httpApiParameters
         */
        public HttpApiParameters getHttpApiParameters() {
            return this.httpApiParameters;
        }

        public static final class Builder {
            private String apiDestinationName; 
            private String connectionName; 
            private String description; 
            private Long gmtCreate; 
            private HttpApiParameters httpApiParameters; 

            private Builder() {
            } 

            private Builder(ApiDestinations model) {
                this.apiDestinationName = model.apiDestinationName;
                this.connectionName = model.connectionName;
                this.description = model.description;
                this.gmtCreate = model.gmtCreate;
                this.httpApiParameters = model.httpApiParameters;
            } 

            /**
             * <p>The name of the API destination.</p>
             * 
             * <strong>example:</strong>
             * <p>api-destination-2</p>
             */
            public Builder apiDestinationName(String apiDestinationName) {
                this.apiDestinationName = apiDestinationName;
                return this;
            }

            /**
             * <p>The connection name.</p>
             * 
             * <strong>example:</strong>
             * <p>connection-name</p>
             */
            public Builder connectionName(String connectionName) {
                this.connectionName = connectionName;
                return this;
            }

            /**
             * <p>The description of the connection.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the API destination was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1665223213000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The request parameters that are configured for the API destination.</p>
             */
            public Builder httpApiParameters(HttpApiParameters httpApiParameters) {
                this.httpApiParameters = httpApiParameters;
                return this;
            }

            public ApiDestinations build() {
                return new ApiDestinations(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApiDestinationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListApiDestinationsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiDestinations")
        private java.util.List<ApiDestinations> apiDestinations;

        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Float maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Float total;

        private Data(Builder builder) {
            this.apiDestinations = builder.apiDestinations;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apiDestinations
         */
        public java.util.List<ApiDestinations> getApiDestinations() {
            return this.apiDestinations;
        }

        /**
         * @return maxResults
         */
        public Float getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return total
         */
        public Float getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<ApiDestinations> apiDestinations; 
            private Float maxResults; 
            private String nextToken; 
            private Float total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.apiDestinations = model.apiDestinations;
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
                this.total = model.total;
            } 

            /**
             * <p>The API destinations.</p>
             */
            public Builder apiDestinations(java.util.List<ApiDestinations> apiDestinations) {
                this.apiDestinations = apiDestinations;
                return this;
            }

            /**
             * <p>The maximum number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxResults(Float maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * <p>If excess return values exist, this parameter is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder total(Float total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
