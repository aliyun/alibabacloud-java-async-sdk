// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListHoneypotProbeResponseBody} extends {@link TeaModel}
 *
 * <p>ListHoneypotProbeResponseBody</p>
 */
public class ListHoneypotProbeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List < List> list;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListHoneypotProbeResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.list = builder.list;
        this.message = builder.message;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHoneypotProbeResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return list
     */
    public java.util.List < List> getList() {
        return this.list;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
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
        private Integer httpStatusCode; 
        private java.util.List < List> list; 
        private String message; 
        private PageInfo pageInfo; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The status code that is returned. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>An array that consists of the details about the probe.</p>
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
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
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>4BC9E610-21BE-537F-82EF-144A60D5A970</p>
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

        public ListHoneypotProbeResponseBody build() {
            return new ListHoneypotProbeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHoneypotProbeResponseBody} extends {@link TeaModel}
     *
     * <p>ListHoneypotProbeResponseBody</p>
     */
    public static class ControlNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EcsInstanceId")
        private String ecsInstanceId;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        private ControlNode(Builder builder) {
            this.ecsInstanceId = builder.ecsInstanceId;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ControlNode create() {
            return builder().build();
        }

        /**
         * @return ecsInstanceId
         */
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        public static final class Builder {
            private String ecsInstanceId; 
            private String nodeId; 
            private String nodeName; 

            /**
             * <p>The ID of the Elastic Compute Service (ECS) instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-uf6eq0rlvu1mkh0p****</p>
             */
            public Builder ecsInstanceId(String ecsInstanceId) {
                this.ecsInstanceId = ecsInstanceId;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>8ec9da17-c0e7-4642-aad6-defc9722****</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>HoneypotNode1</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            public ControlNode build() {
                return new ControlNode(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListHoneypotProbeResponseBody} extends {@link TeaModel}
     *
     * <p>ListHoneypotProbeResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ControlNode")
        private ControlNode controlNode;

        @com.aliyun.core.annotation.NameInMap("DeployTime")
        private Long deployTime;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("HostIp")
        private String hostIp;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("ProbeId")
        private String probeId;

        @com.aliyun.core.annotation.NameInMap("ProbeType")
        private String probeType;

        @com.aliyun.core.annotation.NameInMap("ProbeVersion")
        private String probeVersion;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private List(Builder builder) {
            this.controlNode = builder.controlNode;
            this.deployTime = builder.deployTime;
            this.displayName = builder.displayName;
            this.hostIp = builder.hostIp;
            this.osType = builder.osType;
            this.probeId = builder.probeId;
            this.probeType = builder.probeType;
            this.probeVersion = builder.probeVersion;
            this.status = builder.status;
            this.uuid = builder.uuid;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return controlNode
         */
        public ControlNode getControlNode() {
            return this.controlNode;
        }

        /**
         * @return deployTime
         */
        public Long getDeployTime() {
            return this.deployTime;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return hostIp
         */
        public String getHostIp() {
            return this.hostIp;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return probeId
         */
        public String getProbeId() {
            return this.probeId;
        }

        /**
         * @return probeType
         */
        public String getProbeType() {
            return this.probeType;
        }

        /**
         * @return probeVersion
         */
        public String getProbeVersion() {
            return this.probeVersion;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private ControlNode controlNode; 
            private Long deployTime; 
            private String displayName; 
            private String hostIp; 
            private String osType; 
            private String probeId; 
            private String probeType; 
            private String probeVersion; 
            private String status; 
            private String uuid; 
            private String vpcId; 

            /**
             * <p>The information about the management node.</p>
             */
            public Builder controlNode(ControlNode controlNode) {
                this.controlNode = controlNode;
                return this;
            }

            /**
             * <p>The time when the probe was deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>1669363825000</p>
             */
            public Builder deployTime(Long deployTime) {
                this.deployTime = deployTime;
                return this;
            }

            /**
             * <p>The name of the probe.</p>
             * 
             * <strong>example:</strong>
             * <p>prod-pinpoint-hd1b</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The IP address of the server on which the probe is installed.</p>
             * 
             * <strong>example:</strong>
             * <p>33.53.XX.XX</p>
             */
            public Builder hostIp(String hostIp) {
                this.hostIp = hostIp;
                return this;
            }

            /**
             * <p>The operating system of the server on which the probe is deployed. Valid values:</p>
             * <ul>
             * <li>windows</li>
             * <li>linux</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>windows</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>The ID of the probe.</p>
             * 
             * <strong>example:</strong>
             * <p>4d167bb3-dd09-4a6a-a179-d5d6a5b0****</p>
             */
            public Builder probeId(String probeId) {
                this.probeId = probeId;
                return this;
            }

            /**
             * <p>The type of the probe. Valid values:</p>
             * <ul>
             * <li><strong>host_probe</strong>: host probe</li>
             * <li><strong>vpc_black_hole_probe</strong>: VPC probe</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>host_probe</p>
             */
            public Builder probeType(String probeType) {
                this.probeType = probeType;
                return this;
            }

            /**
             * <p>The version of the probe.</p>
             * 
             * <strong>example:</strong>
             * <p>18060096</p>
             */
            public Builder probeVersion(String probeVersion) {
                this.probeVersion = probeVersion;
                return this;
            }

            /**
             * <p>The status of the probe. Valid values:</p>
             * <ul>
             * <li><strong>installed</strong>: installed</li>
             * <li><strong>install_failed</strong>: installation failed</li>
             * <li><strong>online</strong>: online</li>
             * <li><strong>offline</strong>: offline</li>
             * <li><strong>unnormal</strong>: abnormal</li>
             * <li><strong>unprobe</strong>: unauthorized</li>
             * <li><strong>uninstalling</strong>: being uninstalled</li>
             * <li><strong>uninstalled</strong>: uninstalled</li>
             * <li><strong>uninstall_failed</strong>: uninstallation failed</li>
             * <li><strong>not_exist</strong>: not installed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The UUID of the server to which the host probe is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>49e25e0f-bb51-4a5a-a1b3-13a4ddaa****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * <p>The ID of the VPC in which the VPC probe is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-5gu8iu68w9b472jbb****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListHoneypotProbeResponseBody} extends {@link TeaModel}
     *
     * <p>ListHoneypotProbeResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page. Default value: <strong>20</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
