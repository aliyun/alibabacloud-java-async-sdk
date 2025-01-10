// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link GetNodeInfoForPodResponseBody} extends {@link TeaModel}
 *
 * <p>GetNodeInfoForPodResponseBody</p>
 */
public class GetNodeInfoForPodResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetNodeInfoForPodResponseBody(Builder builder) {
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNodeInfoForPodResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
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

    public static final class Builder {
        private Integer code; 
        private Content content; 
        private String message; 
        private String requestId; 

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
         * 
         * <strong>example:</strong>
         * <p>You don&quot;t have the permission of this operation, action=eflo:GetNodeInfoForPod, arn=acs:eflo:cn-wulanchabu:1111156667137893:networkinterface/*, resourceGroup=null</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID of the current request</p>
         * 
         * <strong>example:</strong>
         * <p>9C50C9CD-E799-54DA-BA7A-1FAF3DF80857</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetNodeInfoForPodResponseBody build() {
            return new GetNodeInfoForPodResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetNodeInfoForPodResponseBody} extends {@link TeaModel}
     *
     * <p>GetNodeInfoForPodResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("HdeniQuota")
        private Integer hdeniQuota;

        @com.aliyun.core.annotation.NameInMap("LeniQuota")
        private Integer leniQuota;

        @com.aliyun.core.annotation.NameInMap("LeniSipQuota")
        private Integer leniSipQuota;

        @com.aliyun.core.annotation.NameInMap("LniSipQuota")
        private Integer lniSipQuota;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("VSwitches")
        private java.util.List<String> vSwitches;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Content(Builder builder) {
            this.clusterId = builder.clusterId;
            this.hdeniQuota = builder.hdeniQuota;
            this.leniQuota = builder.leniQuota;
            this.leniSipQuota = builder.leniSipQuota;
            this.lniSipQuota = builder.lniSipQuota;
            this.nodeId = builder.nodeId;
            this.regionId = builder.regionId;
            this.vSwitches = builder.vSwitches;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return hdeniQuota
         */
        public Integer getHdeniQuota() {
            return this.hdeniQuota;
        }

        /**
         * @return leniQuota
         */
        public Integer getLeniQuota() {
            return this.leniQuota;
        }

        /**
         * @return leniSipQuota
         */
        public Integer getLeniSipQuota() {
            return this.leniSipQuota;
        }

        /**
         * @return lniSipQuota
         */
        public Integer getLniSipQuota() {
            return this.lniSipQuota;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return vSwitches
         */
        public java.util.List<String> getVSwitches() {
            return this.vSwitches;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String clusterId; 
            private Integer hdeniQuota; 
            private Integer leniQuota; 
            private Integer leniSipQuota; 
            private Integer lniSipQuota; 
            private String nodeId; 
            private String regionId; 
            private java.util.List<String> vSwitches; 
            private String vpcId; 
            private String zoneId; 

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cluster-****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>Lingjun Gaomi network interface controller quota</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder hdeniQuota(Integer hdeniQuota) {
                this.hdeniQuota = hdeniQuota;
                return this;
            }

            /**
             * <p>Lingjun Elastic Network Interface quota, including system type</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder leniQuota(Integer leniQuota) {
                this.leniQuota = leniQuota;
                return this;
            }

            /**
             * <p>Lingjun Elastic Network Interface Secondary Private IP Quota</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder leniSipQuota(Integer leniSipQuota) {
                this.leniSipQuota = leniSipQuota;
                return this;
            }

            /**
             * <p>Lingjun network interface controller Secondary Private IP Quota</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder lniSipQuota(Integer lniSipQuota) {
                this.lniSipQuota = lniSipQuota;
                return this;
            }

            /**
             * <p>The ID of the node for this operation.</p>
             * 
             * <strong>example:</strong>
             * <p>node-be70****</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wulanchabu</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>List of VSwitches that can apply for IP addresses on this node</p>
             */
            public Builder vSwitches(java.util.List<String> vSwitches) {
                this.vSwitches = vSwitches;
                return this;
            }

            /**
             * <p>The ID of the Virtual Private Cloud to which the current node belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-j6ctp4n75306****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wulanchabu-b</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
