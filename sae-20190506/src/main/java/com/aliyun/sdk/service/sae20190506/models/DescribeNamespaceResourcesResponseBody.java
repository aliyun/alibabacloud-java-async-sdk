// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNamespaceResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNamespaceResourcesResponseBody</p>
 */
public class DescribeNamespaceResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

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

    private DescribeNamespaceResourcesResponseBody(Builder builder) {
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

    public static DescribeNamespaceResourcesResponseBody create() {
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
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * The HTTP status code. Valid values:
         * <p>
         * 
         * *   **2xx**: indicates that the request was successful.
         * *   **3xx**: indicates that the request was redirected.
         * *   **4xx**: indicates that the request failed.
         * *   **5xx**: indicates that a server error occurred.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code.
         * <p>
         * 
         * *   The **ErrorCode** parameter is not returned when the request succeeds.
         * *   The **ErrorCode** parameter is returned when the request fails. For more information, see **Error codes** in this topic.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * *   **success** is returned when the request succeeds.
         * *   An error code is returned when the request fails.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Indicates whether the information about resources in the namespace was queried successfully. Valid values:
         * <p>
         * 
         * *   **true**: indicates that the query was successful.
         * *   **false**: indicates that the query failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The ID of the trace. It can be used to query the details of a request.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeNamespaceResourcesResponseBody build() {
            return new DescribeNamespaceResourcesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppCount")
        private Long appCount;

        @com.aliyun.core.annotation.NameInMap("BelongRegion")
        private String belongRegion;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("JumpServerAppId")
        private String jumpServerAppId;

        @com.aliyun.core.annotation.NameInMap("JumpServerIp")
        private String jumpServerIp;

        @com.aliyun.core.annotation.NameInMap("LastChangeOrderId")
        private String lastChangeOrderId;

        @com.aliyun.core.annotation.NameInMap("LastChangeOrderRunning")
        private Boolean lastChangeOrderRunning;

        @com.aliyun.core.annotation.NameInMap("LastChangeOrderStatus")
        private String lastChangeOrderStatus;

        @com.aliyun.core.annotation.NameInMap("NameSpaceShortId")
        private String nameSpaceShortId;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("NamespaceName")
        private String namespaceName;

        @com.aliyun.core.annotation.NameInMap("NotificationExpired")
        private Boolean notificationExpired;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VSwitchName")
        private String vSwitchName;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcName")
        private String vpcName;

        private Data(Builder builder) {
            this.appCount = builder.appCount;
            this.belongRegion = builder.belongRegion;
            this.description = builder.description;
            this.jumpServerAppId = builder.jumpServerAppId;
            this.jumpServerIp = builder.jumpServerIp;
            this.lastChangeOrderId = builder.lastChangeOrderId;
            this.lastChangeOrderRunning = builder.lastChangeOrderRunning;
            this.lastChangeOrderStatus = builder.lastChangeOrderStatus;
            this.nameSpaceShortId = builder.nameSpaceShortId;
            this.namespaceId = builder.namespaceId;
            this.namespaceName = builder.namespaceName;
            this.notificationExpired = builder.notificationExpired;
            this.securityGroupId = builder.securityGroupId;
            this.tenantId = builder.tenantId;
            this.userId = builder.userId;
            this.vSwitchId = builder.vSwitchId;
            this.vSwitchName = builder.vSwitchName;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appCount
         */
        public Long getAppCount() {
            return this.appCount;
        }

        /**
         * @return belongRegion
         */
        public String getBelongRegion() {
            return this.belongRegion;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return jumpServerAppId
         */
        public String getJumpServerAppId() {
            return this.jumpServerAppId;
        }

        /**
         * @return jumpServerIp
         */
        public String getJumpServerIp() {
            return this.jumpServerIp;
        }

        /**
         * @return lastChangeOrderId
         */
        public String getLastChangeOrderId() {
            return this.lastChangeOrderId;
        }

        /**
         * @return lastChangeOrderRunning
         */
        public Boolean getLastChangeOrderRunning() {
            return this.lastChangeOrderRunning;
        }

        /**
         * @return lastChangeOrderStatus
         */
        public String getLastChangeOrderStatus() {
            return this.lastChangeOrderStatus;
        }

        /**
         * @return nameSpaceShortId
         */
        public String getNameSpaceShortId() {
            return this.nameSpaceShortId;
        }

        /**
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
        }

        /**
         * @return namespaceName
         */
        public String getNamespaceName() {
            return this.namespaceName;
        }

        /**
         * @return notificationExpired
         */
        public Boolean getNotificationExpired() {
            return this.notificationExpired;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vSwitchName
         */
        public String getVSwitchName() {
            return this.vSwitchName;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcName
         */
        public String getVpcName() {
            return this.vpcName;
        }

        public static final class Builder {
            private Long appCount; 
            private String belongRegion; 
            private String description; 
            private String jumpServerAppId; 
            private String jumpServerIp; 
            private String lastChangeOrderId; 
            private Boolean lastChangeOrderRunning; 
            private String lastChangeOrderStatus; 
            private String nameSpaceShortId; 
            private String namespaceId; 
            private String namespaceName; 
            private Boolean notificationExpired; 
            private String securityGroupId; 
            private String tenantId; 
            private String userId; 
            private String vSwitchId; 
            private String vSwitchName; 
            private String vpcId; 
            private String vpcName; 

            /**
             * The number of applications.
             */
            public Builder appCount(Long appCount) {
                this.appCount = appCount;
                return this;
            }

            /**
             * The region to which the namespace belongs.
             */
            public Builder belongRegion(String belongRegion) {
                this.belongRegion = belongRegion;
                return this;
            }

            /**
             * The description of the namespace.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the jump server application.
             */
            public Builder jumpServerAppId(String jumpServerAppId) {
                this.jumpServerAppId = jumpServerAppId;
                return this;
            }

            /**
             * The IP address of the jump server.
             */
            public Builder jumpServerIp(String jumpServerIp) {
                this.jumpServerIp = jumpServerIp;
                return this;
            }

            /**
             * The ID of the change order.
             */
            public Builder lastChangeOrderId(String lastChangeOrderId) {
                this.lastChangeOrderId = lastChangeOrderId;
                return this;
            }

            /**
             * Indicates whether a change order is being executed in the namespace. Valid values:
             * <p>
             * 
             * *   **true**: indicates that a change order is being executed in the namespace.
             * *   **false**: indicates that no change orders are being executed in the namespace.
             */
            public Builder lastChangeOrderRunning(Boolean lastChangeOrderRunning) {
                this.lastChangeOrderRunning = lastChangeOrderRunning;
                return this;
            }

            /**
             * The status of the latest change order. Valid values:
             * <p>
             * 
             * *   **READY**: The change order is ready.
             * *   **RUNNING**: The change order is being executed.
             * *   **SUCCESS**: The change order was executed.
             * *   **FAIL**: The change order could not be executed.
             * *   **ABORT**: The change order was terminated.
             * *   **WAIT_BATCH_CONFIRM**: The change order is pending execution. You must manually confirm the release batch.
             * *   **AUTO_BATCH_WAIT**: The change order is pending execution. SAE will automatically confirm the release batch.
             * *   **SYSTEM_FAIL**: A system exception occurred.
             * *   **WAIT_APPROVAL**: The change order is pending approval.
             * *   **APPROVED**: The change order is approved and is pending execution.
             */
            public Builder lastChangeOrderStatus(String lastChangeOrderStatus) {
                this.lastChangeOrderStatus = lastChangeOrderStatus;
                return this;
            }

            /**
             * NameSpaceShortId.
             */
            public Builder nameSpaceShortId(String nameSpaceShortId) {
                this.nameSpaceShortId = nameSpaceShortId;
                return this;
            }

            /**
             * The ID of the namespace.
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * The name of the namespace.
             */
            public Builder namespaceName(String namespaceName) {
                this.namespaceName = namespaceName;
                return this;
            }

            /**
             * Indicates whether the notification of a change order is expired. Valid values:
             * <p>
             * 
             * *   **true**: indicates that the notification is expired.
             * *   **false**: indicates that the notification is not expired.
             */
            public Builder notificationExpired(Boolean notificationExpired) {
                this.notificationExpired = notificationExpired;
                return this;
            }

            /**
             * The ID of the security group.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The ID of the tenant in the SAE namespace.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * The ID of the user.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The ID of the vSwitch.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The name of the vSwitch.
             */
            public Builder vSwitchName(String vSwitchName) {
                this.vSwitchName = vSwitchName;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC).
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The name of the VPC.
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
