// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOutgoingDomainRequest} extends {@link RequestModel}
 *
 * <p>DescribeOutgoingDomainRequest</p>
 */
public class DescribeOutgoingDomainRequest extends Request {
    @Query
    @NameInMap("CategoryId")
    private String categoryId;

    @Query
    @NameInMap("CurrentPage")
    private String currentPage;

    @Query
    @NameInMap("Domain")
    private String domain;

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

    private DescribeOutgoingDomainRequest(Builder builder) {
        super(builder);
        this.categoryId = builder.categoryId;
        this.currentPage = builder.currentPage;
        this.domain = builder.domain;
        this.endTime = builder.endTime;
        this.lang = builder.lang;
        this.order = builder.order;
        this.pageSize = builder.pageSize;
        this.publicIP = builder.publicIP;
        this.sort = builder.sort;
        this.startTime = builder.startTime;
        this.tagIdNew = builder.tagIdNew;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOutgoingDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return domain
     */
    public String getDomain() {
        return this.domain;
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

    public static final class Builder extends Request.Builder<DescribeOutgoingDomainRequest, Builder> {
        private String categoryId; 
        private String currentPage; 
        private String domain; 
        private String endTime; 
        private String lang; 
        private String order; 
        private String pageSize; 
        private String publicIP; 
        private String sort; 
        private String startTime; 
        private String tagIdNew; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOutgoingDomainRequest request) {
            super(request);
            this.categoryId = request.categoryId;
            this.currentPage = request.currentPage;
            this.domain = request.domain;
            this.endTime = request.endTime;
            this.lang = request.lang;
            this.order = request.order;
            this.pageSize = request.pageSize;
            this.publicIP = request.publicIP;
            this.sort = request.sort;
            this.startTime = request.startTime;
            this.tagIdNew = request.tagIdNew;
        } 

        /**
         * The type of the service. This parameter is empty by default. Valid values:
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
         * The domain name in outbound connections.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
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
         * The language of the content within the request. Valid values:
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
         * The order in which you want to sort the query results. Valid values:
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
         * Default value: 6. Maximum value: 100.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The public IP address of the Elastic Compute Service (ECS) instance that initiates outbound connections.
         */
        public Builder publicIP(String publicIP) {
            this.putQueryParameter("PublicIP", publicIP);
            this.publicIP = publicIP;
            return this;
        }

        /**
         * The field based on which you want to sort the query results. Valid values:
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
         * *   **FirstFlow**: the first time when an outbound connection is initiated
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
        public DescribeOutgoingDomainRequest build() {
            return new DescribeOutgoingDomainRequest(this);
        } 

    } 

}
