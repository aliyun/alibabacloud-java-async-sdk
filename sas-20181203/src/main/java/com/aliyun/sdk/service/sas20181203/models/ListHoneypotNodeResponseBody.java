// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHoneypotNodeResponseBody} extends {@link TeaModel}
 *
 * <p>ListHoneypotNodeResponseBody</p>
 */
public class ListHoneypotNodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HoneypotNodeList")
    private java.util.List < HoneypotNodeList> honeypotNodeList;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListHoneypotNodeResponseBody(Builder builder) {
        this.code = builder.code;
        this.honeypotNodeList = builder.honeypotNodeList;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHoneypotNodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return honeypotNodeList
     */
    public java.util.List < HoneypotNodeList> getHoneypotNodeList() {
        return this.honeypotNodeList;
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
        private java.util.List < HoneypotNodeList> honeypotNodeList; 
        private Integer httpStatusCode; 
        private String message; 
        private PageInfo pageInfo; 
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
         * An array that consists of the information about the management nodes.
         */
        public Builder honeypotNodeList(java.util.List < HoneypotNodeList> honeypotNodeList) {
            this.honeypotNodeList = honeypotNodeList;
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
         * The error message returned.
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

        public ListHoneypotNodeResponseBody build() {
            return new ListHoneypotNodeResponseBody(this);
        } 

    } 

    public static class HoneypotNodeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowHoneypotAccessInternet")
        private Boolean allowHoneypotAccessInternet;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DefaultNode")
        private Boolean defaultNode;

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

        private HoneypotNodeList(Builder builder) {
            this.allowHoneypotAccessInternet = builder.allowHoneypotAccessInternet;
            this.createTime = builder.createTime;
            this.defaultNode = builder.defaultNode;
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

        public static HoneypotNodeList create() {
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
         * @return defaultNode
         */
        public Boolean getDefaultNode() {
            return this.defaultNode;
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
            private Boolean defaultNode; 
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
             * The type of the management node. Default value: **false**. Valid values:
             * <p>
             * 
             * *   **false**: non-default type
             * *   **true**: default type
             */
            public Builder defaultNode(Boolean defaultNode) {
                this.defaultNode = defaultNode;
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
             * *   **1**: normal
             * *   **2**: abnormal
             */
            public Builder totalStatus(Integer totalStatus) {
                this.totalStatus = totalStatus;
                return this;
            }

            /**
             * Indicates whether the management node can be upgraded. Valid values:
             * <p>
             * 
             * *   **false**: no
             * *   **true**: yes
             */
            public Builder upgradeAvailable(Boolean upgradeAvailable) {
                this.upgradeAvailable = upgradeAvailable;
                return this;
            }

            public HoneypotNodeList build() {
                return new HoneypotNodeList(this);
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
             * The number of entries returned per page.
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
