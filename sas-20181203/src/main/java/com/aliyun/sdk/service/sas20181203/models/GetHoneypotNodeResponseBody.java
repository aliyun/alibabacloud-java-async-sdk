// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHoneypotNodeResponseBody} extends {@link TeaModel}
 *
 * <p>GetHoneypotNodeResponseBody</p>
 */
public class GetHoneypotNodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HoneypotNode")
    private HoneypotNode honeypotNode;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The details of the management node.
         */
        public Builder honeypotNode(HoneypotNode honeypotNode) {
            this.honeypotNode = honeypotNode;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
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
        @com.aliyun.core.annotation.NameInMap("AllowHoneypotAccessInternet")
        private Boolean allowHoneypotAccessInternet;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EcsInstanceId")
        private String ecsInstanceId;

        @com.aliyun.core.annotation.NameInMap("HoneypotTotalCount")
        private Integer honeypotTotalCount;

        @com.aliyun.core.annotation.NameInMap("HoneypotUsedCount")
        private Integer honeypotUsedCount;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeIp")
        private String nodeIp;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("ProbeTotalCount")
        private Integer probeTotalCount;

        @com.aliyun.core.annotation.NameInMap("ProbeUsedCount")
        private Integer probeUsedCount;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupProbeIpList")
        private java.util.List < String > securityGroupProbeIpList;

        @com.aliyun.core.annotation.NameInMap("TotalStatus")
        private Integer totalStatus;

        @com.aliyun.core.annotation.NameInMap("UpgradeAvailable")
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
             * Indicates whether a honeypot is allowed to access the Internet. Valid values:
             * <p>
             * 
             * *   **true**: The honeypot is allowed to access the Internet.
             * *   **false**: The honeypot is not allowed to access the Internet.
             */
            public Builder allowHoneypotAccessInternet(Boolean allowHoneypotAccessInternet) {
                this.allowHoneypotAccessInternet = allowHoneypotAccessInternet;
                return this;
            }

            /**
             * The time when the management node was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder ecsInstanceId(String ecsInstanceId) {
                this.ecsInstanceId = ecsInstanceId;
                return this;
            }

            /**
             * The maximum number of honeypots that can be deployed to the management node.
             */
            public Builder honeypotTotalCount(Integer honeypotTotalCount) {
                this.honeypotTotalCount = honeypotTotalCount;
                return this;
            }

            /**
             * The number of honeypots that are deployed to the management node.
             */
            public Builder honeypotUsedCount(Integer honeypotUsedCount) {
                this.honeypotUsedCount = honeypotUsedCount;
                return this;
            }

            /**
             * The ID of the management node.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The IP address of the management node.
             */
            public Builder nodeIp(String nodeIp) {
                this.nodeIp = nodeIp;
                return this;
            }

            /**
             * The name of the management node.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * The maximum number of probes that can be deployed for the management node.
             */
            public Builder probeTotalCount(Integer probeTotalCount) {
                this.probeTotalCount = probeTotalCount;
                return this;
            }

            /**
             * The number of probes that are deployed for the management node.
             */
            public Builder probeUsedCount(Integer probeUsedCount) {
                this.probeUsedCount = probeUsedCount;
                return this;
            }

            /**
             * An array consisting of the CIDR blocks that are allowed to access the management node.
             */
            public Builder securityGroupProbeIpList(java.util.List < String > securityGroupProbeIpList) {
                this.securityGroupProbeIpList = securityGroupProbeIpList;
                return this;
            }

            /**
             * The status of the management node. Valid values:
             * <p>
             * 
             * *   **0**: preparing
             * *   **1**: normal
             * *   **2**: abnormal
             * *   **4**: starting
             * *   **5**: upgrading
             */
            public Builder totalStatus(Integer totalStatus) {
                this.totalStatus = totalStatus;
                return this;
            }

            /**
             * Indicates whether the management node can be upgraded. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
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
