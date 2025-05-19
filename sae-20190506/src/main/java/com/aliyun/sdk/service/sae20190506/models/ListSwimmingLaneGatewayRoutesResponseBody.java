// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ListSwimmingLaneGatewayRoutesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSwimmingLaneGatewayRoutesResponseBody</p>
 */
public class ListSwimmingLaneGatewayRoutesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private ListSwimmingLaneGatewayRoutesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSwimmingLaneGatewayRoutesResponseBody create() {
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(ListSwimmingLaneGatewayRoutesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
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
        public Builder data(java.util.List<Data> data) {
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        /**
         * TraceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public ListSwimmingLaneGatewayRoutesResponseBody build() {
            return new ListSwimmingLaneGatewayRoutesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSwimmingLaneGatewayRoutesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSwimmingLaneGatewayRoutesResponseBody</p>
     */
    public static class PathPredicate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private PathPredicate(Builder builder) {
            this.path = builder.path;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PathPredicate create() {
            return builder().build();
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String path; 
            private String type; 

            private Builder() {
            } 

            private Builder(PathPredicate model) {
                this.path = model.path;
                this.type = model.type;
            } 

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public PathPredicate build() {
                return new PathPredicate(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSwimmingLaneGatewayRoutesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSwimmingLaneGatewayRoutesResponseBody</p>
     */
    public static class RoutePredicate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PathPredicate")
        private PathPredicate pathPredicate;

        private RoutePredicate(Builder builder) {
            this.pathPredicate = builder.pathPredicate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoutePredicate create() {
            return builder().build();
        }

        /**
         * @return pathPredicate
         */
        public PathPredicate getPathPredicate() {
            return this.pathPredicate;
        }

        public static final class Builder {
            private PathPredicate pathPredicate; 

            private Builder() {
            } 

            private Builder(RoutePredicate model) {
                this.pathPredicate = model.pathPredicate;
            } 

            /**
             * PathPredicate.
             */
            public Builder pathPredicate(PathPredicate pathPredicate) {
                this.pathPredicate = pathPredicate;
                return this;
            }

            public RoutePredicate build() {
                return new RoutePredicate(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSwimmingLaneGatewayRoutesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSwimmingLaneGatewayRoutesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RouteId")
        private Long routeId;

        @com.aliyun.core.annotation.NameInMap("RouteName")
        private String routeName;

        @com.aliyun.core.annotation.NameInMap("RoutePredicate")
        private RoutePredicate routePredicate;

        private Data(Builder builder) {
            this.routeId = builder.routeId;
            this.routeName = builder.routeName;
            this.routePredicate = builder.routePredicate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return routeId
         */
        public Long getRouteId() {
            return this.routeId;
        }

        /**
         * @return routeName
         */
        public String getRouteName() {
            return this.routeName;
        }

        /**
         * @return routePredicate
         */
        public RoutePredicate getRoutePredicate() {
            return this.routePredicate;
        }

        public static final class Builder {
            private Long routeId; 
            private String routeName; 
            private RoutePredicate routePredicate; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.routeId = model.routeId;
                this.routeName = model.routeName;
                this.routePredicate = model.routePredicate;
            } 

            /**
             * RouteId.
             */
            public Builder routeId(Long routeId) {
                this.routeId = routeId;
                return this;
            }

            /**
             * RouteName.
             */
            public Builder routeName(String routeName) {
                this.routeName = routeName;
                return this;
            }

            /**
             * RoutePredicate.
             */
            public Builder routePredicate(RoutePredicate routePredicate) {
                this.routePredicate = routePredicate;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
