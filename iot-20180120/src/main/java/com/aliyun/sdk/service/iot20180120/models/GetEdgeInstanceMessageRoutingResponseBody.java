// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEdgeInstanceMessageRoutingResponseBody} extends {@link TeaModel}
 *
 * <p>GetEdgeInstanceMessageRoutingResponseBody</p>
 */
public class GetEdgeInstanceMessageRoutingResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetEdgeInstanceMessageRoutingResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEdgeInstanceMessageRoutingResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String errorMessage; 
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
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetEdgeInstanceMessageRoutingResponseBody build() {
            return new GetEdgeInstanceMessageRoutingResponseBody(this);
        } 

    } 

    public static class RouteContext extends TeaModel {
        @NameInMap("Qos")
        private String qos;

        @NameInMap("SourceApplicationName")
        private String sourceApplicationName;

        @NameInMap("SourceFcFunctionName")
        private String sourceFcFunctionName;

        @NameInMap("SourceFcServiceName")
        private String sourceFcServiceName;

        @NameInMap("TargetApplicationName")
        private String targetApplicationName;

        @NameInMap("TargetFcFunctionName")
        private String targetFcFunctionName;

        @NameInMap("TargetFcServiceName")
        private String targetFcServiceName;

        private RouteContext(Builder builder) {
            this.qos = builder.qos;
            this.sourceApplicationName = builder.sourceApplicationName;
            this.sourceFcFunctionName = builder.sourceFcFunctionName;
            this.sourceFcServiceName = builder.sourceFcServiceName;
            this.targetApplicationName = builder.targetApplicationName;
            this.targetFcFunctionName = builder.targetFcFunctionName;
            this.targetFcServiceName = builder.targetFcServiceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteContext create() {
            return builder().build();
        }

        /**
         * @return qos
         */
        public String getQos() {
            return this.qos;
        }

        /**
         * @return sourceApplicationName
         */
        public String getSourceApplicationName() {
            return this.sourceApplicationName;
        }

        /**
         * @return sourceFcFunctionName
         */
        public String getSourceFcFunctionName() {
            return this.sourceFcFunctionName;
        }

        /**
         * @return sourceFcServiceName
         */
        public String getSourceFcServiceName() {
            return this.sourceFcServiceName;
        }

        /**
         * @return targetApplicationName
         */
        public String getTargetApplicationName() {
            return this.targetApplicationName;
        }

        /**
         * @return targetFcFunctionName
         */
        public String getTargetFcFunctionName() {
            return this.targetFcFunctionName;
        }

        /**
         * @return targetFcServiceName
         */
        public String getTargetFcServiceName() {
            return this.targetFcServiceName;
        }

        public static final class Builder {
            private String qos; 
            private String sourceApplicationName; 
            private String sourceFcFunctionName; 
            private String sourceFcServiceName; 
            private String targetApplicationName; 
            private String targetFcFunctionName; 
            private String targetFcServiceName; 

            /**
             * Qos.
             */
            public Builder qos(String qos) {
                this.qos = qos;
                return this;
            }

            /**
             * SourceApplicationName.
             */
            public Builder sourceApplicationName(String sourceApplicationName) {
                this.sourceApplicationName = sourceApplicationName;
                return this;
            }

            /**
             * SourceFcFunctionName.
             */
            public Builder sourceFcFunctionName(String sourceFcFunctionName) {
                this.sourceFcFunctionName = sourceFcFunctionName;
                return this;
            }

            /**
             * SourceFcServiceName.
             */
            public Builder sourceFcServiceName(String sourceFcServiceName) {
                this.sourceFcServiceName = sourceFcServiceName;
                return this;
            }

            /**
             * TargetApplicationName.
             */
            public Builder targetApplicationName(String targetApplicationName) {
                this.targetApplicationName = targetApplicationName;
                return this;
            }

            /**
             * TargetFcFunctionName.
             */
            public Builder targetFcFunctionName(String targetFcFunctionName) {
                this.targetFcFunctionName = targetFcFunctionName;
                return this;
            }

            /**
             * TargetFcServiceName.
             */
            public Builder targetFcServiceName(String targetFcServiceName) {
                this.targetFcServiceName = targetFcServiceName;
                return this;
            }

            public RouteContext build() {
                return new RouteContext(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtCreateTimestamp")
        private Long gmtCreateTimestamp;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("GmtModifiedTimestamp")
        private Long gmtModifiedTimestamp;

        @NameInMap("Name")
        private String name;

        @NameInMap("RouteContext")
        private RouteContext routeContext;

        @NameInMap("SourceData")
        private String sourceData;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("TargetData")
        private String targetData;

        @NameInMap("TargetType")
        private String targetType;

        @NameInMap("TopicFilter")
        private String topicFilter;

        private Data(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtCreateTimestamp = builder.gmtCreateTimestamp;
            this.gmtModified = builder.gmtModified;
            this.gmtModifiedTimestamp = builder.gmtModifiedTimestamp;
            this.name = builder.name;
            this.routeContext = builder.routeContext;
            this.sourceData = builder.sourceData;
            this.sourceType = builder.sourceType;
            this.targetData = builder.targetData;
            this.targetType = builder.targetType;
            this.topicFilter = builder.topicFilter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtCreateTimestamp
         */
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return gmtModifiedTimestamp
         */
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return routeContext
         */
        public RouteContext getRouteContext() {
            return this.routeContext;
        }

        /**
         * @return sourceData
         */
        public String getSourceData() {
            return this.sourceData;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return targetData
         */
        public String getTargetData() {
            return this.targetData;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return topicFilter
         */
        public String getTopicFilter() {
            return this.topicFilter;
        }

        public static final class Builder {
            private String gmtCreate; 
            private Long gmtCreateTimestamp; 
            private String gmtModified; 
            private Long gmtModifiedTimestamp; 
            private String name; 
            private RouteContext routeContext; 
            private String sourceData; 
            private String sourceType; 
            private String targetData; 
            private String targetType; 
            private String topicFilter; 

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtCreateTimestamp.
             */
            public Builder gmtCreateTimestamp(Long gmtCreateTimestamp) {
                this.gmtCreateTimestamp = gmtCreateTimestamp;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * GmtModifiedTimestamp.
             */
            public Builder gmtModifiedTimestamp(Long gmtModifiedTimestamp) {
                this.gmtModifiedTimestamp = gmtModifiedTimestamp;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RouteContext.
             */
            public Builder routeContext(RouteContext routeContext) {
                this.routeContext = routeContext;
                return this;
            }

            /**
             * SourceData.
             */
            public Builder sourceData(String sourceData) {
                this.sourceData = sourceData;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * TargetData.
             */
            public Builder targetData(String targetData) {
                this.targetData = targetData;
                return this;
            }

            /**
             * TargetType.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * TopicFilter.
             */
            public Builder topicFilter(String topicFilter) {
                this.topicFilter = topicFilter;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
