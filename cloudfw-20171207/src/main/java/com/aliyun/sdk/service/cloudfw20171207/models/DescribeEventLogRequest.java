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
 * {@link DescribeEventLogRequest} extends {@link RequestModel}
 *
 * <p>DescribeEventLogRequest</p>
 */
public class DescribeEventLogRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttackType")
    private Long attackType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstIP")
    private String dstIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallType")
    private String firewallType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogType")
    private String logType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleResult")
    private String ruleResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcIP")
    private String srcIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeEventLogRequest(Builder builder) {
        super(builder);
        this.attackType = builder.attackType;
        this.currentPage = builder.currentPage;
        this.dstIP = builder.dstIP;
        this.endTime = builder.endTime;
        this.firewallType = builder.firewallType;
        this.lang = builder.lang;
        this.logType = builder.logType;
        this.pageSize = builder.pageSize;
        this.ruleResult = builder.ruleResult;
        this.sourceCode = builder.sourceCode;
        this.sourceIp = builder.sourceIp;
        this.srcIP = builder.srcIP;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventLogRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attackType
     */
    public Long getAttackType() {
        return this.attackType;
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return dstIP
     */
    public String getDstIP() {
        return this.dstIP;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return firewallType
     */
    public String getFirewallType() {
        return this.firewallType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return logType
     */
    public String getLogType() {
        return this.logType;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return ruleResult
     */
    public String getRuleResult() {
        return this.ruleResult;
    }

    /**
     * @return sourceCode
     */
    public String getSourceCode() {
        return this.sourceCode;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return srcIP
     */
    public String getSrcIP() {
        return this.srcIP;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeEventLogRequest, Builder> {
        private Long attackType; 
        private String currentPage; 
        private String dstIP; 
        private String endTime; 
        private String firewallType; 
        private String lang; 
        private String logType; 
        private String pageSize; 
        private String ruleResult; 
        private String sourceCode; 
        private String sourceIp; 
        private String srcIP; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEventLogRequest request) {
            super(request);
            this.attackType = request.attackType;
            this.currentPage = request.currentPage;
            this.dstIP = request.dstIP;
            this.endTime = request.endTime;
            this.firewallType = request.firewallType;
            this.lang = request.lang;
            this.logType = request.logType;
            this.pageSize = request.pageSize;
            this.ruleResult = request.ruleResult;
            this.sourceCode = request.sourceCode;
            this.sourceIp = request.sourceIp;
            this.srcIP = request.srcIP;
            this.startTime = request.startTime;
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
         * <blockquote>
         * <p>If you do not specify this parameter, all attack types are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        public Builder attackType(Long attackType) {
            this.putQueryParameter("AttackType", attackType);
            this.attackType = attackType;
            return this;
        }

        /**
         * <p>The page number for a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The destination IP address to query. If you specify this parameter, the system queries intrusion prevention events that involve this destination IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        public Builder dstIP(String dstIP) {
            this.putQueryParameter("DstIP", dstIP);
            this.dstIP = dstIP;
            return this;
        }

        /**
         * <p>The end time of the query. The value is a UNIX timestamp in seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1731551104</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The type of the Cloud Firewall. Valid values:</p>
         * <ul>
         * <li><strong>VpcFirewall</strong>: virtual private cloud (VPC) firewalls.</li>
         * <li><strong>InternetFirewall</strong> (default): the Internet Border firewall.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[
         *   &quot;internet&quot;,
         *   &quot;vpc&quot;,
         *   &quot;nat&quot;
         * ]</p>
         */
        public Builder firewallType(String firewallType) {
            this.putQueryParameter("FirewallType", firewallType);
            this.firewallType = firewallType;
            return this;
        }

        /**
         * <p>The language of the response message.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The log type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder logType(String logType) {
            this.putQueryParameter("LogType", logType);
            this.logType = logType;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * <p>Default value: <strong>6</strong>, which indicates that 6 entries are returned on each page. Maximum value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The defense status of the Cloud Firewall. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Alert.</li>
         * <li><strong>2</strong>: Block.</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, all defense statuses are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder ruleResult(String ruleResult) {
            this.putQueryParameter("RuleResult", ruleResult);
            this.ruleResult = ruleResult;
            return this;
        }

        /**
         * <p>The tracing code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yundun</p>
         */
        public Builder sourceCode(String sourceCode) {
            this.putQueryParameter("SourceCode", sourceCode);
            this.sourceCode = sourceCode;
            return this;
        }

        /**
         * <p>The source IP address of the requester.</p>
         * 
         * <strong>example:</strong>
         * <p>60.182.79.XXX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The source IP address to query. If you specify this parameter, the system queries intrusion prevention events that involve this source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>47.92.x.x</p>
         */
        public Builder srcIP(String srcIP) {
            this.putQueryParameter("SrcIP", srcIP);
            this.srcIP = srcIP;
            return this;
        }

        /**
         * <p>The start time of the query. The value is a UNIX timestamp in seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1692504764000</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeEventLogRequest build() {
            return new DescribeEventLogRequest(this);
        } 

    } 

}
