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
 * {@link DescribeApisecApiResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApisecApiResourcesResponseBody</p>
 */
public class DescribeApisecApiResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeApisecApiResourcesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApisecApiResourcesResponseBody create() {
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeApisecApiResourcesResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The API assets.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2EFCFE18-78F8-5079-B312-07***48B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeApisecApiResourcesResponseBody build() {
            return new DescribeApisecApiResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApisecApiResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApisecApiResourcesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AbnormalNum")
        private Long abnormalNum;

        @com.aliyun.core.annotation.NameInMap("AllCnt")
        private Long allCnt;

        @com.aliyun.core.annotation.NameInMap("ApiFormat")
        private String apiFormat;

        @com.aliyun.core.annotation.NameInMap("ApiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("ApiInfo")
        private String apiInfo;

        @com.aliyun.core.annotation.NameInMap("ApiMethod")
        private String apiMethod;

        @com.aliyun.core.annotation.NameInMap("ApiSensitive")
        private String apiSensitive;

        @com.aliyun.core.annotation.NameInMap("ApiSensitiveRequest")
        private String apiSensitiveRequest;

        @com.aliyun.core.annotation.NameInMap("ApiSensitiveResponse")
        private String apiSensitiveResponse;

        @com.aliyun.core.annotation.NameInMap("ApiStatus")
        private String apiStatus;

        @com.aliyun.core.annotation.NameInMap("ApiTag")
        private String apiTag;

        @com.aliyun.core.annotation.NameInMap("ApiType")
        private String apiType;

        @com.aliyun.core.annotation.NameInMap("AuthFlag")
        private String authFlag;

        @com.aliyun.core.annotation.NameInMap("BotCnt")
        private Long botCnt;

        @com.aliyun.core.annotation.NameInMap("CrossBorderCnt")
        private Long crossBorderCnt;

        @com.aliyun.core.annotation.NameInMap("EventNum")
        private Long eventNum;

        @com.aliyun.core.annotation.NameInMap("Examples")
        private java.util.List<String> examples;

        @com.aliyun.core.annotation.NameInMap("FarthestTs")
        private Long farthestTs;

        @com.aliyun.core.annotation.NameInMap("Follow")
        private Integer follow;

        @com.aliyun.core.annotation.NameInMap("LastestTs")
        private Long lastestTs;

        @com.aliyun.core.annotation.NameInMap("MatchedHost")
        private String matchedHost;

        @com.aliyun.core.annotation.NameInMap("Note")
        private String note;

        @com.aliyun.core.annotation.NameInMap("Resources")
        private java.util.List<String> resources;

        private Data(Builder builder) {
            this.abnormalNum = builder.abnormalNum;
            this.allCnt = builder.allCnt;
            this.apiFormat = builder.apiFormat;
            this.apiId = builder.apiId;
            this.apiInfo = builder.apiInfo;
            this.apiMethod = builder.apiMethod;
            this.apiSensitive = builder.apiSensitive;
            this.apiSensitiveRequest = builder.apiSensitiveRequest;
            this.apiSensitiveResponse = builder.apiSensitiveResponse;
            this.apiStatus = builder.apiStatus;
            this.apiTag = builder.apiTag;
            this.apiType = builder.apiType;
            this.authFlag = builder.authFlag;
            this.botCnt = builder.botCnt;
            this.crossBorderCnt = builder.crossBorderCnt;
            this.eventNum = builder.eventNum;
            this.examples = builder.examples;
            this.farthestTs = builder.farthestTs;
            this.follow = builder.follow;
            this.lastestTs = builder.lastestTs;
            this.matchedHost = builder.matchedHost;
            this.note = builder.note;
            this.resources = builder.resources;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return abnormalNum
         */
        public Long getAbnormalNum() {
            return this.abnormalNum;
        }

        /**
         * @return allCnt
         */
        public Long getAllCnt() {
            return this.allCnt;
        }

        /**
         * @return apiFormat
         */
        public String getApiFormat() {
            return this.apiFormat;
        }

        /**
         * @return apiId
         */
        public String getApiId() {
            return this.apiId;
        }

        /**
         * @return apiInfo
         */
        public String getApiInfo() {
            return this.apiInfo;
        }

        /**
         * @return apiMethod
         */
        public String getApiMethod() {
            return this.apiMethod;
        }

        /**
         * @return apiSensitive
         */
        public String getApiSensitive() {
            return this.apiSensitive;
        }

        /**
         * @return apiSensitiveRequest
         */
        public String getApiSensitiveRequest() {
            return this.apiSensitiveRequest;
        }

        /**
         * @return apiSensitiveResponse
         */
        public String getApiSensitiveResponse() {
            return this.apiSensitiveResponse;
        }

        /**
         * @return apiStatus
         */
        public String getApiStatus() {
            return this.apiStatus;
        }

        /**
         * @return apiTag
         */
        public String getApiTag() {
            return this.apiTag;
        }

        /**
         * @return apiType
         */
        public String getApiType() {
            return this.apiType;
        }

        /**
         * @return authFlag
         */
        public String getAuthFlag() {
            return this.authFlag;
        }

        /**
         * @return botCnt
         */
        public Long getBotCnt() {
            return this.botCnt;
        }

        /**
         * @return crossBorderCnt
         */
        public Long getCrossBorderCnt() {
            return this.crossBorderCnt;
        }

        /**
         * @return eventNum
         */
        public Long getEventNum() {
            return this.eventNum;
        }

        /**
         * @return examples
         */
        public java.util.List<String> getExamples() {
            return this.examples;
        }

        /**
         * @return farthestTs
         */
        public Long getFarthestTs() {
            return this.farthestTs;
        }

        /**
         * @return follow
         */
        public Integer getFollow() {
            return this.follow;
        }

        /**
         * @return lastestTs
         */
        public Long getLastestTs() {
            return this.lastestTs;
        }

        /**
         * @return matchedHost
         */
        public String getMatchedHost() {
            return this.matchedHost;
        }

        /**
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        /**
         * @return resources
         */
        public java.util.List<String> getResources() {
            return this.resources;
        }

        public static final class Builder {
            private Long abnormalNum; 
            private Long allCnt; 
            private String apiFormat; 
            private String apiId; 
            private String apiInfo; 
            private String apiMethod; 
            private String apiSensitive; 
            private String apiSensitiveRequest; 
            private String apiSensitiveResponse; 
            private String apiStatus; 
            private String apiTag; 
            private String apiType; 
            private String authFlag; 
            private Long botCnt; 
            private Long crossBorderCnt; 
            private Long eventNum; 
            private java.util.List<String> examples; 
            private Long farthestTs; 
            private Integer follow; 
            private Long lastestTs; 
            private String matchedHost; 
            private String note; 
            private java.util.List<String> resources; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.abnormalNum = model.abnormalNum;
                this.allCnt = model.allCnt;
                this.apiFormat = model.apiFormat;
                this.apiId = model.apiId;
                this.apiInfo = model.apiInfo;
                this.apiMethod = model.apiMethod;
                this.apiSensitive = model.apiSensitive;
                this.apiSensitiveRequest = model.apiSensitiveRequest;
                this.apiSensitiveResponse = model.apiSensitiveResponse;
                this.apiStatus = model.apiStatus;
                this.apiTag = model.apiTag;
                this.apiType = model.apiType;
                this.authFlag = model.authFlag;
                this.botCnt = model.botCnt;
                this.crossBorderCnt = model.crossBorderCnt;
                this.eventNum = model.eventNum;
                this.examples = model.examples;
                this.farthestTs = model.farthestTs;
                this.follow = model.follow;
                this.lastestTs = model.lastestTs;
                this.matchedHost = model.matchedHost;
                this.note = model.note;
                this.resources = model.resources;
            } 

            /**
             * <p>The number of API-related risks.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder abnormalNum(Long abnormalNum) {
                this.abnormalNum = abnormalNum;
                return this;
            }

            /**
             * <p>The total number of calls to this API in the previous 30 days.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder allCnt(Long allCnt) {
                this.allCnt = allCnt;
                return this;
            }

            /**
             * <p>The API.</p>
             * 
             * <strong>example:</strong>
             * <p>/v1/etl/finddatabyvid</p>
             */
            public Builder apiFormat(String apiFormat) {
                this.apiFormat = apiFormat;
                return this;
            }

            /**
             * <p>The ID of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>867ade***24ee6e205b8da82b8f84</p>
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The API-related information. The value of this parameter is a JSON string that contains multiple parameters. The value includes the following parameters:</p>
             * <ul>
             * <li><strong>param_num</strong>: the number of API parameters</li>
             * <li><strong>request_method</strong>: the request method</li>
             * <li><strong>protocol</strong>: the request protocol</li>
             * <li><strong>api_url</strong>: the request URL</li>
             * <li><strong>poc_payload</strong>: the request</li>
             * <li><strong>request</strong>: the sample request</li>
             * <li><strong>response</strong>: the sample response</li>
             * <li><strong>param</strong>: the request parameters</li>
             * </ul>
             */
            public Builder apiInfo(String apiInfo) {
                this.apiInfo = apiInfo;
                return this;
            }

            /**
             * <p>The request method of the API. Valid values:</p>
             * <ul>
             * <li><strong>GET</strong></li>
             * <li><strong>POST</strong></li>
             * <li><strong>HEAD</strong></li>
             * <li><strong>PUT</strong></li>
             * <li><strong>DELETE</strong></li>
             * <li><strong>CONNECT</strong></li>
             * <li><strong>PATCH</strong></li>
             * <li><strong>OPTIONS</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>POST</p>
             */
            public Builder apiMethod(String apiMethod) {
                this.apiMethod = apiMethod;
                return this;
            }

            /**
             * <p>The API-related sensitive information. The value of this parameter is a JSON string that contains multiple parameters. The value includes the following parameters:</p>
             * <ul>
             * <li><strong>request_sensitive_list</strong>: the sensitive data type in the request</li>
             * <li><strong>response_sensitive_list</strong>: the sensitive data type in the response</li>
             * <li><strong>sensitive_list</strong>: sensitive data types</li>
             * <li><strong>sensitive_level</strong>: sensitivity level</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;sensitive_list&quot;: [&quot;1003&quot;,&quot;1005&quot;],
             *     &quot;sensitive_level&quot;: &quot;L2&quot;,
             *     &quot;request_sensitive_list&quot;: [&quot;1003&quot;],
             *     &quot;response_sensitive_list&quot;: [&quot;1005&quot;]
             * }</p>
             */
            public Builder apiSensitive(String apiSensitive) {
                this.apiSensitive = apiSensitive;
                return this;
            }

            /**
             * <p>The sensitive data type in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;1002&quot;,&quot;1005&quot;]</p>
             */
            public Builder apiSensitiveRequest(String apiSensitiveRequest) {
                this.apiSensitiveRequest = apiSensitiveRequest;
                return this;
            }

            /**
             * <p>The sensitive data type in the response.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;1002&quot;,&quot;1005&quot;]</p>
             */
            public Builder apiSensitiveResponse(String apiSensitiveResponse) {
                this.apiSensitiveResponse = apiSensitiveResponse;
                return this;
            }

            /**
             * <p>The API status. Valid values:</p>
             * <ul>
             * <li><strong>NewbornInterface</strong>: The API is newly added.</li>
             * <li><strong>OfflineInterface</strong>: The API is inactive.</li>
             * <li><strong>normal</strong>: The API is normal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NewbornInterface</p>
             */
            public Builder apiStatus(String apiStatus) {
                this.apiStatus = apiStatus;
                return this;
            }

            /**
             * <p>The business purpose of the API.</p>
             * <blockquote>
             * <p> You can call the <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> operation to query the business purposes of APIs.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>SendMail</p>
             */
            public Builder apiTag(String apiTag) {
                this.apiTag = apiTag;
                return this;
            }

            /**
             * <p>The service object. Valid values:</p>
             * <ul>
             * <li><strong>PublicAPI</strong>: public services</li>
             * <li><strong>ThirdpartAPI</strong>: cooperation with third-party partners</li>
             * <li><strong>InternalAPI</strong>: internal office</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PublicAPI</p>
             */
            public Builder apiType(String apiType) {
                this.apiType = apiType;
                return this;
            }

            /**
             * <p>Indicates whether authentication is required. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Authentication is required.</li>
             * <li><strong>1</strong>: Authentication is not required.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder authFlag(String authFlag) {
                this.authFlag = authFlag;
                return this;
            }

            /**
             * <p>The number of bot-initiated requests in the previous 30 days.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder botCnt(Long botCnt) {
                this.botCnt = botCnt;
                return this;
            }

            /**
             * <p>The number of the cross-border requests in the previous 30 days.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder crossBorderCnt(Long crossBorderCnt) {
                this.crossBorderCnt = crossBorderCnt;
                return this;
            }

            /**
             * <p>The number of API-related security events.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder eventNum(Long eventNum) {
                this.eventNum = eventNum;
                return this;
            }

            /**
             * <p>The sample APIs.</p>
             */
            public Builder examples(java.util.List<String> examples) {
                this.examples = examples;
                return this;
            }

            /**
             * <p>The time when the API asset was first detected. This value is a UNIX timestamp in UTC. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1683388800</p>
             */
            public Builder farthestTs(Long farthestTs) {
                this.farthestTs = farthestTs;
                return this;
            }

            /**
             * <p>Specifies whether to follow the API. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: follows the API.</li>
             * <li><strong>0</strong>: does not follow the API.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder follow(Integer follow) {
                this.follow = follow;
                return this;
            }

            /**
             * <p>The time at which the API was last accessed. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1683388800</p>
             */
            public Builder lastestTs(Long lastestTs) {
                this.lastestTs = lastestTs;
                return this;
            }

            /**
             * <p>The domain name or IP address of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>a.aliyun.com</p>
             */
            public Builder matchedHost(String matchedHost) {
                this.matchedHost = matchedHost;
                return this;
            }

            /**
             * <p>The remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>Password changed</p>
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * <p>The list of protection objects corresponding to this asset.</p>
             */
            public Builder resources(java.util.List<String> resources) {
                this.resources = resources;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
