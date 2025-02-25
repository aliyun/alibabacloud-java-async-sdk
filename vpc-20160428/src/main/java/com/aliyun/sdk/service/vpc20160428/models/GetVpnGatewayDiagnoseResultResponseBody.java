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
 * {@link GetVpnGatewayDiagnoseResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetVpnGatewayDiagnoseResultResponseBody</p>
 */
public class GetVpnGatewayDiagnoseResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    private String beginTime;

    @com.aliyun.core.annotation.NameInMap("DiagnoseId")
    private String diagnoseId;

    @com.aliyun.core.annotation.NameInMap("DiagnoseResult")
    private java.util.List<DiagnoseResult> diagnoseResult;

    @com.aliyun.core.annotation.NameInMap("FinishTime")
    private String finishTime;

    @com.aliyun.core.annotation.NameInMap("FinishedCount")
    private Integer finishedCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceInstanceId")
    private String resourceInstanceId;

    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VpnGatewayId")
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
    public java.util.List<DiagnoseResult> getDiagnoseResult() {
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
        private java.util.List<DiagnoseResult> diagnoseResult; 
        private String finishTime; 
        private Integer finishedCount; 
        private String requestId; 
        private String resourceInstanceId; 
        private String resourceType; 
        private Integer totalCount; 
        private String vpnGatewayId; 

        /**
         * <p>The time when the diagnostic started.</p>
         * <p>The time follows the ISO8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-15T05:28:57Z</p>
         */
        public Builder beginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>The ID of the diagnostic.</p>
         * 
         * <strong>example:</strong>
         * <p>vpndgn-uf6sgneym02lxyuv4****</p>
         */
        public Builder diagnoseId(String diagnoseId) {
            this.diagnoseId = diagnoseId;
            return this;
        }

        /**
         * <p>The information about the diagnostic items.</p>
         */
        public Builder diagnoseResult(java.util.List<DiagnoseResult> diagnoseResult) {
            this.diagnoseResult = diagnoseResult;
            return this;
        }

        /**
         * <p>The timestamp when the system finishes diagnosing the item.</p>
         * <p>The time follows the ISO8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-15T05:29:08Z</p>
         */
        public Builder finishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }

        /**
         * <p>The number of diagnostic items that have been diagnosed.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder finishedCount(Integer finishedCount) {
            this.finishedCount = finishedCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>312C4D5A-6563-5FC6-8C6E-A43A5A316FEB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource that is diagnosed.</p>
         * 
         * <strong>example:</strong>
         * <p>vco-uf6huqsu63azl7mdp****</p>
         */
        public Builder resourceInstanceId(String resourceInstanceId) {
            this.resourceInstanceId = resourceInstanceId;
            return this;
        }

        /**
         * <p>The type of the resource.</p>
         * <p>The value is set to <strong>IPsec</strong>, which indicates an IPsec-VPN connection.</p>
         * 
         * <strong>example:</strong>
         * <p>IPsec</p>
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The total number of diagnostic items.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The ID of the VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>vpn-uf6fzwp0ck3frwtbk****</p>
         */
        public Builder vpnGatewayId(String vpnGatewayId) {
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }

        public GetVpnGatewayDiagnoseResultResponseBody build() {
            return new GetVpnGatewayDiagnoseResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVpnGatewayDiagnoseResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetVpnGatewayDiagnoseResultResponseBody</p>
     */
    public static class DiagnoseResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiagnoseName")
        private String diagnoseName;

        @com.aliyun.core.annotation.NameInMap("DiagnoseResultDescription")
        private String diagnoseResultDescription;

        @com.aliyun.core.annotation.NameInMap("DiagnoseResultLevel")
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
             * <p>The diagnostic item.</p>
             * <ul>
             * <li><strong>RouteEntryConflict</strong>: route conflicts.</li>
             * <li><strong>VpnRouteQuota</strong>: the quota of destination-based routes for the VPN gateway.</li>
             * <li><strong>VpnIPsecQuota</strong>: the quota of IPsec-VPN connections for the VPN gateway.</li>
             * <li><strong>VpnPbrRouteQuota</strong>: the quota of policy-based routes for the VPN gateway.</li>
             * <li><strong>VcoConfigConsistency</strong>: the consistency of the IPsec-VPN connection.</li>
             * <li><strong>VcoUserInternetIpConnectivity</strong>: Internet connectivity of the customer gateway.</li>
             * <li><strong>VcoPrivateConnectivity</strong>: private network connectivity.</li>
             * </ul>
             * <p>For more information about the diagnostic items, see <a href="https://help.aliyun.com/document_detail/190330.html">Background information about quick diagnostics</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>RouteEntryConflict</p>
             */
            public Builder diagnoseName(String diagnoseName) {
                this.diagnoseName = diagnoseName;
                return this;
            }

            /**
             * <p>The diagnostic result.</p>
             * <p>The system returns different results for each diagnostic item.</p>
             * <ul>
             * <li><p><strong>RouteEntryConflict</strong>: information about route conflicts.</p>
             * </li>
             * <li><p><strong>VpnRouteQuota</strong>:</p>
             * <ul>
             * <li><strong>quotaName</strong>: the quota ID of destination-based routes.</li>
             * <li><strong>quantity</strong>: the quota of destination-based routes for the VPN gateway.</li>
             * <li><strong>used</strong>: the number of destination-based routes created for the VPN gateway.</li>
             * </ul>
             * </li>
             * <li><p><strong>VpnIPsecQuota</strong>:</p>
             * <ul>
             * <li><strong>quotaName</strong>: the quota ID of IPsec-VPN connections.</li>
             * <li><strong>quantity</strong>: the quota of IPsec-VPN connections for the VPN gateway.</li>
             * <li><strong>used</strong>: the number of IPsec-VPN connections created for the VPN gateway.</li>
             * </ul>
             * </li>
             * <li><p><strong>VpnPbrRouteQuota</strong>:</p>
             * <ul>
             * <li><strong>quotaName</strong>: the quota ID of policy-based routes.</li>
             * <li><strong>quantity</strong>: the quota of policy-based routes for the VPN gateway.</li>
             * <li><strong>used</strong>: the number of policy-based routes created for the VPN gateway.</li>
             * </ul>
             * </li>
             * <li><p><strong>VcoConfigConsistency</strong>:</p>
             * <ul>
             * <li><strong>vcoLackConf</strong>: The system cannot obtain the configuration of the peer of the IPsec-VPN connection.</li>
             * <li><strong>vcoRunningConf</strong>: the configurations that have been added to the peer of the IPsec-VPN connection.</li>
             * <li><strong>vcoDiffConf</strong>: the configurations that are inconsistent between the local end and the peer.</li>
             * <li><strong>vcoConf</strong>: the configurations that have been added to the local end.</li>
             * </ul>
             * </li>
             * <li><p><strong>VcoUserInternetIpConnectivity</strong>:</p>
             * <ul>
             * <li><strong>targetIp</strong>: the public IP address of the customer gateway.</li>
             * <li><strong>rtt</strong>: the latency when the system accesses the public IP address of the customer gateway. Unit: milliseconds.</li>
             * <li><strong>lossRate</strong>: the packet loss when the system accesses the public IP address of the customer gateway.</li>
             * </ul>
             * </li>
             * <li><p><strong>VcoPrivateConnectivity</strong>:</p>
             * <ul>
             * <li><strong>targetIp</strong>: the source IP address.</li>
             * <li><strong>srcIp</strong>: the destination IP address.</li>
             * <li><strong>rtt</strong>: the latency when the source IP address accesses the destination IP address. Unit: milliseconds.</li>
             * <li><strong>lossRate</strong>: the packet loss when the source IP address accesses the destination IP address.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;targetIp&quot;:&quot;192.168.0.1&quot;,&quot;srcIp&quot;:&quot;192.168.1.1&quot;,&quot;rtt&quot;:-1.0,&quot;lossRate&quot;:100.0}</p>
             */
            public Builder diagnoseResultDescription(String diagnoseResultDescription) {
                this.diagnoseResultDescription = diagnoseResultDescription;
                return this;
            }

            /**
             * <p>The diagnostic result level.</p>
             * <ul>
             * <li><strong>normal</strong></li>
             * <li><strong>warning</strong></li>
             * <li><strong>error</strong></li>
             * </ul>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/190330.html">Background information about quick diagnostics</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
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
