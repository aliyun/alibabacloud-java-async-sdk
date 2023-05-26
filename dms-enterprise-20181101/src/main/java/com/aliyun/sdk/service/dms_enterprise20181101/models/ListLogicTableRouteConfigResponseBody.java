// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLogicTableRouteConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ListLogicTableRouteConfigResponseBody</p>
 */
public class ListLogicTableRouteConfigResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("LogicTableRouteConfigList")
    private LogicTableRouteConfigList logicTableRouteConfigList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListLogicTableRouteConfigResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.logicTableRouteConfigList = builder.logicTableRouteConfigList;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLogicTableRouteConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return logicTableRouteConfigList
     */
    public LogicTableRouteConfigList getLogicTableRouteConfigList() {
        return this.logicTableRouteConfigList;
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
        private String errorCode; 
        private String errorMessage; 
        private LogicTableRouteConfigList logicTableRouteConfigList; 
        private String requestId; 
        private Boolean success; 

        /**
         * The error code returned.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The routing algorithms.
         */
        public Builder logicTableRouteConfigList(LogicTableRouteConfigList logicTableRouteConfigList) {
            this.logicTableRouteConfigList = logicTableRouteConfigList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * - **true**: The request was successful.
         * - **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListLogicTableRouteConfigResponseBody build() {
            return new ListLogicTableRouteConfigResponseBody(this);
        } 

    } 

    public static class LogicTableRouteConfig extends TeaModel {
        @NameInMap("RouteExpr")
        private String routeExpr;

        @NameInMap("RouteKey")
        private String routeKey;

        @NameInMap("TableId")
        private Long tableId;

        private LogicTableRouteConfig(Builder builder) {
            this.routeExpr = builder.routeExpr;
            this.routeKey = builder.routeKey;
            this.tableId = builder.tableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogicTableRouteConfig create() {
            return builder().build();
        }

        /**
         * @return routeExpr
         */
        public String getRouteExpr() {
            return this.routeExpr;
        }

        /**
         * @return routeKey
         */
        public String getRouteKey() {
            return this.routeKey;
        }

        /**
         * @return tableId
         */
        public Long getTableId() {
            return this.tableId;
        }

        public static final class Builder {
            private String routeExpr; 
            private String routeKey; 
            private Long tableId; 

            /**
             * The routing algorithm expression.
             */
            public Builder routeExpr(String routeExpr) {
                this.routeExpr = routeExpr;
                return this;
            }

            /**
             * The unique key of the routing algorithm.
             */
            public Builder routeKey(String routeKey) {
                this.routeKey = routeKey;
                return this;
            }

            /**
             * The ID of the logical table.
             */
            public Builder tableId(Long tableId) {
                this.tableId = tableId;
                return this;
            }

            public LogicTableRouteConfig build() {
                return new LogicTableRouteConfig(this);
            } 

        } 

    }
    public static class LogicTableRouteConfigList extends TeaModel {
        @NameInMap("LogicTableRouteConfig")
        private java.util.List < LogicTableRouteConfig> logicTableRouteConfig;

        private LogicTableRouteConfigList(Builder builder) {
            this.logicTableRouteConfig = builder.logicTableRouteConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogicTableRouteConfigList create() {
            return builder().build();
        }

        /**
         * @return logicTableRouteConfig
         */
        public java.util.List < LogicTableRouteConfig> getLogicTableRouteConfig() {
            return this.logicTableRouteConfig;
        }

        public static final class Builder {
            private java.util.List < LogicTableRouteConfig> logicTableRouteConfig; 

            /**
             * LogicTableRouteConfig.
             */
            public Builder logicTableRouteConfig(java.util.List < LogicTableRouteConfig> logicTableRouteConfig) {
                this.logicTableRouteConfig = logicTableRouteConfig;
                return this;
            }

            public LogicTableRouteConfigList build() {
                return new LogicTableRouteConfigList(this);
            } 

        } 

    }
}
