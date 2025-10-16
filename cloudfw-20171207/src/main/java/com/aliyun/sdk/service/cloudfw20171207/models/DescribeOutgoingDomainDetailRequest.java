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
 * {@link DescribeOutgoingDomainDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeOutgoingDomainDetailRequest</p>
 */
public class DescribeOutgoingDomainDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclCoverage")
    private String aclCoverage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainList")
    private java.util.List<String> domainList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IPType")
    private String IPType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

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
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagId")
    private String tagId;

    private DescribeOutgoingDomainDetailRequest(Builder builder) {
        super(builder);
        this.aclCoverage = builder.aclCoverage;
        this.currentPage = builder.currentPage;
        this.domain = builder.domain;
        this.domainList = builder.domainList;
        this.endTime = builder.endTime;
        this.IPType = builder.IPType;
        this.lang = builder.lang;
        this.natGatewayId = builder.natGatewayId;
        this.order = builder.order;
        this.pageSize = builder.pageSize;
        this.privateIP = builder.privateIP;
        this.publicIP = builder.publicIP;
        this.sort = builder.sort;
        this.sourceIp = builder.sourceIp;
        this.startTime = builder.startTime;
        this.tagId = builder.tagId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOutgoingDomainDetailRequest create() {
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
     * @return domainList
     */
    public java.util.List<String> getDomainList() {
        return this.domainList;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return IPType
     */
    public String getIPType() {
        return this.IPType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
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

    public static final class Builder extends Request.Builder<DescribeOutgoingDomainDetailRequest, Builder> {
        private String aclCoverage; 
        private String currentPage; 
        private String domain; 
        private java.util.List<String> domainList; 
        private String endTime; 
        private String IPType; 
        private String lang; 
        private String natGatewayId; 
        private String order; 
        private String pageSize; 
        private String privateIP; 
        private String publicIP; 
        private String sort; 
        private String sourceIp; 
        private String startTime; 
        private String tagId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOutgoingDomainDetailRequest request) {
            super(request);
            this.aclCoverage = request.aclCoverage;
            this.currentPage = request.currentPage;
            this.domain = request.domain;
            this.domainList = request.domainList;
            this.endTime = request.endTime;
            this.IPType = request.IPType;
            this.lang = request.lang;
            this.natGatewayId = request.natGatewayId;
            this.order = request.order;
            this.pageSize = request.pageSize;
            this.privateIP = request.privateIP;
            this.publicIP = request.publicIP;
            this.sort = request.sort;
            this.sourceIp = request.sourceIp;
            this.startTime = request.startTime;
            this.tagId = request.tagId;
        } 

        /**
         * AclCoverage.
         */
        public Builder aclCoverage(String aclCoverage) {
            this.putQueryParameter("AclCoverage", aclCoverage);
            this.aclCoverage = aclCoverage;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * DomainList.
         */
        public Builder domainList(java.util.List<String> domainList) {
            this.putQueryParameter("DomainList", domainList);
            this.domainList = domainList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1733450528</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * IPType.
         */
        public Builder IPType(String IPType) {
            this.putQueryParameter("IPType", IPType);
            this.IPType = IPType;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * NatGatewayId.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PrivateIP.
         */
        public Builder privateIP(String privateIP) {
            this.putQueryParameter("PrivateIP", privateIP);
            this.privateIP = privateIP;
            return this;
        }

        /**
         * PublicIP.
         */
        public Builder publicIP(String publicIP) {
            this.putQueryParameter("PublicIP", publicIP);
            this.publicIP = publicIP;
            return this;
        }

        /**
         * Sort.
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1753617600</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TagId.
         */
        public Builder tagId(String tagId) {
            this.putQueryParameter("TagId", tagId);
            this.tagId = tagId;
            return this;
        }

        @Override
        public DescribeOutgoingDomainDetailRequest build() {
            return new DescribeOutgoingDomainDetailRequest(this);
        } 

    } 

}
