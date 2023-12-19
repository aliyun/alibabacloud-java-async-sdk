// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DiagnoseVpnConnectionsResponseBody} extends {@link TeaModel}
 *
 * <p>DiagnoseVpnConnectionsResponseBody</p>
 */
public class DiagnoseVpnConnectionsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("VpnConnections")
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * VpnConnections.
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
        @NameInMap("FailedReason")
        private String failedReason;

        @NameInMap("FailedReasonCode")
        private String failedReasonCode;

        @NameInMap("FailedTime")
        private Long failedTime;

        @NameInMap("MismatchLocalParam")
        private String mismatchLocalParam;

        @NameInMap("MismatchRemoteParam")
        private String mismatchRemoteParam;

        @NameInMap("Severity")
        private String severity;

        @NameInMap("SourceLog")
        private String sourceLog;

        @NameInMap("TunnelId")
        private String tunnelId;

        @NameInMap("VpnConnectionId")
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
             * FailedReason.
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * FailedReasonCode.
             */
            public Builder failedReasonCode(String failedReasonCode) {
                this.failedReasonCode = failedReasonCode;
                return this;
            }

            /**
             * FailedTime.
             */
            public Builder failedTime(Long failedTime) {
                this.failedTime = failedTime;
                return this;
            }

            /**
             * MismatchLocalParam.
             */
            public Builder mismatchLocalParam(String mismatchLocalParam) {
                this.mismatchLocalParam = mismatchLocalParam;
                return this;
            }

            /**
             * MismatchRemoteParam.
             */
            public Builder mismatchRemoteParam(String mismatchRemoteParam) {
                this.mismatchRemoteParam = mismatchRemoteParam;
                return this;
            }

            /**
             * Severity.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * SourceLog.
             */
            public Builder sourceLog(String sourceLog) {
                this.sourceLog = sourceLog;
                return this;
            }

            /**
             * TunnelId.
             */
            public Builder tunnelId(String tunnelId) {
                this.tunnelId = tunnelId;
                return this;
            }

            /**
             * VpnConnectionId.
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
