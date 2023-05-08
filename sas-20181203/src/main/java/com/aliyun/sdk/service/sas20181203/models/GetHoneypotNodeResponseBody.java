// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHoneypotNodeResponseBody} extends {@link TeaModel}
 *
 * <p>GetHoneypotNodeResponseBody</p>
 */
public class GetHoneypotNodeResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HoneypotNode")
    private HoneypotNode honeypotNode;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetHoneypotNodeResponseBody(Builder builder) {
        this.code = builder.code;
        this.honeypotNode = builder.honeypotNode;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHoneypotNodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return honeypotNode
     */
    public HoneypotNode getHoneypotNode() {
        return this.honeypotNode;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public static final class Builder {
        private String code; 
        private HoneypotNode honeypotNode; 
        private Integer httpStatusCode; 
        private String message; 
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
         * HoneypotNode.
         */
        public Builder honeypotNode(HoneypotNode honeypotNode) {
            this.honeypotNode = honeypotNode;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public GetHoneypotNodeResponseBody build() {
            return new GetHoneypotNodeResponseBody(this);
        } 

    } 

    public static class HoneypotNode extends TeaModel {
        @NameInMap("AllowHoneypotAccessInternet")
        private Boolean allowHoneypotAccessInternet;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("EcsInstanceId")
        private String ecsInstanceId;

        @NameInMap("HoneypotTotalCount")
        private Integer honeypotTotalCount;

        @NameInMap("HoneypotUsedCount")
        private Integer honeypotUsedCount;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("NodeIp")
        private String nodeIp;

        @NameInMap("NodeName")
        private String nodeName;

        @NameInMap("ProbeTotalCount")
        private Integer probeTotalCount;

        @NameInMap("ProbeUsedCount")
        private Integer probeUsedCount;

        @NameInMap("SecurityGroupProbeIpList")
        private java.util.List < String > securityGroupProbeIpList;

        @NameInMap("TotalStatus")
        private Integer totalStatus;

        @NameInMap("UpgradeAvailable")
        private Boolean upgradeAvailable;

        private HoneypotNode(Builder builder) {
            this.allowHoneypotAccessInternet = builder.allowHoneypotAccessInternet;
            this.createTime = builder.createTime;
            this.ecsInstanceId = builder.ecsInstanceId;
            this.honeypotTotalCount = builder.honeypotTotalCount;
            this.honeypotUsedCount = builder.honeypotUsedCount;
            this.nodeId = builder.nodeId;
            this.nodeIp = builder.nodeIp;
            this.nodeName = builder.nodeName;
            this.probeTotalCount = builder.probeTotalCount;
            this.probeUsedCount = builder.probeUsedCount;
            this.securityGroupProbeIpList = builder.securityGroupProbeIpList;
            this.totalStatus = builder.totalStatus;
            this.upgradeAvailable = builder.upgradeAvailable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HoneypotNode create() {
            return builder().build();
        }

        /**
         * @return allowHoneypotAccessInternet
         */
        public Boolean getAllowHoneypotAccessInternet() {
            return this.allowHoneypotAccessInternet;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return ecsInstanceId
         */
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        /**
         * @return honeypotTotalCount
         */
        public Integer getHoneypotTotalCount() {
            return this.honeypotTotalCount;
        }

        /**
         * @return honeypotUsedCount
         */
        public Integer getHoneypotUsedCount() {
            return this.honeypotUsedCount;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeIp
         */
        public String getNodeIp() {
            return this.nodeIp;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return probeTotalCount
         */
        public Integer getProbeTotalCount() {
            return this.probeTotalCount;
        }

        /**
         * @return probeUsedCount
         */
        public Integer getProbeUsedCount() {
            return this.probeUsedCount;
        }

        /**
         * @return securityGroupProbeIpList
         */
        public java.util.List < String > getSecurityGroupProbeIpList() {
            return this.securityGroupProbeIpList;
        }

        /**
         * @return totalStatus
         */
        public Integer getTotalStatus() {
            return this.totalStatus;
        }

        /**
         * @return upgradeAvailable
         */
        public Boolean getUpgradeAvailable() {
            return this.upgradeAvailable;
        }

        public static final class Builder {
            private Boolean allowHoneypotAccessInternet; 
            private String createTime; 
            private String ecsInstanceId; 
            private Integer honeypotTotalCount; 
            private Integer honeypotUsedCount; 
            private String nodeId; 
            private String nodeIp; 
            private String nodeName; 
            private Integer probeTotalCount; 
            private Integer probeUsedCount; 
            private java.util.List < String > securityGroupProbeIpList; 
            private Integer totalStatus; 
            private Boolean upgradeAvailable; 

            /**
             * AllowHoneypotAccessInternet.
             */
            public Builder allowHoneypotAccessInternet(Boolean allowHoneypotAccessInternet) {
                this.allowHoneypotAccessInternet = allowHoneypotAccessInternet;
                return this;
            }

            /**
             * 创建时间
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 实例id
             */
            public Builder ecsInstanceId(String ecsInstanceId) {
                this.ecsInstanceId = ecsInstanceId;
                return this;
            }

            /**
             * 蜜罐上限数量
             */
            public Builder honeypotTotalCount(Integer honeypotTotalCount) {
                this.honeypotTotalCount = honeypotTotalCount;
                return this;
            }

            /**
             * 蜜罐使用数量
             */
            public Builder honeypotUsedCount(Integer honeypotUsedCount) {
                this.honeypotUsedCount = honeypotUsedCount;
                return this;
            }

            /**
             * 节点id
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * NodeIp.
             */
            public Builder nodeIp(String nodeIp) {
                this.nodeIp = nodeIp;
                return this;
            }

            /**
             * 节点名称
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * 探针上限数目
             */
            public Builder probeTotalCount(Integer probeTotalCount) {
                this.probeTotalCount = probeTotalCount;
                return this;
            }

            /**
             * 探针使用数量
             */
            public Builder probeUsedCount(Integer probeUsedCount) {
                this.probeUsedCount = probeUsedCount;
                return this;
            }

            /**
             * 放行网段
             */
            public Builder securityGroupProbeIpList(java.util.List < String > securityGroupProbeIpList) {
                this.securityGroupProbeIpList = securityGroupProbeIpList;
                return this;
            }

            /**
             * 管理节点状态
             */
            public Builder totalStatus(Integer totalStatus) {
                this.totalStatus = totalStatus;
                return this;
            }

            /**
             * UpgradeAvailable.
             */
            public Builder upgradeAvailable(Boolean upgradeAvailable) {
                this.upgradeAvailable = upgradeAvailable;
                return this;
            }

            public HoneypotNode build() {
                return new HoneypotNode(this);
            } 

        } 

    }
}
