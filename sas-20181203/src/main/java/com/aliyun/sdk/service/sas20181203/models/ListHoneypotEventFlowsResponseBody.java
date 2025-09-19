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
 * {@link ListHoneypotEventFlowsResponseBody} extends {@link TeaModel}
 *
 * <p>ListHoneypotEventFlowsResponseBody</p>
 */
public class ListHoneypotEventFlowsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HoneypotEventFlows")
    private java.util.List<HoneypotEventFlows> honeypotEventFlows;

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
     * @return honeypotEventFlows
     */
    public java.util.List<HoneypotEventFlows> getHoneypotEventFlows() {
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
        private java.util.List<HoneypotEventFlows> honeypotEventFlows; 
        private Integer httpStatusCode; 
        private String message; 
        private PageInfo pageInfo; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListHoneypotEventFlowsResponseBody model) {
            this.code = model.code;
            this.honeypotEventFlows = model.honeypotEventFlows;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The attack timelines.</p>
         */
        public Builder honeypotEventFlows(java.util.List<HoneypotEventFlows> honeypotEventFlows) {
            this.honeypotEventFlows = honeypotEventFlows;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The returned message.</p>
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9F4E6157-9600-5588-86B9-38F09067****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListHoneypotEventFlowsResponseBody build() {
            return new ListHoneypotEventFlowsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHoneypotEventFlowsResponseBody} extends {@link TeaModel}
     *
     * <p>ListHoneypotEventFlowsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(HoneypotEventFlows model) {
                this.agentId = model.agentId;
                this.agentName = model.agentName;
                this.dockerId = model.dockerId;
                this.dstIp = model.dstIp;
                this.dstPort = model.dstPort;
                this.eventConnection = model.eventConnection;
                this.extra = model.extra;
                this.extra1 = model.extra1;
                this.fileOssUrl = model.fileOssUrl;
                this.firstTime = model.firstTime;
                this.honeypotEventId = model.honeypotEventId;
                this.honeypotId = model.honeypotId;
                this.honeypotName = model.honeypotName;
                this.lastTime = model.lastTime;
                this.riskLevel = model.riskLevel;
                this.securityEventId = model.securityEventId;
                this.srcIp = model.srcIp;
                this.srcMac = model.srcMac;
                this.srcPort = model.srcPort;
                this.status = model.status;
                this.typeId = model.typeId;
                this.uid = model.uid;
            } 

            /**
             * <p>The ID of the probe.</p>
             * 
             * <strong>example:</strong>
             * <p>d3c0dafa-5059-4eb0-8c28-7d40f58*****</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The name of the probe.</p>
             * 
             * <strong>example:</strong>
             * <p>hw-d***</p>
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * <p>The ID of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>eca09895****</p>
             */
            public Builder dockerId(String dockerId) {
                this.dockerId = dockerId;
                return this;
            }

            /**
             * <p>The destination IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>112.126.205.***</p>
             */
            public Builder dstIp(String dstIp) {
                this.dstIp = dstIp;
                return this;
            }

            /**
             * <p>The destination port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder dstPort(Integer dstPort) {
                this.dstPort = dstPort;
                return this;
            }

            /**
             * <p>The UUID of the connection in the attack.</p>
             * 
             * <strong>example:</strong>
             * <p>fd7f1ff4-0c4b-41cb-99ad-0724349d****</p>
             */
            public Builder eventConnection(String eventConnection) {
                this.eventConnection = eventConnection;
                return this;
            }

            /**
             * <p>The extended information about the attack payload.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;payload&quot;:{&quot;format&quot;:&quot;line&quot;,&quot;name&quot;:{&quot;cn&quot;:&quot;payload&quot;,&quot;en&quot;:&quot;payload&quot;},&quot;value&quot;:&quot;&quot;},&quot;uid&quot;:{&quot;format&quot;:&quot;line&quot;,&quot;name&quot;:{&quot;cn&quot;:&quot;&quot;,&quot;en&quot;:&quot;&quot;},&quot;uid&quot;:&quot;5fa2ece9-aa08-4bbd-a272-5d27*********&quot;,&quot;value&quot;:&quot;&quot;}}</p>
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * <p>The extension information about the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;vpc_id&quot;:&quot;&quot;,&quot;vpc_dest_port&quot;:&quot;&quot;,&quot;vpc_dest_ip&quot;:&quot;&quot;}</p>
             */
            public Builder extra1(String extra1) {
                this.extra1 = extra1;
                return this;
            }

            /**
             * <p>The Object Storage Service (OSS) URL of the file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://pop-test-file-upload.oss-cn-beijing.aliyuncs.com/5626_26331">https://pop-test-file-upload.oss-cn-beijing.aliyuncs.com/5626_26331</a>*****</p>
             */
            public Builder fileOssUrl(String fileOssUrl) {
                this.fileOssUrl = fileOssUrl;
                return this;
            }

            /**
             * <p>The timestamp when the intrusion event was first occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>1686621122000</p>
             */
            public Builder firstTime(Long firstTime) {
                this.firstTime = firstTime;
                return this;
            }

            /**
             * <p>The ID of the intrusion event. The value is a string.</p>
             * 
             * <strong>example:</strong>
             * <p>19bec028-d98b-45c4-a4d9-cc3d593f****</p>
             */
            public Builder honeypotEventId(String honeypotEventId) {
                this.honeypotEventId = honeypotEventId;
                return this;
            }

            /**
             * <p>The ID of the honeypot.</p>
             * 
             * <strong>example:</strong>
             * <p>911df9d6fe20451c059edbcffa1d1c33452f6a71e59d4826da067af224*****</p>
             */
            public Builder honeypotId(String honeypotId) {
                this.honeypotId = honeypotId;
                return this;
            }

            /**
             * <p>The name of the honeypot.</p>
             * 
             * <strong>example:</strong>
             * <p>hw-zhi*****</p>
             */
            public Builder honeypotName(String honeypotName) {
                this.honeypotName = honeypotName;
                return this;
            }

            /**
             * <p>The timestamp when the intrusion event was last occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>1686622222000</p>
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li><strong>2</strong>: low</li>
             * <li><strong>3</strong>: medium</li>
             * <li><strong>4</strong>: high</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The ID of the intrusion event.</p>
             * 
             * <strong>example:</strong>
             * <p>306527555</p>
             */
            public Builder securityEventId(Long securityEventId) {
                this.securityEventId = securityEventId;
                return this;
            }

            /**
             * <p>The source IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>121.41.48.***</p>
             */
            public Builder srcIp(String srcIp) {
                this.srcIp = srcIp;
                return this;
            }

            /**
             * <p>The source media access control (MAC) address.</p>
             * 
             * <strong>example:</strong>
             * <p>00:0C:29:CA:<strong>:</strong></p>
             */
            public Builder srcMac(String srcMac) {
                this.srcMac = srcMac;
                return this;
            }

            /**
             * <p>The source port number.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder srcPort(Integer srcPort) {
                this.srcPort = srcPort;
                return this;
            }

            /**
             * <p>The handling status of the intrusion event. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: pending handling</li>
             * <li><strong>2</strong>: ignored</li>
             * <li><strong>4</strong>: confirmed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the attack type.</p>
             * 
             * <strong>example:</strong>
             * <p>web_access</p>
             */
            public Builder typeId(String typeId) {
                this.typeId = typeId;
                return this;
            }

            /**
             * <p>The UUID of an attack in the intrusion event.</p>
             * 
             * <strong>example:</strong>
             * <p>5fa2ece9-aa08-4bbd-a272-5d27d1c6*****</p>
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
    /**
     * 
     * {@link ListHoneypotEventFlowsResponseBody} extends {@link TeaModel}
     *
     * <p>ListHoneypotEventFlowsResponseBody</p>
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
             * <p>20</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
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
             * <p>78</p>
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
