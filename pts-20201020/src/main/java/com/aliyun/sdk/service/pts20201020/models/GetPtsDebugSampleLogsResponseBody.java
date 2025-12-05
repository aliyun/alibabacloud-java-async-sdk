// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

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
 * {@link GetPtsDebugSampleLogsResponseBody} extends {@link TeaModel}
 *
 * <p>GetPtsDebugSampleLogsResponseBody</p>
 */
public class GetPtsDebugSampleLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SamplingLogs")
    private java.util.List<SamplingLogs> samplingLogs;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private GetPtsDebugSampleLogsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.samplingLogs = builder.samplingLogs;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPtsDebugSampleLogsResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return samplingLogs
     */
    public java.util.List<SamplingLogs> getSamplingLogs() {
        return this.samplingLogs;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<SamplingLogs> samplingLogs; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(GetPtsDebugSampleLogsResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.samplingLogs = model.samplingLogs;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The system status code. If the operation is successful, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>4001</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message. If the operation is successful, this parameter is not returned.</p>
         */
        public Builder message(String message) {
            this.message = message;
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A8E16480-15C1-555A-922F-B736A005E52D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The sampling logs.</p>
         */
        public Builder samplingLogs(java.util.List<SamplingLogs> samplingLogs) {
            this.samplingLogs = samplingLogs;
            return this;
        }

        /**
         * <p>Indicates whether the operation is successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetPtsDebugSampleLogsResponseBody build() {
            return new GetPtsDebugSampleLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPtsDebugSampleLogsResponseBody} extends {@link TeaModel}
     *
     * <p>GetPtsDebugSampleLogsResponseBody</p>
     */
    public static class SamplingLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChainId")
        private String chainId;

        @com.aliyun.core.annotation.NameInMap("ChainName")
        private String chainName;

        @com.aliyun.core.annotation.NameInMap("CheckResult")
        private String checkResult;

        @com.aliyun.core.annotation.NameInMap("ExportConfig")
        private String exportConfig;

        @com.aliyun.core.annotation.NameInMap("ExportContent")
        private String exportContent;

        @com.aliyun.core.annotation.NameInMap("HttpRequestBody")
        private String httpRequestBody;

        @com.aliyun.core.annotation.NameInMap("HttpRequestHeaders")
        private String httpRequestHeaders;

        @com.aliyun.core.annotation.NameInMap("HttpRequestMethod")
        private String httpRequestMethod;

        @com.aliyun.core.annotation.NameInMap("HttpRequestUrl")
        private String httpRequestUrl;

        @com.aliyun.core.annotation.NameInMap("HttpResponseBody")
        private String httpResponseBody;

        @com.aliyun.core.annotation.NameInMap("HttpResponseFailMsg")
        private String httpResponseFailMsg;

        @com.aliyun.core.annotation.NameInMap("HttpResponseHeaders")
        private String httpResponseHeaders;

        @com.aliyun.core.annotation.NameInMap("HttpResponseStatus")
        private String httpResponseStatus;

        @com.aliyun.core.annotation.NameInMap("HttpStartTime")
        private Long httpStartTime;

        @com.aliyun.core.annotation.NameInMap("HttpTiming")
        private String httpTiming;

        @com.aliyun.core.annotation.NameInMap("ImportContent")
        private String importContent;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("Rt")
        private String rt;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        private SamplingLogs(Builder builder) {
            this.chainId = builder.chainId;
            this.chainName = builder.chainName;
            this.checkResult = builder.checkResult;
            this.exportConfig = builder.exportConfig;
            this.exportContent = builder.exportContent;
            this.httpRequestBody = builder.httpRequestBody;
            this.httpRequestHeaders = builder.httpRequestHeaders;
            this.httpRequestMethod = builder.httpRequestMethod;
            this.httpRequestUrl = builder.httpRequestUrl;
            this.httpResponseBody = builder.httpResponseBody;
            this.httpResponseFailMsg = builder.httpResponseFailMsg;
            this.httpResponseHeaders = builder.httpResponseHeaders;
            this.httpResponseStatus = builder.httpResponseStatus;
            this.httpStartTime = builder.httpStartTime;
            this.httpTiming = builder.httpTiming;
            this.importContent = builder.importContent;
            this.nodeId = builder.nodeId;
            this.rt = builder.rt;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SamplingLogs create() {
            return builder().build();
        }

        /**
         * @return chainId
         */
        public String getChainId() {
            return this.chainId;
        }

        /**
         * @return chainName
         */
        public String getChainName() {
            return this.chainName;
        }

        /**
         * @return checkResult
         */
        public String getCheckResult() {
            return this.checkResult;
        }

        /**
         * @return exportConfig
         */
        public String getExportConfig() {
            return this.exportConfig;
        }

        /**
         * @return exportContent
         */
        public String getExportContent() {
            return this.exportContent;
        }

        /**
         * @return httpRequestBody
         */
        public String getHttpRequestBody() {
            return this.httpRequestBody;
        }

        /**
         * @return httpRequestHeaders
         */
        public String getHttpRequestHeaders() {
            return this.httpRequestHeaders;
        }

        /**
         * @return httpRequestMethod
         */
        public String getHttpRequestMethod() {
            return this.httpRequestMethod;
        }

        /**
         * @return httpRequestUrl
         */
        public String getHttpRequestUrl() {
            return this.httpRequestUrl;
        }

        /**
         * @return httpResponseBody
         */
        public String getHttpResponseBody() {
            return this.httpResponseBody;
        }

        /**
         * @return httpResponseFailMsg
         */
        public String getHttpResponseFailMsg() {
            return this.httpResponseFailMsg;
        }

        /**
         * @return httpResponseHeaders
         */
        public String getHttpResponseHeaders() {
            return this.httpResponseHeaders;
        }

        /**
         * @return httpResponseStatus
         */
        public String getHttpResponseStatus() {
            return this.httpResponseStatus;
        }

        /**
         * @return httpStartTime
         */
        public Long getHttpStartTime() {
            return this.httpStartTime;
        }

        /**
         * @return httpTiming
         */
        public String getHttpTiming() {
            return this.httpTiming;
        }

        /**
         * @return importContent
         */
        public String getImportContent() {
            return this.importContent;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return rt
         */
        public String getRt() {
            return this.rt;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String chainId; 
            private String chainName; 
            private String checkResult; 
            private String exportConfig; 
            private String exportContent; 
            private String httpRequestBody; 
            private String httpRequestHeaders; 
            private String httpRequestMethod; 
            private String httpRequestUrl; 
            private String httpResponseBody; 
            private String httpResponseFailMsg; 
            private String httpResponseHeaders; 
            private String httpResponseStatus; 
            private Long httpStartTime; 
            private String httpTiming; 
            private String importContent; 
            private String nodeId; 
            private String rt; 
            private Long timestamp; 

            private Builder() {
            } 

            private Builder(SamplingLogs model) {
                this.chainId = model.chainId;
                this.chainName = model.chainName;
                this.checkResult = model.checkResult;
                this.exportConfig = model.exportConfig;
                this.exportContent = model.exportContent;
                this.httpRequestBody = model.httpRequestBody;
                this.httpRequestHeaders = model.httpRequestHeaders;
                this.httpRequestMethod = model.httpRequestMethod;
                this.httpRequestUrl = model.httpRequestUrl;
                this.httpResponseBody = model.httpResponseBody;
                this.httpResponseFailMsg = model.httpResponseFailMsg;
                this.httpResponseHeaders = model.httpResponseHeaders;
                this.httpResponseStatus = model.httpResponseStatus;
                this.httpStartTime = model.httpStartTime;
                this.httpTiming = model.httpTiming;
                this.importContent = model.importContent;
                this.nodeId = model.nodeId;
                this.rt = model.rt;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The ID of the session.</p>
             * 
             * <strong>example:</strong>
             * <p>65354719</p>
             */
            public Builder chainId(String chainId) {
                this.chainId = chainId;
                return this;
            }

            /**
             * <p>The name of the session.</p>
             */
            public Builder chainName(String chainName) {
                this.chainName = chainName;
                return this;
            }

            /**
             * <p>The assertion check result.</p>
             */
            public Builder checkResult(String checkResult) {
                this.checkResult = checkResult;
                return this;
            }

            /**
             * <p>The parameter export configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;skuId&quot;:&quot;{R:json@$.page.list[0].skuId}&quot;}</p>
             */
            public Builder exportConfig(String exportConfig) {
                this.exportConfig = exportConfig;
                return this;
            }

            /**
             * <p>The exported parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;skuId&quot;:&quot;1&quot;}</p>
             */
            public Builder exportContent(String exportContent) {
                this.exportContent = exportContent;
                return this;
            }

            /**
             * <p>The body of the request.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;loginacct&quot;:&quot;acce&quot;}</p>
             */
            public Builder httpRequestBody(String httpRequestBody) {
                this.httpRequestBody = httpRequestBody;
                return this;
            }

            /**
             * <p>The request headers.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;name&quot;:&quot;v2&quot;,&quot;sensitive&quot;:false,&quot;value&quot;:&quot;1&quot;},{&quot;name&quot;:&quot;x-pts-test&quot;,&quot;sensitive&quot;:false,&quot;value&quot;:&quot;2&quot;}]</p>
             */
            public Builder httpRequestHeaders(String httpRequestHeaders) {
                this.httpRequestHeaders = httpRequestHeaders;
                return this;
            }

            /**
             * <p>The request method.</p>
             * 
             * <strong>example:</strong>
             * <p>GET</p>
             */
            public Builder httpRequestMethod(String httpRequestMethod) {
                this.httpRequestMethod = httpRequestMethod;
                return this;
            }

            /**
             * <p>The endpoint that specifies where the request is directed.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">http://www.example.com</a></p>
             */
            public Builder httpRequestUrl(String httpRequestUrl) {
                this.httpRequestUrl = httpRequestUrl;
                return this;
            }

            /**
             * <p>The response body.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;timestamp&quot;:1679903049155,&quot;status&quot;:404,&quot;error&quot;:&quot;Not Found&quot;,&quot;message&quot;:&quot;No message available&quot;,&quot;path&quot;:&quot;/&quot;}</p>
             */
            public Builder httpResponseBody(String httpResponseBody) {
                this.httpResponseBody = httpResponseBody;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder httpResponseFailMsg(String httpResponseFailMsg) {
                this.httpResponseFailMsg = httpResponseFailMsg;
                return this;
            }

            /**
             * <p>The response headers.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;valuePos&quot;:18,&quot;name&quot;:&quot;transfer-encoding&quot;,&quot;buffer&quot;:{&quot;empty&quot;:false,&quot;full&quot;:false},&quot;sensitive&quot;:false,&quot;value&quot;:&quot;chunked&quot;},{&quot;valuePos&quot;:13,&quot;name&quot;:&quot;Content-Type&quot;,&quot;buffer&quot;:{&quot;empty&quot;:false,&quot;full&quot;:false},&quot;sensitive&quot;:false,&quot;value&quot;:&quot;application/json;charset=UTF-8&quot;},{&quot;valuePos&quot;:5,&quot;name&quot;:&quot;Date&quot;,&quot;buffer&quot;:{&quot;empty&quot;:false,&quot;full&quot;:false},&quot;sensitive&quot;:false,&quot;value&quot;:&quot;Mon, 27 Mar 2023 07:44:08 GMT&quot;}]</p>
             */
            public Builder httpResponseHeaders(String httpResponseHeaders) {
                this.httpResponseHeaders = httpResponseHeaders;
                return this;
            }

            /**
             * <p>The HTTP status code.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder httpResponseStatus(String httpResponseStatus) {
                this.httpResponseStatus = httpResponseStatus;
                return this;
            }

            /**
             * <p>The time when the request was sent.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder httpStartTime(Long httpStartTime) {
                this.httpStartTime = httpStartTime;
                return this;
            }

            /**
             * <p>The HTTP timing information in a waterfall format.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;traceId&quot;:&quot;0:1:10a94f66pts-2069351-allsparktask&quot;,&quot;requests&quot;:[{&quot;lease&quot;:{&quot;conn&quot;:{&quot;duration&quot;:-1,&quot;finish&quot;:-1,&quot;operation&quot;:&quot;conn&quot;,&quot;start&quot;:-1},&quot;dns&quot;:{&quot;duration&quot;:-1,&quot;finish&quot;:-1,&quot;operation&quot;:&quot;dns&quot;,&quot;start&quot;:-1},&quot;duration&quot;:-1,&quot;finish&quot;:-1,&quot;operation&quot;:&quot;lease&quot;,&quot;start&quot;:32277914755},&quot;recv&quot;:{&quot;duration&quot;:225975,&quot;finish&quot;:32283700284,&quot;message&quot;:&quot;&quot;,&quot;operation&quot;:&quot;recv&quot;,&quot;start&quot;:32283474309},&quot;sent&quot;:{&quot;duration&quot;:594179,&quot;finish&quot;:32278776504,&quot;message&quot;:&quot;&quot;,&quot;operation&quot;:&quot;sent&quot;,&quot;start&quot;:32278182325},&quot;tag&quot;:&quot;GET <a href="http://tomcodemall.com:30080/api/product/skuinfo/list?key=2&vv=4&t4=%EF%BB%BF101%22%7D%5D,%22message%22:%22%22%7D">http://tomcodemall.com:30080/api/product/skuinfo/list?key=2&amp;vv=4&amp;t4=%EF%BB%BF101&quot;}],&quot;message&quot;:&quot;&quot;}</a></p>
             */
            public Builder httpTiming(String httpTiming) {
                this.httpTiming = httpTiming;
                return this;
            }

            /**
             * <p>The imported parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder importContent(String importContent) {
                this.importContent = importContent;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>1345531</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The response time. Unit: ms.</p>
             * 
             * <strong>example:</strong>
             * <p>230</p>
             */
            public Builder rt(String rt) {
                this.rt = rt;
                return this;
            }

            /**
             * <p>The timestamp. Unit: ms.</p>
             * 
             * <strong>example:</strong>
             * <p>1650253024471</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public SamplingLogs build() {
                return new SamplingLogs(this);
            } 

        } 

    }
}
