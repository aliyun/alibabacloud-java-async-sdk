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
 * {@link DescribeOutgoingDestinationRequest} extends {@link RequestModel}
 *
 * <p>DescribeOutgoingDestinationRequest</p>
 */
public class DescribeOutgoingDestinationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclCoverage")
    private String aclCoverage;

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
    @com.aliyun.core.annotation.NameInMap("Port")
    private String port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateIP")
    private String privateIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicIP")
    private String publicIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecuritySuggest")
    private String securitySuggest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    @Deprecated
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagId")
    private String tagId;

    private DescribeOutgoingDestinationRequest(Builder builder) {
        super(builder);
        this.aclCoverage = builder.aclCoverage;
        this.applicationName = builder.applicationName;
        this.categoryId = builder.categoryId;
        this.currentPage = builder.currentPage;
        this.dstIP = builder.dstIP;
        this.endTime = builder.endTime;
        this.isAITraffic = builder.isAITraffic;
        this.lang = builder.lang;
        this.order = builder.order;
        this.pageSize = builder.pageSize;
        this.port = builder.port;
        this.privateIP = builder.privateIP;
        this.publicIP = builder.publicIP;
        this.securitySuggest = builder.securitySuggest;
        this.sort = builder.sort;
        this.sourceIp = builder.sourceIp;
        this.startTime = builder.startTime;
        this.tagId = builder.tagId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOutgoingDestinationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclCoverage
     */
    public String getAclCoverage() {
        return this.aclCoverage;
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
     * @return securitySuggest
     */
    public String getSecuritySuggest() {
        return this.securitySuggest;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return tagId
     */
    public String getTagId() {
        return this.tagId;
    }

    public static final class Builder extends Request.Builder<DescribeOutgoingDestinationRequest, Builder> {
        private String aclCoverage; 
        private String applicationName; 
        private String categoryId; 
        private String currentPage; 
        private String dstIP; 
        private String endTime; 
        private String isAITraffic; 
        private String lang; 
        private String order; 
        private String pageSize; 
        private String port; 
        private String privateIP; 
        private String publicIP; 
        private String securitySuggest; 
        private String sort; 
        private String sourceIp; 
        private String startTime; 
        private String tagId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOutgoingDestinationRequest request) {
            super(request);
            this.aclCoverage = request.aclCoverage;
            this.applicationName = request.applicationName;
            this.categoryId = request.categoryId;
            this.currentPage = request.currentPage;
            this.dstIP = request.dstIP;
            this.endTime = request.endTime;
            this.isAITraffic = request.isAITraffic;
            this.lang = request.lang;
            this.order = request.order;
            this.pageSize = request.pageSize;
            this.port = request.port;
            this.privateIP = request.privateIP;
            this.publicIP = request.publicIP;
            this.securitySuggest = request.securitySuggest;
            this.sort = request.sort;
            this.sourceIp = request.sourceIp;
            this.startTime = request.startTime;
            this.tagId = request.tagId;
        } 

        /**
         * <p>The policy coverage status.</p>
         * 
         * <strong>example:</strong>
         * <p>FullCoverage</p>
         */
        public Builder aclCoverage(String aclCoverage) {
            this.putQueryParameter("AclCoverage", aclCoverage);
            this.aclCoverage = aclCoverage;
            return this;
        }

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * <p>The category ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AliYun</p>
         */
        public Builder categoryId(String categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * <p>The page number.</p>
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
         * <p>The legacy destination IP parameter.</p>
         * <blockquote>
         * <p>The POP gateway passes this parameter through, but the backend of this operation does not read it. Specifying this parameter has no filtering effect. To filter by IP address, use PublicIP or PrivateIP. If only DstIP is specified, the operation returns MissingParameter.IpFilter (-340415) because no valid IP filtering parameter is provided.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>47.100.111XXX</p>
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
         * <p>1749089441</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Specifies whether to collect statistics only on traffic that accesses AI services. Default value: false.</p>
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
         * <p>The language type of the received message.</p>
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
         * <p>The sort order.</p>
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
         * <p>The number of entries per page.</p>
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
         * <p>3306</p>
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The private IP address.</p>
         * <blockquote>
         * <p>At least one of PublicIP and PrivateIP must be specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10.111.53XXX</p>
         */
        public Builder privateIP(String privateIP) {
            this.putQueryParameter("PrivateIP", privateIP);
            this.privateIP = privateIP;
            return this;
        }

        /**
         * <p>The public IP address.</p>
         * <blockquote>
         * <p>At least one of PublicIP and PrivateIP must be specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>47.96.74.XXX</p>
         */
        public Builder publicIP(String publicIP) {
            this.putQueryParameter("PublicIP", publicIP);
            this.publicIP = publicIP;
            return this;
        }

        /**
         * <p>The security policy for the Outbound Domain.</p>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        public Builder securitySuggest(String securitySuggest) {
            this.putQueryParameter("SecuritySuggest", securitySuggest);
            this.securitySuggest = securitySuggest;
            return this;
        }

        /**
         * <p>The field by which to sort the results.</p>
         * 
         * <strong>example:</strong>
         * <p>InBytes</p>
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * <p>The IP address of the access source. <strong>[Deprecated]</strong></p>
         * 
         * <strong>example:</strong>
         * <p>106.3.198.XXX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The start time of the query. The value is a UNIX timestamp in seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1749657600</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The tag ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FirstFlow</p>
         */
        public Builder tagId(String tagId) {
            this.putQueryParameter("TagId", tagId);
            this.tagId = tagId;
            return this;
        }

        @Override
        public DescribeOutgoingDestinationRequest build() {
            return new DescribeOutgoingDestinationRequest(this);
        } 

    } 

}
