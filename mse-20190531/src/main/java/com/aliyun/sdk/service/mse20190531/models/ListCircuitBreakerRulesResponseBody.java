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
 * {@link ListCircuitBreakerRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCircuitBreakerRulesResponseBody</p>
 */
public class ListCircuitBreakerRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListCircuitBreakerRulesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCircuitBreakerRulesResponseBody create() {
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
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListCircuitBreakerRulesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
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
         * <p>The details of the rule.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4E9FDCFE-0738-493B-B801-82BDFBCB****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCircuitBreakerRulesResponseBody build() {
            return new ListCircuitBreakerRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCircuitBreakerRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCircuitBreakerRulesResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("FallbackObject")
        private String fallbackObject;

        @com.aliyun.core.annotation.NameInMap("HalfOpenBaseAmountPerStep")
        private Integer halfOpenBaseAmountPerStep;

        @com.aliyun.core.annotation.NameInMap("HalfOpenRecoveryStepNum")
        private Integer halfOpenRecoveryStepNum;

        @com.aliyun.core.annotation.NameInMap("MaxAllowedRtMs")
        private Integer maxAllowedRtMs;

        @com.aliyun.core.annotation.NameInMap("MinRequestAmount")
        private Integer minRequestAmount;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private String resource;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private Integer resourceType;

        @com.aliyun.core.annotation.NameInMap("RetryTimeoutMs")
        private Integer retryTimeoutMs;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("StatIntervalMs")
        private Integer statIntervalMs;

        @com.aliyun.core.annotation.NameInMap("Strategy")
        private Integer strategy;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private Float threshold;

        private Result(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.enable = builder.enable;
            this.fallbackObject = builder.fallbackObject;
            this.halfOpenBaseAmountPerStep = builder.halfOpenBaseAmountPerStep;
            this.halfOpenRecoveryStepNum = builder.halfOpenRecoveryStepNum;
            this.maxAllowedRtMs = builder.maxAllowedRtMs;
            this.minRequestAmount = builder.minRequestAmount;
            this.namespace = builder.namespace;
            this.regionId = builder.regionId;
            this.resource = builder.resource;
            this.resourceType = builder.resourceType;
            this.retryTimeoutMs = builder.retryTimeoutMs;
            this.ruleId = builder.ruleId;
            this.statIntervalMs = builder.statIntervalMs;
            this.strategy = builder.strategy;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
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
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return fallbackObject
         */
        public String getFallbackObject() {
            return this.fallbackObject;
        }

        /**
         * @return halfOpenBaseAmountPerStep
         */
        public Integer getHalfOpenBaseAmountPerStep() {
            return this.halfOpenBaseAmountPerStep;
        }

        /**
         * @return halfOpenRecoveryStepNum
         */
        public Integer getHalfOpenRecoveryStepNum() {
            return this.halfOpenRecoveryStepNum;
        }

        /**
         * @return maxAllowedRtMs
         */
        public Integer getMaxAllowedRtMs() {
            return this.maxAllowedRtMs;
        }

        /**
         * @return minRequestAmount
         */
        public Integer getMinRequestAmount() {
            return this.minRequestAmount;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        /**
         * @return resourceType
         */
        public Integer getResourceType() {
            return this.resourceType;
        }

        /**
         * @return retryTimeoutMs
         */
        public Integer getRetryTimeoutMs() {
            return this.retryTimeoutMs;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return statIntervalMs
         */
        public Integer getStatIntervalMs() {
            return this.statIntervalMs;
        }

        /**
         * @return strategy
         */
        public Integer getStrategy() {
            return this.strategy;
        }

        /**
         * @return threshold
         */
        public Float getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private Boolean enable; 
            private String fallbackObject; 
            private Integer halfOpenBaseAmountPerStep; 
            private Integer halfOpenRecoveryStepNum; 
            private Integer maxAllowedRtMs; 
            private Integer minRequestAmount; 
            private String namespace; 
            private String regionId; 
            private String resource; 
            private Integer resourceType; 
            private Integer retryTimeoutMs; 
            private Long ruleId; 
            private Integer statIntervalMs; 
            private Integer strategy; 
            private Float threshold; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.enable = model.enable;
                this.fallbackObject = model.fallbackObject;
                this.halfOpenBaseAmountPerStep = model.halfOpenBaseAmountPerStep;
                this.halfOpenRecoveryStepNum = model.halfOpenRecoveryStepNum;
                this.maxAllowedRtMs = model.maxAllowedRtMs;
                this.minRequestAmount = model.minRequestAmount;
                this.namespace = model.namespace;
                this.regionId = model.regionId;
                this.resource = model.resource;
                this.resourceType = model.resourceType;
                this.retryTimeoutMs = model.retryTimeoutMs;
                this.ruleId = model.ruleId;
                this.statIntervalMs = model.statIntervalMs;
                this.strategy = model.strategy;
                this.threshold = model.threshold;
            } 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>hkhon1po62@c3df23522bXXXXX</p>
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
             * <p>Indicates whether the rule was enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The behavior that was bound to the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;{&quot;appName&quot;:&quot;spring-cloud-a&quot;,&quot;fallbackBehavior&quot;:{&quot;webFallbackMode&quot;:0,&quot;webRespContentType&quot;:0,&quot;webRespMessage&quot;:&quot;Blocked&quot;,&quot;webRespStatusCode&quot;:429},&quot;id&quot;:977,&quot;name&quot;:&quot;Fallback&quot;,&quot;namespace&quot;:&quot;default&quot;,&quot;resourceClassification&quot;:1}&quot;</p>
             */
            public Builder fallbackObject(String fallbackObject) {
                this.fallbackObject = fallbackObject;
                return this;
            }

            /**
             * <p>The minimum number of requests that can be passed in each step after circuit breaking recovers.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder halfOpenBaseAmountPerStep(Integer halfOpenBaseAmountPerStep) {
                this.halfOpenBaseAmountPerStep = halfOpenBaseAmountPerStep;
                return this;
            }

            /**
             * <p>The number of circuit breaking recovery steps.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder halfOpenRecoveryStepNum(Integer halfOpenRecoveryStepNum) {
                this.halfOpenRecoveryStepNum = halfOpenRecoveryStepNum;
                return this;
            }

            /**
             * <p>The maximum RT. Unit: milliseconds. If the RT of a request is greater than the value of this parameter, a slow call is counted. If you set Strategy to 0, you must specify this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder maxAllowedRtMs(Integer maxAllowedRtMs) {
                this.maxAllowedRtMs = maxAllowedRtMs;
                return this;
            }

            /**
             * <p>The minimum number of requests to trigger circuit breaking. If the number of requests in the current time window is less than the value of this parameter, circuit breaking is not triggered even if the circuit breaking rule is met.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder minRequestAmount(Integer minRequestAmount) {
                this.minRequestAmount = minRequestAmount;
                return this;
            }

            /**
             * <p>The microservice namespace to which the application belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The region in which the instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the interface to which the rule is applicable. The interface name must be the same as the name on the interface details page in the console.</p>
             * 
             * <strong>example:</strong>
             * <p>/a</p>
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(Integer resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The period in which circuit breaking is implemented. Unit: milliseconds. If circuit breaking is implemented on the requests for the route, the calls to all the requests for the route fail in the configured circuit breaking period.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder retryTimeoutMs(Integer retryTimeoutMs) {
                this.retryTimeoutMs = retryTimeoutMs;
                return this;
            }

            /**
             * <p>The ID of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The length of the time window. Unit: milliseconds. The valid range is from 1 second to 120 minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>20000</p>
             */
            public Builder statIntervalMs(Integer statIntervalMs) {
                this.statIntervalMs = statIntervalMs;
                return this;
            }

            /**
             * <p>The threshold type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>0</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>slow call proportion</p>
             * <!-- -->
             * </li>
             * <li><p>1</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>abnormal proportion</p>
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder strategy(Integer strategy) {
                this.strategy = strategy;
                return this;
            }

            /**
             * <p>A percentage threshold for triggering circuit breaking. Valid values: 0-1. These values represent 0% to 100%.</p>
             * 
             * <strong>example:</strong>
             * <p>0.8</p>
             */
            public Builder threshold(Float threshold) {
                this.threshold = threshold;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCircuitBreakerRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCircuitBreakerRulesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<Result> result;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Integer totalSize;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.result = builder.result;
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
         * @return result
         */
        public java.util.List<Result> getResult() {
            return this.result;
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
            private java.util.List<Result> result; 
            private Integer totalSize; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.result = model.result;
                this.totalSize = model.totalSize;
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
             * <p>The returned result.</p>
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The total number of pages.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
