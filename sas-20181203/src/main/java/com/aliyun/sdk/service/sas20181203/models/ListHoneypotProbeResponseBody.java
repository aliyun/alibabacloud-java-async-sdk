// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The status code that is returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The HTTP status code that is returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * An array that consists of the details about the probe.
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
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
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
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

        public ListHoneypotProbeResponseBody build() {
            return new ListHoneypotProbeResponseBody(this);
        } 

    } 

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
             * The ID of the Elastic Compute Service (ECS) instance.
             */
            public Builder ecsInstanceId(String ecsInstanceId) {
                this.ecsInstanceId = ecsInstanceId;
                return this;
            }

            /**
             * The ID of the node.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The name of the node.
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
             * The information about the management node.
             */
            public Builder controlNode(ControlNode controlNode) {
                this.controlNode = controlNode;
                return this;
            }

            /**
             * The time when the probe was deployed.
             */
            public Builder deployTime(Long deployTime) {
                this.deployTime = deployTime;
                return this;
            }

            /**
             * The name of the probe.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * The IP address of the server on which the probe is installed.
             */
            public Builder hostIp(String hostIp) {
                this.hostIp = hostIp;
                return this;
            }

            /**
             * The operating system of the server on which the probe is deployed. Valid values:
             * <p>
             * 
             * *   windows
             * *   linux
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * The ID of the probe.
             */
            public Builder probeId(String probeId) {
                this.probeId = probeId;
                return this;
            }

            /**
             * The type of the probe. Valid values:
             * <p>
             * 
             * *   **host_probe**: host probe
             * *   **vpc_black_hole_probe**: VPC probe
             */
            public Builder probeType(String probeType) {
                this.probeType = probeType;
                return this;
            }

            /**
             * The version of the probe.
             */
            public Builder probeVersion(String probeVersion) {
                this.probeVersion = probeVersion;
                return this;
            }

            /**
             * The status of the probe. Valid values:
             * <p>
             * 
             * *   **installed**: installed
             * *   **install_failed**: installation failed
             * *   **online**: online
             * *   **offline**: offline
             * *   **unnormal**: abnormal
             * *   **unprobe**: unauthorized
             * *   **uninstalling**: being uninstalled
             * *   **uninstalled**: uninstalled
             * *   **uninstall_failed**: uninstallation failed
             * *   **not_exist**: not installed
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The UUID of the server to which the host probe is deployed.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * The ID of the VPC in which the VPC probe is deployed.
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
             * The number of entries returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries returned per page. Default value: **20**.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
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
