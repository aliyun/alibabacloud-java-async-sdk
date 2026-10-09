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
         * <p>The application type supported by the access control policy.</p>
         * <ul>
         * <li><p><strong>FTP</strong></p>
         * </li>
         * <li><p><strong>HTTP</strong></p>
         * </li>
         * <li><p><strong>HTTPS</strong></p>
         * </li>
         * <li><p><strong>Memcache</strong></p>
         * </li>
         * <li><p><strong>MongoDB</strong></p>
         * </li>
         * <li><p><strong>MQTT</strong></p>
         * </li>
         * <li><p><strong>MySQL</strong></p>
         * </li>
         * <li><p><strong>RDP</strong></p>
         * </li>
         * <li><p><strong>Redis</strong></p>
         * </li>
         * <li><p><strong>SMTP</strong></p>
         * </li>
         * <li><p><strong>SMTPS</strong></p>
         * </li>
         * <li><p><strong>SSH</strong></p>
         * </li>
         * <li><p><strong>SSL_No_Cert</strong></p>
         * </li>
         * <li><p><strong>SSL</strong></p>
         * </li>
         * <li><p><strong>VNC</strong></p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The supported application types depend on the protocol type specified in the Proto parameter. If Proto is set to TCP, all application types listed above are supported. If both ApplicationName and ApplicationNameList are specified, the value of ApplicationNameList takes precedence.</p>
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
         * <p>The ID of the service category. Valid values:</p>
         * <ul>
         * <li><p><strong>All</strong>: all categories</p>
         * </li>
         * <li><p><strong>RiskDomain</strong>: risk domains</p>
         * </li>
         * <li><p><strong>RiskIP</strong>: risk IPs</p>
         * </li>
         * <li><p><strong>AliYun</strong>: Alibaba Cloud services</p>
         * </li>
         * <li><p><strong>NotAliYun</strong>: services other than Alibaba Cloud services</p>
         * </li>
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
         * <p>The page number to return.</p>
         * <p>Default value: 1.</p>
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
         * <p>The destination IP address of the outbound connection.</p>
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
         * <p>The end of the time range to query. The value is a timestamp in seconds.</p>
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
         * <li><p><strong>zh</strong> (default): Chinese.</p>
         * </li>
         * <li><p><strong>en</strong>: English.</p>
         * </li>
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
         * <li><p><strong>asc</strong>: ascending order.</p>
         * </li>
         * <li><p><strong>desc</strong> (default): descending order.</p>
         * </li>
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
         * <p>The number of entries to return on each page.</p>
         * <p>Default value: 6. Maximum value: 10.</p>
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
         * <li><p><strong>SessionCount</strong> (default): request count.</p>
         * </li>
         * <li><p><strong>TotalBytes</strong>: total traffic.</p>
         * </li>
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
         * <p>The start of the time range to query. The value is a timestamp in seconds.</p>
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
         * <p>The ID of the threat intelligence tag. Valid values:</p>
         * <ul>
         * <li><p><strong>AliYun</strong>: Alibaba Cloud service</p>
         * </li>
         * <li><p><strong>RiskDomain</strong>: risk domain</p>
         * </li>
         * <li><p><strong>RiskIP</strong>: risk IP</p>
         * </li>
         * <li><p><strong>TrustedDomain</strong>: trusted website</p>
         * </li>
         * <li><p><strong>AliPay</strong>: Alipay</p>
         * </li>
         * <li><p><strong>DingDing</strong>: DingTalk</p>
         * </li>
         * <li><p><strong>WeChat</strong>: WeChat</p>
         * </li>
         * <li><p><strong>QQ</strong>: Tencent QQ</p>
         * </li>
         * <li><p><strong>SecurityService</strong>: security service</p>
         * </li>
         * <li><p><strong>Microsoft</strong>: Microsoft</p>
         * </li>
         * <li><p><strong>Amazon</strong>: Amazon</p>
         * </li>
         * <li><p><strong>Pan</strong>: cloud drive</p>
         * </li>
         * <li><p><strong>Map</strong>: map</p>
         * </li>
         * <li><p><strong>Code</strong>: code hosting</p>
         * </li>
         * <li><p><strong>SystemService</strong>: system service</p>
         * </li>
         * <li><p><strong>Taobao</strong>: Taobao</p>
         * </li>
         * <li><p><strong>Google</strong>: Google</p>
         * </li>
         * <li><p><strong>ThirdPartyService</strong>: third-party service</p>
         * </li>
         * <li><p><strong>FirstFlow</strong>: first access</p>
         * </li>
         * <li><p><strong>Downloader</strong>: malicious downloader</p>
         * </li>
         * <li><p><strong>Alexa Top1M</strong>: popular website</p>
         * </li>
         * <li><p><strong>Miner</strong>: mining pool</p>
         * </li>
         * <li><p><strong>Intelligence</strong>: threat intelligence</p>
         * </li>
         * <li><p><strong>DDoS</strong>: DDoS trojan</p>
         * </li>
         * <li><p><strong>Ransomware</strong>: ransomware</p>
         * </li>
         * <li><p><strong>Spyware</strong>: spyware</p>
         * </li>
         * <li><p><strong>Rogue</strong>: rogue software</p>
         * </li>
         * <li><p><strong>Botnet</strong>: botnet</p>
         * </li>
         * <li><p><strong>Suspicious</strong>: suspicious website</p>
         * </li>
         * <li><p><strong>C\&amp;C</strong>: command and control (C\&amp;C)</p>
         * </li>
         * <li><p><strong>Gang</strong>: threat actor group</p>
         * </li>
         * <li><p><strong>CVE</strong>: CVE</p>
         * </li>
         * <li><p><strong>Backdoor</strong>: backdoor</p>
         * </li>
         * <li><p><strong>Phishing</strong>: phishing website</p>
         * </li>
         * <li><p><strong>APT</strong>: APT attack</p>
         * </li>
         * <li><p><strong>Supply Chain Attack</strong>: supply chain attack</p>
         * </li>
         * <li><p><strong>Malicious software</strong>: malware</p>
         * </li>
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
