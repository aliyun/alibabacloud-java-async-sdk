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
 * {@link DescribeOutgoingDestinationIPRequest} extends {@link RequestModel}
 *
 * <p>DescribeOutgoingDestinationIPRequest</p>
 */
public class DescribeOutgoingDestinationIPRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationName")
    private String applicationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    private String categoryId;

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
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private String port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateIP")
    private String privateIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicIP")
    private String publicIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagIdNew")
    private String tagIdNew;

    private DescribeOutgoingDestinationIPRequest(Builder builder) {
        super(builder);
        this.applicationName = builder.applicationName;
        this.categoryId = builder.categoryId;
        this.currentPage = builder.currentPage;
        this.dstIP = builder.dstIP;
        this.endTime = builder.endTime;
        this.lang = builder.lang;
        this.order = builder.order;
        this.pageSize = builder.pageSize;
        this.port = builder.port;
        this.privateIP = builder.privateIP;
        this.publicIP = builder.publicIP;
        this.sort = builder.sort;
        this.startTime = builder.startTime;
        this.tagIdNew = builder.tagIdNew;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOutgoingDestinationIPRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return categoryId
     */
    public String getCategoryId() {
        return this.categoryId;
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return privateIP
     */
    public String getPrivateIP() {
        return this.privateIP;
    }

    /**
     * @return publicIP
     */
    public String getPublicIP() {
        return this.publicIP;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return tagIdNew
     */
    public String getTagIdNew() {
        return this.tagIdNew;
    }

    public static final class Builder extends Request.Builder<DescribeOutgoingDestinationIPRequest, Builder> {
        private String applicationName; 
        private String categoryId; 
        private String currentPage; 
        private String dstIP; 
        private String endTime; 
        private String lang; 
        private String order; 
        private String pageSize; 
        private String port; 
        private String privateIP; 
        private String publicIP; 
        private String sort; 
        private String startTime; 
        private String tagIdNew; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOutgoingDestinationIPRequest request) {
            super(request);
            this.applicationName = request.applicationName;
            this.categoryId = request.categoryId;
            this.currentPage = request.currentPage;
            this.dstIP = request.dstIP;
            this.endTime = request.endTime;
            this.lang = request.lang;
            this.order = request.order;
            this.pageSize = request.pageSize;
            this.port = request.port;
            this.privateIP = request.privateIP;
            this.publicIP = request.publicIP;
            this.sort = request.sort;
            this.startTime = request.startTime;
            this.tagIdNew = request.tagIdNew;
        } 

        /**
         * <p>The Protocol Type supported by the access control policy. Valid values:</p>
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
         * <li><strong>SSL_No_Cert</strong></li>
         * <li><strong>SSL</strong></li>
         * <li><strong>VNC</strong></li>
         * </ul>
         * <blockquote>
         * <p>The valid values of this parameter depend on the value of the Proto parameter. If Proto is set to TCP, ApplicationNameList supports all the preceding Protocol Types. If both ApplicationNameList and ApplicationName are specified, ApplicationNameList takes precedence.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>FTP</p>
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * <p>The category ID. Default value: null. Valid values:</p>
         * <ul>
         * <li><strong>All</strong>: All categories.</li>
         * <li><strong>RiskDomain</strong>: Risky domain names.</li>
         * <li><strong>RiskIP</strong>: Risky IP addresses.</li>
         * <li><strong>AliYun</strong>: Alibaba Cloud services.</li>
         * <li><strong>NotAliYun</strong>: Non-Alibaba Cloud services.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>All</p>
         */
        public Builder categoryId(String categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * <p>Sets the paging settings to specify the page number to return for a paged query.</p>
         * <p>Default value: 1, which means the first page is returned.</p>
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
         * <p>The destination IP address of the domain name for outbound connections.</p>
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
         * <p>The end time of the query. The value is a UNIX timestamp accurate to seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1656923760</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
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
         * <p>The sort order. Valid values:</p>
         * <ul>
         * <li><strong>asc</strong>: Ascending order.</li>
         * <li><strong>desc</strong> (default): Descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>Sets the paging settings to specify the number of entries to return on each page for a paged query.</p>
         * <p>Default value: 6, which means 6 entries are returned on each page. Maximum value: 10.</p>
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
         * <p>The port number.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The private IP address of the ECS instance that initiates the outbound connection.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder privateIP(String privateIP) {
            this.putQueryParameter("PrivateIP", privateIP);
            this.privateIP = privateIP;
            return this;
        }

        /**
         * <p>The public IP address of the ECS instance that initiates the outbound connection.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        public Builder publicIP(String publicIP) {
            this.putQueryParameter("PublicIP", publicIP);
            this.publicIP = publicIP;
            return this;
        }

        /**
         * <p>The field by which to sort the results. Valid values:</p>
         * <ul>
         * <li><strong>SessionCount</strong> (default): The number of requests.</li>
         * <li><strong>TotalBytes</strong>: The total volume of traffic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SessionCount</p>
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * <p>The start time of the query. The value is a UNIX timestamp accurate to seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1656837360</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The intelligence tag ID. Valid values:</p>
         * <ul>
         * <li><strong>AliYun</strong>: Alibaba Cloud services.</li>
         * <li><strong>RiskDomain</strong>: Risky domain names.</li>
         * <li><strong>RiskIP</strong>: Risky IP addresses.</li>
         * <li><strong>TrustedDomain</strong>: Trusted websites.</li>
         * <li><strong>AliPay</strong>: Alipay.</li>
         * <li><strong>DingDing</strong>: DingTalk.</li>
         * <li><strong>WeChat</strong>: WeChat.</li>
         * <li><strong>QQ</strong>: Tencent QQ.</li>
         * <li><strong>SecurityService</strong>: Security services.</li>
         * <li><strong>Microsoft</strong>: Microsoft.</li>
         * <li><strong>Amazon</strong>: Amazon.</li>
         * <li><strong>Pan</strong>: Cloud disks.</li>
         * <li><strong>Map</strong>: Maps.</li>
         * <li><strong>Code</strong>: Code hosting.</li>
         * <li><strong>SystemService</strong>: System services.</li>
         * <li><strong>Taobao</strong>: Taobao.</li>
         * <li><strong>Google</strong>: Google.</li>
         * <li><strong>ThirdPartyService</strong>: Third-party platform services.</li>
         * <li><strong>FirstFlow</strong>: First visit.</li>
         * <li><strong>Downloader</strong>: Malicious download.</li>
         * <li><strong>Alexa Top1M</strong>: Popular website.</li>
         * <li><strong>Miner</strong>: Miner Pool.</li>
         * <li><strong>Intelligence</strong>: Threat intelligence.</li>
         * <li><strong>DDoS</strong>: DDoS Trojan.</li>
         * <li><strong>Ransomware</strong>: Ransomware.</li>
         * <li><strong>Spyware</strong>: Spyware.</li>
         * <li><strong>Rogue</strong>: Rogue software.</li>
         * <li><strong>Botnet</strong>: Botnets.</li>
         * <li><strong>Suspicious</strong>: Suspicious websites.</li>
         * <li><strong>C&amp;C</strong>: Remote control.</li>
         * <li><strong>Gang</strong>: Gangs.</li>
         * <li><strong>CVE</strong>: CVE vulnerabilities.</li>
         * <li><strong>Backdoor</strong>: Backdoor Trojans.</li>
         * <li><strong>Phishing</strong>: Phishing websites.</li>
         * <li><strong>APT</strong>: APT attacks.</li>
         * <li><strong>Supply Chain Attack</strong>: Supply chain attacks.</li>
         * <li><strong>Malicious software</strong>: Malware.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AliYun</p>
         */
        public Builder tagIdNew(String tagIdNew) {
            this.putQueryParameter("TagIdNew", tagIdNew);
            this.tagIdNew = tagIdNew;
            return this;
        }

        @Override
        public DescribeOutgoingDestinationIPRequest build() {
            return new DescribeOutgoingDestinationIPRequest(this);
        } 

    } 

}
