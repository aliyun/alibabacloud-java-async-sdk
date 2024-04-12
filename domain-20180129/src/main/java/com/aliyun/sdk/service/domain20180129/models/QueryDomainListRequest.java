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
    @NameInMap("Ccompany")
    private String ccompany;

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
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("StartExpirationDate")
    private Long startExpirationDate;

    @Query
    @NameInMap("StartRegistrationDate")
    private Long startRegistrationDate;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private QueryDomainListRequest(Builder builder) {
        super(builder);
        this.ccompany = builder.ccompany;
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
        this.resourceGroupId = builder.resourceGroupId;
        this.startExpirationDate = builder.startExpirationDate;
        this.startRegistrationDate = builder.startRegistrationDate;
        this.tag = builder.tag;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<QueryDomainListRequest, Builder> {
        private String ccompany; 
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
        private String resourceGroupId; 
        private Long startExpirationDate; 
        private Long startRegistrationDate; 
        private java.util.List < Tag> tag; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(QueryDomainListRequest request) {
            super(request);
            this.ccompany = request.ccompany;
            this.domainGroupId = request.domainGroupId;
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
            this.resourceGroupId = request.resourceGroupId;
            this.startExpirationDate = request.startExpirationDate;
            this.startRegistrationDate = request.startRegistrationDate;
            this.tag = request.tag;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * The name of the domain name registrant.
         */
        public Builder ccompany(String ccompany) {
            this.putQueryParameter("Ccompany", ccompany);
            this.ccompany = ccompany;
            return this;
        }

        /**
         * The ID of the domain name group.
         */
        public Builder domainGroupId(String domainGroupId) {
            this.putQueryParameter("DomainGroupId", domainGroupId);
            this.domainGroupId = domainGroupId;
            return this;
        }

        /**
         * The domain name that you want to search for.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The end of the time range to query domain names based on expiration dates. Set the value to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. Only queries by day are supported.
         */
        public Builder endExpirationDate(Long endExpirationDate) {
            this.putQueryParameter("EndExpirationDate", endExpirationDate);
            this.endExpirationDate = endExpirationDate;
            return this;
        }

        /**
         * The end of the time range to query domain names based on registration dates. Set the value to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. Only queries by day are supported.
         */
        public Builder endRegistrationDate(Long endRegistrationDate) {
            this.putQueryParameter("EndRegistrationDate", endRegistrationDate);
            this.endRegistrationDate = endRegistrationDate;
            return this;
        }

        /**
         * The language of the error message to return if the request fails. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         * 
         * Default value: **en**.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The order of the information based on which the domain names are sorted, such as the registration date and expiration date. Valid values:
         * <p>
         * 
         * *   **ASC**: ascending order
         * *   **DESC**: descending order
         * 
         * >  If this parameter is not specified, the default value **DESC** is used.
         */
        public Builder orderByType(String orderByType) {
            this.putQueryParameter("OrderByType", orderByType);
            this.orderByType = orderByType;
            return this;
        }

        /**
         * The field that you use to sort the domain names. Valid values:
         * <p>
         * 
         * *   **RegistrationDate**: registration date
         * *   **ExpirationDate**: expiration date
         * 
         * >  If this parameter is not specified, the domain names are sorted by the time when they were added to the database.
         */
        public Builder orderKeyType(String orderKeyType) {
            this.putQueryParameter("OrderKeyType", orderKeyType);
            this.orderKeyType = orderKeyType;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The type of the domain name. Valid values:
         * <p>
         * 
         * *   **New gTLD**: new generic top-level domain names
         * *   **gTLD**: generic top-level domain names
         * *   **ccTLD**: country code top-level domain names
         */
        public Builder productDomainType(String productDomainType) {
            this.putQueryParameter("ProductDomainType", productDomainType);
            this.productDomainType = productDomainType;
            return this;
        }

        /**
         * The category of the domain names that you want to query. Valid values:
         * <p>
         * 
         * *   **1**: the domain names that need to be renewed
         * *   **2**: the domain names that need to be redeemed
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The beginning of the time range to query domain names based on expiration dates. Set the value to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. Only queries by day are supported.
         */
        public Builder startExpirationDate(Long startExpirationDate) {
            this.putQueryParameter("StartExpirationDate", startExpirationDate);
            this.startExpirationDate = startExpirationDate;
            return this;
        }

        /**
         * The beginning of the time range to query domain names based on registration dates. Set the value to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. Only queries by day are supported.
         */
        public Builder startRegistrationDate(Long startRegistrationDate) {
            this.putQueryParameter("StartRegistrationDate", startRegistrationDate);
            this.startRegistrationDate = startRegistrationDate;
            return this;
        }

        /**
         * The tags to add to the resource.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The IP address of the client. Set the value to **127.0.0.1**.
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

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of the tag to add to the resource.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag to add to the resource.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
