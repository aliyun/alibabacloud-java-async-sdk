// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPtsDebugSampleLogsResponseBody} extends {@link TeaModel}
 *
 * <p>GetPtsDebugSampleLogsResponseBody</p>
 */
public class GetPtsDebugSampleLogsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SamplingLogs")
    private java.util.List < SamplingLogs> samplingLogs;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
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
    public java.util.List < SamplingLogs> getSamplingLogs() {
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
        private java.util.List < SamplingLogs> samplingLogs; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SamplingLogs.
         */
        public Builder samplingLogs(java.util.List < SamplingLogs> samplingLogs) {
            this.samplingLogs = samplingLogs;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetPtsDebugSampleLogsResponseBody build() {
            return new GetPtsDebugSampleLogsResponseBody(this);
        } 

    } 

    public static class SamplingLogs extends TeaModel {
        @NameInMap("ChainId")
        private String chainId;

        @NameInMap("ChainName")
        private String chainName;

        @NameInMap("CheckResult")
        private String checkResult;

        @NameInMap("ExportConfig")
        private String exportConfig;

        @NameInMap("ExportContent")
        private String exportContent;

        @NameInMap("HttpRequestBody")
        private String httpRequestBody;

        @NameInMap("HttpRequestHeaders")
        private String httpRequestHeaders;

        @NameInMap("HttpRequestMethod")
        private String httpRequestMethod;

        @NameInMap("HttpRequestUrl")
        private String httpRequestUrl;

        @NameInMap("HttpResponseBody")
        private String httpResponseBody;

        @NameInMap("HttpResponseFailMsg")
        private String httpResponseFailMsg;

        @NameInMap("HttpResponseHeaders")
        private String httpResponseHeaders;

        @NameInMap("HttpResponseStatus")
        private String httpResponseStatus;

        @NameInMap("HttpStartTime")
        private Long httpStartTime;

        @NameInMap("HttpTiming")
        private String httpTiming;

        @NameInMap("ImportContent")
        private String importContent;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("Rt")
        private String rt;

        @NameInMap("Timestamp")
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

            /**
             * ChainId.
             */
            public Builder chainId(String chainId) {
                this.chainId = chainId;
                return this;
            }

            /**
             * ChainName.
             */
            public Builder chainName(String chainName) {
                this.chainName = chainName;
                return this;
            }

            /**
             * CheckResult.
             */
            public Builder checkResult(String checkResult) {
                this.checkResult = checkResult;
                return this;
            }

            /**
             * ExportConfig.
             */
            public Builder exportConfig(String exportConfig) {
                this.exportConfig = exportConfig;
                return this;
            }

            /**
             * ExportContent.
             */
            public Builder exportContent(String exportContent) {
                this.exportContent = exportContent;
                return this;
            }

            /**
             * HttpRequestBody.
             */
            public Builder httpRequestBody(String httpRequestBody) {
                this.httpRequestBody = httpRequestBody;
                return this;
            }

            /**
             * HttpRequestHeaders.
             */
            public Builder httpRequestHeaders(String httpRequestHeaders) {
                this.httpRequestHeaders = httpRequestHeaders;
                return this;
            }

            /**
             * HttpRequestMethod.
             */
            public Builder httpRequestMethod(String httpRequestMethod) {
                this.httpRequestMethod = httpRequestMethod;
                return this;
            }

            /**
             * HttpRequestUrl.
             */
            public Builder httpRequestUrl(String httpRequestUrl) {
                this.httpRequestUrl = httpRequestUrl;
                return this;
            }

            /**
             * HttpResponseBody.
             */
            public Builder httpResponseBody(String httpResponseBody) {
                this.httpResponseBody = httpResponseBody;
                return this;
            }

            /**
             * HttpResponseFailMsg.
             */
            public Builder httpResponseFailMsg(String httpResponseFailMsg) {
                this.httpResponseFailMsg = httpResponseFailMsg;
                return this;
            }

            /**
             * HttpResponseHeaders.
             */
            public Builder httpResponseHeaders(String httpResponseHeaders) {
                this.httpResponseHeaders = httpResponseHeaders;
                return this;
            }

            /**
             * HttpResponseStatus.
             */
            public Builder httpResponseStatus(String httpResponseStatus) {
                this.httpResponseStatus = httpResponseStatus;
                return this;
            }

            /**
             * HttpStartTime.
             */
            public Builder httpStartTime(Long httpStartTime) {
                this.httpStartTime = httpStartTime;
                return this;
            }

            /**
             * HttpTiming.
             */
            public Builder httpTiming(String httpTiming) {
                this.httpTiming = httpTiming;
                return this;
            }

            /**
             * ImportContent.
             */
            public Builder importContent(String importContent) {
                this.importContent = importContent;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * Rt.
             */
            public Builder rt(String rt) {
                this.rt = rt;
                return this;
            }

            /**
             * Timestamp.
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
