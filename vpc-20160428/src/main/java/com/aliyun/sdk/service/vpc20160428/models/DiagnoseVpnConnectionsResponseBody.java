// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DiagnoseVpnConnectionsResponseBody} extends {@link TeaModel}
 *
 * <p>DiagnoseVpnConnectionsResponseBody</p>
 */
public class DiagnoseVpnConnectionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VpnConnections")
    private java.util.List < VpnConnections> vpnConnections;

    private DiagnoseVpnConnectionsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vpnConnections = builder.vpnConnections;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DiagnoseVpnConnectionsResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return vpnConnections
     */
    public java.util.List < VpnConnections> getVpnConnections() {
        return this.vpnConnections;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < VpnConnections> vpnConnections; 

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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The diagnostic information.
         */
        public Builder vpnConnections(java.util.List < VpnConnections> vpnConnections) {
            this.vpnConnections = vpnConnections;
            return this;
        }

        public DiagnoseVpnConnectionsResponseBody build() {
            return new DiagnoseVpnConnectionsResponseBody(this);
        } 

    } 

    public static class VpnConnections extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedReason")
        private String failedReason;

        @com.aliyun.core.annotation.NameInMap("FailedReasonCode")
        private String failedReasonCode;

        @com.aliyun.core.annotation.NameInMap("FailedTime")
        private Long failedTime;

        @com.aliyun.core.annotation.NameInMap("MismatchLocalParam")
        private String mismatchLocalParam;

        @com.aliyun.core.annotation.NameInMap("MismatchRemoteParam")
        private String mismatchRemoteParam;

        @com.aliyun.core.annotation.NameInMap("Severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("SourceLog")
        private String sourceLog;

        @com.aliyun.core.annotation.NameInMap("TunnelId")
        private String tunnelId;

        @com.aliyun.core.annotation.NameInMap("VpnConnectionId")
        private String vpnConnectionId;

        private VpnConnections(Builder builder) {
            this.failedReason = builder.failedReason;
            this.failedReasonCode = builder.failedReasonCode;
            this.failedTime = builder.failedTime;
            this.mismatchLocalParam = builder.mismatchLocalParam;
            this.mismatchRemoteParam = builder.mismatchRemoteParam;
            this.severity = builder.severity;
            this.sourceLog = builder.sourceLog;
            this.tunnelId = builder.tunnelId;
            this.vpnConnectionId = builder.vpnConnectionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpnConnections create() {
            return builder().build();
        }

        /**
         * @return failedReason
         */
        public String getFailedReason() {
            return this.failedReason;
        }

        /**
         * @return failedReasonCode
         */
        public String getFailedReasonCode() {
            return this.failedReasonCode;
        }

        /**
         * @return failedTime
         */
        public Long getFailedTime() {
            return this.failedTime;
        }

        /**
         * @return mismatchLocalParam
         */
        public String getMismatchLocalParam() {
            return this.mismatchLocalParam;
        }

        /**
         * @return mismatchRemoteParam
         */
        public String getMismatchRemoteParam() {
            return this.mismatchRemoteParam;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return sourceLog
         */
        public String getSourceLog() {
            return this.sourceLog;
        }

        /**
         * @return tunnelId
         */
        public String getTunnelId() {
            return this.tunnelId;
        }

        /**
         * @return vpnConnectionId
         */
        public String getVpnConnectionId() {
            return this.vpnConnectionId;
        }

        public static final class Builder {
            private String failedReason; 
            private String failedReasonCode; 
            private Long failedTime; 
            private String mismatchLocalParam; 
            private String mismatchRemoteParam; 
            private String severity; 
            private String sourceLog; 
            private String tunnelId; 
            private String vpnConnectionId; 

            /**
             * The cause of the error.
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * The error code.
             */
            public Builder failedReasonCode(String failedReasonCode) {
                this.failedReasonCode = failedReasonCode;
                return this;
            }

            /**
             * The timestamp when the current error occurred on the IPsec-VPN connection. Unit: millisecond.
             * <p>
             * 
             * This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder failedTime(Long failedTime) {
                this.failedTime = failedTime;
                return this;
            }

            /**
             * If the values of the parameters configured for the IPsec-VPN connection and the peer gateway device do not match, this parameter indicates the value of the parameters configured for the IPsec-VPN connection.
             */
            public Builder mismatchLocalParam(String mismatchLocalParam) {
                this.mismatchLocalParam = mismatchLocalParam;
                return this;
            }

            /**
             * If the parameter values configured for the IPsec-VPN connection and the peer gateway device do not match, this parameter indicates the value of the parameter configured for the peer gateway device.
             */
            public Builder mismatchRemoteParam(String mismatchRemoteParam) {
                this.mismatchRemoteParam = mismatchRemoteParam;
                return this;
            }

            /**
             * The error level. Valid values:
             * <p>
             * 
             * *   **Critical**
             * *   **Warn**
             * *   **Normal**
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * The log information about the error.
             */
            public Builder sourceLog(String sourceLog) {
                this.sourceLog = sourceLog;
                return this;
            }

            /**
             * The tunnel ID.
             */
            public Builder tunnelId(String tunnelId) {
                this.tunnelId = tunnelId;
                return this;
            }

            /**
             * The ID of the IPsec-VPN connection.
             */
            public Builder vpnConnectionId(String vpnConnectionId) {
                this.vpnConnectionId = vpnConnectionId;
                return this;
            }

            public VpnConnections build() {
                return new VpnConnections(this);
            } 

        } 

    }
}
