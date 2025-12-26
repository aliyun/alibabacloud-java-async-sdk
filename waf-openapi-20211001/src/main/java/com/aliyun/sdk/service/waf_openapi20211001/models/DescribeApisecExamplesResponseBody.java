// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeApisecExamplesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApisecExamplesResponseBody</p>
 */
public class DescribeApisecExamplesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Examples")
    private java.util.List<Examples> examples;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeApisecExamplesResponseBody(Builder builder) {
        this.examples = builder.examples;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApisecExamplesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return examples
     */
    public java.util.List<Examples> getExamples() {
        return this.examples;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Examples> examples; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeApisecExamplesResponseBody model) {
            this.examples = model.examples;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Examples.
         */
        public Builder examples(java.util.List<Examples> examples) {
            this.examples = examples;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeApisecExamplesResponseBody build() {
            return new DescribeApisecExamplesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApisecExamplesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApisecExamplesResponseBody</p>
     */
    public static class RequestSensitiveData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SensitiveCode")
        private String sensitiveCode;

        @com.aliyun.core.annotation.NameInMap("SensitiveDataList")
        private java.util.List<String> sensitiveDataList;

        private RequestSensitiveData(Builder builder) {
            this.sensitiveCode = builder.sensitiveCode;
            this.sensitiveDataList = builder.sensitiveDataList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestSensitiveData create() {
            return builder().build();
        }

        /**
         * @return sensitiveCode
         */
        public String getSensitiveCode() {
            return this.sensitiveCode;
        }

        /**
         * @return sensitiveDataList
         */
        public java.util.List<String> getSensitiveDataList() {
            return this.sensitiveDataList;
        }

        public static final class Builder {
            private String sensitiveCode; 
            private java.util.List<String> sensitiveDataList; 

            private Builder() {
            } 

            private Builder(RequestSensitiveData model) {
                this.sensitiveCode = model.sensitiveCode;
                this.sensitiveDataList = model.sensitiveDataList;
            } 

            /**
             * SensitiveCode.
             */
            public Builder sensitiveCode(String sensitiveCode) {
                this.sensitiveCode = sensitiveCode;
                return this;
            }

            /**
             * SensitiveDataList.
             */
            public Builder sensitiveDataList(java.util.List<String> sensitiveDataList) {
                this.sensitiveDataList = sensitiveDataList;
                return this;
            }

            public RequestSensitiveData build() {
                return new RequestSensitiveData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApisecExamplesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApisecExamplesResponseBody</p>
     */
    public static class ResponseSensitiveData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SensitiveCode")
        private String sensitiveCode;

        @com.aliyun.core.annotation.NameInMap("SensitiveDataList")
        private java.util.List<String> sensitiveDataList;

        private ResponseSensitiveData(Builder builder) {
            this.sensitiveCode = builder.sensitiveCode;
            this.sensitiveDataList = builder.sensitiveDataList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResponseSensitiveData create() {
            return builder().build();
        }

        /**
         * @return sensitiveCode
         */
        public String getSensitiveCode() {
            return this.sensitiveCode;
        }

        /**
         * @return sensitiveDataList
         */
        public java.util.List<String> getSensitiveDataList() {
            return this.sensitiveDataList;
        }

        public static final class Builder {
            private String sensitiveCode; 
            private java.util.List<String> sensitiveDataList; 

            private Builder() {
            } 

            private Builder(ResponseSensitiveData model) {
                this.sensitiveCode = model.sensitiveCode;
                this.sensitiveDataList = model.sensitiveDataList;
            } 

            /**
             * SensitiveCode.
             */
            public Builder sensitiveCode(String sensitiveCode) {
                this.sensitiveCode = sensitiveCode;
                return this;
            }

            /**
             * SensitiveDataList.
             */
            public Builder sensitiveDataList(java.util.List<String> sensitiveDataList) {
                this.sensitiveDataList = sensitiveDataList;
                return this;
            }

            public ResponseSensitiveData build() {
                return new ResponseSensitiveData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApisecExamplesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApisecExamplesResponseBody</p>
     */
    public static class Examples extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiUrl")
        private String apiUrl;

        @com.aliyun.core.annotation.NameInMap("PocPayload")
        private String pocPayload;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("Request")
        private String request;

        @com.aliyun.core.annotation.NameInMap("RequestSensitiveData")
        private java.util.List<RequestSensitiveData> requestSensitiveData;

        @com.aliyun.core.annotation.NameInMap("Response")
        private String response;

        @com.aliyun.core.annotation.NameInMap("ResponseSensitiveData")
        private java.util.List<ResponseSensitiveData> responseSensitiveData;

        private Examples(Builder builder) {
            this.apiUrl = builder.apiUrl;
            this.pocPayload = builder.pocPayload;
            this.protocol = builder.protocol;
            this.request = builder.request;
            this.requestSensitiveData = builder.requestSensitiveData;
            this.response = builder.response;
            this.responseSensitiveData = builder.responseSensitiveData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Examples create() {
            return builder().build();
        }

        /**
         * @return apiUrl
         */
        public String getApiUrl() {
            return this.apiUrl;
        }

        /**
         * @return pocPayload
         */
        public String getPocPayload() {
            return this.pocPayload;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return request
         */
        public String getRequest() {
            return this.request;
        }

        /**
         * @return requestSensitiveData
         */
        public java.util.List<RequestSensitiveData> getRequestSensitiveData() {
            return this.requestSensitiveData;
        }

        /**
         * @return response
         */
        public String getResponse() {
            return this.response;
        }

        /**
         * @return responseSensitiveData
         */
        public java.util.List<ResponseSensitiveData> getResponseSensitiveData() {
            return this.responseSensitiveData;
        }

        public static final class Builder {
            private String apiUrl; 
            private String pocPayload; 
            private String protocol; 
            private String request; 
            private java.util.List<RequestSensitiveData> requestSensitiveData; 
            private String response; 
            private java.util.List<ResponseSensitiveData> responseSensitiveData; 

            private Builder() {
            } 

            private Builder(Examples model) {
                this.apiUrl = model.apiUrl;
                this.pocPayload = model.pocPayload;
                this.protocol = model.protocol;
                this.request = model.request;
                this.requestSensitiveData = model.requestSensitiveData;
                this.response = model.response;
                this.responseSensitiveData = model.responseSensitiveData;
            } 

            /**
             * ApiUrl.
             */
            public Builder apiUrl(String apiUrl) {
                this.apiUrl = apiUrl;
                return this;
            }

            /**
             * PocPayload.
             */
            public Builder pocPayload(String pocPayload) {
                this.pocPayload = pocPayload;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * Request.
             */
            public Builder request(String request) {
                this.request = request;
                return this;
            }

            /**
             * RequestSensitiveData.
             */
            public Builder requestSensitiveData(java.util.List<RequestSensitiveData> requestSensitiveData) {
                this.requestSensitiveData = requestSensitiveData;
                return this;
            }

            /**
             * Response.
             */
            public Builder response(String response) {
                this.response = response;
                return this;
            }

            /**
             * ResponseSensitiveData.
             */
            public Builder responseSensitiveData(java.util.List<ResponseSensitiveData> responseSensitiveData) {
                this.responseSensitiveData = responseSensitiveData;
                return this;
            }

            public Examples build() {
                return new Examples(this);
            } 

        } 

    }
}
