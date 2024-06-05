// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_dg20230914.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserGatewayInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserGatewayInstancesResponseBody</p>
 */
public class GetUserGatewayInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("GatewayInstanceList")
    private java.util.List < GatewayInstanceList> gatewayInstanceList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetUserGatewayInstancesResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorMsg = builder.errorMsg;
        this.gatewayInstanceList = builder.gatewayInstanceList;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserGatewayInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return gatewayInstanceList
     */
    public java.util.List < GatewayInstanceList> getGatewayInstanceList() {
        return this.gatewayInstanceList;
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
        private String errorMsg; 
        private java.util.List < GatewayInstanceList> gatewayInstanceList; 
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
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * GatewayInstanceList.
         */
        public Builder gatewayInstanceList(java.util.List < GatewayInstanceList> gatewayInstanceList) {
            this.gatewayInstanceList = gatewayInstanceList;
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

        public GetUserGatewayInstancesResponseBody build() {
            return new GetUserGatewayInstancesResponseBody(this);
        } 

    } 

    public static class GatewayInstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectEndpointType")
        private String connectEndpointType;

        @com.aliyun.core.annotation.NameInMap("CurrentDaemonVersion")
        private String currentDaemonVersion;

        @com.aliyun.core.annotation.NameInMap("CurrentVersion")
        private String currentVersion;

        @com.aliyun.core.annotation.NameInMap("EndPoint")
        private String endPoint;

        @com.aliyun.core.annotation.NameInMap("GatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("GatewayInstanceId")
        private String gatewayInstanceId;

        @com.aliyun.core.annotation.NameInMap("GatewayInstanceStatus")
        private String gatewayInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("LastUpdateTime")
        private Long lastUpdateTime;

        @com.aliyun.core.annotation.NameInMap("LocalIP")
        private String localIP;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("OutputIP")
        private String outputIP;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private GatewayInstanceList(Builder builder) {
            this.connectEndpointType = builder.connectEndpointType;
            this.currentDaemonVersion = builder.currentDaemonVersion;
            this.currentVersion = builder.currentVersion;
            this.endPoint = builder.endPoint;
            this.gatewayId = builder.gatewayId;
            this.gatewayInstanceId = builder.gatewayInstanceId;
            this.gatewayInstanceStatus = builder.gatewayInstanceStatus;
            this.lastUpdateTime = builder.lastUpdateTime;
            this.localIP = builder.localIP;
            this.message = builder.message;
            this.outputIP = builder.outputIP;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GatewayInstanceList create() {
            return builder().build();
        }

        /**
         * @return connectEndpointType
         */
        public String getConnectEndpointType() {
            return this.connectEndpointType;
        }

        /**
         * @return currentDaemonVersion
         */
        public String getCurrentDaemonVersion() {
            return this.currentDaemonVersion;
        }

        /**
         * @return currentVersion
         */
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        /**
         * @return endPoint
         */
        public String getEndPoint() {
            return this.endPoint;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return gatewayInstanceId
         */
        public String getGatewayInstanceId() {
            return this.gatewayInstanceId;
        }

        /**
         * @return gatewayInstanceStatus
         */
        public String getGatewayInstanceStatus() {
            return this.gatewayInstanceStatus;
        }

        /**
         * @return lastUpdateTime
         */
        public Long getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        /**
         * @return localIP
         */
        public String getLocalIP() {
            return this.localIP;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return outputIP
         */
        public String getOutputIP() {
            return this.outputIP;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String connectEndpointType; 
            private String currentDaemonVersion; 
            private String currentVersion; 
            private String endPoint; 
            private String gatewayId; 
            private String gatewayInstanceId; 
            private String gatewayInstanceStatus; 
            private Long lastUpdateTime; 
            private String localIP; 
            private String message; 
            private String outputIP; 
            private String regionId; 

            /**
             * 连接类型
             */
            public Builder connectEndpointType(String connectEndpointType) {
                this.connectEndpointType = connectEndpointType;
                return this;
            }

            /**
             * 进程的版本号
             */
            public Builder currentDaemonVersion(String currentDaemonVersion) {
                this.currentDaemonVersion = currentDaemonVersion;
                return this;
            }

            /**
             * 版本号
             */
            public Builder currentVersion(String currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * 端点地址
             */
            public Builder endPoint(String endPoint) {
                this.endPoint = endPoint;
                return this;
            }

            /**
             * 网关ID
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * 代表资源一级ID的资源属性字段
             */
            public Builder gatewayInstanceId(String gatewayInstanceId) {
                this.gatewayInstanceId = gatewayInstanceId;
                return this;
            }

            /**
             * GatewayInstanceStatus.
             */
            public Builder gatewayInstanceStatus(String gatewayInstanceStatus) {
                this.gatewayInstanceStatus = gatewayInstanceStatus;
                return this;
            }

            /**
             * 上次更新时间戳
             */
            public Builder lastUpdateTime(Long lastUpdateTime) {
                this.lastUpdateTime = lastUpdateTime;
                return this;
            }

            /**
             * 本地IP地址
             */
            public Builder localIP(String localIP) {
                this.localIP = localIP;
                return this;
            }

            /**
             * 提示信息
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * 主机
             */
            public Builder outputIP(String outputIP) {
                this.outputIP = outputIP;
                return this;
            }

            /**
             * 代表region的资源属性字段
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public GatewayInstanceList build() {
                return new GatewayInstanceList(this);
            } 

        } 

    }
}
