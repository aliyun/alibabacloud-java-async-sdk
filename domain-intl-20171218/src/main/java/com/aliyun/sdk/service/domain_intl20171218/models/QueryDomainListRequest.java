// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDomainListRequest} extends {@link RequestModel}
 *
 * <p>QueryDomainListRequest</p>
 */
public class QueryDomainListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ccompany")
    private String ccompany;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndExpirationDate")
    private Long endExpirationDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndRegistrationDate")
    private Long endRegistrationDate;

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
    @com.aliyun.core.annotation.NameInMap("StartExpirationDate")
    private Long startExpirationDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartRegistrationDate")
    private Long startRegistrationDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private QueryDomainListRequest(Builder builder) {
        super(builder);
        this.ccompany = builder.ccompany;
        this.domainName = builder.domainName;
        this.endExpirationDate = builder.endExpirationDate;
        this.endRegistrationDate = builder.endRegistrationDate;
        this.lang = builder.lang;
        this.orderByType = builder.orderByType;
        this.orderKeyType = builder.orderKeyType;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.productDomainType = builder.productDomainType;
        this.queryType = builder.queryType;
        this.startExpirationDate = builder.startExpirationDate;
        this.startRegistrationDate = builder.startRegistrationDate;
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
     * @return ccompany
     */
    public String getCcompany() {
        return this.ccompany;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endExpirationDate
     */
    public Long getEndExpirationDate() {
        return this.endExpirationDate;
    }

    /**
     * @return endRegistrationDate
     */
    public Long getEndRegistrationDate() {
        return this.endRegistrationDate;
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
     * @return startExpirationDate
     */
    public Long getStartExpirationDate() {
        return this.startExpirationDate;
    }

    /**
     * @return startRegistrationDate
     */
    public Long getStartRegistrationDate() {
        return this.startRegistrationDate;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<QueryDomainListRequest, Builder> {
        private String ccompany; 
        private String domainName; 
        private Long endExpirationDate; 
        private Long endRegistrationDate; 
        private String lang; 
        private String orderByType; 
        private String orderKeyType; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String productDomainType; 
        private String queryType; 
        private Long startExpirationDate; 
        private Long startRegistrationDate; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(QueryDomainListRequest request) {
            super(request);
            this.ccompany = request.ccompany;
            this.domainName = request.domainName;
            this.endExpirationDate = request.endExpirationDate;
            this.endRegistrationDate = request.endRegistrationDate;
            this.lang = request.lang;
            this.orderByType = request.orderByType;
            this.orderKeyType = request.orderKeyType;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.productDomainType = request.productDomainType;
            this.queryType = request.queryType;
            this.startExpirationDate = request.startExpirationDate;
            this.startRegistrationDate = request.startRegistrationDate;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * Ccompany.
         */
        public Builder ccompany(String ccompany) {
            this.putQueryParameter("Ccompany", ccompany);
            this.ccompany = ccompany;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * EndExpirationDate.
         */
        public Builder endExpirationDate(Long endExpirationDate) {
            this.putQueryParameter("EndExpirationDate", endExpirationDate);
            this.endExpirationDate = endExpirationDate;
            return this;
        }

        /**
         * EndRegistrationDate.
         */
        public Builder endRegistrationDate(Long endRegistrationDate) {
            this.putQueryParameter("EndRegistrationDate", endRegistrationDate);
            this.endRegistrationDate = endRegistrationDate;
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
         * OrderByType.
         */
        public Builder orderByType(String orderByType) {
            this.putQueryParameter("OrderByType", orderByType);
            this.orderByType = orderByType;
            return this;
        }

        /**
         * OrderKeyType.
         */
        public Builder orderKeyType(String orderKeyType) {
            this.putQueryParameter("OrderKeyType", orderKeyType);
            this.orderKeyType = orderKeyType;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProductDomainType.
         */
        public Builder productDomainType(String productDomainType) {
            this.putQueryParameter("ProductDomainType", productDomainType);
            this.productDomainType = productDomainType;
            return this;
        }

        /**
         * QueryType.
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * StartExpirationDate.
         */
        public Builder startExpirationDate(Long startExpirationDate) {
            this.putQueryParameter("StartExpirationDate", startExpirationDate);
            this.startExpirationDate = startExpirationDate;
            return this;
        }

        /**
         * StartRegistrationDate.
         */
        public Builder startRegistrationDate(Long startRegistrationDate) {
            this.putQueryParameter("StartRegistrationDate", startRegistrationDate);
            this.startRegistrationDate = startRegistrationDate;
            return this;
        }

        /**
         * UserClientIp.
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
