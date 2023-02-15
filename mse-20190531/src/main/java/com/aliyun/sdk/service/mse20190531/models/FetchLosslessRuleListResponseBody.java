// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FetchLosslessRuleListResponseBody} extends {@link TeaModel}
 *
 * <p>FetchLosslessRuleListResponseBody</p>
 */
public class FetchLosslessRuleListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpCode")
    private String httpCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private FetchLosslessRuleListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpCode = builder.httpCode;
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
     * @return httpCode
     */
    public String getHttpCode() {
        return this.httpCode;
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
        private String code; 
        private Data data; 
        private String httpCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpCode.
         */
        public Builder httpCode(String httpCode) {
            this.httpCode = httpCode;
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public FetchLosslessRuleListResponseBody build() {
            return new FetchLosslessRuleListResponseBody(this);
        } 

    } 

    public static class Results extends TeaModel {
        @NameInMap("Aligned")
        private Boolean aligned;

        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("Count")
        private Long count;

        @NameInMap("DelayTime")
        private Long delayTime;

        @NameInMap("Enable")
        private Boolean enable;

        @NameInMap("FuncType")
        private Long funcType;

        @NameInMap("LossLessDetail")
        private Boolean lossLessDetail;

        @NameInMap("Notice")
        private Boolean notice;

        @NameInMap("Related")
        private Boolean related;

        @NameInMap("ShutdownWaitSeconds")
        private Integer shutdownWaitSeconds;

        @NameInMap("WarmupTime")
        private Long warmupTime;

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
            this.shutdownWaitSeconds = builder.shutdownWaitSeconds;
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
        public Long getCount() {
            return this.count;
        }

        /**
         * @return delayTime
         */
        public Long getDelayTime() {
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
        public Long getFuncType() {
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
         * @return shutdownWaitSeconds
         */
        public Integer getShutdownWaitSeconds() {
            return this.shutdownWaitSeconds;
        }

        /**
         * @return warmupTime
         */
        public Long getWarmupTime() {
            return this.warmupTime;
        }

        public static final class Builder {
            private Boolean aligned; 
            private String appId; 
            private String appName; 
            private Long count; 
            private Long delayTime; 
            private Boolean enable; 
            private Long funcType; 
            private Boolean lossLessDetail; 
            private Boolean notice; 
            private Boolean related; 
            private Integer shutdownWaitSeconds; 
            private Long warmupTime; 

            /**
             * K8s生命周期与微服务生命周期对齐
             */
            public Builder aligned(Boolean aligned) {
                this.aligned = aligned;
                return this;
            }

            /**
             * 应用id
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * 应用名称
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * 实例数量
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * 延迟注册时间
             */
            public Builder delayTime(Long delayTime) {
                this.delayTime = delayTime;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * 预热曲线斜率
             */
            public Builder funcType(Long funcType) {
                this.funcType = funcType;
                return this;
            }

            /**
             * LossLessDetail.
             */
            public Builder lossLessDetail(Boolean lossLessDetail) {
                this.lossLessDetail = lossLessDetail;
                return this;
            }

            /**
             * Notice.
             */
            public Builder notice(Boolean notice) {
                this.notice = notice;
                return this;
            }

            /**
             * 是否关联服务预热
             */
            public Builder related(Boolean related) {
                this.related = related;
                return this;
            }

            /**
             * wait time before shutdown, in seconds
             */
            public Builder shutdownWaitSeconds(Integer shutdownWaitSeconds) {
                this.shutdownWaitSeconds = shutdownWaitSeconds;
                return this;
            }

            /**
             * 预热时长
             */
            public Builder warmupTime(Long warmupTime) {
                this.warmupTime = warmupTime;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageNumber")
        private Long pageNumber;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("Results")
        private java.util.List < Results> results;

        @NameInMap("TotalSize")
        private Long totalSize;

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
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return results
         */
        public java.util.List < Results> getResults() {
            return this.results;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private Long pageNumber; 
            private Long pageSize; 
            private java.util.List < Results> results; 
            private Long totalSize; 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Results.
             */
            public Builder results(java.util.List < Results> results) {
                this.results = results;
                return this;
            }

            /**
             * TotalSize.
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
