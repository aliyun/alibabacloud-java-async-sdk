// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDomainListRequest} extends {@link RequestModel}
 *
 * <p>QueryDomainListRequest</p>
 */
public class QueryDomainListRequest extends Request {
    @Query
    @NameInMap("DomainGroupId")
    private String domainGroupId;

    @Query
    @NameInMap("DomainName")
    private String domainName;

    @Query
    @NameInMap("EndExpirationDate")
    private Long endExpirationDate;

    @Query
    @NameInMap("EndRegistrationDate")
    private Long endRegistrationDate;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("OrderByType")
    private String orderByType;

    @Query
    @NameInMap("OrderKeyType")
    private String orderKeyType;

    @Query
    @NameInMap("PageNum")
    @Validation(required = true)
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("ProductDomainType")
    private String productDomainType;

    @Query
    @NameInMap("QueryType")
    private String queryType;

    @Query
    @NameInMap("StartExpirationDate")
    private Long startExpirationDate;

    @Query
    @NameInMap("StartRegistrationDate")
    private Long startRegistrationDate;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private QueryDomainListRequest(Builder builder) {
        super(builder);
        this.domainGroupId = builder.domainGroupId;
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
     * @return domainGroupId
     */
    public String getDomainGroupId() {
        return this.domainGroupId;
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
        private String domainGroupId; 
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

        private Builder(QueryDomainListRequest response) {
            super(response);
            this.domainGroupId = response.domainGroupId;
            this.domainName = response.domainName;
            this.endExpirationDate = response.endExpirationDate;
            this.endRegistrationDate = response.endRegistrationDate;
            this.lang = response.lang;
            this.orderByType = response.orderByType;
            this.orderKeyType = response.orderKeyType;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
            this.productDomainType = response.productDomainType;
            this.queryType = response.queryType;
            this.startExpirationDate = response.startExpirationDate;
            this.startRegistrationDate = response.startRegistrationDate;
            this.userClientIp = response.userClientIp;
        } 

        /**
         * DomainGroupId.
         */
        public Builder domainGroupId(String domainGroupId) {
            this.putQueryParameter("DomainGroupId", domainGroupId);
            this.domainGroupId = domainGroupId;
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
