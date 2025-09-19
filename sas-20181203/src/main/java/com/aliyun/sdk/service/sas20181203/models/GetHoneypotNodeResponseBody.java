// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetHoneypotNodeResponseBody model) {
            this.code = model.code;
            this.honeypotNode = model.honeypotNode;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code returned. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the management node.</p>
         */
        public Builder honeypotNode(HoneypotNode honeypotNode) {
            this.honeypotNode = honeypotNode;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>0A453658-070B-5554-B46C-867425BE4FD4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetHoneypotNodeResponseBody build() {
            return new GetHoneypotNodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetHoneypotNodeResponseBody} extends {@link TeaModel}
     *
     * <p>GetHoneypotNodeResponseBody</p>
     */
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
        private java.util.List<String> securityGroupProbeIpList;

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
        public java.util.List<String> getSecurityGroupProbeIpList() {
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
            private java.util.List<String> securityGroupProbeIpList; 
            private Integer totalStatus; 
            private Boolean upgradeAvailable; 

            private Builder() {
            } 

            private Builder(HoneypotNode model) {
                this.allowHoneypotAccessInternet = model.allowHoneypotAccessInternet;
                this.createTime = model.createTime;
                this.ecsInstanceId = model.ecsInstanceId;
                this.honeypotTotalCount = model.honeypotTotalCount;
                this.honeypotUsedCount = model.honeypotUsedCount;
                this.nodeId = model.nodeId;
                this.nodeIp = model.nodeIp;
                this.nodeName = model.nodeName;
                this.probeTotalCount = model.probeTotalCount;
                this.probeUsedCount = model.probeUsedCount;
                this.securityGroupProbeIpList = model.securityGroupProbeIpList;
                this.totalStatus = model.totalStatus;
                this.upgradeAvailable = model.upgradeAvailable;
            } 

            /**
             * <p>Indicates whether a honeypot is allowed to access the Internet. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The honeypot is allowed to access the Internet.</li>
             * <li><strong>false</strong>: The honeypot is not allowed to access the Internet.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder allowHoneypotAccessInternet(Boolean allowHoneypotAccessInternet) {
                this.allowHoneypotAccessInternet = allowHoneypotAccessInternet;
                return this;
            }

            /**
             * <p>The time when the management node was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-02 17:13:43</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2vccskxjunf1ag6w****</p>
             */
            public Builder ecsInstanceId(String ecsInstanceId) {
                this.ecsInstanceId = ecsInstanceId;
                return this;
            }

            /**
             * <p>The maximum number of honeypots that can be deployed to the management node.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder honeypotTotalCount(Integer honeypotTotalCount) {
                this.honeypotTotalCount = honeypotTotalCount;
                return this;
            }

            /**
             * <p>The number of honeypots that are deployed to the management node.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder honeypotUsedCount(Integer honeypotUsedCount) {
                this.honeypotUsedCount = honeypotUsedCount;
                return this;
            }

            /**
             * <p>The ID of the management node.</p>
             * 
             * <strong>example:</strong>
             * <p>a7409a58-bc60-41af-9d36-080d58ae****</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The IP address of the management node.</p>
             * 
             * <strong>example:</strong>
             * <p>101.37.XX.XX</p>
             */
            public Builder nodeIp(String nodeIp) {
                this.nodeIp = nodeIp;
                return this;
            }

            /**
             * <p>The name of the management node.</p>
             * 
             * <strong>example:</strong>
             * <p>gmmc</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The maximum number of probes that can be deployed for the management node.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder probeTotalCount(Integer probeTotalCount) {
                this.probeTotalCount = probeTotalCount;
                return this;
            }

            /**
             * <p>The number of probes that are deployed for the management node.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder probeUsedCount(Integer probeUsedCount) {
                this.probeUsedCount = probeUsedCount;
                return this;
            }

            /**
             * <p>An array consisting of the CIDR blocks that are allowed to access the management node.</p>
             */
            public Builder securityGroupProbeIpList(java.util.List<String> securityGroupProbeIpList) {
                this.securityGroupProbeIpList = securityGroupProbeIpList;
                return this;
            }

            /**
             * <p>The status of the management node. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: preparing</li>
             * <li><strong>1</strong>: normal</li>
             * <li><strong>2</strong>: abnormal</li>
             * <li><strong>4</strong>: starting</li>
             * <li><strong>5</strong>: upgrading</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder totalStatus(Integer totalStatus) {
                this.totalStatus = totalStatus;
                return this;
            }

            /**
             * <p>Indicates whether the management node can be upgraded. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
