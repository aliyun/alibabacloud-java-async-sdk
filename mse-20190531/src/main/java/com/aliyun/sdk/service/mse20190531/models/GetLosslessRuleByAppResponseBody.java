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
 * {@link GetLosslessRuleByAppResponseBody} extends {@link TeaModel}
 *
 * <p>GetLosslessRuleByAppResponseBody</p>
 */
public class GetLosslessRuleByAppResponseBody extends TeaModel {
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetLosslessRuleByAppResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DC34E4A3-5F1C-4E40-86EA-02EDF967****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetLosslessRuleByAppResponseBody build() {
            return new GetLosslessRuleByAppResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLosslessRuleByAppResponseBody} extends {@link TeaModel}
     *
     * <p>GetLosslessRuleByAppResponseBody</p>
     */
    public static class Data extends TeaModel {
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.aligned = model.aligned;
                this.appId = model.appId;
                this.appName = model.appName;
                this.count = model.count;
                this.delayTime = model.delayTime;
                this.enable = model.enable;
                this.funcType = model.funcType;
                this.lossLessDetail = model.lossLessDetail;
                this.notice = model.notice;
                this.related = model.related;
                this.warmupTime = model.warmupTime;
            } 

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
             * <p>hkhon1po62@24810bf4364a***</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>spring-cloud-a</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
             * <p>true</p>
             */
            public Builder lossLessDetail(Boolean lossLessDetail) {
                this.lossLessDetail = lossLessDetail;
                return this;
            }

            /**
             * <p>Indicates whether notification is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
             * <p>120</p>
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
