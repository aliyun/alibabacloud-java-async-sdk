// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOutgoingDestinationIPRequest} extends {@link RequestModel}
 *
 * <p>DescribeOutgoingDestinationIPRequest</p>
 */
public class DescribeOutgoingDestinationIPRequest extends Request {
    @Query
    @NameInMap("ApplicationName")
    private String applicationName;

    @Query
    @NameInMap("CategoryId")
    private String categoryId;

    @Query
    @NameInMap("CurrentPage")
    private String currentPage;

    @Query
    @NameInMap("DstIP")
    private String dstIP;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Order")
    private String order;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("Port")
    private String port;

    @Query
    @NameInMap("PrivateIP")
    private String privateIP;

    @Query
    @NameInMap("PublicIP")
    private String publicIP;

    @Query
    @NameInMap("Sort")
    private String sort;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Query
    @NameInMap("TagIdNew")
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
         * The application type in the access control policy. Valid values:
         * <p>
         * 
         * *   **FTP**
         * *   **HTTP**
         * *   **HTTPS**
         * *   **Memcache**
         * *   **MongoDB**
         * *   **MQTT**
         * *   **MySQL**
         * *   **RDP**
         * *   **Redis**
         * *   **SMTP**
         * *   **SMTPS**
         * *   **SSH**
         * *   **SSL_No_Cert**
         * *   **SSL**
         * *   **VNC**
         * 
         * >  The value of this parameter depends on the value of Proto. If you set Proto to TCP, you can set ApplicationNameList to any valid value. If you specify both ApplicationNameList and ApplicationName, only the value of ApplicationNameList is used.
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * The ID of the service to which the destination IP address belongs. This parameter is left empty by default. Valid values:
         * <p>
         * 
         * *   **All**: all services
         * *   **RiskDomain**: risky domain names
         * *   **RiskIP**: risky IP addresses
         * *   **AliYun**: Alibaba Cloud services
         * *   **NotAliYun**: third-party services
         */
        public Builder categoryId(String categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * The number of the page to return.
         * <p>
         * 
         * Default value: 1.
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The destination IP address in the outbound connection that is initiated to access a domain name.
         */
        public Builder dstIP(String dstIP) {
            this.putQueryParameter("DstIP", dstIP);
            this.dstIP = dstIP;
            return this;
        }

        /**
         * The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The language of the content within the response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese (default)
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The order in which you want to sort the queried information. Valid values:
         * <p>
         * 
         * *   **asc**: the ascending order.
         * *   **desc**: the descending order. This is the default value.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Default value: 6. Maximum value: 10.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The port number.
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * The private IP address of the ECS instance that initiates the outbound connection.
         */
        public Builder privateIP(String privateIP) {
            this.putQueryParameter("PrivateIP", privateIP);
            this.privateIP = privateIP;
            return this;
        }

        /**
         * The public IP address of the Elastic Compute Service (ECS) instance that initiates the outbound connection.
         */
        public Builder publicIP(String publicIP) {
            this.putQueryParameter("PublicIP", publicIP);
            this.publicIP = publicIP;
            return this;
        }

        /**
         * The field based on which you want to sort the queried information. Valid values:
         * <p>
         * 
         * *   **SessionCount**: the number of requests. This is the default value.
         * *   **TotalBytes**: the total volume of traffic.
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The ID of the tag. Valid values:
         * <p>
         * 
         * *   **AliYun**: Alibaba Cloud service
         * *   **RiskDomain**: risky domain name
         * *   **RiskIP**: risky IP address
         * *   **TrustedDomain**: trusted website
         * *   **AliPay**: Alipay
         * *   **DingDing**: DingTalk
         * *   **WeChat**: WeChat
         * *   **QQ**: Tencent QQ
         * *   **SecurityService**: security service
         * *   **Microsoft**: Microsoft
         * *   **Amazon**: Amazon Web Services (AWS)
         * *   **Pan**: cloud disk
         * *   **Map**: map
         * *   **Code**: code hosting
         * *   **SystemService**: system service
         * *   **Taobao**: Taobao
         * *   **Google**: Google
         * *   **ThirdPartyService**: third-party service
         * *   **FirstFlow**: the first time
         * *   **Downloader**: malicious download
         * *   **Alexa Top1M**: popular website
         * *   **Miner**: mining pool
         * *   **Intelligence**: threat intelligence
         * *   **DDoS**: DDoS trojan
         * *   **Ransomware**: ransomware
         * *   **Spyware**: spyware
         * *   **Rogue**: rogue software
         * *   **Botnet**: botnet
         * *   **Suspicious**: suspicious website
         * *   **C\&C**: command and control (C\&C)
         * *   **Gang**: gang
         * *   **CVE**: Common Vulnerabilities and Exposures (CVE)
         * *   **Backdoor**: webshell
         * *   **Phishing**: phishing website
         * *   **APT**: advanced persistent threat (APT) attack
         * *   **Supply Chain Attack**: supply chain attack
         * *   **Malicious software**: malware
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
