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
 * {@link ListHoneypotNodeResponseBody} extends {@link TeaModel}
 *
 * <p>ListHoneypotNodeResponseBody</p>
 */
public class ListHoneypotNodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HoneypotNodeList")
    private java.util.List<HoneypotNodeList> honeypotNodeList;

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
     * @return honeypotNodeList
     */
    public java.util.List<HoneypotNodeList> getHoneypotNodeList() {
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
        private java.util.List<HoneypotNodeList> honeypotNodeList; 
        private Integer httpStatusCode; 
        private String message; 
        private PageInfo pageInfo; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListHoneypotNodeResponseBody model) {
            this.code = model.code;
            this.honeypotNodeList = model.honeypotNodeList;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageInfo = model.pageInfo;
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
         * <p>An array that consists of the information about the management nodes.</p>
         */
        public Builder honeypotNodeList(java.util.List<HoneypotNodeList> honeypotNodeList) {
            this.honeypotNodeList = honeypotNodeList;
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
         * <p>The error message returned.</p>
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
         * <p>337BEA70-B03D-5370-8420-436F3FCD9924</p>
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

        public ListHoneypotNodeResponseBody build() {
            return new ListHoneypotNodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHoneypotNodeResponseBody} extends {@link TeaModel}
     *
     * <p>ListHoneypotNodeResponseBody</p>
     */
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
        private java.util.List<String> securityGroupProbeIpList;

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
            private Boolean defaultNode; 
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

            private Builder(HoneypotNodeList model) {
                this.allowHoneypotAccessInternet = model.allowHoneypotAccessInternet;
                this.createTime = model.createTime;
                this.defaultNode = model.defaultNode;
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
             * <p>2022-08-04 15:52:56</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The type of the management node. Default value: <strong>false</strong>. Valid values:</p>
             * <ul>
             * <li><strong>false</strong>: non-default type</li>
             * <li><strong>true</strong>: default type</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder defaultNode(Boolean defaultNode) {
                this.defaultNode = defaultNode;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1fs3qsc1msa3512k****</p>
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
             * <p>2</p>
             */
            public Builder honeypotUsedCount(Integer honeypotUsedCount) {
                this.honeypotUsedCount = honeypotUsedCount;
                return this;
            }

            /**
             * <p>The ID of the management node.</p>
             * 
             * <strong>example:</strong>
             * <p>7d110ca6-05ee-4149-8042-13ad1a41fd****</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The IP address of the management node.</p>
             * 
             * <strong>example:</strong>
             * <p>119.180.XX.XX</p>
             */
            public Builder nodeIp(String nodeIp) {
                this.nodeIp = nodeIp;
                return this;
            }

            /**
             * <p>The name of the management node.</p>
             * 
             * <strong>example:</strong>
             * <p>cyct_cnymu</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The maximum number of probes that can be deployed for the management node.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder probeTotalCount(Integer probeTotalCount) {
                this.probeTotalCount = probeTotalCount;
                return this;
            }

            /**
             * <p>The number of probes that are deployed for the management node.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
             * <li><strong>1</strong>: normal</li>
             * <li><strong>2</strong>: abnormal</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalStatus(Integer totalStatus) {
                this.totalStatus = totalStatus;
                return this;
            }

            /**
             * <p>Indicates whether the management node can be upgraded. Valid values:</p>
             * <ul>
             * <li><strong>false</strong>: no</li>
             * <li><strong>true</strong>: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link ListHoneypotNodeResponseBody} extends {@link TeaModel}
     *
     * <p>ListHoneypotNodeResponseBody</p>
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

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.count = model.count;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
             * <p>The number of entries returned per page.</p>
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
             * <p>149</p>
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
