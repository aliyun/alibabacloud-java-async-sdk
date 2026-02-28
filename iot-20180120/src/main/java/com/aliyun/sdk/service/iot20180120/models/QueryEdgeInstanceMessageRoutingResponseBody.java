// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryEdgeInstanceMessageRoutingResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEdgeInstanceMessageRoutingResponseBody</p>
 */
public class QueryEdgeInstanceMessageRoutingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryEdgeInstanceMessageRoutingResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEdgeInstanceMessageRoutingResponseBody create() {
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

        private Builder() {
        } 

        private Builder(QueryEdgeInstanceMessageRoutingResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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

        public QueryEdgeInstanceMessageRoutingResponseBody build() {
            return new QueryEdgeInstanceMessageRoutingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryEdgeInstanceMessageRoutingResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEdgeInstanceMessageRoutingResponseBody</p>
     */
    public static class RouteContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Qos")
        private String qos;

        @com.aliyun.core.annotation.NameInMap("SourceApplicationName")
        private String sourceApplicationName;

        @com.aliyun.core.annotation.NameInMap("SourceFcFunctionName")
        private String sourceFcFunctionName;

        @com.aliyun.core.annotation.NameInMap("SourceFcServiceName")
        private String sourceFcServiceName;

        @com.aliyun.core.annotation.NameInMap("TargetApplicationName")
        private String targetApplicationName;

        @com.aliyun.core.annotation.NameInMap("TargetFcFunctionName")
        private String targetFcFunctionName;

        @com.aliyun.core.annotation.NameInMap("TargetFcServiceName")
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

            private Builder() {
            } 

            private Builder(RouteContext model) {
                this.qos = model.qos;
                this.sourceApplicationName = model.sourceApplicationName;
                this.sourceFcFunctionName = model.sourceFcFunctionName;
                this.sourceFcServiceName = model.sourceFcServiceName;
                this.targetApplicationName = model.targetApplicationName;
                this.targetFcFunctionName = model.targetFcFunctionName;
                this.targetFcServiceName = model.targetFcServiceName;
            } 

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
    /**
     * 
     * {@link QueryEdgeInstanceMessageRoutingResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEdgeInstanceMessageRoutingResponseBody</p>
     */
    public static class MessageRoute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTimestamp")
        private Long gmtCreateTimestamp;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTimestamp")
        private Long gmtModifiedTimestamp;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RouteContext")
        private RouteContext routeContext;

        @com.aliyun.core.annotation.NameInMap("RouteId")
        private Integer routeId;

        @com.aliyun.core.annotation.NameInMap("SourceData")
        private String sourceData;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("TargetData")
        private String targetData;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("TopicFilter")
        private String topicFilter;

        private MessageRoute(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtCreateTimestamp = builder.gmtCreateTimestamp;
            this.gmtModified = builder.gmtModified;
            this.gmtModifiedTimestamp = builder.gmtModifiedTimestamp;
            this.name = builder.name;
            this.routeContext = builder.routeContext;
            this.routeId = builder.routeId;
            this.sourceData = builder.sourceData;
            this.sourceType = builder.sourceType;
            this.targetData = builder.targetData;
            this.targetType = builder.targetType;
            this.topicFilter = builder.topicFilter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MessageRoute create() {
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
         * @return routeId
         */
        public Integer getRouteId() {
            return this.routeId;
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
            private Integer routeId; 
            private String sourceData; 
            private String sourceType; 
            private String targetData; 
            private String targetType; 
            private String topicFilter; 

            private Builder() {
            } 

            private Builder(MessageRoute model) {
                this.gmtCreate = model.gmtCreate;
                this.gmtCreateTimestamp = model.gmtCreateTimestamp;
                this.gmtModified = model.gmtModified;
                this.gmtModifiedTimestamp = model.gmtModifiedTimestamp;
                this.name = model.name;
                this.routeContext = model.routeContext;
                this.routeId = model.routeId;
                this.sourceData = model.sourceData;
                this.sourceType = model.sourceType;
                this.targetData = model.targetData;
                this.targetType = model.targetType;
                this.topicFilter = model.topicFilter;
            } 

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
             * RouteId.
             */
            public Builder routeId(Integer routeId) {
                this.routeId = routeId;
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

            public MessageRoute build() {
                return new MessageRoute(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryEdgeInstanceMessageRoutingResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEdgeInstanceMessageRoutingResponseBody</p>
     */
    public static class MessageRouteList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MessageRoute")
        private java.util.List<MessageRoute> messageRoute;

        private MessageRouteList(Builder builder) {
            this.messageRoute = builder.messageRoute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MessageRouteList create() {
            return builder().build();
        }

        /**
         * @return messageRoute
         */
        public java.util.List<MessageRoute> getMessageRoute() {
            return this.messageRoute;
        }

        public static final class Builder {
            private java.util.List<MessageRoute> messageRoute; 

            private Builder() {
            } 

            private Builder(MessageRouteList model) {
                this.messageRoute = model.messageRoute;
            } 

            /**
             * MessageRoute.
             */
            public Builder messageRoute(java.util.List<MessageRoute> messageRoute) {
                this.messageRoute = messageRoute;
                return this;
            }

            public MessageRouteList build() {
                return new MessageRouteList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryEdgeInstanceMessageRoutingResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEdgeInstanceMessageRoutingResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("MessageRouteList")
        private MessageRouteList messageRouteList;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.messageRouteList = builder.messageRouteList;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return messageRouteList
         */
        public MessageRouteList getMessageRouteList() {
            return this.messageRouteList;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer currentPage; 
            private MessageRouteList messageRouteList; 
            private Integer pageSize; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentPage = model.currentPage;
                this.messageRouteList = model.messageRouteList;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * MessageRouteList.
             */
            public Builder messageRouteList(MessageRouteList messageRouteList) {
                this.messageRouteList = messageRouteList;
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
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
