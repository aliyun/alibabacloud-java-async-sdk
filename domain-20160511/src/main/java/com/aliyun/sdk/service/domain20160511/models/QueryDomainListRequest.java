// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20160511.models;

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
 * {@link QueryDomainListRequest} extends {@link RequestModel}
 *
 * <p>QueryDomainListRequest</p>
 */
public class QueryDomainListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeadEndDate")
    private Long deadEndDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeadStartDate")
    private Long deadStartDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainType")
    private String domainType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderByType")
    private String orderByType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderKeyType")
    private String orderKeyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductDomainType")
    private String productDomainType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryType")
    private String queryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegEndDate")
    private Long regEndDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegStartDate")
    private Long regStartDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private QueryDomainListRequest(Builder builder) {
        super(builder);
        this.deadEndDate = builder.deadEndDate;
        this.deadStartDate = builder.deadStartDate;
        this.domainName = builder.domainName;
        this.domainType = builder.domainType;
        this.endDate = builder.endDate;
        this.groupId = builder.groupId;
        this.lang = builder.lang;
        this.orderByType = builder.orderByType;
        this.orderKeyType = builder.orderKeyType;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.productDomainType = builder.productDomainType;
        this.queryType = builder.queryType;
        this.regEndDate = builder.regEndDate;
        this.regStartDate = builder.regStartDate;
        this.startDate = builder.startDate;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDomainListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deadEndDate
     */
    public Long getDeadEndDate() {
        return this.deadEndDate;
    }

    /**
     * @return deadStartDate
     */
    public Long getDeadStartDate() {
        return this.deadStartDate;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return domainType
     */
    public String getDomainType() {
        return this.domainType;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return orderByType
     */
    public String getOrderByType() {
        return this.orderByType;
    }

    /**
     * @return orderKeyType
     */
    public String getOrderKeyType() {
        return this.orderKeyType;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productDomainType
     */
    public String getProductDomainType() {
        return this.productDomainType;
    }

    /**
     * @return queryType
     */
    public String getQueryType() {
        return this.queryType;
    }

    /**
     * @return regEndDate
     */
    public Long getRegEndDate() {
        return this.regEndDate;
    }

    /**
     * @return regStartDate
     */
    public Long getRegStartDate() {
        return this.regStartDate;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<QueryDomainListRequest, Builder> {
        private Long deadEndDate; 
        private Long deadStartDate; 
        private String domainName; 
        private String domainType; 
        private String endDate; 
        private String groupId; 
        private String lang; 
        private String orderByType; 
        private String orderKeyType; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String productDomainType; 
        private String queryType; 
        private Long regEndDate; 
        private Long regStartDate; 
        private String startDate; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(QueryDomainListRequest request) {
            super(request);
            this.deadEndDate = request.deadEndDate;
            this.deadStartDate = request.deadStartDate;
            this.domainName = request.domainName;
            this.domainType = request.domainType;
            this.endDate = request.endDate;
            this.groupId = request.groupId;
            this.lang = request.lang;
            this.orderByType = request.orderByType;
            this.orderKeyType = request.orderKeyType;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.productDomainType = request.productDomainType;
            this.queryType = request.queryType;
            this.regEndDate = request.regEndDate;
            this.regStartDate = request.regStartDate;
            this.startDate = request.startDate;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * <p>The end of the time range to query based on the time when domain names expire.</p>
         * 
         * <strong>example:</strong>
         * <p>1696435200000</p>
         */
        public Builder deadEndDate(Long deadEndDate) {
            this.putQueryParameter("DeadEndDate", deadEndDate);
            this.deadEndDate = deadEndDate;
            return this;
        }

        /**
         * <p>The beginning of the time range to query based on the time when domain names expire.</p>
         * 
         * <strong>example:</strong>
         * <p>1694016000000</p>
         */
        public Builder deadStartDate(Long deadStartDate) {
            this.putQueryParameter("DeadStartDate", deadStartDate);
            this.deadStartDate = deadStartDate;
            return this;
        }

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>test003.cn</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The type of the domain name. Valid values:</p>
         * <p>GUOJI, TONGYONG, GUONEI, NAME, and WEIBO.</p>
         * 
         * <strong>example:</strong>
         * <p>GUONEI</p>
         */
        public Builder domainType(String domainType) {
            this.putQueryParameter("DomainType", domainType);
            this.domainType = domainType;
            return this;
        }

        /**
         * <p>The end of the time range to query based on the time when domain names expire.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-11 00:00:00</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The language of the error message to return if the request fails. Valid values:</p>
         * <p>zh: Chinese. en: English.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The order in which you want to sort the queried domain names. Valid values:</p>
         * <p>ASC: ascending order. DESC: descending order.</p>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        public Builder orderByType(String orderByType) {
            this.putQueryParameter("OrderByType", orderByType);
            this.orderByType = orderByType;
            return this;
        }

        /**
         * <p>The field by which domain names to be queried are sorted. Valid values:</p>
         * <p>REGDATE: registration time. DEADDATE: expiration time. CREATEDATE: creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>REGDATE</p>
         */
        public Builder orderKeyType(String orderKeyType) {
            this.putQueryParameter("OrderKeyType", orderKeyType);
            this.orderKeyType = orderKeyType;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The product type of the domain name. Valid values:</p>
         * <p>New gTLD, gTLD, ccTLD, and other.</p>
         * 
         * <strong>example:</strong>
         * <p>ccTLD</p>
         */
        public Builder productDomainType(String productDomainType) {
            this.putQueryParameter("ProductDomainType", productDomainType);
            this.productDomainType = productDomainType;
            return this;
        }

        /**
         * <p>The type of the query. Valid values:</p>
         * <p>1: renewal. 2: redemption. 4: transfer.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * <p>The end of the time range to query based on the time when domain names were registered.</p>
         * 
         * <strong>example:</strong>
         * <p>1696435200000</p>
         */
        public Builder regEndDate(Long regEndDate) {
            this.putQueryParameter("RegEndDate", regEndDate);
            this.regEndDate = regEndDate;
            return this;
        }

        /**
         * <p>The beginning of the time range to query based on the time when domain names were registered.</p>
         * 
         * <strong>example:</strong>
         * <p>1694016000000</p>
         */
        public Builder regStartDate(Long regStartDate) {
            this.putQueryParameter("RegStartDate", regStartDate);
            this.regStartDate = regStartDate;
            return this;
        }

        /**
         * <p>The beginning of the time range to query based on the time when domain names expire.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-01 00:00:00</p>
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>The IP address of the client. Set the value to 127.0.0.1.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public QueryDomainListRequest build() {
            return new QueryDomainListRequest(this);
        } 

    } 

}
