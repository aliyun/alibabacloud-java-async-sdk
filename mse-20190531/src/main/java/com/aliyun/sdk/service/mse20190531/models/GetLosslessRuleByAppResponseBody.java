// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLosslessRuleByAppResponseBody} extends {@link TeaModel}
 *
 * <p>GetLosslessRuleByAppResponseBody</p>
 */
public class GetLosslessRuleByAppResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetLosslessRuleByAppResponseBody(Builder builder) {
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

    public static GetLosslessRuleByAppResponseBody create() {
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
         * The response code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code returned.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true: The request was successful.
         * *   false: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetLosslessRuleByAppResponseBody build() {
            return new GetLosslessRuleByAppResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Aligned")
        private Boolean aligned;

        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("Count")
        private Integer count;

        @NameInMap("DelayTime")
        private Integer delayTime;

        @NameInMap("Enable")
        private Boolean enable;

        @NameInMap("FuncType")
        private Integer funcType;

        @NameInMap("LossLessDetail")
        private Boolean lossLessDetail;

        @NameInMap("Notice")
        private Boolean notice;

        @NameInMap("Related")
        private Boolean related;

        @NameInMap("WarmupTime")
        private Integer warmupTime;

        private Data(Builder builder) {
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

        public static Data create() {
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
             * Indicates whether service registration is complete before readiness probe.
             */
            public Builder aligned(Boolean aligned) {
                this.aligned = aligned;
                return this;
            }

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The name of the application.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The number of instances.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The registration latency. Unit: seconds.
             */
            public Builder delayTime(Integer delayTime) {
                this.delayTime = delayTime;
                return this;
            }

            /**
             * Indicates whether graceful start is enabled. Valid values:
             * <p>
             * 
             * *   `true`: enabled
             * *   `false`: disabled
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * The slope of the prefetching curve.
             */
            public Builder funcType(Integer funcType) {
                this.funcType = funcType;
                return this;
            }

            /**
             * Indicates whether online and offline processing details are displayed.
             */
            public Builder lossLessDetail(Boolean lossLessDetail) {
                this.lossLessDetail = lossLessDetail;
                return this;
            }

            /**
             * Indicates whether notification is enabled.
             */
            public Builder notice(Boolean notice) {
                this.notice = notice;
                return this;
            }

            /**
             * Indicates whether service prefetching is complete before readiness probe.
             */
            public Builder related(Boolean related) {
                this.related = related;
                return this;
            }

            /**
             * The prefetching duration. Unit: seconds.
             */
            public Builder warmupTime(Integer warmupTime) {
                this.warmupTime = warmupTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
