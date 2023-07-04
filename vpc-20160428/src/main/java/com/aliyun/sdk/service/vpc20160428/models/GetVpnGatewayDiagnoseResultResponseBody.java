// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVpnGatewayDiagnoseResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetVpnGatewayDiagnoseResultResponseBody</p>
 */
public class GetVpnGatewayDiagnoseResultResponseBody extends TeaModel {
    @NameInMap("BeginTime")
    private String beginTime;

    @NameInMap("DiagnoseId")
    private String diagnoseId;

    @NameInMap("DiagnoseResult")
    private java.util.List < DiagnoseResult> diagnoseResult;

    @NameInMap("FinishTime")
    private String finishTime;

    @NameInMap("FinishedCount")
    private Integer finishedCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceInstanceId")
    private String resourceInstanceId;

    @NameInMap("ResourceType")
    private String resourceType;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("VpnGatewayId")
    private String vpnGatewayId;

    private GetVpnGatewayDiagnoseResultResponseBody(Builder builder) {
        this.beginTime = builder.beginTime;
        this.diagnoseId = builder.diagnoseId;
        this.diagnoseResult = builder.diagnoseResult;
        this.finishTime = builder.finishTime;
        this.finishedCount = builder.finishedCount;
        this.requestId = builder.requestId;
        this.resourceInstanceId = builder.resourceInstanceId;
        this.resourceType = builder.resourceType;
        this.totalCount = builder.totalCount;
        this.vpnGatewayId = builder.vpnGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVpnGatewayDiagnoseResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return beginTime
     */
    public String getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return diagnoseId
     */
    public String getDiagnoseId() {
        return this.diagnoseId;
    }

    /**
     * @return diagnoseResult
     */
    public java.util.List < DiagnoseResult> getDiagnoseResult() {
        return this.diagnoseResult;
    }

    /**
     * @return finishTime
     */
    public String getFinishTime() {
        return this.finishTime;
    }

    /**
     * @return finishedCount
     */
    public Integer getFinishedCount() {
        return this.finishedCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceInstanceId
     */
    public String getResourceInstanceId() {
        return this.resourceInstanceId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return vpnGatewayId
     */
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public static final class Builder {
        private String beginTime; 
        private String diagnoseId; 
        private java.util.List < DiagnoseResult> diagnoseResult; 
        private String finishTime; 
        private Integer finishedCount; 
        private String requestId; 
        private String resourceInstanceId; 
        private String resourceType; 
        private Integer totalCount; 
        private String vpnGatewayId; 

        /**
         * The time when the diagnostic started.
         * <p>
         * 
         * The time follows the ISO8601 standard in the `YYYY-MM-DDThh:mm:ssZ` format. The time is displayed in UTC.
         */
        public Builder beginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }

        /**
         * The ID of the diagnostic.
         */
        public Builder diagnoseId(String diagnoseId) {
            this.diagnoseId = diagnoseId;
            return this;
        }

        /**
         * The information about the diagnostic items.
         */
        public Builder diagnoseResult(java.util.List < DiagnoseResult> diagnoseResult) {
            this.diagnoseResult = diagnoseResult;
            return this;
        }

        /**
         * The timestamp when the system finishes diagnosing the item.
         * <p>
         * 
         * The time follows the ISO8601 standard in the `YYYY-MM-DDThh:mm:ssZ` format. The time is displayed in UTC.
         */
        public Builder finishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }

        /**
         * The number of diagnostic items that have been diagnosed.
         */
        public Builder finishedCount(Integer finishedCount) {
            this.finishedCount = finishedCount;
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
         * The ID of the resource that is diagnosed.
         */
        public Builder resourceInstanceId(String resourceInstanceId) {
            this.resourceInstanceId = resourceInstanceId;
            return this;
        }

        /**
         * The type of the resource.
         * <p>
         * 
         * The value is set to **IPsec**, which indicates an IPsec-VPN connection.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The total number of diagnostic items.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The ID of the VPN gateway.
         */
        public Builder vpnGatewayId(String vpnGatewayId) {
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }

        public GetVpnGatewayDiagnoseResultResponseBody build() {
            return new GetVpnGatewayDiagnoseResultResponseBody(this);
        } 

    } 

    public static class DiagnoseResult extends TeaModel {
        @NameInMap("DiagnoseName")
        private String diagnoseName;

        @NameInMap("DiagnoseResultDescription")
        private String diagnoseResultDescription;

        @NameInMap("DiagnoseResultLevel")
        private String diagnoseResultLevel;

        private DiagnoseResult(Builder builder) {
            this.diagnoseName = builder.diagnoseName;
            this.diagnoseResultDescription = builder.diagnoseResultDescription;
            this.diagnoseResultLevel = builder.diagnoseResultLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiagnoseResult create() {
            return builder().build();
        }

        /**
         * @return diagnoseName
         */
        public String getDiagnoseName() {
            return this.diagnoseName;
        }

        /**
         * @return diagnoseResultDescription
         */
        public String getDiagnoseResultDescription() {
            return this.diagnoseResultDescription;
        }

        /**
         * @return diagnoseResultLevel
         */
        public String getDiagnoseResultLevel() {
            return this.diagnoseResultLevel;
        }

        public static final class Builder {
            private String diagnoseName; 
            private String diagnoseResultDescription; 
            private String diagnoseResultLevel; 

            /**
             * The diagnostic item.
             * <p>
             * 
             * *   **RouteEntryConflict**: route conflicts.
             * *   **VpnRouteQuota**: the quota of destination-based routes for the VPN gateway.
             * *   **VpnIPsecQuota**: the quota of IPsec-VPN connections for the VPN gateway.
             * *   **VpnPbrRouteQuota**: the quota of policy-based routes for the VPN gateway.
             * *   **VcoConfigConsistency**: the consistency of the IPsec-VPN connection.
             * *   **VcoUserInternetIpConnectivity**: Internet connectivity of the customer gateway.
             * *   **VcoPrivateConnectivity**: private network connectivity.
             * 
             * For more information about the diagnostic items, see [Background information about quick diagnostics](~~190330~~).
             */
            public Builder diagnoseName(String diagnoseName) {
                this.diagnoseName = diagnoseName;
                return this;
            }

            /**
             * The diagnostic result.
             * <p>
             * 
             * The system returns different results for each diagnostic item.
             * 
             * *   **RouteEntryConflict**: information about route conflicts.
             * 
             * *   **VpnRouteQuota**:
             * 
             *     *   **quotaName**: the quota ID of destination-based routes.
             *     *   **quantity**: the quota of destination-based routes for the VPN gateway.
             *     *   **used**: the number of destination-based routes created for the VPN gateway.
             * 
             * *   **VpnIPsecQuota**:
             * 
             *     *   **quotaName**: the quota ID of IPsec-VPN connections.
             *     *   **quantity**: the quota of IPsec-VPN connections for the VPN gateway.
             *     *   **used**: the number of IPsec-VPN connections created for the VPN gateway.
             * 
             * *   **VpnPbrRouteQuota**:
             * 
             *     *   **quotaName**: the quota ID of policy-based routes.
             *     *   **quantity**: the quota of policy-based routes for the VPN gateway.
             *     *   **used**: the number of policy-based routes created for the VPN gateway.
             * 
             * *   **VcoConfigConsistency**:
             * 
             *     *   **vcoLackConf**: The system cannot obtain the configuration of the peer of the IPsec-VPN connection.
             *     *   **vcoRunningConf**: the configurations that have been added to the peer of the IPsec-VPN connection.
             *     *   **vcoDiffConf**: the configurations that are inconsistent between the local end and the peer.
             *     *   **vcoConf**: the configurations that have been added to the local end.
             * 
             * *   **VcoUserInternetIpConnectivity**:
             * 
             *     *   **targetIp**: the public IP address of the customer gateway.
             *     *   **rtt**: the latency when the system accesses the public IP address of the customer gateway. Unit: milliseconds.
             *     *   **lossRate**: the packet loss when the system accesses the public IP address of the customer gateway.
             * 
             * *   **VcoPrivateConnectivity**:
             * 
             *     *   **targetIp**: the source IP address.
             *     *   **srcIp**: the destination IP address.
             *     *   **rtt**: the latency when the source IP address accesses the destination IP address. Unit: milliseconds.
             *     *   **lossRate**: the packet loss when the source IP address accesses the destination IP address.
             */
            public Builder diagnoseResultDescription(String diagnoseResultDescription) {
                this.diagnoseResultDescription = diagnoseResultDescription;
                return this;
            }

            /**
             * The diagnostic result level.
             * <p>
             * 
             * *   **normal**
             * *   **warning**
             * *   **error**
             * 
             * For more information, see [Background information about quick diagnostics](~~190330~~).
             */
            public Builder diagnoseResultLevel(String diagnoseResultLevel) {
                this.diagnoseResultLevel = diagnoseResultLevel;
                return this;
            }

            public DiagnoseResult build() {
                return new DiagnoseResult(this);
            } 

        } 

    }
}
