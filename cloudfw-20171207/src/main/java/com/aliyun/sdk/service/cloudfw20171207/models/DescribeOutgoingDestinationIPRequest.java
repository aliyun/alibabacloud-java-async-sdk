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
         * <p>The application type in the access control policy. Valid values:</p>
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
         * <p> The value of this parameter depends on the value of Proto. If you set Proto to TCP, you can set ApplicationNameList to any valid value. If you specify both ApplicationNameList and ApplicationName, only the value of ApplicationNameList is used.</p>
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
         * <p>The ID of the service to which the destination IP address belongs. This parameter is left empty by default. Valid values:</p>
         * <ul>
         * <li><strong>All</strong>: all services</li>
         * <li><strong>RiskDomain</strong>: risky domain names</li>
         * <li><strong>RiskIP</strong>: risky IP addresses</li>
         * <li><strong>AliYun</strong>: Alibaba Cloud services</li>
         * <li><strong>NotAliYun</strong>: third-party services</li>
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
         * <p>The number of the page to return.</p>
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
         * <p>The destination IP address in the outbound connection that is initiated to access a domain name.</p>
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
         * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
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
         * <p>The language of the content within the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default)</li>
         * <li><strong>en</strong></li>
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
         * <p>The method that you want to use to sort the query results. Valid values:</p>
         * <ul>
         * <li><strong>asc</strong></li>
         * <li><strong>desc</strong> (default)</li>
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
         * <p>The public IP address of the Elastic Compute Service (ECS) instance that initiates the outbound connection.</p>
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
         * <p>The field based on which you want to sort the query results. Valid values:</p>
         * <ul>
         * <li><strong>SessionCount</strong> (default): the number of requests.</li>
         * <li><strong>TotalBytes</strong>: the total volume of traffic.</li>
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
         * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
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
         * <p>The ID of the tag. Valid values:</p>
         * <ul>
         * <li><strong>AliYun</strong>: Alibaba Cloud service</li>
         * <li><strong>RiskDomain</strong>: risky domain name</li>
         * <li><strong>RiskIP</strong>: risky IP address</li>
         * <li><strong>TrustedDomain</strong>: trusted website</li>
         * <li><strong>AliPay</strong>: Alipay</li>
         * <li><strong>DingDing</strong>: DingTalk</li>
         * <li><strong>WeChat</strong>: WeChat</li>
         * <li><strong>QQ</strong>: Tencent QQ</li>
         * <li><strong>SecurityService</strong>: security service</li>
         * <li><strong>Microsoft</strong>: Microsoft</li>
         * <li><strong>Amazon</strong>: Amazon Web Services (AWS)</li>
         * <li><strong>Pan</strong>: cloud disk</li>
         * <li><strong>Map</strong>: map</li>
         * <li><strong>Code</strong>: code hosting</li>
         * <li><strong>SystemService</strong>: system service</li>
         * <li><strong>Taobao</strong>: Taobao</li>
         * <li><strong>Google</strong>: Google</li>
         * <li><strong>ThirdPartyService</strong>: third-party service</li>
         * <li><strong>FirstFlow</strong>: the first time</li>
         * <li><strong>Downloader</strong>: malicious download</li>
         * <li><strong>Alexa Top1M</strong>: popular website</li>
         * <li><strong>Miner</strong>: mining pool</li>
         * <li><strong>Intelligence</strong>: threat intelligence</li>
         * <li><strong>DDoS</strong>: DDoS trojan</li>
         * <li><strong>Ransomware</strong>: ransomware</li>
         * <li><strong>Spyware</strong>: spyware</li>
         * <li><strong>Rogue</strong>: rogue software</li>
         * <li><strong>Botnet</strong>: botnet</li>
         * <li><strong>Suspicious</strong>: suspicious website</li>
         * <li><strong>C&amp;C</strong>: command and control (C&amp;C)</li>
         * <li><strong>Gang</strong>: gang</li>
         * <li><strong>CVE</strong>: Common Vulnerabilities and Exposures (CVE)</li>
         * <li><strong>Backdoor</strong>: webshell</li>
         * <li><strong>Phishing</strong>: phishing website</li>
         * <li><strong>APT</strong>: advanced persistent threat (APT) attack</li>
         * <li><strong>Supply Chain Attack</strong>: supply chain attack</li>
         * <li><strong>Malicious software</strong>: malware</li>
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
