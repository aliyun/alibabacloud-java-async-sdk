// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ListLogicTableRouteConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ListLogicTableRouteConfigResponseBody</p>
 */
public class ListLogicTableRouteConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("LogicTableRouteConfigList")
    private LogicTableRouteConfigList logicTableRouteConfigList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The error code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>MissingTableId</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>TableId is mandatory for this action.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The routing algorithms.</p>
         */
        public Builder logicTableRouteConfigList(LogicTableRouteConfigList logicTableRouteConfigList) {
            this.logicTableRouteConfigList = logicTableRouteConfigList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7C6A0D7D-B034-59F6-854C-32425AC6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListLogicTableRouteConfigResponseBody build() {
            return new ListLogicTableRouteConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLogicTableRouteConfigResponseBody} extends {@link TeaModel}
     *
     * <p>ListLogicTableRouteConfigResponseBody</p>
     */
    public static class LogicTableRouteConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RouteExpr")
        private String routeExpr;

        @com.aliyun.core.annotation.NameInMap("RouteKey")
        private String routeKey;

        @com.aliyun.core.annotation.NameInMap("TableId")
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
             * <p>The routing algorithm expression.</p>
             * 
             * <strong>example:</strong>
             * <p>#id#%16\t</p>
             */
            public Builder routeExpr(String routeExpr) {
                this.routeExpr = routeExpr;
                return this;
            }

            /**
             * <p>The unique key of the routing algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder routeKey(String routeKey) {
                this.routeKey = routeKey;
                return this;
            }

            /**
             * <p>The ID of the logical table.</p>
             * 
             * <strong>example:</strong>
             * <p>4****</p>
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
    /**
     * 
     * {@link ListLogicTableRouteConfigResponseBody} extends {@link TeaModel}
     *
     * <p>ListLogicTableRouteConfigResponseBody</p>
     */
    public static class LogicTableRouteConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogicTableRouteConfig")
        private java.util.List<LogicTableRouteConfig> logicTableRouteConfig;

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
        public java.util.List<LogicTableRouteConfig> getLogicTableRouteConfig() {
            return this.logicTableRouteConfig;
        }

        public static final class Builder {
            private java.util.List<LogicTableRouteConfig> logicTableRouteConfig; 

            /**
             * LogicTableRouteConfig.
             */
            public Builder logicTableRouteConfig(java.util.List<LogicTableRouteConfig> logicTableRouteConfig) {
                this.logicTableRouteConfig = logicTableRouteConfig;
                return this;
            }

            public LogicTableRouteConfigList build() {
                return new LogicTableRouteConfigList(this);
            } 

        } 

    }
}
