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
 * {@link DescribeOutgoingDomainRequest} extends {@link RequestModel}
 *
 * <p>DescribeOutgoingDomainRequest</p>
 */
public class DescribeOutgoingDomainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    private String categoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataType")
    private String dataType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsAITraffic")
    private String isAITraffic;

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

    private DescribeOutgoingDomainRequest(Builder builder) {
        super(builder);
        this.categoryId = builder.categoryId;
        this.currentPage = builder.currentPage;
        this.dataType = builder.dataType;
        this.domain = builder.domain;
        this.endTime = builder.endTime;
        this.isAITraffic = builder.isAITraffic;
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
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
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
     * @return isAITraffic
     */
    public String getIsAITraffic() {
        return this.isAITraffic;
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
        private String dataType; 
        private String domain; 
        private String endTime; 
        private String isAITraffic; 
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
            this.dataType = request.dataType;
            this.domain = request.domain;
            this.endTime = request.endTime;
            this.isAITraffic = request.isAITraffic;
            this.lang = request.lang;
            this.order = request.order;
            this.pageSize = request.pageSize;
            this.publicIP = request.publicIP;
            this.sort = request.sort;
            this.startTime = request.startTime;
            this.tagIdNew = request.tagIdNew;
        } 

        /**
         * <p>The product category. Default value: empty. Valid values:</p>
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
         * <p>Settings for the page number to return for a paging query. Default value: 1.</p>
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
         * <p>The source of the traffic statistics. Default value: internet. Valid values:</p>
         * <ul>
         * <li><strong>internet</strong>: Internet firewall.</li>
         * <li><strong>nat</strong>: NAT firewall.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>nat</p>
         */
        public Builder dataType(String dataType) {
            this.putQueryParameter("DataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * <p>The domain name for outbound connections.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>Specifies the end time of the query. The value is a UNIX timestamp in seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1656750960</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Specifies whether to collect statistics only on traffic that accesses AI services. Default value: false. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isAITraffic(String isAITraffic) {
            this.putQueryParameter("IsAITraffic", isAITraffic);
            this.isAITraffic = isAITraffic;
            return this;
        }

        /**
         * <p>The language of the request message. Valid values:</p>
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
         * <p>Specifies the sort order. Valid values:</p>
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
         * <p>Settings for the number of entries to return on each page for a paging query. Default value: 6. Maximum value: 100. If the specified value exceeds 100, the value 100 is used.</p>
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
         * <p>Specifies the field by which to sort the query results. Valid values:</p>
         * <ul>
         * <li><strong>SessionCount</strong> (default): Number of requests.</li>
         * <li><strong>TotalBytes</strong>: Total traffic volume.</li>
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
         * <p>Specifies the start time of the query. The value is a UNIX timestamp in seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1656664560</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The ID of the intelligence label. Valid values:</p>
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
         * <li><strong>Pan</strong>: Cloud storage.</li>
         * <li><strong>Map</strong>: Maps.</li>
         * <li><strong>Code</strong>: Code hosting.</li>
         * <li><strong>SystemService</strong>: System services.</li>
         * <li><strong>Taobao</strong>: Taobao.</li>
         * <li><strong>Google</strong>: Google.</li>
         * <li><strong>ThirdPartyService</strong>: Third-party platform services.</li>
         * <li><strong>FirstFlow</strong>: First visit.</li>
         * <li><strong>Downloader</strong>: Malicious downloads.</li>
         * <li><strong>Alexa Top1M</strong>: Popular websites.</li>
         * <li><strong>Miner</strong>: Miner pools.</li>
         * <li><strong>Intelligence</strong>: Threat intelligence.</li>
         * <li><strong>DDoS</strong>: DDoS trojans.</li>
         * <li><strong>Ransomware</strong>: Ransomware.</li>
         * <li><strong>Spyware</strong>: Spyware.</li>
         * <li><strong>Rogue</strong>: Rogue software.</li>
         * <li><strong>Botnet</strong>: Botnets.</li>
         * <li><strong>Suspicious</strong>: Suspicious websites.</li>
         * <li><strong>C&amp;C</strong>: Remote control.</li>
         * <li><strong>Gang</strong>: Gangs.</li>
         * <li><strong>CVE</strong>: CVE vulnerabilities.</li>
         * <li><strong>Backdoor</strong>: Backdoor trojans.</li>
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
        public DescribeOutgoingDomainRequest build() {
            return new DescribeOutgoingDomainRequest(this);
        } 

    } 

}
