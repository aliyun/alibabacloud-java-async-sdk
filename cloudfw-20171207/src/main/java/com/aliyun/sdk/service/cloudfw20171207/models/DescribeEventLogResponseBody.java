// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeEventLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventLogResponseBody</p>
 */
public class DescribeEventLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeEventLogResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventLogResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataList
     */
    public java.util.List<DataList> getDataList() {
        return this.dataList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<DataList> dataList; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeEventLogResponseBody model) {
            this.dataList = model.dataList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of ISPs.</p>
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D19D8F70-D64B-5A95-905A-6073BF4A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEventLogResponseBody build() {
            return new DescribeEventLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEventLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventLogResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("AttackApp")
        private String attackApp;

        @com.aliyun.core.annotation.NameInMap("AttackType")
        private Long attackType;

        @com.aliyun.core.annotation.NameInMap("Direction")
        private String direction;

        @com.aliyun.core.annotation.NameInMap("DstIP")
        private String dstIP;

        @com.aliyun.core.annotation.NameInMap("DstPort")
        private Integer dstPort;

        @com.aliyun.core.annotation.NameInMap("HitContent")
        private String hitContent;

        @com.aliyun.core.annotation.NameInMap("HitType")
        private String hitType;

        @com.aliyun.core.annotation.NameInMap("IpProtocol")
        private String ipProtocol;

        @com.aliyun.core.annotation.NameInMap("MemberUid")
        private Long memberUid;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleResult")
        private Integer ruleResult;

        @com.aliyun.core.annotation.NameInMap("RuleSource")
        private Long ruleSource;

        @com.aliyun.core.annotation.NameInMap("Sni")
        private String sni;

        @com.aliyun.core.annotation.NameInMap("SrcIP")
        private String srcIP;

        @com.aliyun.core.annotation.NameInMap("SrcPort")
        private Integer srcPort;

        @com.aliyun.core.annotation.NameInMap("SslCipher")
        private String sslCipher;

        @com.aliyun.core.annotation.NameInMap("SslErrorIndex")
        private String sslErrorIndex;

        @com.aliyun.core.annotation.NameInMap("SslErrorMsg")
        private String sslErrorMsg;

        @com.aliyun.core.annotation.NameInMap("SslHandshakeRes")
        private String sslHandshakeRes;

        @com.aliyun.core.annotation.NameInMap("SslProtocol")
        private String sslProtocol;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("VulLevel")
        private Long vulLevel;

        private DataList(Builder builder) {
            this.applicationName = builder.applicationName;
            this.attackApp = builder.attackApp;
            this.attackType = builder.attackType;
            this.direction = builder.direction;
            this.dstIP = builder.dstIP;
            this.dstPort = builder.dstPort;
            this.hitContent = builder.hitContent;
            this.hitType = builder.hitType;
            this.ipProtocol = builder.ipProtocol;
            this.memberUid = builder.memberUid;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.ruleResult = builder.ruleResult;
            this.ruleSource = builder.ruleSource;
            this.sni = builder.sni;
            this.srcIP = builder.srcIP;
            this.srcPort = builder.srcPort;
            this.sslCipher = builder.sslCipher;
            this.sslErrorIndex = builder.sslErrorIndex;
            this.sslErrorMsg = builder.sslErrorMsg;
            this.sslHandshakeRes = builder.sslHandshakeRes;
            this.sslProtocol = builder.sslProtocol;
            this.startTime = builder.startTime;
            this.url = builder.url;
            this.vulLevel = builder.vulLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        /**
         * @return attackApp
         */
        public String getAttackApp() {
            return this.attackApp;
        }

        /**
         * @return attackType
         */
        public Long getAttackType() {
            return this.attackType;
        }

        /**
         * @return direction
         */
        public String getDirection() {
            return this.direction;
        }

        /**
         * @return dstIP
         */
        public String getDstIP() {
            return this.dstIP;
        }

        /**
         * @return dstPort
         */
        public Integer getDstPort() {
            return this.dstPort;
        }

        /**
         * @return hitContent
         */
        public String getHitContent() {
            return this.hitContent;
        }

        /**
         * @return hitType
         */
        public String getHitType() {
            return this.hitType;
        }

        /**
         * @return ipProtocol
         */
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        /**
         * @return memberUid
         */
        public Long getMemberUid() {
            return this.memberUid;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleResult
         */
        public Integer getRuleResult() {
            return this.ruleResult;
        }

        /**
         * @return ruleSource
         */
        public Long getRuleSource() {
            return this.ruleSource;
        }

        /**
         * @return sni
         */
        public String getSni() {
            return this.sni;
        }

        /**
         * @return srcIP
         */
        public String getSrcIP() {
            return this.srcIP;
        }

        /**
         * @return srcPort
         */
        public Integer getSrcPort() {
            return this.srcPort;
        }

        /**
         * @return sslCipher
         */
        public String getSslCipher() {
            return this.sslCipher;
        }

        /**
         * @return sslErrorIndex
         */
        public String getSslErrorIndex() {
            return this.sslErrorIndex;
        }

        /**
         * @return sslErrorMsg
         */
        public String getSslErrorMsg() {
            return this.sslErrorMsg;
        }

        /**
         * @return sslHandshakeRes
         */
        public String getSslHandshakeRes() {
            return this.sslHandshakeRes;
        }

        /**
         * @return sslProtocol
         */
        public String getSslProtocol() {
            return this.sslProtocol;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return vulLevel
         */
        public Long getVulLevel() {
            return this.vulLevel;
        }

        public static final class Builder {
            private String applicationName; 
            private String attackApp; 
            private Long attackType; 
            private String direction; 
            private String dstIP; 
            private Integer dstPort; 
            private String hitContent; 
            private String hitType; 
            private String ipProtocol; 
            private Long memberUid; 
            private String ruleId; 
            private String ruleName; 
            private Integer ruleResult; 
            private Long ruleSource; 
            private String sni; 
            private String srcIP; 
            private Integer srcPort; 
            private String sslCipher; 
            private String sslErrorIndex; 
            private String sslErrorMsg; 
            private String sslHandshakeRes; 
            private String sslProtocol; 
            private Long startTime; 
            private String url; 
            private Long vulLevel; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.applicationName = model.applicationName;
                this.attackApp = model.attackApp;
                this.attackType = model.attackType;
                this.direction = model.direction;
                this.dstIP = model.dstIP;
                this.dstPort = model.dstPort;
                this.hitContent = model.hitContent;
                this.hitType = model.hitType;
                this.ipProtocol = model.ipProtocol;
                this.memberUid = model.memberUid;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.ruleResult = model.ruleResult;
                this.ruleSource = model.ruleSource;
                this.sni = model.sni;
                this.srcIP = model.srcIP;
                this.srcPort = model.srcPort;
                this.sslCipher = model.sslCipher;
                this.sslErrorIndex = model.sslErrorIndex;
                this.sslErrorMsg = model.sslErrorMsg;
                this.sslHandshakeRes = model.sslHandshakeRes;
                this.sslProtocol = model.sslProtocol;
                this.startTime = model.startTime;
                this.url = model.url;
                this.vulLevel = model.vulLevel;
            } 

            /**
             * <p>The application type supported by the access control policy. We recommend that you use ApplicationNameList. Valid values:</p>
             * <ul>
             * <li><strong>FTP</strong></li>
             * <li><strong>HTTP</strong></li>
             * <li><strong>HTTPS</strong></li>
             * <li><strong>Memcache</strong></li>
             * <li><strong>MongoDB</strong></li>
             * <li><strong>MQTT</strong></li>
             * <li><strong>MySQL</strong></li>
             * <li><strong>RDP</strong></li>
             * <li><strong>Redis</strong></li>
             * <li><strong>SMTP</strong></li>
             * <li><strong>SMTPS</strong></li>
             * <li><strong>SSH</strong></li>
             * <li><strong>SSL</strong></li>
             * <li><strong>VNC</strong></li>
             * <li><strong>ANY</strong> (all application types)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ANY</p>
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * <p>The name of the attacked application.</p>
             * 
             * <strong>example:</strong>
             * <p>MySql</p>
             */
            public Builder attackApp(String attackApp) {
                this.attackApp = attackApp;
                return this;
            }

            /**
             * <p>The attack type of the intrusion prevention event. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Abnormal connection.</li>
             * <li><strong>2</strong>: Command execution.</li>
             * <li><strong>3</strong>: Brute-force attack.</li>
             * <li><strong>4</strong>: Scanning.</li>
             * <li><strong>5</strong>: Other.</li>
             * <li><strong>6</strong>: Information leakage.</li>
             * <li><strong>7</strong>: DoS attack.</li>
             * <li><strong>8</strong>: Overflow attack.</li>
             * <li><strong>9</strong>: Web attack.</li>
             * <li><strong>10</strong>: Trojan backdoor.</li>
             * <li><strong>11</strong>: Viruses and worms.</li>
             * <li><strong>12</strong>: Mining behavior.</li>
             * <li><strong>13</strong>: Reverse shell.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder attackType(Long attackType) {
                this.attackType = attackType;
                return this;
            }

            /**
             * <p>The traffic direction of the intrusion prevention event. Valid values:</p>
             * <ul>
             * <li><strong>in</strong>: Inbound.</li>
             * <li><strong>out</strong>: Outbound.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>in</p>
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * <p>The destination IP address that is queried. This indicates that the intrusion prevention event involves this destination IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>2.2.2.2</p>
             */
            public Builder dstIP(String dstIP) {
                this.dstIP = dstIP;
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
             * <p>The hit content.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder hitContent(String hitContent) {
                this.hitContent = hitContent;
                return this;
            }

            /**
             * <p>The hit type.</p>
             * 
             * <strong>example:</strong>
             * <p>domain</p>
             */
            public Builder hitType(String hitType) {
                this.hitType = hitType;
                return this;
            }

            /**
             * <p>The protocol type.</p>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * <p>The UID of the Cloud Firewall member account.</p>
             * 
             * <strong>example:</strong>
             * <p>14151892****7022</p>
             */
            public Builder memberUid(Long memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * <p>The ID of the protection rule for the intrusion prevention event.</p>
             * 
             * <strong>example:</strong>
             * <p>00000000-0000-0000-0000-000000000000</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The defense status. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Alert.</li>
             * <li><strong>2</strong>: Block.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ruleResult(Integer ruleResult) {
                this.ruleResult = ruleResult;
                return this;
            }

            /**
             * <p>The source of the detection rule for the intrusion prevention event. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Basic protection.</li>
             * <li><strong>2</strong>: Virtual patches.</li>
             * <li><strong>4</strong>: Threat intelligence.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ruleSource(Long ruleSource) {
                this.ruleSource = ruleSource;
                return this;
            }

            /**
             * <p>The SNI used when the TLS connection is established.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder sni(String sni) {
                this.sni = sni;
                return this;
            }

            /**
             * <p>The source IP address that is queried. This indicates that the intrusion prevention event involves this source IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.XX.XX</p>
             */
            public Builder srcIP(String srcIP) {
                this.srcIP = srcIP;
                return this;
            }

            /**
             * <p>The source port.</p>
             * 
             * <strong>example:</strong>
             * <p>20206</p>
             */
            public Builder srcPort(Integer srcPort) {
                this.srcPort = srcPort;
                return this;
            }

            /**
             * <p>The cipher suite used for TLS handshake negotiation, such as TLS_AES_128_GCM_SHA256.</p>
             * 
             * <strong>example:</strong>
             * <p>TLS_AES_128_GCM_SHA256</p>
             */
            public Builder sslCipher(String sslCipher) {
                this.sslCipher = sslCipher;
                return this;
            }

            /**
             * <p>The phase in which the TLS handshake fails, such as Certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>Certificate</p>
             */
            public Builder sslErrorIndex(String sslErrorIndex) {
                this.sslErrorIndex = sslErrorIndex;
                return this;
            }

            /**
             * <p>The reason why the TLS handshake fails, such as BAD_PACKET_LENGTH.</p>
             * 
             * <strong>example:</strong>
             * <p>BAD_PACKET_LENGTH</p>
             */
            public Builder sslErrorMsg(String sslErrorMsg) {
                this.sslErrorMsg = sslErrorMsg;
                return this;
            }

            /**
             * <p>The TLS handshake result. For example, success indicates that the handshake is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder sslHandshakeRes(String sslHandshakeRes) {
                this.sslHandshakeRes = sslHandshakeRes;
                return this;
            }

            /**
             * <p>The TLS version, such as TLSv1.3.</p>
             * 
             * <strong>example:</strong>
             * <p>TLSv1.3</p>
             */
            public Builder sslProtocol(String sslProtocol) {
                this.sslProtocol = sslProtocol;
                return this;
            }

            /**
             * <p>The start time of the data. The value is a timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1751423362</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The document path.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.com/task3%DF%5C%5C">http://example.com/task3%DF\\</a>&quot;</p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>The severity level of the intrusion prevention event. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Low.</li>
             * <li><strong>2</strong>: Medium.</li>
             * <li><strong>3</strong>: High.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder vulLevel(Long vulLevel) {
                this.vulLevel = vulLevel;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
