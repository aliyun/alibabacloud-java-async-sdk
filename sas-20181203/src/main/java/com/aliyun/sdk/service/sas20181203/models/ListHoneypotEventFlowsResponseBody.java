// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHoneypotEventFlowsResponseBody} extends {@link TeaModel}
 *
 * <p>ListHoneypotEventFlowsResponseBody</p>
 */
public class ListHoneypotEventFlowsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HoneypotEventFlows")
    private java.util.List < HoneypotEventFlows> honeypotEventFlows;

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

    private ListHoneypotEventFlowsResponseBody(Builder builder) {
        this.code = builder.code;
        this.honeypotEventFlows = builder.honeypotEventFlows;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHoneypotEventFlowsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return honeypotEventFlows
     */
    public java.util.List < HoneypotEventFlows> getHoneypotEventFlows() {
        return this.honeypotEventFlows;
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
        private java.util.List < HoneypotEventFlows> honeypotEventFlows; 
        private Integer httpStatusCode; 
        private String message; 
        private PageInfo pageInfo; 
        private String requestId; 
        private Boolean success; 

        /**
         * The status code. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The attack timelines.
         */
        public Builder honeypotEventFlows(java.util.List < HoneypotEventFlows> honeypotEventFlows) {
            this.honeypotEventFlows = honeypotEventFlows;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The returned message.
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListHoneypotEventFlowsResponseBody build() {
            return new ListHoneypotEventFlowsResponseBody(this);
        } 

    } 

    public static class HoneypotEventFlows extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("DockerId")
        private String dockerId;

        @com.aliyun.core.annotation.NameInMap("DstIp")
        private String dstIp;

        @com.aliyun.core.annotation.NameInMap("DstPort")
        private Integer dstPort;

        @com.aliyun.core.annotation.NameInMap("EventConnection")
        private String eventConnection;

        @com.aliyun.core.annotation.NameInMap("Extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("Extra1")
        private String extra1;

        @com.aliyun.core.annotation.NameInMap("FileOssUrl")
        private String fileOssUrl;

        @com.aliyun.core.annotation.NameInMap("FirstTime")
        private Long firstTime;

        @com.aliyun.core.annotation.NameInMap("HoneypotEventId")
        private String honeypotEventId;

        @com.aliyun.core.annotation.NameInMap("HoneypotId")
        private String honeypotId;

        @com.aliyun.core.annotation.NameInMap("HoneypotName")
        private String honeypotName;

        @com.aliyun.core.annotation.NameInMap("LastTime")
        private Long lastTime;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("SecurityEventId")
        private Long securityEventId;

        @com.aliyun.core.annotation.NameInMap("SrcIp")
        private String srcIp;

        @com.aliyun.core.annotation.NameInMap("SrcMac")
        private String srcMac;

        @com.aliyun.core.annotation.NameInMap("SrcPort")
        private Integer srcPort;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TypeId")
        private String typeId;

        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        private HoneypotEventFlows(Builder builder) {
            this.agentId = builder.agentId;
            this.agentName = builder.agentName;
            this.dockerId = builder.dockerId;
            this.dstIp = builder.dstIp;
            this.dstPort = builder.dstPort;
            this.eventConnection = builder.eventConnection;
            this.extra = builder.extra;
            this.extra1 = builder.extra1;
            this.fileOssUrl = builder.fileOssUrl;
            this.firstTime = builder.firstTime;
            this.honeypotEventId = builder.honeypotEventId;
            this.honeypotId = builder.honeypotId;
            this.honeypotName = builder.honeypotName;
            this.lastTime = builder.lastTime;
            this.riskLevel = builder.riskLevel;
            this.securityEventId = builder.securityEventId;
            this.srcIp = builder.srcIp;
            this.srcMac = builder.srcMac;
            this.srcPort = builder.srcPort;
            this.status = builder.status;
            this.typeId = builder.typeId;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HoneypotEventFlows create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        /**
         * @return dockerId
         */
        public String getDockerId() {
            return this.dockerId;
        }

        /**
         * @return dstIp
         */
        public String getDstIp() {
            return this.dstIp;
        }

        /**
         * @return dstPort
         */
        public Integer getDstPort() {
            return this.dstPort;
        }

        /**
         * @return eventConnection
         */
        public String getEventConnection() {
            return this.eventConnection;
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return extra1
         */
        public String getExtra1() {
            return this.extra1;
        }

        /**
         * @return fileOssUrl
         */
        public String getFileOssUrl() {
            return this.fileOssUrl;
        }

        /**
         * @return firstTime
         */
        public Long getFirstTime() {
            return this.firstTime;
        }

        /**
         * @return honeypotEventId
         */
        public String getHoneypotEventId() {
            return this.honeypotEventId;
        }

        /**
         * @return honeypotId
         */
        public String getHoneypotId() {
            return this.honeypotId;
        }

        /**
         * @return honeypotName
         */
        public String getHoneypotName() {
            return this.honeypotName;
        }

        /**
         * @return lastTime
         */
        public Long getLastTime() {
            return this.lastTime;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return securityEventId
         */
        public Long getSecurityEventId() {
            return this.securityEventId;
        }

        /**
         * @return srcIp
         */
        public String getSrcIp() {
            return this.srcIp;
        }

        /**
         * @return srcMac
         */
        public String getSrcMac() {
            return this.srcMac;
        }

        /**
         * @return srcPort
         */
        public Integer getSrcPort() {
            return this.srcPort;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return typeId
         */
        public String getTypeId() {
            return this.typeId;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String agentId; 
            private String agentName; 
            private String dockerId; 
            private String dstIp; 
            private Integer dstPort; 
            private String eventConnection; 
            private String extra; 
            private String extra1; 
            private String fileOssUrl; 
            private Long firstTime; 
            private String honeypotEventId; 
            private String honeypotId; 
            private String honeypotName; 
            private Long lastTime; 
            private String riskLevel; 
            private Long securityEventId; 
            private String srcIp; 
            private String srcMac; 
            private Integer srcPort; 
            private Integer status; 
            private String typeId; 
            private String uid; 

            /**
             * The ID of the probe.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * The name of the probe.
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * The ID of the container.
             */
            public Builder dockerId(String dockerId) {
                this.dockerId = dockerId;
                return this;
            }

            /**
             * The destination IP address.
             */
            public Builder dstIp(String dstIp) {
                this.dstIp = dstIp;
                return this;
            }

            /**
             * The destination port.
             */
            public Builder dstPort(Integer dstPort) {
                this.dstPort = dstPort;
                return this;
            }

            /**
             * The UUID of the connection in the attack.
             */
            public Builder eventConnection(String eventConnection) {
                this.eventConnection = eventConnection;
                return this;
            }

            /**
             * The extended information about the attack payload.
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * The extension information about the virtual private cloud (VPC).
             */
            public Builder extra1(String extra1) {
                this.extra1 = extra1;
                return this;
            }

            /**
             * The Object Storage Service (OSS) URL of the file.
             */
            public Builder fileOssUrl(String fileOssUrl) {
                this.fileOssUrl = fileOssUrl;
                return this;
            }

            /**
             * The timestamp when the intrusion event was first occurred.
             */
            public Builder firstTime(Long firstTime) {
                this.firstTime = firstTime;
                return this;
            }

            /**
             * The ID of the intrusion event. The value is a string.
             */
            public Builder honeypotEventId(String honeypotEventId) {
                this.honeypotEventId = honeypotEventId;
                return this;
            }

            /**
             * The ID of the honeypot.
             */
            public Builder honeypotId(String honeypotId) {
                this.honeypotId = honeypotId;
                return this;
            }

            /**
             * The name of the honeypot.
             */
            public Builder honeypotName(String honeypotName) {
                this.honeypotName = honeypotName;
                return this;
            }

            /**
             * The timestamp when the intrusion event was last occurred.
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * The risk level. Valid values:
             * <p>
             * 
             * *   **2**: low
             * *   **3**: medium
             * *   **4**: high
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * The ID of the intrusion event.
             */
            public Builder securityEventId(Long securityEventId) {
                this.securityEventId = securityEventId;
                return this;
            }

            /**
             * The source IP address.
             */
            public Builder srcIp(String srcIp) {
                this.srcIp = srcIp;
                return this;
            }

            /**
             * The source media access control (MAC) address.
             */
            public Builder srcMac(String srcMac) {
                this.srcMac = srcMac;
                return this;
            }

            /**
             * The source port number.
             */
            public Builder srcPort(Integer srcPort) {
                this.srcPort = srcPort;
                return this;
            }

            /**
             * The handling status of the intrusion event. Valid values:
             * <p>
             * 
             * *   **1**: pending handling
             * *   **2**: ignored
             * *   **4**: confirmed
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the attack type.
             */
            public Builder typeId(String typeId) {
                this.typeId = typeId;
                return this;
            }

            /**
             * The UUID of an attack in the intrusion event.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public HoneypotEventFlows build() {
                return new HoneypotEventFlows(this);
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
             * The page number.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries per page.
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
