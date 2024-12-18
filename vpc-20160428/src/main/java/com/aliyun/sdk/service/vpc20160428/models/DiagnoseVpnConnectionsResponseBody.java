// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
    private java.util.List<VpnConnections> vpnConnections;

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
    public java.util.List<VpnConnections> getVpnConnections() {
        return this.vpnConnections;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<VpnConnections> vpnConnections; 

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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B8094E1E-935B-1397-96A8-4F87A5D1BF29</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The diagnostic information.</p>
         */
        public Builder vpnConnections(java.util.List<VpnConnections> vpnConnections) {
            this.vpnConnections = vpnConnections;
            return this;
        }

        public DiagnoseVpnConnectionsResponseBody build() {
            return new DiagnoseVpnConnectionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DiagnoseVpnConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>DiagnoseVpnConnectionsResponseBody</p>
     */
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
             * <p>The cause of the error.</p>
             * 
             * <strong>example:</strong>
             * <p>Phase1 negotiation timeout</p>
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>Phase1NegotiationTimeout</p>
             */
            public Builder failedReasonCode(String failedReasonCode) {
                this.failedReasonCode = failedReasonCode;
                return this;
            }

            /**
             * <p>The timestamp when the current error occurred on the IPsec-VPN connection. Unit: millisecond.</p>
             * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1673581161000</p>
             */
            public Builder failedTime(Long failedTime) {
                this.failedTime = failedTime;
                return this;
            }

            /**
             * <p>If the values of the parameters configured for the IPsec-VPN connection and the peer gateway device do not match, this parameter indicates the value of the parameters configured for the IPsec-VPN connection.</p>
             * 
             * <strong>example:</strong>
             * <p>SHA256</p>
             */
            public Builder mismatchLocalParam(String mismatchLocalParam) {
                this.mismatchLocalParam = mismatchLocalParam;
                return this;
            }

            /**
             * <p>If the parameter values configured for the IPsec-VPN connection and the peer gateway device do not match, this parameter indicates the value of the parameter configured for the peer gateway device.</p>
             * 
             * <strong>example:</strong>
             * <p>SHA</p>
             */
            public Builder mismatchRemoteParam(String mismatchRemoteParam) {
                this.mismatchRemoteParam = mismatchRemoteParam;
                return this;
            }

            /**
             * <p>The error level. Valid values:</p>
             * <ul>
             * <li><strong>Critical</strong></li>
             * <li><strong>Warn</strong></li>
             * <li><strong>Normal</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Warn</p>
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * <p>The log information about the error.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-13 11:39:21 vco-bp1spxu8hlcvpd7ry**** [PROTO_ERR]: ikev1.c:1433:isakmp_ph1resend(): phase1 negotiation failed due to time up. [{remote id:4}{ph1: 172.16.0.88[500] &lt;=&gt; 192.168.0.206[500], 172.16.0.88 &lt;=&gt; 192.168.0.206}]</p>
             */
            public Builder sourceLog(String sourceLog) {
                this.sourceLog = sourceLog;
                return this;
            }

            /**
             * <p>The tunnel ID.</p>
             * 
             * <strong>example:</strong>
             * <p>tun-64n1sr9dig64k6****</p>
             */
            public Builder tunnelId(String tunnelId) {
                this.tunnelId = tunnelId;
                return this;
            }

            /**
             * <p>The ID of the IPsec-VPN connection.</p>
             * 
             * <strong>example:</strong>
             * <p>vco-bp1spxu8hlcvpd7ry****</p>
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
