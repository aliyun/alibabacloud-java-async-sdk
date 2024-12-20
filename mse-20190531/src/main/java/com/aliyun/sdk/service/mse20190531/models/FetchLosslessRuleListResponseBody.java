// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link FetchLosslessRuleListResponseBody} extends {@link TeaModel}
 *
 * <p>FetchLosslessRuleListResponseBody</p>
 */
public class FetchLosslessRuleListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private FetchLosslessRuleListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FetchLosslessRuleListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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
        private Integer code; 
        private Data data; 
        private String errorCode; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The response code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
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
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>56D9E600-6348-4260-B35F-583413F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request was successful.</li>
         * <li><code>false</code>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public FetchLosslessRuleListResponseBody build() {
            return new FetchLosslessRuleListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FetchLosslessRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>FetchLosslessRuleListResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Aligned")
        private Boolean aligned;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("DelayTime")
        private Integer delayTime;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("FuncType")
        private Integer funcType;

        @com.aliyun.core.annotation.NameInMap("LossLessDetail")
        private Boolean lossLessDetail;

        @com.aliyun.core.annotation.NameInMap("Notice")
        private Boolean notice;

        @com.aliyun.core.annotation.NameInMap("Related")
        private Boolean related;

        @com.aliyun.core.annotation.NameInMap("WarmupTime")
        private Integer warmupTime;

        private Results(Builder builder) {
            this.aligned = builder.aligned;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.count = builder.count;
            this.delayTime = builder.delayTime;
            this.enable = builder.enable;
            this.funcType = builder.funcType;
            this.lossLessDetail = builder.lossLessDetail;
            this.notice = builder.notice;
            this.related = builder.related;
            this.warmupTime = builder.warmupTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return aligned
         */
        public Boolean getAligned() {
            return this.aligned;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return delayTime
         */
        public Integer getDelayTime() {
            return this.delayTime;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return funcType
         */
        public Integer getFuncType() {
            return this.funcType;
        }

        /**
         * @return lossLessDetail
         */
        public Boolean getLossLessDetail() {
            return this.lossLessDetail;
        }

        /**
         * @return notice
         */
        public Boolean getNotice() {
            return this.notice;
        }

        /**
         * @return related
         */
        public Boolean getRelated() {
            return this.related;
        }

        /**
         * @return warmupTime
         */
        public Integer getWarmupTime() {
            return this.warmupTime;
        }

        public static final class Builder {
            private Boolean aligned; 
            private String appId; 
            private String appName; 
            private Integer count; 
            private Integer delayTime; 
            private Boolean enable; 
            private Integer funcType; 
            private Boolean lossLessDetail; 
            private Boolean notice; 
            private Boolean related; 
            private Integer warmupTime; 

            /**
             * <p>Indicates whether service registration is complete before readiness probe.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder aligned(Boolean aligned) {
                this.aligned = aligned;
                return this;
            }

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>hkhon1po62@24810bf4364aea1</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>echo-demo</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The registration latency. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder delayTime(Integer delayTime) {
                this.delayTime = delayTime;
                return this;
            }

            /**
             * <p>Indicates whether graceful start is enabled. Valid values:</p>
             * <ul>
             * <li><code>true</code>: enabled</li>
             * <li><code>false</code>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The slope of the prefetching curve.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder funcType(Integer funcType) {
                this.funcType = funcType;
                return this;
            }

            /**
             * <p>Indicates whether online and offline processing details are displayed.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder lossLessDetail(Boolean lossLessDetail) {
                this.lossLessDetail = lossLessDetail;
                return this;
            }

            /**
             * <p>Indicates whether notification is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder notice(Boolean notice) {
                this.notice = notice;
                return this;
            }

            /**
             * <p>Indicates whether service prefetching is complete before readiness probe.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder related(Boolean related) {
                this.related = related;
                return this;
            }

            /**
             * <p>The prefetching duration. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder warmupTime(Integer warmupTime) {
                this.warmupTime = warmupTime;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    /**
     * 
     * {@link FetchLosslessRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>FetchLosslessRuleListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Results")
        private java.util.List<Results> results;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Integer totalSize;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.results = builder.results;
            this.totalSize = builder.totalSize;
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
         * @return results
         */
        public java.util.List<Results> getResults() {
            return this.results;
        }

        /**
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List<Results> results; 
            private Integer totalSize; 

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The returned data.</p>
             */
            public Builder results(java.util.List<Results> results) {
                this.results = results;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>36</p>
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
