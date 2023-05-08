// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHoneypotProbeResponseBody} extends {@link TeaModel}
 *
 * <p>ListHoneypotProbeResponseBody</p>
 */
public class ListHoneypotProbeResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("List")
    private java.util.List < List> list;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * List.
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
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
         * PageInfo.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
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

        public ListHoneypotProbeResponseBody build() {
            return new ListHoneypotProbeResponseBody(this);
        } 

    } 

    public static class ControlNode extends TeaModel {
        @NameInMap("EcsInstanceId")
        private String ecsInstanceId;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("NodeName")
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
             * 实例id
             */
            public Builder ecsInstanceId(String ecsInstanceId) {
                this.ecsInstanceId = ecsInstanceId;
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
             * 节点名称
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
        @NameInMap("ControlNode")
        private ControlNode controlNode;

        @NameInMap("DeployTime")
        private Long deployTime;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("HostIp")
        private String hostIp;

        @NameInMap("OsType")
        private String osType;

        @NameInMap("ProbeId")
        private String probeId;

        @NameInMap("ProbeType")
        private String probeType;

        @NameInMap("ProbeVersion")
        private String probeVersion;

        @NameInMap("Status")
        private String status;

        @NameInMap("Uuid")
        private String uuid;

        @NameInMap("VpcId")
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
             * 管理节点
             */
            public Builder controlNode(ControlNode controlNode) {
                this.controlNode = controlNode;
                return this;
            }

            /**
             * 部署时间
             */
            public Builder deployTime(Long deployTime) {
                this.deployTime = deployTime;
                return this;
            }

            /**
             * 探针名称
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * 探针绑定的本地地址
             */
            public Builder hostIp(String hostIp) {
                this.hostIp = hostIp;
                return this;
            }

            /**
             * 操作系统类型
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * 探针id
             */
            public Builder probeId(String probeId) {
                this.probeId = probeId;
                return this;
            }

            /**
             * 探针类型
             */
            public Builder probeType(String probeType) {
                this.probeType = probeType;
                return this;
            }

            /**
             * 探针版本
             */
            public Builder probeVersion(String probeVersion) {
                this.probeVersion = probeVersion;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * VpcId.
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
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
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
             * TotalCount.
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
