// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListFlowRulesResponseBody</p>
 */
public class ListFlowRulesResponseBody extends TeaModel {
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

    private ListFlowRulesResponseBody(Builder builder) {
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

    public static ListFlowRulesResponseBody create() {
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

        /**
         * The HTTP status code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The details of the data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The returned message.
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
         * Indicates whether the request was successful.
         * <p>
         * 
         * Valid values:
         * 
         * *   true
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     The request was successful.
         * 
         *     <!-- -->
         * 
         * *   false
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     The request failed.
         * 
         *     <!-- -->
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListFlowRulesResponseBody build() {
            return new ListFlowRulesResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("ControlBehavior")
        private Integer controlBehavior;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("FallbackObject")
        private String fallbackObject;

        @com.aliyun.core.annotation.NameInMap("MaxQueueingTimeMs")
        private Integer maxQueueingTimeMs;

        @com.aliyun.core.annotation.NameInMap("MetricType")
        private Integer metricType;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private String resource;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private Integer resourceType;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private Float threshold;

        @com.aliyun.core.annotation.NameInMap("TrafficTags")
        private java.util.Map < String, ? > trafficTags;

        private Result(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.controlBehavior = builder.controlBehavior;
            this.enable = builder.enable;
            this.fallbackObject = builder.fallbackObject;
            this.maxQueueingTimeMs = builder.maxQueueingTimeMs;
            this.metricType = builder.metricType;
            this.namespace = builder.namespace;
            this.regionId = builder.regionId;
            this.resource = builder.resource;
            this.resourceType = builder.resourceType;
            this.ruleId = builder.ruleId;
            this.threshold = builder.threshold;
            this.trafficTags = builder.trafficTags;
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
         * @return controlBehavior
         */
        public Integer getControlBehavior() {
            return this.controlBehavior;
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
         * @return maxQueueingTimeMs
         */
        public Integer getMaxQueueingTimeMs() {
            return this.maxQueueingTimeMs;
        }

        /**
         * @return metricType
         */
        public Integer getMetricType() {
            return this.metricType;
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
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return threshold
         */
        public Float getThreshold() {
            return this.threshold;
        }

        /**
         * @return trafficTags
         */
        public java.util.Map < String, ? > getTrafficTags() {
            return this.trafficTags;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private Integer controlBehavior; 
            private Boolean enable; 
            private String fallbackObject; 
            private Integer maxQueueingTimeMs; 
            private Integer metricType; 
            private String namespace; 
            private String regionId; 
            private String resource; 
            private Integer resourceType; 
            private Long ruleId; 
            private Float threshold; 
            private java.util.Map < String, ? > trafficTags; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The application name.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The throttling effect.
             * <p>
             * 
             * Valid values:
             * 
             * *   0
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     fast failure
             * 
             *     <!-- -->
             * 
             * *   2
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     in queue
             * 
             *     <!-- -->
             */
            public Builder controlBehavior(Integer controlBehavior) {
                this.controlBehavior = controlBehavior;
                return this;
            }

            /**
             * Indicates whether the throttling rule was enabled.
             * <p>
             * 
             * Valid values:
             * 
             * *   true
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   false
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * The throttling behavior.
             */
            public Builder fallbackObject(String fallbackObject) {
                this.fallbackObject = fallbackObject;
                return this;
            }

            /**
             * The timeout period for queuing when the value of ControlBehavior is set to 2. Unit: milliseconds.
             */
            public Builder maxQueueingTimeMs(Integer maxQueueingTimeMs) {
                this.maxQueueingTimeMs = maxQueueingTimeMs;
                return this;
            }

            /**
             * The statistical dimension. The value 1 indicates that the number of accepted requests is used for statistics.
             */
            public Builder metricType(Integer metricType) {
                this.metricType = metricType;
                return this;
            }

            /**
             * The namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The ID of the region in which the instance resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The name of the interface resource.
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
             * The rule ID.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * The throttling threshold.
             */
            public Builder threshold(Float threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * A reserved parameter.
             */
            public Builder trafficTags(java.util.Map < String, ? > trafficTags) {
                this.trafficTags = trafficTags;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List < Result> result;

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
        public java.util.List < Result> getResult() {
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
            private java.util.List < Result> result; 
            private Integer totalSize; 

            /**
             * The page number.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The data returned.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            /**
             * The total number of entries.
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
