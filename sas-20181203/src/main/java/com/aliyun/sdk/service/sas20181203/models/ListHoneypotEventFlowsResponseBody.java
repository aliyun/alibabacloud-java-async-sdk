// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHoneypotEventFlowsResponseBody} extends {@link TeaModel}
 *
 * <p>ListHoneypotEventFlowsResponseBody</p>
 */
public class ListHoneypotEventFlowsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HoneypotEventFlows")
    private java.util.List < HoneypotEventFlows> honeypotEventFlows;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HoneypotEventFlows.
         */
        public Builder honeypotEventFlows(java.util.List < HoneypotEventFlows> honeypotEventFlows) {
            this.honeypotEventFlows = honeypotEventFlows;
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

        public ListHoneypotEventFlowsResponseBody build() {
            return new ListHoneypotEventFlowsResponseBody(this);
        } 

    } 

    public static class HoneypotEventFlows extends TeaModel {
        @NameInMap("AgentId")
        private String agentId;

        @NameInMap("AgentName")
        private String agentName;

        @NameInMap("DockerId")
        private String dockerId;

        @NameInMap("DstIp")
        private String dstIp;

        @NameInMap("DstPort")
        private Integer dstPort;

        @NameInMap("EventConnection")
        private String eventConnection;

        @NameInMap("Extra")
        private String extra;

        @NameInMap("Extra1")
        private String extra1;

        @NameInMap("FileOssUrl")
        private String fileOssUrl;

        @NameInMap("FirstTime")
        private Long firstTime;

        @NameInMap("HoneypotEventId")
        private String honeypotEventId;

        @NameInMap("HoneypotId")
        private String honeypotId;

        @NameInMap("HoneypotName")
        private String honeypotName;

        @NameInMap("LastTime")
        private Long lastTime;

        @NameInMap("RiskLevel")
        private String riskLevel;

        @NameInMap("SecurityEventId")
        private Long securityEventId;

        @NameInMap("SrcIp")
        private String srcIp;

        @NameInMap("SrcMac")
        private String srcMac;

        @NameInMap("SrcPort")
        private Integer srcPort;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TypeId")
        private String typeId;

        @NameInMap("Uid")
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
             * AgentId.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * AgentName.
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * DockerId.
             */
            public Builder dockerId(String dockerId) {
                this.dockerId = dockerId;
                return this;
            }

            /**
             * DstIp.
             */
            public Builder dstIp(String dstIp) {
                this.dstIp = dstIp;
                return this;
            }

            /**
             * DstPort.
             */
            public Builder dstPort(Integer dstPort) {
                this.dstPort = dstPort;
                return this;
            }

            /**
             * EventConnection.
             */
            public Builder eventConnection(String eventConnection) {
                this.eventConnection = eventConnection;
                return this;
            }

            /**
             * Extra.
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * Extra1.
             */
            public Builder extra1(String extra1) {
                this.extra1 = extra1;
                return this;
            }

            /**
             * FileOssUrl.
             */
            public Builder fileOssUrl(String fileOssUrl) {
                this.fileOssUrl = fileOssUrl;
                return this;
            }

            /**
             * FirstTime.
             */
            public Builder firstTime(Long firstTime) {
                this.firstTime = firstTime;
                return this;
            }

            /**
             * HoneypotEventId.
             */
            public Builder honeypotEventId(String honeypotEventId) {
                this.honeypotEventId = honeypotEventId;
                return this;
            }

            /**
             * HoneypotId.
             */
            public Builder honeypotId(String honeypotId) {
                this.honeypotId = honeypotId;
                return this;
            }

            /**
             * HoneypotName.
             */
            public Builder honeypotName(String honeypotName) {
                this.honeypotName = honeypotName;
                return this;
            }

            /**
             * LastTime.
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * RiskLevel.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * SecurityEventId.
             */
            public Builder securityEventId(Long securityEventId) {
                this.securityEventId = securityEventId;
                return this;
            }

            /**
             * SrcIp.
             */
            public Builder srcIp(String srcIp) {
                this.srcIp = srcIp;
                return this;
            }

            /**
             * SrcMac.
             */
            public Builder srcMac(String srcMac) {
                this.srcMac = srcMac;
                return this;
            }

            /**
             * SrcPort.
             */
            public Builder srcPort(Integer srcPort) {
                this.srcPort = srcPort;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TypeId.
             */
            public Builder typeId(String typeId) {
                this.typeId = typeId;
                return this;
            }

            /**
             * Uid.
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
