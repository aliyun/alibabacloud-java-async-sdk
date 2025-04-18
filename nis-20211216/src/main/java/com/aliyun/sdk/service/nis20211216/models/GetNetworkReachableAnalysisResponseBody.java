// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

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
 * {@link GetNetworkReachableAnalysisResponseBody} extends {@link TeaModel}
 *
 * <p>GetNetworkReachableAnalysisResponseBody</p>
 */
public class GetNetworkReachableAnalysisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliUid")
    private Long aliUid;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("NetworkPathId")
    private String networkPathId;

    @com.aliyun.core.annotation.NameInMap("NetworkPathParameter")
    private String networkPathParameter;

    @com.aliyun.core.annotation.NameInMap("NetworkReachableAnalysisId")
    private String networkReachableAnalysisId;

    @com.aliyun.core.annotation.NameInMap("NetworkReachableAnalysisResult")
    private String networkReachableAnalysisResult;

    @com.aliyun.core.annotation.NameInMap("NetworkReachableAnalysisStatus")
    private String networkReachableAnalysisStatus;

    @com.aliyun.core.annotation.NameInMap("Reachable")
    private Boolean reachable;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetNetworkReachableAnalysisResponseBody(Builder builder) {
        this.aliUid = builder.aliUid;
        this.createTime = builder.createTime;
        this.networkPathId = builder.networkPathId;
        this.networkPathParameter = builder.networkPathParameter;
        this.networkReachableAnalysisId = builder.networkReachableAnalysisId;
        this.networkReachableAnalysisResult = builder.networkReachableAnalysisResult;
        this.networkReachableAnalysisStatus = builder.networkReachableAnalysisStatus;
        this.reachable = builder.reachable;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNetworkReachableAnalysisResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return networkPathId
     */
    public String getNetworkPathId() {
        return this.networkPathId;
    }

    /**
     * @return networkPathParameter
     */
    public String getNetworkPathParameter() {
        return this.networkPathParameter;
    }

    /**
     * @return networkReachableAnalysisId
     */
    public String getNetworkReachableAnalysisId() {
        return this.networkReachableAnalysisId;
    }

    /**
     * @return networkReachableAnalysisResult
     */
    public String getNetworkReachableAnalysisResult() {
        return this.networkReachableAnalysisResult;
    }

    /**
     * @return networkReachableAnalysisStatus
     */
    public String getNetworkReachableAnalysisStatus() {
        return this.networkReachableAnalysisStatus;
    }

    /**
     * @return reachable
     */
    public Boolean getReachable() {
        return this.reachable;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long aliUid; 
        private String createTime; 
        private String networkPathId; 
        private String networkPathParameter; 
        private String networkReachableAnalysisId; 
        private String networkReachableAnalysisResult; 
        private String networkReachableAnalysisStatus; 
        private Boolean reachable; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetNetworkReachableAnalysisResponseBody model) {
            this.aliUid = model.aliUid;
            this.createTime = model.createTime;
            this.networkPathId = model.networkPathId;
            this.networkPathParameter = model.networkPathParameter;
            this.networkReachableAnalysisId = model.networkReachableAnalysisId;
            this.networkReachableAnalysisResult = model.networkReachableAnalysisResult;
            this.networkReachableAnalysisStatus = model.networkReachableAnalysisStatus;
            this.reachable = model.reachable;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The unique ID (UID) of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>123147627844****</p>
         */
        public Builder aliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }

        /**
         * <p>The time when the network path was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-16T07:11:27Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The network path ID.</p>
         * 
         * <strong>example:</strong>
         * <p>np-2a1332214fa346b6****</p>
         */
        public Builder networkPathId(String networkPathId) {
            this.networkPathId = networkPathId;
            return this;
        }

        /**
         * <p>The parameters of the network path.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;sourceId&quot;: &quot;i-bp100g5pbp6kj4p9****&quot;,
         *   &quot;sourceType&quot;: &quot;ecs&quot;,
         *   &quot;targetId&quot;: &quot;i-t4n4ltwgbbomzb0g****&quot;,
         *   &quot;targetType&quot;: &quot;ecs&quot;
         * }</p>
         */
        public Builder networkPathParameter(String networkPathParameter) {
            this.networkPathParameter = networkPathParameter;
            return this;
        }

        /**
         * <p>The ID of the task for analyzing network reachability.</p>
         * 
         * <strong>example:</strong>
         * <p>nra-8607514e71c1484****</p>
         */
        public Builder networkReachableAnalysisId(String networkReachableAnalysisId) {
            this.networkReachableAnalysisId = networkReachableAnalysisId;
            return this;
        }

        /**
         * <p>The result of network reachability analysis, which includes the network topology, error codes of network unreachability, and rules of network unreachability.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;errorCode&quot;: &quot;&quot;,
         *   &quot;networkAclData&quot;: {
         *     &quot;networkAclItems&quot;: [</p>
         * <pre><code>]
         * </code></pre>
         * <p>  },
         *   &quot;nraId&quot;: &quot;nra-f2c8701a36424094****&quot;,
         *   &quot;requestId&quot;: &quot;B931F8A0-620E-5230-B77F-3BD7F612****&quot;,
         *   &quot;routeData&quot;: {
         *     &quot;routeItems&quot;: [</p>
         * <pre><code>]
         * </code></pre>
         * <p>  },
         *   &quot;securityGroupData&quot;: {
         *     &quot;policy&quot;: &quot;accept&quot;,
         *     &quot;securityGroupItems&quot;: [
         *       {
         *         &quot;description&quot;: &quot;default_sg_access_rule&quot;,
         *         &quot;matchedRule&quot;: {
         *           &quot;bizProtocol&quot;: &quot;ALL&quot;,
         *           &quot;creatingTime&quot;: &quot;2022-11-10T03:24:49Z&quot;,
         *           &quot;description&quot;: &quot;&quot;,
         *           &quot;destinationCidr&quot;: &quot;&quot;,
         *           &quot;destinationGroupId&quot;: &quot;sg-wz980j96p8y99co5****&quot;,
         *           &quot;direction&quot;: &quot;egress&quot;,
         *           &quot;policy&quot;: &quot;Accept&quot;,
         *           &quot;portRange&quot;: &quot;-1/-1&quot;,
         *           &quot;priority&quot;: &quot;1&quot;,
         *           &quot;sourceCidr&quot;: &quot;&quot;,
         *           &quot;sourceGroupId&quot;: &quot;&quot;
         *         },
         *         &quot;policy&quot;: &quot;accept&quot;,
         *         &quot;resourceId&quot;: &quot;eni-wz92ce4saz1jzazg****&quot;,
         *         &quot;securityGroupId&quot;: &quot;sg-wz980j96p8y99co5****&quot;
         *       },
         *       {
         *         &quot;description&quot;: &quot;user_acl_drop_rule&quot;,
         *         &quot;matchedRule&quot;: {
         *           &quot;bizProtocol&quot;: &quot;&quot;,
         *           &quot;creatingTime&quot;: &quot;&quot;,
         *           &quot;description&quot;: &quot;&quot;,
         *           &quot;destinationCidr&quot;: &quot;&quot;,
         *           &quot;destinationGroupId&quot;: &quot;&quot;,
         *           &quot;direction&quot;: &quot;&quot;,
         *           &quot;policy&quot;: &quot;&quot;,
         *           &quot;portRange&quot;: &quot;&quot;,
         *           &quot;priority&quot;: &quot;&quot;,
         *           &quot;sourceCidr&quot;: &quot;&quot;,
         *           &quot;sourceGroupId&quot;: &quot;&quot;
         *         },
         *         &quot;policy&quot;: &quot;&quot;,
         *         &quot;resourceId&quot;: &quot;eni-wz97vry93t6z4lbd****&quot;,
         *         &quot;securityGroupId&quot;: &quot;sg-wz980j96p8y99co****&quot;
         *       }
         *     ],
         *     &quot;securityGroupReportId&quot;: &quot;sgr-4479d23bb37241aab****&quot;
         *   },
         *   &quot;status&quot;: &quot;security_group_checking_target&quot;,
         *   &quot;topologyData&quot;: {
         *     &quot;positive&quot;: {
         *       &quot;linkList&quot;: [
         *         {
         *           &quot;id&quot;: &quot;i-wz91dk7bor557hp93zyv--&gt;eni-wz92ce4saz1jzazg****&quot;,
         *           &quot;source&quot;: &quot;i-wz91dk7bor557hp9****&quot;,
         *           &quot;target&quot;: &quot;eni-wz92ce4saz1jzazg****&quot;
         *         },
         *         {
         *           &quot;id&quot;: &quot;eni-wz92ce4saz1jzazgi13d--&gt;vsw-wz9slpwdcppwfrnee****&quot;,
         *           &quot;source&quot;: &quot;eni-wz92ce4saz1jzazg****&quot;,
         *           &quot;target&quot;: &quot;vsw-wz9slpwdcppwfrnee****&quot;
         *         },
         *         {
         *           &quot;id&quot;: &quot;vsw-wz9slpwdcppwfrneebcrp--&gt;eni-wz97vry93t6z4lbd****&quot;,
         *           &quot;source&quot;: &quot;vsw-wz9slpwdcppwfrnee****&quot;,
         *           &quot;target&quot;: &quot;eni-wz97vry93t6z4lbd****&quot;
         *         },
         *         {
         *           &quot;id&quot;: &quot;eni-wz97vry93t6z4lbdgmfi--&gt;i-wz91dk7bor557hp9****&quot;,
         *           &quot;source&quot;: &quot;eni-wz97vry93t6z4lbd****&quot;,
         *           &quot;target&quot;: &quot;i-wz91dk7bor557hp9****&quot;
         *         }
         *       ],
         *       &quot;nodeList&quot;: [
         *         {
         *           &quot;aZone&quot;: &quot;cn-shenzhen-d&quot;,
         *           &quot;bizInsId&quot;: &quot;i-wz91dk7bor557hp9****&quot;,
         *           &quot;id&quot;: &quot;i-wz91dk7bor557hp9****&quot;,
         *           &quot;level&quot;: 1,
         *           &quot;matchedRoute&quot;: {
         *             &quot;nextHopSet&quot;: [</p>
         * <pre><code>        ]
         *       },
         *       &quot;nodeType&quot;: &quot;VM&quot;,
         *       &quot;regionNo&quot;: &quot;cn-shenzhen-st3-a01&quot;,
         *       &quot;regionNoAlias&quot;: &quot;cn-shenzhen&quot;,
         *       &quot;trafficLogs&quot;: [
         *         
         *       ]
         *     },
         *     {
         *       &quot;aZone&quot;: &quot;cn-shenzhen-d&quot;,
         *       &quot;bizInsId&quot;: &quot;i-wz91dk7bor557hp9****&quot;,
         *       &quot;id&quot;: &quot;i-wz91dk7bor557hp9****&quot;,
         *       &quot;level&quot;: 3,
         *       &quot;matchedRoute&quot;: {
         *         &quot;nextHopSet&quot;: [
         *           
         *         ]
         *       },
         *       &quot;nodeType&quot;: &quot;VM&quot;,
         *       &quot;regionNo&quot;: &quot;cn-shenzhen-st3-a01&quot;,
         *       &quot;regionNoAlias&quot;: &quot;cn-shenzhen&quot;,
         *       &quot;trafficLogs&quot;: [
         *         
         *       ]
         *     },
         *     {
         *       &quot;aZone&quot;: &quot;cn-shenzhen-d&quot;,
         *       &quot;bizInsId&quot;: &quot;vsw-wz9slpwdcppwfrnee****&quot;,
         *       &quot;cidr&quot;: &quot;192.168.0.0/24&quot;,
         *       &quot;id&quot;: &quot;vsw-wz9slpwdcppwfrnee****&quot;,
         *       &quot;level&quot;: 2,
         *       &quot;matchedRoute&quot;: {
         *         &quot;nextHopSet&quot;: [
         *           
         *         ]
         *       },
         *       &quot;nodeType&quot;: &quot;VSW&quot;,
         *       &quot;regionNo&quot;: &quot;cn-shenzhen-st3-a01&quot;,
         *       &quot;regionNoAlias&quot;: &quot;cn-shenzhen&quot;,
         *       &quot;trafficLogs&quot;: [
         *         
         *       ]
         *     },
         *     {
         *       &quot;bizInsId&quot;: &quot;eni-wz92ce4saz1jzazg****&quot;,
         *       &quot;id&quot;: &quot;eni-wz92ce4saz1jzazg****&quot;,
         *       &quot;ip&quot;: &quot;192.168.0.33&quot;,
         *       &quot;mac&quot;: &quot;00:XXXX:3e:16:7c:50&quot;,
         *       &quot;matchedRoute&quot;: {
         *         &quot;nextHopSet&quot;: [
         *           
         *         ]
         *       },
         *       &quot;nodeType&quot;: &quot;ENI&quot;,
         *       &quot;regionNo&quot;: &quot;cn-shenzhen-st3-a01&quot;,
         *       &quot;regionNoAlias&quot;: &quot;cn-shenzhen&quot;,
         *       &quot;status&quot;: &quot;InUse&quot;,
         *       &quot;trafficLogs&quot;: [
         *         
         *       ]
         *     },
         *     {
         *       &quot;bizInsId&quot;: &quot;eni-wz97vry93t6z4lbd****&quot;,
         *       &quot;id&quot;: &quot;eni-wz97vry93t6z4lbd****&quot;,
         *       &quot;ip&quot;: &quot;192.168.0.34&quot;,
         *       &quot;mac&quot;: &quot;00:XXXX:3e:14:70:c2&quot;,
         *       &quot;matchedRoute&quot;: {
         *         &quot;nextHopSet&quot;: [
         *           
         *         ]
         *       },
         *       &quot;nodeType&quot;: &quot;ENI&quot;,
         *       &quot;regionNo&quot;: &quot;cn-shenzhen-st3-a01&quot;,
         *       &quot;regionNoAlias&quot;: &quot;cn-shenzhen&quot;,
         *       &quot;status&quot;: &quot;InUse&quot;,
         *       &quot;trafficLogs&quot;: [
         *         
         *       ]
         *     }
         *   ]
         * },
         * &quot;reverse&quot;: {
         *   &quot;revLinkList&quot;: [
         *     {
         *       &quot;id&quot;: &quot;i-wz91dk7bor557hp93zys--&gt;eni-wz97vry93t6z4lbd****&quot;,
         *       &quot;source&quot;: &quot;i-wz91dk7bor557hp9****&quot;,
         *       &quot;target&quot;: &quot;eni-wz97vry93t6z4lbd****&quot;
         *     },
         *     {
         *       &quot;id&quot;: &quot;eni-wz97vry93t6z4lbdgmfi--&gt;vsw-wz9slpwdcppwfrnee****&quot;,
         *       &quot;source&quot;: &quot;eni-wz97vry93t6z4lbd****&quot;,
         *       &quot;target&quot;: &quot;vsw-wz9slpwdcppwfrnee****&quot;
         *     },
         *     {
         *       &quot;id&quot;: &quot;vsw-wz9slpwdcppwfrneebcrp--&gt;eni-wz92ce4saz1jzazg****&quot;,
         *       &quot;source&quot;: &quot;vsw-wz9slpwdcppwfrnee****&quot;,
         *       &quot;target&quot;: &quot;eni-wz92ce4saz1jzazg****&quot;
         *     },
         *     {
         *       &quot;id&quot;: &quot;eni-wz92ce4saz1jzazgi13d--&gt;i-wz91dk7bor557hp9****&quot;,
         *       &quot;source&quot;: &quot;eni-wz92ce4saz1jzazg****&quot;,
         *       &quot;target&quot;: &quot;i-wz91dk7bor557hp9****&quot;
         *     }
         *   ],
         *   &quot;revNodeList&quot;: [
         *     {
         *       &quot;aZone&quot;: &quot;cn-shenzhen-d&quot;,
         *       &quot;bizInsId&quot;: &quot;i-wz91dk7bor557hp9****&quot;,
         *       &quot;id&quot;: &quot;i-wz91dk7bor557hp9****&quot;,
         *       &quot;level&quot;: 1,
         *       &quot;nodeType&quot;: &quot;VM&quot;,
         *       &quot;regionNo&quot;: &quot;cn-shenzhen-st3-a01&quot;,
         *       &quot;regionNoAlias&quot;: &quot;cn-shenzhen&quot;,
         *       &quot;revMatchedRoute&quot;: {
         *         &quot;revNextHopSet&quot;: [
         *           
         *         ]
         *       }
         *     },
         *     {
         *       &quot;aZone&quot;: &quot;cn-shenzhen-d&quot;,
         *       &quot;bizInsId&quot;: &quot;i-wz91dk7bor557hp9****&quot;,
         *       &quot;id&quot;: &quot;i-wz91dk7bor557hp9****&quot;,
         *       &quot;level&quot;: 3,
         *       &quot;nodeType&quot;: &quot;VM&quot;,
         *       &quot;regionNo&quot;: &quot;cn-shenzhen-st3-a01&quot;,
         *       &quot;regionNoAlias&quot;: &quot;cn-shenzhen&quot;,
         *       &quot;revMatchedRoute&quot;: {
         *         &quot;revNextHopSet&quot;: [
         *           
         *         ]
         *       }
         *     },
         *     {
         *       &quot;aZone&quot;: &quot;cn-shenzhen-d&quot;,
         *       &quot;bizInsId&quot;: &quot;vsw-wz9slpwdcppwfrnee****&quot;,
         *       &quot;cidr&quot;: &quot;192.168.0.0/24&quot;,
         *       &quot;id&quot;: &quot;vsw-wz9slpwdcppwfrnee****&quot;,
         *       &quot;level&quot;: 2,
         *       &quot;nodeType&quot;: &quot;VSW&quot;,
         *       &quot;regionNo&quot;: &quot;cn-shenzhen-st3-a01&quot;,
         *       &quot;regionNoAlias&quot;: &quot;cn-shenzhen&quot;,
         *       &quot;revMatchedRoute&quot;: {
         *         &quot;revNextHopSet&quot;: [
         *           
         *         ]
         *       }
         *     },
         *     {
         *       &quot;bizInsId&quot;: &quot;eni-wz97vry93t6z4lbd****&quot;,
         *       &quot;id&quot;: &quot;eni-wz97vry93t6z4lbd****&quot;,
         *       &quot;ip&quot;: &quot;192.168.0.34&quot;,
         *       &quot;mac&quot;: &quot;00:XXXX:3e:14:70:c2&quot;,
         *       &quot;nodeType&quot;: &quot;ENI&quot;,
         *       &quot;regionNo&quot;: &quot;cn-shenzhen-st3-a01&quot;,
         *       &quot;regionNoAlias&quot;: &quot;cn-shenzhen&quot;,
         *       &quot;revMatchedRoute&quot;: {
         *         &quot;revNextHopSet&quot;: [
         *           
         *         ]
         *       },
         *       &quot;status&quot;: &quot;InUse&quot;
         *     },
         *     {
         *       &quot;bizInsId&quot;: &quot;eni-wz92ce4saz1jzazg****&quot;,
         *       &quot;id&quot;: &quot;eni-wz92ce4saz1jzazg****&quot;,
         *       &quot;ip&quot;: &quot;192.168.0.33&quot;,
         *       &quot;mac&quot;: &quot;00:XXXX:3e:16:7c:50&quot;,
         *       &quot;nodeType&quot;: &quot;ENI&quot;,
         *       &quot;regionNo&quot;: &quot;cn-shenzhen-st3-a01&quot;,
         *       &quot;regionNoAlias&quot;: &quot;cn-shenzhen&quot;,
         *       &quot;revMatchedRoute&quot;: {
         *         &quot;revNextHopSet&quot;: [
         *           
         *         ]
         *       },
         *       &quot;status&quot;: &quot;InUse&quot;
         *     }
         *   ]
         * },
         * &quot;topologyReportId&quot;: &quot;tpr-21cf60002715491b8****&quot;
         * </code></pre>
         * <p>  }
         * }</p>
         */
        public Builder networkReachableAnalysisResult(String networkReachableAnalysisResult) {
            this.networkReachableAnalysisResult = networkReachableAnalysisResult;
            return this;
        }

        /**
         * <p>The state of the task for analyzing network reachability. Valid values:</p>
         * <ul>
         * <li><strong>init</strong>: The task is in progress.</li>
         * <li><strong>finish</strong>: The task is complete.</li>
         * <li><strong>error</strong>: An analysis error occurred.</li>
         * <li><strong>timeout</strong>: The task timed out.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>finish</p>
         */
        public Builder networkReachableAnalysisStatus(String networkReachableAnalysisStatus) {
            this.networkReachableAnalysisStatus = networkReachableAnalysisStatus;
            return this;
        }

        /**
         * <p>Indicates whether the network path is reachable. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The network path is reachable.</li>
         * <li><strong>false</strong>: The network path is unreachable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder reachable(Boolean reachable) {
            this.reachable = reachable;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DEE0FEAF-59AE-5CDD-AA07-626BC365D571</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetNetworkReachableAnalysisResponseBody build() {
            return new GetNetworkReachableAnalysisResponseBody(this);
        } 

    } 

}
